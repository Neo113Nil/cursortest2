package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.request.RequestCoordinator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: RequestBuilder.java */
/* loaded from: classes12.dex */
public final class i7g0<TranscodeType> extends dm6<i7g0<TranscodeType>> {

    @Nullable
    public i7g0<TranscodeType> A;
    public boolean C;
    public boolean D;
    public final Context s;
    public final y7g0 t;
    public final com.bumptech.glide.c v;

    @NonNull
    public anp0<?, ? super TranscodeType> w;

    @Nullable
    public Object x;

    @Nullable
    public ArrayList y;

    @Nullable
    public i7g0<TranscodeType> z;
    public final boolean B = true;
    public final Class<TranscodeType> u = Bitmap.class;

    /* compiled from: RequestBuilder.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[Priority.values().length];
            b = iArr;
            try {
                iArr[Priority.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[Priority.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[Priority.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[Priority.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
    }

    @SuppressLint({"CheckResult"})
    public i7g0(@NonNull com.bumptech.glide.a aVar, y7g0 y7g0Var, Context context) {
        d8g0 d8g0Var;
        this.t = y7g0Var;
        this.s = context;
        Map<Class<?>, anp0<?, ?>> map = y7g0Var.b.d.e;
        anp0 anp0Var = map.get(Bitmap.class);
        if (anp0Var == null) {
            for (Map.Entry<Class<?>, anp0<?, ?>> entry : map.entrySet()) {
                if (entry.getKey().isAssignableFrom(Bitmap.class)) {
                    anp0Var = entry.getValue();
                }
            }
        }
        this.w = anp0Var == null ? com.bumptech.glide.c.j : anp0Var;
        this.v = aVar.d;
        Iterator<x7g0<Object>> it = y7g0Var.j.iterator();
        while (it.hasNext()) {
            u((x7g0) it.next());
        }
        synchronized (y7g0Var) {
            d8g0Var = y7g0Var.k;
        }
        a(d8g0Var);
    }

    @Override // xsna.dm6
    public final boolean equals(Object obj) {
        if (!(obj instanceof i7g0)) {
            return false;
        }
        i7g0 i7g0Var = (i7g0) obj;
        return super.equals(i7g0Var) && Objects.equals(this.u, i7g0Var.u) && this.w.equals(i7g0Var.w) && Objects.equals(this.x, i7g0Var.x) && Objects.equals(this.y, i7g0Var.y) && Objects.equals(this.z, i7g0Var.z) && Objects.equals(this.A, i7g0Var.A) && this.B == i7g0Var.B && this.C == i7g0Var.C;
    }

    @Override // xsna.dm6
    public final int hashCode() {
        return s2r0.g(this.C ? 1 : 0, s2r0.g(this.B ? 1 : 0, s2r0.h(s2r0.h(s2r0.h(s2r0.h(s2r0.h(s2r0.h(s2r0.h(super.hashCode(), this.u), this.w), this.x), this.y), this.z), this.A), null)));
    }

    @NonNull
    @CheckResult
    public final i7g0<TranscodeType> u(@Nullable x7g0<TranscodeType> x7g0Var) {
        if (this.p) {
            return clone().u(x7g0Var);
        }
        if (x7g0Var != null) {
            if (this.y == null) {
                this.y = new ArrayList();
            }
            this.y.add(x7g0Var);
        }
        m();
        return this;
    }

    @Override // xsna.dm6
    @NonNull
    @CheckResult
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final i7g0<TranscodeType> a(@NonNull dm6<?> dm6Var) {
        nr2.q(dm6Var);
        return (i7g0) super.a(dm6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final f7g0 w(Object obj, u3o0<TranscodeType> u3o0Var, @Nullable x7g0<TranscodeType> x7g0Var, @Nullable RequestCoordinator requestCoordinator, anp0<?, ? super TranscodeType> anp0Var, Priority priority, int i, int i2, dm6<?> dm6Var, Executor executor) {
        RequestCoordinator requestCoordinator2;
        RequestCoordinator requestCoordinator3;
        dm6<?> dm6Var2;
        svj0 svj0Var;
        Priority priority2;
        if (this.A != null) {
            requestCoordinator3 = new com.bumptech.glide.request.a(obj, requestCoordinator);
            requestCoordinator2 = requestCoordinator3;
        } else {
            requestCoordinator2 = null;
            requestCoordinator3 = requestCoordinator;
        }
        i7g0<TranscodeType> i7g0Var = this.z;
        if (i7g0Var == null) {
            Context context = this.s;
            com.bumptech.glide.c cVar = this.v;
            Object obj2 = this.x;
            Class<TranscodeType> cls = this.u;
            ArrayList arrayList = this.y;
            klp klpVar = cVar.f;
            anp0Var.getClass();
            dm6Var2 = dm6Var;
            svj0Var = new svj0(context, cVar, obj, obj2, cls, dm6Var2, i, i2, priority, u3o0Var, x7g0Var, arrayList, requestCoordinator3, klpVar, executor);
        } else {
            if (this.D) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            anp0<?, ? super TranscodeType> anp0Var2 = i7g0Var.B ? anp0Var : i7g0Var.w;
            if (dm6.i(i7g0Var.b, 8)) {
                priority2 = this.z.d;
            } else {
                int i3 = a.b[priority.ordinal()];
                if (i3 == 1) {
                    priority2 = Priority.NORMAL;
                } else if (i3 == 2) {
                    priority2 = Priority.HIGH;
                } else {
                    if (i3 != 3 && i3 != 4) {
                        throw new IllegalArgumentException("unknown priority: " + this.d);
                    }
                    priority2 = Priority.IMMEDIATE;
                }
            }
            Priority priority3 = priority2;
            i7g0<TranscodeType> i7g0Var2 = this.z;
            int i4 = i7g0Var2.g;
            int i5 = i7g0Var2.f;
            if (s2r0.i(i, i2)) {
                i7g0<TranscodeType> i7g0Var3 = this.z;
                if (!s2r0.i(i7g0Var3.g, i7g0Var3.f)) {
                    i4 = dm6Var.g;
                    i5 = dm6Var.f;
                }
            }
            int i6 = i5;
            com.bumptech.glide.request.b bVar = new com.bumptech.glide.request.b(obj, requestCoordinator3);
            Context context2 = this.s;
            com.bumptech.glide.c cVar2 = this.v;
            com.bumptech.glide.request.b bVar2 = bVar;
            Object obj3 = this.x;
            Class<TranscodeType> cls2 = this.u;
            ArrayList arrayList2 = this.y;
            klp klpVar2 = cVar2.f;
            anp0Var.getClass();
            svj0 svj0Var2 = new svj0(context2, cVar2, obj, obj3, cls2, dm6Var, i, i2, priority, u3o0Var, x7g0Var, arrayList2, bVar2, klpVar2, executor);
            this.D = true;
            i7g0 i7g0Var4 = (i7g0<TranscodeType>) this.z;
            f7g0 w = i7g0Var4.w(obj, u3o0Var, x7g0Var, bVar2, anp0Var2, priority3, i4, i6, i7g0Var4, executor);
            this.D = false;
            bVar2.c = svj0Var2;
            bVar2.d = w;
            dm6Var2 = dm6Var;
            svj0Var = bVar2;
        }
        if (requestCoordinator2 == null) {
            return svj0Var;
        }
        i7g0<TranscodeType> i7g0Var5 = this.A;
        int i7 = i7g0Var5.g;
        int i8 = i7g0Var5.f;
        if (s2r0.i(i, i2)) {
            i7g0<TranscodeType> i7g0Var6 = this.A;
            if (!s2r0.i(i7g0Var6.g, i7g0Var6.f)) {
                i7 = dm6Var2.g;
                i8 = dm6Var2.f;
            }
        }
        int i9 = i8;
        i7g0 i7g0Var7 = (i7g0<TranscodeType>) this.A;
        com.bumptech.glide.request.a aVar = requestCoordinator2;
        f7g0 w2 = i7g0Var7.w(obj, u3o0Var, x7g0Var, aVar, i7g0Var7.w, i7g0Var7.d, i7, i9, i7g0Var7, executor);
        aVar.c = svj0Var;
        aVar.d = w2;
        return aVar;
    }

    @Override // xsna.dm6
    @CheckResult
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final i7g0<TranscodeType> clone() {
        i7g0<TranscodeType> i7g0Var = (i7g0) super.clone();
        i7g0Var.w = (anp0<?, ? super TranscodeType>) i7g0Var.w.clone();
        if (i7g0Var.y != null) {
            i7g0Var.y = new ArrayList(i7g0Var.y);
        }
        i7g0<TranscodeType> i7g0Var2 = i7g0Var.z;
        if (i7g0Var2 != null) {
            i7g0Var.z = i7g0Var2.clone();
        }
        i7g0<TranscodeType> i7g0Var3 = i7g0Var.A;
        if (i7g0Var3 != null) {
            i7g0Var.A = i7g0Var3.clone();
        }
        return i7g0Var;
    }

    @NonNull
    public final void y(@NonNull u3o0 u3o0Var, @Nullable s7g0 s7g0Var, Executor executor) {
        nr2.q(u3o0Var);
        if (!this.C) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        f7g0 w = w(new Object(), u3o0Var, s7g0Var, null, this.w, this.d, this.g, this.f, this, executor);
        f7g0 b = u3o0Var.b();
        if (w.e(b) && (this.e || !b.a())) {
            nr2.r(b, "Argument must not be null");
            if (b.isRunning()) {
                return;
            }
            b.i();
            return;
        }
        this.t.c(u3o0Var);
        u3o0Var.h(w);
        y7g0 y7g0Var = this.t;
        synchronized (y7g0Var) {
            y7g0Var.g.b.add(u3o0Var);
            n8g0 n8g0Var = y7g0Var.e;
            n8g0Var.a.add(w);
            if (n8g0Var.c) {
                w.clear();
                n8g0Var.b.add(w);
            } else {
                w.i();
            }
        }
    }

    @NonNull
    public final i7g0<TranscodeType> z(@Nullable Object obj) {
        if (this.p) {
            return clone().z(obj);
        }
        this.x = obj;
        this.C = true;
        m();
        return this;
    }
}
