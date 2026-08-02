package xsna;

import com.vk.dto.common.ImageSize;

/* compiled from: StoryViewTooltipParams.kt */
/* loaded from: classes17.dex */
public final class ymm0 {
    public final String a;
    public final String b;
    public final float c;
    public final float d;
    public final ImageSize e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final Integer j;
    public final boolean k;
    public final boolean l;

    public ymm0(String str, String str2, float f, float f2, ImageSize imageSize, int i, boolean z, boolean z2, boolean z3, Integer num, boolean z4, boolean z5) {
        this.a = str;
        this.b = str2;
        this.c = f;
        this.d = f2;
        this.e = imageSize;
        this.f = i;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = num;
        this.k = z4;
        this.l = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ymm0)) {
            return false;
        }
        ymm0 ymm0Var = (ymm0) obj;
        return epx.f(this.a, ymm0Var.a) && epx.f(this.b, ymm0Var.b) && Float.compare(this.c, ymm0Var.c) == 0 && Float.compare(this.d, ymm0Var.d) == 0 && epx.f(this.e, ymm0Var.e) && this.f == ymm0Var.f && this.g == ymm0Var.g && this.h == ymm0Var.h && this.i == ymm0Var.i && epx.f(this.j, ymm0Var.j) && this.k == ymm0Var.k && this.l == ymm0Var.l;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int a = io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        ImageSize imageSize = this.e;
        int b = qoy.b(qoy.b(qoy.b(qoy.b(shy.a(0, shy.a(this.f, (a + (imageSize == null ? 0 : imageSize.hashCode())) * 31, 31), 31), 31, false), 31, this.g), 31, this.h), 31, this.i);
        Integer num = this.j;
        return Boolean.hashCode(this.l) + qoy.b((b + (num != null ? num.hashCode() : 0)) * 961, 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryViewTooltipParams(text=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", x=");
        sb.append(this.c);
        sb.append(", y=");
        sb.append(this.d);
        sb.append(", imageIcon=");
        sb.append(this.e);
        sb.append(", tooltipType=");
        sb.append(this.f);
        sb.append(", edges=0, noPaused=false, withArrow=");
        sb.append(this.g);
        sb.append(", boldFont=");
        sb.append(this.h);
        sb.append(", isRestricted=");
        sb.append(this.i);
        sb.append(", gravity=");
        sb.append(this.j);
        sb.append(", fullscreen=null, isRedesignedMarketSticker=");
        sb.append(this.k);
        sb.append(", isAdult=");
        return defpackage.q0.a(sb, this.l, ')');
    }
}
