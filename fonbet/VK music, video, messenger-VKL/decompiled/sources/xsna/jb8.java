package xsna;

import android.content.Context;
import android.os.PowerManager;
import com.vk.bridges.di.BridgeComponent;
import com.vk.donut.privacy.api.di.DonutPrivacyComponent;
import com.vk.dzenarticle.api.DzenArticleComponent;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.music.offline.api.di.StorageTypeComponent;
import com.vk.superapp.multiaccount.impl.MultiAccountComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.MainActivity;
import com.vkontakte.android.task.di.components.BridgeComponentImpl;
import com.vkontakte.android.task.di.components.LinksBridgeComponentImpl;
import java.util.concurrent.ExecutorService;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class jb8 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jb8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        boolean z;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((DonutPrivacyComponent) ((BridgeComponentImpl) obj).k.getValue()).a();
            case 1:
                return (PowerManager) ((Context) obj).getSystemService("power");
            case 2:
                return ((BridgeComponent) ((gxw) obj).c().a(fpf0.a(BridgeComponent.class))).x();
            case 3:
                return ((DzenArticleComponent) ((LinksBridgeComponentImpl) obj).E.getValue()).a();
            case 4:
                MainActivity mainActivity = (MainActivity) obj;
                String str = MainActivity.P;
                s101.c.G(mainActivity, mainActivity.getPackageName(), MainActivity.P);
                return null;
            case 5:
                ExecutorService executorService = (ExecutorService) obj;
                qcy<Object>[] qcyVarArr = MultiAccountComponentImpl.e;
                j240 j240Var = new j240(executorService);
                r55 r55Var = r55.a;
                return new w140(j240Var, executorService, r55.g());
            case 6:
                return (MarketComponent) ((g8m) obj).a(fpf0.a(MarketComponent.class));
            case 7:
                return ((StorageTypeComponent) obj).j3();
            case 8:
                aid0 aid0Var = (aid0) obj;
                bpn0 bpn0Var = aid0Var.q;
                xhd0 xhd0Var = aid0Var.b;
                if (!lhs.d()) {
                    thd0 thd0Var = (thd0) bpn0Var.getValue();
                    xhd0Var.getClass();
                    return new jln0(thd0Var);
                }
                lhs.a("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence:init");
                try {
                    thd0 thd0Var2 = (thd0) bpn0Var.getValue();
                    xhd0Var.getClass();
                    return new jln0(thd0Var2);
                } finally {
                    lhs.b();
                }
            default:
                qks0 qks0Var = (qks0) obj;
                if (qks0Var.a) {
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_SAA_NOT_INTERESTED_POLL;
                    videoFeatures.getClass();
                    z = com.vk.toggle.b.A.a(videoFeatures);
                } else if (qks0Var.b) {
                    VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_NOT_INTERESTED_POLL;
                    videoFeatures2.getClass();
                    z = com.vk.toggle.b.A.a(videoFeatures2);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
