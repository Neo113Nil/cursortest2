package xsna;

import android.os.Trace;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.donut.video.subscription.impl.di.DonutSubscriptionVideoComponentImpl;
import com.vk.ecomm.market.impl.di.MarketComponentImpl;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import com.vk.voip.api.di.VoipCallComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class hy6 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hy6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((ky6) obj).a.invoke();
            case 1:
                return new com.vk.superapp.advertisement.b(((gnl) obj).a);
            case 2:
                return ((DonutSubscriptionVideoComponentImpl) obj).b.s().c();
            case 3:
                return (VoipCallComponent) ((g8m) obj).a(fpf0.a(VoipCallComponent.class));
            case 4:
                zdw zdwVar = (zdw) obj;
                return zdwVar.b(zdwVar.v);
            case 5:
                return ((BridgeComponent) ((gxw) obj).c().a(fpf0.a(BridgeComponent.class))).i1();
            case 6:
                c7x c7xVar = (c7x) obj;
                return new sal(c7xVar.d, c7xVar.e);
            case 7:
                qcy<Object>[] qcyVarArr = MarketComponentImpl.l;
                return new lw00(((MarketComponentImpl) obj).U1());
            case 8:
                return ((AuthBridgeComponent) m7m.a(((nx50) obj).b).a(fpf0.a(AuthBridgeComponent.class))).s();
            case 9:
                OfflineAudioComponentImpl offlineAudioComponentImpl = (OfflineAudioComponentImpl) obj;
                qcy<Object>[] qcyVarArr2 = OfflineAudioComponentImpl.M;
                return new eq40((fq40) offlineAudioComponentImpl.I.getValue(), (vp40) offlineAudioComponentImpl.F.getValue(), offlineAudioComponentImpl.Ef());
            case 10:
                return zr.a("Section temporary unavailable for ", ((e2i0) obj).c(), ".");
            case 11:
                bhl0 bhl0Var = (bhl0) obj;
                Trace.beginSection(ndp0.f("lazy StorageManager.managedGroupsStorageManager"));
                try {
                    yi00 yi00Var = new yi00(bhl0Var.B());
                    bhl0Var.z(yi00Var);
                    return yi00Var;
                } finally {
                    Trace.endSection();
                }
            default:
                return (l0q0) obj;
        }
    }
}
