package xsna;

import android.graphics.PointF;
import android.graphics.Rect;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: VkScaleType.kt */
/* loaded from: classes.dex */
public abstract class qhv0 {

    /* compiled from: VkScaleType.kt */
    public static final class a extends m {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -182325055;
        }

        public final String toString() {
            return "Center";
        }
    }

    /* compiled from: VkScaleType.kt */
    public static final class b extends m {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1117137167;
        }

        public final String toString() {
            return "CenterCrop";
        }
    }

    /* compiled from: VkScaleType.kt */
    public static final class c extends m {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 341202973;
        }

        public final String toString() {
            return "CenterInside";
        }
    }

    /* compiled from: VkScaleType.kt */
    /* loaded from: classes17.dex */
    public static final class d extends m {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 553217170;
        }

        public final String toString() {
            return "FitBottomStart";
        }
    }

    /* compiled from: VkScaleType.kt */
    public static final class e extends m {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1630951462;
        }

        public final String toString() {
            return "FitCenter";
        }
    }

    /* compiled from: VkScaleType.kt */
    public static final class f extends m {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -92609674;
        }

        public final String toString() {
            return "FitEnd";
        }
    }

    /* compiled from: VkScaleType.kt */
    public static final class g extends m {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1209525309;
        }

        public final String toString() {
            return "FitStart";
        }
    }

    /* compiled from: VkScaleType.kt */
    public static final class h extends m {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -759872045;
        }

        public final String toString() {
            return "FitX";
        }
    }

    /* compiled from: VkScaleType.kt */
    public static final class i extends m {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -2081196826;
        }

        public final String toString() {
            return "FitXY";
        }
    }

    /* compiled from: VkScaleType.kt */
    public static final class j extends m {
        public static final j a = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -759872044;
        }

        public final String toString() {
            return "FitY";
        }
    }

    /* compiled from: VkScaleType.kt */
    /* loaded from: classes17.dex */
    public static final class k extends m {
        public static final k a = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -523580516;
        }

        public final String toString() {
            return "FocusCrop";
        }
    }

    /* compiled from: VkScaleType.kt */
    /* loaded from: classes17.dex */
    public static final class l extends qhv0 {
        public final qhv0 a;
        public final qhv0 b;
        public final Rect c;
        public final Rect d;
        public final PointF e;
        public final PointF f;
        public float g;

        public l(qhv0 qhv0Var, qhv0 qhv0Var2, Rect rect, Rect rect2, PointF pointF, PointF pointF2, int i) {
            pointF = (i & 16) != 0 ? null : pointF;
            pointF2 = (i & 32) != 0 ? null : pointF2;
            this.a = qhv0Var;
            this.b = qhv0Var2;
            this.c = rect;
            this.d = rect2;
            this.e = pointF;
            this.f = pointF2;
            this.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        public final Rect a() {
            return this.c;
        }

        public final Rect b() {
            return this.d;
        }

        public final PointF c() {
            return this.e;
        }

        public final PointF d() {
            return this.f;
        }

        public final qhv0 e() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return epx.f(this.a, lVar.a) && epx.f(this.b, lVar.b) && epx.f(this.c, lVar.c) && epx.f(this.d, lVar.d) && epx.f(this.e, lVar.e) && epx.f(this.f, lVar.f) && Float.compare(this.g, lVar.g) == 0;
        }

        public final float f() {
            return this.g;
        }

        public final qhv0 g() {
            return this.b;
        }

        public final void h(float f) {
            this.g = f;
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            Rect rect = this.c;
            int hashCode2 = (hashCode + (rect == null ? 0 : rect.hashCode())) * 31;
            Rect rect2 = this.d;
            int hashCode3 = (hashCode2 + (rect2 == null ? 0 : rect2.hashCode())) * 31;
            PointF pointF = this.e;
            int hashCode4 = (hashCode3 + (pointF == null ? 0 : pointF.hashCode())) * 31;
            PointF pointF2 = this.f;
            return Float.hashCode(this.g) + ((hashCode4 + (pointF2 != null ? pointF2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Interpolating(from=");
            sb.append(this.a);
            sb.append(", to=");
            sb.append(this.b);
            sb.append(", boundsFrom=");
            sb.append(this.c);
            sb.append(", boundsTo=");
            sb.append(this.d);
            sb.append(", focusPointFrom=");
            sb.append(this.e);
            sb.append(", focusPointTo=");
            sb.append(this.f);
            sb.append(", interpolatingValue=");
            return xq.c(')', this.g, sb);
        }
    }

    /* compiled from: VkScaleType.kt */
    public static abstract class m extends qhv0 {
    }
}
