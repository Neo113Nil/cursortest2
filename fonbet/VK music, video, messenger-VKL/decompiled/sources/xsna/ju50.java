package xsna;

import android.graphics.RectF;

/* compiled from: NarrativeCoverInput.kt */
/* loaded from: classes18.dex */
public final class ju50 {
    public final RectF a;
    public final Integer b;
    public final Integer c;

    public ju50(RectF rectF, Integer num, Integer num2) {
        this.a = rectF;
        this.b = num;
        this.c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ju50)) {
            return false;
        }
        ju50 ju50Var = (ju50) obj;
        return epx.f(this.a, ju50Var.a) && epx.f(this.b, ju50Var.b) && epx.f(this.c, ju50Var.c);
    }

    public final int hashCode() {
        RectF rectF = this.a;
        int hashCode = (rectF == null ? 0 : rectF.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NarrativeCoverInput(cropRect=");
        sb.append(this.a);
        sb.append(", coverStoryId=");
        sb.append(this.b);
        sb.append(", customCoverPhotoId=");
        return uqi.b(sb, this.c, ')');
    }
}
