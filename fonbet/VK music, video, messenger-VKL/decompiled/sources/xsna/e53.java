package xsna;

import com.vk.cachecontrol.api.CacheComponent;
import com.vk.cachecontrol.api.CacheTarget;
import com.vk.catalog.mvi.block.video.impl.di.CatalogVideoViewComponentImpl;
import com.vk.clips.editor.templates.impl.di.ClipsTemplatesEditorComponentBase;
import com.vk.core.ui.di.StatComponentImpl;
import com.vk.documents.impl.di.DocumentsComponentImpl;
import com.vk.ecomm.moderation.impl.restrictions.di.ModerationComponentImpl;
import com.vk.im.engine.di.lifecycle.ImEngineLifecycleComponentImpl;
import com.vk.superapp.multiaccount.api.MultiAccountComponent;
import com.vk.toggle.features.CoreFeatures;
import com.vk.video.playlist.common.di.PlaylistComponentImpl;
import com.vk.video.ui.smartcrop.impl.di.SmartCropComponentImpl;
import com.vkontakte.android.VKApplication;
import kotlin.Result;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class e53 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ e53(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Object failure;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(com.vk.toggle.b.A.a(CoreFeatures.NEW_DEEPLINK_ROUTER));
            case 1:
                return new ucg0();
            case 2:
                qcy<Object>[] qcyVarArr = CatalogVideoViewComponentImpl.y;
                bpn0 bpn0Var = fxc0.a;
                return (g7s0) (bpn0Var != null ? bpn0Var : null).getValue();
            case 3:
                qcy<Object>[] qcyVarArr2 = ClipsTemplatesEditorComponentBase.d;
                return new e9f();
            case 4:
                return new DocumentsComponentImpl.a(0);
            case 5:
                o260 o260Var = d260.a;
                return (o260Var != null ? o260Var : null).h();
            case 6:
                return new ImEngineLifecycleComponentImpl.a();
            case 7:
                return new yyy();
            case 8:
                try {
                    dgn0.d();
                    failure = ((MultiAccountComponent) m7m.e().a(fpf0.a(MultiAccountComponent.class))).d().d();
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                return (com.vk.superapp.multiaccount.api.c) (failure instanceof Result.Failure ? null : failure);
            case 9:
                return new ModerationComponentImpl.a();
            case 10:
                VKApplication.a aVar = VKApplication.c;
                int i = 9;
                ((CacheComponent) m7m.e().a(fpf0.a(CacheComponent.class))).yc().c(new wc(CacheTarget.OTHER, "RLottieWrapper", new s12(i), new tog(i)));
                return s3q0.a;
            case 11:
                return new PlaylistComponentImpl.a();
            case 12:
                return new StatComponentImpl.a();
            case 13:
                return new SmartCropComponentImpl.a();
            case 14:
                return asu0.e;
            case 15:
                return new s4x0(com.vk.voip.ui.c.b);
            default:
                return new cit();
        }
    }

    public /* synthetic */ e53(VKApplication vKApplication) {
        this.b = 10;
    }
}
