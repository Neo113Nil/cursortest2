package xsna;

import com.vk.log.L;
import java.util.concurrent.TimeUnit;
import ru.ok.gl.util.Logger;
import xsna.v000;

/* compiled from: EffectsLogger.kt */
/* loaded from: classes7.dex */
public final class cap implements Logger {
    public final v000 a;

    public cap() {
        v000 v000Var = new v000();
        this.a = v000Var;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        v000Var.a(new v000.b(10L, 10, "CallEffects"));
    }

    @Override // ru.ok.gl.util.Logger
    public final void d(String str, String str2) {
        if (this.a.b(str)) {
            L.e(str, str2);
        }
    }

    @Override // ru.ok.gl.util.Logger
    public final void e(String str, String str2, Throwable th) {
        L.f(str, str2, th);
    }

    @Override // ru.ok.gl.util.Logger
    public final void i(String str, String str2) {
        if (this.a.b(str)) {
            L.p(str, str2);
        }
    }

    @Override // ru.ok.gl.util.Logger
    public final void v(String str, String str2) {
        if (this.a.b(str)) {
            L.A(str, str2);
        }
    }

    @Override // ru.ok.gl.util.Logger
    public final void w(String str, String str2) {
        if (this.a.b(str)) {
            L.G(str, str2);
        }
    }

    @Override // ru.ok.gl.util.Logger
    public final void e(String str, String str2) {
        L.l(str, str2);
    }
}
