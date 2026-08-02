package xsna;

import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;

/* compiled from: FilteredSourcesCountersExtended.kt */
/* loaded from: classes18.dex */
public final class bfr {
    public final cfr<UserProfile> a;
    public final cfr<Group> b;

    public bfr(cfr<UserProfile> cfrVar, cfr<Group> cfrVar2) {
        this.a = cfrVar;
        this.b = cfrVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfr)) {
            return false;
        }
        bfr bfrVar = (bfr) obj;
        return epx.f(this.a, bfrVar.a) && epx.f(this.b, bfrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FilteredSourcesCountersExtended(profiles=" + this.a + ", groups=" + this.b + ')';
    }
}
