package com.yandex.div.core.util;

import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.a;
import java.util.Iterator;
import java.util.List;
import xsna.izs;
import xsna.s3q0;
import xsna.sk3;
import xsna.uki0;
import xsna.we;
import xsna.zcl;

/* compiled from: DivTreeWalk.kt */
/* loaded from: classes7.dex */
public final class DivTreeWalk implements uki0<DivItemBuilderResult> {
    private final int maxDepth;
    private final izs<a, Boolean> onEnter;
    private final izs<a, s3q0> onLeave;
    private final ExpressionResolver resolver;
    private final a root;

    /* compiled from: DivTreeWalk.kt */
    public static final class BranchNode implements Node {
        private int childIndex;
        private List<DivItemBuilderResult> children;
        private final DivItemBuilderResult item;
        private final izs<a, Boolean> onEnter;
        private final izs<a, s3q0> onLeave;
        private boolean rootVisited;

        /* JADX WARN: Multi-variable type inference failed */
        public BranchNode(DivItemBuilderResult divItemBuilderResult, izs<? super a, Boolean> izsVar, izs<? super a, s3q0> izsVar2) {
            this.item = divItemBuilderResult;
            this.onEnter = izsVar;
            this.onLeave = izsVar2;
        }

        @Override // com.yandex.div.core.util.DivTreeWalk.Node
        public DivItemBuilderResult getItem() {
            return this.item;
        }

        @Override // com.yandex.div.core.util.DivTreeWalk.Node
        public DivItemBuilderResult step() {
            if (!this.rootVisited) {
                izs<a, Boolean> izsVar = this.onEnter;
                if (izsVar != null && !izsVar.invoke(getItem().getDiv()).booleanValue()) {
                    return null;
                }
                this.rootVisited = true;
                return getItem();
            }
            List<DivItemBuilderResult> list = this.children;
            if (list == null) {
                list = DivTreeWalkKt.getItems(getItem().getDiv(), getItem().getExpressionResolver());
                this.children = list;
            }
            if (this.childIndex < list.size()) {
                int i = this.childIndex;
                this.childIndex = i + 1;
                return list.get(i);
            }
            izs<a, s3q0> izsVar2 = this.onLeave;
            if (izsVar2 != null) {
                izsVar2.invoke(getItem().getDiv());
            }
            return null;
        }
    }

    /* compiled from: DivTreeWalk.kt */
    public final class DivTreeWalkIterator extends we<DivItemBuilderResult> {
        private final ExpressionResolver resolver;
        private final a root;
        private final sk3<Node> stack;

        public DivTreeWalkIterator(a aVar, ExpressionResolver expressionResolver) {
            this.root = aVar;
            this.resolver = expressionResolver;
            sk3<Node> sk3Var = new sk3<>();
            sk3Var.addLast(node(DivCollectionExtensionsKt.toItemBuilderResult(aVar, expressionResolver)));
            this.stack = sk3Var;
        }

        private final DivItemBuilderResult nextItem() {
            Node g = this.stack.g();
            if (g == null) {
                return null;
            }
            DivItemBuilderResult step = g.step();
            if (step == null) {
                this.stack.removeLast();
                return nextItem();
            }
            if (step == g.getItem() || DivUtilKt.isLeaf(step.getDiv()) || this.stack.size() >= DivTreeWalk.this.maxDepth) {
                return step;
            }
            this.stack.addLast(node(step));
            return nextItem();
        }

        private final Node node(DivItemBuilderResult divItemBuilderResult) {
            return DivUtilKt.isBranch(divItemBuilderResult.getDiv()) ? new BranchNode(divItemBuilderResult, DivTreeWalk.this.onEnter, DivTreeWalk.this.onLeave) : new LeafNode(divItemBuilderResult);
        }

        @Override // xsna.we
        public void computeNext() {
            DivItemBuilderResult nextItem = nextItem();
            if (nextItem != null) {
                setNext(nextItem);
            } else {
                done();
            }
        }
    }

    /* compiled from: DivTreeWalk.kt */
    public static final class LeafNode implements Node {
        private final DivItemBuilderResult item;
        private boolean visited;

        public LeafNode(DivItemBuilderResult divItemBuilderResult) {
            this.item = divItemBuilderResult;
        }

        @Override // com.yandex.div.core.util.DivTreeWalk.Node
        public DivItemBuilderResult getItem() {
            return this.item;
        }

        @Override // com.yandex.div.core.util.DivTreeWalk.Node
        public DivItemBuilderResult step() {
            if (this.visited) {
                return null;
            }
            this.visited = true;
            return getItem();
        }
    }

    /* compiled from: DivTreeWalk.kt */
    public interface Node {
        DivItemBuilderResult getItem();

        DivItemBuilderResult step();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DivTreeWalk(a aVar, ExpressionResolver expressionResolver, izs<? super a, Boolean> izsVar, izs<? super a, s3q0> izsVar2, int i) {
        this.root = aVar;
        this.resolver = expressionResolver;
        this.onEnter = izsVar;
        this.onLeave = izsVar2;
        this.maxDepth = i;
    }

    @Override // xsna.uki0
    public Iterator<DivItemBuilderResult> iterator() {
        return new DivTreeWalkIterator(this.root, this.resolver);
    }

    public final DivTreeWalk onEnter(izs<? super a, Boolean> izsVar) {
        return new DivTreeWalk(this.root, this.resolver, izsVar, this.onLeave, this.maxDepth);
    }

    public final DivTreeWalk onLeave(izs<? super a, s3q0> izsVar) {
        return new DivTreeWalk(this.root, this.resolver, this.onEnter, izsVar, this.maxDepth);
    }

    public /* synthetic */ DivTreeWalk(a aVar, ExpressionResolver expressionResolver, izs izsVar, izs izsVar2, int i, int i2, zcl zclVar) {
        this(aVar, expressionResolver, izsVar, izsVar2, (i2 & 16) != 0 ? Integer.MAX_VALUE : i);
    }

    public DivTreeWalk(a aVar, ExpressionResolver expressionResolver) {
        this(aVar, expressionResolver, null, null, 0, 16, null);
    }
}
