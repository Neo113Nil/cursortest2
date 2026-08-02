package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import androidx.compose.ui.platform.ComposeView;
import androidx.media3.common.a;
import com.yandex.fintechsdk.entities.theme.Theme;
import com.yandex.fintechsdk.flows.payment.kit.api.model.AdditionalSettings;
import com.yandex.fintechsdk.flows.payment.kit.api.model.ConsoleLoggingMode;
import com.yandex.fintechsdk.flows.payment.kit.api.model.Merchant;
import com.yandex.fintechsdk.flows.payment.kit.api.model.Payer;
import com.yandex.fintechsdk.flows.payment.kit.api.model.PaymentKitEnvironment;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.Driver;
import com.yandex.go.taxi.order.models.api.status.ActionType;
import com.yandex.go.taxi.order.models.api.status.OrderStatusWindowAction;
import com.yandex.go.taxi.order.models.api.status.OrderStatusWindowButton;
import com.yandex.go.taxi.order.models.api.status.RequiredCardBalance;
import com.yandex.mapkit.geometry.Point;
import com.yandex.messaging.auth.AuthFailedResponseException;
import com.yandex.messaging.auth.AuthInvalidUrlException;
import com.yandex.pay.payment.PaymentData;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.ybsdk.feature.passes.widget.api.entity.PassesWidgetScreenType;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.fragment.YandexTaxiFragment;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.definitions.RoutePointCommentImageDto;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.formclientstate.FormStateRoutePointDto;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.order.f;

