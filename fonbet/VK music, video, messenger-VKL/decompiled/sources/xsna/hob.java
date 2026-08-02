package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.instantjobs.InstantJob;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class hob implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Serializer.StreamParcelableAdapter d;

    public /* synthetic */ hob(long j, Serializer.StreamParcelableAdapter streamParcelableAdapter, int i) {
        this.b = i;
        this.c = j;
        this.d = streamParcelableAdapter;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.b) {
            case 0:
                ProfilesInfo profilesInfo = (ProfilesInfo) this.d;
                ipm ipmVar = (ipm) obj;
                long j = this.c;
                ipmVar.a(j).b.Hb(profilesInfo);
                return ipmVar.a(j);
            default:
                Peer peer = (Peer) this.d;
                InstantJob instantJob = (InstantJob) obj;
                if (instantJob instanceof kbm) {
                    kbm kbmVar = (kbm) instantJob;
                    if (kbmVar.c == this.c && epx.f(kbmVar.d, peer)) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
        }
    }
}
