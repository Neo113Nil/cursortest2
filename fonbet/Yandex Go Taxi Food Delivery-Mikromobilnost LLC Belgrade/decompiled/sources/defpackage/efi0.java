package defpackage;

import com.ybsdk.api.e;

/* loaded from: classes3.dex */
public final class efi0 {
    public final /* synthetic */ e a;

    public efi0(e eVar) {
        this.a = eVar;
    }

    public final void a(pha1 pha1Var) {
        fh51 wg51Var;
        if (pha1Var.equals(cfi0.b)) {
            wg51Var = vg51.c;
        } else if (pha1Var.equals(cfi0.a)) {
            wg51Var = vg51.b;
        } else {
            if (!(pha1Var instanceof dfi0)) {
                w511.b();
                return;
            }
            Throwable th = ((dfi0) pha1Var).a;
            String message = th.getMessage();
            if (message == null) {
                message = "unknown error";
            }
            wg51Var = new wg51(th, g8e.z("throwable", message));
        }
        this.a.f(wg51Var);
    }
}
