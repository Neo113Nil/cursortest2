package com.yandex.go.morphlex.data.descriptors.actions.change_status_bar;

import defpackage.dw;
import defpackage.kr;
import defpackage.n6u;
import defpackage.n830;

/* loaded from: classes12.dex */
public final class c implements dw {
    public final n830 a;

    public c(n830 n830Var) {
        this.a = n830Var;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        this.a.a.l(((ChangeStatusBarThemeAction) krVar).a);
    }
}
