package xsna;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import xsna.dm6;

/* compiled from: BaseRequestOptions.java */
/* loaded from: classes12.dex */
public abstract class dm6<T extends dm6<T>> implements Cloneable {
    public int b;
    public boolean i;
    public boolean n;

    @Nullable
    public Resources.Theme o;
    public boolean p;
    public boolean r;

    @NonNull
    public bbn c = bbn.c;

    @NonNull
    public Priority d = Priority.NORMAL;
    public boolean e = true;
    public int f = -1;
    public int g = -1;

    @NonNull
    public ady h = ihp.b;
    public boolean j = true;

    @NonNull
    public au80 k = new au80();

    @NonNull
    public hy8 l = new hy8();

    @NonNull
    public Class<?> m = Object.class;
    public boolean q = true;

    public static boolean i(int i, int i2) {
        return (i & i2) != 0;
    }

    @NonNull
    @CheckResult
    public T a(@NonNull dm6<?> dm6Var) {
        if (this.p) {
            return (T) clone().a(dm6Var);
        }
        int i = dm6Var.b;
        if (i(dm6Var.b, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES)) {
            this.r = dm6Var.r;
        }
        if (i(dm6Var.b, 4)) {
            this.c = dm6Var.c;
        }
        if (i(dm6Var.b, 8)) {
            this.d = dm6Var.d;
        }
        if (i(dm6Var.b, 16)) {
            this.b &= -33;
        }
        if (i(dm6Var.b, 32)) {
            this.b &= -17;
        }
        if (i(dm6Var.b, 64)) {
            this.b &= -129;
        }
        if (i(dm6Var.b, 128)) {
            this.b &= -65;
        }
        if (i(dm6Var.b, 256)) {
            this.e = dm6Var.e;
        }
        if (i(dm6Var.b, 512)) {
            this.g = dm6Var.g;
            this.f = dm6Var.f;
        }
        if (i(dm6Var.b, 1024)) {
            this.h = dm6Var.h;
        }
        if (i(dm6Var.b, 4096)) {
            this.m = dm6Var.m;
        }
        if (i(dm6Var.b, 8192)) {
            this.b &= -16385;
        }
        if (i(dm6Var.b, 16384)) {
            this.b &= -8193;
        }
        if (i(dm6Var.b, 32768)) {
            this.o = dm6Var.o;
        }
        if (i(dm6Var.b, 65536)) {
            this.j = dm6Var.j;
        }
        if (i(dm6Var.b, 131072)) {
            this.i = dm6Var.i;
        }
        if (i(dm6Var.b, 2048)) {
            this.l.putAll(dm6Var.l);
            this.q = dm6Var.q;
        }
        if (!this.j) {
            this.l.clear();
            int i2 = this.b;
            this.i = false;
            this.b = i2 & (-133121);
            this.q = true;
        }
        this.b |= dm6Var.b;
        this.k.b.g(dm6Var.k.b);
        m();
        return this;
    }

    @Override // 
    @CheckResult
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public T clone() {
        try {
            T t = (T) super.clone();
            au80 au80Var = new au80();
            t.k = au80Var;
            au80Var.b.g(this.k.b);
            hy8 hy8Var = new hy8();
            t.l = hy8Var;
            hy8Var.putAll(this.l);
            t.n = false;
            t.p = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof dm6) {
            return h((dm6) obj);
        }
        return false;
    }

    @NonNull
    @CheckResult
    public final T f(@NonNull Class<?> cls) {
        if (this.p) {
            return (T) clone().f(cls);
        }
        this.m = cls;
        this.b |= 4096;
        m();
        return this;
    }

    @NonNull
    @CheckResult
    public final T g(@NonNull bbn bbnVar) {
        if (this.p) {
            return (T) clone().g(bbnVar);
        }
        nr2.r(bbnVar, "Argument must not be null");
        this.c = bbnVar;
        this.b |= 4;
        m();
        return this;
    }

