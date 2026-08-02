package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.d;

/* loaded from: classes11.dex */
public final class dy81 implements xyj0 {
    public final /* synthetic */ x8u0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ yst c;
    public final /* synthetic */ d d;

    public dy81(d dVar, x8u0 x8u0Var, boolean z, yst ystVar) {
        this.d = dVar;
        this.a = x8u0Var;
        this.b = z;
        this.c = ystVar;
    }

    @Override // defpackage.xyj0
    public final void a(uyj0 uyj0Var) {
        ty81 ty81Var;
        Status status = (Status) uyj0Var;
        d dVar = this.d;
        yiu0 a = yiu0.a(dVar.y);
        String c = a.c("defaultGoogleSignInAccount");
        a.d("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(c)) {
            a.d(yiu0.f("googleSignInAccount", c));
            a.d(yiu0.f("googleSignInOptions", c));
        }
        if (status.isSuccess() && (ty81Var = dVar.w) != null && ty81Var.g()) {
            dVar.c();
            dVar.b();
        }
        this.a.a(status);
        if (this.b) {
            this.c.c();
        }
    }
}
