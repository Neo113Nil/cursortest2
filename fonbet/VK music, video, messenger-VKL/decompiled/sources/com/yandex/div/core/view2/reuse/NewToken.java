package com.yandex.div.core.view2.reuse;

import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.a;
import com.yandex.div2.ma;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.e43;

/* compiled from: NewToken.kt */
/* loaded from: classes7.dex */
public final class NewToken extends Token {
    private ExistingToken lastExistingParent;

    public NewToken(DivItemBuilderResult divItemBuilderResult, int i, ExistingToken existingToken) {
        super(divItemBuilderResult, i);
        this.lastExistingParent = existingToken;
    }

    private final List<NewToken> itemsToNewTokenList(List<DivItemBuilderResult> list) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            arrayList.add(new NewToken((DivItemBuilderResult) obj, i, this.lastExistingParent));
            i = i2;
        }
        return arrayList;
    }

    public final List<NewToken> getChildrenTokens() {
        a aVar;
        ExpressionResolver expressionResolver = getItem().getExpressionResolver();
        a div = getItem().getDiv();
        if (div instanceof a.p) {
            return EmptyList.b;
        }
        if (div instanceof a.f) {
            return EmptyList.b;
        }
        if (div instanceof a.d) {
            return EmptyList.b;
        }
        if (div instanceof a.k) {
            return EmptyList.b;
        }
        if (div instanceof a.g) {
            return EmptyList.b;
        }
        if (div instanceof a.l) {
            return EmptyList.b;
        }
        if (div instanceof a.h) {
            return EmptyList.b;
        }
        if (div instanceof a.j) {
            return EmptyList.b;
        }
        if (div instanceof a.q) {
            return EmptyList.b;
        }
        if (div instanceof a.n) {
            return EmptyList.b;
        }
        if (div instanceof a.C2110a) {
            return itemsToNewTokenList(DivCollectionExtensionsKt.buildItems(((a.C2110a) div).c, expressionResolver));
        }
        if (div instanceof a.b) {
            return itemsToNewTokenList(DivCollectionExtensionsKt.toDivItemBuilderResult(DivCollectionExtensionsKt.getNonNullItems(((a.b) div).c), expressionResolver));
        }
        if (div instanceof a.e) {
            return itemsToNewTokenList(DivCollectionExtensionsKt.itemsToDivItemBuilderResult(((a.e) div).c, expressionResolver));
        }
        if (div instanceof a.c) {
            return itemsToNewTokenList(DivCollectionExtensionsKt.buildItems(((a.c) div).c, expressionResolver));
        }
        if (div instanceof a.i) {
            return itemsToNewTokenList(DivCollectionExtensionsKt.buildItems(((a.i) div).c, expressionResolver));
        }
        if (div instanceof a.o) {
            return itemsToNewTokenList(DivCollectionExtensionsKt.itemsToDivItemBuilderResult(((a.o) div).c, expressionResolver));
        }
        if (!(div instanceof a.m)) {
            throw new NoWhenBranchMatchedException();
        }
        ma.a defaultState = DivUtilKt.getDefaultState(((a.m) div).c, expressionResolver);
        return (defaultState == null || (aVar = defaultState.c) == null) ? EmptyList.b : itemsToNewTokenList(Collections.singletonList(DivCollectionExtensionsKt.toItemBuilderResult(aVar, expressionResolver)));
    }

    public final ExistingToken getLastExistingParent() {
        return this.lastExistingParent;
    }

    public final void setLastExistingParent(ExistingToken existingToken) {
        this.lastExistingParent = existingToken;
    }
}
