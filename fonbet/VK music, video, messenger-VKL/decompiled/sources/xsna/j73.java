package xsna;

import com.vk.log.L;
import xsna.eqo;

/* compiled from: AppLovinDynamicLibLoader.kt */
/* loaded from: classes14.dex */
public final class j73 implements eqo.a<p73> {
    public final /* synthetic */ g73 a;
    public final /* synthetic */ z63 b;

    public j73(g73 g73Var, z63 z63Var) {
        this.a = g73Var;
        this.b = z63Var;
    }

    @Override // xsna.eqo.a
    public final void b(p73 p73Var) {
        g73 g73Var = this.a;
        g73Var.a();
        L.e("[ExternalAdsDynamicLibLoader]", "AppLovin lib loading was successful");
        i0q0.j(new vr2(1, this.b, g73Var));
    }

    @Override // xsna.eqo.a
    public final void c(p73 p73Var) {
        this.a.a();
        RuntimeException runtimeException = new RuntimeException("AppLovin dynamic lib loading canceled");
        L.l("[ExternalAdsDynamicLibLoader]", "an error occurred while loading - " + runtimeException.getMessage());
        i0q0.j(new h73(0, this.b, runtimeException));
    }

    @Override // xsna.eqo.a
    public final void d(p73 p73Var, Throwable th) {
        this.a.a();
        L.l("[ExternalAdsDynamicLibLoader]", m5k.b(th, new StringBuilder("an error occurred while loading - ")));
        i0q0.j(new i73(0, this.b, th));
    }

    @Override // xsna.eqo.a
    public final void a(boolean z) {
    }
}
