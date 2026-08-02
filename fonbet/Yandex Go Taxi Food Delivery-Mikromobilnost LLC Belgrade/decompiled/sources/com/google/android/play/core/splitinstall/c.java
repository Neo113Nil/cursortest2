package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import defpackage.atx0;
import defpackage.cub1;
import defpackage.x891;

/* loaded from: classes11.dex */
public final class c extends cub1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ atx0 c;
    public final /* synthetic */ x891 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(x891 x891Var, atx0 atx0Var, int i, atx0 atx0Var2) {
        super(atx0Var);
        this.w = x891Var;
        this.b = i;
        this.c = atx0Var2;
    }

    @Override // defpackage.cub1
    public final void a() {
        atx0 atx0Var = this.c;
        int i = this.b;
        x891 x891Var = this.w;
        try {
            x891Var.b.m.zzc(x891Var.a, i, x891.c(), new zzat(x891Var, atx0Var));
        } catch (RemoteException e) {
            x891.c.c(e, "cancelInstall(%d)", Integer.valueOf(i));
            atx0Var.b(new RuntimeException(e));
        }
    }
}
