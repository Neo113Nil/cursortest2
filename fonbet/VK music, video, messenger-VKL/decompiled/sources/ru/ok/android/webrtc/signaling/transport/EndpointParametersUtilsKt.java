package ru.ok.android.webrtc.signaling.transport;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Build;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import ru.ok.android.webrtc.signaling.api.EndpointParameters;
import xsna.arm0;
import xsna.epx;
import xsna.gzs;
import xsna.izs;
import xsna.pzl;
import xsna.q2z;
import xsna.s3q0;

/* loaded from: classes9.dex */
public final class EndpointParametersUtilsKt {
    @SuppressLint({"UseKtx"})
    public static final String addPeerIdToEndpointIfMissing(String str, gzs<Long> gzsVar, izs<? super Long, s3q0> izsVar) {
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("peerId");
        Long n = queryParameter != null ? arm0.n(queryParameter) : null;
        if (n != null) {
            izsVar.invoke(n);
            return str;
        }
        Uri.Builder buildUpon = parse.buildUpon();
        Long invoke = gzsVar.invoke();
        izsVar.invoke(invoke);
        return buildUpon.appendQueryParameter("peerId", String.valueOf(invoke.longValue())).build().toString();
    }

    public static final Uri applyCustomAuthority(Uri uri, List<String> list) {
        String authority;
        if (list.isEmpty() || (authority = uri.getAuthority()) == null) {
            return uri;
        }
        int indexOf = list.indexOf(authority);
        if (indexOf < 0) {
            indexOf = -1;
        }
        int i = indexOf + 1;
        if (i >= list.size()) {
            i = 0;
        }
        return uri.buildUpon().encodedAuthority(list.get(i)).build();
    }

    @SuppressLint({"UseKtx"})
    public static final String createEndpointUrlWithReplaceParameters(EndpointParameters endpointParameters) {
        ArrayList arrayList = new ArrayList();
        String userId = endpointParameters.getUserId();
        if (userId != null) {
            q2z.a("userId", userId, arrayList);
        }
        String token = endpointParameters.getToken();
        if (token != null) {
            q2z.a("token", token, arrayList);
        }
        arrayList.add(new Pair("conversationId", endpointParameters.getConversationId()));
        if (endpointParameters.getProtocolVersion() >= 6) {
            q2z.a("deviceIdx", String.valueOf(endpointParameters.getDeviceIndex()), arrayList);
        }
        Long peerId = endpointParameters.getPeerId();
        if (peerId != null) {
            q2z.a("peerId", String.valueOf(peerId.longValue()), arrayList);
        }
        Locale locale = endpointParameters.getLocale();
        if (locale != null) {
            q2z.a("locale", locale.getLanguage(), arrayList);
        }
        arrayList.add(new Pair("version", String.valueOf(endpointParameters.getProtocolVersion())));
        q2z.a("capabilities", endpointParameters.getCapabilities(), arrayList);
        arrayList.add(new Pair("device", pzl.b(Build.MANUFACTURER, DomExceptionUtils.SEPARATOR, Build.MODEL)));
        arrayList.add(new Pair("platform", "ANDROID"));
        arrayList.add(new Pair("clientType", endpointParameters.getClientType()));
        q2z.a("appVersion", endpointParameters.getAppVersion(), arrayList);
        arrayList.add(new Pair(EndpointParameters.Name.OS_VERSION, String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(new Pair(EndpointParameters.Name.ISP_AS_ORG, endpointParameters.getIspAsOrg()));
        arrayList.add(new Pair(EndpointParameters.Name.LOC_CC, endpointParameters.getLocCc()));
        arrayList.add(new Pair(EndpointParameters.Name.LOC_REG, endpointParameters.getLocReg()));
        Integer ispAsNo = endpointParameters.getIspAsNo();
        if (ispAsNo != null) {
            q2z.a(EndpointParameters.Name.ISP_AS_NO, String.valueOf(ispAsNo.intValue()), arrayList);
        }
        String startUrlType = endpointParameters.getStartUrlType();
        if (startUrlType != null) {
            q2z.a(EndpointParameters.Name.TGT, startUrlType, arrayList);
        }
        String compression = endpointParameters.getCompression();
        if (compression != null) {
            q2z.a(EndpointParameters.Name.COMPRESSION, compression, arrayList);
        }
        if (endpointParameters.getRecoverTs() > 0) {
            q2z.a(EndpointParameters.Name.RECOVER_TS, String.valueOf(endpointParameters.getRecoverTs()), arrayList);
        }
        return replaceOrAppendQueryParameters(Uri.parse(endpointParameters.getEndpointBaseUrl()).buildUpon(), arrayList).build().toString();
    }

    public static final Uri.Builder replaceOrAppendQueryParameters(Uri.Builder builder, List<Pair<String, String>> list) {
        Object obj;
        Uri build = builder.build();
        Set<String> queryParameterNames = build.getQueryParameterNames();
        ArrayList arrayList = new ArrayList();
        for (String str : queryParameterNames) {
            for (String str2 : build.getQueryParameters(str)) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (epx.f(((Pair) obj).i(), str)) {
                        break;
                    }
                }
                Pair pair = (Pair) obj;
                if (pair == null) {
                    q2z.a(str, str2, arrayList);
                } else {
                    arrayList.add(new Pair(str, pair.j()));
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (!queryParameterNames.contains(((Pair) obj2).i())) {
                arrayList2.add(obj2);
            }
        }
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj3 = arrayList2.get(i2);
            i2++;
            arrayList.add((Pair) obj3);
        }
        builder.clearQuery();
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj4 = arrayList.get(i);
            i++;
            Pair pair2 = (Pair) obj4;
            builder.appendQueryParameter((String) pair2.d(), (String) pair2.g());
        }
        return builder;
    }
}
