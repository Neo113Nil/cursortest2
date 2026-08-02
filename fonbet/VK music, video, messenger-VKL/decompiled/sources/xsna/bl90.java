package xsna;

import android.os.Handler;
import android.os.Message;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesListenerProxy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class bl90 implements Handler.Callback {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bl90(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean looperCallback$lambda$0;
        switch (this.b) {
            case 0:
                looperCallback$lambda$0 = ParticipantStatesListenerProxy.looperCallback$lambda$0((ParticipantStatesListenerProxy) this.c, message);
                return looperCallback$lambda$0;
            default:
                return ((yads.qg1) this.c).a(message);
        }
    }
}
