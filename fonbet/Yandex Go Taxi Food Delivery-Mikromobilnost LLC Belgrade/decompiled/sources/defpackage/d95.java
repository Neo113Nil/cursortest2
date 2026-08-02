package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.gif.GifDrawable;

/* loaded from: classes10.dex */
public abstract class d95 implements Cloneable {
    public boolean E;
    public boolean J;
    public Resources.Theme K;
    public boolean L;
    public boolean N;
    public int a;
    public Drawable w;
    public int x;
    public Drawable y;
    public int z;
    public exj b = exj.c;
    public Priority c = Priority.NORMAL;
    public boolean A = true;
    public int B = -1;
    public int C = -1;
    public khx D = jxn.b;
    public boolean F = true;
    public mg70 G = new mg70();
    public pd7 H = new pd7();
    public Class I = Object.class;
    public boolean M = true;

    public static boolean j(int i, int i2) {
        return (i & i2) != 0;
    }

    public d95 a(d95 d95Var) {
        if (this.L) {
            return clone().a(d95Var);
        }
        int i = d95Var.a;
        if (j(d95Var.a, 1048576)) {
            this.N = d95Var.N;
        }
        if (j(d95Var.a, 4)) {
            this.b = d95Var.b;
        }
        if (j(d95Var.a, 8)) {
            this.c = d95Var.c;
        }
        if (j(d95Var.a, 16)) {
            this.w = d95Var.w;
            this.x = 0;
            this.a &= -33;
        }
        if (j(d95Var.a, 32)) {
            this.x = d95Var.x;
            this.w = null;
            this.a &= -17;
        }
        if (j(d95Var.a, 64)) {
            this.y = d95Var.y;
            this.z = 0;
            this.a &= -129;
        }
        if (j(d95Var.a, 128)) {
            this.z = d95Var.z;
            this.y = null;
            this.a &= -65;
        }
        if (j(d95Var.a, 256)) {
            this.A = d95Var.A;
        }
        if (j(d95Var.a, 512)) {
            this.C = d95Var.C;
            this.B = d95Var.B;
        }
        if (j(d95Var.a, 1024)) {
            this.D = d95Var.D;
        }
        if (j(d95Var.a, 4096)) {
            this.I = d95Var.I;
        }
        if (j(d95Var.a, 8192)) {
            this.a &= -16385;
        }
        if (j(d95Var.a, 16384)) {
            this.a &= -8193;
        }
        if (j(d95Var.a, 32768)) {
            this.K = d95Var.K;
        }
        if (j(d95Var.a, 65536)) {
            this.F = d95Var.F;
        }
        if (j(d95Var.a, 131072)) {
            this.E = d95Var.E;
        }
        if (j(d95Var.a, 2048)) {
            this.H.putAll(d95Var.H);
            this.M = d95Var.M;
        }
        if (!this.F) {
            this.H.clear();
            int i2 = this.a;
            this.E = false;
            this.a = i2 & (-133121);
            this.M = true;
        }
        this.a |= d95Var.a;
        this.G.b.g(d95Var.G.b);
        s();
        return this;
    }

    public final void b() {
        if (this.J && !this.L) {
            ny61.r("You cannot auto lock an already locked options object, try clone() first");
        } else {
            this.L = true;
            this.J = true;
        }
    }

    @Override // 
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public d95 clone() {
        try {
            d95 d95Var = (d95) super.clone();
            mg70 mg70Var = new mg70();
            d95Var.G = mg70Var;
            mg70Var.b.g(this.G.b);
            pd7 pd7Var = new pd7();
            d95Var.H = pd7Var;
            pd7Var.putAll(this.H);
            d95Var.J = false;
            d95Var.L = false;
            return d95Var;
        } catch (CloneNotSupportedException e) {
            ny61.j(e);
            return null;
        }
    }

    public final d95 d(Class cls) {
        if (this.L) {
            return clone().d(cls);
        }
        this.I = cls;
        this.a |= 4096;
        s();
        return this;
    }

