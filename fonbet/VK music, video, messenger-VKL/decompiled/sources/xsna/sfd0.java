package xsna;

import com.vk.dto.user.UserProfile;
import java.util.List;

/* compiled from: PrivacyEditUserListsRepository.kt */
/* loaded from: classes5.dex */
public final class sfd0 {
    public final List<UserProfile> a;
    public final List<UserProfile> b;

    /* JADX WARN: Multi-variable type inference failed */
    public sfd0(List<? extends UserProfile> list, List<? extends UserProfile> list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sfd0)) {
            return false;
        }
        sfd0 sfd0Var = (sfd0) obj;
        return epx.f(this.a, sfd0Var.a) && epx.f(this.b, sfd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrivacyUserListsData(allowedUsers=");
        sb.append(this.a);
        sb.append(", deniedUsers=");
        return ms9.a(')', sb, this.b);
    }
}
