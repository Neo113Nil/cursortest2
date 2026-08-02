package xsna;

import com.vk.catalog.mvi.block.impl.di.CatalogViewComponentImpl;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.performance.network.NetworkPerformanceMeasurer;
import com.vk.core.preference.Preference;
import com.vk.ecomm.market.api.ctabutton.di.ProductTileCtaButtonComponent;
import com.vk.ecomm.storefront.impl.di.StorefrontComponentImpl;
import com.vk.games.di.GamesCatalogComponentImpl;
import com.vk.im.business.notifications.impl.BusinessNotificationComponentImpl;
import com.vk.mediastore.storage.MediaStorage;
import com.vk.music.di.MusicBroadcastManagerComponentImpl;
import com.vk.toggle.data.ImageQualitySuppressionLevel;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.clips.ClipsViewerSideControlsConfigComponentVkApp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import org.chromium.base.TimeUtils;
import xsna.sr10;
import xsna.usi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class via implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ via(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        dk0 b;
        switch (this.b) {
            case 0:
                qcy<Object>[] qcyVarArr = CatalogViewComponentImpl.g;
                return new dg50();
            case 1:
                return new ClipsViewerSideControlsConfigComponentVkApp.a();
            case 2:
                qcy<Object>[] qcyVarArr2 = GamesCatalogComponentImpl.s;
                return new act();
            case 3:
                return "#changeConfig no changes, do nothing";
            case 4:
                t6g0 t6g0Var = t6g0.b;
                return t6g0.d();
            case 5:
                if (!com.vk.toggle.d.D() || (b = com.vk.toggle.d.X.b()) == null) {
                    return jgp.b;
                }
                int i = b.b;
                sr10.a aVar = new sr10.a(ImageQualitySuppressionLevel.NONE, true);
                return pn00.k(new Pair(NetworkPerformanceMeasurer.NetworkClass.BAD_NETWORK_CLASS, new sr10.a(i % 2 == 0 ? ImageQualitySuppressionLevel.MEDIUM : ImageQualitySuppressionLevel.HIGH, i != 2)), new Pair(NetworkPerformanceMeasurer.NetworkClass.SO_SO_NETWORK_CLASS, new sr10.a(i < 2 ? ImageQualitySuppressionLevel.LOW : ImageQualitySuppressionLevel.MEDIUM, true)), new Pair(NetworkPerformanceMeasurer.NetworkClass.GOOD_NETWORK_CLASS, aVar));
            case 6:
                if (!Preference.d("stories_cache_migration", "stories_cache_migrated", false)) {
                    e8r.a.a(PrivateSubdir.VIDEO, null);
                    Preference.I("stories_cache_migration", "stories_cache_migrated", true);
                }
                MediaStorage mediaStorage = MediaStorage.b;
                return MediaStorage.b(TimeUtils.MILLISECONDS_PER_DAY, "stories");
            case 7:
                return new MusicBroadcastManagerComponentImpl.a();
            case 8:
                ComFeatures comFeatures = ComFeatures.COM_POST_REACTION_DONUT;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 9:
                qcy<Object>[] qcyVarArr3 = StorefrontComponentImpl.b;
                return new sml0();
            case 10:
                VKApplication.a aVar2 = VKApplication.c;
                return ((ProductTileCtaButtonComponent) m7m.e().a(fpf0.a(ProductTileCtaButtonComponent.class))).v6();
            case 11:
                VKApplication.a aVar3 = VKApplication.c;
                return m7m.e();
            case 12:
                return dhr0.q0(dhr0.c.a.c);
            case 13:
                VideoFeatures videoFeatures = VideoFeatures.PREPARE_ON_ERROR;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 14:
                return new BusinessNotificationComponentImpl.a();
            default:
                return new fcd0() { // from class: xsna.lcu0
                    @Override // xsna.ayi0
                    public final void a(uxi0 uxi0Var) {
                        List<usi0> list = uxi0Var.b;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            if (obj instanceof usi0.a) {
                                arrayList.add(obj);
                            }
                        }
                        ArrayList c = an00.c(arrayList);
                        vx2.a.getClass();
                        vx2.b().j(c);
                    }
                };
        }
    }

    public /* synthetic */ via(VKApplication vKApplication, int i) {
        this.b = i;
    }
}
