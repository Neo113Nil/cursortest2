package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.fintechsdk.flows.payment.kit.api.model.Payer;
import com.yandex.go.navigator.repository.o;
import com.yandex.go.preorder.lifecycle.r;
import com.yandex.go.trusted_contacts.data.repositories.a;
import com.ybsdk.feature.ui.stat.internal.data.network.UiStatEventsApi;
import com.ybsdk.network.Api;
import com.ybsdk.rconfig.SimpleIdValidation;
import com.ybsdk.rconfig.YbCommonUrlsImpl;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.YbVideoPlayerConfig;
import com.ybsdk.screens.upgrade.presentation.edit.UpgradeEditFragment;
import com.ybsdk.screens.upgrade.presentation.main.UpgradeFragment;
import ru.yandex.taxi.preorder.interactor.g;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes3.dex */
public final class nb11 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ nb11(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    public static nb11 a(eqh eqhVar) {
        return new nb11(eqhVar, 0);
    }

    public static nb11 b(eqh eqhVar) {
        return new nb11(eqhVar, 26);
    }

    public static pm31 c(b bVar) {
        YbVideoPlayerConfig ybVideoPlayerConfig = (YbVideoPlayerConfig) bVar.d(hy51.a).getData();
        int exoLoadControlBufferForPlaybackMs = ybVideoPlayerConfig.getExoLoadControlBufferForPlaybackMs();
        if (exoLoadControlBufferForPlaybackMs < 0) {
            exoLoadControlBufferForPlaybackMs = 0;
        }
        int exoLoadControlBufferForPlaybackAfterRebufferMS = ybVideoPlayerConfig.getExoLoadControlBufferForPlaybackAfterRebufferMS();
        int i = exoLoadControlBufferForPlaybackAfterRebufferMS >= 0 ? exoLoadControlBufferForPlaybackAfterRebufferMS : 0;
        int exoLoadControlMinBufferMs = ybVideoPlayerConfig.getExoLoadControlMinBufferMs();
        if (exoLoadControlMinBufferMs < exoLoadControlBufferForPlaybackMs) {
            exoLoadControlMinBufferMs = exoLoadControlBufferForPlaybackMs;
        }
        if (exoLoadControlMinBufferMs < i) {
            exoLoadControlMinBufferMs = i;
        }
        int exoLoadControlMaxBufferMs = ybVideoPlayerConfig.getExoLoadControlMaxBufferMs();
        if (exoLoadControlMaxBufferMs < exoLoadControlMinBufferMs) {
            exoLoadControlMaxBufferMs = exoLoadControlMinBufferMs;
        }
        return new pm31(exoLoadControlMinBufferMs, exoLoadControlMaxBufferMs, exoLoadControlBufferForPlaybackMs, i);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new mb11((pho) xvf0Var.get());
            case 1:
                return new cu1((rqo) xvf0Var.get(), 2);
            case 2:
                return new zg11((a) xvf0Var.get());
            case 3:
                return new z7b((com.yandex.messaging.internal.authorized.chat.b) xvf0Var.get());
            case 4:
                h9g h9gVar = (h9g) ((tw51) xvf0Var.get());
                x8g x8gVar = h9gVar.v;
                nbp0 nbp0Var = (nbp0) x8gVar.u.get();
                q5z.h(nbp0Var);
                t0k0 s = h9gVar.s();
                q5z.h(s);
                return new ot11(new com.ybsdk.feature.ui.stat.internal.domain.a(nbp0Var, new com.ybsdk.feature.ui.stat.internal.data.a((UiStatEventsApi) s.b(UiStatEventsApi.class)), new bwb0((b) x8gVar.A.get()), new el11(1, (y1r0) x8gVar.R.get())), new qt11());
            case 5:
                return new b021((c021) xvf0Var.get());
            case 6:
                return new y221((x22) xvf0Var.get());
            case 7:
                return new ol3((Activity) xvf0Var.get());
            case 8:
                return new w421((pho) xvf0Var.get());
            case 9:
                return new o521((e) xvf0Var.get());
            case 10:
                return new r((g) xvf0Var.get());
            case 11:
                return new UpgradeEditFragment((tw51) xvf0Var.get());
            case 12:
                return new UpgradeFragment((tw51) xvf0Var.get());
            case 13:
                b bVar = (b) xvf0Var.get();
                yxf0 yxf0Var = new yxf0();
                com.ybsdk.rconfig.a aVar = bVar.i;
                yxf0Var.a = (YbCommonUrlsImpl) bVar.d(aVar.e).getData();
                yxf0Var.b = (YbCommonUrlsImpl) aVar.e.c.getData();
                return yxf0Var;
            case 14:
                b bVar2 = (b) xvf0Var.get();
                SimpleIdValidation simpleIdValidation = (SimpleIdValidation) bVar2.d(bVar2.i.f).getData();
                q5z.i(simpleIdValidation);
                return simpleIdValidation;
            case 15:
                return new com.ybsdk.screens.upgrade.data.a((Api) xvf0Var.get());
            case 16:
                return new sh21((x22) xvf0Var.get());
            case 17:
                return new abe((Context) xvf0Var.get(), false, false);
            case 18:
                return new o((ho21) xvf0Var.get());
            case 19:
                return new ih01((pho) xvf0Var.get());
            case 20:
                return new rz0((rqo) xvf0Var.get(), 9);
            case 21:
                return new o7r0((pho) xvf0Var.get());
            case 22:
                return new mu21((Payer) xvf0Var.get());
            case 23:
                return new ag31((pho) xvf0Var.get());
            case 24:
                return new j00((ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e) xvf0Var.get());
            case 25:
                return c((b) xvf0Var.get());
            case 26:
                return new to31((pho) xvf0Var.get());
            case 27:
                return new pu31((x22) xvf0Var.get());
            case 28:
                return new dz31((Context) xvf0Var.get());
            default:
                return new rp41((gff) xvf0Var.get());
        }
    }

    public /* synthetic */ nb11(Object obj, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }
}
