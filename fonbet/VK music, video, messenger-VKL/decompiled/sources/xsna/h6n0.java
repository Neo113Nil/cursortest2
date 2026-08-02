package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.education.EduScheduleOnDayModel;
import java.util.AbstractCollection;
import java.util.Map;

/* compiled from: SuggestionData.kt */
/* loaded from: classes2.dex */
public final class h6n0 {
    public final m420 a;
    public final Map<Peer, EduScheduleOnDayModel> b;

    public h6n0() {
        this((m420) null, 3);
    }

    public static h6n0 a(h6n0 h6n0Var, m420 m420Var) {
        Map<Peer, EduScheduleOnDayModel> map = h6n0Var.b;
        h6n0Var.getClass();
        return new h6n0(m420Var, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6n0)) {
            return false;
        }
        h6n0 h6n0Var = (h6n0) obj;
        return epx.f(this.a, h6n0Var.a) && epx.f(this.b, h6n0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuggestionData(mentionSuggestion=");
        sb.append(this.a);
        sb.append(", membersToSchedule=");
        return cjl0.a(sb, this.b, ')');
    }

    public h6n0(m420 m420Var, Map<Peer, EduScheduleOnDayModel> map) {
        this.a = m420Var;
        this.b = map;
    }

    public /* synthetic */ h6n0(m420 m420Var, int i) {
        this((i & 1) != 0 ? new m420((AbstractCollection) null, (ProfilesInfo) null, false, 15) : m420Var, jgp.b);
    }
}
