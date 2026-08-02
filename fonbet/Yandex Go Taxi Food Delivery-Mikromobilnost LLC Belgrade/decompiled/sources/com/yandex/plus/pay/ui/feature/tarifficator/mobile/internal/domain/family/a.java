package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family;

import android.content.Context;
import android.net.Uri;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.plus.home.api.location.GeoPoint;
import com.yandex.plus.pay.internal.model.PlusPayWebFamilyInviteResult;
import com.yandex.plus.ui.core.theme.PlusTheme;
import defpackage.g8e;
import defpackage.gw00;
import defpackage.i7t;
import defpackage.jzs;
import defpackage.lj;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tpd0;
import defpackage.wap;
import defpackage.yap;
import defpackage.zap;
import defpackage.zg41;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a implements i7t {
    public final yap a;
    public final zap b;
    public final zg41 c;

    public a(yap yapVar, zap zapVar, zg41 zg41Var) {
        this.a = yapVar;
        this.b = zapVar;
        this.c = zg41Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        GetFamilyInvitationContentInteractorImpl$getFamilyInvitationContent$1 getFamilyInvitationContentInteractorImpl$getFamilyInvitationContent$1;
        int i;
        PlusPayWebFamilyInviteResult.Success success;
        String str;
        if (continuationImpl instanceof GetFamilyInvitationContentInteractorImpl$getFamilyInvitationContent$1) {
            getFamilyInvitationContentInteractorImpl$getFamilyInvitationContent$1 = (GetFamilyInvitationContentInteractorImpl$getFamilyInvitationContent$1) continuationImpl;
            int i2 = getFamilyInvitationContentInteractorImpl$getFamilyInvitationContent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getFamilyInvitationContentInteractorImpl$getFamilyInvitationContent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getFamilyInvitationContentInteractorImpl$getFamilyInvitationContent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getFamilyInvitationContentInteractorImpl$getFamilyInvitationContent$1.label;
                if (i != 0) {
                    b.b(obj);
                    getFamilyInvitationContentInteractorImpl$getFamilyInvitationContent$1.label = 1;
                    obj = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.a) this.a).a(getFamilyInvitationContentInteractorImpl$getFamilyInvitationContent$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                success = (PlusPayWebFamilyInviteResult.Success) obj;
                if (success != null) {
                    return null;
                }
                String webUrl = success.getWebUrl();
                zap zapVar = this.b;
                zapVar.getClass();
                Uri parse = Uri.parse(webUrl);
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                int d = gw00.d(tcc.n(queryParameterNames, 10));
                if (d < 16) {
                    d = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                Iterator<T> it = queryParameterNames.iterator();
                while (true) {
                    str = "";
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    String queryParameter = parse.getQueryParameter((String) next);
                    if (queryParameter != null) {
                        str = queryParameter;
                    }
                    linkedHashMap.put(next, scc.i(str));
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                String str2 = zapVar.b;
                Context a = zapVar.c.a();
                PlusTheme plusTheme = (PlusTheme) zapVar.d.getValue();
                String a2 = zapVar.g.a();
                str = a2 != null ? a2 : "";
                String str3 = tpd0.a(a, plusTheme) ? "DARK" : "LIGHT";
                String language = zapVar.e.getLocale().getLanguage();
                zap.b("client_app_version", zapVar.a, linkedHashMap2);
                zap.b("client_id", str2, linkedHashMap2);
                zap.b("service_name", str2, linkedHashMap2);
                zap.b(DivkitThemeChangeListener.THEME_VARIABLE_NAME, str3, linkedHashMap2);
                zap.b("lang", language, linkedHashMap2);
                zap.b("mm_device_id", str, linkedHashMap2);
                zap.b("plus_sdk_version", "110.0.2", linkedHashMap2);
                zap.b("sdk_view", "1", linkedHashMap2);
                zap.b(Constants.KEY_MESSAGE, "hide-family-shelf", linkedHashMap2);
                zap.b("mode", "SDK_PAY", linkedHashMap2);
                zap.b("platform", "ANDROID", linkedHashMap2);
                zap.a("BROADCASTING", linkedHashMap2);
                zap.a("NATIVE_SHARING", linkedHashMap2);
                jzs a3 = zapVar.f.a();
                if (a3 != null) {
                    GeoPoint geoPoint = a3.a;
                    if (geoPoint != null) {
                        zap.b("coordinates_lat", String.valueOf(geoPoint.getLat()), linkedHashMap2);
                        zap.b("coordinates_lon", String.valueOf(geoPoint.getLon()), linkedHashMap2);
                        zap.b("coordinates_acc", String.valueOf(geoPoint.getAccuracy()), linkedHashMap2);
                    }
                    GeoPoint geoPoint2 = a3.b;
                    if (geoPoint2 != null) {
                        zap.b("geo_pin_position_lat", String.valueOf(geoPoint2.getLat()), linkedHashMap2);
                        zap.b("geo_pin_position_lon", String.valueOf(geoPoint2.getLon()), linkedHashMap2);
                        zap.b("geo_pin_position_acc", String.valueOf(geoPoint2.getAccuracy()), linkedHashMap2);
                    }
                    String str4 = a3.c;
                    if (str4 != null) {
                        zap.b("geo_zone_name", str4, linkedHashMap2);
                    }
                }
                Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    String str5 = (String) entry.getKey();
                    Iterator it2 = ((Collection) entry.getValue()).iterator();
                    while (it2.hasNext()) {
                        clearQuery.appendQueryParameter(str5, (String) it2.next());
                    }
                }
                String uri = clearQuery.build().toString();
                String authToken = ((lj) this.c.a.getValue()).getAuthToken();
                return new wap(uri, authToken != null ? g8e.z("Authorization", "OAuth ".concat(authToken)) : kotlin.collections.b.f(), success.getSkipText());
            }
        }
        getFamilyInvitationContentInteractorImpl$getFamilyInvitationContent$1 = new GetFamilyInvitationContentInteractorImpl$getFamilyInvitationContent$1(this, continuationImpl);
        Object obj2 = getFamilyInvitationContentInteractorImpl$getFamilyInvitationContent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getFamilyInvitationContentInteractorImpl$getFamilyInvitationContent$1.label;
        if (i != 0) {
        }
        success = (PlusPayWebFamilyInviteResult.Success) obj2;
        if (success != null) {
        }
    }
}
