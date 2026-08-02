package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import defpackage.atx0;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.f191;
import defpackage.g191;
import defpackage.lwt;
import defpackage.my81;
import defpackage.ngz;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.qx81;
import defpackage.rn2;
import defpackage.rst;
import defpackage.s091;
import defpackage.sz81;
import defpackage.uh3;
import defpackage.uyj0;
import defpackage.wdz;
import defpackage.x8u0;
import defpackage.yiu0;
import defpackage.zm2;
import org.json.JSONException;

/* loaded from: classes11.dex */
public final class zbt extends zbo {
    private final Context zba;

    public zbt(Context context) {
        this.zba = context;
    }

    private final void zbd() {
        if (bb1.x(Binder.getCallingUid(), this.zba)) {
            return;
        }
        ny61.z(oyr.j(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zbo, com.google.android.gms.auth.api.signin.internal.zbp
    public final void zbb() {
        zbd();
        g191.f0(this.zba).g0();
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zbo, com.google.android.gms.auth.api.signin.internal.zbp
    public final void zbc() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        String c;
        zbd();
        yiu0 a = yiu0.a(this.zba);
        GoogleSignInAccount b = a.b();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.DEFAULT_SIGN_IN;
        if (b != null) {
            String c2 = a.c("defaultGoogleSignInAccount");
            if (!TextUtils.isEmpty(c2) && (c = a.c(yiu0.f("googleSignInOptions", c2))) != null) {
                try {
                    googleSignInOptions = GoogleSignInOptions.zab(c);
                } catch (JSONException unused) {
                }
            }
            googleSignInOptions = null;
        }
        GoogleSignInOptions googleSignInOptions2 = googleSignInOptions;
        Context context = this.zba;
        cvw.l(googleSignInOptions2);
        zm2 zm2Var = uh3.a;
        rst rstVar = new rst();
        rstVar.a = new rn2();
        lwt lwtVar = new lwt(context, null, zm2Var, googleSignInOptions2, rstVar.a());
        Context context2 = lwtVar.a;
        my81 my81Var = lwtVar.h;
        if (b == null) {
            boolean z = lwtVar.e() == 3;
            ngz ngzVar = f191.a;
            Object[] objArr = new Object[0];
            if (ngzVar.b <= 3) {
                ngzVar.a("Signing out", objArr);
            }
            f191.b(context2);
            if (z) {
                uyj0 uyj0Var = Status.RESULT_SUCCESS;
                cvw.m(uyj0Var, "Result must not be null");
                BasePendingResult x8u0Var = new x8u0(my81Var);
                x8u0Var.a(uyj0Var);
                basePendingResult = x8u0Var;
            } else {
                a aVar = new a(my81Var);
                my81Var.e(aVar);
                basePendingResult = aVar;
            }
            basePendingResult.d(new qx81(basePendingResult, new atx0(), new wdz()));
            return;
        }
        boolean z2 = lwtVar.e() == 3;
        ngz ngzVar2 = f191.a;
        Object[] objArr2 = new Object[0];
        if (ngzVar2.b <= 3) {
            ngzVar2.a("Revoking access", objArr2);
        }
        String c3 = yiu0.a(context2).c("refreshToken");
        f191.b(context2);
        if (!z2) {
            b bVar = new b(my81Var);
            my81Var.e(bVar);
            basePendingResult2 = bVar;
        } else if (c3 == null) {
            ngz ngzVar3 = s091.c;
            Status status = new Status(4);
            cvw.d("Status code must not be SUCCESS", true ^ status.getStatus().isSuccess());
            BasePendingResult sz81Var = new sz81(status);
            sz81Var.a(status);
            basePendingResult2 = sz81Var;
        } else {
            s091 s091Var = new s091(c3);
            new Thread(s091Var).start();
            basePendingResult2 = s091Var.b;
        }
        basePendingResult2.d(new qx81(basePendingResult2, new atx0(), new wdz()));
    }
}
