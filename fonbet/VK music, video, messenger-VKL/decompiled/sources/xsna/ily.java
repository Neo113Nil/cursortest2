package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: LabelState.kt */
/* loaded from: classes16.dex */
public final class ily {
    public final boolean a;
    public final String b;
    public final a c;

    /* compiled from: LabelState.kt */
    public static final class a {
        public final float a;
        public final float b;

        public a(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            aVar.getClass();
            return Float.compare(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0 && Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + io.reactivex.rxjava3.subjects.b.a(this.a, io.reactivex.rxjava3.subjects.b.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Integer.hashCode(R.color.vk_black_alpha24) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TextShadow(colorRes=2131101166, dx=0.0, dy=");
            sb.append(this.a);
            sb.append(", radius=");
            return xq.c(')', this.b, sb);
        }
    }

    public ily() {
        this(7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ily)) {
            return false;
        }
        ily ilyVar = (ily) obj;
        return this.a == ilyVar.a && epx.f(this.b, ilyVar.b) && epx.f(this.c, ilyVar.c);
    }

    public final int hashCode() {
        int a2 = urd0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
        a aVar = this.c;
        return a2 + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "LabelState(isEnabled=" + this.a + ", text=" + this.b + ", textShadow=" + this.c + ')';
    }

    public ily(boolean z, String str, a aVar) {
        this.a = z;
        this.b = str;
        this.c = aVar;
    }

    public /* synthetic */ ily(int i) {
        this((i & 1) != 0, "", null);
    }
}
