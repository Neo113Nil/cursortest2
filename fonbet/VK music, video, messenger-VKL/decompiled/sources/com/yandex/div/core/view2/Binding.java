package com.yandex.div.core.view2;

import com.yandex.div.DivDataTag;
import com.yandex.div2.j3;

/* compiled from: ViewBindingProvider.kt */
/* loaded from: classes7.dex */
public final class Binding {
    private final j3 data;
    private final DivDataTag tag;

    public Binding(DivDataTag divDataTag, j3 j3Var) {
        this.tag = divDataTag;
        this.data = j3Var;
    }

    public final j3 getData() {
        return this.data;
    }

    public final DivDataTag getTag() {
        return this.tag;
    }
}
