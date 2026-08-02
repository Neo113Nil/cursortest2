package xsna;

import java.util.List;

/* compiled from: ClipCarouselAttachesParams.kt */
/* loaded from: classes18.dex */
public final class rmc {
    public final List<pmc> a;
    public final List<pmc> b;
    public final tmc c;

    /* JADX WARN: Multi-variable type inference failed */
    public rmc(List<? extends pmc> list, List<? extends pmc> list2, tmc tmcVar) {
        this.a = list;
        this.b = list2;
        this.c = tmcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rmc)) {
            return false;
        }
        rmc rmcVar = (rmc) obj;
        return epx.f(this.a, rmcVar.a) && epx.f(this.b, rmcVar.b) && epx.f(this.c, rmcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + fw3.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ClipCarouselAttachesParams(productAttaches=" + this.a + ", ticketAttaches=" + this.b + ", productItemsUiParams=" + this.c + ')';
    }
}
