package xsna;

/* compiled from: DonutBannerUiModel.kt */
/* loaded from: classes5.dex */
public final class twm0 implements syn {
    public final String a;
    public final com.vk.donut.design.compose.banner.c b;
    public final ws9 c;

    public twm0(String str, com.vk.donut.design.compose.banner.c cVar, ws9 ws9Var) {
        this.a = str;
        this.b = cVar;
        this.c = ws9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twm0)) {
            return false;
        }
        twm0 twm0Var = (twm0) obj;
        return epx.f(this.a, twm0Var.a) && epx.f(this.b, twm0Var.b) && epx.f(this.c, twm0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SubscribedCardModel(title=" + this.a + ", content=" + this.b + ", button=" + this.c + ')';
    }
}
