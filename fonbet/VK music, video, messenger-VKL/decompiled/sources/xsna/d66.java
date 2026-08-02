package xsna;

import android.view.View;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.user.RequestUserProfile;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.ui.components.chat_profile.interactors.UserProfileAvatarsInteractor;
import com.vk.superapp.ads.js.bridge.impl.di.JsAdsDelegateComponentImpl;
import com.vk.superapp.advertisement.api.di.fullscreen_ad.FullscreenAdFactoryComponent;
import com.vk.superapp.advertisement.api.di.sticky_banner_ad.StickyBannerAdFactoriesComponent;
import com.vk.superapp.advertisement.formats.api.AdvertisementOptionalFormatsComponent;
import com.vk.superapp.api.exceptions.AuthException;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.fss;
import xsna.r7k0;
import xsna.uxd0;
import xsna.xxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class d66 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d66(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        ImageList imageList;
        gzs<s3q0> gzsVar = null;
        switch (this.b) {
            case 0:
                e66 e66Var = (e66) this.c;
                vgg vggVar = (vgg) this.d;
                String str = (String) this.e;
                x65 y = e66Var.y();
                Throwable th = vggVar.a;
                if (y != null) {
                    if ((th instanceof AuthException.ExchangeSilentTokenException) && ((AuthException.ExchangeSilentTokenException) th).d()) {
                        int i = 7;
                        if (y instanceof a66) {
                            gzsVar = new com.vk.movika.sdk.base.model.b(y, 7);
                        } else if (y instanceof jbl) {
                            gzsVar = new com.vk.movika.sdk.base.model.e(y, 4);
                        } else if (y instanceof c7v0) {
                            gzsVar = new bb(y, 7);
                        } else if (y instanceof com.vk.auth.verification.base.a) {
                            gzsVar = new cb(y, i);
                        }
                    }
                    if (str != null) {
                        y.wa(str, gzsVar, gzsVar);
                    } else {
                        y.qi(e66Var.k.getString(R.string.vk_auth_error));
                        if (gzsVar != null) {
                            gzsVar.invoke();
                        }
                    }
                } else {
                    par0.a.getClass();
                    par0.b("View is null! onExchangeSilentTokenError(" + str + ')');
                }
                break;
            case 1:
                i2c.d((wh50) this.c, (wh50) this.d, (wh50) this.e);
                break;
            case 2:
                u0s u0sVar = (u0s) this.c;
                ((io.reactivex.rxjava3.disposables.b) this.e).b(itg0.l(u0sVar.c.p(u0sVar.b, null, Collections.singletonList(Long.valueOf(((DialogExt) this.d).e)), EmptyList.b)));
                break;
            case 3:
                AdvertisementOptionalFormatsComponent advertisementOptionalFormatsComponent = (AdvertisementOptionalFormatsComponent) this.c;
                StickyBannerAdFactoriesComponent stickyBannerAdFactoriesComponent = (StickyBannerAdFactoriesComponent) this.d;
                FullscreenAdFactoryComponent fullscreenAdFactoryComponent = (FullscreenAdFactoryComponent) this.e;
                qcy<Object>[] qcyVarArr = JsAdsDelegateComponentImpl.e;
                List<? extends bxs> m = e43.m(advertisementOptionalFormatsComponent.x5());
                EmptyList emptyList = EmptyList.b;
                com.vk.superapp.advertisement.api.di.sticky_banner_ad.b R7 = stickyBannerAdFactoriesComponent.R7();
                break;
            case 4:
                r7k0.a aVar = (r7k0.a) this.c;
                lss<fss> lssVar = ((t7k0) this.d).c;
                RequestUserProfile requestUserProfile = (RequestUserProfile) this.e;
                if (!epx.f(aVar, r7k0.a.e.a)) {
                    if (requestUserProfile.d()) {
                        lssVar.a(new fss.b.c(requestUserProfile));
                        break;
                    }
                } else {
                    lssVar.a(new fss.e(requestUserProfile));
                    break;
                }
                break;
            default:
                ioq0 ioq0Var = (ioq0) this.c;
                uxd0.a.InterfaceC3848a interfaceC3848a = (uxd0.a.InterfaceC3848a) this.d;
                View view = (View) this.e;
                xxd0 c = ioq0Var.j.c();
                xxd0.b bVar = c instanceof xxd0.b ? (xxd0.b) c : null;
                if (bVar != null && (imageList = bVar.k) != null) {
                    if (!imageList.Jb()) {
                        imageList = null;
                    }
                    if (imageList != null) {
                        ioq0Var.e(io.reactivex.rxjava3.kotlin.c.g(interfaceC3848a.o(UserProfileAvatarsInteractor.a(ioq0Var.x, com.vk.dto.common.a.b(ioq0Var.c.f))), new u2y(ioq0Var, view, imageList, 3), null, 2));
                        break;
                    }
                }
                break;
        }
        return s3q0.a;
    }
}
