package xsna;

/* compiled from: DonutBanner.kt */
/* loaded from: classes18.dex */
public final class swm0 implements ryn {
    public final String a;
    public final com.vk.donut.design.compose.banner.c b;
    public final vs9 c;

    public swm0(String str, com.vk.donut.design.compose.banner.c cVar, vs9 vs9Var) {
        this.a = str;
        this.b = cVar;
        this.c = vs9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof swm0)) {
            return false;
        }
        swm0 swm0Var = (swm0) obj;
        return epx.f(this.a, swm0Var.a) && epx.f(this.b, swm0Var.b) && epx.f(this.c, swm0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SubscribedCard(title=" + this.a + ", content=" + this.b + ", button=" + this.c + ')';
    }
}
