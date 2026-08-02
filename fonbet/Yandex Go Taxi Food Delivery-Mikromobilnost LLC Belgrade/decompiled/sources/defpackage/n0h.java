package defpackage;

import android.net.Uri;
import android.os.Build;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.plus.core.strings.PlusSdkBrandType;
import com.yandex.plus.home.api.location.GeoPoint;
import com.yandex.plus.log.api.LogPriority;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.a;
import kotlin.collections.EmptySet;
import kotlin.collections.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes2.dex */
public final class n0h implements i0h {
    public final Uri a;
    public final pgz b;
    public final v920 c;
    public final i3y d;
    public final i3y e;
    public final i3y f;
    public final i3y g;
    public final i3y h;

    public n0h(final boolean z, cmd0 cmd0Var, String str, final Map map, final boolean z2, final String str2, final String str3, final String str4, final boolean z3, final Locale locale, final String str5, final String str6, final jzs jzsVar, final String str7, final boolean z4, final String str8, final sgs sgsVar, final dtt dttVar, final PlusSdkBrandType plusSdkBrandType, final int i, Uri uri, pgz pgzVar, v920 v920Var) {
        String str9 = Build.MANUFACTURER;
        String str10 = Build.MODEL;
        this.a = uri;
        this.b = pgzVar;
        this.c = v920Var;
        this.d = a.a(new sls() { // from class: j0h
            {
                String str11 = Build.MANUFACTURER;
                String str12 = Build.MODEL;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                String str11;
                Pair pair;
                String str12;
                GeoPoint geoPoint;
                GeoPoint geoPoint2;
                GeoPoint geoPoint3;
                GeoPoint geoPoint4;
                GeoPoint geoPoint5;
                GeoPoint geoPoint6;
                String str13 = Build.MANUFACTURER;
                String str14 = Build.MODEL;
                Pair pair2 = new Pair("client_app_version", u4r0.e(str2));
                String str15 = str3;
                Pair pair3 = new Pair("client_id", u4r0.e(str15));
                Pair pair4 = new Pair("service_name", u4r0.e(str15));
                Pair pair5 = new Pair(DivkitThemeChangeListener.THEME_VARIABLE_NAME, Collections.singleton(z3 ? "DARK" : "LIGHT"));
                Pair pair6 = new Pair("lang", u4r0.e(locale.getLanguage()));
                Pair pair7 = new Pair("plus_sdk_version", Collections.singleton("110.0.2"));
                Pair pair8 = new Pair(MetaDataField.DEVICE_MANUFACTURER_FIELD, u4r0.e(str13));
                Pair pair9 = new Pair(MetaDataField.DEVICE_MODEL_FIELD, u4r0.e(str14));
                Pair pair10 = new Pair("os_version", u4r0.e(String.valueOf(i)));
                Pair pair11 = new Pair("mm_device_id", u4r0.e(str5));
                Pair pair12 = new Pair("metrica_uuid", u4r0.e(str6));
                int i2 = m0h.a[plusSdkBrandType.ordinal()];
                if (i2 == 1) {
                    str11 = "yandex";
                } else {
                    if (i2 != 2) {
                        w511.b();
                        return null;
                    }
                    str11 = "yango";
                }
                Pair pair13 = new Pair("brand", Collections.singleton(str11));
                Pair pair14 = new Pair("mode", Collections.singleton("SDK"));
                Pair pair15 = new Pair("platform", Collections.singleton("ANDROID"));
                Pair pair16 = new Pair("log_id", u4r0.e(str8));
                Pair pair17 = new Pair("plus_sdk_service_channel", u4r0.e(str4));
                Pair pair18 = new Pair("place", u4r0.e(str7));
                Pair pair19 = new Pair("host_purchase_available", u4r0.e(String.valueOf(z4)));
                Pair pair20 = new Pair("source", EmptySet.a);
                jzs jzsVar2 = jzsVar;
                Pair pair21 = new Pair("coordinates_lat", u4r0.e((jzsVar2 == null || (geoPoint6 = jzsVar2.a) == null) ? null : Double.valueOf(geoPoint6.getLat()).toString()));
                Pair pair22 = new Pair("coordinates_lon", u4r0.e((jzsVar2 == null || (geoPoint5 = jzsVar2.a) == null) ? null : Double.valueOf(geoPoint5.getLon()).toString()));
                Pair pair23 = new Pair("coordinates_acc", u4r0.e((jzsVar2 == null || (geoPoint4 = jzsVar2.a) == null) ? null : Integer.valueOf(geoPoint4.getAccuracy()).toString()));
                Pair pair24 = new Pair("geo_pin_position_lat", u4r0.e((jzsVar2 == null || (geoPoint3 = jzsVar2.b) == null) ? null : Double.valueOf(geoPoint3.getLat()).toString()));
                Pair pair25 = new Pair("geo_pin_position_lon", u4r0.e((jzsVar2 == null || (geoPoint2 = jzsVar2.b) == null) ? null : Double.valueOf(geoPoint2.getLon()).toString()));
                Pair pair26 = new Pair("geo_pin_position_acc", u4r0.e((jzsVar2 == null || (geoPoint = jzsVar2.b) == null) ? null : Integer.valueOf(geoPoint.getAccuracy()).toString()));
                Pair pair27 = new Pair("geo_zone_name", u4r0.e(jzsVar2 != null ? jzsVar2.c : null));
                dtt dttVar2 = dttVar;
                Pair pair28 = new Pair("plus_sdk_is_native_payment_available", u4r0.e(String.valueOf(dttVar2.b)));
                Pair pair29 = new Pair("plus_sdk_inapp_country_code", u4r0.e(dttVar2.a));
                Map map2 = map;
                if (map2 != null) {
                    pair = pair28;
                    str12 = sbx.d.c(map2, bm2.a);
                } else {
                    pair = pair28;
                    str12 = null;
                }
                Pair pair30 = new Pair("service_payload", u4r0.e(str12));
                sgs sgsVar2 = sgsVar;
                return b.i(pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pair21, pair22, pair23, pair24, pair25, pair26, pair27, pair, pair29, pair30, new Pair("sal", u4r0.e(String.valueOf(sgsVar2.a))), new Pair("sat", u4r0.e(String.valueOf(sgsVar2.b))), new Pair("sar", u4r0.e(String.valueOf(sgsVar2.c))), new Pair("sab", u4r0.e(String.valueOf(sgsVar2.d))));
            }
        });
        this.e = a.a(new k0h(this, z, z2, cmd0Var, str));
        this.f = a.a(new sls() { // from class: l0h
            @Override // defpackage.sls
            public final Object invoke() {
                Map map2 = (Map) n0h.this.d.getValue();
                String str11 = z ? "COOKIE_INJECT" : null;
                boolean z5 = z2;
                String[] strArr = {"BROADCASTING", "UPD_TARGETS", "SMART_WEBVIEW", "CUSTOM_HEADER_V1", "SERVICE_INFORMATION", "MINI_STORIES", str11, z5 ? "BANK" : null, z5 ? "WALLET" : null, "BACKGROUND_FOREGROUND_MESSAGES", "OVERLAP_MESSAGES", "NATIVE_VIBRATE"};
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (int i2 = 0; i2 < 12; i2++) {
                    String str12 = strArr[i2];
                    if (str12 != null) {
                        linkedHashSet.add(str12);
                    }
                }
                return b.n(map2, b.i(new Pair("available_features", linkedHashSet), new Pair("smart-view", Collections.singleton("broadcasting"))));
            }
        });
        this.g = a.a(new zo1(this, z, 7));
        this.h = a.a(new sb0(26, str2, str3, dttVar));
    }

