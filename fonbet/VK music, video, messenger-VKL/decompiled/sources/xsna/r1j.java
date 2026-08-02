package xsna;

import androidx.fragment.app.FragmentManager;
import com.vk.voip.ui.sessionrooms.dialog.SessionRoomsDialog;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.q2j;
import xsna.v1j;

/* compiled from: ConfigureRoomsViewRenderer.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class r1j extends FunctionReferenceImpl implements izs<q2j.h.a, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(q2j.h.a aVar) {
        q2j.h.a aVar2 = aVar;
        u1j u1jVar = (u1j) this.receiver;
        a2j a2jVar = u1jVar.u;
        n1j n1jVar = u1jVar.t;
        u1jVar.F = null;
        if (aVar2 instanceof q2j.h.a.e) {
            SessionRoomId.Room room = ((q2j.h.a.e) aVar2).a;
            FragmentManager parentFragmentManager = n1jVar.getParentFragmentManager();
            if (parentFragmentManager.H("EditSessionRoomDialog") == null) {
                g1p g1pVar = new g1p();
                g1pVar.f1 = a2jVar;
                g1pVar.setArguments(yfb.b(new Pair(SignalingProtocol.KEY_ROOM_ID, Integer.valueOf(room.getId()))));
                g1pVar.Td(parentFragmentManager, "EditSessionRoomDialog");
            }
        } else if (aVar2 instanceof q2j.h.a.C3546a) {
            FragmentManager parentFragmentManager2 = n1jVar.getParentFragmentManager();
            if (parentFragmentManager2.H("AddOrRenameSessionRoomDialog") == null) {
                lm0 lm0Var = new lm0();
                lm0Var.g1 = a2jVar;
                lm0Var.Td(parentFragmentManager2, "AddOrRenameSessionRoomDialog");
            }
        } else if (aVar2 instanceof q2j.h.a.C3547h) {
            SessionRoomId.Room room2 = ((q2j.h.a.C3547h) aVar2).a;
            FragmentManager parentFragmentManager3 = n1jVar.getParentFragmentManager();
            if (parentFragmentManager3.H("AddOrRenameSessionRoomDialog") == null) {
                ayf0 ayf0Var = new ayf0();
                ayf0Var.g1 = a2jVar;
                if (room2 != null) {
                    ayf0Var.setArguments(yfb.b(new Pair(SignalingProtocol.KEY_ROOM_ID, Integer.valueOf(room2.getId()))));
                }
                ayf0Var.Td(parentFragmentManager3, "AddOrRenameSessionRoomDialog");
            }
        } else {
            if (!(aVar2 instanceof q2j.h.a.f)) {
                if (aVar2 instanceof q2j.h.a.c) {
                    SessionRoomsDialog.a aVar3 = new SessionRoomsDialog.a();
                    kwi0 kwi0Var = new kwi0(new ng3(12, u1jVar, aVar2), null);
                    aVar3.a = SessionRoomsDialog.DialogKind.SELECT_ROOM;
                    aVar3.b = kwi0Var;
                    aVar3.a(n1jVar.getParentFragmentManager());
                }
                return s3q0.a;
            }
            SessionRoomId.Room room3 = ((q2j.h.a.f) aVar2).a;
            FragmentManager parentFragmentManager4 = n1jVar.getParentFragmentManager();
            if (parentFragmentManager4.H("admin-room-participants") == null) {
                p0j p0jVar = new p0j();
                p0jVar.i1 = a2jVar;
                p0jVar.setArguments(yfb.b(new Pair(SignalingProtocol.KEY_ROOM_ID, Integer.valueOf(room3.getId()))));
                p0jVar.Td(parentFragmentManager4, "admin-room-participants");
            }
        }
        u1jVar.v.invoke(v1j.l.b);
        return s3q0.a;
    }
}
