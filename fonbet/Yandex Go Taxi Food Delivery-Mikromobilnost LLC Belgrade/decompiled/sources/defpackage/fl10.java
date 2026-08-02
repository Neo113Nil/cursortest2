package defpackage;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.navigationrail.NavigationRailView;
import com.yandex.go.payments.order.domain.e;
import com.yandex.messaging.core.net.entities.UserData;
import com.yandex.xplat.payment.sdk.ExternalErrorKind;
import com.yandex.xplat.payment.sdk.ExternalErrorTrigger;
import com.yandex.xplat.payment.sdk.MobileBackendApiError;
import com.yandex.xplat.payment.sdk.NetworkServiceError;
import com.yandex.xplat.payment.sdk.NetworkServiceRetryingStrategy;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingFormatArgumentException;
import kotlin.collections.b;
import org.json.JSONArray;
import org.json.JSONException;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.contacts.SelectedFrom;
import ru.yandex.taxi.eatskit.dto.ErrorType;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.masstransit.main.ui.modal.MtMainFlexModalView;
import ru.yandex.taxi.orderforanother.router.a;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes6.dex */
public final class fl10 implements ho3, rc70, h060, kos0, hw31, vjs, ju5, g98, j7w0, mc60, al7, z270, rdq0, nsd0 {
    public Object a;

    public fl10(Bundle bundle) {
        if (bundle != null) {
            this.a = new Bundle(bundle);
        } else {
            ny61.t(Constants.KEY_DATA);
            throw null;
        }
    }