    public static LinkedHashMap e(Uri uri) {
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        int d = gw00.d(tcc.n(queryParameterNames, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Object obj : queryParameterNames) {
            linkedHashMap.put(obj, kotlin.collections.a.N0(uri.getQueryParameters((String) obj)));
        }
        return linkedHashMap;
    }

    public static void f(Uri.Builder builder, LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (!((Set) entry.getValue()).isEmpty()) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            String str = (String) entry2.getKey();
            Set set = (Set) entry2.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                String str2 = (String) obj;
                if (str2.length() != 0 && !str2.equalsIgnoreCase("null")) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                builder.appendQueryParameter(str, (String) it.next());
            }
        }
    }

    @Override // defpackage.i0h
    public final Object a(ozg ozgVar, Continuation continuation) {
        Map i = b.i(new Pair(Constants.KEY_MESSAGE, u4r0.e(ozgVar.c)), new Pair(com.adjust.sdk.Constants.DEEPLINK, u4r0.e(this.c.p(ozgVar).toString())), new Pair("buyAfterAuth", u4r0.e(String.valueOf(ozgVar.b))));
        Uri uri = this.a;
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        Uri uri2 = ozgVar.a;
        f(clearQuery, b.n(b.n(b.n(e(uri2), e(uri)), (Map) this.e.getValue()), i));
        ozg a = ozg.a(ozgVar, clearQuery.fragment(uri2.getFragment()).build(), null, 6);
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.b;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "DeeplinkCustomizerImpl", ozgVar + " -> " + a);
        }
        return a;
    }

    @Override // defpackage.i0h
    public final Object b(rzg rzgVar, Continuation continuation) {
        Map i = b.i(new Pair(Constants.KEY_MESSAGE, u4r0.e(rzgVar.l)), new Pair(com.adjust.sdk.Constants.DEEPLINK, u4r0.e(this.c.p(rzgVar).toString())));
        Uri uri = rzgVar.a;
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        f(clearQuery, b.n(b.n(e(uri), (Map) this.f.getValue()), i));
        rzg rzgVar2 = new rzg(clearQuery.build(), rzgVar.b, rzgVar.c, rzgVar.d, rzgVar.e, rzgVar.f, rzgVar.g, rzgVar.h, rzgVar.i, rzgVar.j, rzgVar.k, rzgVar.l);
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.b;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "DeeplinkCustomizerImpl", rzgVar + " -> " + rzgVar2);
        }
        return rzgVar2;
    }

    @Override // defpackage.i0h
    public final Object c(szg szgVar, ContinuationImpl continuationImpl) {
        Map i = b.i(new Pair(Constants.KEY_MESSAGE, u4r0.e(szgVar.c)), new Pair(com.adjust.sdk.Constants.DEEPLINK, u4r0.e(this.c.p(szgVar).toString())));
        Uri uri = szgVar.a;
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        f(clearQuery, b.n(b.n(e(uri), (Map) this.g.getValue()), i));
        szg szgVar2 = new szg(clearQuery.fragment(uri.getFragment()).build(), szgVar.b, szgVar.c);
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.b;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "DeeplinkCustomizerImpl", szgVar + " -> " + szgVar2);
        }
        return szgVar2;
    }

    @Override // defpackage.i0h
    public final Object d(qzg qzgVar, ContinuationImpl continuationImpl) {
        Uri.Builder clearQuery = qzgVar.a.buildUpon().clearQuery();
        f(clearQuery, b.n(e(qzgVar.a), (Map) this.h.getValue()));
        qzg qzgVar2 = new qzg(clearQuery.build(), qzgVar.b, qzgVar.c, qzgVar.d, qzgVar.e, qzgVar.f, qzgVar.g, qzgVar.h);
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.b;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "DeeplinkCustomizerImpl", qzgVar + " -> " + qzgVar2);
        }
        return qzgVar2;
    }
}
