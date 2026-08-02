package xsna;

import android.app.Activity;
import android.content.Context;
import com.ironsource.adapters.fyber.interstitial.FyberInterstitialAdapter;
import com.ironsource.adapters.yandex.interstitial.YandexInterstitialAdapter;
import com.my.tracker.obfuscated.e0;
import com.vk.billing.StorePurchasesManager;
import com.vk.log.L;
import com.vk.video.ui.catalog.VideoCatalogFragment;
import java.util.List;
import java.util.concurrent.Executor;
import ru.ok.android.webrtc.animoji.recv.AnimojiRecvDataPackage;
import ru.ok.android.webrtc.animoji.render.AnimojiRenderDispatch;
import xsna.g73;
import xsna.ub9;
import xsna.wym0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class vr2 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vr2(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e73 e73Var = null;
        switch (this.b) {
            case 0:
                AnimojiRenderDispatch.a((AnimojiRenderDispatch) this.c, (AnimojiRecvDataPackage) this.d);
                return;
            case 1:
                z63 z63Var = (z63) this.c;
                g73 g73Var = (g73) this.d;
                try {
                    e73Var = (e73) f73.class.getDeclaredConstructor(gzs.class, String.class).newInstance(new sa0(g73Var, 6), g73Var.d.Z());
                } catch (ClassNotFoundException unused) {
                }
                L.e("[ExternalAdsDynamicLibLoader]", "Use AppLovin stub module");
                z63Var.invoke(new g73.a.b.C2919b(e73Var));
                return;
            case 2:
                vo9 vo9Var = (vo9) this.c;
                ub9.a aVar = (ub9.a) this.d;
                if (vo9Var.f != null) {
                    Executor executor = vo9Var.d;
                    if (executor instanceof li9) {
                        li9 li9Var = (li9) executor;
                        synchronized (li9Var.b) {
                            try {
                                if (!li9Var.c.isShutdown()) {
                                    li9Var.c.shutdown();
                                }
                            } finally {
                            }
                        }
                    }
                    vo9Var.f.quit();
                    aVar.b(null);
                    return;
                }
                return;
            case 3:
                ((tge) this.c).setItems((List) this.d);
                return;
            case 4:
                Context context = (Context) this.c;
                new wym0(context, (wym0.a) this.d).h(context);
                return;
            case 5:
                FyberInterstitialAdapter.showAd$lambda$2((FyberInterstitialAdapter) this.c, (Activity) this.d);
                return;
            case 6:
                p570 p570Var = (p570) this.c;
                bfm bfmVar = (bfm) this.d;
                p570Var.a();
                bfmVar.invoke();
                return;
            case 7:
                com.vk.billing.h hVar = (com.vk.billing.h) this.c;
                nge0 nge0Var = (nge0) this.d;
                StorePurchasesManager.a<D> aVar2 = hVar.e;
                if (aVar2 != 0) {
                    aVar2.c(hVar.d, nge0Var);
                    return;
                }
                return;
            case 8:
                VideoCatalogFragment videoCatalogFragment = (VideoCatalogFragment) this.c;
                String str = (String) this.d;
                int i = VideoCatalogFragment.l0;
                videoCatalogFragment.ho(str);
                return;
            case 9:
                YandexInterstitialAdapter.showAd$lambda$3((YandexInterstitialAdapter) this.c, (Activity) this.d);
                return;
            case 10:
                ((com.my.tracker.obfuscated.e0) this.c).b((e0.a) this.d);
                return;
            default:
                ((yads.pk0) this.c).d((yads.qk0) this.d);
                return;
        }
    }
}
