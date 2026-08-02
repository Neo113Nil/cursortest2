package xsna;

import android.os.Environment;
import com.vk.camera.clips.impl.di.CameraClipsComponentBase;
import com.vk.clips.precache.impl.di.ClipsPrecacheRecyclerComponentImpl;
import com.vk.dialogsscreen.api.DialogsScreenFeatureComponent;
import com.vk.ecomm.catalog.impl.di.MarketCatalogComponent;
import com.vk.games.di.GamesCatalogComponentImpl;
import com.vk.log.L;
import com.vk.music.player.cache.MusicPlayerCacheComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.VKApplication;
import com.vungle.ads.internal.protos.Sdk;
import xsna.pyk0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class zg9 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ zg9(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        boolean z = false;
        switch (this.b) {
            case 0:
                qcy<Object>[] qcyVarArr = CameraClipsComponentBase.i;
                return new rtd();
            case 1:
                return new ClipsPrecacheRecyclerComponentImpl.a();
            case 2:
                com.vk.clips.upload.vk.impl.uploader.c.h = true;
                com.vk.clips.upload.vk.impl.uploader.c.e.b(new xdf(null == true ? 1 : 0));
                L.e("ClipsController", "load uploads from cache, ids=" + j5g.g0(zik0.d(com.vk.clips.upload.vk.impl.uploader.c.d), ", ", null, null, 0, null, 62));
                return s3q0.a;
            case 3:
                qcy<Object>[] qcyVarArr2 = GamesCatalogComponentImpl.s;
                return new cct();
            case 4:
                o2l.a.getClass();
                String c = o2l.c("__dbg_vkid_suspicious_auth_test", "");
                if (drm0.N(c)) {
                    return null;
                }
                return c;
            case 5:
                return new j1v0();
            case 6:
                return ((DialogsScreenFeatureComponent) ((k7m) m7m.f(m820.b)).a(fpf0.a(DialogsScreenFeatureComponent.class))).g7();
            case 7:
                return new MusicPlayerCacheComponentImpl.a();
            case 8:
                return e43.l(Integer.valueOf(cn70.b(72)), Integer.valueOf(cn70.b(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE)), -1);
            case 9:
                return Integer.valueOf(com.vk.toggle.d.b());
            case 10:
                return new com.vk.metrics.reporters.a();
            case 11:
                try {
                    z = epx.f(Environment.getExternalStorageState(), "mounted");
                } catch (Exception unused) {
                }
                return Boolean.valueOf(z);
            case 12:
                return pyk0.a.a;
            case 13:
                VKApplication.a aVar = VKApplication.c;
                return ((MarketCatalogComponent) m7m.e().a(fpf0.a(MarketCatalogComponent.class))).Df();
            case 14:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_DISCOVERY_AD_BANNER;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 15:
                qng h = com.vk.toggle.d.h();
                return new hzp(h.e, h.f);
            case 16:
                return (String) com.vk.core.apps.a.c("", "com.vkontakte.android.permission.BUILD_SUFFIX_KEY");
            case 17:
                com.vk.voip.ui.c.b.getClass();
                return com.vk.voip.ui.c.j0();
            default:
                return new ejt();
        }
    }

    public /* synthetic */ zg9(VKApplication vKApplication) {
        this.b = 13;
    }
}
