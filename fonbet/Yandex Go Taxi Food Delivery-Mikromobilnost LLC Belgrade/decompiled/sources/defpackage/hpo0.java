package defpackage;

import android.content.ContentProviderOperation;
import android.content.Context;
import android.content.OperationApplicationException;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.webkit.ClientCertRequest;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import androidx.constraintlayout.widget.Barrier;
import com.adjust.sdk.Constants;
import com.squareup.moshi.Moshi;
import com.yandex.go.scooters.qr.data.model.ScootersQrMode;
import com.yandex.go.scooters.qr.ui.ScootersQrCameraPreview;
import com.yandex.go.scooters.qr.ui.ScootersQrModalView;
import com.yandex.go.scooters.qr.ui.a;
import com.yandex.go.scooters.qr.ui.e;
import com.yandex.go.slot.ui.view.SlotItemViewComponent;
import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.yb.c;
import com.yandex.messaging.domain.user.UserNameType;
import com.yandex.messaging.internal.authorized.sync.g;
import com.yandex.messaging.internal.entities.ChatId;
import com.yandex.messaging.internal.entities.SeenMarkerEntity;
import com.yandex.messaging.internal.net.socket.XivaInternalMessage;
import com.yandex.payment.sdk.transportcards.ui.TransportCardsActivity;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.r0;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.care.ui.h;
import ru.yandex.logistics.care.web_view.impl.js.TaxiAppJsCallback$ErrorType;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.order.view.TopCircleButtonsView;
import ru.yandex.taxi.preorder.source.SourcePointFragment;
import ru.yandex.taxi.preorder.summary.selector.ui.ribbon.TariffsRibbonView;
import ru.yandex.taxi.preorder.summary.selector.ui.verticals.VerticalInternalTariffView;
import ru.yandex.taxi.preorder.summary.solid.SolidSummaryView;
import ru.yandex.taxi.preorder.summary.solid.l;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;
import ru.yandex.taxi.widget.timeline.TimelineItemView;
import ru.yandex.video.m3.list_player_manager.impl.track.TrackManagerImpl;
import ru.yandex.video.m3.ott.ott.TrackSelectionManager;
import ru.yandex.video.m3.player.tracks.TrackFormat;

