package xsna;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import com.ironsource.Z3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.im.ui.views.msg.bubble.MsgBubblePart;

/* compiled from: MsgBubbleStyle.kt */
/* loaded from: classes2.dex */
public final class oh30 implements ll8, hl8 {
    public static final oh30 A;
    public static final oh30 B;
    public static final oh30 C;
    public static final oh30 D;
    public static final oh30 E;
    public static final oh30 F;
    public static final oh30 G;
    public static final oh30 H;
    public static final oh30 I;
    public static final oh30 J;
    public static final oh30 l = new oh30(null, new mgl(), null, false, 893);
    public static final oh30 m = new oh30(null, new wjl(), null, false, 893);
    public static final oh30 n = new oh30(null, new yws(), null, true, 829);
    public static final oh30 o;
    public static final oh30 p;
    public static final oh30 q;
    public static final oh30 r;
    public static final oh30 s;
    public static final oh30 t;
    public static final oh30 u;
    public static final oh30 v;
    public static final oh30 w;
    public static final oh30 x;
    public static final oh30 y;
    public static final oh30 z;
    public final kl8 b;
    public final ll8 c;
    public final hl8 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    /* compiled from: MsgBubbleStyle.kt */
    public static final class a {
        public static oh30 a(boolean z) {
            return z ? oh30.q : oh30.r;
        }

        public static oh30 b(boolean z) {
            return z ? oh30.E : oh30.F;
        }
    }

    static {
        mgl mglVar = new mgl();
        lgl lglVar = lgl.b;
        o = new oh30(lglVar, mglVar, null, false, 1020);
        wjl wjlVar = new wjl();
        xbl xblVar = new xbl();
        vjl vjlVar = vjl.b;
        p = new oh30(vjlVar, wjlVar, xblVar, false, Z3.l);
        q = new oh30(null, new r670(), null, false, 1005);
        r = new oh30(null, new s670(), null, false, 1005);
        s = new oh30(null, new r670(), null, false, 1005);
        t = new oh30(null, new s670(), null, false, 1005);
        u = new oh30(null, new q670(), null, true, 941);
        v = new oh30(lglVar, new dnx0(), new xbl(), false, Z3.l);
        w = new oh30(vjlVar, new onx0(), new xbl(), false, Z3.l);
        x = new oh30(lglVar, new g98(), new xbl(), false, Z3.l);
        y = new oh30(vjlVar, new h98(), new xbl(), false, Z3.l);
        new oh30(n18.b, new o18(), null, false, 988);
        new oh30(w18.b, new x18(), null, false, 988);
        z = new oh30(r5z.b, new s5z(), null, false, 1012);
        A = new oh30(t5z.b, new u5z(), null, false, 1012);
        B = new oh30(lglVar, new yws(), new xbl(), true, 952);
        C = new oh30(lglVar, new n1b(), new xbl(), false, 936);
        D = new oh30(lglVar, new n1b(), new xbl(), true, 952);
        E = new oh30(lglVar, new mgl(), new xbl(), false, Z3.l);
        F = new oh30(vjlVar, new wjl(), new xbl(), false, Z3.l);
        G = new oh30(lglVar, new l120(), new xbl(), false, Z3.l);
        H = new oh30(vjlVar, new m120(), new xbl(), false, Z3.l);
        I = new oh30(lglVar, new ir10(), new xbl(), false, Z3.l);
        J = new oh30(vjlVar, new at10(), new xbl(), false, Z3.l);
    }

    public oh30() {
        this(null, null, null, false, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
    }

    @Override // xsna.hl8
    public final PorterDuff.Mode a() {
        return this.d.a();
    }

    @Override // xsna.ll8
    public final Rect e(MsgBubblePart msgBubblePart) {
        return this.c.e(msgBubblePart);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh30)) {
            return false;
        }
        oh30 oh30Var = (oh30) obj;
        return epx.f(this.b, oh30Var.b) && epx.f(this.c, oh30Var.c) && epx.f(this.d, oh30Var.d) && this.e == oh30Var.e && this.f == oh30Var.f && this.g == oh30Var.g && this.h == oh30Var.h && this.i == oh30Var.i && this.j == oh30Var.j && this.k == oh30Var.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    @Override // xsna.ll8
    public final Rect i(MsgBubblePart msgBubblePart) {
        return this.c.i(msgBubblePart);
    }

    @Override // xsna.ll8
    public final Rect j(MsgBubblePart msgBubblePart) {
        return this.c.j(msgBubblePart);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgBubbleStyle(drawableProvider=");
        sb.append(this.b);
        sb.append(", paddingProvider=");
        sb.append(this.c);
        sb.append(", colorParamsProvider=");
        sb.append(this.d);
        sb.append(", isLight=");
        sb.append(this.e);
        sb.append(", isNone=");
        sb.append(this.f);
        sb.append(", isBorder=");
        sb.append(this.g);
        sb.append(", isFullWidth=");
        sb.append(this.h);
        sb.append(", isClean=");
        sb.append(this.i);
        sb.append(", isLinked=");
        sb.append(this.j);
        sb.append(", isAppendixReversed=");
        return defpackage.q0.a(sb, this.k, ')');
    }

    public oh30(kl8 kl8Var, ll8 ll8Var, hl8 hl8Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.b = kl8Var;
        this.c = ll8Var;
        this.d = hl8Var;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = z7;
        this.k = z8;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public oh30(kl8 kl8Var, ll8 ll8Var, xbl xblVar, boolean z2, int i) {
        this(r1, r2, r3, r4, (i & 16) != 0 ? r12 : true, (i & 32) != 0 ? r12 : true, (i & 64) != 0 ? r12 : z2, (i & 128) != 0 ? r12 : true, false, false);
        boolean z3;
        kl8 kl8Var2 = (i & 1) != 0 ? f9t.f : kl8Var;
        ll8 d370Var = (i & 2) != 0 ? new d370(0) : ll8Var;
        hl8 c370Var = (i & 4) != 0 ? new c370() : xblVar;
        boolean z4 = false;
        if ((i & 8) != 0) {
            z3 = false;
        } else {
            z3 = false;
            z4 = true;
        }
    }
}
