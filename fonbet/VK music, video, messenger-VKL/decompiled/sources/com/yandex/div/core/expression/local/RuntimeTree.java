package com.yandex.div.core.expression.local;

import com.yandex.div.core.expression.ExpressionsRuntime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import xsna.brm0;
import xsna.izs;
import xsna.pn00;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: RuntimeTree.kt */
/* loaded from: classes7.dex */
public final class RuntimeTree {
    private final Map<ExpressionsRuntime, RuntimeNode> runtimesToNodes = new LinkedHashMap();
    private final Map<String, RuntimeNode> pathToNodes = new LinkedHashMap();

    private final void invokeRecursively(RuntimeNode runtimeNode, izs<? super RuntimeNode, s3q0> izsVar) {
        izsVar.invoke(runtimeNode);
        Iterator<T> it = runtimeNode.getChildren().iterator();
        while (it.hasNext()) {
            invokeRecursively((RuntimeNode) it.next(), izsVar);
        }
    }

    public final Map<String, ExpressionsRuntime> getPathToRuntimes() {
        Map<String, RuntimeNode> map = this.pathToNodes;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, RuntimeNode> entry : map.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), entry.getValue().getRuntime()));
        }
        return pn00.s(arrayList);
    }

    public final void storeRuntime(ExpressionsRuntime expressionsRuntime, ExpressionsRuntime expressionsRuntime2, String str) {
        RuntimeNode runtimeNode;
        List<RuntimeNode> children;
        RuntimeNode runtimeNode2 = new RuntimeNode(expressionsRuntime, str, null, 4, null);
        this.pathToNodes.put(str, runtimeNode2);
        this.runtimesToNodes.put(expressionsRuntime, runtimeNode2);
        if (expressionsRuntime2 == null || (runtimeNode = this.runtimesToNodes.get(expressionsRuntime2)) == null || (children = runtimeNode.getChildren()) == null) {
            return;
        }
        children.add(runtimeNode2);
    }

    /* compiled from: RuntimeTree.kt */
    public static final class RuntimeNode {
        private final List<RuntimeNode> children;
        private final String path;
        private final ExpressionsRuntime runtime;

        public RuntimeNode(ExpressionsRuntime expressionsRuntime, String str, List<RuntimeNode> list) {
            this.runtime = expressionsRuntime;
            this.path = str;
            this.children = list;
        }

        public final List<RuntimeNode> getChildren() {
            return this.children;
        }

        public final String getPath() {
            return this.path;
        }

        public final ExpressionsRuntime getRuntime() {
            return this.runtime;
        }

        public /* synthetic */ RuntimeNode(ExpressionsRuntime expressionsRuntime, String str, List list, int i, zcl zclVar) {
            this(expressionsRuntime, str, (i & 4) != 0 ? new ArrayList() : list);
        }
    }

    public final void invokeRecursively(ExpressionsRuntime expressionsRuntime, String str, izs<? super RuntimeNode, s3q0> izsVar) {
        RuntimeNode runtimeNode = this.runtimesToNodes.get(expressionsRuntime);
        if (runtimeNode == null) {
            return;
        }
        if (brm0.B(runtimeNode.getPath(), str, false)) {
            invokeRecursively(runtimeNode, izsVar);
            return;
        }
        for (RuntimeNode runtimeNode2 : runtimeNode.getChildren()) {
            if (brm0.B(runtimeNode2.getPath(), str, false)) {
                invokeRecursively(runtimeNode2, izsVar);
            }
        }
    }
}
