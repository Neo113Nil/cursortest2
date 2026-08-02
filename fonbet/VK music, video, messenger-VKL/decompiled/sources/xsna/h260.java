package xsna;

import com.vk.api.internal.utils.NetworkBroadcastReceiver;
import com.vk.core.utils.newtork.d;
import com.vk.voip.ui.members.VoipDataProvider;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h260 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ h260(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                if (((com.vk.core.utils.newtork.d) obj) instanceof d.a) {
                    NetworkBroadcastReceiver.a.getClass();
                    NetworkBroadcastReceiver.c();
                } else {
                    NetworkBroadcastReceiver networkBroadcastReceiver = NetworkBroadcastReceiver.a;
                }
                return s3q0.a;
            case 1:
                zn10.a.getClass();
                return zn10.a((String) obj);
            default:
                ParticipantId participantId = (ParticipantId) obj;
                com.vk.voip.ui.c.b.getClass();
                VoipDataProvider voipDataProvider = com.vk.voip.ui.c.d0;
                if (voipDataProvider == null) {
                    voipDataProvider = null;
                }
                return voipDataProvider.a(participantId.id);
        }
    }
}