    public final boolean h(dm6<?> dm6Var) {
        dm6Var.getClass();
        if (Float.compare(1.0f, 1.0f) != 0) {
            return false;
        }
        char[] cArr = s2r0.a;
        return this.e == dm6Var.e && this.f == dm6Var.f && this.g == dm6Var.g && this.i == dm6Var.i && this.j == dm6Var.j && this.c.equals(dm6Var.c) && this.d == dm6Var.d && this.k.equals(dm6Var.k) && this.l.equals(dm6Var.l) && this.m.equals(dm6Var.m) && s2r0.b(this.h, dm6Var.h) && s2r0.b(this.o, dm6Var.o);
    }

    public int hashCode() {
        char[] cArr = s2r0.a;
        return s2r0.h(s2r0.h(s2r0.h(s2r0.h(s2r0.h(s2r0.h(s2r0.h(s2r0.g(0, s2r0.g(0, s2r0.g(this.j ? 1 : 0, s2r0.g(this.i ? 1 : 0, s2r0.g(this.g, s2r0.g(this.f, s2r0.g(this.e ? 1 : 0, s2r0.h(s2r0.g(0, s2r0.h(s2r0.g(0, s2r0.h(s2r0.g(0, s2r0.g(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.c), this.d), this.k), this.l), this.m), this.h), this.o);
    }

    @NonNull
    @CheckResult
    public final T j(int i, int i2) {
        if (this.p) {
            return (T) clone().j(i, i2);
        }
        this.g = i;
        this.f = i2;
        this.b |= 512;
        m();
        return this;
    }

    @NonNull
    @CheckResult
    public final T k(@NonNull Priority priority) {
        if (this.p) {
            return (T) clone().k(priority);
        }
        nr2.r(priority, "Argument must not be null");
        this.d = priority;
        this.b |= 8;
        m();
        return this;
    }

    public final T l(@NonNull ht80<?> ht80Var) {
        if (this.p) {
            return (T) clone().l(ht80Var);
        }
        this.k.b.remove(ht80Var);
        m();
        return this;
    }

    @NonNull
    public final void m() {
        if (this.n) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    @NonNull
    @CheckResult
    public final <Y> T n(@NonNull ht80<Y> ht80Var, @NonNull Y y) {
        if (this.p) {
            return (T) clone().n(ht80Var, y);
        }
        nr2.q(ht80Var);
        nr2.q(y);
        this.k.b.put(ht80Var, y);
        m();
        return this;
    }

    @NonNull
    @CheckResult
    public final T o(@NonNull ady adyVar) {
        if (this.p) {
            return (T) clone().o(adyVar);
        }
        this.h = adyVar;
        this.b |= 1024;
        m();
        return this;
    }

    @NonNull
    @CheckResult
    public final dm6 p() {
        if (this.p) {
            return clone().p();
        }
        this.e = false;
        this.b |= 256;
        m();
        return this;
    }

    @NonNull
    @CheckResult
    public final T q(@Nullable Resources.Theme theme) {
        if (this.p) {
            return (T) clone().q(theme);
        }
        this.o = theme;
        if (theme != null) {
            this.b |= 32768;
            return n(oag0.b, theme);
        }
        this.b &= -32769;
        return l(oag0.b);
    }

    @NonNull
    public final dm6 r(@NonNull Class cls, @NonNull clp0 clp0Var) {
        if (this.p) {
            return clone().r(cls, clp0Var);
        }
        nr2.q(clp0Var);
        this.l.put(cls, clp0Var);
        int i = this.b;
        this.j = true;
        this.q = false;
        this.b = i | 198656;
        this.i = true;
        m();
        return this;
    }

    @NonNull
    public final dm6 s(@NonNull clp0 clp0Var) {
        if (this.p) {
            return clone().s(clp0Var);
        }
        jko jkoVar = new jko(clp0Var);
        r(Bitmap.class, clp0Var);
        r(Drawable.class, jkoVar);
        r(BitmapDrawable.class, jkoVar);
        r(gyt.class, new iyt(clp0Var));
        m();
        return this;
    }

    @NonNull
    @CheckResult
    public final dm6 t() {
        if (this.p) {
            return clone().t();
        }
        this.r = true;
        this.b |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        m();
        return this;
    }
}
