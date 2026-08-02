package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewGroup;
import androidx.datastore.core.f;
import androidx.datastore.core.g;
import com.yandex.div.core.view2.Div2View;
import com.yandex.go.app.icon.c;
import com.yandex.go.chargers.analytics.ChargersAnalytics$LowBatteryNotificationState;
import com.yandex.go.drive.launch.e;
import com.yandex.go.payments.domain.i;
import com.yandex.go.superapp.orders.known.KnownOrder;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlinx.coroutines.flow.n0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.battery.BatteryReceiver;
import ru.yandex.taxi.location.lbs.gsm.GsmCellsInteractorImpl$requestCellInfos$2$callback$1;

/* loaded from: classes9.dex */
public final /* synthetic */ class d8 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        SerialDescriptor descriptor;
        int i = this.a;
        int i2 = 13;
        wg wgVar = null;
        r2 = null;
        List list = null;
        wgVar = null;
        boolean z = false;
        int i3 = 1;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                f8 f8Var = (f8) obj2;
                f8Var.Z((String) a.Z(f8Var.a), (b) obj);
                return zy11.a;
            case 1:
                ViewGroup viewGroup = (ViewGroup) obj2;
                Object tag = ((View) obj).getTag(ndh0.accessibility_importance_info);
                if (tag != null && !(tag instanceof wg)) {
                    xby.d.w(new IllegalStateException("never use id.accessibility_importance_info out of FullScreenBlocker"));
                } else if (tag instanceof wg) {
                    wgVar = (wg) tag;
                }
                if (wgVar != null) {
                    View view = wgVar.a;
                    LinkedHashSet linkedHashSet = wgVar.b;
                    linkedHashSet.remove(viewGroup);
                    if (linkedHashSet.isEmpty()) {
                        int importantForAccessibility = view.getImportantForAccessibility();
                        int i4 = wgVar.c;
                        if (i4 < importantForAccessibility && importantForAccessibility != 1) {
                            view.setImportantForAccessibility(i4);
                        }
                        wgVar.c = -1;
                    }
                    return Boolean.valueOf(z);
                }
                z = true;
                return Boolean.valueOf(z);
            case 2:
                ((tl1) obj).n1((rdb) obj2);
                return zy11.a;
            case 3:
                ((c) obj2).c.a();
                return zy11.a;
            case 4:
                ky2 ky2Var = (ky2) obj2;
                hy2 hy2Var = new hy2(z ? 1 : 0, (tls) obj);
                ky2Var.d(hy2Var);
                return new iy2(z ? 1 : 0, ky2Var, hy2Var);
            case 5:
                return Boolean.valueOf(((nd3) obj2).a.get((String) obj) == null);
            case 6:
                ((i) obj2).f.l(null);
                return zy11.a;
            case 7:
                bg5 bg5Var = (bg5) obj2;
                tls tlsVar = (tls) obj;
                tlsVar.invoke(Integer.valueOf(bg5Var.b()));
                BatteryReceiver batteryReceiver = new BatteryReceiver();
                batteryReceiver.setBatteryReceiverListener(new nb1(i3, tlsVar));
                IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
                Object[] objArr = Build.VERSION.SDK_INT >= 34 ? 1 : null;
                Context context = bg5Var.a;
                if (objArr != null) {
                    context.registerReceiver(batteryReceiver, intentFilter, 4);
                } else {
                    context.registerReceiver(batteryReceiver, intentFilter);
                }
                return new mh3(i2, bg5Var, batteryReceiver);
            case 8:
                fyc fycVar = ((ru.yandex.taxi.preorder.source.userposition.repository.a) obj2).f;
                zy11 zy11Var = zy11.a;
                fycVar.T(zy11Var);
                return zy11Var;
            case 9:
                lb7 lb7Var = (lb7) obj2;
                tls tlsVar2 = (tls) obj;
                v65 v65Var = new v65(i3, tlsVar2);
                ((gh00) ((ah00) lb7Var.c)).e(v65Var);
                tlsVar2.invoke(((gh00) ((ah00) lb7Var.c)).e.c);
                return new iy2(2, lb7Var, v65Var);
            case 10:
                com.yandex.go.chargers.push.domain.c cVar = (com.yandex.go.chargers.push.domain.c) obj2;
                boolean c = cVar.b.c("chargers-low-battery-local-notification");
                Boolean bool = cVar.f;
                if (bool != null && !bool.equals(Boolean.valueOf(c))) {
                    ChargersAnalytics$LowBatteryNotificationState chargersAnalytics$LowBatteryNotificationState = c ? ChargersAnalytics$LowBatteryNotificationState.On : ChargersAnalytics$LowBatteryNotificationState.Off;
                    em9 em9Var = cVar.a;
                    HashMap w = b64.w(em9Var);
                    w.put(ClidProvider.STATE, chargersAnalytics$LowBatteryNotificationState.getEventValue());
                    em9Var.a.a("Chargers.LowBatteryPushToggle.Tapped", w, 1, new HashMap());
                }
                cVar.f = Boolean.valueOf(c);
                n0 n0Var = cVar.d;
                zy11 zy11Var2 = zy11.a;
                n0Var.g(zy11Var2);
                return zy11Var2;
            case 11:
                ru.yandex.taxi.polling.a aVar = (ru.yandex.taxi.polling.a) obj2;
                Throwable th = (Throwable) obj;
                if (th != null && !jl40.l(th.getMessage(), "CANCEL_BY_ON_DESTROY_MESSAGE") && !jl40.l(th.getMessage(), "CANCEL_BY_ON_STOP_MESSAGE")) {
                    aVar.d.getClass();
                    g9z.a(th, "End collect locations");
                }
                return zy11.a;
            case 12:
                h0c h0cVar = (h0c) obj;
                KSerializer kSerializer = ((oke) obj2).b;
                if (kSerializer != null && (descriptor = kSerializer.getDescriptor()) != null) {
                    list = descriptor.getAnnotations();
                }
                if (list == null) {
                    list = EmptyList.a;
                }
                h0cVar.b = list;
                return zy11.a;
            case 13:
                f fVar = (f) obj2;
                i3y i3yVar = fVar.j;
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    fVar.h.b(new g6r(th2));
                }
                if (i3yVar.isInitialized()) {
                    ((g) i3yVar.getValue()).close();
                }
                return zy11.a;
            case 14:
                InputStream inputStream = (InputStream) obj;
                zcx zcxVar = ((flex.network.cache.impl.b) obj2).i;
                kf5 kf5Var = zcxVar.b;
                g0c a = qoi0.a(kq90.class);
                KSerializer b = kf5Var.b(a, EmptyList.a);
                if (b == null) {
                    b = new v5e0(a);
                }
                return (kq90) ffx.A(zcxVar, b, inputStream);
            case 15:
                TimeZone timeZone = bg61.a;
                ((dyj) obj2).D = true;
                return zy11.a;
            case 16:
                ((coil3.disk.a) obj2).E = true;
                return zy11.a;
            case 17:
                ((Div2View) obj).setActionHandler((bul) obj2);
                return zy11.a;
            case 18:
                ((Div2View) obj).setActionHandler(((mds0) obj2).b);
                return zy11.a;
            case 19:
                ((kotlinx.serialization.modules.a) obj).g(qoi0.a(h2m.class), new i2m((uyg) ((l2m) obj2).b.invoke()));
                return zy11.a;
            case 20:
                e eVar = (e) obj2;
                nfm nfmVar = new nfm(0, (tls) obj);
                ((j) eVar.b).m.n.add(nfmVar);
                return new iy2(i2, eVar, nfmVar);
            case 21:
                ((t7n) obj).v(((b8n) obj2).a);
                return zy11.a;
            case 22:
                return Boolean.valueOf(jl40.l(((KnownOrder) obj).a, ((ren) obj2).g()));
            case 23:
                wjp wjpVar = (wjp) obj2;
                return new vjp(wjpVar.b.o(new kn2(10, (tls) obj, wjpVar), "gcm_registration_id"), z ? 1 : 0);
            case 24:
                return new wyq0(((xyq0) obj2).a.a(null), null, null);
            case 25:
                return ((gyr) obj2).a(np11.a((np11) obj)).getValue();
            case 26:
                ((f2t) ((ru.yandex.taxi.persuggest.domain.g) obj2).c).b((g2t) obj);
                return zy11.a;
            case 27:
                cyg cygVar = (cyg) obj2;
                InputStream inputStream2 = (InputStream) obj;
                try {
                    rzo.l(inputStream2, mmt.a);
                    inputStream2.close();
                    return cygVar;
                } finally {
                }
            case 28:
                n3u n3uVar = (n3u) obj2;
                GsmCellsInteractorImpl$requestCellInfos$2$callback$1 gsmCellsInteractorImpl$requestCellInfos$2$callback$1 = new GsmCellsInteractorImpl$requestCellInfos$2$callback$1((tls) obj, n3uVar);
                k3f k3fVar = new k3f(n3uVar, n3uVar.a.getMainExecutor(), gsmCellsInteractorImpl$requestCellInfos$2$callback$1);
                TelephonyManager telephonyManager = (TelephonyManager) n3uVar.d.getValue();
                if (telephonyManager != null) {
                    telephonyManager.requestCellInfoUpdate(k3fVar, gsmCellsInteractorImpl$requestCellInfos$2$callback$1);
                }
                return new d82(i3);
            default:
                return ((y7u) obj2).a.l((String) obj, null);
        }
    }
}
