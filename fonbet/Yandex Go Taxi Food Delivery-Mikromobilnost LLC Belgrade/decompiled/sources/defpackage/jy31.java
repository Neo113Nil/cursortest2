package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.Toast;
import androidx.media3.exoplayer.offline.f;
import com.yandex.go.business.impl.router.b;
import com.yandex.go.payments.yangopay.ui.YangoPayWidgetView;
import com.yandex.go.position_alert.WarningModalView;
import com.yandex.go.where_you_are.impl.presentation.d;
import com.yandex.go.yb.c;
import com.yandex.go.yb.domain.n;
import com.yandex.go.yb.domain.t;
import com.yandex.payment.sdk.ui.common.YB2FAObservingWebViewFragment;
import com.yandex.plus.home.feature.webviews.internal.stories.WebStoriesView;
import com.ybsdk.feature.webview.internal.presentation.WebViewFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.yandex.taxi.preorder.source.domain.r;
import ru.yandex.taxi.web.view.WebViewContainerImpl;
import ru.yandex.video.m3.player.impl.YandexPlayerImpl;
import ru.yandex.video.m3.preload_manager.PreloadTrackInfoRepository$FetchRequest$launch$1;
import yads.eb2;
import yads.gp1;
import yads.l03;

/* loaded from: classes7.dex */
public final /* synthetic */ class jy31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jy31(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ye51 ye51Var;
        ArrayList arrayList;
        int i = this.a;
        int i2 = 1;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((f5r0) obj).f.invoke();
                return;
            case 1:
                ((WarningModalView) obj).confirm();
                return;
            case 2:
                uf41 uf41Var = (uf41) obj;
                if (uf41Var != null) {
                    uf41Var.onClose();
                    return;
                }
                return;
            case 3:
                WebStoriesView.hideLoading$lambda$9((WebStoriesView) obj);
                return;
            case 4:
                WebViewContainerImpl.initErrorView$reloadAfterError((hn41) obj);
                return;
            case 5:
                WebViewFragment.render$lambda$23$lambda$21((WebViewFragment) obj);
                return;
            case 6:
                d dVar = (d) obj;
                dVar.h.removeView(dVar.b());
                return;
            case 7:
                ((r) ((e6g) obj).l).g();
                return;
            case 8:
                q851 q851Var = (q851) obj;
                q851Var.a.getAction();
                q851Var.b.c(null);
                return;
            case 9:
                ((AtomicBoolean) obj).set(true);
                return;
            case 10:
                ye51Var = ((YB2FAObservingWebViewFragment) obj).callback;
                if (ye51Var != null) {
                    zbq0 zbq0Var = (zbq0) ye51Var;
                    ((lz40) ((pwf) zbq0Var.b).A.get()).g(zy11.a);
                    zbq0Var.f();
                    return;
                }
                return;
            case 11:
                f fVar = (f) obj;
                PreloadTrackInfoRepository$FetchRequest$launch$1 preloadTrackInfoRepository$FetchRequest$launch$1 = fVar.h;
                preloadTrackInfoRepository$FetchRequest$launch$1.getClass();
                preloadTrackInfoRepository$FetchRequest$launch$1.onPrepared(fVar);
                return;
            case 12:
                ((YandexPlayerImpl) obj).releaseInternal();
                return;
            case 13:
                ((b) obj).r(new qu(9));
                return;
            case 14:
                ((YangoPayWidgetView) obj).invalidate();
                return;
            case 15:
                t tVar = (t) obj;
                tVar.a.q.remove(tVar);
                return;
            case 16:
                n nVar = ((c) obj).G;
                pzt0 pzt0Var = nVar.l;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                nVar.l = null;
                return;
            case 17:
                w071 w071Var = (w071) obj;
                HashMap hashMap = w071Var.e;
                Iterator it = hashMap.entrySet().iterator();
                while (it.hasNext()) {
                    lm61 lm61Var = (lm61) ((Map.Entry) it.next()).getValue();
                    Iterator it2 = lm61Var.a.b.iterator();
                    while (it2.hasNext()) {
                        lw81 lw81Var = (lw81) it2.next();
                        if (lm61Var.c == null) {
                            Drawable drawable = lm61Var.b;
                            if (drawable != null) {
                                lw81Var.a.d(drawable);
                            } else {
                                lw81Var.getClass();
                            }
                        } else {
                            lw81Var.getClass();
                        }
                    }
                }
                hashMap.clear();
                w071Var.g = null;
                return;
            case 18:
                ((bz61) obj).onInitializationCompleted();
                return;
            case 19:
                kj61 kj61Var = (kj61) ((m2v) obj).b;
                synchronized (kj61Var.a) {
                    arrayList = new ArrayList(kj61Var.b);
                    kj61Var.b.clear();
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    lh81 lh81Var = (lh81) it3.next();
                    if (lh81Var != null) {
                        lm71 lm71Var = lh81Var.a;
                        ((ht81) lm71Var.b).a.execute(new p881(i2, lh81Var));
                    }
                }
                return;
            case 20:
                ((t571) obj).b();
                return;
            case 21:
                eb2.a((eb2) obj);
                return;
            case 22:
                pzf pzfVar = (pzf) obj;
                pzfVar.a((s421) pzfVar.j);
                return;
            case 23:
                gp1.a((gp1) obj);
                return;
            case 24:
                of71 of71Var = (of71) obj;
                ((ys81) of71Var.c.w).getClass();
                ys81.a("om_sdk_js_request_tag");
                synchronized (of71Var.a) {
                    of71Var.f = true;
                }
                synchronized (of71Var.a) {
                    of71Var.b.removeCallbacksAndMessages(null);
                    of71Var.e = false;
                }
                of71Var.d.a();
                return;
            case 25:
                ((gm71) obj).c();
                return;
            case 26:
                ((l03) obj).a();
                return;
            case 27:
                ep71 ep71Var = (ep71) obj;
                ep71Var.y(ep71Var.a(), 1028, new dp71(21));
                xrr xrrVar = ep71Var.y;
                Iterator it4 = ((CopyOnWriteArraySet) xrrVar.y).iterator();
                while (it4.hasNext()) {
                    x181 x181Var = (x181) it4.next();
                    ly71 ly71Var = (ly71) xrrVar.x;
                    x181Var.d = true;
                    if (x181Var.c) {
                        ly71Var.c(x181Var.a, x181Var.b.a());
                    }
                }
                ((CopyOnWriteArraySet) xrrVar.y).clear();
                xrrVar.b = true;
                return;
            case 28:
                Toast.makeText((Context) ((hn71) obj).c, "The Yandex Mobile Ads SDK needs to be updated to the latest version. Details in the logs", 1).show();
                return;
            default:
                a681 a681Var = (a681) obj;
                int a = a681Var.c.a(a681Var.a);
                if (a681Var.e != a) {
                    a681Var.e = a;
                    a681Var.d.post(new xm2(a681Var, a, 25));
                    return;
                }
                return;
        }
    }
}
