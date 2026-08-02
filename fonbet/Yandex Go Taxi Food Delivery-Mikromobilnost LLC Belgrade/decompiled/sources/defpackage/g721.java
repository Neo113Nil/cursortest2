package defpackage;

import android.content.ComponentName;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Base64;
import android.webkit.WebView;
import com.yandex.go.domain.interactor.b;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import com.yandex.go.loyalty.impl.common.lcp.a;
import com.yandex.go.navigation.UserPhotoUploadingEntryPoint;
import com.yandex.go.payments_widgets.g;
import com.yandex.go.payments_widgets.saver.k;
import com.yandex.go.payments_widgets.yandex_bank.j;
import com.yandex.go.ui.UserPhotoNotificationItemComponent;
import com.yandex.go.ypay.impl.YPayGoActivity;
import com.yandex.go.zone.model.ZoneMode;
import com.yandex.mapkit.navigation.transport.RouteChangeReason;
import com.yandex.quark.webchat.f;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.layers.domain.z;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes.dex */
public final class g721 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g721(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x030d  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        String encodeToString;
        Object value;
        String str;
        Screen screen;
        byx byxVar = null;
        switch (this.a) {
            case 0:
                n0 n0Var = ((a) this.b).d.a;
                zy11 zy11Var = zy11.a;
                n0Var.g(zy11Var);
                break;
            case 1:
                Object obj2 = kxk0.a;
                Object obj3 = jxk0.a;
                Pair pair = (Pair) obj;
                g gVar = (g) this.b;
                boolean booleanValue = ((Boolean) pair.getFirst()).booleanValue();
                if (((Boolean) pair.getSecond()).booleanValue() && booleanValue) {
                    gVar.e.changeDetectorEnable();
                    mxk0 mxk0Var = gVar.f;
                    aba0 aba0Var = mxk0Var.c;
                    as21 as21Var = aba0Var.a;
                    n0 n0Var2 = aba0Var.c;
                    kxk0 kxk0Var = as21Var.a("FIELD_IS_BALANCE_HIDED", false) ? obj3 : obj2;
                    mxk0Var.f = kxk0Var;
                    if (kxk0Var.equals(obj2)) {
                        n0Var2.g(Boolean.FALSE);
                    } else if (!kxk0Var.equals(obj3)) {
                        w511.b();
                        break;
                    } else {
                        n0Var2.g(Boolean.TRUE);
                    }
                } else {
                    gVar.e.unregisterListener();
                    gVar.f.a();
                }
                break;
            case 2:
                List list = (List) obj;
                if (!list.isEmpty()) {
                    com.yandex.div.core.expression.variables.a aVar = (com.yandex.div.core.expression.variables.a) ((ofa0) this.b).c;
                    c231[] c231VarArr = (c231[]) list.toArray(new c231[0]);
                    aVar.i((c231[]) Arrays.copyOf(c231VarArr, c231VarArr.length));
                }
                break;
            case 3:
                com.yandex.div.core.expression.variables.a aVar2 = ((k) this.b).b;
                c231[] c231VarArr2 = (c231[]) ((List) obj).toArray(new c231[0]);
                aVar2.i((c231[]) Arrays.copyOf(c231VarArr2, c231VarArr2.length));
                break;
            case 4:
                ((b921) this.b).c.b();
                break;
            case 5:
                com.yandex.div.core.expression.variables.a aVar3 = ((com.yandex.go.payments_widgets.split.g) this.b).b;
                c231[] c231VarArr3 = (c231[]) ((List) obj).toArray(new c231[0]);
                aVar3.i((c231[]) Arrays.copyOf(c231VarArr3, c231VarArr3.length));
                break;
            case 6:
                List list2 = (List) obj;
                if (!list2.isEmpty()) {
                    com.yandex.div.core.expression.variables.a aVar4 = ((j) this.b).c;
                    c231[] c231VarArr4 = (c231[]) list2.toArray(new c231[0]);
                    aVar4.i((c231[]) Arrays.copyOf(c231VarArr4, c231VarArr4.length));
                }
                break;
            case 7:
                Pair pair2 = (Pair) obj;
                break;
            case 8:
                b bVar = (b) this.b;
                mq21 mq21Var = (mq21) obj;
                if (mq21Var instanceof kq21) {
                    kq21 kq21Var = (kq21) mq21Var;
                    bVar.getClass();
                    String c = kq21Var.c();
                    UserPhotoNotificationItemComponent userPhotoNotificationItemComponent = new UserPhotoNotificationItemComponent(bVar.a, bVar.f, kq21Var.e(), kq21Var.a(), kq21Var.b(), c != null ? ((m7x0) bVar.e).a(c) : null, new zr01(21, bVar, kq21Var));
                    bVar.g.e(userPhotoNotificationItemComponent);
                    eq21 eq21Var = bVar.j;
                    String d = kq21Var.d();
                    cug cugVar = eq21Var.b;
                    cugVar.getClass();
                    HashMap hashMap = new HashMap();
                    if (d != null) {
                        hashMap.put("photo_status", d);
                    }
                    cugVar.a.a("UserPhotoUploading.Notification.Shown", hashMap, 1, new HashMap());
                    userPhotoNotificationItemComponent.startExpiresTimer();
                    userPhotoNotificationItemComponent.setExpiresListener(new wz1(19, bVar));
                } else if (!jl40.l(mq21Var, lq21.a)) {
                    w511.b();
                    break;
                } else {
                    ((pep0) bVar.i).f((m950) bVar.h.get(), new hr21(UserPhotoUploadingEntryPoint.NOTIFICATION, false, 6), hxx.a);
                }
                r0 r0Var = bVar.k.a;
                Boolean bool = Boolean.FALSE;
                r0Var.getClass();
                r0Var.m(null, bool);
                break;
            case 9:
                Drawable drawable = (Drawable) obj;
                Bitmap e0 = drawable != null ? ffx.e0(drawable) : null;
                if (e0 != null) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        e0.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                    } catch (Throwable th) {
                        xby.l(jst.e, "PreviewVariableFactory", null, th, "Base64 convert problems", 2);
                    }
                    if (encodeToString == null) {
                        encodeToString = "";
                    }
                    ((ur21) this.b).b(new z131("superapp.profile.avatar_preview", encodeToString));
                    break;
                }
                encodeToString = null;
                if (encodeToString == null) {
                }
                ((ur21) this.b).b(new z131("superapp.profile.avatar_preview", encodeToString));
            case 10:
                n241 n241Var = (n241) this.b;
                int i = m241.a[((RouteChangeReason) obj).ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3 && i != 4) {
                            w511.b();
                            break;
                        }
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        r0 r0Var2 = n241Var.f;
                        Long l = new Long(currentTimeMillis);
                        r0Var2.getClass();
                        r0Var2.m(null, l);
                    }
                } else {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    n241Var.c.q(new Long(currentTimeMillis2).longValue(), "route_start_timestamp");
                    r0 r0Var3 = n241Var.d;
                    Long l2 = new Long(currentTimeMillis2);
                    r0Var3.getClass();
                    r0Var3.m(null, l2);
                    n241Var.f.l(null);
                }
                break;
            case 11:
                se41 se41Var = (se41) this.b;
                se41Var.c.c("WebChatViewController", "Web ready");
                o1b1.b(se41Var.p, "WebChat.WebReady", se41Var.y.a);
                r0 r0Var4 = se41Var.z;
                we41 we41Var = we41.a;
                r0Var4.getClass();
                r0Var4.m(null, we41Var);
                se41Var.d.b(f790.d);
                se41Var.q.invoke();
                break;
            case 12:
                com.yandex.quark.webchat.observers.b bVar2 = (com.yandex.quark.webchat.observers.b) this.b;
                y3x0 y3x0Var = bVar2.a;
                ne41 ne41Var = (ne41) bVar2;
                s690 s690Var = (s690) obj;
                zwf0 zwf0Var = ne41Var.y;
                zwf0Var.c("WebChatUrlObserver", "handleChange: " + s690Var);
                if (s690Var != ne41Var.B) {
                    ke41 ke41Var = ne41Var.z;
                    Bundle bundle = ke41Var.a;
                    if (bundle == null) {
                        bundle = null;
                    }
                    if (bundle != null) {
                        ke41Var.a = null;
                    } else {
                        Uri uri = s690Var.a;
                        if (uri != null) {
                            WebView webView = y3x0Var.e;
                            y3x0Var.j = true;
                            webView.clearHistory();
                            String uri2 = uri.toString();
                            ne41Var.x.b(new d790(uri2, 4));
                            zwf0Var.c("WebChatUrlObserver", "loadUrl: ".concat(uri2));
                            tig0 tig0Var = ne41Var.A;
                            tig0Var.getClass();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            dsu dsuVar = (dsu) ((n4u0) tig0Var.a).getValue();
                            if (!dsuVar.b.isEmpty()) {
                                Map map = dsuVar.b;
                                ArrayList arrayList = new ArrayList();
                                for (Map.Entry entry : map.entrySet()) {
                                    String str2 = (String) entry.getKey();
                                    String str3 = (String) entry.getValue();
                                    try {
                                        str = Uri.parse(str3).getHost();
                                    } catch (Exception e) {
                                        ((zwf0) tig0Var.b).a("WebChat-Headers", "Failed to parse url=" + str3, e);
                                        str = null;
                                    }
                                    String p = str != null ? g8e.p(str2, "=", str) : null;
                                    if (p != null) {
                                        arrayList.add(p);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    linkedHashMap.put("X-Ya-Host-Additional", kotlin.collections.a.X(arrayList, ",", null, null, null, 62));
                                }
                            }
                            webView.loadUrl(uri2, linkedHashMap);
                            f fVar = y3x0Var.f;
                            if (fVar != null) {
                                se41 se41Var2 = fVar.g;
                                zwf0 zwf0Var2 = se41Var2.c;
                                r0 r0Var5 = se41Var2.z;
                                zwf0Var2.c("WebChatViewController", "Load url");
                                if (r0Var5.getValue() instanceof we41) {
                                    do {
                                        value = r0Var5.getValue();
                                    } while (!r0Var5.k(value, xe41.a));
                                }
                                fVar.b = SystemClock.uptimeMillis();
                                fVar.d = false;
                                if (!fVar.c) {
                                    long j = se41Var2.C;
                                    if (j > 0) {
                                        fVar.c = true;
                                        o1b1.b(se41Var2.p, "WebChat.LoadUrl.FromCreated", j);
                                    }
                                }
                            }
                        }
                        ne41Var.B = s690Var;
                    }
                }
                break;
            case 13:
                Pair pair3 = (Pair) obj;
                break;
            case 14:
                ((ru.yandex.taxi.location.lbs.wifi.a) this.b).h = (List) obj;
                break;
            case 15:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                ij51 ij51Var = ((com.yandex.go.ypay.impl.b) this.b).d;
                h6r h6rVar = ij51Var.a;
                SharedPreferences sharedPreferences = ij51Var.b;
                if (booleanValue2 != sharedPreferences.getBoolean("ypay_is_enabled", false)) {
                    oo31.n(sharedPreferences, "ypay_is_enabled", booleanValue2);
                    zzf zzfVar = (zzf) h6rVar;
                    zzfVar.a.getPackageManager().setComponentEnabledSetting(new ComponentName(zzfVar.a, (Class<?>) YPayGoActivity.class), booleanValue2 ? 1 : 2, 1);
                }
                break;
            default:
                Triple triple = (Triple) obj;
                ZoneMode zoneMode = (ZoneMode) triple.getFirst();
                com.yandex.go.navigation.screen.api.Screen screen2 = (com.yandex.go.navigation.screen.api.Screen) triple.getSecond();
                fnx0 fnx0Var = (fnx0) triple.getThird();
                z zVar = (z) this.b;
                Mode b = zVar.b(zoneMode);
                if (b != null) {
                    switch (nd61.a[screen2.ordinal()]) {
                        case 2:
                            screen = Screen.MAIN;
                            break;
                        case 3:
                            screen = Screen.SUMMARY;
                            break;
                        case 4:
                            screen = Screen.SUMMARY;
                            break;
                        case 5:
                            screen = Screen.CHOOSE_A;
                            break;
                        case 6:
                            screen = Screen.CHOOSE_B;
                            break;
                        case 7:
                        default:
                            screen = Screen.MAIN;
                            break;
                        case 8:
                            screen = Screen.TOTW;
                            break;
                        case 9:
                            screen = Screen.MULTIORDER;
                            break;
                        case 10:
                            screen = Screen.TOTW;
                            break;
                        case 11:
                            screen = Screen.TOTW;
                            break;
                    }
                    pex0 pex0Var = fnx0Var.c;
                    TariffOrderFlow tariffOrderFlow = pex0Var.u0;
                    kotlinx.serialization.json.b bVar3 = pex0Var.c0;
                    TariffOrderFlow tariffOrderFlow2 = TariffOrderFlow.SHUTTLE_FLOW;
                    if (tariffOrderFlow == tariffOrderFlow2 && screen == Screen.CHOOSE_A) {
                        byxVar = vvb1.y(bVar3);
                    } else if (tariffOrderFlow == tariffOrderFlow2 && screen == Screen.CHOOSE_B) {
                        byxVar = l76.m(bVar3);
                    } else {
                        Mode mode = Mode.DRIVE;
                        byxVar = (b == mode && screen == Screen.MAIN) ? dai0.C() : (b == mode && screen == Screen.MULTIORDER) ? wfz.o() : (b == Mode.ULTIMA && screen == Screen.MULTIORDER) ? wfz.o() : new byx(screen, new c430(b, fnx0Var.c.c0, 4));
                    }
                }
                if (byxVar != null) {
                    zVar.c.b(byxVar);
                }
                break;
        }
        return zy11.a;
    }
}
