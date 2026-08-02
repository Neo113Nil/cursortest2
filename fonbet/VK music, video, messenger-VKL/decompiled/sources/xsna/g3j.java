package xsna;

import android.os.Handler;
import com.vk.auth.main.VkClientLibverifyInfo;
import com.vk.ecomm.verifiedseller.api.di.VerifiedSellerComponent;
import com.vk.im.engine.di.ImConfigurationComponent;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import com.vk.repository.data.api.di.DataRepositoryComponent;
import com.vkontakte.android.task.di.components.LinksBridgeComponentImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g3j implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g3j(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                h3j h3jVar = (h3j) obj;
                h3jVar.a.start();
                return new Handler(h3jVar.a.getLooper());
            case 1:
                return new rng(new bpn0(new p3h((gxw) obj, 27)));
            case 2:
                return ((VerifiedSellerComponent) ((LinksBridgeComponentImpl) obj).v.getValue()).a();
            case 3:
                return Boolean.valueOf(((ImConfigurationComponent) ((nmg0) ((ph20) obj).c.invoke()).a(fpf0.a(ImConfigurationComponent.class))).q6().a());
            case 4:
                return (DataRepositoryComponent) ((g8m) obj).a(fpf0.a(DataRepositoryComponent.class));
            case 5:
                OfflineAudioComponentImpl offlineAudioComponentImpl = (OfflineAudioComponentImpl) obj;
                qcy<Object>[] qcyVarArr = OfflineAudioComponentImpl.M;
                return new swj(offlineAudioComponentImpl.I(), offlineAudioComponentImpl.n7());
            default:
                return i5s.a(new StringBuilder("vk_"), (String) ((VkClientLibverifyInfo) obj).d.getValue(), "passwordless_auth");
        }
    }
}
