package defpackage;

import android.util.Range;
import androidx.camera.video.g;

/* loaded from: classes10.dex */
public final class jii0 {
    public final mrj a;
    public final d7g0 b;
    public final d7g0 c;
    public final d7g0 d;
    public final long e;

    public jii0() {
        d7g0 d7g0Var = g.t0;
        this.b = d7g0Var;
        this.c = d7g0Var;
        this.d = g.u0;
        this.e = -1L;
        mrj mrjVar = new mrj(21, false);
        mrjVar.w = -1;
        mrjVar.c = n34.a().c();
        qgg0 qgg0Var = i94.f;
        if (qgg0Var == null) {
            ny61.t("Null qualitySelector");
            throw null;
        }
        Range range = i94.e;
        if (range == null) {
            ny61.t("Null bitrate");
            throw null;
        }
        mrjVar.b = new i94(qgg0Var, 0, range, -1);
        this.a = mrjVar;
    }

    public final void a(int i) {
        mrj mrjVar = this.a;
        i94 i94Var = (i94) mrjVar.b;
        if (i94Var == null) {
            ny61.r("Property \"videoSpec\" has not been set");
            return;
        }
        qgg0 qgg0Var = i94Var.a;
        int i2 = i94Var.b;
        Range range = i94Var.c;
        String str = qgg0Var == null ? " qualitySelector" : "";
        if (range == null) {
            str = str.concat(" bitrate");
        }
        if (str.isEmpty()) {
            mrjVar.b = new i94(qgg0Var, i2, range, i);
        } else {
            ny61.r("Missing required properties:".concat(str));
        }
    }

    public final void b(qgg0 qgg0Var) {
        d6z.v(qgg0Var, "The specified quality selector can't be null.");
        mrj mrjVar = this.a;
        i94 i94Var = (i94) mrjVar.b;
        if (i94Var == null) {
            ny61.r("Property \"videoSpec\" has not been set");
            return;
        }
        int i = i94Var.b;
        Range range = i94Var.c;
        int i2 = i94Var.d;
        String concat = range == null ? "".concat(" bitrate") : "";
        if (concat.isEmpty()) {
            mrjVar.b = new i94(qgg0Var, i, range, i2);
        } else {
            ny61.r("Missing required properties:".concat(concat));
        }
    }
}
