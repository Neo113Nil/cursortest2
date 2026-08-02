package xsna;

import androidx.fragment.app.FragmentManager;
import com.vk.voip.ui.sessionrooms.dialog.SessionRoomsDialog;
import com.vk.voip.ui.sessionrooms.dialog.model.SessionRoomParticipantModel;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.j0j;
import xsna.m1j;

/* compiled from: ConfigureRoomParticipantsRenderer.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class k1j extends FunctionReferenceImpl implements izs<m1j.e.b, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(m1j.e.b bVar) {
        String str;
        m1j.e.b bVar2 = bVar;
        i1j i1jVar = (i1j) this.receiver;
        p0j p0jVar = i1jVar.b;
        i4e i4eVar = i1jVar.e;
        boolean z = bVar2 instanceof m1j.e.b.C3318b;
        j0j.c cVar = j0j.c.b;
        if (z) {
            i4eVar.invoke(cVar);
            s0j s0jVar = i1jVar.d;
            m1j.e.b.C3318b c3318b = (m1j.e.b.C3318b) bVar2;
            SessionRoomId.Room room = c3318b.a;
            SessionRoomParticipantModel sessionRoomParticipantModel = c3318b.b;
            ParticipantId participantId = sessionRoomParticipantModel.a;
            wk90 wk90Var = sessionRoomParticipantModel.g;
            if (wk90Var == null || (str = wk90Var.b) == null) {
                str = "";
            }
            FragmentManager parentFragmentManager = p0jVar.getParentFragmentManager();
            if (parentFragmentManager.H("EditSessionRoomDialog") == null) {
                nvi0 nvi0Var = new nvi0();
                nvi0Var.f1 = s0jVar;
                nvi0Var.setArguments(yfb.b(new Pair(SignalingProtocol.KEY_PARTICIPANT_ID, participantId), new Pair(SignalingProtocol.KEY_ROOM_ID, Integer.valueOf(room.getId())), new Pair("participantName", str)));
                nvi0Var.Td(parentFragmentManager, "EditSessionRoomDialog");
            }
        } else if (bVar2 instanceof m1j.e.b.c) {
            i4eVar.invoke(cVar);
            SessionRoomsDialog.a aVar = new SessionRoomsDialog.a();
            kwi0 kwi0Var = new kwi0(new bp7(9, i1jVar, bVar2), new n1d(bVar2, 12));
            aVar.a = SessionRoomsDialog.DialogKind.SELECT_ROOM;
            aVar.b = kwi0Var;
            aVar.a(p0jVar.getParentFragmentManager());
        }
        return s3q0.a;
    }
}
