package xsna;

import com.vkontakte.android.R;
import java.util.List;

/* compiled from: PhotoStickerViewStateMapper.kt */
/* loaded from: classes15.dex */
public final class mba0 {
    public final boolean a;
    public final float b;
    public final int c;
    public final String d;
    public final boolean e;
    public final String f;
    public final List<u75> g;
    public final a h;

    /* compiled from: PhotoStickerViewStateMapper.kt */
    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AccessibilityState(contentTextRes=");
            sb.append(this.a);
            sb.append(", styleTextRes=");
            return vu5.b(sb, this.b, ')');
        }
    }

    public mba0(boolean z, float f, int i, String str, boolean z2, String str2, List list, a aVar) {
        this.a = z;
        this.b = f;
        this.c = i;
        this.d = str;
        this.e = z2;
        this.f = str2;
        this.g = list;
        this.h = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mba0)) {
            return false;
        }
        mba0 mba0Var = (mba0) obj;
        return this.a == mba0Var.a && Float.compare(this.b, mba0Var.b) == 0 && this.c == mba0Var.c && epx.f(this.d, mba0Var.d) && this.e == mba0Var.e && epx.f(this.f, mba0Var.f) && this.g.equals(mba0Var.g) && this.h.equals(mba0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + fw3.a(urd0.a(qoy.b(urd0.a(shy.a(this.c, shy.a(R.drawable.vk_icon_arrow_uturn_right_12, io.reactivex.rxjava3.subjects.b.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        return "PhotoStickerViewState(isFullscreen=" + this.a + ", ratio=" + this.b + ", iconResId=2131236360, prefixResId=" + this.c + ", currentAccountName=" + this.d + ", isAuthorVisible=" + this.e + ", url=" + this.f + ", authors=" + this.g + ", accessibilityState=" + this.h + ')';
    }
}
