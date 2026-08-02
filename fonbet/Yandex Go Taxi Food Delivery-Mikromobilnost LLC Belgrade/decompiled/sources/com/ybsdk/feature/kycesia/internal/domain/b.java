package com.ybsdk.feature.kycesia.internal.domain;

import android.net.Uri;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.feature.deeplink.api.DeeplinkNavigation;
import com.ybsdk.navigation.ScenarioResultReceiver$EsiaUpgradeResult;
import com.ybsdk.rconfig.YbCommonUrlsImpl;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.screens.upgrade.presentation.main.UpgradeFragment;
import defpackage.h791;
import defpackage.jbo;
import defpackage.jl40;
import defpackage.l3h;
import defpackage.lbo;
import defpackage.mbo;
import defpackage.nbo;
import defpackage.pbo;
import defpackage.qoi0;
import defpackage.sd90;
import defpackage.tfl0;
import defpackage.unr0;
import defpackage.v0h;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class b {
    public final tfl0 a;
    public final lbo b;
    public final com.ybsdk.di.modules.features.kyc.a c;
    public final pbo d;
    public final jbo e;

    public b(tfl0 tfl0Var, lbo lboVar, com.ybsdk.di.modules.features.kyc.a aVar, pbo pboVar, jbo jboVar) {
        this.a = tfl0Var;
        this.b = lboVar;
        this.c = aVar;
        this.d = pboVar;
        this.e = jboVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Uri uri, wls wlsVar) {
        Object obj;
        String str;
        String l;
        Uri parse;
        lbo lboVar = this.b;
        String str2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        tfl0 tfl0Var = this.a;
        if (uri == null) {
            lboVar.a.i(ScenarioResultReceiver$EsiaUpgradeResult.FAIL);
            wlsVar.invoke(Boolean.TRUE, null);
            tfl0Var.e();
            return;
        }
        EsiaResultInteractor$BrowserResultAction.Companion.getClass();
        String queryParameter = uri.getQueryParameter("action");
        Iterator<E> it = EsiaResultInteractor$BrowserResultAction.a().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (jl40.l(((EsiaResultInteractor$BrowserResultAction) obj).getValue(), queryParameter)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        EsiaResultInteractor$BrowserResultAction esiaResultInteractor$BrowserResultAction = (EsiaResultInteractor$BrowserResultAction) obj;
        if (esiaResultInteractor$BrowserResultAction == null) {
            esiaResultInteractor$BrowserResultAction = EsiaResultInteractor$BrowserResultAction.NONE;
        }
        wlsVar.invoke(Boolean.TRUE, esiaResultInteractor$BrowserResultAction.getValue());
        int i = a.a[esiaResultInteractor$BrowserResultAction.ordinal()];
        if (i == 1) {
            lboVar.a.i(ScenarioResultReceiver$EsiaUpgradeResult.FAIL);
            tfl0Var.e();
            return;
        }
        jbo jboVar = this.e;
        if (i != 2) {
            int i2 = 3;
            pbo pboVar = this.d;
            if (i != 3) {
                if (i == 4) {
                    ((l3h) ((mbo) jboVar).a).d(com.ybsdk.feature.deeplink.api.a.a(new DeeplinkAction.Support(str2, objArr2 == true ? 1 : 0, i2, objArr == true ? 1 : 0), DeeplinkNavigation.Add.INSTANCE));
                    return;
                } else if (i != 5) {
                    w511.b();
                    return;
                } else {
                    ((nbo) pboVar).getClass();
                    tfl0Var.l(new FragmentScreen("UpgradeScreen", false, null, null, qoi0.a(UpgradeFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 14, null));
                    return;
                }
            }
            com.ybsdk.rconfig.b bVar = this.c.a;
            com.ybsdk.rconfig.a aVar = bVar.i;
            YbCommonUrlsImpl ybCommonUrlsImpl = (YbCommonUrlsImpl) bVar.d(aVar.e).getData();
            YbCommonUrlsImpl ybCommonUrlsImpl2 = (YbCommonUrlsImpl) aVar.e.c.getData();
            String ybFrontendUrl = ybCommonUrlsImpl.getYbFrontendUrl();
            if (ybFrontendUrl.length() == 0) {
                ybFrontendUrl = ybCommonUrlsImpl2.getYbFrontendUrl();
            }
            tfl0Var.l(((com.ybsdk.feature.webview.internal.a) ((nbo) pboVar).a).f(Uri.parse(ybFrontendUrl).buildUpon().path("webview-sdk/simplified-identification/esia/address").query(uri.getQuery()).build().toString()));
            return;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : queryParameterNames) {
            String str3 = (String) obj2;
            if (!jl40.l(str3, "action") && !jl40.l(str3, "deeplink_uri")) {
                arrayList.add(obj2);
            }
        }
        String l2 = sd90.l(uri, "deeplink_uri");
        Uri parse2 = l2 != null ? Uri.parse(l2) : null;
        if (parse2 == null || (l = sd90.l(parse2, "url")) == null || (parse = Uri.parse(l)) == null) {
            str = null;
        } else {
            Uri.Builder buildUpon = parse.buildUpon();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str4 = (String) it2.next();
                buildUpon.appendQueryParameter(str4, sd90.l(uri, str4));
            }
            str = sd90.j(parse2, "url", buildUpon.build().toString()).toString();
        }
        if (str == null) {
            str = parse2 != null ? parse2.toString() : null;
        }
        if (h791.e(((mbo) jboVar).a, str, false, null, 12) instanceof v0h) {
            return;
        }
        x4c.g("Esia result was DEEPLINK, but it is not supported", null, unr0.n(parse2, "deeplink_uri: "), null, 10);
        lboVar.a.i(ScenarioResultReceiver$EsiaUpgradeResult.FAIL);
        tfl0Var.e();
    }
}
