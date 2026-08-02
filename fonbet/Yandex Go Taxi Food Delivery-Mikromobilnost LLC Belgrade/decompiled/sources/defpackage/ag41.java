package defpackage;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes6.dex */
public final class ag41 implements zf41, xf41 {
    public final n0 a = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public final void a(UiWebViewConfig uiWebViewConfig) {
        this.a.g(new lf41(uiWebViewConfig));
    }

    public final void b(boolean z) {
        this.a.g(new kf41(z));
    }

    public final void c(cu41 cu41Var) {
        this.a.g(new nf41(cu41Var));
    }

    public final void d(String str) {
        this.a.g(new of41(str));
    }

    @Override // defpackage.zf41
    public final tpr getEvents() {
        return this.a;
    }
}
