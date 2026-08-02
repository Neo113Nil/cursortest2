package xsna;

import android.os.Handler;
import android.os.Looper;
import com.vk.catalog.mvi.section.impl.di.CatalogInteractorComponentImpl;
import com.vk.ecomm.cart.impl.di.CartInternalComponent;
import com.vk.ecomm.verifiedseller.impl.di.VerifiedSellerComponentImpl;
import com.vk.emailactualization.impl.di.EmailActualizationComponentImpl;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.im.engine.di.executor.ImCmdCoroutinesExecutorComponentImpl;
import com.vk.menu.di.MenuComponent;
import com.vk.method.selector.impl.MethodSelectorComponentImpl;
import com.vk.photos.root.di.PhotosComponentImpl;
import com.vk.repository.di.DataRepositoryComponentImpl;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.writebar.di.VkDialogDraftUpdaterComponent;
import com.vkontakte.android.task.di.components.MenuComponentImpl;
import java.util.concurrent.ExecutorService;
import kotlin.collections.EmptySet;
import okhttp3.o;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class s65 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ s65(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = 0;
        switch (this.b) {
            case 0:
                return new Handler(Looper.getMainLooper());
            case 1:
                return new oaw(0);
            case 2:
                com.vk.contacts.c cVar = com.vk.contacts.c.b;
                return Boolean.TRUE;
            case 3:
                return new ImCmdCoroutinesExecutorComponentImpl.a();
            case 4:
                qcy<Object>[] qcyVarArr = MenuComponentImpl.d;
                return com.vk.menu.presentation.entity.a.a;
            case 5:
                return ((MenuComponent) ((k7m) m7m.f(new w7m())).a(fpf0.a(MenuComponent.class))).Sa();
            case 6:
                return EmptySet.b;
            case 7:
                return new CatalogInteractorComponentImpl.a();
            case 8:
                return Boolean.valueOf(com.vk.toggle.d.p().a);
            case 9:
                qcy<Object>[] qcyVarArr2 = PhotosComponentImpl.u;
                return new rga0();
            case 10:
                FeedFeatures feedFeatures = FeedFeatures.FEED_APPLOVIN_PRELOAD_CONFIG;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 11:
                return new EmailActualizationComponentImpl.a();
            case 12:
                return new CartInternalComponent.a(new e6k0(i));
            case 13:
                qcy<Object>[] qcyVarArr3 = VerifiedSellerComponentImpl.c;
                return new xnr0();
            case 14:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_PLAYLIST_BOTTOM_SHEET_REDESIGN;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 15:
                return new VkDialogDraftUpdaterComponent.a();
            case 16:
                return new DataRepositoryComponentImpl.a();
            case 17:
                return new MethodSelectorComponentImpl.a();
            case 18:
                asu0.a.getClass();
                ExecutorService s = asu0.s();
                io.reactivex.rxjava3.core.w wVar = io.reactivex.rxjava3.schedulers.a.a;
                return new io.reactivex.rxjava3.internal.schedulers.d(s, true);
            default:
                o260 o260Var = d260.a;
                if (o260Var == null) {
                    o260Var = null;
                }
                o.a f = o260Var.f(NetworkClient.ClientType.CLIENT_WEB);
                afx0 afx0Var = afx0.a;
                f.k = afx0.a(true);
                return new okhttp3.o(f);
        }
    }
}
