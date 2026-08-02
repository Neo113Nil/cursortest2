package xsna;

import android.os.Build;
import android.os.Trace;
import android.view.GestureDetector;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog.mvi.block.impl.di.CatalogViewComponentImpl;
import com.vk.catalog.mvi.section.di.CatalogComponent;
import com.vk.content.design.view.camera.ShutterButton;
import com.vk.dto.common.ImageSizeKey;
import com.vk.httpexecutor.core.knet.KnetExecutorType;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.network.di.NetworkComponent;
import com.vk.nspk.di.NspkSearchBanksFeatureComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.ui.di.VoipAnalyticsInternalComponent;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.NewsFeedBridgeComponentImpl;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import xsna.wjy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class uia implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uia(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        boolean z;
        int i = this.b;
        ?? r3 = this.c;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = CatalogViewComponentImpl.g;
                return ((CatalogComponent) r3.getValue()).Ze();
            case 1:
                try {
                    String bigInteger = new BigInteger(1, MessageDigest.getInstance(SameMD5.TAG).digest((((k1q) r3).a + '_' + Build.FINGERPRINT).getBytes(emb.b))).toString(16);
                    while (bigInteger.length() < 32) {
                        bigInteger = ImageSizeKey.SIZE_KEY_UNDEFINED + bigInteger;
                    }
                    return bigInteger;
                } catch (NoSuchAlgorithmException unused) {
                    return null;
                }
            case 2:
                KnetExecutorType knetExecutorType = (KnetExecutorType) ((wjy.a) r3).h.invoke();
                knetExecutorType.getClass();
                return Boolean.valueOf(knetExecutorType == KnetExecutorType.CRONET_QUIC);
            case 3:
                return (BridgeComponent) ((g8m) r3).a(fpf0.a(BridgeComponent.class));
            case 4:
                return new m850((n850) r3);
            case 5:
                return ((VkClientMultiAccountComponent) m7m.a(((nx50) r3).b).a(fpf0.a(VkClientMultiAccountComponent.class))).getExperiments();
            case 6:
                NewsFeedBridgeComponentImpl newsFeedBridgeComponentImpl = (NewsFeedBridgeComponentImpl) r3;
                qcy<Object>[] qcyVarArr2 = NewsFeedBridgeComponentImpl.h;
                int i2 = 5;
                return new n6v0(new ho4(newsFeedBridgeComponentImpl, 3), new qx2(newsFeedBridgeComponentImpl, i2), new rx2(newsFeedBridgeComponentImpl, i2), new sx2(newsFeedBridgeComponentImpl, i2), new yaa(newsFeedBridgeComponentImpl, 4), newsFeedBridgeComponentImpl.f);
            case 7:
                ShutterButton shutterButton = (ShutterButton) r3;
                float f = ShutterButton.L;
                return new GestureDetector(shutterButton.getContext(), shutterButton);
            case 8:
                try {
                    z = ((NetworkComponent) ((grk0) r3).c().a(fpf0.a(NetworkComponent.class))).vd().g().l;
                } catch (IllegalStateException unused2) {
                    b260.o.getClass();
                    z = b260.p.l;
                }
                return Boolean.valueOf(!z);
            case 9:
                bhl0 bhl0Var = (bhl0) r3;
                Trace.beginSection(ndp0.f("lazy StorageManager.searchStorageManager"));
                try {
                    return new dzh0(bhl0Var.B());
                } finally {
                    Trace.endSection();
                }
            case 10:
                VKApplication.a aVar = VKApplication.c;
                ((ph20) ((bpn0) r3).getValue()).c();
                return s3q0.a;
            case 11:
                if (((qks0) r3).a) {
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_MOTION_LAYOUT_LIGHT;
                    videoFeatures.getClass();
                    r1 = com.vk.toggle.b.A.a(videoFeatures);
                }
                return Boolean.valueOf(r1);
            case 12:
                return new NspkSearchBanksFeatureComponentImpl.a(((jau0) r3).b);
            default:
                qcy<Object>[] qcyVarArr3 = VoipAnalyticsInternalComponent.b;
                return new j1x0((und0) r3);
        }
    }
}