/* loaded from: classes13.dex */
public final class p370 implements mvo, th70, wni, qq70, zo90, e3q0, ryj0, iv60 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object w;

    public p370(ike ikeVar, gci0 gci0Var) {
        this.a = 11;
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        this.b = ffx.b(0, 1, bufferOverflow);
        this.c = ffx.b(0, 1, bufferOverflow);
        this.w = e.R(gci0Var, ikeVar, wsr0.a(xsr0.a, 3), gci0Var.a.getValue());
    }

    public boolean A() {
        boolean isEnabled;
        tv3 tv3Var = (tv3) this.c;
        tv3Var.getClass();
        k4o entries = PassesWidgetScreenType.getEntries();
        b bVar = tv3Var.a;
        int d = gw00.d(tcc.n(entries, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Object obj : entries) {
            int i = c8b0.a[((PassesWidgetScreenType) obj).ordinal()];
            if (i == 1) {
                bVar.getClass();
                isEnabled = ((CommonFeatureFlag) bVar.d(wlp.a0).getData()).isEnabled();
            } else {
                if (i != 2) {
                    w511.b();
                    return false;
                }
                bVar.getClass();
                isEnabled = ((CommonFeatureFlag) bVar.d(wlp.c0).getData()).isEnabled();
            }
            linkedHashMap.put(obj, Boolean.valueOf(isEnabled));
        }
        Boolean bool = (Boolean) linkedHashMap.get((PassesWidgetScreenType) this.w);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public void B(o2y0 o2y0Var) {
        TaxiOrder b = o2y0Var.b();
        if (jl40.l(b.V().g, Driver.v)) {
            return;
        }
        qim a = rim.a(b);
        ((pep0) ((oep0) this.w)).f((m950) ((yvf0) this.c).get(), a, hxx.a);
    }

    public void a(o2y0 o2y0Var, OrderStatusWindowButton orderStatusWindowButton) {
        a3y0 a3y0Var = (a3y0) this.w;
        zrm zrmVar = (zrm) this.c;
        o2y0 o2y0Var2 = (o2y0) zrmVar.c;
        pit pitVar = (pit) zrmVar.b;
        OrderStatusWindowAction orderStatusWindowAction = orderStatusWindowButton.d;
        ActionType actionType = orderStatusWindowAction.a;
        String str = orderStatusWindowAction.g;
        boolean z = orderStatusWindowAction.h;
        be9 be9Var = null;
        switch (p880.a[actionType.ordinal()]) {
            case 1:
                int i = p880.b[orderStatusWindowAction.b.ordinal()];
                if (i == 1) {
                    y(o2y0Var, false);
                    break;
                } else if (i == 2) {
                    y(o2y0Var, true);
                    break;
                } else if (i == 3) {
                    ((lit) pitVar.g.b).openOrderPaymentMethods(o2y0Var);
                    break;
                } else if (i != 4) {
                    w511.b();
                    break;
                } else {
                    a3y0.d(a3y0Var, "goToScreen", new IllegalStateException("Illegal screen name in OrderStatusRouter"), null, 4);
                    break;
                }
            case 2:
                String str2 = orderStatusWindowAction.c;
                if (str2 != null && !evu0.J(str2)) {
                    ((mg21) ((lg21) this.b)).c(str2);
                    break;
                }
                break;
            case 3:
                ((lit) pitVar.g.b).lg(o2y0Var2);
                break;
            case 4:
                RequiredCardBalance requiredCardBalance = orderStatusWindowAction.d;
                String str3 = orderStatusWindowAction.f;
                if (str.length() != 0 && str3.length() != 0) {
                    be9Var = new be9(str3, str, z);
                }
                ((lit) pitVar.g.b).ug(o2y0Var2, requiredCardBalance, be9Var);
                break;
            case 5:
                ((lit) pitVar.g.b).p3(o2y0Var2, orderStatusWindowAction.e, z);
                break;
            case 6:
                break;
            case 7:
                a3y0.d(a3y0Var, "clickOnButton", new IllegalStateException("Illegal action type in OrderStatusRouter"), null, 4);
                break;
            default:
                w511.b();
                break;
        }
    }

    @Override // defpackage.e3q0
    public void b(ef90 ef90Var) {
        long d;
        long j;
        d6z.z((sez0) this.c);
        int i = tw21.a;
        sez0 sez0Var = (sez0) this.c;
        synchronized (sez0Var) {
            try {
                long j2 = sez0Var.c;
                d = j2 != -9223372036854775807L ? j2 + sez0Var.b : sez0Var.d();
            } finally {
            }
        }
        sez0 sez0Var2 = (sez0) this.c;
        synchronized (sez0Var2) {
            j = sez0Var2.b;
        }
        if (d == -9223372036854775807L || j == -9223372036854775807L) {
            return;
        }
        a aVar = (a) this.b;
        if (j != aVar.s) {
            f7s a = aVar.a();
            a.r = j;
            a aVar2 = new a(a);
            this.b = aVar2;
            ((g001) this.w).d(aVar2);
        }
        int a2 = ef90Var.a();
        ((g001) this.w).a(ef90Var, a2, 0);
        ((g001) this.w).c(d, 1, a2, 0, null);
    }

    @Override // defpackage.e3q0
    public void c(sez0 sez0Var, d5p d5pVar, xi11 xi11Var) {
        this.c = sez0Var;
        xi11Var.c();
        xi11Var.d();
        g001 B = d5pVar.B(xi11Var.d, 5);
        this.w = B;
        B.d((a) this.b);
    }

    @Override // defpackage.mvo
    public b231 d(Map map) {
        return ((ut5) this.w).a(((mvo) this.b).d(map), ((mvo) this.c).d(map));
    }

    @Override // defpackage.qq70
    public void e(DriveState driveState) {
        o2y0 o2y0Var = (o2y0) this.w;
        f fVar = (f) this.b;
        fVar.W.p();
        wu7 wu7Var = (wu7) this.c;
        if (wu7Var != null) {
            wu7Var.k(o2y0Var.b());
        }
        fVar.d0(o2y0Var).c(new bgc(12), new th40(5, o2y0Var, fVar, driveState));
    }

    @Override // defpackage.zo90
    public Object f(com.yandex.messaging.auth.passport.b bVar) {
        switch (this.a) {
            case 18:
                bVar.c((String) this.b);
                return new op90(bVar.e((wl3) this.c).a);
            default:
                try {
                    bVar.a((wl3) this.b, (Uri) this.c);
                    return Boolean.TRUE;
                } catch (AuthFailedResponseException | AuthInvalidUrlException unused) {
                    return Boolean.FALSE;
                }
        }
    }

    @Override // defpackage.qq70
    public void g(DriveState driveState) {
        f fVar = (f) this.b;
        o2y0 o2y0Var = (o2y0) this.w;
        fVar.Z(o2y0Var);
        wu7 wu7Var = (wu7) this.c;
        if (wu7Var != null) {
            wu7Var.d();
        }
        TaxiOrder b = o2y0Var.b();
        synchronized (b) {
            b.l = b.l.B(false);
        }
        rp70 rp70Var = fVar.C1;
        TaxiOrder b2 = o2y0Var.b();
        rp70Var.getClass();
        if (rp70.c(b2) && !b2.D()) {
            fVar.s0(o2y0Var);
            return;
        }
        f83 f83Var = new f83(o2y0Var.b(), driveState, rp70Var, new h2r(18, fVar, o2y0Var), 7);
        YandexTaxiFragment yandexTaxiFragment = (YandexTaxiFragment) rp70Var.a.get();
        if (yandexTaxiFragment == null) {
            return;
        }
        yandexTaxiFragment.showDialog(f83Var);
    }

    public com.yandex.fintechsdk.flows.payment.kit.internal.model.a h(AdditionalSettings additionalSettings, Merchant merchant, Payer payer) {
        Context context = (Context) this.c;
        if (payer.getOauthToken() != null && payer.getUid() == null) {
            ny61.g("If oauthToken is provided, uid must also be provided");
            return null;
        }
        Theme theme = additionalSettings.getTheme();
        SharedPreferences.Editor edit = context.getSharedPreferences("payment_kit_theme_prefs", 0).edit();
        if (theme == null) {
            edit.remove("key_theme");
        } else {
            edit.putString("key_theme", theme.name());
        }
        edit.apply();
        return new com.yandex.fintechsdk.flows.payment.kit.internal.model.a(additionalSettings, (ConsoleLoggingMode) this.b, context.getApplicationContext(), (PaymentKitEnvironment) this.w, merchant, payer);
    }

    @Override // defpackage.ryj0
    public void i(Object obj) {
        ((yv90) this.b).i = null;
        ((ryj0) this.w).i((PaymentKitError) obj);
    }

    @Override // defpackage.iv60
    public int j(int i) {
        int d = y6i0.d(i, 0, ((String) this.w).length());
        int length = ((String) this.b).length();
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; r(i3) <= d; i3++) {
            if (i3 == length) {
                return i3;
            }
            i2 = i3;
        }
        return i2;
    }

    public ArrayList k() {
        List<y2b0> d = ((v2b0) this.w).d((String) this.b);
        ArrayList arrayList = new ArrayList();
        for (y2b0 y2b0Var : d) {
            Object a = ((atq0) this.c).a(y2b0Var.b);
            if (a == null) {
                z83.i();
                a = null;
            }
            u2b0 u2b0Var = a != null ? new u2b0(y2b0Var.a, a) : null;
            if (u2b0Var != null) {
                arrayList.add(u2b0Var);
            }
        }
        return arrayList;
    }

    @Override // defpackage.zo90
    public void l(Object obj) {
        switch (this.a) {
            case 18:
                ((pp90) this.w).a((op90) obj, true);
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                mrj mrjVar = (mrj) this.w;
                if (!booleanValue) {
                    mrjVar.t();
                    break;
                } else {
                    ((Handler) mrjVar.b).post(new zi(5, mrjVar));
                    break;
                }
        }
    }

    @Override // defpackage.wni
    public ComposeView m(uni uniVar, vni vniVar) {
        ComposeView composeView = new ComposeView((Context) this.b, null, 0, 6, null);
        composeView.setContent(new androidx.compose.runtime.internal.a(2138724924, new dk70(this, (ek70) uniVar, (ck70) vniVar, 0), true));
        return composeView;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List n(c0k0 c0k0Var, j6s j6sVar) {
        List<RoutePointCommentImageDto> commentImages;
        kkb0 kkb0Var;
        e0l0 e0l0Var;
        if (c0k0Var instanceof yzj0) {
            yzj0 yzj0Var = (yzj0) c0k0Var;
            d51 d51Var = yzj0Var.b;
            if (d51Var instanceof b51) {
                e0l0Var = j6sVar.d;
            } else {
                if (!(d51Var instanceof c51)) {
                    w511.b();
                    return null;
                }
                e0l0Var = j6sVar.c;
            }
            qv0 qv0Var = (qv0) kotlin.collections.a.S(yzj0Var.a, e0l0Var.a);
            if (qv0Var != null) {
                return qv0Var.h;
            }
        } else if (c0k0Var instanceof zzj0) {
            Object obj = j6sVar.a.get(((zzj0) c0k0Var).a);
            List list = obj instanceof List ? (List) obj : null;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 != null) {
                        l6s l6sVar = (l6s) this.c;
                        RoutePointCommentImageDto routePointCommentImageDto = (RoutePointCommentImageDto) l6sVar.d.fromJsonValue(l6sVar.e.toJsonValue(obj2));
                        if (routePointCommentImageDto != null) {
                            kkb0Var = new kkb0(routePointCommentImageDto.getPath(), routePointCommentImageDto.getDownloadUrl());
                            if (kkb0Var == null) {
                                arrayList.add(kkb0Var);
                            }
                        }
                    }
                    kkb0Var = null;
                    if (kkb0Var == null) {
                    }
                }
                return arrayList;
            }
        } else {
            if (!(c0k0Var instanceof a0k0)) {
                w511.b();
                return null;
            }
            FormStateRoutePointDto h = ((mum) this.b).h(j6sVar, ((a0k0) c0k0Var).a);
            if (h != null && (commentImages = h.getCommentImages()) != null) {
                List<RoutePointCommentImageDto> list2 = commentImages;
                ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                for (RoutePointCommentImageDto routePointCommentImageDto2 : list2) {
                    arrayList2.add(new kkb0(routePointCommentImageDto2.getPath(), routePointCommentImageDto2.getDownloadUrl()));
                }
                return arrayList2;
            }
        }
        return null;
    }

    @Override // defpackage.zo90
    public String name() {
        switch (this.a) {
            case 18:
                return "refreshToken";
            default:
                return "acceptAuthInTrack";
        }
    }

    public int o() {
        s890 s890Var = (s890) this.c;
        if (s890Var == null) {
            s890Var = null;
        }
        if (s890Var.a.isEmpty()) {
            return -1;
        }
        s890 s890Var2 = (s890) this.c;
        if (s890Var2 == null) {
            s890Var2 = null;
        }
        long j = ((da10) kotlin.collections.a.P(s890Var2.a)).a - (((s890) this.c) != null ? r4 : null).h;
        if (j < 0) {
            j = 0;
        }
        return (int) j;
    }

    @Override // defpackage.ryj0
    public void onSuccess(Object obj) {
        yv90 yv90Var = (yv90) this.b;
        boj0 boj0Var = (boj0) this.c;
        yv90Var.i = boj0Var;
        ((ryj0) this.w).onSuccess(boj0Var.h());
    }

    public boolean p() {
        s890 s890Var = (s890) this.c;
        if (s890Var == null) {
            s890Var = null;
        }
        return !s890Var.a.isEmpty();
    }

    public String q() {
        return (String) this.c;
    }

    @Override // defpackage.iv60
    public int r(int i) {
        String str = (String) this.b;
        int length = vi91.h(gvu0.A0(y6i0.d(i, 0, str.length()), str), ((ffb0) this.c).a).length();
        int length2 = ((String) this.w).length();
        return length > length2 ? length2 : length;
    }

    public int s() {
        s890 s890Var = (s890) this.c;
        if (s890Var == null) {
            s890Var = null;
        }
        if (s890Var.a.isEmpty()) {
            return -1;
        }
        s890 s890Var2 = (s890) this.c;
        if (s890Var2 == null) {
            s890Var2 = null;
        }
        long j = ((da10) kotlin.collections.a.Z(s890Var2.a)).a + (((s890) this.c) != null ? r0 : null).h;
        long x = x() - 1;
        if (j > x) {
            j = x;
        }
        return (int) j;
    }

    public int t() {
        s890 s890Var = (s890) this.c;
        if (s890Var == null) {
            s890Var = null;
        }
        if (s890Var.a.isEmpty()) {
            return 0;
        }
        s890 s890Var2 = (s890) this.c;
        if (s890Var2 == null) {
            s890Var2 = null;
        }
        int i = ((da10) kotlin.collections.a.Z(s890Var2.a)).j;
        s890 s890Var3 = (s890) this.c;
        return Math.abs(((i + (s890Var3 != null ? s890Var3 : null).b) + (s890Var3 != null ? s890Var3 : null).c) - (s890Var3 != null ? s890Var3 : null).g);
    }

    public int u() {
        s890 s890Var = (s890) this.c;
        if (s890Var == null) {
            s890Var = null;
        }
        if (s890Var.a.isEmpty()) {
            return 0;
        }
        s890 s890Var2 = (s890) this.c;
        if (s890Var2 == null) {
            s890Var2 = null;
        }
        int i = ((da10) kotlin.collections.a.P(s890Var2.a)).j;
        s890 s890Var3 = (s890) this.c;
        int i2 = i + (-(s890Var3 != null ? s890Var3 : null).f);
        return Math.abs(i2 <= 0 ? i2 : 0);
    }

    public Point v() {
        return (Point) this.b;
    }

    public String w() {
        return (String) this.w;
    }

    public int x() {
        return ((Number) ((ny8) this.b).invoke()).intValue();
    }

    public void y(o2y0 o2y0Var, boolean z) {
        ((lit) ((pit) ((zrm) this.c).b).g.b).Qe(o2y0Var, z);
    }

    public boolean z() {
        ew2 ew2Var = ((mm90) this.b).a;
        kgx kgxVar = mm90.b[0];
        return ew2Var.a().booleanValue();
    }

    public /* synthetic */ p370(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    public p370(Context context, PaymentData paymentData, rzq0 rzq0Var) {
        this.a = 26;
        this.b = paymentData;
        this.c = rzq0Var;
        this.w = context.getPackageName();
    }

    public p370(at2 at2Var, String str, atq0 atq0Var) {
        this.a = 27;
        this.b = str;
        this.c = atq0Var;
        this.w = at2Var.n0();
    }

    public /* synthetic */ p370(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public p370(Context context, z0a0 z0a0Var) {
        this.a = 25;
        this.b = context;
        this.c = z0a0Var;
        this.w = kotlin.a.b(LazyThreadSafetyMode.NONE, new ak80(18, this));
    }

    public p370(lg21 lg21Var, zrm zrmVar) {
        this.a = 10;
        this.b = lg21Var;
        this.c = zrmVar;
        this.w = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "OrderStatusRouter");
    }

    public p370(String str) {
        this.a = 20;
        f7s f7sVar = new f7s();
        f7sVar.l = eh20.q("video/mp2t");
        f7sVar.m = eh20.q(str);
        this.b = new a(f7sVar);
    }
}
