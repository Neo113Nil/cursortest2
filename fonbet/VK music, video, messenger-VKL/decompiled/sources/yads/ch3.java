package yads;

import android.content.Context;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.a0m0;
import xsna.fpf0;
import xsna.p5j;
import xsna.pn00;
import xsna.qcy;

/* loaded from: classes10.dex */
public final class ch3 implements gh3, rg3 {
    public static final /* synthetic */ qcy[] k = {new MutablePropertyReference1Impl(ch3.class, "adParameterManager", "getAdParameterManager()Lcom/monetization/ads/video/render/report/VideoAdRenderingResultReporter$ResponseReportParameterManager;", 0), p5j.a(0, ch3.class, "requestParameterManager", "getRequestParameterManager()Lcom/monetization/ads/video/render/report/VideoAdRenderingResultReporter$RequestReportParameterManager;", fpf0.a)};
    public static final long l = TimeUnit.SECONDS.toMillis(10);
    public final w5 a;
    public final cl3 b;
    public final xc2 c;
    public final ih3 d;
    public final tg3 e;
    public final fh3 f;
    public final mj3 g;
    public boolean h;
    public final ah3 i;
    public final bh3 j;

    public /* synthetic */ ch3(Context context, ov2 ov2Var, v9 v9Var, nf3 nf3Var, w5 w5Var, nh3 nh3Var, il3 il3Var, fk3 fk3Var, dl3 dl3Var) {
        this(context, ov2Var, v9Var, nf3Var, w5Var, nh3Var, il3Var, fk3Var, dl3Var, wc2.a(false));
    }

    public final void a(ng3 ng3Var) {
        b();
        if (this.h) {
            return;
        }
        this.h = true;
        String lowerCase = ng3Var.a.name().toLowerCase(Locale.ROOT);
        String message = ng3Var.b.getMessage();
        if (message == null) {
            message = "";
        }
        fh3 fh3Var = this.f;
        fh3Var.getClass();
        fh3Var.a(pn00.m(new Pair("status", "error"), new Pair("failure_reason", lowerCase), new Pair("error_message", message)));
    }

    public final void b() {
        ih3 ih3Var = this.d;
        ih3Var.c.removeCallbacksAndMessages(null);
        ih3Var.e = false;
        tg3 tg3Var = this.e;
        tg3Var.c.removeCallbacksAndMessages(null);
        tg3Var.e = false;
        ((ad2) this.c).a();
    }

    public ch3(Context context, ov2 ov2Var, v9 v9Var, nf3 nf3Var, w5 w5Var, nh3 nh3Var, il3 il3Var, fk3 fk3Var, dl3 dl3Var, xc2 xc2Var) {
        this.a = w5Var;
        this.b = dl3Var;
        this.c = xc2Var;
        this.d = new ih3(fk3Var, this);
        this.e = new tg3(nh3Var, this);
        this.f = new fh3(context, ov2Var, v9Var, w5Var);
        this.g = new mj3(nf3Var, il3Var);
        this.i = new ah3(this);
        this.j = new bh3(this);
    }

    public final void a() {
        ih3 ih3Var = this.d;
        ih3Var.c.removeCallbacksAndMessages(null);
        ih3Var.e = false;
        this.a.a(v5.u, null);
        this.b.i();
        tg3 tg3Var = this.e;
        if (!tg3Var.e && !tg3Var.d) {
            tg3Var.e = true;
            tg3Var.c.post(new sg3(tg3Var));
        }
        ((ad2) this.c).a(l, new a0m0(this, 13));
    }

    public static final void a(ch3 ch3Var) {
        lf0 lf0Var = new lf0();
        mg3 mg3Var = mg3.i;
        ch3Var.b();
        if (ch3Var.h) {
            return;
        }
        ch3Var.h = true;
        String lowerCase = mg3Var.name().toLowerCase(Locale.ROOT);
        String message = lf0Var.getMessage();
        if (message == null) {
            message = "";
        }
        fh3 fh3Var = ch3Var.f;
        fh3Var.getClass();
        fh3Var.a(pn00.m(new Pair("status", "error"), new Pair("failure_reason", lowerCase), new Pair("error_message", message)));
    }
}
