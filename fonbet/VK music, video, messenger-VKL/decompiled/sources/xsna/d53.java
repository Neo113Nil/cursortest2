package xsna;

import com.vk.cachecontrol.impl.CacheComponentImpl;
import com.vk.ecomm.categories.impl.di.MarketCategoriesComponentImpl;
import com.vk.im.engine.di.scope.ImFeatureScopeProviderComponentImpl;
import com.vk.libvideo.impl.di.VkVideoBackgroundViewStatDelegateComponentImpl;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.SaFeatures;
import com.vk.voip.api.di.VoipCallComponent;
import com.vkontakte.android.task.di.components.CommonCameraComponent;
import java.util.HashSet;
import kotlin.collections.EmptyList;
import xsna.xgx0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class d53 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ d53(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(com.vk.toggle.b.A.a(SaFeatures.SA_GAMES_FRIENDLY_URL_DEEPLINK));
            case 1:
                return EmptyList.b;
            case 2:
                return new ImFeatureScopeProviderComponentImpl.a();
            case 3:
                return Boolean.valueOf(MusicFeatures.OFFLINE_PENDING_UI.h());
            case 4:
                return new MarketCategoriesComponentImpl.a();
            case 5:
                qcy<Object>[] qcyVarArr = StoriesComponentImpl.N;
                return new lul0(0);
            case 6:
                return new CommonCameraComponent.a();
            case 7:
                return new CacheComponentImpl.a();
            case 8:
                return new VkVideoBackgroundViewStatDelegateComponentImpl.a();
            case 9:
                return asu0.b;
            case 10:
                return ((VoipCallComponent) ((k7m) m7m.f(com.vk.voip.ui.c.b)).a(fpf0.a(VoipCallComponent.class))).ca();
            case 11:
                return new pit();
            default:
                xgx0.c[] cVarArr = {new xgx0.d()};
                HashSet hashSet = new HashSet(on00.e(1));
                rl3.p0(cVarArr, hashSet);
                return new xgx0.a(hashSet);
        }
    }
}
