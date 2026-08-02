package xsna;

import com.vk.dto.newsfeed.SituationalSuggest;

/* compiled from: NewsfeedSituationalSuggestDto.kt */
/* loaded from: classes4.dex */
public final class pz60 {
    public final SituationalSuggest a;
    public final boolean b;

    public pz60(SituationalSuggest situationalSuggest, boolean z) {
        this.a = situationalSuggest;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz60)) {
            return false;
        }
        pz60 pz60Var = (pz60) obj;
        return epx.f(this.a, pz60Var.a) && this.b == pz60Var.b;
    }

    public final int hashCode() {
        SituationalSuggest situationalSuggest = this.a;
        return Boolean.hashCode(this.b) + ((situationalSuggest == null ? 0 : situationalSuggest.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedSituationalSuggestDto(situationalSuggest=");
        sb.append(this.a);
        sb.append(", isFromCache=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
