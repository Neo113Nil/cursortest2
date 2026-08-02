package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.messaging.core.net.entities.SearchData;
import com.yandex.messaging.core.net.entities.SearchParams;
import com.yandex.messaging.internal.authorized.chat.j;
import com.yandex.xplat.payment.sdk.NetworkServiceRetryingStrategy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import org.webrtc.MediaStreamTrack;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.banners.e;
import ru.yandex.taxi.communications.a;
import ru.yandex.taxi.design.NotificationStackComponent;
import ru.yandex.taxi.lifecycle.c;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseExitCardAnalytics$CloseReasonV2;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseExitCardAnalytics$OpenReasonV2;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseExitCardAnalytics$TransportTypeV2;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseStationCardAnalytics$CloseReasonV2;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseStationCardAnalytics$TransportTypeV2;

/* loaded from: classes5.dex */
public final class e100 implements k100, wni, ho3, b7u {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;
    public Object w;

    public e100(seu seuVar) {
        this.a = 25;
        this.b = new ReentrantLock();
        this.c = new Handler(Looper.getMainLooper());
        this.w = new HashSet();
        new AtomicBoolean(false);
        new jq50(0, this);
    }

    @Override // defpackage.go3
    public void D(Object obj) {
        ((j18) this.b).resumeWith((SearchData) obj);
    }

    public void a() {
        xm00 xm00Var = (xm00) this.b;
        f4c0 f4c0Var = (f4c0) this.c;
        if (f4c0Var != null) {
            xm00Var.o(f4c0Var);
        }
        f4c0 f4c0Var2 = (f4c0) this.w;
        if (f4c0Var2 != null) {
            xm00Var.o(f4c0Var2);
        }
    }

    @Override // defpackage.b7u
    public void b(qk31 qk31Var) {
        Vibrator vibrator;
        Vibrator vibrator2;
        VibrationEffect createPredefined;
        i3y i3yVar = (i3y) this.c;
        AudioManager audioManager = (AudioManager) ((i3y) this.w).getValue();
        if ((audioManager == null || audioManager.getRingerMode() != 0) && (vibrator = (Vibrator) i3yVar.getValue()) != null && vibrator.hasVibrator() && (vibrator2 = (Vibrator) i3yVar.getValue()) != null) {
            if (qk31Var.equals(ok31.c) || qk31Var.equals(ok31.f)) {
                createPredefined = VibrationEffect.createPredefined(0);
            } else if (qk31Var.equals(ok31.e)) {
                createPredefined = VibrationEffect.createPredefined(2);
            } else if (qk31Var.equals(ok31.g)) {
                createPredefined = VibrationEffect.createPredefined(1);
            } else {
                if (!qk31Var.equals(ok31.d) && !qk31Var.equals(pk31.c)) {
                    w511.b();
                    return;
                }
                createPredefined = VibrationEffect.createPredefined(5);
            }
            vibrator2.vibrate(createPredefined);
        }
    }

    @Override // defpackage.ho3
    /* renamed from: c */
    public boolean mo103c(int i) {
        ((j) this.c).h.c((SearchParams) this.w, i);
        return false;
    }

    public fk20 d(ek20 ek20Var, boolean z) {
        boolean z2;
        ra90 ra90Var;
        yfa yfaVar = (yfa) this.c;
        w4v w4vVar = ek20Var.a;
        if (w4vVar != null) {
            z2 = z;
            ra90Var = oh4.b((oh4) this.b, w4vVar, null, new kvi0(wzg0.ic_delivery), z2, 2);
        } else {
            z2 = z;
            ra90Var = null;
        }
        mhf0 mhf0Var = ek20Var.b;
        nhf0 nhf0Var = new nhf0(yfaVar.e(mhf0Var.a, z2), yfaVar.e(mhf0Var.b, z2), mhf0Var.c);
        djf0 djf0Var = ek20Var.c;
        return new fk20(ra90Var, nhf0Var, new ejf0(djf0Var.a, yfaVar.e(djf0Var.b, z2), yfaVar.e(djf0Var.c, z2)));
    }

