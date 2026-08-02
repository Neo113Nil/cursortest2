package xsna;

import android.widget.FrameLayout;
import androidx.media3.exoplayer.dash.DashMediaSource;
import com.ironsource.adapters.fyber.banner.FyberBannerAdapter;
import com.ironsource.adapters.yandex.banner.YandexBannerAdapter;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.vk.attachpicker.impl.a;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.photo.editor.PhotoEditorView;
import java.io.IOException;
import one.video.calls.sdk_private.bF;
import xsna.ppr0;
import xsna.vcn;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class q44 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q44(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qap qapVar;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                com.vk.attachpicker.impl.a aVar = (com.vk.attachpicker.impl.a) obj;
                aVar.n(aVar.Z);
                aVar.o();
                if (aVar.j.M != 5) {
                    a.m mVar = aVar.s;
                    if (!mVar.k) {
                        mVar.k = true;
                        mVar.notifyDataSetChanged();
                        break;
                    }
                }
                break;
            case 1:
                ((nk9) obj).getClass();
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    o1b0.b(qu5.c(), null, 3);
                } catch (Throwable th) {
                    com.vk.metrics.eventtracking.b.a.a(th);
                    L.i(th);
                }
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"players pool was purged (" + qu5.c().d() + "), delay=" + currentTimeMillis2 + " ms"});
                    break;
                }
                break;
            case 2:
                FrameLayout frameLayout = ((ynb) obj).o;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                    break;
                }
                break;
            case 3:
                ((syc) obj).d();
                break;
            case 4:
                qcy<Object>[] qcyVarArr = kse.n1;
                ((kse) obj).hide();
                break;
            case 5:
                DashMediaSource dashMediaSource = (DashMediaSource) obj;
                dashMediaSource.getClass();
                try {
                    dashMediaSource.y(false);
                    break;
                } catch (Exception e) {
                    dashMediaSource.C = new IOException(e);
                    return;
                }
            case 6:
                myc0.h(null, null, null, new vcn.b((izs) obj, null), 3);
                break;
            case 7:
                FyberBannerAdapter.destroyAd$lambda$2((FyberBannerAdapter) obj);
                break;
            case 8:
                ((PhotoEditorView) obj).j.setVisibility(4);
                break;
            case 9:
                ((gzs) obj).invoke();
                break;
            case 10:
                umm0 umm0Var = (umm0) obj;
                o3e0 o3e0Var = umm0Var.c;
                if (o3e0Var != null && (qapVar = o3e0Var.a) != null) {
                    qapVar.b();
                }
                umm0Var.i.removeMessages(0);
                break;
            case 11:
                ((IUnityAdsTokenListener) obj).onUnityAdsTokenReady(null);
                break;
            case 12:
                n6q0.setupAnimation$lambda$2((n6q0) obj);
                break;
            case 13:
                ppr0.a aVar2 = ((ppr0) obj).h;
                if (aVar2 != null) {
                    aVar2.e();
                    break;
                }
                break;
            case 14:
                ((h84) obj).invoke();
                break;
            case 15:
                YandexBannerAdapter.destroyBannerViewAd$lambda$2((YandexBannerAdapter) obj);
                break;
            case 16:
                ((bF) obj).q();
                break;
            default:
                com.vungle.ads.internal.executor.j.a((com.vungle.ads.internal.executor.j) obj);
                break;
        }
    }

    public /* synthetic */ q44(vcn vcnVar, izs izsVar) {
        this.b = 6;
        this.c = izsVar;
    }
}
