package xsna;

import com.vk.external.miniapp.net.app.WebApiApplication;

/* compiled from: AppItems.kt */
/* loaded from: classes6.dex */
public final class q53 extends d56 {
    public final WebApiApplication b;
    public final int c = 1;

    public q53(WebApiApplication webApiApplication) {
        this.b = webApiApplication;
    }

    @Override // xsna.d56
    public final boolean a(d56 d56Var) {
        if (!(d56Var instanceof q53)) {
            return false;
        }
        return epx.f(this.b, ((q53) d56Var).b);
    }

    @Override // xsna.d56
    public final boolean b(d56 d56Var) {
        return (d56Var instanceof q53) && ((q53) d56Var).b.b == this.b.b;
    }

    @Override // xsna.d56
    public final int c() {
        return this.c;
    }
}
