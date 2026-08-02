package xsna;

import android.annotation.SuppressLint;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.AsyncUpdates;
import com.mbridge.msdk.foundation.download.Command;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseKeyframeAnimation.java */
/* loaded from: classes12.dex */
public abstract class tf6<K, A> {
    public final c<K> c;

    @Nullable
    public a900<A> e;
    public final ArrayList a = new ArrayList(1);
    public boolean b = false;
    public float d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    @Nullable
    public A f = null;
    public float g = -1.0f;
    public float h = -1.0f;

    /* compiled from: BaseKeyframeAnimation.java */
    public interface a {
        void i();
    }

    /* compiled from: BaseKeyframeAnimation.java */
    public static final class b<T> implements c<T> {
        @Override // xsna.tf6.c
        public final boolean a(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // xsna.tf6.c
        public final boolean b(float f) {
            return false;
        }

        @Override // xsna.tf6.c
        public final nhy<T> c() {
            throw new IllegalStateException("not implemented");
        }

        @Override // xsna.tf6.c
        public final float d() {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        @Override // xsna.tf6.c
        public final float e() {
            return 1.0f;
        }

        @Override // xsna.tf6.c
        public final boolean isEmpty() {
            return true;
        }
    }

    /* compiled from: BaseKeyframeAnimation.java */
    public interface c<T> {
        boolean a(float f);

        boolean b(float f);

        nhy<T> c();

        float d();

        float e();

        boolean isEmpty();
    }

    /* compiled from: BaseKeyframeAnimation.java */
    public static final class d<T> implements c<T> {
        public final List<? extends nhy<T>> a;
        public nhy<T> c = null;
        public float d = -1.0f;

        @NonNull
        public nhy<T> b = f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

        public d(List<? extends nhy<T>> list) {
            this.a = list;
        }

        @Override // xsna.tf6.c
        public final boolean a(float f) {
            nhy<T> nhyVar = this.c;
            nhy<T> nhyVar2 = this.b;
            if (nhyVar == nhyVar2 && this.d == f) {
                return true;
            }
            this.c = nhyVar2;
            this.d = f;
            return false;
        }

        @Override // xsna.tf6.c
        public final boolean b(float f) {
            nhy<T> nhyVar = this.b;
            if (f >= nhyVar.b() && f < nhyVar.a()) {
                return !this.b.c();
            }
            this.b = f(f);
            return true;
        }

        @Override // xsna.tf6.c
        @NonNull
        public final nhy<T> c() {
            return this.b;
        }

        @Override // xsna.tf6.c
        public final float d() {
            return this.a.get(0).b();
        }

        @Override // xsna.tf6.c
        public final float e() {
            return ((nhy) ji.a(1, this.a)).a();
        }

        public final nhy<T> f(float f) {
            List<? extends nhy<T>> list = this.a;
            nhy<T> nhyVar = (nhy) ji.a(1, list);
            if (f >= nhyVar.b()) {
                return nhyVar;
            }
            for (int size = list.size() - 2; size >= 1; size--) {
                nhy<T> nhyVar2 = list.get(size);
                if (this.b != nhyVar2 && f >= nhyVar2.b() && f < nhyVar2.a()) {
                    return nhyVar2;
                }
            }
            return list.get(0);
        }

        @Override // xsna.tf6.c
        public final boolean isEmpty() {
            return false;
        }
    }

    /* compiled from: BaseKeyframeAnimation.java */
    public static final class e<T> implements c<T> {

        @NonNull
        public final nhy<T> a;
        public float b = -1.0f;

        public e(List<? extends nhy<T>> list) {
            this.a = list.get(0);
        }

        @Override // xsna.tf6.c
        public final boolean a(float f) {
            if (this.b == f) {
                return true;
            }
            this.b = f;
            return false;
        }

        @Override // xsna.tf6.c
        public final boolean b(float f) {
            return !this.a.c();
        }

        @Override // xsna.tf6.c
        public final nhy<T> c() {
            return this.a;
        }

        @Override // xsna.tf6.c
        public final float d() {
            return this.a.b();
        }

        @Override // xsna.tf6.c
        public final float e() {
            return this.a.a();
        }

        @Override // xsna.tf6.c
        public final boolean isEmpty() {
            return false;
        }
    }

    public tf6(List<? extends nhy<K>> list) {
        c eVar;
        if (list.isEmpty()) {
            eVar = new b();
        } else {
            eVar = list.size() == 1 ? new e(list) : new d(list);
        }
        this.c = eVar;
    }

    public final void a(a aVar) {
        this.a.add(aVar);
    }

    public final nhy<K> b() {
        AsyncUpdates asyncUpdates = tky.a;
        return this.c.c();
    }

    @SuppressLint({Command.HTTP_HEADER_RANGE})
    public float c() {
        if (this.h == -1.0f) {
            this.h = this.c.e();
        }
        return this.h;
    }

    public final float d() {
        Interpolator interpolator;
        nhy<K> b2 = b();
        return (b2 == null || b2.c() || (interpolator = b2.d) == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : interpolator.getInterpolation(e());
    }

    public final float e() {
        if (this.b) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        nhy<K> b2 = b();
        return b2.c() ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (this.d - b2.b()) / (b2.a() - b2.b());
    }

    public A f() {
        float e2 = e();
        if (this.e == null && this.c.a(e2) && !l()) {
            return this.f;
        }
        nhy<K> b2 = b();
        Interpolator interpolator = b2.e;
        Interpolator interpolator2 = b2.f;
        A g = (interpolator == null || interpolator2 == null) ? g(b2, d()) : h(b2, e2, interpolator.getInterpolation(e2), interpolator2.getInterpolation(e2));
        this.f = g;
        return g;
    }

    public abstract A g(nhy<K> nhyVar, float f);

    public A h(nhy<K> nhyVar, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void i() {
        AsyncUpdates asyncUpdates = tky.a;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                AsyncUpdates asyncUpdates2 = tky.a;
                return;
            } else {
                ((a) arrayList.get(i)).i();
                i++;
            }
        }
    }

    public void j(float f) {
        AsyncUpdates asyncUpdates = tky.a;
        c<K> cVar = this.c;
        if (cVar.isEmpty()) {
            return;
        }
        if (this.g == -1.0f) {
            this.g = cVar.d();
        }
        float f2 = this.g;
        if (f < f2) {
            if (f2 == -1.0f) {
                this.g = cVar.d();
            }
            f = this.g;
        } else if (f > c()) {
            f = c();
        }
        if (f == this.d) {
            return;
        }
        this.d = f;
        if (cVar.b(f)) {
            i();
        }
    }

    public final void k(@Nullable a900<A> a900Var) {
        a900<A> a900Var2 = this.e;
        if (a900Var2 != null) {
            a900Var2.getClass();
        }
        this.e = a900Var;
    }

    public boolean l() {
        return false;
    }
}
