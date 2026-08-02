package xsna;

import com.vk.api.generated.friends.dto.FriendsGetBirthdaysSectionProfileDto;
import java.util.List;

/* compiled from: BirthdaysListSection.kt */
/* loaded from: classes15.dex */
public final class ab7 {
    public final String a;
    public final List<FriendsGetBirthdaysSectionProfileDto> b;

    public ab7(String str, List<FriendsGetBirthdaysSectionProfileDto> list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab7)) {
            return false;
        }
        ab7 ab7Var = (ab7) obj;
        return epx.f(this.a, ab7Var.a) && epx.f(this.b, ab7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BirthdaysListSection(title=");
        sb.append(this.a);
        sb.append(", profiles=");
        return ms9.a(')', sb, this.b);
    }
}
