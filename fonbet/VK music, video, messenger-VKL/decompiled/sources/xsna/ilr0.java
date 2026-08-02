package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ImageVector.kt */
/* loaded from: classes11.dex */
public final class ilr0 extends klr0 implements Iterable<klr0>, gcy {
    public final String b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final List<qq90> j;
    public final List<klr0> k;

    /* compiled from: ImageVector.kt */
    public static final class a implements Iterator<klr0>, gcy {
        public final Iterator<klr0> b;

        public a(ilr0 ilr0Var) {
            this.b = ilr0Var.k.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b.hasNext();
        }

        @Override // java.util.Iterator
        public final klr0 next() {
            return this.b.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ilr0(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends qq90> list, List<? extends klr0> list2) {
        this.b = str;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
        this.i = f7;
        this.j = list;
        this.k = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof ilr0)) {
            ilr0 ilr0Var = (ilr0) obj;
            return epx.f(this.b, ilr0Var.b) && this.c == ilr0Var.c && this.d == ilr0Var.d && this.e == ilr0Var.e && this.f == ilr0Var.f && this.g == ilr0Var.g && this.h == ilr0Var.h && this.i == ilr0Var.i && epx.f(this.j, ilr0Var.j) && epx.f(this.k, ilr0Var.k);
        }
        return false;
    }

    public final int hashCode() {
        return this.k.hashCode() + fw3.a(io.reactivex.rxjava3.subjects.b.a(this.i, io.reactivex.rxjava3.subjects.b.a(this.h, io.reactivex.rxjava3.subjects.b.a(this.g, io.reactivex.rxjava3.subjects.b.a(this.f, io.reactivex.rxjava3.subjects.b.a(this.e, io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, this.b.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.j);
    }

    @Override // java.lang.Iterable
    public final Iterator<klr0> iterator() {
        return new a(this);
    }

    public ilr0() {
        this("", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jlr0.a, EmptyList.b);
    }
}
