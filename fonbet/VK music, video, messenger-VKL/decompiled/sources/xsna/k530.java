package xsna;

import android.content.Context;

/* compiled from: ModerationRouter.kt */
/* loaded from: classes18.dex */
public interface k530 {
    static /* synthetic */ void b(k530 k530Var, Context context, boolean z, gzs gzsVar, wx0 wx0Var, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            wx0Var = null;
        }
        k530Var.d(context, z, gzsVar, wx0Var);
    }

    void a(Context context, boolean z);

    void c(Context context, c530 c530Var, boolean z, gzs<s3q0> gzsVar);

    void d(Context context, boolean z, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2);
}
