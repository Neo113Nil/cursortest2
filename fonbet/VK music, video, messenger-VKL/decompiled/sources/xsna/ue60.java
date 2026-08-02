package xsna;

import com.vk.dto.newsfeed.discover.DiscoverId;
import com.vk.newsfeed.domain.model.NewsfeedCustomFeedType;

/* compiled from: NewsfeedCustomArguments.kt */
/* loaded from: classes4.dex */
public final class ue60 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final DiscoverId e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final NewsfeedCustomFeedType k;

    public ue60(String str, String str2, String str3, String str4, DiscoverId discoverId, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, NewsfeedCustomFeedType newsfeedCustomFeedType) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = discoverId;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = newsfeedCustomFeedType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ue60)) {
            return false;
        }
        ue60 ue60Var = (ue60) obj;
        return epx.f(this.a, ue60Var.a) && epx.f(this.b, ue60Var.b) && epx.f(this.c, ue60Var.c) && epx.f(this.d, ue60Var.d) && epx.f(this.e, ue60Var.e) && this.f == ue60Var.f && this.g == ue60Var.g && this.h == ue60Var.h && this.i == ue60Var.i && this.j == ue60Var.j && this.k == ue60Var.k;
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.k.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((this.e.hashCode() + ((a + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        return "NewsfeedCustomArguments(title=" + this.a + ", feedId=" + this.b + ", refFull=" + this.c + ", trackCode=" + this.d + ", discoverId=" + this.e + ", isRestored=" + this.f + ", hasDiscoverId=" + this.g + ", withPreload=" + this.h + ", shouldShowShopsButtonInViewer=" + this.i + ", isShowInLegoTheme=" + this.j + ", feedType=" + this.k + ')';
    }
}
