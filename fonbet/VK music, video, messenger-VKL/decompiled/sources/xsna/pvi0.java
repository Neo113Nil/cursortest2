package xsna;

import com.vk.voip.ui.sessionrooms.dialog.model.SessionRoomParticipantModel;
import java.util.List;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;

/* compiled from: SessionRoomParticipantsModel.kt */
/* loaded from: classes7.dex */
public final class pvi0 {
    public final SessionRoomId.Room a;
    public final boolean b;
    public final List<SessionRoomParticipantModel> c;
    public final List<SessionRoomParticipantModel> d;
    public final boolean e;

    public pvi0(SessionRoomId.Room room, boolean z, List<SessionRoomParticipantModel> list, List<SessionRoomParticipantModel> list2, boolean z2) {
        this.a = room;
        this.b = z;
        this.c = list;
        this.d = list2;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pvi0)) {
            return false;
        }
        pvi0 pvi0Var = (pvi0) obj;
        return epx.f(this.a, pvi0Var.a) && this.b == pvi0Var.b && epx.f(this.c, pvi0Var.c) && epx.f(this.d, pvi0Var.d) && this.e == pvi0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + fw3.a(fw3.a(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionRoomParticipantsModel(roomId=");
        sb.append(this.a);
        sb.append(", roomIsActive=");
        sb.append(this.b);
        sb.append(", roomParticipants=");
        sb.append(this.c);
        sb.append(", callParticipants=");
        sb.append(this.d);
        sb.append(", hasChanges=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
