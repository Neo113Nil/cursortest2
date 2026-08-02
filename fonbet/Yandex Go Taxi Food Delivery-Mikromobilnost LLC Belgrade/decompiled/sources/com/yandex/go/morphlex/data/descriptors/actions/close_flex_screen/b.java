package com.yandex.go.morphlex.data.descriptors.actions.close_flex_screen;

import com.yandex.go.flex.common.api.actions.CloseFlexScreenAction;
import defpackage.a830;
import defpackage.dw;
import defpackage.hit;
import defpackage.kr;
import defpackage.n6u;
import defpackage.tje;

/* loaded from: classes12.dex */
public final class b implements dw {
    public final a830 a;
    public final hit b;

    public b(a830 a830Var, hit hitVar) {
        this.a = a830Var;
        this.b = hitVar;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        tje.N(this.b.a, null, null, new CloseFlexScreenActionHandler$handle$1(this, (CloseFlexScreenAction) krVar, null), 3);
    }
}
