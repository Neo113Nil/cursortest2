package xsna;

import com.vk.voip.ui.sessionrooms.dialog.model.SessionRoomParticipantModel;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;

/* compiled from: ConfigureRoomParticipantsListItemParticipant.kt */
/* loaded from: classes7.dex */
public final class x0j implements hfz {
    public final SessionRoomId b;
    public final boolean c;
    public final SessionRoomParticipantModel d;

    public x0j(SessionRoomId sessionRoomId, boolean z, SessionRoomParticipantModel sessionRoomParticipantModel) {
        this.b = sessionRoomId;
        this.c = z;
        this.d = sessionRoomParticipantModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0j)) {
            return false;
        }
        x0j x0jVar = (x0j) obj;
        return epx.f(this.b, x0jVar.b) && this.c == x0jVar.c && epx.f(this.d, x0jVar.d);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.d.a.hashCode());
    }

    public final int hashCode() {
        return (this.d.hashCode() + qoy.b(this.b.hashCode() * 31, 31, this.c)) * 31;
    }

    public final String toString() {
        return "ConfigureRoomParticipantsListItemParticipant(roomId=" + this.b + ", roomIsActive=" + this.c + ", participant=" + this.d + ", id=null)";
    }
}
