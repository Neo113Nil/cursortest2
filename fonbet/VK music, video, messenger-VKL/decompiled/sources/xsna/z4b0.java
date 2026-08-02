package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PlayerSwipeGesture.kt */
/* loaded from: classes3.dex */
public final class z4b0 {
    public final b a;
    public final List<a> b;
    public final FunctionReferenceImpl c;
    public final gzs<s3q0> d;

    /* compiled from: PlayerSwipeGesture.kt */
    public static abstract class a {
        public final float a;

        /* compiled from: PlayerSwipeGesture.kt */
        /* renamed from: xsna.z4b0$a$a, reason: collision with other inner class name */
        public static final class C4154a extends a {
            public final float b;
            public final c c;
            public final float d;

            public C4154a(float f, c cVar, float f2) {
                super(f);
                this.b = f;
                this.c = cVar;
                this.d = f2;
            }

            @Override // xsna.z4b0.a
            public final float a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C4154a)) {
                    return false;
                }
                C4154a c4154a = (C4154a) obj;
                return Float.compare(this.b, c4154a.b) == 0 && epx.f(this.c, c4154a.c) && Float.compare(this.d, c4154a.d) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(this.d) + ((this.c.hashCode() + (Float.hashCode(this.b) * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Scale(gestureLength=");
                sb.append(this.b);
                sb.append(", scalePivot=");
                sb.append(this.c);
                sb.append(", scaleFactor=");
                return xq.c(')', this.d, sb);
            }
        }

        /* compiled from: PlayerSwipeGesture.kt */
        public static final class b extends a {
            public b() {
                super(0.33f);
            }

            @Override // xsna.z4b0.a
            public final float a() {
                return 0.33f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                ((b) obj).getClass();
                return Float.compare(0.33f, 0.33f) == 0 && Float.compare(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0 && Float.compare(0.25f, 0.25f) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(0.25f) + io.reactivex.rxjava3.subjects.b.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.hashCode(0.33f) * 31, 31);
            }

            public final String toString() {
                return "Translation(gestureLength=0.33, translationPercentsX=0.0, translationPercentsY=0.25)";
            }
        }

        public a(float f) {
            this.a = f;
        }

        public float a() {
            return this.a;
        }
    }

    /* compiled from: PlayerSwipeGesture.kt */
    public interface b {

        /* compiled from: PlayerSwipeGesture.kt */
        public static final class a implements b {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -107830266;
            }

            public final String toString() {
                return "Down";
            }
        }

        /* compiled from: PlayerSwipeGesture.kt */
        /* renamed from: xsna.z4b0$b$b, reason: collision with other inner class name */
        public static final class C4155b implements b {
            public static final C4155b a = new C4155b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C4155b);
            }

            public final int hashCode() {
                return -107602069;
            }

            public final String toString() {
                return "Left";
            }
        }

        /* compiled from: PlayerSwipeGesture.kt */
        public static final class c implements b {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 964964152;
            }

            public final String toString() {
                return "Right";
            }
        }

        /* compiled from: PlayerSwipeGesture.kt */
        public static final class d implements b {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 2051282687;
            }

            public final String toString() {
                return "Up";
            }
        }
    }

    /* compiled from: PlayerSwipeGesture.kt */
    public interface c {

        /* compiled from: PlayerSwipeGesture.kt */
        public static final class a implements c {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -826944361;
            }

            public final String toString() {
                return "Center";
            }
        }

        /* compiled from: PlayerSwipeGesture.kt */
        public static final class b implements c {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -2033824350;
            }

            public final String toString() {
                return "CenterBottom";
            }
        }
    }

    public z4b0() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z4b0(b bVar, List list, gzs gzsVar, gzs gzsVar2) {
        this.a = bVar;
        this.b = list;
        this.c = (FunctionReferenceImpl) gzsVar;
        this.d = gzsVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4b0)) {
            return false;
        }
        z4b0 z4b0Var = (z4b0) obj;
        return epx.f(this.a, z4b0Var.a) && epx.f(this.b, z4b0Var.b) && epx.f(this.c, z4b0Var.c) && epx.f(this.d, z4b0Var.d);
    }

    public final int hashCode() {
        return sf3.a((this.c.hashCode() + fw3.a(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        return "PlayerSwipeGesture(direction=" + this.a + ", gestureAnimations=" + this.b + ", isEnabled=" + this.c + ", onGestureDone=" + this.d + ", gestureLength=null)";
    }
}
