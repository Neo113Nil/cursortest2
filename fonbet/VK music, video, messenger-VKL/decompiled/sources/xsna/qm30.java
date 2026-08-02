package xsna;

import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.vk.im.engine.models.messages.MsgFromUser;
import java.util.List;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class qm30 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ qm30(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((vm30) this.c).B((MsgFromUser) this.d, (fm20) this.e);
                break;
            case 1:
                ((StereoRoomManagerImpl) this.c).idNotResolved((ParticipantId) this.d, (izs) this.e);
                break;
            default:
                com.ironsource.mediationsdk.c.a((AdapterBaseInterface) this.c, (String) this.d, (List) this.e);
                break;
        }
    }
}