    public void e(MultiTransportChooseStationCardAnalytics$CloseReasonV2 multiTransportChooseStationCardAnalytics$CloseReasonV2) {
        zn40 zn40Var = (zn40) ((r1s) this.b).b;
        f100 f100Var = (f100) this.w;
        MultiTransportChooseExitCardAnalytics$OpenReasonV2 g = khb1.g(((c100) f100Var.Dg()).j());
        MultiTransportChooseExitCardAnalytics$TransportTypeV2 h = khb1.h((MultiTransportChooseStationCardAnalytics$TransportTypeV2) this.c);
        List pe = ((c100) f100Var.Dg()).pe();
        ArrayList arrayList = new ArrayList(tcc.n(pe, 10));
        Iterator it = pe.iterator();
        while (it.hasNext()) {
            arrayList.add(khb1.e((lmo) it.next()));
        }
        lmo lmoVar = f100Var.y;
        if (lmoVar == null) {
            ny61.r("Cannot send analytics before select exit!");
            return;
        }
        yn40 e = khb1.e(lmoVar);
        for (MultiTransportChooseExitCardAnalytics$CloseReasonV2 multiTransportChooseExitCardAnalytics$CloseReasonV2 : MultiTransportChooseExitCardAnalytics$CloseReasonV2.a()) {
            if (jl40.l(multiTransportChooseExitCardAnalytics$CloseReasonV2.getEventValue(), multiTransportChooseStationCardAnalytics$CloseReasonV2.getEventValue())) {
                zn40Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("open_reason", g.getEventValue());
                hashMap.put("type", h.getEventValue());
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((yn40) it2.next()).c);
                }
                hashMap.put("available_points", arrayList2);
                hashMap.put("selected_station", e.c);
                hashMap.put("close_reason", multiTransportChooseExitCardAnalytics$CloseReasonV2.getEventValue());
                zn40Var.a.a("MultiTransportChooseExitCard.Closed", hashMap, 2, new HashMap());
                return;
            }
        }
        w511.i("Collection contains no element matching the predicate.");
    }

    public md51 f(hz50 hz50Var, tls tlsVar, NetworkServiceRetryingStrategy networkServiceRetryingStrategy) {
        xv50 xv50Var = (xv50) this.b;
        ArrayList arrayList = xv50Var.b;
        vu30 vu30Var = new vu30(9);
        Object d = zmx.d(hz50Var);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d = vu30Var.invoke(d, it.next());
        }
        return ((md51) d).g(new x240(28, xv50Var)).f(new g060(this, 0)).g(new vqy(this, tlsVar, networkServiceRetryingStrategy, hz50Var, 10));
    }

    public e g() {
        tg60 tg60Var = (tg60) this.b;
        qu4 qu4Var = (qu4) this.c;
        ruc rucVar = qu4Var.c;
        a aVar = qu4Var.d;
        NotificationStackComponent notificationStackComponent = (NotificationStackComponent) this.w;
        iu4 iu4Var = qu4Var.a;
        return new e(tg60Var, rucVar, aVar, notificationStackComponent, iu4Var.b(), iu4Var.j, iu4Var.h, iu4Var.i, iu4Var.g, iu4Var.p, iu4Var.t);
    }

    public void h(zzs zzsVar) {
        f4c0 f4c0Var = (f4c0) this.c;
        if (f4c0Var != null) {
            f4c0Var.o(cwa1.d(zzsVar));
        }
        f4c0 f4c0Var2 = (f4c0) this.w;
        if (f4c0Var2 != null) {
            f4c0Var2.o(cwa1.d(zzsVar));
        }
    }

    public void i(View view, PointF pointF) {
        Bitmap s = xw31.s(view);
        f4c0 f4c0Var = (f4c0) this.w;
        if (f4c0Var != null) {
            f4c0Var.x(s);
        }
        f4c0 f4c0Var2 = (f4c0) this.w;
        if (f4c0Var2 != null) {
            f4c0Var2.D(new IconStyle().setAnchor(pointF));
        }
    }

    public void j(boolean z) {
        f4c0 f4c0Var = (f4c0) this.c;
        if (f4c0Var != null) {
            f4c0Var.i(z);
        }
        f4c0 f4c0Var2 = (f4c0) this.w;
        if (f4c0Var2 != null) {
            f4c0Var2.i(z);
        }
    }

    @Override // defpackage.wni
    public ComposeView m(uni uniVar, vni vniVar) {
        ComposeView composeView = new ComposeView((Context) this.b, null, 0, 6, null);
        composeView.setContent(new androidx.compose.runtime.internal.a(277368461, new bf00(this, 0), true));
        return composeView;
    }

    public String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 13:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) obj);
                sb.append('{');
                ht10 ht10Var = (ht10) ((ht10) this.c).c;
                String str = "";
                while (ht10Var != null) {
                    Object obj2 = ht10Var.b;
                    sb.append(str);
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb.append(obj2);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj2});
                        sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    }
                    ht10Var = (ht10) ht10Var.c;
                    str = Extension.FIX_SPACE;
                }
                sb.append('}');
                return sb.toString();
            case 18:
                String str2 = (String) this.w;
                String str3 = (String) this.c;
                StringBuilder sb2 = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) obj;
                if (uri != null) {
                    sb2.append(" uri=");
                    sb2.append(String.valueOf(uri));
                }
                if (str3 != null) {
                    sb2.append(" action=");
                    sb2.append(str3);
                }
                if (str2 != null) {
                    sb2.append(" mimetype=");
                    sb2.append(str2);
                }
                sb2.append(" }");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public e100(ah00 ah00Var, pey peyVar, sey seyVar) {
        this.a = 5;
        this.b = ah00Var;
        this.c = seyVar;
        c.a(peyVar.getLifecycle(), new fbz(14, this));
    }

    public e100(Looper looper, k020 k020Var, at2 at2Var) {
        this.a = 27;
        this.b = looper;
        this.c = k020Var;
        this.w = at2Var;
        z83.g(null, looper, Looper.myLooper());
    }

    public e100(i6r i6rVar, kv1 kv1Var) {
        this.a = 22;
        this.b = i6rVar;
        this.c = kv1Var;
    }

    public /* synthetic */ e100(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    public e100(Intent intent) {
        this.a = 18;
        Uri data = intent.getData();
        String action = intent.getAction();
        String type = intent.getType();
        this.b = data;
        this.c = action;
        this.w = type;
    }

    public e100(Context context) {
        this.a = 17;
        this.b = context;
        final int i = 0;
        this.c = kotlin.a.a(new sls(this) { // from class: b350
            public final /* synthetic */ e100 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                e100 e100Var = this.b;
                switch (i2) {
                    case 0:
                        return (Vibrator) ((Context) e100Var.b).getSystemService(Vibrator.class);
                    default:
                        Object systemService = ((Context) e100Var.b).getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                        if (systemService instanceof AudioManager) {
                            return (AudioManager) systemService;
                        }
                        return null;
                }
            }
        });
        final int i2 = 1;
        this.w = kotlin.a.a(new sls(this) { // from class: b350
            public final /* synthetic */ e100 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                e100 e100Var = this.b;
                switch (i22) {
                    case 0:
                        return (Vibrator) ((Context) e100Var.b).getSystemService(Vibrator.class);
                    default:
                        Object systemService = ((Context) e100Var.b).getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                        if (systemService instanceof AudioManager) {
                            return (AudioManager) systemService;
                        }
                        return null;
                }
            }
        });
    }

    public e100(f100 f100Var) {
        this.a = 0;
        this.w = f100Var;
        this.b = f100Var.w;
        this.c = MultiTransportChooseStationCardAnalytics$TransportTypeV2.ToStation;
    }

    public e100(String str) {
        this.a = 13;
        ht10 ht10Var = new ht10();
        this.c = ht10Var;
        this.w = ht10Var;
        this.b = str;
    }

    public e100(xm00 xm00Var) {
        this.a = 4;
        this.b = xm00Var;
    }
}
