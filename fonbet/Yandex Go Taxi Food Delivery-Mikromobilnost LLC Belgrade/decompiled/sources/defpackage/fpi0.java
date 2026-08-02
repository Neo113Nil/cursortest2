package defpackage;

import ru.yandex.taxi.am.m;
import ru.yandex.taxi.settings.email.RefreshEmailAppLifecycleListener$onLargestContentfulPaint$$inlined$safeCollectIn$1;
import ru.yandex.taxi.settings.email.c;

/* loaded from: classes10.dex */
public final class fpi0 implements lz60 {
    public final tse a;
    public final h3y b;
    public final m c;

    public fpi0(tse tseVar, h3y h3yVar, m mVar) {
        this.a = tseVar;
        this.b = h3yVar;
        this.c = mVar;
    }

    @Override // defpackage.lz60
    public final void g() {
        tje.N(this.a, null, null, new RefreshEmailAppLifecycleListener$onLargestContentfulPaint$$inlined$safeCollectIn$1(new c(this.c.f), null, this), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "RefreshEmailAppLifecycleListener";
    }
}
