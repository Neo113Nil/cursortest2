package xsna;

import com.vk.voip.dto.call_member.CallMemberId;
import java.util.List;
import ru.ok.android.webrtc.participant.movie.Movie;

/* compiled from: SpeakerInfo.kt */
/* loaded from: classes7.dex */
public final class cjk0 {
    public final CallMemberId a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final List<Movie> e;

    public cjk0(CallMemberId callMemberId, boolean z, boolean z2, boolean z3, List<Movie> list) {
        this.a = callMemberId;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjk0)) {
            return false;
        }
        cjk0 cjk0Var = (cjk0) obj;
        return epx.f(this.a, cjk0Var.a) && this.b == cjk0Var.b && this.c == cjk0Var.c && this.d == cjk0Var.d && epx.f(this.e, cjk0Var.e);
    }

    public final int hashCode() {
        CallMemberId callMemberId = this.a;
        return this.e.hashCode() + qoy.b(qoy.b(qoy.b((callMemberId == null ? 0 : callMemberId.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpeakerInfo(id=");
        sb.append(this.a);
        sb.append(", withVideo=");
        sb.append(this.b);
        sb.append(", withScreenShare=");
        sb.append(this.c);
        sb.append(", withAnimoji=");
        sb.append(this.d);
        sb.append(", movies=");
        return ms9.a(')', sb, this.e);
    }
}
