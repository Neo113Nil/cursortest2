package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import defpackage.atx0;
import defpackage.cub1;
import defpackage.x891;
import java.util.List;

/* loaded from: classes11.dex */
public final class b extends cub1 {
    public final /* synthetic */ List b;
    public final /* synthetic */ atx0 c;
    public final /* synthetic */ x891 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(x891 x891Var, atx0 atx0Var, List list, atx0 atx0Var2) {
        super(atx0Var);
        this.w = x891Var;
        this.b = list;
        this.c = atx0Var2;
    }

    @Override // defpackage.cub1
    public final void a() {
        atx0 atx0Var = this.c;
        List list = this.b;
        x891 x891Var = this.w;
        try {
            x891Var.b.m.zzd(x891Var.a, x891.b(list), x891.c(), new zzau(x891Var, atx0Var));
        } catch (RemoteException e) {
            x891.c.c(e, "deferredInstall(%s)", list);
            atx0Var.b(new RuntimeException(e));
        }
    }
}
