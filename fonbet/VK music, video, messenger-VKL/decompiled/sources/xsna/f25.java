package xsna;

import android.content.Context;
import com.vk.auth.oauth.component.impl.di.OAuthUiComponentImpl;
import com.vk.auth.oauth.di.OAuthComponent;
import com.vk.catalog.mvi.block.video.impl.di.CatalogVideoViewComponentImpl;
import com.vk.core.preference.Preference;
import com.vk.di.scope.SingletonScope;
import com.vk.libvideo.adfree.api.di.VideoAdFreeSubscriptionComponent;
import com.vk.network.eventhub.impl.di.EventHubApiComponent;
import com.vk.pushes.PushComponent;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.AuthBridgeComponentImpl;
import java.io.File;
import java.lang.reflect.Field;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class f25 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f25(OAuthUiComponentImpl oAuthUiComponentImpl, OAuthComponent oAuthComponent) {
        this.b = 3;
        this.c = oAuthComponent;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        ?? r2 = this.c;
        switch (i) {
            case 0:
                return ((PushComponent) ((AuthBridgeComponentImpl) r2).f.getValue()).sc();
            case 1:
                qcy<Object>[] qcyVarArr = CatalogVideoViewComponentImpl.y;
                return ((VideoAdFreeSubscriptionComponent) r2.getValue()).h1();
            case 2:
                return dwx0.h(((xsl) r2).a);
            case 3:
                qcy<Object>[] qcyVarArr2 = OAuthUiComponentImpl.b;
                q55 q55Var = q55.a;
                com.vk.auth.main.a c = q55.c();
                return new ao70(c.b, c.a, ((OAuthComponent) r2).B8());
            case 4:
                return Preference.h((Context) r2, 0, "session_management_unencrypted");
            case 5:
                VKApplication vKApplication = (VKApplication) r2;
                VKApplication.a aVar = VKApplication.c;
                Field field = mcr0.a;
                File[] fileArr = {new File(vKApplication.getCacheDir(), "fresco_cache"), new File(vKApplication.getCacheDir(), "fresco_sticker_cache")};
                long j = 0;
                for (int i2 = 0; i2 < 2; i2++) {
                    j += com.vk.core.files.a.I(fileArr[i2]);
                }
                return Long.valueOf(j);
            case 6:
                nmg0 e = m7m.e();
                return ((EventHubApiComponent) e.a.f(SingletonScope.a).d.b(fpf0.a(EventHubApiComponent.class), (l9i) ((jau0) r2).f.getValue())).Df();
            default:
                return new l53(((o2v0) r2).e());
        }
    }

    public /* synthetic */ f25(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
