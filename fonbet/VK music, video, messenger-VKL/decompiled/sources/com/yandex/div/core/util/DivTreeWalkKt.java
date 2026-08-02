package com.yandex.div.core.util;

import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.a;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* compiled from: DivTreeWalk.kt */
/* loaded from: classes7.dex */
public final class DivTreeWalkKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<DivItemBuilderResult> getItems(a aVar, ExpressionResolver expressionResolver) {
        if (aVar instanceof a.p) {
            return EmptyList.b;
        }
        if (aVar instanceof a.f) {
            return EmptyList.b;
        }
        if (aVar instanceof a.d) {
            return EmptyList.b;
        }
        if (aVar instanceof a.k) {
            return EmptyList.b;
        }
        if (aVar instanceof a.g) {
            return EmptyList.b;
        }
        if (aVar instanceof a.l) {
            return EmptyList.b;
        }
        if (aVar instanceof a.h) {
            return EmptyList.b;
        }
        if (aVar instanceof a.b) {
            return EmptyList.b;
        }
        if (aVar instanceof a.j) {
            return EmptyList.b;
        }
        if (aVar instanceof a.q) {
            return EmptyList.b;
        }
        if (aVar instanceof a.n) {
            return EmptyList.b;
        }
        if (aVar instanceof a.C2110a) {
            return DivCollectionExtensionsKt.buildItems(((a.C2110a) aVar).c, expressionResolver);
        }
        if (aVar instanceof a.e) {
            return DivCollectionExtensionsKt.itemsToDivItemBuilderResult(((a.e) aVar).c, expressionResolver);
        }
        if (aVar instanceof a.c) {
            return DivCollectionExtensionsKt.buildItems(((a.c) aVar).c, expressionResolver);
        }
        if (aVar instanceof a.i) {
            return DivCollectionExtensionsKt.buildItems(((a.i) aVar).c, expressionResolver);
        }
        if (aVar instanceof a.o) {
            return DivCollectionExtensionsKt.itemsToDivItemBuilderResult(((a.o) aVar).c, expressionResolver);
        }
        if (aVar instanceof a.m) {
            return DivCollectionExtensionsKt.statesToDivItemBuilderResult(((a.m) aVar).c, expressionResolver);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final DivTreeWalk walk(a aVar, ExpressionResolver expressionResolver) {
        return new DivTreeWalk(aVar, expressionResolver);
    }
}
