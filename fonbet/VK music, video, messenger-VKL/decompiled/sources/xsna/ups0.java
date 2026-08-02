package xsna;

/* compiled from: VideoHolderState.kt */
/* loaded from: classes7.dex */
public final class ups0 implements lm50 {
    public final Integer b;
    public final xjz c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final Integer g;
    public final String h;
    public final Integer i;

    public ups0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ups0)) {
            return false;
        }
        ups0 ups0Var = (ups0) obj;
        return epx.f(this.b, ups0Var.b) && epx.f(this.c, ups0Var.c) && this.d == ups0Var.d && this.e == ups0Var.e && this.f == ups0Var.f && epx.f(this.g, ups0Var.g) && epx.f(this.h, ups0Var.h) && epx.f(this.i, ups0Var.i);
    }

    public final int hashCode() {
        Integer num = this.b;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        xjz xjzVar = this.c;
        int b = qoy.b(qoy.b(qoy.b((hashCode + (xjzVar == null ? 0 : xjzVar.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        Integer num2 = this.g;
        int hashCode2 = (b + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.h;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.i;
        return hashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoHolderState(videoId=");
        sb.append(this.b);
        sb.append(", liveNotificationButton=");
        sb.append(this.c);
        sb.append(", isLiveUpcomingViewVisible=");
        sb.append(this.d);
        sb.append(", isLiveUpcomingFeatureEnabled=");
        sb.append(this.e);
        sb.append(", isLiveRunningViewVisible=");
        sb.append(this.f);
        sb.append(", liveBackgroundRes=");
        sb.append(this.g);
        sb.append(", upcomingText=");
        sb.append(this.h);
        sb.append(", progressDuration=");
        return uqi.b(sb, this.i, ')');
    }

    public /* synthetic */ ups0(int i) {
        this(null, null, false, false, false, null, null, null);
    }

    public ups0(Integer num, xjz xjzVar, boolean z, boolean z2, boolean z3, Integer num2, String str, Integer num3) {
        this.b = num;
        this.c = xjzVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = num2;
        this.h = str;
        this.i = num3;
    }
}
