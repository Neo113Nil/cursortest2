package xsna;

import com.vk.clips.upload.vk.impl.di.ClipsUploadVkComponentImpl;
import com.vk.contacts.e;
import com.vk.core.preference.Preference;
import com.vk.ecomm.market.impl.ctabutton.di.ProductTileCtaButtonComponentImpl;
import com.vk.editor.di.StoryEditorExtDepsComponentImpl;
import com.vk.im.engine.di.sync.VkAppSynchronizationComponentImpl;
import com.vk.location.common.LocationCommon;
import com.vk.oauth.di.OAuthComponentImpl;
import com.vk.stat.di.StatComponent;
import com.vk.superapp.miniapps.impl.di.SuperAppMiniAppsComponentImpl;
import com.vk.video.ui.slider.impl.VideoSliderHolderComponentImpl;
import com.vk.video.ui.upload.impl.di.UploadComponentImpl;
import com.vkontakte.android.VKApplication;
import java.util.concurrent.Executors;
import kotlin.Result;
import xsna.pzv;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class rq6 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ rq6(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Object failure;
        switch (this.b) {
            case 0:
                return new a390();
            case 1:
                qcy<Object>[] qcyVarArr = ClipsUploadVkComponentImpl.h;
                return new ygf();
            case 2:
                return new e.a();
            case 3:
                return new StoryEditorExtDepsComponentImpl.a();
            case 4:
                throw null;
            case 5:
                pzv.a aVar = pzv.x0;
                return 500;
            case 6:
                return new VkAppSynchronizationComponentImpl.a();
            case 7:
                return fxc0.B();
            case 8:
                qcy<Object>[] qcyVarArr2 = OAuthComponentImpl.c;
                return new co70();
            case 9:
                try {
                    dgn0.d();
                    failure = ((StatComponent) m7m.e().a(fpf0.a(StatComponent.class))).z4();
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                return (fdh0) (failure instanceof Result.Failure ? null : failure);
            case 10:
                return new ProductTileCtaButtonComponentImpl.a();
            case 11:
                return new wuq();
            case 12:
                return Preference.f("another_user_toggles_meta");
            case 13:
                VKApplication.a aVar2 = VKApplication.c;
                return m7m.e();
            case 14:
                VKApplication.a aVar3 = VKApplication.c;
                x7r0 x7r0Var = new x7r0();
                LocationCommon.a.getClass();
                LocationCommon.c.a = x7r0Var;
                return s3q0.a;
            case 15:
                return new SuperAppMiniAppsComponentImpl.a();
            case 16:
                return new VideoSliderHolderComponentImpl.a();
            case 17:
                return new UploadComponentImpl.a();
            case 18:
                com.vk.voip.ui.c.b.getClass();
                return new k570((apv) com.vk.voip.ui.c.w0.getValue());
            case 19:
                return new sit();
            default:
                return Executors.newSingleThreadScheduledExecutor();
        }
    }

    public /* synthetic */ rq6(VKApplication vKApplication, int i) {
        this.b = i;
    }
}
