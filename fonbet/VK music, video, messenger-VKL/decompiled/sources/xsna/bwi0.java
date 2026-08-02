package xsna;

import com.vk.voip.OKVoipEngine;
import java.util.Iterator;
import java.util.Map;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.android.externcalls.sdk.sessionroom.admin.AssignParticipantsToRoomsParams;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class bwi0 implements io.reactivex.rxjava3.core.d {
    public final /* synthetic */ Map b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ com.vk.voip.ui.sessionrooms.d d;

    public /* synthetic */ bwi0(Map map, Map map2, com.vk.voip.ui.sessionrooms.d dVar) {
        this.b = map;
        this.c = map2;
        this.d = dVar;
    }

    @Override // io.reactivex.rxjava3.core.d
    public final void subscribe(io.reactivex.rxjava3.core.b bVar) {
        AssignParticipantsToRoomsParams.Builder builder = new AssignParticipantsToRoomsParams.Builder();
        for (Map.Entry entry : this.b.entrySet()) {
            Iterator it = ((Iterable) entry.getValue()).iterator();
            while (it.hasNext()) {
                builder.addRoomParticipant((SessionRoomId.Room) entry.getKey(), (ParticipantId) it.next());
            }
        }
        for (Map.Entry entry2 : this.c.entrySet()) {
            Iterator it2 = ((Iterable) entry2.getValue()).iterator();
            while (it2.hasNext()) {
                builder.removeRoomParticipant((SessionRoomId.Room) entry2.getKey(), (ParticipantId) it2.next());
            }
        }
        this.d.a.getClass();
        SessionRoomsManager D = OKVoipEngine.D();
        if (D != null) {
            D.assignParticipantsToRooms(builder.build(), new g880(bVar, 20), new j5b0(bVar, 9));
        }
    }
}
