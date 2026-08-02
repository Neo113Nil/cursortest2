package com.google.android.play.core.integrity;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.play.integrity.internal.af;
import defpackage.atx0;
import defpackage.ji61;
import defpackage.r7w;
import defpackage.sa81;
import defpackage.ue81;

/* loaded from: classes11.dex */
public final class a extends ue81 {
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ Long c;
    public final /* synthetic */ atx0 w;
    public final /* synthetic */ r7w x;
    public final /* synthetic */ ji61 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ji61 ji61Var, atx0 atx0Var, byte[] bArr, Long l, atx0 atx0Var2, r7w r7wVar) {
        super(atx0Var);
        this.y = ji61Var;
        this.b = bArr;
        this.c = l;
        this.w = atx0Var2;
        this.x = r7wVar;
    }

    @Override // defpackage.ue81
    public final void a(Exception exc) {
        if (exc instanceof af) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // defpackage.ue81
    public final void b() {
        atx0 atx0Var = this.w;
        ji61 ji61Var = this.y;
        try {
            ji61Var.d.n.d(ji61.a(ji61Var, this.b, this.c), new ai(ji61Var, atx0Var));
        } catch (RemoteException e) {
            sa81 sa81Var = ji61Var.a;
            Object[] objArr = {this.x};
            sa81Var.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", sa81.b(sa81Var.a, "requestIntegrityToken(%s)", objArr), e);
            }
            atx0Var.b(new IntegrityServiceException(-100, e));
        }
    }
}
