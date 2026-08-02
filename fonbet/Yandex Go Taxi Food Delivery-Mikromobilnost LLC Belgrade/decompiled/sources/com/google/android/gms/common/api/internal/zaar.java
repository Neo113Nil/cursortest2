package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.zac;
import defpackage.wx81;
import defpackage.yx81;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
final class zaar extends zac {
    private final WeakReference zaa;

    public zaar(yx81 yx81Var) {
        this.zaa = new WeakReference(yx81Var);
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zad, com.google.android.gms.signin.internal.zae
    public final void zab(com.google.android.gms.signin.internal.zak zakVar) {
        yx81 yx81Var = (yx81) this.zaa.get();
        if (yx81Var == null) {
            return;
        }
        e eVar = yx81Var.a;
        wx81 wx81Var = new wx81(yx81Var, yx81Var, zakVar);
        zabh zabhVar = eVar.x;
        zabhVar.sendMessage(zabhVar.obtainMessage(1, wx81Var));
    }
}