    public final d95 e(exj exjVar) {
        if (this.L) {
            return clone().e(exjVar);
        }
        z2a1.e(exjVar, "Argument must not be null");
        this.b = exjVar;
        this.a |= 4;
        s();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d95) {
            return i((d95) obj);
        }
        return false;
    }

    public final d95 f(int i) {
        if (this.L) {
            return clone().f(i);
        }
        this.x = i;
        int i2 = this.a | 32;
        this.w = null;
        this.a = i2 & (-17);
        s();
        return this;
    }

    public final d95 g(Drawable drawable) {
        if (this.L) {
            return clone().g(drawable);
        }
        this.w = drawable;
        int i = this.a | 16;
        this.x = 0;
        this.a = i & (-33);
        s();
        return this;
    }

    public final d95 h() {
        if (this.L) {
            return clone().h();
        }
        this.a = (this.a | 8192) & (-16385);
        s();
        return this;
    }

    public int hashCode() {
        return pw21.l(pw21.l(pw21.l(pw21.l(pw21.l(pw21.l(pw21.l(pw21.k(0, pw21.k(0, pw21.k(this.F ? 1 : 0, pw21.k(this.E ? 1 : 0, pw21.k(this.C, pw21.k(this.B, pw21.k(this.A ? 1 : 0, pw21.l(pw21.k(0, pw21.l(pw21.k(this.z, pw21.l(pw21.k(this.x, pw21.k(Float.floatToIntBits(1.0f), 17)), this.w)), this.y)), null)))))))), this.b), this.c), this.G), this.H), this.I), this.D), this.K);
    }

    public final boolean i(d95 d95Var) {
        d95Var.getClass();
        return Float.compare(1.0f, 1.0f) == 0 && this.x == d95Var.x && pw21.b(this.w, d95Var.w) && this.z == d95Var.z && pw21.b(this.y, d95Var.y) && this.A == d95Var.A && this.B == d95Var.B && this.C == d95Var.C && this.E == d95Var.E && this.F == d95Var.F && this.b.equals(d95Var.b) && this.c == d95Var.c && this.G.equals(d95Var.G) && this.H.equals(d95Var.H) && this.I.equals(d95Var.I) && pw21.b(this.D, d95Var.D) && pw21.b(this.K, d95Var.K);
    }

    public final d95 l(DownsampleStrategy downsampleStrategy, i16 i16Var) {
        if (this.L) {
            return clone().l(downsampleStrategy, i16Var);
        }
        ce70 ce70Var = DownsampleStrategy.f;
        z2a1.e(downsampleStrategy, "Argument must not be null");
        t(ce70Var, downsampleStrategy);
        return x(i16Var, false);
    }

    public final d95 m(int i, int i2) {
        if (this.L) {
            return clone().m(i, i2);
        }
        this.C = i;
        this.B = i2;
        this.a |= 512;
        s();
        return this;
    }

    public final d95 o(int i) {
        if (this.L) {
            return clone().o(i);
        }
        this.z = i;
        int i2 = this.a | 128;
        this.y = null;
        this.a = i2 & (-65);
        s();
        return this;
    }

    public final d95 p(Drawable drawable) {
        if (this.L) {
            return clone().p(drawable);
        }
        this.y = drawable;
        int i = this.a | 64;
        this.z = 0;
        this.a = i & (-129);
        s();
        return this;
    }

    public final d95 q(Priority priority) {
        if (this.L) {
            return clone().q(priority);
        }
        z2a1.e(priority, "Argument must not be null");
        this.c = priority;
        this.a |= 8;
        s();
        return this;
    }

    public final d95 r(ce70 ce70Var) {
        if (this.L) {
            return clone().r(ce70Var);
        }
        this.G.b.remove(ce70Var);
        s();
        return this;
    }

    public final void s() {
        if (this.J) {
            ny61.r("You cannot modify locked T, consider clone()");
        }
    }

    public final d95 t(ce70 ce70Var, Object obj) {
        if (this.L) {
            return clone().t(ce70Var, obj);
        }
        z2a1.d(ce70Var);
        z2a1.d(obj);
        this.G.b.put(ce70Var, obj);
        s();
        return this;
    }

    public final d95 u(khx khxVar) {
        if (this.L) {
            return clone().u(khxVar);
        }
        this.D = khxVar;
        this.a |= 1024;
        s();
        return this;
    }

    public final d95 v(boolean z) {
        if (this.L) {
            return clone().v(true);
        }
        this.A = !z;
        this.a |= 256;
        s();
        return this;
    }

    public final d95 w(Resources.Theme theme) {
        if (this.L) {
            return clone().w(theme);
        }
        this.K = theme;
        int i = this.a;
        if (theme != null) {
            this.a = i | 32768;
            return t(utj0.b, theme);
        }
        this.a = (-32769) & i;
        return r(utj0.b);
    }

    public final d95 x(nw01 nw01Var, boolean z) {
        if (this.L) {
            return clone().x(nw01Var, z);
        }
        rbm rbmVar = new rbm(nw01Var, z);
        y(Bitmap.class, nw01Var, z);
        y(Drawable.class, rbmVar, z);
        y(BitmapDrawable.class, rbmVar, z);
        y(GifDrawable.class, new qgt(nw01Var), z);
        s();
        return this;
    }

    public final d95 y(Class cls, nw01 nw01Var, boolean z) {
        if (this.L) {
            return clone().y(cls, nw01Var, z);
        }
        z2a1.d(nw01Var);
        this.H.put(cls, nw01Var);
        int i = this.a;
        this.F = true;
        this.a = 67584 | i;
        this.M = false;
        if (z) {
            this.a = i | 198656;
            this.E = true;
        }
        s();
        return this;
    }

    public final d95 z() {
        if (this.L) {
            return clone().z();
        }
        this.N = true;
        this.a |= 1048576;
        s();
        return this;
    }
}
