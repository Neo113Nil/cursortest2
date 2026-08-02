package xsna;

import com.vk.voip.ui.sessionrooms.a;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.sessionroom.SessionRoom;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.qwi0;

/* compiled from: SessionRoomsDelegate.kt */
/* loaded from: classes11.dex */
public final class iwi0 implements SessionRoomsManager.OwnRoomsListener {
    public final /* synthetic */ com.vk.voip.ui.sessionrooms.d b;

    public iwi0(com.vk.voip.ui.sessionrooms.d dVar) {
        this.b = dVar;
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener
    public final void onActiveRoomChanged(SessionRoomsManager.SessionRoomInfo sessionRoomInfo) {
        String str;
        List<CallParticipant.ParticipantId> list;
        com.vk.voip.ui.sessionrooms.d dVar = this.b;
        io.reactivex.rxjava3.subjects.f<com.vk.voip.ui.sessionrooms.a> fVar = dVar.c;
        SessionRoomId roomId = sessionRoomInfo.getRoomId();
        if (roomId instanceof SessionRoomId.MainCall) {
            fVar.onNext(a.b.a);
            dVar.k().C(qwi0.k.b);
        } else {
            if (!(roomId instanceof SessionRoomId.Room)) {
                throw new NoWhenBranchMatchedException();
            }
            SessionRoomId.Room room = (SessionRoomId.Room) roomId;
            SessionRoom room2 = sessionRoomInfo.getRoom();
            fVar.onNext(a.C2075a.a);
            mwi0 k = dVar.k();
            if (room2 == null || (str = room2.getName()) == null) {
                str = "";
            }
            String str2 = str;
            boolean isActive = room2 != null ? room2.isActive() : true;
            int participantCount = room2 != null ? room2.getParticipantCount() : 1;
            if (room2 == null || (list = room2.getParticipantIds()) == null) {
                list = EmptyList.b;
            }
            k.C(new qwi0.j(room, str2, isActive, participantCount, list));
        }
        dVar.m().a(sessionRoomInfo.getRoomId());
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener
    public final void onProposedRoomChanged(SessionRoomsManager.SessionRoomInfo sessionRoomInfo) {
        SessionRoomId roomId = sessionRoomInfo.getRoomId();
        boolean z = roomId instanceof SessionRoomId.MainCall;
        com.vk.voip.ui.sessionrooms.d dVar = this.b;
        if (z) {
            dVar.k().C(qwi0.p.b);
            return;
        }
        if (!(roomId instanceof SessionRoomId.Room)) {
            throw new NoWhenBranchMatchedException();
        }
        SessionRoom room = sessionRoomInfo.getRoom();
        if (room == null) {
            dVar.k().C(qwi0.p.b);
        } else {
            dVar.k().C(new qwi0.d((SessionRoomId.Room) roomId, room.getName(), room.isActive(), room.getParticipantCount(), room.getParticipantIds()));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener
    public final void onRoomRemoved(SessionRoomsManager.SessionRoomInfo sessionRoomInfo) {
        SessionRoomId roomId = sessionRoomInfo.getRoomId();
        SessionRoomId.Room room = roomId instanceof SessionRoomId.Room ? (SessionRoomId.Room) roomId : null;
        if (room != null) {
            this.b.k().C(new qwi0.l(room));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener
    public final void onRoomUpdated(SessionRoomsManager.SessionRoomInfo sessionRoomInfo) {
        SessionRoom room = sessionRoomInfo.getRoom();
        if (room != null) {
            this.b.k().C(new qwi0.m(room.getId(), room.getName(), room.isActive(), room.getParticipantCount(), room.getParticipantIds(), room.getTimeoutMs()));
        }
    }
}
