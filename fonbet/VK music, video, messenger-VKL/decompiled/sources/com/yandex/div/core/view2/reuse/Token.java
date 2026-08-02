package com.yandex.div.core.view2.reuse;

import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div2.a;
import xsna.epx;

/* compiled from: Token.kt */
/* loaded from: classes7.dex */
public abstract class Token {
    private final int childIndex;
    private final a div;
    private final int divHash;
    private final DivItemBuilderResult item;

    public Token(DivItemBuilderResult divItemBuilderResult, int i) {
        this.item = divItemBuilderResult;
        this.childIndex = i;
        this.divHash = divItemBuilderResult.getDiv().propertiesHash();
        this.div = divItemBuilderResult.getDiv();
    }

    public final int getChildIndex() {
        return this.childIndex;
    }

    public final a getDiv() {
        return this.div;
    }

    public final int getDivHash() {
        return this.divHash;
    }

    public final DivItemBuilderResult getItem() {
        return this.item;
    }

    public final boolean isCombinable(Token token) {
        return this.divHash == token.divHash && epx.f(DivUtilKt.getType(this.div), DivUtilKt.getType(token.div));
    }
}
