package xsna;

import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.presentation.model.ToolbarNavButtonType;

/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public final class dpc0 {
    public final String a;
    public final boolean b;
    public final ActionsAvailabilityState.Availability c;
    public final ToolbarNavButtonType d;
    public final String e;
    public final boolean f;
    public final String g;

    public dpc0(String str, boolean z, ActionsAvailabilityState.Availability availability, ToolbarNavButtonType toolbarNavButtonType, String str2, boolean z2, String str3) {
        this.a = str;
        this.b = z;
        this.c = availability;
        this.d = toolbarNavButtonType;
        this.e = str2;
        this.f = z2;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpc0)) {
            return false;
        }
        dpc0 dpc0Var = (dpc0) obj;
        return epx.f(this.a, dpc0Var.a) && this.b == dpc0Var.b && epx.f(this.c, dpc0Var.c) && this.d == dpc0Var.d && epx.f(this.e, dpc0Var.e) && this.f == dpc0Var.f && epx.f(this.g, dpc0Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        String str = this.e;
        int b = qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        String str2 = this.g;
        return b + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostingToolbarViewState(title=");
        sb.append(this.a);
        sb.append(", isNextButtonVisible=");
        sb.append(this.b);
        sb.append(", availability=");
        sb.append(this.c);
        sb.append(", navButtonType=");
        sb.append(this.d);
        sb.append(", nextButtonHint=");
        sb.append(this.e);
        sb.append(", isWaiting=");
        sb.append(this.f);
        sb.append(", authorName=");
        return ho8.a(sb, this.g, ')');
    }
}