/* loaded from: classes15.dex */
public final /* synthetic */ class hpo0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ hpo0(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.Runnable
    public final void run() {
        ScootersQrCameraPreview scootersQrCameraPreview;
        ScootersQrCameraPreview scootersQrCameraPreview2;
        ScootersQrCameraPreview scootersQrCameraPreview3;
        ScootersQrCameraPreview scootersQrCameraPreview4;
        ScootersQrCameraPreview scootersQrCameraPreview5;
        Barrier barrier;
        e eVar;
        l lVar;
        String str;
        ye0 ye0Var;
        u111 viewModel;
        yp11 yp11Var;
        char c;
        int i;
        int i2 = 6;
        char c2 = 2;
        switch (this.a) {
            case 0:
                ScootersQrModalView scootersQrModalView = (ScootersQrModalView) this.b;
                fgg0 fgg0Var = (fgg0) this.c;
                a aVar = (a) this.w;
                scootersQrCameraPreview = scootersQrModalView.qrCameraPreview;
                float width = scootersQrCameraPreview.getWidth() / fgg0Var.c;
                scootersQrCameraPreview2 = scootersQrModalView.qrCameraPreview;
                float height = scootersQrCameraPreview2.getHeight() / fgg0Var.d;
                RectF rectF = aVar.b;
                Rect rect = fgg0Var.b;
                rectF.set(rect.left * width, rect.top * height, rect.right * width, rect.bottom * height);
                RectF rectF2 = aVar.c;
                scootersQrCameraPreview3 = scootersQrModalView.qrCameraPreview;
                float left = scootersQrCameraPreview3.getLeft();
                scootersQrCameraPreview4 = scootersQrModalView.qrCameraPreview;
                float top = scootersQrCameraPreview4.getTop();
                scootersQrCameraPreview5 = scootersQrModalView.qrCameraPreview;
                float right = scootersQrCameraPreview5.getRight();
                barrier = scootersQrModalView.cleanAreaBottomBarrier;
                rectF2.set(left, top, right, barrier.getTop());
                RectF rectF3 = aVar.b;
                if (rectF2.contains(rectF3)) {
                    eVar = scootersQrModalView.scootersQrPresenter;
                    Uri uri = fgg0Var.a;
                    Rect rect2 = new Rect();
                    rectF3.roundOut(rect2);
                    int i3 = aVar.w;
                    rect2.set(rect2.left - i3, rect2.top - i3, rect2.right + i3, rect2.bottom + i3);
                    yln0 yln0Var = eVar.L;
                    if (((r0) yln0Var.c.b).getValue() == ScootersQrMode.QR_SCAN) {
                        yln0Var.f.g(uri);
                        yln0Var.e.a(rect2);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                SimpleSpinnerModalView.dismiss$lambda$1((ViewGroup) this.b, (SimpleSpinnerModalView) this.c, (Runnable) this.w);
                return;
            case 2:
                ViewGroup viewGroup = (ViewGroup) this.b;
                Runnable runnable = (Runnable) this.c;
                Runnable runnable2 = (Runnable) this.w;
                SimpleSpinnerModalView.Companion.getClass();
                SimpleSpinnerModalView a = yes0.a(viewGroup);
                if (a != null) {
                    a.dismiss(runnable);
                }
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 3:
                SlotItemViewComponent.renderTrailInternal$lambda$0((SlotItemViewComponent) this.b, (rqs0) this.c, (ListItemComponent) this.w);
                return;
            case 4:
                SolidSummaryView solidSummaryView = (SolidSummaryView) this.b;
                upj0 upj0Var = (upj0) this.c;
                p7t0 p7t0Var = (p7t0) this.w;
                lVar = solidSummaryView.presenter;
                SummaryExpandReason summaryExpandReason = SummaryExpandReason.AUTO_REDIRECT;
                lVar.getClass();
                String str2 = upj0Var.a;
                pex0 m = ((k) lVar.x).m();
                if (m != null && (str = m.b) != null) {
                    lVar.p1.b(str, str2);
                }
                lVar.Rg(c8r.b(lVar.h0, upj0Var.a, null, null, 6), summaryExpandReason);
                p7t0Var.Vf(summaryExpandReason, new zjj0(upj0Var.b, null));
                return;
            case 5:
                ((agt0) this.b).a((zzs) this.c, new th5(12, (SourcePointFragment) this.w));
                return;
            case 6:
                ((cjw0) this.b).d((enw0) this.c, (Map.Entry) this.w);
                return;
            case 7:
                ((o0x0) this.b).g((c5g0) this.c, (String) this.w);
                return;
            case 8:
                TariffsRibbonView.invalidateTariffs$lambda$0((List) this.b, (TariffsRibbonView) this.c, (PriceUpdate$PriceLoadingState) this.w);
                return;
            case 9:
                ytx0 ytx0Var = (ytx0) this.b;
                String str3 = (String) this.c;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.w;
                dt8 dt8Var = ytx0Var.b.b.b;
                h hVar = ytx0Var.a;
                Map map = (Map) ref$ObjectRef.element;
                or8 or8Var = hVar.c;
                switch (str3.hashCode()) {
                    case -1407982199:
                        if (str3.equals("insurance.web-view.contract-created")) {
                            ye0Var = xq8.b;
                            break;
                        }
                        ye0Var = null;
                        break;
                    case -1112085132:
                        if (str3.equals("insurance.web-view.on-payment")) {
                            Object obj = map.get("type");
                            String str4 = obj instanceof String ? (String) obj : null;
                            if (str4 != null) {
                                Object obj2 = map.get("additional_data");
                                Map map2 = obj2 instanceof Map ? (Map) obj2 : null;
                                if (map2 == null) {
                                    map2 = b.f();
                                }
                                ye0Var = new zq8(str4, map2);
                                break;
                            }
                        }
                        ye0Var = null;
                        break;
                    case -717858975:
                        if (str3.equals("insurance.web-view.loaded")) {
                            Object obj3 = map.get("load_duration_ms");
                            if ((obj3 instanceof Integer ? (Integer) obj3 : null) != null) {
                                ye0Var = new yq8(r4.intValue());
                                break;
                            }
                        }
                        ye0Var = null;
                        break;
                    case -354230955:
                        if (str3.equals("insurance.web-view.add-vehicle-button-clicked")) {
                            ye0Var = wq8.b;
                            break;
                        }
                        ye0Var = null;
                        break;
                    case 136285251:
                        if (str3.equals("insurance.web-view.vehicle-added")) {
                            ye0Var = br8.b;
                            break;
                        }
                        ye0Var = null;
                        break;
                    case 1615886744:
                        if (str3.equals("insurance.web-view.on-payment-flow-finished")) {
                            Object obj4 = map.get("type");
                            String str5 = obj4 instanceof String ? (String) obj4 : null;
                            if (str5 != null) {
                                ye0Var = new ar8(str5);
                                break;
                            }
                        }
                        ye0Var = null;
                        break;
                    default:
                        ye0Var = null;
                        break;
                }
                if (ye0Var != null) {
                    or8Var.k(ye0Var);
                    return;
                } else {
                    or8Var.k(new mr8(str3, map));
                    return;
                }
            case 10:
                ytx0 ytx0Var2 = (ytx0) this.b;
                ytx0Var2.a.a((String) this.c, (String) this.w, TaxiAppJsCallback$ErrorType.General);
                dt8 dt8Var2 = ytx0Var2.b.b.b;
                return;
            case 11:
                com.yandex.go.taxi.order.chat.domain.a aVar2 = (com.yandex.go.taxi.order.chat.domain.a) this.b;
                String str6 = (String) this.c;
                isa0 isa0Var = (isa0) this.w;
                com.yandex.go.taxi.order.chat.data.b c3 = aVar2.c(str6);
                x3y0 x3y0Var = c3.s;
                synchronized (x3y0Var) {
                    x3y0Var.d.remove(isa0Var);
                    if (x3y0Var.e.remove(isa0Var)) {
                        r0 r0Var = x3y0Var.f;
                        Integer valueOf = Integer.valueOf(x3y0Var.e.size());
                        r0Var.getClass();
                        r0Var.m(null, valueOf);
                    }
                    x3y0Var.c.addLast(isa0Var);
                    c3.g(isa0Var);
                }
                c3.n.l(c3.d());
                return;
            case 12:
                com.yandex.go.taxi.order.chat.domain.a aVar3 = (com.yandex.go.taxi.order.chat.domain.a) this.b;
                String str7 = (String) this.c;
                wy10 wy10Var = (wy10) this.w;
                com.yandex.go.taxi.order.chat.data.b c4 = aVar3.c(str7);
                com.yandex.go.taxi.order.chat.data.db.a aVar4 = c4.e;
                Collection collection = wy10Var.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : collection) {
                    if (!((drq0) obj5).c) {
                        arrayList.add(obj5);
                    }
                }
                aVar4.getClass();
                ArrayList<ContentProviderOperation> arrayList2 = new ArrayList<>(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    drq0 drq0Var = (drq0) it.next();
                    ContentProviderOperation.Builder newUpdate = ContentProviderOperation.newUpdate(aVar4.d);
                    newUpdate.withSelection("unique_id = ?", new String[]{String.valueOf(drq0Var.a)});
                    newUpdate.withValue("is_read", 1);
                    arrayList2.add(newUpdate.build());
                }
                dxt0 dxt0Var = aVar4.b;
                Context context = aVar4.c;
                String str8 = ((rie) aVar4.a).a;
                dxt0Var.getClass();
                if (!arrayList2.isEmpty()) {
                    try {
                        context.getContentResolver().applyBatch(str8, arrayList2);
                    } catch (OperationApplicationException e) {
                        jst.e.k(e, "Could not apply batch ops");
                    } catch (RemoteException e2) {
                        jst.e.k(e2, "Could not apply batch ops");
                    }
                }
                r0 r0Var2 = c4.m;
                Integer valueOf2 = Integer.valueOf(c4.e.a(c4.b));
                r0Var2.getClass();
                r0Var2.m(null, valueOf2);
                x3y0 x3y0Var2 = c4.s;
                synchronized (x3y0Var2) {
                    HashSet hashSet = new HashSet(x3y0Var2.d);
                    hashSet.removeAll(kotlin.collections.a.N0(wy10Var.c));
                    x3y0Var2.e = hashSet;
                    r0 r0Var3 = x3y0Var2.f;
                    Integer valueOf3 = Integer.valueOf(x3y0Var2.e.size());
                    r0Var3.getClass();
                    r0Var3.m(null, valueOf3);
                }
                return;
            case 13:
                TimelineItemView.setLottieAnimation$lambda$0((TimelineItemView) this.b, (String) this.c, (ytz) this.w);
                return;
            case 14:
                TopCircleButtonsView.bindCircleButton$lambda$2((TopCircleButtonsView) this.b, (String) this.c, (xw) this.w);
                return;
            case 15:
                TrackManagerImpl.notifyAvailableTrackChanged$lambda$9$lambda$8((TrackManagerImpl) this.b, (Integer) this.c, (List) this.w);
                return;
            case 16:
                TrackSelectionManager.PlayerObserverImpl.saveAudioAndSubtitleTracks$lambda$9((TrackSelectionManager.PlayerObserverImpl) this.b, (TrackFormat) this.c, (TrackFormat) this.w);
                return;
            case 17:
                com.yandex.payment.sdk.transportcards.nfc.a aVar5 = (com.yandex.payment.sdk.transportcards.nfc.a) this.b;
                String str9 = (String) this.c;
                jgr jgrVar = (jgr) this.w;
                aVar5.h = null;
                viewModel = ((TransportCardsActivity) aVar5.a.a).getViewModel();
                ahr ahrVar = viewModel.b;
                if (ahrVar != null) {
                    ((com.yandex.payment.sdk.flex.impl.b) ahrVar).h(gw00.e(new Pair("ReadCardByNFCScreenState", g8e.z("cardNumber", str9))));
                }
                jgrVar.b.invoke();
                return;
            case 18:
                int i4 = 0;
                xp11 xp11Var = (xp11) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                o1b0 o1b0Var = (o1b0) this.w;
                u2c0 u2c0Var = xp11Var.b;
                if (u2c0Var == null || (yp11Var = (yp11) u2c0Var.x) == null) {
                    return;
                }
                HashMap hashMap = (HashMap) u2c0Var.b;
                String str10 = "";
                zp11 zp11Var = (zp11) u2c0Var.y;
                Context context2 = zp11Var.d;
                if (!arrayList3.isEmpty()) {
                    if (!o1b0Var.d || ChatId.Companion.f(o1b0Var.b)) {
                        int size = arrayList3.size();
                        if (size > 2) {
                            str10 = context2.getResources().getQuantityString(ewh0.chat_status_typing_many, size, Integer.valueOf(size));
                        } else {
                            StringBuilder sb = new StringBuilder();
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                String str11 = (String) it2.next();
                                if (hashMap.containsKey(str11)) {
                                    c = c2;
                                } else {
                                    c = c2;
                                    hashMap.put(str11, zp11Var.a.b.c(new oft(str11, true), new k9b(7, new ot7(i2, u2c0Var, str11))));
                                }
                                in21 in21Var = (in21) ((HashMap) u2c0Var.c).get(str11);
                                if (in21Var != null) {
                                    rp21 rp21Var = zp11Var.b;
                                    long c5 = rp21Var.b.c();
                                    in21 a2 = rp21Var.a.a().a(str11);
                                    sb.append(h791.g(a2 == null ? new qp21(null, UserNameType.NOT_FOUND) : rp21Var.c.a(a2, c5), context2.getResources(), in21Var.a));
                                    sb.append(Extension.FIX_SPACE);
                                    i4++;
                                }
                                c2 = c;
                                i2 = 6;
                            }
                            if (sb.length() != 0) {
                                sb.replace(sb.length() - 2, sb.length(), "");
                                sb.append(" ");
                                sb.append(context2.getString(i4 > 1 ? oyh0.chat_status_typing_few : oyh0.chat_status_typing_one));
                                str10 = sb.toString();
                            } else {
                                str10 = context2.getResources().getQuantityString(ewh0.chat_status_typing_many, size, Integer.valueOf(size));
                            }
                        }
                    } else {
                        str10 = context2.getString(oyh0.chat_status_typing_one);
                    }
                }
                yp11Var.f(str10);
                return;
            case 19:
                VerticalInternalTariffView.internalUpdateVerticalItems$lambda$0((List) this.b, (VerticalInternalTariffView) this.c, (PriceUpdate$PriceLoadingState) this.w);
                return;
            case 20:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                dyq0 dyq0Var = (dyq0) this.c;
                zk31 zk31Var = (zk31) this.w;
                d6z.y("Surface update cancellation should only occur on main thread.", tob1.d());
                atomicBoolean.set(true);
                dyq0Var.b.e.remove(zk31Var);
                dyq0Var.e.remove(zk31Var);
                return;
            case 21:
                ((VideoFileRenderer) this.b).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) this.c, (VideoFrame) this.w);
                return;
            case 22:
                a201 a201Var = (a201) this.b;
                androidx.media3.common.a aVar6 = (androidx.media3.common.a) this.c;
                qyg qygVar = (qyg) this.w;
                co31 co31Var = (co31) a201Var.c;
                int i5 = tw21.a;
                co31Var.onVideoInputFormatChanged(aVar6, qygVar);
                return;
            case 23:
                ((WebViewClientProxyApi$WebViewClientImpl) this.b).lambda$shouldOverrideUrlLoading$9((WebView) this.c, (WebResourceRequest) this.w);
                return;
            case 24:
                ((WebViewClientProxyApi$WebViewClientImpl) this.b).lambda$onReceivedClientCertRequest$21((WebView) this.c, (ClientCertRequest) this.w);
                return;
            case 25:
                mp41 mp41Var = (mp41) this.b;
                String str12 = (String) this.c;
                Map<String, String> map3 = (Map) this.w;
                WebView webView = mp41Var.b;
                if (webView != null) {
                    webView.loadUrl(str12, map3);
                    return;
                }
                return;
            case 26:
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.b;
                androidx.concurrent.futures.b bVar = (androidx.concurrent.futures.b) this.c;
                sls slsVar = (sls) this.w;
                if (atomicBoolean2.get()) {
                    return;
                }
                try {
                    bVar.b(slsVar.invoke());
                    return;
                } catch (Throwable th) {
                    bVar.d(th);
                    return;
                }
            case 27:
                xd51 xd51Var = (xd51) this.b;
                zj41 zj41Var = (zj41) this.c;
                XivaInternalMessage xivaInternalMessage = (XivaInternalMessage) this.w;
                if (xd51Var.x) {
                    return;
                }
                long j = xivaInternalMessage.serverIntervalSec;
                z83.g(null, xd51Var.w.getLooper(), Looper.myLooper());
                z83.c(null, xd51Var.x);
                if (zj41Var == xd51Var.C) {
                    xd51Var.w.removeCallbacksAndMessages(xd51Var.c);
                }
                if (zj41Var == xd51Var.A) {
                    xd51Var.w.removeCallbacksAndMessages(xd51Var.b);
                    y1k0 y1k0Var = xd51Var.y;
                    if (y1k0Var != null) {
                        y1k0Var.close();
                    }
                    xd51Var.y = null;
                    xd51Var.B = 0;
                    xd51Var.C = zj41Var;
                    xd51Var.A = null;
                    je51 je51Var = xd51Var.a;
                    z83.g(null, je51Var.c.getLooper(), Looper.myLooper());
                    z83.f(je51Var.h, null);
                    if (ydz.a.a()) {
                        ydz.a();
                    }
                    je51Var.h = zj41Var;
                    c820 c820Var = je51Var.a;
                    Object obj6 = c820Var.c;
                    Handler handler = c820Var.w;
                    z83.g(null, handler.getLooper(), Looper.myLooper());
                    z83.c(null, c820Var.F);
                    n420 n420Var = c820Var.a;
                    o420 o420Var = n420Var.w;
                    z83.g(null, o420Var.a, Looper.myLooper());
                    wor0 wor0Var = new wor0(n420Var.b);
                    g gVar = n420Var.a;
                    gVar.P.reportEvent("tech_sync_socket_connected");
                    z83.g(null, gVar.S, Looper.myLooper());
                    r4e r4eVar = gVar.E;
                    z83.g(null, r4eVar.a, Looper.myLooper());
                    if (r4eVar.y == 0) {
                        r4eVar.b.getClass();
                        r4eVar.y = SystemClock.elapsedRealtime();
                    }
                    gVar.y.b(wor0Var);
                    gVar.e();
                    nta0 nta0Var = (nta0) o420Var.e.get();
                    z83.g(null, nta0Var.d, Looper.myLooper());
                    if (!nta0Var.g) {
                        nta0Var.g = true;
                        Iterator it3 = nta0Var.f.k().iterator();
                        while (it3.hasNext()) {
                            u2b0 u2b0Var = (u2b0) it3.next();
                            nta0Var.a(u2b0Var.a, (SeenMarkerEntity) u2b0Var.b);
                        }
                    }
                    handler.removeCallbacksAndMessages(obj6);
                    handler.postDelayed(new b820(c820Var, 1), obj6, 600000L);
                    wd51 wd51Var = je51Var.j.e;
                    kse.a(wd51Var.b);
                    wd51Var.d = s630.a();
                    synchronized (je51Var.d) {
                        int e3 = je51Var.d.e();
                        for (int i6 = 0; i6 < e3; i6++) {
                            ie51 ie51Var = (ie51) je51Var.d.f(i6);
                            z83.g(null, ie51Var.w.getLooper(), Looper.myLooper());
                            ie51Var.x = 0;
                            ie51Var.b(zj41Var);
                        }
                    }
                    synchronized (je51Var.e) {
                        Iterator it4 = je51Var.e.iterator();
                        while (it4.hasNext()) {
                            he51 he51Var = (he51) it4.next();
                            he51Var.getClass();
                            yp6 yp6Var = he51Var.a;
                            int i7 = je51Var.f;
                            je51Var.f = i7 + 1;
                            je51.d(zj41Var, i7, Constants.PUSH, yp6Var);
                        }
                    }
                }
                if (j < 10) {
                    j = 10;
                }
                if (zj41Var == xd51Var.C) {
                    Handler handler2 = xd51Var.w;
                    long millis = TimeUnit.SECONDS.toMillis(j + 1);
                    Object obj7 = xd51Var.c;
                    tqs tqsVar = new tqs(19, xd51Var, zj41Var);
                    if (obj7 == null) {
                        handler2.postDelayed(tqsVar, millis);
                        return;
                    } else {
                        handler2.postDelayed(tqsVar, obj7, millis);
                        return;
                    }
                }
                return;
            case 28:
                je51 je51Var2 = (je51) this.b;
                ie51 ie51Var2 = (ie51) this.c;
                Object obj8 = this.w;
                if (je51Var2.i) {
                    return;
                }
                Handler handler3 = ie51Var2.w;
                z83.g(null, handler3.getLooper(), Looper.myLooper());
                if (ie51Var2.y) {
                    return;
                }
                handler3.removeCallbacksAndMessages(null);
                lg lgVar = ie51Var2.b;
                c820 c820Var2 = (c820) lgVar.d;
                z83.g(null, c820Var2.w.getLooper(), Looper.myLooper());
                z83.c(null, c820Var2.F);
                fn6 fn6Var = (fn6) lgVar.c;
                o5t0 o5t0Var = (o5t0) lgVar.b;
                if (ydz.a.a()) {
                    o5t0Var.k();
                    ((Moshi) fn6Var.k).adapter(o5t0Var.e()).indent("  ").toJson(obj8);
                    ydz.a();
                }
                int n = obj8 == null ? 1 : o5t0Var.n(obj8);
                if (n != 0) {
                    ((c370) fn6Var.i).b(2, "bad", o5t0Var.k());
                }
                if (n == 0) {
                    ie51Var2.c();
                    return;
                } else {
                    if (n == 1 && (i = ie51Var2.x) < 3) {
                        handler3.postDelayed(ie51Var2, ie51Var2.c.a(i));
                        return;
                    }
                    return;
                }
            default:
                c cVar = (c) this.b;
                mh51 mh51Var = (mh51) this.c;
                fv51 fv51Var = (fv51) this.w;
                cVar.L.a.removeFirstOccurrence(mh51Var);
                cVar.P(fv51Var.a);
                return;
        }
    }
}
