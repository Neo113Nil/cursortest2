package xsna;

import com.vk.sidecontrols.api.AnimatedSharingController;
import java.util.List;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ll2 implements ofw, io.reactivex.rxjava3.core.a0 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ll2(AnimatedSharingController.Strategy strategy, List list, ml2 ml2Var) {
        this.b = strategy;
        this.c = list;
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        ((SessionRoomsManager) this.b).getParticipantRoomId((ParticipantId) this.c, new b810(yVar, 25), new znr(yVar, 1));
    }

    public /* synthetic */ ll2(SessionRoomsManager sessionRoomsManager, ParticipantId participantId) {
        this.b = sessionRoomsManager;
        this.c = participantId;
    }
}
