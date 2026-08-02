package xsna;

import android.content.DialogInterface;
import com.vk.voip.ui.sessionrooms.f;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.msf0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class w4p implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w4p(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                ((Ref$BooleanRef) this.c).element = true;
                break;
            case 1:
                ((xxt) this.c).h();
                break;
            case 2:
                ((rsf0) this.c).d.invoke(msf0.a.b);
                break;
            case 3:
                ((gzs) this.c).invoke();
                break;
            default:
                f.a.b bVar = (f.a.b) this.c;
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.sessionrooms.d dVar = com.vk.voip.ui.c.B0;
                SessionRoomId.Room room = bVar.a;
                ParticipantStatesManager participantStatesManager = dVar.a.getParticipantStatesManager();
                if (participantStatesManager != null) {
                    participantStatesManager.resetAssistanceRequests(room);
                    break;
                }
                break;
        }
    }
}
