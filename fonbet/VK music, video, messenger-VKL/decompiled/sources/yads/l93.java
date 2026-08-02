package yads;

import android.app.Activity;
import android.content.Context;
import xsna.qcy;

/* loaded from: classes10.dex */
public final class l93 implements l1 {
    public static final /* synthetic */ qcy[] d = {wb.a(l93.class, "contextReference", "getContextReference()Landroid/content/Context;", 0)};
    public final p42 a;
    public final w0 b;
    public final mn2 c;

    public l93(Activity activity, p42 p42Var, w0 w0Var) {
        this.a = p42Var;
        this.b = w0Var;
        this.c = nn2.a(activity);
    }

    @Override // yads.l1
    public final void a(Activity activity) {
        mn2 mn2Var = this.c;
        qcy qcyVar = d[0];
        Context context = (Context) mn2Var.a.get();
        if (context == null || !context.equals(activity)) {
            return;
        }
        this.a.a.h();
    }

    @Override // yads.l1
    public final void b(Activity activity) {
        mn2 mn2Var = this.c;
        qcy qcyVar = d[0];
        Context context = (Context) mn2Var.a.get();
        if (context == null || !context.equals(activity)) {
            return;
        }
        this.a.a.g();
    }
}
