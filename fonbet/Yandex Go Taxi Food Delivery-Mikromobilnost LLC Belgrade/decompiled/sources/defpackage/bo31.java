package defpackage;

import android.media.ImageWriter;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.constraintlayout.motion.widget.e;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.exoplayer.offline.f;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.go.payments.yb.domain.YbBrandingPromoAnalytics$OpenReason;
import com.yandex.go.where_you_are.impl.presentation.WhereYouAreBubble;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessage;
import com.yandex.messaging.internal.net.socket.XivaInternalMessage;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.payment.sdk.ui.ViewBindingActivityImpl;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.RtmClientEvent;
import io.appmetrica.analytics.impl.C0205b1;
import io.appmetrica.analytics.impl.C0398hl;
import io.appmetrica.analytics.impl.Wi;
import io.appmetrica.analytics.impl.Yb;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSource;
import ru.yandex.taxi.altpins.walking_route.modal.WalkingRouteModalView;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.video.m3.player.ui.YandexPlayerView;
import ru.yandex.video.m3.preload_manager.PreloadTrackInfoRepository$FetchRequest$launch$1;
import yads.ar3;
import yads.gn0;
import yads.w4;
import yads.xo3;
import yads.zo3;
import yads.zq3;

/* loaded from: classes10.dex */
public final /* synthetic */ class bo31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bo31(xd51 xd51Var, zj41 zj41Var, XivaInternalMessage xivaInternalMessage) {
        this.a = 8;
        this.b = xd51Var;
        this.c = xivaInternalMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = null;
        switch (this.a) {
            case 0:
                a201 a201Var = (a201) this.b;
                String str2 = (String) this.c;
                co31 co31Var = (co31) a201Var.c;
                int i = tw21.a;
                co31Var.onVideoDecoderReleased(str2);
                break;
            case 1:
                ((VideoSource) this.b).lambda$setVideoProcessor$0((VideoFrame) this.c);
                break;
            case 2:
                ViewBindingActivityImpl.performSnackBarTransition$default((ViewBindingActivityImpl) this.b, false, (ConstraintLayout) this.c, 0L, 4, null);
                break;
            case 3:
                e eVar = (e) this.b;
                View[] viewArr = (View[]) this.c;
                if (eVar.p != -1) {
                    for (View view : viewArr) {
                        view.setTag(eVar.p, Long.valueOf(System.nanoTime()));
                    }
                }
                if (eVar.q != -1) {
                    for (View view2 : viewArr) {
                        view2.setTag(eVar.q, null);
                    }
                    break;
                }
                break;
            case 4:
                g18 g18Var = (g18) this.b;
                zv31 zv31Var = (zv31) this.c;
                g18Var.cancel();
                View view3 = zv31Var.d;
                if (view3 != null) {
                    zv31Var.c.removeView(view3);
                    zv31Var.d = null;
                    break;
                }
                break;
            case 5:
                WalkingRouteModalView.render$lambda$0$0$0((WalkingRouteModalView) this.b, (my6) this.c);
                break;
            case 6:
                WhereYouAreBubble.render$lambda$0((WhereYouAreBubble) this.b, (az41) this.c);
                break;
            case 7:
                xd51 xd51Var = (xd51) this.b;
                zj41 zj41Var = (zj41) this.c;
                if (!xd51Var.x) {
                    je51 je51Var = xd51Var.a;
                    Handler handler = xd51Var.w;
                    z83.g(null, handler.getLooper(), Looper.myLooper());
                    if (jl40.l(xd51Var.A, zj41Var)) {
                        ((ydi0) zj41Var).a();
                        xd51Var.A = null;
                        break;
                    } else if (jl40.l(xd51Var.C, zj41Var)) {
                        handler.removeCallbacksAndMessages(xd51Var.c);
                        ydi0 ydi0Var = (ydi0) zj41Var;
                        ydi0Var.a();
                        xd51Var.C = null;
                        je51Var.b(ydi0Var);
                        if (je51Var.a()) {
                            xd51Var.h();
                            break;
                        }
                    }
                }
                break;
            case 8:
                xd51 xd51Var2 = (xd51) this.b;
                XivaInternalMessage xivaInternalMessage = (XivaInternalMessage) this.c;
                if (!xd51Var2.x) {
                    String str3 = xivaInternalMessage.subscriptionId;
                    je51 je51Var2 = xd51Var2.a;
                    z83.g(null, je51Var2.c.getLooper(), Looper.myLooper());
                    je51Var2.a.z = str3;
                    break;
                }
                break;
            case 9:
                je51 je51Var3 = (je51) this.b;
                ie51 ie51Var = (ie51) this.c;
                if (!je51Var3.i) {
                    Handler handler2 = ie51Var.w;
                    z83.g(null, handler2.getLooper(), Looper.myLooper());
                    if (!ie51Var.y) {
                        handler2.removeCallbacksAndMessages(null);
                        int i2 = ie51Var.x;
                        if (i2 < 3) {
                            handler2.postDelayed(ie51Var, ie51Var.c.a(i2));
                            break;
                        }
                    }
                }
                break;
            case 10:
                je51 je51Var4 = (je51) this.b;
                ServerMessage serverMessage = (ServerMessage) this.c;
                if (!je51Var4.i) {
                    c820 c820Var = je51Var4.a;
                    z83.g(null, c820Var.w.getLooper(), Looper.myLooper());
                    if (ydz.a.a()) {
                        c820Var.x.toJson(serverMessage);
                        ydz.a();
                    }
                    o420 o420Var = c820Var.a.w;
                    z83.g(null, o420Var.a, Looper.myLooper());
                    qtq0 qtq0Var = o420Var.d;
                    qtq0Var.d(serverMessage);
                    ClientMessage clientMessage = serverMessage.clientMessage;
                    if (clientMessage.plain != null) {
                        str = "plain";
                    } else if (clientMessage.botRequest != null) {
                        str = "botRequest";
                    } else if (clientMessage.stateSync != null) {
                        str = "stateSync";
                    } else if (clientMessage.meetingCallingMessage != null) {
                        str = "meetingCallingMessage";
                    }
                    if (str != null) {
                        qtq0Var.a.reportEvent("transport_msg_time_receive", b.i(new Pair("event_type", str), new Pair("delta_time_mills", Long.valueOf((System.currentTimeMillis() - (serverMessage.serverMessageInfo.timestamp / 1000)) + 100))));
                        break;
                    }
                }
                break;
            case 11:
                ((PreloadTrackInfoRepository$FetchRequest$launch$1) this.c).onPrepared((f) this.b);
                break;
            case 12:
                f fVar = (f) this.b;
                IOException iOException = (IOException) this.c;
                PreloadTrackInfoRepository$FetchRequest$launch$1 preloadTrackInfoRepository$FetchRequest$launch$1 = fVar.h;
                preloadTrackInfoRepository$FetchRequest$launch$1.getClass();
                preloadTrackInfoRepository$FetchRequest$launch$1.onPrepareError(fVar, iOException);
                break;
            case 13:
                ((YandexPlayerView) this.b).setPlayer((zxc0) this.c);
                break;
            case 14:
                Yb.a((Wi) this.b, (Yb) this.c);
                break;
            case 15:
                hp51 hp51Var = (hp51) this.b;
                String str4 = (String) this.c;
                wrz wrzVar = hp51Var.b;
                YbBrandingPromoAnalytics$OpenReason ybBrandingPromoAnalytics$OpenReason = YbBrandingPromoAnalytics$OpenReason.ADD_CARD;
                i d = ((j) wrzVar.a).d("YandexPayBrandingExperiment.DidTapOnWhatIsYandexPayLink");
                d.d("source", ybBrandingPromoAnalytics$OpenReason.getSource());
                d.m();
                hp51Var.a.b(str4);
                break;
            case 16:
                mdl0 mdl0Var = (mdl0) this.b;
                sf61 sf61Var = (sf61) this.c;
                mdl0Var.d();
                sf61Var.b.set(false);
                ImageWriter imageWriter = sf61Var.a;
                if (imageWriter != null) {
                    imageWriter.close();
                    break;
                }
                break;
            case 17:
                s421 s421Var = (s421) this.b;
                hk61 hk61Var = (hk61) this.c;
                gn61 gn61Var = (gn61) s421Var.x;
                if (gn61Var != null) {
                    new CallbackStackTraceMarker(new ar3(gn61Var, new com.yandex.mobile.ads.nativeads.j(hk61Var)));
                }
                ((nn81) s421Var.b).a();
                break;
            case 18:
                s421 s421Var2 = (s421) this.b;
                dl61 dl61Var = (dl61) this.c;
                gn61 gn61Var2 = (gn61) s421Var2.x;
                if (gn61Var2 != null) {
                    new CallbackStackTraceMarker(new zq3(gn61Var2, new AdRequestError(dl61Var.a, dl61Var.c, dl61Var.d)));
                }
                ((nn81) s421Var2.b).a();
                break;
            case 19:
                C0205b1.a((C0205b1) this.b, (PluginErrorDetails) this.c);
                break;
            case 20:
                ((bj71) this.c).a(((hl61) this.b).a());
                break;
            case 21:
                a441 a441Var = (a441) this.b;
                ty71 ty71Var = (ty71) this.c;
                gn0 gn0Var = (gn0) a441Var.c;
                int i3 = rf71.a;
                gn0Var.a(ty71Var);
                break;
            case 22:
                a441 a441Var2 = (a441) this.b;
                h881 h881Var = (h881) this.c;
                synchronized (h881Var) {
                }
                gn0 gn0Var2 = (gn0) a441Var2.c;
                int i4 = rf71.a;
                ep71 ep71Var = gn0Var2.a.p;
                wc71 w = ep71Var.w((v281) ep71Var.w.x);
                ep71Var.y(w, 1020, new gp51(w, (Object) h881Var, 21));
                gn0Var2.a.getClass();
                gn0Var2.a.getClass();
                break;
            case 23:
                mj31 mj31Var = (mj31) this.b;
                dl61 dl61Var2 = (dl61) this.c;
                dj61 dj61Var = (dj61) mj31Var.w;
                if (dj61Var != null) {
                    new CallbackStackTraceMarker(new xo3(dj61Var, new AdRequestError(dl61Var2.a, dl61Var2.c, dl61Var2.d)));
                    break;
                }
                break;
            case 24:
                mj31 mj31Var2 = (mj31) this.b;
                w4 w4Var = (w4) this.c;
                dj61 dj61Var2 = (dj61) mj31Var2.w;
                if (dj61Var2 != null) {
                    new CallbackStackTraceMarker(new zo3(dj61Var2, w4Var != null ? new p771(w4Var) : null));
                    break;
                }
                break;
            case 25:
                h0w h0wVar = (h0w) this.b;
                lp71 lp71Var = (lp71) this.c;
                h0wVar.getClass();
                rr41 rr41Var = (rr41) h0wVar.b;
                if (((gg71) rr41Var.b).b()) {
                    try {
                        ((os71) rr41Var.c).reportEvent(lp71Var.a, lp71Var.b);
                        break;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                break;
            case 26:
                f871 f871Var = (f871) this.b;
                View view4 = (View) this.c;
                if (f871Var.b) {
                    view4.setAlpha(view4.getAlpha() * 2.0f);
                    f871Var.b = false;
                    break;
                }
                break;
            case 27:
                C0398hl.a((C0398hl) this.b, (RtmClientEvent) this.c);
                break;
            case 28:
                ge71 ge71Var = (ge71) this.b;
                zj71 zj71Var = (zj71) this.c;
                try {
                    ika1.b((u771) ge71Var.d.getValue(), zj71Var);
                    String str5 = zj71Var.a;
                    HashMap hashMap = zj71Var.b;
                    ge71.a(hashMap);
                    a441 a441Var3 = ge71Var.a;
                    if (((gg71) a441Var3.b).a()) {
                        hk71 hk71Var = (hk71) ((i3y) a441Var3.c).getValue();
                        String str6 = zj71Var.a;
                        switch (hk71Var.a) {
                            case 0:
                                ((IReporter) ((ryh) hk71Var.b).b).reportEvent(str6, hashMap);
                                break;
                            default:
                                ((IReporter) hk71Var.b).reportEvent(str6, hashMap);
                                break;
                        }
                    }
                    break;
                } catch (Throwable unused2) {
                    return;
                }
            default:
                ge71 ge71Var2 = (ge71) this.b;
                Map<Thread, StackTraceElement[]> map = (Map) this.c;
                try {
                    ge71.b(map);
                    a441 a441Var4 = ge71Var2.a;
                    if (((gg71) a441Var4.b).a()) {
                        hk71 hk71Var2 = (hk71) ((i3y) a441Var4.c).getValue();
                        switch (hk71Var2.a) {
                            case 0:
                                ((IReporter) ((ryh) hk71Var2.b).b).reportAnr(map);
                                break;
                            default:
                                ((IReporter) hk71Var2.b).reportAnr(map);
                                break;
                        }
                    }
                    break;
                } catch (Throwable unused3) {
                    return;
                }
        }
    }

    public /* synthetic */ bo31(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ bo31(je51 je51Var, String str, String str2, ServerMessage serverMessage) {
        this.a = 10;
        this.b = je51Var;
        this.c = serverMessage;
    }
}