    public static boolean A(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public void B(PointType pointType) {
        vx30 vx30Var = (vx30) this.a;
        m950 m950Var = (m950) vx30Var.F.get();
        SourcePicker sourcePicker = SourcePicker.FROM_TRANSPORT_SUMMARY;
        o501 o501Var = new o501(kyh0.address_search_modal_view_from, kyh0.address_search_modal_view_to, 14);
        vx30Var.A(m950Var, new jsd(pointType, sourcePicker, false, new q501(o501Var, o501Var), vx30Var.R.k(), "order_summary", null, HProv.ALG_TYPE_BLOCK), new k0i(vx30Var, 3));
    }

    @Override // defpackage.rdq0
    public void B0() {
        qv70 qv70Var = ((a) this.a).k;
        qv70Var.getClass();
        qv70Var.a.a("OrderForAnother.SecurityError", new HashMap(), 1, new HashMap());
    }

    public Bundle C() {
        Bundle bundle = (Bundle) this.a;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    @Override // defpackage.go3
    public void D(Object obj) {
        UserData userData = (UserData) obj;
        q920 q920Var = (q920) this.a;
        l020 C = q920Var.a.C();
        try {
            C.P0(userData);
            C.s();
            C.close();
            q920Var.e = null;
        } finally {
        }
    }

    public void E(oz10 oz10Var) {
        this.a = oz10Var;
    }

    public void F() {
        vx30 vx30Var = (vx30) this.a;
        vx30Var.A((m950) vx30Var.T.get(), new ur30(7), new tx30());
    }

    @Override // defpackage.rdq0
    public void I(bgq0 bgq0Var) {
        a aVar = (a) this.a;
        qv70 qv70Var = aVar.k;
        ru.yandex.taxi.orderforanother.repository.a aVar2 = aVar.f;
        String str = bgq0Var.b;
        String str2 = bgq0Var.a;
        aVar2.k(str, str2);
        if (bgq0Var.c == SelectedFrom.CONTACTS) {
            qv70Var.getClass();
            qv70Var.a.a("OrderForAnother.PassengerFromPhonebook", new HashMap(), 1, new HashMap());
            return;
        }
        if (evu0.J(str2)) {
            qv70Var.getClass();
            qv70Var.a.a("OrderForAnother.PassengerManualEntered", new HashMap(), 1, new HashMap());
            return;
        }
        qv70Var.getClass();
        qv70Var.a.a("OrderForAnother.PassengerWithNameManualEntered", new HashMap(), 1, new HashMap());
    }

    @Override // defpackage.j7w0
    public void a(d6j0 d6j0Var) {
        String str;
        String str2;
        String str3 = null;
        if (d6j0Var != null) {
            ErrorType errorType = d6j0Var.e;
            str2 = errorType != null ? String.valueOf(errorType) : null;
            str = d6j0Var.b;
        } else {
            str = null;
            str2 = null;
        }
        co40 co40Var = ((ru.yandex.taxi.new_history.a) this.a).D.a;
        if (str2 == null || str2.length() <= 0) {
            str2 = null;
        }
        if (str != null && str.length() > 0) {
            str3 = str;
        }
        co40Var.getClass();
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            hashMap.put("error_type", str2);
        }
        if (str3 != null) {
            hashMap.put("error_message", str3);
        }
        co40Var.a.a("OrderHistory.WebviewError", hashMap, 1, b.f());
    }

    @Override // defpackage.vjs
    public void b() {
        ((ag50) this.a).r(new ej40(18));
    }

    @Override // defpackage.ho3
    /* renamed from: c */
    public boolean mo103c(int i) {
        return false;
    }

    @Override // defpackage.nsd0
    public void d(wqw wqwVar) {
        z80 z80Var = (z80) wqwVar;
        PaymentMethod$Type a = z80Var.e().a();
        if (a != null && z80Var.b) {
            kv90 kv90Var = lv90.Companion;
            String c = z80Var.c();
            kv90Var.getClass();
            ((e) this.a).P.a.l(kv90.b(c, a));
        }
    }

    @Override // defpackage.g98
    public void e(f98 f98Var) {
        ((p560) this.a).l.l(f98Var);
    }

    @Override // defpackage.vjs
    public void f() {
    }

    @Override // defpackage.g98
    public void g(rk6 rk6Var) {
        ((p560) this.a).n = rk6Var;
    }

    @Override // defpackage.h060
    public NetworkServiceError h(y3x y3xVar, int i) {
        tyj0 d = mbb1.d(y3xVar, new ps20(3));
        if (d.b()) {
            return null;
        }
        return new MobileBackendApiError((ss20) d.a());
    }

    @Override // defpackage.h060
    public NetworkServiceError i(NetworkServiceError networkServiceError) {
        return networkServiceError instanceof MobileBackendApiError ? networkServiceError : networkServiceError.h(ExternalErrorTrigger.mobile_backend);
    }

    @Override // defpackage.j7w0
    public void j() {
        q560 q560Var = ((ru.yandex.taxi.new_history.a) this.a).D;
        co40 co40Var = q560Var.a;
        ru.yandex.taxi.perf.b bVar = q560Var.b;
        String lowerCase = bVar.b().name().toLowerCase(Locale.ROOT);
        String c = bVar.c();
        double elapsedRealtime = (SystemClock.elapsedRealtime() - bVar.e()) / 1000.0d;
        co40Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("app_launch_type", lowerCase);
        hashMap.put("open_reason", "menu");
        hashMap.put("time_since_app_launch", c);
        hashMap.put("time_since_app_launch_sec", Double.valueOf(elapsedRealtime));
        co40Var.a.a("OrderHistory.Shown", hashMap, 1, new HashMap());
    }

    @Override // defpackage.hw31
    public n751 k(View view, n751 n751Var, iw31 iw31Var) {
        Boolean bool;
        boolean shouldApplyWindowInsetPadding;
        Boolean bool2;
        boolean shouldApplyWindowInsetPadding2;
        Boolean bool3;
        boolean shouldApplyWindowInsetPadding3;
        k751 k751Var = n751Var.a;
        u1w g = k751Var.g(519);
        u1w g2 = k751Var.g(128);
        NavigationRailView navigationRailView = (NavigationRailView) this.a;
        bool = navigationRailView.paddingTopSystemWindowInsets;
        shouldApplyWindowInsetPadding = navigationRailView.shouldApplyWindowInsetPadding(bool);
        if (shouldApplyWindowInsetPadding) {
            iw31Var.b += g.b;
        }
        bool2 = navigationRailView.paddingBottomSystemWindowInsets;
        shouldApplyWindowInsetPadding2 = navigationRailView.shouldApplyWindowInsetPadding(bool2);
        if (shouldApplyWindowInsetPadding2) {
            iw31Var.d += g.d;
        }
        bool3 = navigationRailView.paddingStartSystemWindowInsets;
        shouldApplyWindowInsetPadding3 = navigationRailView.shouldApplyWindowInsetPadding(bool3);
        if (shouldApplyWindowInsetPadding3) {
            boolean i = com.google.android.material.internal.e.i(view);
            int i2 = iw31Var.a;
            if (i) {
                iw31Var.a = Math.max(g.c, g2.c) + i2;
            } else {
                iw31Var.a = Math.max(g.a, g2.a) + i2;
            }
        }
        view.setPaddingRelative(iw31Var.a, iw31Var.b, iw31Var.c, iw31Var.d);
        return n751Var;
    }

    @Override // defpackage.rc70
    public void l(Object obj, String str) {
        ((da20) this.a).error("sqlite_error", str, obj);
    }

    @Override // defpackage.h060
    public md51 m(NetworkServiceError networkServiceError) {
        return networkServiceError.getKind() == ExternalErrorKind.authorization_expired_token ? ((mhj) this.a).b.a().h(new ps20(2)) : zmx.d(NetworkServiceRetryingStrategy.noRetry);
    }

    @Override // defpackage.h060
    public NetworkServiceError n(y3x y3xVar) {
        return null;
    }

    public pz10 o() {
        return new pz10((oz10) this.a);
    }

    @Override // defpackage.vjs
    public void onBack() {
        ((ag50) this.a).r(new qu(9));
    }

    @Override // defpackage.al7
    public void onFailure(yf7 yf7Var, IOException iOException) {
        ((w4r0) this.a).m(iOException);
    }

    @Override // defpackage.al7
    public void onResponse(yf7 yf7Var, kvj0 kvj0Var) {
        ((w4r0) this.a).l(kvj0Var);
    }

    public boolean p(String str) {
        String y = y(str);
        return "1".equals(y) || Boolean.parseBoolean(y);
    }

    @Override // defpackage.ju5
    public void q(ryj0 ryj0Var) {
        ((yv90) ((l560) this.a).b).j.a(ryj0Var);
    }

    @Override // defpackage.kos0
    public void r(int i) {
        lo30 lo30Var;
        int maxAnchoredHeight;
        MtMainFlexModalView mtMainFlexModalView = (MtMainFlexModalView) this.a;
        lo30Var = mtMainFlexModalView.presenter;
        maxAnchoredHeight = super/*ru.yandex.taxi.masstransit.main.ui.flex.SlideableFlexModalView*/.getMaxAnchoredHeight();
        avj0 avj0Var = (avj0) lo30Var.C;
        int u = tje.u(50, avj0Var.a);
        int u2 = tje.u(55, avj0Var.a);
        lo30Var.B.q3(lo30Var, u2, u, u2, maxAnchoredHeight);
        mtMainFlexModalView.invalidateFlexVisibleBoundsAfterLayout();
    }

    public Integer s(String str) {
        String y = y(str);
        if (TextUtils.isEmpty(y)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(y));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // defpackage.rc70
    public void success(Object obj) {
        ((da20) this.a).success(obj);
    }

    public JSONArray t(String str) {
        String y = y(str);
        if (TextUtils.isEmpty(y)) {
            return null;
        }
        try {
            return new JSONArray(y);
        } catch (JSONException unused) {
            return null;
        }
    }

    public int[] u() {
        JSONArray t = t("gcm.n.light_settings");
        if (t == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (t.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int parseColor = Color.parseColor(t.optString(0));
            if (parseColor == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = parseColor;
            iArr[1] = t.optInt(1);
            iArr[2] = t.optInt(2);
            return iArr;
        } catch (IllegalArgumentException unused) {
            t.toString();
            return null;
        } catch (JSONException unused2) {
            t.toString();
            return null;
        }
    }

    public Object[] v(String str) {
        JSONArray t = t(str.concat("_loc_args"));
        if (t == null) {
            return null;
        }
        int length = t.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = t.optString(i);
        }
        return strArr;
    }

    public String w(String str) {
        return y(str.concat("_loc_key"));
    }

    public String x(Resources resources, String str, String str2) {
        int identifier;
        String y = y(str2);
        if (!TextUtils.isEmpty(y)) {
            return y;
        }
        String w = w(str2);
        if (TextUtils.isEmpty(w) || (identifier = resources.getIdentifier(w, "string", str)) == 0) {
            return null;
        }
        Object[] v = v(str2);
        if (v == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, v);
        } catch (MissingFormatArgumentException unused) {
            Arrays.toString(v);
            return null;
        }
    }

    public String y(String str) {
        Bundle bundle = (Bundle) this.a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public long[] z() {
        JSONArray t = t("gcm.n.vibrate_timings");
        if (t == null) {
            return null;
        }
        try {
            if (t.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = t.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = t.optLong(i);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            t.toString();
            return null;
        }
    }

    public /* synthetic */ fl10(Object obj) {
        this.a = obj;
    }
}
