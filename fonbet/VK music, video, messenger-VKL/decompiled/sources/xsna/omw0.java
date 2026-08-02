package xsna;

import com.vk.log.L;
import com.vk.voip.api.id.CallId;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.pmw0;

/* compiled from: VoipChatInfoLoader.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class omw0 extends FunctionReferenceImpl implements izs<pmw0.a.b, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(pmw0.a.b bVar) {
        pmw0.a.b bVar2 = bVar;
        pmw0 pmw0Var = (pmw0) this.receiver;
        pmw0Var.getClass();
        StringBuilder sb = new StringBuilder("Request to load chat info for ");
        CallId callId = bVar2.a;
        sb.append(callId);
        sb.append(':');
        SessionRoomId sessionRoomId = bVar2.b;
        sb.append(sessionRoomId);
        L.e("VoipChatInfoLoader", sb.toString());
        if (!callId.c) {
            io.reactivex.rxjava3.disposables.c cVar = pmw0Var.f;
            if (cVar != null) {
                cVar.dispose();
            }
            rd9 rd9Var = pmw0Var.a;
            String str = callId.b;
            Integer valueOf = sessionRoomId instanceof SessionRoomId.Room ? Integer.valueOf(((SessionRoomId.Room) sessionRoomId).getId()) : null;
            rd9Var.getClass();
            tfx tfxVar = new tfx("calls.getConversationByCall", new vq(5), new wq(8));
            tfx.o(tfxVar, "call_id", str, 0, 0, 12);
            tfxVar.j("extended", true);
            if (valueOf != null) {
                tfx.l(tfxVar, "hall_id", valueOf.intValue(), 0, 0, 8);
            }
            dz2 x = yfb.x(tfxVar);
            zdw0.a(x, pmw0Var.e);
            x.q = 3;
            pmw0Var.f = io.reactivex.rxjava3.kotlin.c.f(2, rsg0.y0(x, null, null, 3), null, new qvm0(4, bVar2, pmw0Var), new ozk0(7, bVar2, pmw0Var));
        }
        return s3q0.a;
    }
}
