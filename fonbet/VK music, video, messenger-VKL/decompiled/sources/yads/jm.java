package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import xsna.bi5;
import xsna.gq4;
import xsna.ku5;
import xsna.m67;
import xsna.nq4;
import xsna.rc4;

/* loaded from: classes10.dex */
public final class jm {
    public final Handler a;
    public final y5 b;
    public h00 c;

    public /* synthetic */ jm(Context context, d4 d4Var, mv3 mv3Var, w5 w5Var) {
        this(new Handler(Looper.getMainLooper()), new y5(context, d4Var, mv3Var, w5Var));
    }

    public final void a() {
        this.a.post(new nq4(this, 15));
    }

    public final void b() {
        this.b.a();
        this.a.post(new m67(this, 14));
    }

    public final void c() {
        this.a.post(new bi5(this, 16));
    }

    public final void d() {
        this.a.post(new rc4(this, 21));
    }

    public static final void a(jm jmVar) {
        h00 h00Var = jmVar.c;
        if (h00Var != null) {
            h00Var.closeBannerAd();
        }
    }

    public static final void c(jm jmVar) {
        h00 h00Var = jmVar.c;
        if (h00Var != null) {
            h00Var.onAdClicked();
            h00Var.onLeftApplication();
        }
    }

    public static final void d(jm jmVar) {
        h00 h00Var = jmVar.c;
        if (h00Var != null) {
            h00Var.onReturnedToApplication();
        }
    }

    public static final void b(jm jmVar) {
        h00 h00Var = jmVar.c;
        if (h00Var != null) {
            h00Var.onAdLoaded();
        }
    }

    public final void a(l4 l4Var) {
        this.b.a(l4Var.b, l4Var.c);
        this.a.post(new gq4(7, this, l4Var));
    }

    public jm(Handler handler, y5 y5Var) {
        this.a = handler;
        this.b = y5Var;
    }

    public static final void a(jm jmVar, l4 l4Var) {
        h00 h00Var = jmVar.c;
        if (h00Var != null) {
            h00Var.a(l4Var);
        }
    }

    public final void a(j5 j5Var) {
        this.a.post(new ku5(5, this, j5Var));
    }

    public static final void a(jm jmVar, j5 j5Var) {
        h00 h00Var = jmVar.c;
        if (h00Var != null) {
            h00Var.a(j5Var);
        }
    }

    public final void a(d4 d4Var) {
        this.b.e = new j9(d4Var);
    }

    public final void a(j22 j22Var) {
        this.b.f = j22Var;
    }
}
