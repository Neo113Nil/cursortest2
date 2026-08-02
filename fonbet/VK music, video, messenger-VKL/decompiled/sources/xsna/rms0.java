package xsna;

import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: VideoFullDtoPrivacyMapper.kt */
/* loaded from: classes16.dex */
public final class rms0 {
    public final List<UserId> a;
    public final List<Integer> b;

    public rms0(List<UserId> list, List<Integer> list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rms0)) {
            return false;
        }
        rms0 rms0Var = (rms0) obj;
        return epx.f(this.a, rms0Var.a) && epx.f(this.b, rms0Var.b);
    }

    public final int hashCode() {
        List<UserId> list = this.a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Integer> list2 = this.b;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrivacyResult(excludedFriends=");
        sb.append(this.a);
        sb.append(", excludedLists=");
        return ms9.a(')', sb, this.b);
    }
}
