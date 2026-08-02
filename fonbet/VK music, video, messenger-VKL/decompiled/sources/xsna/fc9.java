package xsna;

import java.io.Serializable;
import java.util.ArrayList;
import org.webrtc.StatsReport;
import ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl;
import ru.ok.android.webrtc.topology.StatsObserver;
import ru.ok.android.webrtc.topology.server.ServerCallTopology;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class fc9 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object g;

    public /* synthetic */ fc9(int i, Serializable serializable, Object obj, Object obj2, Object obj3, Object obj4) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = serializable;
        this.g = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                CallsAudioManagerV2Impl.doOnOwnThread$lambda$8((CallsAudioManagerV2Impl) this.c, (gzs) this.d, (gzs) this.e, (String) this.f, (izs) this.g);
                break;
            default:
                ((ServerCallTopology) this.c).a((StatsReport[]) this.d, (StatsReport[]) this.e, (ArrayList) this.f, (StatsObserver) this.g);
                break;
        }
    }
}
