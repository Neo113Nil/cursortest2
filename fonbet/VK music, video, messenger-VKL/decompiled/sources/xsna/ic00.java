package xsna;

import android.graphics.RectF;
import com.vk.editor.timeline.api.YIndexShift;
import com.vk.editor.timeline.state.magnet.MagnetType;

/* compiled from: MagnetInfo.kt */
/* loaded from: classes18.dex */
public final class ic00 {
    public final String a;
    public final MagnetType b;
    public final RectF c;
    public final int d;
    public final YIndexShift e;
    public final long f;

    /* compiled from: MagnetInfo.kt */
    public static final class a {
        public final YIndexShift a;
        public final long b;
        public final float c;
        public final float d;

        public a(YIndexShift yIndexShift, long j, float f, float f2) {
            this.a = yIndexShift;
            this.b = j;
            this.c = f;
            this.d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && Float.compare(this.c, aVar.c) == 0 && Float.compare(this.d, aVar.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.c, bh10.a(this.a.hashCode() * 31, 31, this.b), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MoveTo(yIndexShift=");
            sb.append(this.a);
            sb.append(", offsetMs=");
            sb.append(this.b);
            sb.append(", leftItemsBorder=");
            sb.append(this.c);
            sb.append(", rightItemsBorder=");
            return xq.c(')', this.d, sb);
        }
    }

    public ic00(String str, MagnetType magnetType, RectF rectF, int i, YIndexShift yIndexShift, long j) {
        this.a = str;
        this.b = magnetType;
        this.c = rectF;
        this.d = i;
        this.e = yIndexShift;
        this.f = j;
    }

    public final a a() {
        YIndexShift yIndexShift = this.e;
        YIndexShift.Mode mode = yIndexShift.b;
        YIndexShift.Mode mode2 = YIndexShift.Mode.REPLACE;
        RectF rectF = this.c;
        if (mode == mode2) {
            return new a(yIndexShift, this.f, rectF.left, rectF.right);
        }
        int i = yIndexShift.a;
        return new a(new YIndexShift(i + (this.d > i ? 1 : 0), mode), this.f, rectF.left, rectF.right);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic00)) {
            return false;
        }
        ic00 ic00Var = (ic00) obj;
        return epx.f(this.a, ic00Var.a) && this.b == ic00Var.b && epx.f(this.c, ic00Var.c) && this.d == ic00Var.d && epx.f(this.e, ic00Var.e) && this.f == ic00Var.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + ((this.e.hashCode() + shy.a(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MagnetInfo(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", projection=");
        sb.append(this.c);
        sb.append(", currentIndexY=");
        sb.append(this.d);
        sb.append(", yIndexShift=");
        sb.append(this.e);
        sb.append(", newOffsetMs=");
        return vu5.a(')', this.f, sb);
    }
}
