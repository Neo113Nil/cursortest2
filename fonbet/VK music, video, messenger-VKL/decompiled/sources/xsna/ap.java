package xsna;

import com.vk.accountmanager.di.AccountManagerComponentImpl;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import java.util.concurrent.Callable;
import xsna.mp;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ap implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ap(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if (com.vk.toggle.b.A.a(r0) != false) goto L12;
     */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        int i = this.b;
        int i2 = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                AccountManagerComponentImpl accountManagerComponentImpl = (AccountManagerComponentImpl) obj;
                qcy<Object>[] qcyVarArr = AccountManagerComponentImpl.h;
                try {
                    return new pp(new jp(new op(accountManagerComponentImpl.a, accountManagerComponentImpl.d.getValue().ie())), new dp(accountManagerComponentImpl, i2));
                } catch (Exception e) {
                    xgx0.a.getClass();
                    xgx0.d(e);
                    return mp.a.a.getSTUB();
                }
            case 1:
                asu0.a.getClass();
                asu0.n().submit(new ryc((uy2) obj, 6));
                return s3q0.a;
            case 2:
                return Boolean.valueOf(((dky) obj).f.g.a.invoke().booleanValue() && !((mir) rhr.i.getValue()).b.a.getBoolean("config_disable_knet", false));
            case 3:
                return ((nx50) obj).F0().b1();
            case 4:
                OfflineAudioComponentImpl offlineAudioComponentImpl = (OfflineAudioComponentImpl) obj;
                return (k850) offlineAudioComponentImpl.e.invoke(new bpn0(new v62(offlineAudioComponentImpl, 4)));
            case 5:
                return ((Callable) obj).call();
            case 6:
                if (((qks0) obj).a) {
                    VideoFeatures videoFeatures = VideoFeatures.OLD_CHANNEL_METRICS;
                    videoFeatures.getClass();
                    break;
                }
                r1 = false;
                return Boolean.valueOf(r1);
            default:
                return ((VideoGrowthComponent) ((k7m) m7m.f((kzv0) obj)).a(fpf0.a(VideoGrowthComponent.class))).B3();
        }
    }
}
