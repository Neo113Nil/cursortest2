package defpackage;

import com.yandex.plus.home.feature.webviews.internal.simple.SimpleWebViewLayout;
import com.yandex.plus.home.feature.webviews.internal.simple.a;
import com.yandex.plus.log.api.LogPriority;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ffs0 extends jd5 implements di41, so41, rs41 {
    public final gfs0 b;
    public final pgz c;
    public final wio d;
    public final hsd0 e;
    public final String f;
    public boolean g;

    public ffs0(gfs0 gfs0Var, pgz pgzVar, wio wioVar, hsd0 hsd0Var, String str) {
        this.b = gfs0Var;
        this.c = pgzVar;
        this.d = wioVar;
        this.e = hsd0Var;
        this.f = str;
    }

    @Override // defpackage.rs41
    public final void b() {
        a aVar;
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.c;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "SimpleWebViewContract", "onReady()");
        }
        aVar = ((SimpleWebViewLayout) ((qgn0) this.b).b).presenter;
        aVar.m();
        if (this.g) {
            return;
        }
        this.g = true;
        this.e.a(this.f);
    }

    @Override // defpackage.so41
    public final void f(String str, int i, String str2, String str3, boolean z) {
        a aVar;
        if (z) {
            String format = String.format("connection error, error code = %d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            aVar = ((SimpleWebViewLayout) ((qgn0) this.b).b).presenter;
            aVar.o(format, str);
        }
        this.d.c(str, i, str2, str3, z);
    }

    @Override // defpackage.di41
    public final void k(String str) {
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.c;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "SimpleWebViewContract", "onPageLoadingFinished() url=".concat(str));
        }
        ((SimpleWebViewLayout) ((qgn0) this.b).b).updateToolbar();
    }

    @Override // defpackage.so41
    public final void l(String str, int i, String str2, String str3, boolean z) {
        a aVar;
        if (z) {
            aVar = ((SimpleWebViewLayout) ((qgn0) this.b).b).presenter;
            aVar.o("ssl error", str);
        }
        this.d.e(str, i, str2, str3, z);
    }

    @Override // defpackage.rs41
    public final void n() {
        a aVar;
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.c;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "SimpleWebViewContract", "onReadyTimeout()");
        }
        aVar = ((SimpleWebViewLayout) ((qgn0) this.b).b).presenter;
        aVar.n();
    }

    @Override // defpackage.so41
    public final void r(String str, int i, String str2, String str3, boolean z) {
        a aVar;
        if (z) {
            String format = String.format("http error, status code = %d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            aVar = ((SimpleWebViewLayout) ((qgn0) this.b).b).presenter;
            aVar.o(format, str);
        }
        this.d.b(str, i, str2, str3, z);
    }
}
