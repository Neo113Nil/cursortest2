package xsna;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import xsna.hp2;
import xsna.woo;

/* compiled from: DynamicAnimation.java */
/* loaded from: classes12.dex */
public abstract class woo<T extends woo<T>> implements hp2.b {
    public static final c m = new c();
    public static final d n = new d();
    public static final e o = new e();
    public static final f p = new f();
    public static final g q = new g();
    public static final h r = new h();
    public static final i s = new i();
    public static final a t = new a();
    public float a;
    public float b;
    public boolean c;
    public final Object d;
    public final be e;
    public boolean f;
    public float g;
    public float h;
    public long i;
    public float j;
    public final ArrayList<k> k;
    public final ArrayList<l> l;

    /* compiled from: DynamicAnimation.java */
    public static class a extends m {
        @Override // xsna.be
        public final float R(Object obj) {
            return ((View) obj).getAlpha();
        }

        @Override // xsna.be
        public final void Z(Object obj, float f) {
            ((View) obj).setAlpha(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    public class b extends be {
        public final /* synthetic */ qqr b;

        public b(qqr qqrVar) {
            this.b = qqrVar;
        }

        @Override // xsna.be
        public final float R(Object obj) {
            return this.b.a;
        }

        @Override // xsna.be
        public final void Z(Object obj, float f) {
            this.b.a = f;
        }
    }

    /* compiled from: DynamicAnimation.java */
    public static class c extends m {
        @Override // xsna.be
        public final float R(Object obj) {
            return ((View) obj).getTranslationX();
        }

        @Override // xsna.be
        public final void Z(Object obj, float f) {
            ((View) obj).setTranslationX(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    public static class d extends m {
        @Override // xsna.be
        public final float R(Object obj) {
            return ((View) obj).getTranslationY();
        }

        @Override // xsna.be
        public final void Z(Object obj, float f) {
            ((View) obj).setTranslationY(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    public static class e extends m {
        @Override // xsna.be
        public final float R(Object obj) {
            return ((View) obj).getScaleX();
        }

        @Override // xsna.be
        public final void Z(Object obj, float f) {
            ((View) obj).setScaleX(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    public static class f extends m {
        @Override // xsna.be
        public final float R(Object obj) {
            return ((View) obj).getScaleY();
        }

        @Override // xsna.be
        public final void Z(Object obj, float f) {
            ((View) obj).setScaleY(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    public static class g extends m {
        @Override // xsna.be
        public final float R(Object obj) {
            return ((View) obj).getRotation();
        }

        @Override // xsna.be
        public final void Z(Object obj, float f) {
            ((View) obj).setRotation(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    public static class h extends m {
        @Override // xsna.be
        public final float R(Object obj) {
            return ((View) obj).getRotationX();
        }

        @Override // xsna.be
        public final void Z(Object obj, float f) {
            ((View) obj).setRotationX(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    public static class i extends m {
        @Override // xsna.be
        public final float R(Object obj) {
            return ((View) obj).getRotationY();
        }

        @Override // xsna.be
        public final void Z(Object obj, float f) {
            ((View) obj).setRotationY(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    public static class j {
        public float a;
        public float b;
    }

    /* compiled from: DynamicAnimation.java */
    public interface k {
        void a(woo wooVar, boolean z, float f, float f2);
    }

    /* compiled from: DynamicAnimation.java */
    public interface l {
        void f(float f);
    }

    /* compiled from: DynamicAnimation.java */
    public static abstract class m extends be {
    }

    public woo(qqr qqrVar) {
        this.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList<>();
        this.l = new ArrayList<>();
        this.d = null;
        this.e = new b(qqrVar);
        this.j = 1.0f;
    }

    @Override // xsna.hp2.b
    public final boolean a(long j2) {
        long j3 = this.i;
        if (j3 == 0) {
            this.i = j2;
            f(this.b);
            return false;
        }
        this.i = j2;
        boolean i2 = i(j2 - j3);
        float min = Math.min(this.b, this.g);
        this.b = min;
        float max = Math.max(min, this.h);
        this.b = max;
        f(max);
        if (i2) {
            e(false);
        }
        return i2;
    }

    public final void b(k kVar) {
        ArrayList<k> arrayList = this.k;
        if (arrayList.contains(kVar)) {
            return;
        }
        arrayList.add(kVar);
    }

    public final void c(l lVar) {
        if (this.f) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        ArrayList<l> arrayList = this.l;
        if (arrayList.contains(lVar)) {
            return;
        }
        arrayList.add(lVar);
    }

    public final void d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.f) {
            e(true);
        }
    }

    public final void e(boolean z) {
        ArrayList<k> arrayList;
        int i2 = 0;
        this.f = false;
        ThreadLocal<hp2> threadLocal = hp2.f;
        if (threadLocal.get() == null) {
            threadLocal.set(new hp2());
        }
        hp2 hp2Var = threadLocal.get();
        hp2Var.a.remove(this);
        ArrayList<hp2.b> arrayList2 = hp2Var.b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            hp2Var.e = true;
        }
        this.i = 0L;
        this.c = false;
        while (true) {
            arrayList = this.k;
            if (i2 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i2) != null) {
                arrayList.get(i2).a(this, z, this.b, this.a);
            }
            i2++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void f(float f2) {
        ArrayList<l> arrayList;
        this.e.Z(this.d, f2);
        int i2 = 0;
        while (true) {
            arrayList = this.l;
            if (i2 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i2) != null) {
                arrayList.get(i2).f(this.b);
            }
            i2++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void g(float f2) {
        this.a = f2;
    }

    public void h() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z = this.f;
        if (z || z) {
            return;
        }
        this.f = true;
        if (!this.c) {
            this.b = this.e.R(this.d);
        }
        float f2 = this.b;
        if (f2 > this.g || f2 < this.h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        ThreadLocal<hp2> threadLocal = hp2.f;
        if (threadLocal.get() == null) {
            threadLocal.set(new hp2());
        }
        hp2 hp2Var = threadLocal.get();
        ArrayList<hp2.b> arrayList = hp2Var.b;
        if (arrayList.size() == 0) {
            if (hp2Var.d == null) {
                hp2Var.d = new hp2.d(hp2Var.c);
            }
            hp2.d dVar = hp2Var.d;
            dVar.b.postFrameCallback(dVar.c);
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public abstract boolean i(long j2);

    public <K> woo(K k2, be beVar) {
        this.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList<>();
        this.l = new ArrayList<>();
        this.d = k2;
        this.e = beVar;
        if (beVar != q && beVar != r && beVar != s) {
            if (beVar == t) {
                this.j = 0.00390625f;
                return;
            } else if (beVar != o && beVar != p) {
                this.j = 1.0f;
                return;
            } else {
                this.j = 0.00390625f;
                return;
            }
        }
        this.j = 0.1f;
    }
}
