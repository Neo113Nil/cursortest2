package xsna;

import com.vk.voip.ui.sessionrooms.dialog.model.SessionRoomParticipantModel;
import com.vk.voip.ui.sessionrooms.f;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SessionRoomModel.kt */
/* loaded from: classes7.dex */
public final class lvi0 {
    public final f.a.b a;
    public final boolean b;
    public final boolean c;
    public final List<SessionRoomParticipantModel> d;

    public lvi0(f.a.b bVar, boolean z, boolean z2, ArrayList arrayList) {
        this.a = bVar;
        this.b = z;
        this.c = z2;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lvi0)) {
            return false;
        }
        lvi0 lvi0Var = (lvi0) obj;
        return epx.f(this.a, lvi0Var.a) && this.b == lvi0Var.b && this.c == lvi0Var.c && epx.f(this.d, lvi0Var.d);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        List<SessionRoomParticipantModel> list = this.d;
        return b + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionRoomModel(room=");
        sb.append(this.a);
        sb.append(", isAssistanceRequested=");
        sb.append(this.b);
        sb.append(", isHandRaised=");
        sb.append(this.c);
        sb.append(", participants=");
        return ms9.a(')', sb, this.d);
    }
}
