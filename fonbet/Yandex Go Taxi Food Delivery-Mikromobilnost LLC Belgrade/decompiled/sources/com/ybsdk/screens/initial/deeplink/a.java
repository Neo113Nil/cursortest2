package com.ybsdk.screens.initial.deeplink;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.ybsdk.api.YBDebugMessage$Level;
import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.NumberFormatUtils$Currencies;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.autotopup.api.AutoTopupShowOnly;
import com.ybsdk.feature.autotopup.api.AutoTopupType;
import com.ybsdk.feature.banners.api.PrizeHintEntity;
import com.ybsdk.feature.banners.api.PrizeHintId;
import com.ybsdk.feature.card.api.CardManagementSettingStatus;
import com.ybsdk.feature.card.api.CardManagementSettingTextData;
import com.ybsdk.feature.cbdc.api.CbdcAcceptConsent;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.feature.deeplink.api.DeeplinkNavigation;
import com.ybsdk.feature.deeplink.api.DeeplinkNavigationAnimation;
import com.ybsdk.feature.deeplink.api.DeeplinkSource;
import com.ybsdk.feature.deeplink.api.actions.AutoTopupApiVersion;
import com.ybsdk.feature.deeplink.api.actions.AutoTopupEditBottomSheet;
import com.ybsdk.feature.deeplink.api.actions.AutoTopupEnableSetting;
import com.ybsdk.feature.deeplink.api.actions.AutoTopupSaveSettings;
import com.ybsdk.feature.deeplink.api.actions.AutoTopupSelectPaymentMethod;
import com.ybsdk.feature.deeplink.api.actions.AutoTopupSettingType;
import com.ybsdk.feature.deeplink.api.actions.AutoTopupSetupAction;
import com.ybsdk.feature.deeplink.api.actions.CloseFlow;
import com.ybsdk.feature.deeplink.api.actions.DefaultPaymentMethodSet;
import com.ybsdk.feature.deeplink.api.actions.EnableSbpToAddAccountForTopup;
import com.ybsdk.feature.deeplink.api.actions.Intent;
import com.ybsdk.feature.deeplink.api.actions.MerchantOffersSearchSuggest;
import com.ybsdk.feature.deeplink.api.actions.OpenUrlAction;
import com.ybsdk.feature.deeplink.api.actions.PfmResetFilters;
import com.ybsdk.feature.deeplink.api.actions.SbpAccountUnbind;
import com.ybsdk.feature.deeplink.api.actions.SbpSubscriptionConsentAction;
import com.ybsdk.feature.deeplink.api.actions.SplitDepositAutoTopup;
import com.ybsdk.feature.deeplink.api.actions.SplitDepositAutoTopupSaveRetry;
import com.ybsdk.feature.deeplink.api.actions.TransferReshowTooltip;
import com.ybsdk.feature.nfc.api.models.NfcSystemSettingsType;
import com.ybsdk.feature.qr.payments.api.QrSource;
import com.ybsdk.feature.qr.payments.api.data.BoostStrategy;
import com.ybsdk.feature.qr.payments.api.data.ProductType;
import com.ybsdk.feature.testpayment.api.TestPaymentFlow;
import com.ybsdk.feature.transfer.version2.api.entities.FundDocsNoticeInfo;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import com.ybsdk.rconfig.configs.AppIconConfigSchema;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import com.ybsdk.rconfig.configs.DeeplinksGeneratorConfig;
import com.ybsdk.rconfig.configs.NativeUriInterceptorRulesConfig;
import com.ybsdk.rconfig.configs.UnknownDeeplinkQueryConfig;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.widgets.common.Tooltip$PreferredPosition;
import defpackage.a3h;
import defpackage.a910;
import defpackage.atb1;
import defpackage.avu0;
import defpackage.b64;
import defpackage.b791;
import defpackage.bu2;
import defpackage.bvu0;
import defpackage.bzk0;
import defpackage.c3h;
import defpackage.ci01;
import defpackage.cl60;
import defpackage.cvu0;
import defpackage.dfr;
import defpackage.dtt0;
import defpackage.e6b1;
import defpackage.ef01;
import defpackage.esp0;
import defpackage.evu0;
import defpackage.f4h;
import defpackage.f5f0;
import defpackage.g3r0;
import defpackage.g8e;
import defpackage.gh51;
import defpackage.gse;
import defpackage.gtq0;
import defpackage.gw00;
import defpackage.hb1;
import defpackage.hqp0;
import defpackage.hsp0;
import defpackage.j73;
import defpackage.j960;
import defpackage.ja6;
import defpackage.jl40;
import defpackage.jsp0;
import defpackage.k7r;
import defpackage.kg51;
import defpackage.kpa1;
import defpackage.ksp0;
import defpackage.l970;
import defpackage.lrp0;
import defpackage.m670;
import defpackage.ma60;
import defpackage.mpb1;
import defpackage.mut0;
import defpackage.nw00;
import defpackage.obf;
import defpackage.orp0;
import defpackage.p450;
import defpackage.ppc;
import defpackage.put0;
import defpackage.qpi0;
import defpackage.r9o;
import defpackage.rcc;
import defpackage.rt1;
import defpackage.scc;
import defpackage.sd90;
import defpackage.suf;
import defpackage.t0h;
import defpackage.t691;
import defpackage.tcc;
import defpackage.tm60;
import defpackage.tqa0;
import defpackage.trp0;
import defpackage.u121;
import defpackage.u2r0;
import defpackage.unr0;
import defpackage.vop0;
import defpackage.w530;
import defpackage.w691;
import defpackage.wkg;
import defpackage.wlp;
import defpackage.x4c;
import defpackage.xqp0;
import defpackage.xz3;
import defpackage.y960;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import kotlin.text.Regex;

/* loaded from: classes9.dex */
public final class a implements a3h {
    public final put0 A;
    public final g3r0 B;
    public final k7r C;
    public final cl60 D;
    public final u2r0 E;
    public final w530 F;
    public final p450 G;
    public final AppAnalyticsReporter H;
    public final e a;
    public final f b;
    public final h c;
    public final obf d;
    public final r9o e;
    public final com.ybsdk.rconfig.b f;
    public final gh51 g;
    public final ci01 h;
    public final nw00 i;
    public final j960 j;
    public final ma60 k;
    public final y960 l;
    public final kg51 m;
    public final d n;
    public final tqa0 o;
    public final g p;
    public final m670 q;
    public final ef01 r;
    public final wkg s;
    public final a910 t;
    public final f5f0 u;
    public final dtt0 v;
    public final vop0 w;
    public final c x;
    public final hb1 y;
    public final mut0 z;

    public a(e eVar, f fVar, h hVar, obf obfVar, r9o r9oVar, com.ybsdk.rconfig.b bVar, gh51 gh51Var, ppc ppcVar, ci01 ci01Var, nw00 nw00Var, j960 j960Var, ma60 ma60Var, y960 y960Var, kg51 kg51Var, d dVar, tqa0 tqa0Var, g gVar, m670 m670Var, ef01 ef01Var, wkg wkgVar, a910 a910Var, f5f0 f5f0Var, dtt0 dtt0Var, vop0 vop0Var, c cVar, hb1 hb1Var, mut0 mut0Var, put0 put0Var, g3r0 g3r0Var, k7r k7rVar, cl60 cl60Var, u2r0 u2r0Var, w530 w530Var, p450 p450Var, AppAnalyticsReporter appAnalyticsReporter) {
        this.a = eVar;
        this.b = fVar;
        this.c = hVar;
        this.d = obfVar;
        this.e = r9oVar;
        this.f = bVar;
        this.g = gh51Var;
        this.h = ci01Var;
        this.i = nw00Var;
        this.j = j960Var;
        this.k = ma60Var;
        this.l = y960Var;
        this.m = kg51Var;
        this.n = dVar;
        this.o = tqa0Var;
        this.p = gVar;
        this.q = m670Var;
        this.r = ef01Var;
        this.s = wkgVar;
        this.t = a910Var;
        this.u = f5f0Var;
        this.v = dtt0Var;
        this.w = vop0Var;
        this.x = cVar;
        this.y = hb1Var;
        this.z = mut0Var;
        this.A = put0Var;
        this.B = g3r0Var;
        this.C = k7rVar;
        this.D = cl60Var;
        this.E = u2r0Var;
        this.F = w530Var;
        this.G = p450Var;
        this.H = appAnalyticsReporter;
    }

    public static DeeplinkAction.AutoTopupV2 b(Uri uri) {
        AutoTopupSetupAction f;
        AutoTopupSetupAction autoTopupSetupAction;
        BigDecimal bigDecimal;
        lrp0 lrp0Var = lrp0.d;
        String o = bzk0.o(uri, SdkUri$QueryParam.ACTION);
        if (o == null) {
            f = null;
        } else {
            f = c3h.f(o);
            if (f == null) {
                x4c.g("Cannot parse auto topup setup action", null, o, Collections.singletonList(lrp0Var), 2);
            }
        }
        AutoTopupSettingType e = c3h.e(bzk0.o(uri, SdkUri$QueryParam.SETTING));
        if (f == null || e != null) {
            autoTopupSetupAction = f;
        } else {
            x4c.g("Auto topup setup action requires setting", null, uri.toString(), Collections.singletonList(lrp0Var), 2);
            autoTopupSetupAction = null;
        }
        String o2 = bzk0.o(uri, SdkUri$QueryParam.LIMIT);
        if (o2 == null) {
            bigDecimal = null;
        } else {
            BigDecimal h = avu0.h(o2);
            if (h == null) {
                x4c.g("Cannot parse auto topup limit", null, o2, Collections.singletonList(lrp0Var), 2);
            }
            bigDecimal = h;
        }
        String o3 = bzk0.o(uri, SdkUri$QueryParam.AUTO_TOPUP_ID);
        String o4 = bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID);
        String o5 = bzk0.o(uri, SdkUri$QueryParam.AMOUNT);
        BigDecimal bigDecimal2 = o5 != null ? new BigDecimal(o5) : null;
        String o6 = bzk0.o(uri, SdkUri$QueryParam.THRESHOLD);
        BigDecimal bigDecimal3 = o6 != null ? new BigDecimal(o6) : null;
        String o7 = bzk0.o(uri, SdkUri$QueryParam.SOURCE);
        AutoTopupShowOnly g = c3h.g(bzk0.o(uri, SdkUri$QueryParam.SHOW_ONLY));
        Map d = sd90.d(uri);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : d.entrySet()) {
            String str = (String) entry.getKey();
            if (!jl40.l(str, SdkUri$QueryParam.AUTO_TOPUP_ID.getParamValue()) && !jl40.l(str, SdkUri$QueryParam.AGREEMENT_ID.getParamValue()) && !jl40.l(str, SdkUri$QueryParam.AMOUNT.getParamValue()) && !jl40.l(str, SdkUri$QueryParam.THRESHOLD.getParamValue()) && !jl40.l(str, SdkUri$QueryParam.SOURCE.getParamValue()) && !jl40.l(str, SdkUri$QueryParam.SHOW_ONLY.getParamValue()) && !jl40.l(str, SdkUri$QueryParam.ACTION.getParamValue()) && !jl40.l(str, SdkUri$QueryParam.SETTING.getParamValue()) && !jl40.l(str, SdkUri$QueryParam.LIMIT.getParamValue())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new DeeplinkAction.AutoTopupV2(o3, o4, bigDecimal2, bigDecimal3, o7, g, autoTopupSetupAction, e, bigDecimal, linkedHashMap);
    }

    public static void e(String str, List list, List list2) {
        x4c.g("Some required fields is absent", null, b64.l("action=", str, "; params=", kotlin.collections.a.X(list, ",", null, null, new suf(20), 30)), list2, 2);
    }

    public static /* synthetic */ void f(String str, List list) {
        e(str, list, EmptyList.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x00fe, code lost:
    
        r5 = new com.ybsdk.screens.initial.deeplink.DeeplinkAction.QrPayment(com.ybsdk.feature.qr.payments.api.QrSource.LINK, r7, com.ybsdk.screens.initial.deeplink.DefaultOriginValues.ExternalRedirect.getValue(), null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x00de, code lost:
    
        if (r1.equals("qr.nspk.ru") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ad, code lost:
    
        if (r1.equals("sub.nspk.ru") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e1, code lost:
    
        r1 = r7.getScheme();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00eb, code lost:
    
        if (defpackage.jl40.l(r1, com.adjust.sdk.Constants.SCHEME) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f5, code lost:
    
        if (defpackage.jl40.l(r1, defpackage.jsp0.a()) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f8, code lost:
    
        defpackage.x4c.g("Wrong qr payment uri", null, r7, null, 10);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x04af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Deeplink a(Uri uri, boolean z, DeeplinkSource deeplinkSource, boolean z2) {
        BaseDeeplinkAction qrPayment;
        DeeplinkAction.Me2MeConfirmPull me2MeConfirmPull;
        BaseDeeplinkAction common;
        Uri uri2;
        String lastPathSegment;
        BaseDeeplinkAction baseDeeplinkAction;
        DeeplinkNavigationAnimation deeplinkNavigationAnimation;
        boolean i;
        boolean i2;
        boolean i3;
        DeeplinkNavigationAnimation deeplinkNavigationAnimation2;
        boolean i4;
        boolean i5;
        Uri uri3 = uri;
        if (uri3.isHierarchical() && deeplinkSource != null) {
            SdkUri$InternalQueryParam sdkUri$InternalQueryParam = SdkUri$InternalQueryParam.CALL_SOURCE;
            if (bzk0.n(uri3, sdkUri$InternalQueryParam) == null) {
                uri3 = bzk0.h(uri3, sdkUri$InternalQueryParam, deeplinkSource.name());
            }
        }
        Uri uri4 = uri3;
        DeeplinkSource e = e6b1.e(uri4);
        this.y.getClass();
        Uri build = kpa1.b(uri4) ? new Uri.Builder().scheme("ybapp").encodedAuthority((String) kotlin.collections.a.R(uri4.getPathSegments())).encodedPath(kotlin.collections.a.X(kotlin.collections.a.J(uri4.getPathSegments(), 1), "/", "/", null, null, 60)).encodedQuery(uri4.getEncodedQuery()).build() : null;
        if (build != null) {
            return a(build, z, deeplinkSource, z2);
        }
        boolean k = c3h.k(uri4);
        this.b.getClass();
        String host = uri4.getHost();
        if (host != null) {
            int hashCode = host.hashCode();
            if (hashCode != 182507940) {
                if (hashCode != 1266119575) {
                    if (hashCode == 2054945475) {
                    }
                } else if (host.equals("multiqr.ru")) {
                    if (e6b1.d(uri4)) {
                        qrPayment = new DeeplinkAction.QrPayment(QrSource.LINK, uri4, DefaultOriginValues.ExternalRedirect.getValue(), null, null);
                        if (qrPayment == null) {
                            this.n.getClass();
                            qrPayment = (jl40.l(uri4.getScheme(), jsp0.a()) && jl40.l(uri4.getHost(), "sbpay") && uri4.getPathSegments().size() == 2 && jl40.l(uri4.getPathSegments().get(0), evu0.Q("/", "/tokenIntent")) && (lastPathSegment = uri4.getLastPathSegment()) != null) ? new DeeplinkAction.FpsPay(lastPathSegment, uri4) : null;
                            if (qrPayment == null) {
                                String str = a910.b;
                                com.ybsdk.rconfig.b bVar = this.t.a;
                                bVar.getClass();
                                if (((CommonFeatureFlag) bVar.d(wlp.V).getData()).isEnabled()) {
                                    if (jl40.l(uri4.getScheme(), jsp0.a()) && jl40.l(uri4.getHost(), "me2mepull.nspk.ru") && jl40.l(uri4.getPath(), "/confirmation")) {
                                        String o = bzk0.o(uri4, SdkUri$QueryParam.ID);
                                        String Q = o != null ? evu0.Q(str, o) : null;
                                        if (Q != null) {
                                            me2MeConfirmPull = new DeeplinkAction.Me2MeConfirmPull(Q);
                                            qrPayment = me2MeConfirmPull;
                                        }
                                    } else if (e6b1.d(uri4) && jl40.l(uri4.getPath(), "/me2me_confirm")) {
                                        String o2 = bzk0.o(uri4, SdkUri$QueryParam.BNK_ID);
                                        String Q2 = o2 != null ? evu0.Q(str, o2) : null;
                                        if (Q2 != null) {
                                            me2MeConfirmPull = new DeeplinkAction.Me2MeConfirmPull(Q2);
                                            qrPayment = me2MeConfirmPull;
                                        }
                                    }
                                    if (qrPayment == null) {
                                        this.p.getClass();
                                        String str2 = (String) kotlin.collections.a.R(uri4.getPathSegments());
                                        if (str2 == null) {
                                            str2 = "";
                                        }
                                        if (kpa1.c(uri4)) {
                                            common = new DeeplinkAction.ShortUriResolver.Adjust(uri4);
                                        } else if (jl40.l(uri4.getHost(), "a") || str2.equals("a")) {
                                            common = new DeeplinkAction.ShortUriResolver.Common(uri4);
                                        } else {
                                            qrPayment = null;
                                            if (qrPayment == null) {
                                                if (k) {
                                                    qrPayment = d(uri4, z);
                                                } else {
                                                    p450 p450Var = this.G;
                                                    p450Var.getClass();
                                                    String uri5 = uri4.toString();
                                                    String scheme = uri4.getScheme();
                                                    if (scheme != null) {
                                                        com.ybsdk.rconfig.b bVar2 = p450Var.a;
                                                        bVar2.getClass();
                                                        NativeUriInterceptorRulesConfig nativeUriInterceptorRulesConfig = (NativeUriInterceptorRulesConfig) bVar2.d(t0h.a).getData();
                                                        qpi0 qpi0Var = p450Var.b;
                                                        Map<String, Set<String>> rawRegexRules = nativeUriInterceptorRulesConfig.getRawRegexRules();
                                                        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(rawRegexRules.size()));
                                                        Iterator<T> it = rawRegexRules.entrySet().iterator();
                                                        while (it.hasNext()) {
                                                            Map.Entry entry = (Map.Entry) it.next();
                                                            Object key = entry.getKey();
                                                            Set set = (Set) entry.getValue();
                                                            LinkedHashSet linkedHashSet = new LinkedHashSet(set.size());
                                                            Iterator it2 = set.iterator();
                                                            while (it2.hasNext()) {
                                                                linkedHashSet.add(qpi0Var.a((String) it2.next()));
                                                            }
                                                            linkedHashMap.put(key, linkedHashSet);
                                                        }
                                                        Set set2 = (Set) linkedHashMap.get(scheme);
                                                        if (set2 != null) {
                                                            Set set3 = set2;
                                                            if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                                                                Iterator it3 = set3.iterator();
                                                                while (it3.hasNext()) {
                                                                    if (((Regex) it3.next()).h(uri5)) {
                                                                        uri2 = bzk0.a(new Uri.Builder().scheme("ybapp").encodedAuthority(Constants.DEEPLINK).encodedPath("/intent"), SdkUri$QueryParam.URL, uri5).build();
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    uri2 = null;
                                                    if (uri2 == null || (qrPayment = d(uri2, z)) == null) {
                                                        qrPayment = z2 ? new DeeplinkAction.ExternalSchemeDeeplink(uri4) : null;
                                                    }
                                                }
                                            }
                                        }
                                        qrPayment = common;
                                        if (qrPayment == null) {
                                        }
                                    }
                                }
                                qrPayment = null;
                                if (qrPayment == null) {
                                }
                            }
                        }
                        baseDeeplinkAction = qrPayment;
                        if (k) {
                            com.ybsdk.rconfig.b bVar3 = this.f;
                            bVar3.getClass();
                            dfr dfrVar = u121.a;
                            if (((UnknownDeeplinkQueryConfig) bVar3.d(dfrVar).getData()).isEnabled()) {
                                ksp0.a.getClass();
                                ArrayList m0 = kotlin.collections.a.m0(((UnknownDeeplinkQueryConfig) bVar3.d(dfrVar).getData()).getNamesIgnored(), esp0.b());
                                Set<String> queryParameterNames = uri4.getQueryParameterNames();
                                ArrayList arrayList = new ArrayList();
                                for (Object obj : queryParameterNames) {
                                    if (!m0.contains((String) obj)) {
                                        arrayList.add(obj);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    trp0 trp0Var = trp0.a;
                                    trp0.e(new xqp0(uri4.toString(), e6b1.e(uri4).name(), arrayList));
                                }
                            }
                            b791.b(uri4, ((CommonFeatureFlag) bVar3.d(wlp.H0).getData()).isEnabled());
                        }
                        YBDebugMessage$Level yBDebugMessage$Level = YBDebugMessage$Level.INFO;
                        kotlin.collections.b.i(new Pair(LaunchBrowserActivity.KEY_URI, uri4.toString()), new Pair("action", String.valueOf(baseDeeplinkAction)), new Pair("trusted", String.valueOf(z)));
                        getClass();
                        String o3 = bzk0.o(uri4, SdkUri$QueryParam.FALLBACK);
                        Uri parse = o3 == null ? Uri.parse(o3) : null;
                        Deeplink e2 = parse == null ? w691.e(this, parse, z, null, false, 12) : null;
                        boolean z3 = e != DeeplinkSource.PUSH;
                        if (baseDeeplinkAction != null) {
                            String str3 = k ? "Unable to parse deeplink with valid scheme and host" : "Unable to parse deeplink cause scheme or host is not valid";
                            if (e2 == null && !c3h.b(uri4, e)) {
                                trp0 trp0Var2 = trp0.a;
                                trp0.e(new hqp0(uri4.toString(), new IllegalArgumentException("Parsing deeplink or fallback is not possible"), str3, e6b1.e(uri4).name()));
                            }
                            if (z3) {
                                g(uri4.toString(), str3);
                            }
                            return e2;
                        }
                        if (z3) {
                            g(baseDeeplinkAction.getDeeplinkUri().toString(), null);
                            deeplinkNavigationAnimation = null;
                        } else {
                            deeplinkNavigationAnimation = null;
                        }
                        i = bzk0.i(uri4, SdkUri$QueryParam.AS_ROOT, false);
                        i2 = bzk0.i(uri4, SdkUri$QueryParam.AS_CURRENT, false);
                        i3 = bzk0.i(uri4, SdkUri$QueryParam.BACK_TO_EXISTED, false);
                        DeeplinkNavigation deeplinkNavigation = i ? DeeplinkNavigation.ReplaceRoot.INSTANCE : i2 ? DeeplinkNavigation.Replace.INSTANCE : i3 ? DeeplinkNavigation.PopBackTo.INSTANCE : DeeplinkNavigation.Add.INSTANCE;
                        String o4 = bzk0.o(uri4, SdkUri$QueryParam.ANIMATION);
                        if (o4 != null) {
                            switch (o4.hashCode()) {
                                case -1855380177:
                                    if (o4.equals("bottom_up")) {
                                        deeplinkNavigationAnimation2 = DeeplinkNavigationAnimation.BottomUp.INSTANCE;
                                        break;
                                    }
                                    break;
                                case -982559927:
                                    if (o4.equals("pop_up")) {
                                        deeplinkNavigationAnimation2 = DeeplinkNavigationAnimation.PopUp.INSTANCE;
                                        break;
                                    }
                                    break;
                                case 3387192:
                                    if (o4.equals("none")) {
                                        deeplinkNavigationAnimation2 = DeeplinkNavigationAnimation.None.INSTANCE;
                                        break;
                                    }
                                    break;
                                case 1544803905:
                                    if (o4.equals("default")) {
                                        deeplinkNavigationAnimation2 = DeeplinkNavigationAnimation.Default.INSTANCE;
                                        break;
                                    }
                                    break;
                            }
                            i4 = bzk0.i(uri4, SdkUri$QueryParam.RENEW_SESSION, false);
                            i5 = bzk0.i(uri4, SdkUri$QueryParam.PIN_REQUIRED, false);
                            return new Deeplink(baseDeeplinkAction, e2, deeplinkNavigation, deeplinkNavigationAnimation2, uri4, e, i4, i5);
                        }
                        deeplinkNavigationAnimation2 = deeplinkNavigationAnimation;
                        i4 = bzk0.i(uri4, SdkUri$QueryParam.RENEW_SESSION, false);
                        i5 = bzk0.i(uri4, SdkUri$QueryParam.PIN_REQUIRED, false);
                        return new Deeplink(baseDeeplinkAction, e2, deeplinkNavigation, deeplinkNavigationAnimation2, uri4, e, i4, i5);
                    }
                    x4c.g("Wrong multiqr uri", null, uri4, null, 10);
                    qrPayment = null;
                    if (qrPayment == null) {
                    }
                    baseDeeplinkAction = qrPayment;
                    if (k) {
                    }
                    YBDebugMessage$Level yBDebugMessage$Level2 = YBDebugMessage$Level.INFO;
                    kotlin.collections.b.i(new Pair(LaunchBrowserActivity.KEY_URI, uri4.toString()), new Pair("action", String.valueOf(baseDeeplinkAction)), new Pair("trusted", String.valueOf(z)));
                    getClass();
                    String o32 = bzk0.o(uri4, SdkUri$QueryParam.FALLBACK);
                    if (o32 == null) {
                    }
                    if (parse == null) {
                    }
                    if (e != DeeplinkSource.PUSH) {
                    }
                    if (baseDeeplinkAction != null) {
                    }
                }
            }
        }
        if (c3h.k(uri4) && jl40.l(uri4.getPath(), "/open_qr_payment")) {
            String o5 = bzk0.o(uri4, SdkUri$QueryParam.QRC_LINK);
            String o6 = bzk0.o(uri4, SdkUri$QueryParam.QR_SOURCE);
            QrSource qrSource = jl40.l(o6, "link") ? QrSource.LINK : jl40.l(o6, "camera") ? QrSource.CAMERA : QrSource.LINK;
            String o7 = bzk0.o(uri4, SdkUri$QueryParam.ORIGIN);
            if (o7 == null) {
                o7 = DefaultOriginValues.Unknown.getValue();
            }
            String str4 = o7;
            String o8 = bzk0.o(uri4, SdkUri$QueryParam.AGREEMENT_ID);
            String str5 = (o8 == null || !(evu0.J(o8) ^ true) || o8.equals("{{agreement_id}}")) ? null : o8;
            String o9 = bzk0.o(uri4, SdkUri$QueryParam.AUTOPAYMENT_ID);
            if (o5 == null) {
                x4c.g("/open_qr_payment without qrc_link", null, uri4, null, 10);
            } else {
                qrPayment = new DeeplinkAction.QrPayment(qrSource, Uri.parse(o5), str4, str5, o9);
                if (qrPayment == null) {
                }
                baseDeeplinkAction = qrPayment;
                if (k) {
                }
                YBDebugMessage$Level yBDebugMessage$Level22 = YBDebugMessage$Level.INFO;
                kotlin.collections.b.i(new Pair(LaunchBrowserActivity.KEY_URI, uri4.toString()), new Pair("action", String.valueOf(baseDeeplinkAction)), new Pair("trusted", String.valueOf(z)));
                getClass();
                String o322 = bzk0.o(uri4, SdkUri$QueryParam.FALLBACK);
                if (o322 == null) {
                }
                if (parse == null) {
                }
                if (e != DeeplinkSource.PUSH) {
                }
                if (baseDeeplinkAction != null) {
                }
            }
        }
        qrPayment = null;
        if (qrPayment == null) {
        }
        baseDeeplinkAction = qrPayment;
        if (k) {
        }
        YBDebugMessage$Level yBDebugMessage$Level222 = YBDebugMessage$Level.INFO;
        kotlin.collections.b.i(new Pair(LaunchBrowserActivity.KEY_URI, uri4.toString()), new Pair("action", String.valueOf(baseDeeplinkAction)), new Pair("trusted", String.valueOf(z)));
        getClass();
        String o3222 = bzk0.o(uri4, SdkUri$QueryParam.FALLBACK);
        if (o3222 == null) {
        }
        if (parse == null) {
        }
        if (e != DeeplinkSource.PUSH) {
        }
        if (baseDeeplinkAction != null) {
        }
    }

    public final BaseDeeplinkAction c(Uri uri, boolean z) {
        String o;
        Object obj;
        boolean i;
        boolean i2;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        BoostStrategy boostStrategy;
        Text text;
        Text text2;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        Uri b;
        Uri b2;
        DeeplinkAction.Redirect.Auth auth;
        Uri b3;
        Uri b4;
        String uri2;
        orp0 orp0Var = orp0.f;
        lrp0 lrp0Var = lrp0.d;
        String path = uri.getPath();
        boolean l = jl40.l(path, "/open_url");
        com.ybsdk.rconfig.b bVar = this.f;
        if (l) {
            b4 = e6b1.b(uri, bVar, z, SdkUri$QueryParam.URL);
            if (b4 != null && (uri2 = b4.toString()) != null) {
                return new OpenUrlAction(uri2, uri);
            }
        } else {
            if (jl40.l(path, "/topup")) {
                this.c.getClass();
                return h.a(uri);
            }
            if (jl40.l(path, "/onboarding")) {
                return new DeeplinkAction.Onboarding(uri);
            }
            boolean l2 = jl40.l(path, "/transfer");
            ci01 ci01Var = this.h;
            if (l2) {
                ci01Var.getClass();
                return ci01.b(uri);
            }
            if (jl40.l(path, "/transfer_state")) {
                ci01Var.getClass();
                return ci01.d(uri);
            }
            boolean l3 = jl40.l(path, "/pdf_load");
            tqa0 tqa0Var = this.o;
            if (l3) {
                tqa0Var.getClass();
                return tqa0.a(uri);
            }
            if (jl40.l(path, "/pdf_preview")) {
                return tqa0Var.b(uri, z);
            }
            if (jl40.l(path, "/support_chat")) {
                return new DeeplinkAction.Support(null, null, 3, null);
            }
            if (jl40.l(path, "/simplified_identification_form")) {
                return DeeplinkAction.Upgrade.INSTANCE;
            }
            if (jl40.l(path, "/open_once")) {
                this.q.getClass();
                return m670.a(uri);
            }
            if (jl40.l(path, "/open_simplified_identification_form")) {
                return DeeplinkAction.Upgrade.INSTANCE;
            }
            if (jl40.l(path, "/transaction")) {
                String o2 = bzk0.o(uri, SdkUri$QueryParam.ID);
                if (o2 != null) {
                    return new DeeplinkAction.Transaction(o2);
                }
                x4c.g("transactionId is null in deeplink", null, uri, null, 10);
                return null;
            }
            if (jl40.l(path, "/show_account_status")) {
                return DeeplinkAction.AccountStatus.INSTANCE;
            }
            if (jl40.l(path, "/fullscreen")) {
                b3 = e6b1.b(uri, bVar, z, SdkUri$QueryParam.URL);
                String uri3 = b3 != null ? b3.toString() : null;
                if (uri3 != null) {
                    return new DeeplinkAction.OpenUrlFullscreen(uri3);
                }
                x4c.g("Incorrect Uri in request in widget_id", null, String.format("request= %s , widget_id= %s", Arrays.copyOf(new Object[]{uri, bzk0.o(uri, SdkUri$QueryParam.NOTIFICATION_ID_PARAM)}, 2)), null, 10);
                return null;
            }
            if (jl40.l(path, "/close")) {
                return new DeeplinkAction.Close(bzk0.o(uri, SdkUri$QueryParam.FIRST_RUN_LANDING_RESULT_QUERY_PARAM));
            }
            if (jl40.l(path, "/close_flow")) {
                return new CloseFlow(uri);
            }
            if (jl40.l(path, "/close_sdk")) {
                return DeeplinkAction.CloseSdk.INSTANCE;
            }
            int i3 = 14;
            if (jl40.l(path, "/close_sdk_with_result")) {
                SdkUri$QueryParam sdkUri$QueryParam = SdkUri$QueryParam.SCENARIO;
                String o3 = bzk0.o(uri, sdkUri$QueryParam);
                if (o3 != null) {
                    return new DeeplinkAction.CloseSdkWithResult(o3, sd90.d(bzk0.g(uri, sdkUri$QueryParam)));
                }
                x4c.g("scenario required for close wih result", null, null, null, 14);
                return null;
            }
            if (jl40.l(path, "/open_support_chat")) {
                return new DeeplinkAction.Support(null, null, 3, null);
            }
            if (jl40.l(path, "/redirect")) {
                b2 = e6b1.b(uri, bVar, z, SdkUri$QueryParam.URL);
                if (b2 != null) {
                    String o4 = bzk0.o(uri, SdkUri$QueryParam.FIRST_RUN_LANDING_RESULT_QUERY_PARAM);
                    String o5 = bzk0.o(uri, SdkUri$QueryParam.AUTH);
                    if (jl40.l(o5, "yandex")) {
                        auth = DeeplinkAction.Redirect.Auth.YANDEX;
                    } else if (jl40.l(o5, "none") || o5 == null) {
                        auth = DeeplinkAction.Redirect.Auth.NONE;
                    }
                    DeeplinkAction.Redirect.Auth auth2 = auth;
                    String o6 = bzk0.o(uri, SdkUri$QueryParam.FALLBACK);
                    Uri parse = o6 != null ? Uri.parse(o6) : null;
                    return new DeeplinkAction.Redirect(l970.b(this.w, uri, b2), parse != null ? w691.e(this, parse, z, null, false, 12) : null, auth2, o4);
                }
            } else {
                if (jl40.l(path, "/create_nfc_shortcut")) {
                    return DeeplinkAction.CreateNfcShortcut.INSTANCE;
                }
                if (jl40.l(path, "/copy_text")) {
                    String o7 = bzk0.o(uri, SdkUri$QueryParam.TEXT);
                    if (o7 != null) {
                        return new DeeplinkAction.CopyText(o7);
                    }
                } else {
                    if (jl40.l(path, "/play_haptics")) {
                        String o8 = bzk0.o(uri, SdkUri$QueryParam.HAPTIC_EVENT);
                        if (o8 != null) {
                            return new DeeplinkAction.PlayHaptic(o8);
                        }
                        x4c.g("Incorrect query params in play haptic action", null, unr0.n(uri, "Uri: "), null, 10);
                        return null;
                    }
                    if (!jl40.l(path, "/share")) {
                        if (jl40.l(path, "/card_issue")) {
                            return new DeeplinkAction.CardIssue(bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID));
                        }
                        if (jl40.l(path, "/card_landing")) {
                            return DeeplinkAction.CardLanding.INSTANCE;
                        }
                        if (jl40.l(path, "/esia_sdk")) {
                            SdkUri$QueryParam sdkUri$QueryParam2 = SdkUri$QueryParam.STATE;
                            String o9 = bzk0.o(uri, sdkUri$QueryParam2);
                            SdkUri$QueryParam sdkUri$QueryParam3 = SdkUri$QueryParam.SCOPE;
                            String o10 = bzk0.o(uri, sdkUri$QueryParam3);
                            SdkUri$QueryParam sdkUri$QueryParam4 = SdkUri$QueryParam.CLIENT_ID;
                            String o11 = bzk0.o(uri, sdkUri$QueryParam4);
                            SdkUri$QueryParam sdkUri$QueryParam5 = SdkUri$QueryParam.TIMESTAMP;
                            String o12 = bzk0.o(uri, sdkUri$QueryParam5);
                            SdkUri$QueryParam sdkUri$QueryParam6 = SdkUri$QueryParam.ACCESS_TYPE;
                            String o13 = bzk0.o(uri, sdkUri$QueryParam6);
                            SdkUri$QueryParam sdkUri$QueryParam7 = SdkUri$QueryParam.REDIRECT_URI;
                            String o14 = bzk0.o(uri, sdkUri$QueryParam7);
                            SdkUri$QueryParam sdkUri$QueryParam8 = SdkUri$QueryParam.RESPONSE_TYPE;
                            String o15 = bzk0.o(uri, sdkUri$QueryParam8);
                            SdkUri$QueryParam sdkUri$QueryParam9 = SdkUri$QueryParam.CLIENT_SECRET;
                            String o16 = bzk0.o(uri, sdkUri$QueryParam9);
                            if (o9 != null && o12 != null && o14 != null && o10 != null && o11 != null && o16 != null && o13 != null && o15 != null) {
                                List g = scc.g(sdkUri$QueryParam2, sdkUri$QueryParam3, sdkUri$QueryParam4, sdkUri$QueryParam5, sdkUri$QueryParam6, sdkUri$QueryParam7, sdkUri$QueryParam8, sdkUri$QueryParam9, SdkUri$QueryParam.AS_ROOT, SdkUri$QueryParam.AS_CURRENT, SdkUri$QueryParam.CALL_SOURCE);
                                ArrayList arrayList = new ArrayList(tcc.n(g, 10));
                                Iterator it = g.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((SdkUri$QueryParam) it.next()).getParamValue());
                                }
                                Map d = sd90.d(uri);
                                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                for (Map.Entry entry : d.entrySet()) {
                                    if (!arrayList.contains((String) entry.getKey())) {
                                        linkedHashMap4.put(entry.getKey(), entry.getValue());
                                    }
                                }
                                return new DeeplinkAction.EsiaSdk(o9, o10, o11, o12, o13, o14, o15, o16, linkedHashMap4);
                            }
                        } else if (jl40.l(path, "/esia_app2app")) {
                            String o17 = bzk0.o(uri, SdkUri$QueryParam.URL);
                            if (o17 != null) {
                                return new DeeplinkAction.EsiaApp2app(o17);
                            }
                        } else {
                            int i4 = 0;
                            if (jl40.l(path, "/open_esia_identification")) {
                                SdkUri$QueryParam sdkUri$QueryParam10 = SdkUri$QueryParam.ESIA_START;
                                String o18 = bzk0.o(uri, sdkUri$QueryParam10);
                                Uri b5 = o18 != null ? e6b1.b(uri, bVar, z, sdkUri$QueryParam10) : null;
                                String o19 = bzk0.o(uri, SdkUri$QueryParam.APPLICATION_ID);
                                boolean i5 = bzk0.i(uri, SdkUri$QueryParam.ESIA_IS_CREDIT, false);
                                if (o18 == null || b5 != null) {
                                    return new DeeplinkAction.OpenEsia(o19, b5 != null ? b5.toString() : null, i5);
                                }
                            } else {
                                if (jl40.l(path, "/close_esia")) {
                                    return new DeeplinkAction.CloseEsia(bzk0.o(uri, SdkUri$QueryParam.APPLICATION_ID));
                                }
                                if (jl40.l(path, "/account_tariff")) {
                                    return DeeplinkAction.AccountTariff.INSTANCE;
                                }
                                if (jl40.l(path, "/account_details")) {
                                    String o20 = bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID);
                                    if (o20 != null) {
                                        return new DeeplinkAction.AccountDetails(o20);
                                    }
                                    x4c.g("agreement_id required for opening account details screen", null, null, null, 14);
                                    return null;
                                }
                                if (jl40.l(path, hsp0.c())) {
                                    return new DeeplinkAction.Registration(YBProduct.WALLET, false, uri, 2, null);
                                }
                                if (jl40.l(path, "/open_sdk")) {
                                    return DeeplinkAction.OpenSdk.INSTANCE;
                                }
                                if (jl40.l(path, "/dashboard")) {
                                    return this.s.a(uri);
                                }
                                if (jl40.l(path, "/dashboard_external")) {
                                    String o21 = bzk0.o(uri, SdkUri$QueryParam.MEMBER_ID);
                                    if (o21 != null) {
                                        return new DeeplinkAction.DashboardExternalAction(o21);
                                    }
                                } else {
                                    if (jl40.l(path, "/native_credit_account")) {
                                        return DeeplinkAction.NativeCreditAccount.INSTANCE;
                                    }
                                    if (jl40.l(path, "/open_main_screen")) {
                                        return DeeplinkAction.Products.INSTANCE;
                                    }
                                    boolean l4 = jl40.l(path, "/open_web");
                                    e eVar = this.a;
                                    if (l4) {
                                        return eVar.a(uri, z);
                                    }
                                    if (jl40.l(path, "/faq")) {
                                        return DeeplinkAction.Faq.INSTANCE;
                                    }
                                    if (jl40.l(path, "/show_account_tariff")) {
                                        return DeeplinkAction.AccountTariff.INSTANCE;
                                    }
                                    if (jl40.l(path, "/show_settings")) {
                                        return DeeplinkAction.Settings.INSTANCE;
                                    }
                                    if (jl40.l(path, "/show_about")) {
                                        return DeeplinkAction.About.INSTANCE;
                                    }
                                    if (jl40.l(path, hsp0.a())) {
                                        return DeeplinkAction.AboutUs.INSTANCE;
                                    }
                                    if (jl40.l(path, "/show_documents")) {
                                        return DeeplinkAction.AboutDocuments.INSTANCE;
                                    }
                                    if (jl40.l(path, "/qr_subscriptions")) {
                                        return DeeplinkAction.QrSubscriptionsList.INSTANCE;
                                    }
                                    if (jl40.l(path, "/card_activation")) {
                                        return new DeeplinkAction.CardActivation(bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID), bzk0.o(uri, SdkUri$QueryParam.PROMO_ID));
                                    }
                                    if (jl40.l(path, "/open_cashback")) {
                                        String o22 = bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID);
                                        if (o22 != null) {
                                            return new DeeplinkAction.OpenCashback(o22);
                                        }
                                    } else {
                                        if (jl40.l(path, "/open_cashback_categories")) {
                                            String o23 = bzk0.o(uri, SdkUri$QueryParam.PROMO_ID);
                                            String o24 = bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID);
                                            if (o23 != null && o24 != null) {
                                                return new DeeplinkAction.OpenCashbackCategories(o23, o24);
                                            }
                                            x4c.g("Can't open cashback categories with promoId and agreementId", null, b64.l("promoId= ", o23, " , agreementId= ", o24), null, 10);
                                            return null;
                                        }
                                        if (jl40.l(path, "/card_details")) {
                                            String o25 = bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID);
                                            String o26 = bzk0.o(uri, SdkUri$QueryParam.CARD_ID);
                                            String o27 = bzk0.o(uri, SdkUri$QueryParam.PROMO_ID);
                                            boolean i6 = bzk0.i(uri, SdkUri$QueryParam.SCROLL_TO_PROMO, false);
                                            String o28 = bzk0.o(uri, SdkUri$QueryParam.SCROLL_TO_PRODUCT_TYPE);
                                            return new DeeplinkAction.CardDetails(o25, o26, o27, i6, o28 != null ? c3h.h(o28) : null);
                                        }
                                        if (jl40.l(path, "/single_card_details")) {
                                            String o29 = bzk0.o(uri, SdkUri$QueryParam.CARD_ID);
                                            String o30 = bzk0.o(uri, SdkUri$QueryParam.PRODUCT_ID);
                                            if (o29 != null || o30 != null) {
                                                return new DeeplinkAction.SingleCardDetails(o29, o30);
                                            }
                                        } else {
                                            if (jl40.l(path, "/card_deletion")) {
                                                String o31 = bzk0.o(uri, SdkUri$QueryParam.IMAGE_URL);
                                                String o32 = bzk0.o(uri, SdkUri$QueryParam.IMAGE_URL_DARK);
                                                String o33 = bzk0.o(uri, SdkUri$QueryParam.CARD_ID);
                                                String o34 = bzk0.o(uri, SdkUri$QueryParam.LAST_PAN_DIGITS);
                                                boolean i7 = bzk0.i(uri, SdkUri$QueryParam.POP_CARD_SCENARIO, false);
                                                MapBuilder c = gw00.c();
                                                for (CardManagementSettingStatus cardManagementSettingStatus : CardManagementSettingStatus.getEntries()) {
                                                    c.put(cardManagementSettingStatus, new CardManagementSettingTextData(c3h.a(cardManagementSettingStatus, uri, SdkUri$QueryParam.TITLE), c3h.a(cardManagementSettingStatus, uri, SdkUri$QueryParam.SUBTITLE), c3h.a(cardManagementSettingStatus, uri, SdkUri$QueryParam.PRIMARY_BUTTON_TITLE), c3h.a(cardManagementSettingStatus, uri, SdkUri$QueryParam.SECONDARY_BUTTON_TITLE)));
                                                }
                                                MapBuilder b6 = gw00.b(c);
                                                if (o33 != null && o34 != null) {
                                                    return new DeeplinkAction.CardDeletion(o33, o34, new ThemedImageUrlEntity(o31, o32), i7, b6);
                                                }
                                                x4c.g("Can't open card deletion with cardId and cardLastPanDigits", null, b64.l("cardId= ", o33, " , cardLastPanDigits= ", o34), null, 10);
                                                return null;
                                            }
                                            if (jl40.l(path, "/create_credit")) {
                                                return DeeplinkAction.Credit.INSTANCE;
                                            }
                                            if (jl40.l(path, "/credit_account")) {
                                                return DeeplinkAction.CreditAccount.INSTANCE;
                                            }
                                            if (jl40.l(path, "/add_account_for_topup")) {
                                                return DeeplinkAction.AddAccountForTopup.INSTANCE;
                                            }
                                            if (jl40.l(path, "/autotopup_payment_result")) {
                                                String o35 = bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID);
                                                String o36 = bzk0.o(uri, SdkUri$QueryParam.TYPE);
                                                String o37 = bzk0.o(uri, SdkUri$QueryParam.SOURCE);
                                                if (o35 != null && o36 != null) {
                                                    return new DeeplinkAction.AutotopupPaymentResult(o35, o36, o37);
                                                }
                                                x4c.g("Can't parse deeplink without param", null, unr0.p("agreementId=", o35, ", type=", o36, "}"), null, 10);
                                                return null;
                                            }
                                            if (jl40.l(path, "/autotopup_retry")) {
                                                return DeeplinkAction.AutotopupRetry.INSTANCE;
                                            }
                                            if (jl40.l(path, "/autotopup_save")) {
                                                return DeeplinkAction.AutotopupSave.INSTANCE;
                                            }
                                            if (jl40.l(path, "/autotopup_regular")) {
                                                String o38 = bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID);
                                                if (o38 != null) {
                                                    return new DeeplinkAction.AutotopupRegular(o38);
                                                }
                                            } else if (jl40.l(path, "/rounding")) {
                                                String o39 = bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID);
                                                if (o39 != null) {
                                                    return new DeeplinkAction.Rounding(o39);
                                                }
                                            } else if (jl40.l(path, "/autotopup_test_payment")) {
                                                String o40 = bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID);
                                                if (o40 != null) {
                                                    return new DeeplinkAction.AutotopupTestPayment(o40);
                                                }
                                            } else {
                                                if (jl40.l(path, "/autopayment_test_payment")) {
                                                    String o41 = bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID);
                                                    String o42 = bzk0.o(uri, SdkUri$QueryParam.MEMBER_ID);
                                                    String o43 = bzk0.o(uri, SdkUri$QueryParam.FLOW);
                                                    TestPaymentFlow i8 = c3h.i(o43);
                                                    if (i8 != null) {
                                                        return new DeeplinkAction.AutopaymentTestPayment(o41, o42, i8);
                                                    }
                                                    x4c.g("Test payment deeplink parsing error", null, g8e.o("flow = ", o43), null, 10);
                                                    return null;
                                                }
                                                if (jl40.l(path, "/autotopup_resolve_conflict")) {
                                                    String o44 = bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID);
                                                    if (o44 != null) {
                                                        return new DeeplinkAction.AutotopupResolveConflict(o44);
                                                    }
                                                } else {
                                                    if (jl40.l(path, "/external_member_binding_selection")) {
                                                        return DeeplinkAction.SelectPartnerPayment.INSTANCE;
                                                    }
                                                    if (jl40.l(path, "/external_member_binding_save")) {
                                                        String o45 = bzk0.o(uri, SdkUri$QueryParam.MEMBER_ID);
                                                        if (o45 != null) {
                                                            return new DeeplinkAction.SavePartnerPayment(o45);
                                                        }
                                                    } else if (jl40.l(path, "/external_member_binding_disable")) {
                                                        String o46 = bzk0.o(uri, SdkUri$QueryParam.MEMBER_ID);
                                                        if (o46 != null) {
                                                            return new DeeplinkAction.DisablePartnerBinding(o46);
                                                        }
                                                    } else if (jl40.l(path, "/open_fund")) {
                                                        String o47 = bzk0.o(uri, SdkUri$QueryParam.FUND_ID);
                                                        String o48 = bzk0.o(uri, SdkUri$QueryParam.PRESELECTED_AGREEMENT_ID);
                                                        if (o47 != null) {
                                                            return new DeeplinkAction.OpenFund(o47, o48);
                                                        }
                                                    } else if (jl40.l(path, "/fund_operation")) {
                                                        String o49 = bzk0.o(uri, SdkUri$QueryParam.TYPE);
                                                        String o50 = bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID);
                                                        if (o49 != null && o50 != null) {
                                                            return new DeeplinkAction.FundOperation(o49, o50);
                                                        }
                                                    } else {
                                                        if (jl40.l(path, "/savings_autotopup_notice")) {
                                                            return DeeplinkAction.SavingsAutotopupNotice.INSTANCE;
                                                        }
                                                        if (jl40.l(path, "/add_card_for_topup")) {
                                                            return DeeplinkAction.AddCardForTopup.INSTANCE;
                                                        }
                                                        if (jl40.l(path, "/need_to_connect_to_srt_to_add_account_for_topup_curtain")) {
                                                            return new EnableSbpToAddAccountForTopup(uri);
                                                        }
                                                        if (jl40.l(path, "/simplified_identification_info")) {
                                                            return DeeplinkAction.SimplifiedIdInfo.INSTANCE;
                                                        }
                                                        if (jl40.l(path, "/open_simplified_identification_info")) {
                                                            return DeeplinkAction.Upgrade.INSTANCE;
                                                        }
                                                        if (jl40.l(path, "/credit_result")) {
                                                            this.d.getClass();
                                                            return obf.a(uri);
                                                        }
                                                        if (jl40.l(path, "/error_screen")) {
                                                            this.e.getClass();
                                                            return r9o.a(uri);
                                                        }
                                                        if (jl40.l(path, "/split_deposit")) {
                                                            this.v.getClass();
                                                            return dtt0.a(uri);
                                                        }
                                                        if (jl40.l(path, "/split_deposit_processing")) {
                                                            this.z.getClass();
                                                            return mut0.a(uri);
                                                        }
                                                        if (jl40.l(path, "/split_deposit_repayment")) {
                                                            this.A.getClass();
                                                            return put0.a(uri);
                                                        }
                                                        if (jl40.l(path, "/split_deposit_auto_topup")) {
                                                            return new SplitDepositAutoTopup(uri);
                                                        }
                                                        if (jl40.l(path, "/local_variables_changed")) {
                                                            this.D.getClass();
                                                            return cl60.a(uri);
                                                        }
                                                        if (jl40.l(path, "/set_div_variables")) {
                                                            return this.E.a(uri);
                                                        }
                                                        if (jl40.l(path, "/split_deposit_auto_topup_save_retry")) {
                                                            return new SplitDepositAutoTopupSaveRetry(uri);
                                                        }
                                                        if (jl40.l(path, "/set_header_clickable")) {
                                                            this.B.getClass();
                                                            return g3r0.a(uri);
                                                        }
                                                        if (jl40.l(path, "/card_limit")) {
                                                            SdkUri$QueryParam sdkUri$QueryParam11 = SdkUri$QueryParam.CARD_ID;
                                                            String o51 = bzk0.o(uri, sdkUri$QueryParam11);
                                                            if (o51 != null) {
                                                                return new DeeplinkAction.CardLimit(o51);
                                                            }
                                                            x4c.g("Deeplink without param", null, "uri= " + uri + " , param= " + sdkUri$QueryParam11, null, 10);
                                                            return null;
                                                        }
                                                        if (jl40.l(path, "/skip_registration")) {
                                                            return new DeeplinkAction.StartLandingSkip(bzk0.o(uri, SdkUri$QueryParam.FIRST_RUN_LANDING_RESULT_QUERY_PARAM));
                                                        }
                                                        if (jl40.l(path, "/activate")) {
                                                            return new DeeplinkAction.StartLandingGo(uri, bzk0.o(uri, SdkUri$QueryParam.FIRST_RUN_LANDING_RESULT_QUERY_PARAM), sd90.d(uri));
                                                        }
                                                        if (jl40.l(path, "/intent")) {
                                                            b = e6b1.b(uri, bVar, z, SdkUri$QueryParam.URL);
                                                            if (b != null) {
                                                                String o52 = bzk0.o(uri, SdkUri$QueryParam.FALLBACK);
                                                                Uri parse2 = o52 != null ? Uri.parse(o52) : null;
                                                                return new Intent(b, parse2 != null ? w691.e(this, parse2, z, null, false, 12) : null, null, 4, null);
                                                            }
                                                        } else {
                                                            if (jl40.l(path, "/notifications_settings")) {
                                                                return DeeplinkAction.NotificationsSettings.INSTANCE;
                                                            }
                                                            if (jl40.l(path, "/auto_topup")) {
                                                                if (bVar.a().isEnabled()) {
                                                                    return b(uri);
                                                                }
                                                                String o53 = bzk0.o(uri, SdkUri$QueryParam.AUTO_TOPUP_ID);
                                                                String o54 = bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID);
                                                                AutoTopupType d2 = c3h.d(bzk0.o(uri, SdkUri$QueryParam.TYPE));
                                                                String o55 = bzk0.o(uri, SdkUri$QueryParam.AMOUNT);
                                                                BigDecimal bigDecimal3 = o55 != null ? new BigDecimal(o55) : null;
                                                                String o56 = bzk0.o(uri, SdkUri$QueryParam.THRESHOLD);
                                                                return new DeeplinkAction.AutoTopup(o53, o54, d2, bigDecimal3, o56 != null ? new BigDecimal(o56) : null, bzk0.o(uri, SdkUri$QueryParam.SOURCE), c3h.g(bzk0.o(uri, SdkUri$QueryParam.SHOW_ONLY)));
                                                            }
                                                            if (jl40.l(path, "/auto_topup_enable_setting")) {
                                                                AutoTopupSettingType e = c3h.e(bzk0.o(uri, SdkUri$QueryParam.SETTING));
                                                                if (e != null) {
                                                                    return new AutoTopupEnableSetting(uri, e);
                                                                }
                                                                x4c.g("Setting is required to enable autotopup", null, null, rcc.b(lrp0Var), 6);
                                                                return null;
                                                            }
                                                            if (jl40.l(path, "/auto_topup_save_settings")) {
                                                                AutoTopupApiVersion c2 = c3h.c(bzk0.o(uri, SdkUri$QueryParam.API_VERSION));
                                                                if (c2 != null) {
                                                                    return new AutoTopupSaveSettings(uri, c2);
                                                                }
                                                                x4c.g("Api version is required to save setting autotopup", null, null, rcc.b(lrp0Var), 6);
                                                                return null;
                                                            }
                                                            if (jl40.l(path, "/auto_topup_edit_bottom_sheet")) {
                                                                AutoTopupSettingType e2 = c3h.e(bzk0.o(uri, SdkUri$QueryParam.SETTING));
                                                                if (e2 != null) {
                                                                    return new AutoTopupEditBottomSheet(uri, e2);
                                                                }
                                                                x4c.g("Setting is required to open edit bottom sheet autotopup and autofund", null, null, rcc.b(lrp0Var), 6);
                                                                return null;
                                                            }
                                                            if (jl40.l(path, "/auto_topup_select_payment_method")) {
                                                                return new AutoTopupSelectPaymentMethod(uri);
                                                            }
                                                            if (jl40.l(path, "/card_pin")) {
                                                                String o57 = bzk0.o(uri, SdkUri$QueryParam.CARD_ID);
                                                                if (o57 != null) {
                                                                    return new DeeplinkAction.CardPin(o57);
                                                                }
                                                                x4c.g("Card id required for opening card pin screen", null, null, null, 14);
                                                                return null;
                                                            }
                                                            if (jl40.l(path, "/credit_deposit")) {
                                                                String o58 = bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID);
                                                                String o59 = bzk0.o(uri, SdkUri$QueryParam.CREDIT_TYPE);
                                                                if (o58 != null && o59 != null) {
                                                                    return new DeeplinkAction.CreditDeposit(o58, o59, bzk0.o(uri, SdkUri$QueryParam.SCENARIO));
                                                                }
                                                                x4c.g("Deeplink credit_deposit parsing error", null, b64.l("agreementId = ", o58, " , creditType = ", o59), null, 10);
                                                                return null;
                                                            }
                                                            if (jl40.l(path, "/credit_limit_deposit")) {
                                                                String o60 = bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID);
                                                                String o61 = bzk0.o(uri, SdkUri$QueryParam.SCENARIO);
                                                                if (o60 != null) {
                                                                    return new DeeplinkAction.CreditLimitDeposit(o60, o61);
                                                                }
                                                                x4c.g("Deeplink credit_limit_deposit parsing error", null, null, null, 14);
                                                                return null;
                                                            }
                                                            if (jl40.l(path, "/mkk_deposit")) {
                                                                String o62 = bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID);
                                                                if (o62 != null) {
                                                                    return new DeeplinkAction.MkkDeposit(o62, bzk0.o(uri, SdkUri$QueryParam.SCENARIO));
                                                                }
                                                                x4c.g("Deeplink mkk_deposit parsing error", null, null, null, 14);
                                                                return null;
                                                            }
                                                            if (jl40.l(path, "/boost_deposit")) {
                                                                String o63 = bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID);
                                                                if (o63 != null) {
                                                                    return new DeeplinkAction.BoostDeposit(o63, bzk0.o(uri, SdkUri$QueryParam.SCENARIO));
                                                                }
                                                            } else {
                                                                if (jl40.l(path, "/me2me_debit_transfer")) {
                                                                    String o64 = bzk0.o(uri, SdkUri$QueryParam.PERMISSION_REQUEST_ID);
                                                                    if (o64 != null) {
                                                                        return new DeeplinkAction.Me2MeDebitTransfer(o64);
                                                                    }
                                                                    x4c.g("Permission request id required for opening me2me screen", null, null, null, 14);
                                                                    return null;
                                                                }
                                                                if (jl40.l(path, "/savings_account")) {
                                                                    String o65 = bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID);
                                                                    if (o65 == null) {
                                                                        x4c.g("agreement_id required for opening savings account screen", null, null, null, 14);
                                                                        return null;
                                                                    }
                                                                    SdkUri$QueryParam sdkUri$QueryParam12 = SdkUri$QueryParam.BACKGROUND_COLOR;
                                                                    return new DeeplinkAction.SavingsAccount(o65, bzk0.o(uri, sdkUri$QueryParam12) != null ? bzk0.f(uri, sdkUri$QueryParam12, new gse(i3)) : null);
                                                                }
                                                                if (jl40.l(path, "/create_savings_account")) {
                                                                    String o66 = bzk0.o(uri, SdkUri$QueryParam.CURRENCY);
                                                                    if (o66 == null) {
                                                                        o66 = NumberFormatUtils$Currencies.RUB.getIso();
                                                                    }
                                                                    String str = o66;
                                                                    String o67 = bzk0.o(uri, SdkUri$QueryParam.AMOUNT);
                                                                    if (o67 != null) {
                                                                        Locale locale = tm60.a;
                                                                        bigDecimal2 = tm60.g(o67);
                                                                    } else {
                                                                        bigDecimal2 = null;
                                                                    }
                                                                    return new DeeplinkAction.SavingsAccountCreate(bzk0.o(uri, SdkUri$QueryParam.TARIFF_ID), bzk0.o(uri, SdkUri$QueryParam.SOURCE_AGREEMENT_ID), bigDecimal2 != null ? new MoneyEntity(bigDecimal2, str, w530.a(this.F, bigDecimal2, str, false, null, false, 60)) : null);
                                                                }
                                                                if (jl40.l(path, "/savings_account_lock_money")) {
                                                                    String o68 = bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID);
                                                                    if (o68 != null) {
                                                                        return new DeeplinkAction.SavingsAccountLock(bzk0.o(uri, SdkUri$QueryParam.TITLE), bzk0.o(uri, SdkUri$QueryParam.SUBTITLE), o68);
                                                                    }
                                                                } else if (jl40.l(path, "/savings_account_close")) {
                                                                    String o69 = bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID);
                                                                    if (o69 != null) {
                                                                        return new DeeplinkAction.SavingsAccountClose(bzk0.o(uri, SdkUri$QueryParam.TYPE), bzk0.o(uri, SdkUri$QueryParam.TITLE), bzk0.o(uri, SdkUri$QueryParam.SUBTITLE), o69, bzk0.o(uri, SdkUri$QueryParam.IMAGE), bzk0.o(uri, SdkUri$QueryParam.ACTION_BUTTON_TITLE), bzk0.o(uri, SdkUri$QueryParam.SECONDARY_BUTTON_TITLE), Boolean.valueOf(bzk0.i(uri, SdkUri$QueryParam.SHOW_SECONDARY, true)));
                                                                    }
                                                                } else if (jl40.l(path, "/savings_account_close_deposit")) {
                                                                    String o70 = bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID);
                                                                    if (o70 != null) {
                                                                        String o71 = bzk0.o(uri, SdkUri$QueryParam.TITLE);
                                                                        String str2 = o71 == null ? "" : o71;
                                                                        String o72 = bzk0.o(uri, SdkUri$QueryParam.SUBTITLE);
                                                                        String str3 = o72 == null ? "" : o72;
                                                                        String o73 = bzk0.o(uri, SdkUri$QueryParam.IMAGE);
                                                                        String str4 = o73 == null ? "" : o73;
                                                                        String o74 = bzk0.o(uri, SdkUri$QueryParam.ACTION_BUTTON_TITLE);
                                                                        if (o74 == null) {
                                                                            o74 = "";
                                                                        }
                                                                        String o75 = bzk0.o(uri, SdkUri$QueryParam.SECONDARY_BUTTON_TITLE);
                                                                        String str5 = o75 == null ? "" : o75;
                                                                        String o76 = bzk0.o(uri, SdkUri$QueryParam.DATE);
                                                                        String o77 = bzk0.o(uri, SdkUri$QueryParam.FULL);
                                                                        String o78 = bzk0.o(uri, SdkUri$QueryParam.TOTAL);
                                                                        String str6 = o78 == null ? "" : o78;
                                                                        String o79 = bzk0.o(uri, SdkUri$QueryParam.PROFIT);
                                                                        String str7 = o79 == null ? "" : o79;
                                                                        String o80 = bzk0.o(uri, SdkUri$QueryParam.PENALTY);
                                                                        return new DeeplinkAction.SavingsAccountCloseDeposit(str2, str4, str3, o70, o74, str5, o76, o77, str6, str7, o80 == null ? "" : o80, bzk0.o(uri, SdkUri$QueryParam.VERSION));
                                                                    }
                                                                } else if (jl40.l(path, "/savings_account_rename")) {
                                                                    String o81 = bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID);
                                                                    String o82 = bzk0.o(uri, SdkUri$QueryParam.TITLE);
                                                                    String o83 = bzk0.o(uri, SdkUri$QueryParam.SUBTITLE);
                                                                    String o84 = bzk0.o(uri, SdkUri$QueryParam.NAME);
                                                                    String o85 = bzk0.o(uri, SdkUri$QueryParam.TYPE);
                                                                    if (o81 != null) {
                                                                        return new DeeplinkAction.SavingsAccountRename(o85, o82, o83, o84, o81);
                                                                    }
                                                                } else if (jl40.l(path, "/savings_account_goal")) {
                                                                    String o86 = bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID);
                                                                    String o87 = bzk0.o(uri, SdkUri$QueryParam.TITLE);
                                                                    String o88 = bzk0.o(uri, SdkUri$QueryParam.SUBTITLE);
                                                                    String o89 = bzk0.o(uri, SdkUri$QueryParam.AMOUNT);
                                                                    if (o89 != null) {
                                                                        Locale locale2 = tm60.a;
                                                                        bigDecimal = tm60.g(o89);
                                                                    } else {
                                                                        bigDecimal = null;
                                                                    }
                                                                    String o90 = bzk0.o(uri, SdkUri$QueryParam.CURRENCY);
                                                                    if (o90 == null) {
                                                                        o90 = NumberFormatUtils$Currencies.RUB.getIso();
                                                                    }
                                                                    String str8 = o90;
                                                                    String o91 = bzk0.o(uri, SdkUri$QueryParam.DATE);
                                                                    Date d3 = o91 != null ? mpb1.d(o91) : null;
                                                                    if (o86 != null) {
                                                                        return new DeeplinkAction.SavingsAccountGoal(o87, o88, d3, bigDecimal != null ? new MoneyEntity(bigDecimal, str8, w530.a(this.F, bigDecimal, str8, false, null, false, 60)) : null, o86);
                                                                    }
                                                                } else {
                                                                    if (jl40.l(path, "/pick_photo")) {
                                                                        return DeeplinkAction.PickPhoto.INSTANCE;
                                                                    }
                                                                    if (jl40.l(path, "/transactions")) {
                                                                        return new DeeplinkAction.Transactions(bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID));
                                                                    }
                                                                    if (jl40.l(path, "/tooltip")) {
                                                                        String o92 = bzk0.o(uri, SdkUri$QueryParam.X);
                                                                        Integer l5 = o92 != null ? bvu0.l(10, o92) : null;
                                                                        String o93 = bzk0.o(uri, SdkUri$QueryParam.Y);
                                                                        Integer l6 = o93 != null ? bvu0.l(10, o93) : null;
                                                                        String o94 = bzk0.o(uri, SdkUri$QueryParam.VIEW_ID);
                                                                        String o95 = bzk0.o(uri, SdkUri$QueryParam.TITLE);
                                                                        String o96 = bzk0.o(uri, SdkUri$QueryParam.SUBTITLE);
                                                                        String o97 = bzk0.o(uri, SdkUri$QueryParam.GRAVITY);
                                                                        String o98 = bzk0.o(uri, SdkUri$QueryParam.DURATION);
                                                                        Long m = o98 != null ? bvu0.m(10, o98) : null;
                                                                        boolean z2 = ((l5 == null || l6 == null) && (o94 == null || evu0.J(o94))) ? false : true;
                                                                        if ((o95 != null && !evu0.J(o95)) || (o96 != null && !evu0.J(o96))) {
                                                                            i4 = 1;
                                                                        }
                                                                        if (!z2 || i4 == 0) {
                                                                            x4c.g("Tooltip can't be shown without coordinates/view_id or text", null, null, null, 14);
                                                                            return null;
                                                                        }
                                                                        Tooltip$PreferredPosition tooltip$PreferredPosition = jl40.l(o97, "top") ? Tooltip$PreferredPosition.TOP : jl40.l(o97, "bottom") ? Tooltip$PreferredPosition.BOTTOM : Tooltip$PreferredPosition.TOP;
                                                                        if (o95 != null) {
                                                                            Text.Companion.getClass();
                                                                            text = com.ybsdk.core.utils.text.b.a(o95);
                                                                        } else {
                                                                            text = Text.Empty.INSTANCE;
                                                                        }
                                                                        Text text3 = text;
                                                                        if (o96 != null) {
                                                                            Text.Companion.getClass();
                                                                            text2 = com.ybsdk.core.utils.text.b.a(o96);
                                                                        } else {
                                                                            text2 = Text.Empty.INSTANCE;
                                                                        }
                                                                        return new DeeplinkAction.ShowTooltip(l5, l6, o94, text3, text2, tooltip$PreferredPosition, m);
                                                                    }
                                                                    if (jl40.l(path, "/hide_tooltip")) {
                                                                        return DeeplinkAction.HideTooltip.INSTANCE;
                                                                    }
                                                                    if (jl40.l(path, "/block_taps")) {
                                                                        return DeeplinkAction.BlockTaps.INSTANCE;
                                                                    }
                                                                    if (jl40.l(path, "/unblock_taps")) {
                                                                        return DeeplinkAction.UnblockTaps.INSTANCE;
                                                                    }
                                                                    if (jl40.l(path, "/set_boost_strategy")) {
                                                                        SdkUri$QueryParam sdkUri$QueryParam13 = SdkUri$QueryParam.BOOST_STRATEGY;
                                                                        String o99 = bzk0.o(uri, sdkUri$QueryParam13);
                                                                        if (o99 != null) {
                                                                            BoostStrategy.Companion.getClass();
                                                                            boostStrategy = ja6.a(o99);
                                                                        } else {
                                                                            boostStrategy = null;
                                                                        }
                                                                        if (boostStrategy != null) {
                                                                            return new DeeplinkAction.SetBoostStrategy(boostStrategy, gw00.e(gtq0.S(sdkUri$QueryParam13.getParamValue(), o99)));
                                                                        }
                                                                    } else {
                                                                        if (jl40.l(path, "/snackbar")) {
                                                                            String o100 = bzk0.o(uri, SdkUri$QueryParam.TEXT);
                                                                            String o101 = bzk0.o(uri, SdkUri$QueryParam.DESCRIPTION);
                                                                            String o102 = bzk0.o(uri, SdkUri$QueryParam.DURATION);
                                                                            Long m2 = o102 != null ? bvu0.m(10, o102) : null;
                                                                            if (o100 == null) {
                                                                                x4c.g("text required for snackbar", null, null, null, 14);
                                                                                return null;
                                                                            }
                                                                            Text.Companion.getClass();
                                                                            return new DeeplinkAction.ShowSnackbar(com.ybsdk.core.utils.text.b.a(o100), o101 != null ? com.ybsdk.core.utils.text.b.a(o101) : null, m2);
                                                                        }
                                                                        if (jl40.l(path, "/snackbar_prizes")) {
                                                                            String o103 = bzk0.o(uri, SdkUri$QueryParam.PRIZES_IDS);
                                                                            List W = o103 != null ? evu0.W(o103, new String[]{","}, (r2 & 4) != 0 ? 0 : 2) : null;
                                                                            String o104 = bzk0.o(uri, SdkUri$QueryParam.PRIZES_TEXTS);
                                                                            List W2 = o104 != null ? evu0.W(o104, new String[]{","}, (r2 & 4) != 0 ? 0 : 2) : null;
                                                                            if (W == null || W2 == null) {
                                                                                x4c.g("prizes snackbar parsing error", null, "ids = " + W + " , texts = " + W2, null, 10);
                                                                                return null;
                                                                            }
                                                                            String o105 = bzk0.o(uri, SdkUri$QueryParam.DURATION);
                                                                            Long m3 = o105 != null ? bvu0.m(10, o105) : null;
                                                                            List list = W;
                                                                            ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
                                                                            for (Object obj2 : list) {
                                                                                int i9 = i4 + 1;
                                                                                if (i4 < 0) {
                                                                                    scc.m();
                                                                                    throw null;
                                                                                }
                                                                                arrayList2.add(new PrizeHintEntity(PrizeHintId.m368constructorimpl((String) obj2), (String) W2.get(i4), null));
                                                                                i4 = i9;
                                                                            }
                                                                            return new DeeplinkAction.PrizesSnackbar(arrayList2, m3);
                                                                        }
                                                                        if (jl40.l(path, "/savings_dashboard")) {
                                                                            Map d4 = sd90.d(uri);
                                                                            return new DeeplinkAction.SavingsDashboard(!d4.isEmpty() ? d4 : null);
                                                                        }
                                                                        if (jl40.l(path, "/share_pdf")) {
                                                                            return DeeplinkAction.SharePdf.INSTANCE;
                                                                        }
                                                                        if (jl40.l(path, "/savings_account_lock_money_remove")) {
                                                                            return DeeplinkAction.SavingsUnlock.INSTANCE;
                                                                        }
                                                                        if (jl40.l(path, "/savings_account_theme_selector")) {
                                                                            return DeeplinkAction.SavingsThemeSelector.INSTANCE;
                                                                        }
                                                                        if (jl40.l(path, "/landing_registration_from_start_session")) {
                                                                            return DeeplinkAction.OpenLandingFromStartSession.INSTANCE;
                                                                        }
                                                                        if (jl40.l(path, "/logout_account")) {
                                                                            return DeeplinkAction.LogoutAccount.INSTANCE;
                                                                        }
                                                                        if (jl40.l(path, "/qr_scan")) {
                                                                            String o106 = bzk0.o(uri, SdkUri$QueryParam.ORIGIN);
                                                                            if (o106 == null) {
                                                                                o106 = DefaultOriginValues.Unknown.getValue();
                                                                            }
                                                                            return new DeeplinkAction.ShowQrScan(o106, bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID), bzk0.o(uri, SdkUri$QueryParam.AUTOPAYMENT_ID));
                                                                        }
                                                                        if (jl40.l(path, "/cache_drop")) {
                                                                            String o107 = bzk0.o(uri, SdkUri$QueryParam.KEY);
                                                                            if (o107 != null) {
                                                                                return new DeeplinkAction.CacheDrop(o107);
                                                                            }
                                                                        } else if (jl40.l(path, "/cache_update")) {
                                                                            String o108 = bzk0.o(uri, SdkUri$QueryParam.KEY);
                                                                            String o109 = bzk0.o(uri, SdkUri$QueryParam.ENTRY);
                                                                            if (o108 != null && o109 != null) {
                                                                                return new DeeplinkAction.CacheUpdate(o108, o109);
                                                                            }
                                                                        } else if (jl40.l(path, "/kyc_online_camera")) {
                                                                            String o110 = bzk0.o(uri, SdkUri$QueryParam.APPLICATION_ID);
                                                                            String o111 = bzk0.o(uri, SdkUri$QueryParam.APPLICATION_TYPE);
                                                                            if (o110 != null) {
                                                                                return new DeeplinkAction.KycOnlineCamera(o110, o111);
                                                                            }
                                                                        } else {
                                                                            if (jl40.l(path, "/open_camera")) {
                                                                                String o112 = bzk0.o(uri, SdkUri$QueryParam.APPLICATION_ID);
                                                                                String o113 = bzk0.o(uri, SdkUri$QueryParam.APPLICATION_TYPE);
                                                                                String o114 = bzk0.o(uri, SdkUri$QueryParam.DOCUMENT_GROUP);
                                                                                if (o112 != null && o113 != null) {
                                                                                    return new DeeplinkAction.DocumentsOnline(o112, o113, o114);
                                                                                }
                                                                                StringBuilder v = b64.v("applicationId = ", o112, " , applicationType = ", o113, " , groupName = ");
                                                                                v.append(o114);
                                                                                x4c.g("open_camera parsing error", null, v.toString(), null, 10);
                                                                                return null;
                                                                            }
                                                                            if (jl40.l(path, "/nfc_payment")) {
                                                                                this.j.getClass();
                                                                                return j960.a(uri);
                                                                            }
                                                                            if (jl40.l(path, "/nfc_tokenization")) {
                                                                                this.k.getClass();
                                                                                return ma60.a(uri);
                                                                            }
                                                                            if (jl40.l(path, "/nfc_default_cart_shortcut")) {
                                                                                this.l.getClass();
                                                                                return y960.a(uri);
                                                                            }
                                                                            if (jl40.l(path, "/nfc_product_settings")) {
                                                                                return DeeplinkAction.ShowNfcAllProductsSettings.INSTANCE;
                                                                            }
                                                                            if (jl40.l(path, "/nfc_troubleshooting")) {
                                                                                return DeeplinkAction.ShowNfcTroubleshooting.INSTANCE;
                                                                            }
                                                                            if (jl40.l(path, "/hw_tokenization")) {
                                                                                return DeeplinkAction.ShowHWTokenization.INSTANCE;
                                                                            }
                                                                            if (jl40.l(path, "/nfc_old_user_promo")) {
                                                                                return DeeplinkAction.ShowNfcOldUserPromo.INSTANCE;
                                                                            }
                                                                            if (jl40.l(path, "/split_qr_tooltip")) {
                                                                                return DeeplinkAction.ShowSplitQrTooltipOnMainScreen.INSTANCE;
                                                                            }
                                                                            if (jl40.l(path, "/offline_split_landing")) {
                                                                                String o115 = bzk0.o(uri, SdkUri$QueryParam.URL);
                                                                                if (o115 == null) {
                                                                                    x4c.g("landing url required for opening split offline landing screen", null, null, null, 14);
                                                                                    return null;
                                                                                }
                                                                                DeeplinkAction.WebView a = eVar.a(Uri.parse(o115), z);
                                                                                if (a != null) {
                                                                                    this.m.getClass();
                                                                                    return a;
                                                                                }
                                                                                x4c.g("Incorrect landing url for opening split offline landing screen", null, null, null, 14);
                                                                                return null;
                                                                            }
                                                                            if (jl40.l(path, hsp0.e())) {
                                                                                return new DeeplinkAction.TransferPartners(bzk0.o(uri, SdkUri$QueryParam.PHONE), bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID));
                                                                            }
                                                                            if (jl40.l(path, "/result_selected_term")) {
                                                                                return new DeeplinkAction.TransferResultSelectedTerm(bzk0.o(uri, SdkUri$QueryParam.SELECT_TERM_ID), bzk0.o(uri, SdkUri$QueryParam.RESULT_TEXT), bzk0.o(uri, SdkUri$QueryParam.TERM_TOKEN));
                                                                            }
                                                                            if (jl40.l(path, "/show_fund_docs_notice")) {
                                                                                SdkUri$QueryParam sdkUri$QueryParam14 = SdkUri$QueryParam.AMOUNT;
                                                                                String o116 = bzk0.o(uri, sdkUri$QueryParam14);
                                                                                BigDecimal h = o116 != null ? avu0.h(o116) : null;
                                                                                SdkUri$QueryParam sdkUri$QueryParam15 = SdkUri$QueryParam.CURRENCY;
                                                                                String o117 = bzk0.o(uri, sdkUri$QueryParam15);
                                                                                SdkUri$QueryParam sdkUri$QueryParam16 = SdkUri$QueryParam.TRANSFER_ID;
                                                                                String o118 = bzk0.o(uri, sdkUri$QueryParam16);
                                                                                SdkUri$QueryParam sdkUri$QueryParam17 = SdkUri$QueryParam.TARGET_AGREEMENT_ID;
                                                                                String o119 = bzk0.o(uri, sdkUri$QueryParam17);
                                                                                SdkUri$QueryParam sdkUri$QueryParam18 = SdkUri$QueryParam.SOURCE_AGREEMENT_ID;
                                                                                String o120 = bzk0.o(uri, sdkUri$QueryParam18);
                                                                                if (h != null && o117 != null && o118 != null && o119 != null && o120 != null) {
                                                                                    return new DeeplinkAction.ShowFundDocsNotice(new FundDocsNoticeInfo(new MoneyEntity(h, o117, ""), o118, o119, o120));
                                                                                }
                                                                                if (h != null) {
                                                                                    sdkUri$QueryParam14 = null;
                                                                                }
                                                                                if (o117 != null) {
                                                                                    sdkUri$QueryParam15 = null;
                                                                                }
                                                                                if (o118 != null) {
                                                                                    sdkUri$QueryParam16 = null;
                                                                                }
                                                                                if (o119 != null) {
                                                                                    sdkUri$QueryParam17 = null;
                                                                                }
                                                                                if (o120 != null) {
                                                                                    sdkUri$QueryParam18 = null;
                                                                                }
                                                                                f(path, j73.A(new SdkUri$QueryParam[]{sdkUri$QueryParam14, sdkUri$QueryParam15, sdkUri$QueryParam16, sdkUri$QueryParam17, sdkUri$QueryParam18}));
                                                                                return null;
                                                                            }
                                                                            if (jl40.l(path, "/all_mobile_providers")) {
                                                                                return new DeeplinkAction.MobileProvidersList(bzk0.o(uri, SdkUri$QueryParam.PHONE));
                                                                            }
                                                                            if (jl40.l(path, "/internet_payment")) {
                                                                                return new DeeplinkAction.InternetPayment(bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID));
                                                                            }
                                                                            if (jl40.l(path, "/internet_payment_form")) {
                                                                                String o121 = bzk0.o(uri, SdkUri$QueryParam.PROVIDER_ID);
                                                                                String o122 = bzk0.o(uri, SdkUri$QueryParam.ACCOUNT);
                                                                                String o123 = bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID);
                                                                                if (o121 != null) {
                                                                                    return new DeeplinkAction.InternetPaymentForm(o121, o122, o123);
                                                                                }
                                                                            } else {
                                                                                if (jl40.l(path, "/mobile_payment")) {
                                                                                    return new DeeplinkAction.MobilePayment(bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID));
                                                                                }
                                                                                if (jl40.l(path, "/phone_transfer")) {
                                                                                    return new DeeplinkAction.PhoneTransfer(bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID));
                                                                                }
                                                                                if (jl40.l(path, "/cross_border_transfer")) {
                                                                                    return DeeplinkAction.CrossBorderTransfer.INSTANCE;
                                                                                }
                                                                                if (jl40.l(path, hsp0.d())) {
                                                                                    String o124 = bzk0.o(uri, SdkUri$QueryParam.BANK_ID);
                                                                                    if (o124 != null) {
                                                                                        return new DeeplinkAction.CrossBorderMember(o124);
                                                                                    }
                                                                                    x4c.g("Partner id required for SELECT_CROSS_BORDER_MEMBER", null, null, null, 14);
                                                                                    return null;
                                                                                }
                                                                                if (jl40.l(path, hsp0.f())) {
                                                                                    String o125 = bzk0.o(uri, SdkUri$QueryParam.BNK_ID);
                                                                                    if (o125 != null) {
                                                                                        return new DeeplinkAction.SelectMember(o125);
                                                                                    }
                                                                                    x4c.g("Bank id required for TRANSFERS_SELECT_BANK", null, null, null, 14);
                                                                                    return null;
                                                                                }
                                                                                if (jl40.l(path, "/self_transfer")) {
                                                                                    return DeeplinkAction.SelfTransfer.INSTANCE;
                                                                                }
                                                                                if (jl40.l(path, "/requisites_transfer")) {
                                                                                    return DeeplinkAction.RequisitesTransfer.INSTANCE;
                                                                                }
                                                                                if (jl40.l(path, "/self_topup")) {
                                                                                    return DeeplinkAction.SelfTopup.INSTANCE;
                                                                                }
                                                                                if (jl40.l(path, "/profile")) {
                                                                                    return DeeplinkAction.Profile.INSTANCE;
                                                                                }
                                                                                if (jl40.l(path, "/transfer_items_sheet")) {
                                                                                    return DeeplinkAction.TransferItemsSheet.INSTANCE;
                                                                                }
                                                                                if (jl40.l(path, "/transfer_sections_sheet")) {
                                                                                    return DeeplinkAction.TransferSectionsSheet.INSTANCE;
                                                                                }
                                                                                if (jl40.l(path, "/payment_methods_sheet")) {
                                                                                    String o126 = bzk0.o(uri, SdkUri$QueryParam.SCENARIO);
                                                                                    if (o126 != null) {
                                                                                        String o127 = bzk0.o(uri, SdkUri$QueryParam.SELECTED_PAYMENT_METHOD_ID);
                                                                                        String o128 = bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID);
                                                                                        List m4 = bzk0.m(uri, SdkUri$QueryParam.SUCCESS_ACTION);
                                                                                        if (m4.isEmpty()) {
                                                                                            m4 = null;
                                                                                        }
                                                                                        List list2 = m4;
                                                                                        List m5 = bzk0.m(uri, SdkUri$QueryParam.FAIL_ACTION);
                                                                                        if (m5.isEmpty()) {
                                                                                            m5 = null;
                                                                                        }
                                                                                        List list3 = m5;
                                                                                        List m6 = bzk0.m(uri, SdkUri$QueryParam.CANCEL_ACTION);
                                                                                        return new DeeplinkAction.PaymentMethodsSheet(o126, o127, o128, list2, list3, m6.isEmpty() ? null : m6);
                                                                                    }
                                                                                } else {
                                                                                    if (jl40.l(path, "/drop_pre_confirm_action")) {
                                                                                        return DeeplinkAction.TransferDropPreConfirmAction.INSTANCE;
                                                                                    }
                                                                                    if (jl40.l(path, "/transfer_reshow_tooltip")) {
                                                                                        return new TransferReshowTooltip(uri);
                                                                                    }
                                                                                    if (jl40.l(path, "/me2me_topup")) {
                                                                                        return DeeplinkAction.Me2MeTopup.INSTANCE;
                                                                                    }
                                                                                    if (jl40.l(path, "/aft_topup")) {
                                                                                        return DeeplinkAction.AftTopup.INSTANCE;
                                                                                    }
                                                                                    if (jl40.l(path, "/budget_charges")) {
                                                                                        return DeeplinkAction.BudgetChargesUinInput.INSTANCE;
                                                                                    }
                                                                                    if (jl40.l(path, "/budget_invoice_requisites")) {
                                                                                        String o129 = bzk0.o(uri, SdkUri$QueryParam.INVOICE_ID);
                                                                                        if (o129 != null) {
                                                                                            return new DeeplinkAction.BudgetInvoiceRequisites(o129);
                                                                                        }
                                                                                    } else if (jl40.l(path, "/budget_resolve_uin")) {
                                                                                        String o130 = bzk0.o(uri, SdkUri$QueryParam.UIN);
                                                                                        String o131 = bzk0.o(uri, SdkUri$QueryParam.QR_STRING);
                                                                                        if (o130 != null) {
                                                                                            return new DeeplinkAction.BudgetChargesResolveUin.ByUin(o130);
                                                                                        }
                                                                                        if (o131 != null) {
                                                                                            return new DeeplinkAction.BudgetChargesResolveUin.ByQrString(o131);
                                                                                        }
                                                                                    } else {
                                                                                        if (jl40.l(path, "/open_notice")) {
                                                                                            String o132 = bzk0.o(uri, SdkUri$QueryParam.TITLE);
                                                                                            String o133 = bzk0.o(uri, SdkUri$QueryParam.DESCRIPTION);
                                                                                            String o134 = bzk0.o(uri, SdkUri$QueryParam.ACTION);
                                                                                            String o135 = bzk0.o(uri, SdkUri$QueryParam.IMAGE_URL);
                                                                                            String o136 = bzk0.o(uri, SdkUri$QueryParam.IMAGE_URL_DARK);
                                                                                            String o137 = bzk0.o(uri, SdkUri$QueryParam.BUTTON_TEXT);
                                                                                            String o138 = bzk0.o(uri, SdkUri$QueryParam.SECONDARY_BUTTON_TEXT);
                                                                                            String o139 = bzk0.o(uri, SdkUri$QueryParam.SECONDARY_BUTTON_ACTION);
                                                                                            String o140 = bzk0.o(uri, SdkUri$QueryParam.IMAGE_HEIGHT);
                                                                                            String o141 = bzk0.o(uri, SdkUri$QueryParam.BUTTONS_ORIENTATION);
                                                                                            if (o132 == null || o137 == null) {
                                                                                                x4c.g("title and button_text required for OPEN_NOTICE", null, null, null, 14);
                                                                                                return null;
                                                                                            }
                                                                                            if (o140 == null || bvu0.l(10, o140) != null) {
                                                                                                return new DeeplinkAction.OpenNotice(o132, o137, o133, o134, new ThemedImageUrlEntity(o135, o136), o138, o139, Boolean.valueOf(z), o140 != null ? bvu0.l(10, o140) : null, o141);
                                                                                            }
                                                                                            x4c.g("image_height is not a numeric for OPEN_NOTICE", null, null, null, 14);
                                                                                            return null;
                                                                                        }
                                                                                        if (jl40.l(path, "/card_reissue")) {
                                                                                            SdkUri$QueryParam sdkUri$QueryParam19 = SdkUri$QueryParam.CARD_ID;
                                                                                            String o142 = bzk0.o(uri, sdkUri$QueryParam19);
                                                                                            SdkUri$QueryParam sdkUri$QueryParam20 = SdkUri$QueryParam.TITLE;
                                                                                            String o143 = bzk0.o(uri, sdkUri$QueryParam20);
                                                                                            SdkUri$QueryParam sdkUri$QueryParam21 = SdkUri$QueryParam.DESCRIPTION;
                                                                                            String o144 = bzk0.o(uri, sdkUri$QueryParam21);
                                                                                            SdkUri$QueryParam sdkUri$QueryParam22 = SdkUri$QueryParam.IMAGE_URL;
                                                                                            String o145 = bzk0.o(uri, sdkUri$QueryParam22);
                                                                                            String o146 = bzk0.o(uri, SdkUri$QueryParam.IMAGE_URL_DARK);
                                                                                            boolean i10 = bzk0.i(uri, SdkUri$QueryParam.POP_CARD_SCENARIO, false);
                                                                                            CardManagementSettingStatus cardManagementSettingStatus2 = CardManagementSettingStatus.LANDING;
                                                                                            Text.Constant a2 = c3h.a(cardManagementSettingStatus2, uri, SdkUri$QueryParam.PRIMARY_BUTTON_TITLE);
                                                                                            Text.Constant a3 = c3h.a(cardManagementSettingStatus2, uri, SdkUri$QueryParam.SECONDARY_BUTTON_TITLE);
                                                                                            if (o142 != null && o143 != null && o144 != null && o145 != null) {
                                                                                                ThemedImageUrlEntity themedImageUrlEntity = new ThemedImageUrlEntity(o145, o146);
                                                                                                Text.Companion.getClass();
                                                                                                return new DeeplinkAction.CardReissue(o142, themedImageUrlEntity, com.ybsdk.core.utils.text.b.a(o143), com.ybsdk.core.utils.text.b.a(o144), i10, a2, a3);
                                                                                            }
                                                                                            if (o142 != null) {
                                                                                                sdkUri$QueryParam19 = null;
                                                                                            }
                                                                                            if (o143 != null) {
                                                                                                sdkUri$QueryParam20 = null;
                                                                                            }
                                                                                            if (o144 != null) {
                                                                                                sdkUri$QueryParam21 = null;
                                                                                            }
                                                                                            if (o145 != null) {
                                                                                                sdkUri$QueryParam22 = null;
                                                                                            }
                                                                                            f(path, j73.A(new SdkUri$QueryParam[]{sdkUri$QueryParam19, sdkUri$QueryParam20, sdkUri$QueryParam21, sdkUri$QueryParam22}));
                                                                                            return null;
                                                                                        }
                                                                                        if (jl40.l(path, "/card_deletion_reissue_processing")) {
                                                                                            String o147 = bzk0.o(uri, SdkUri$QueryParam.CLOSE_ACTION);
                                                                                            SdkUri$QueryParam sdkUri$QueryParam23 = SdkUri$QueryParam.CARD_ID;
                                                                                            String o148 = bzk0.o(uri, sdkUri$QueryParam23);
                                                                                            SdkUri$QueryParam sdkUri$QueryParam24 = SdkUri$QueryParam.SET_CARD_STATUS_ACTION_TYPE;
                                                                                            String o149 = bzk0.o(uri, sdkUri$QueryParam24);
                                                                                            String o150 = bzk0.o(uri, SdkUri$QueryParam.CARD_TYPE);
                                                                                            String o151 = bzk0.o(uri, SdkUri$QueryParam.PROCESSING_TEXT);
                                                                                            if (o148 != null && o149 != null && o150 != null) {
                                                                                                return new DeeplinkAction.CardDeletionReissueProcessing(o147, o148, o149, o151, o150);
                                                                                            }
                                                                                            if (o148 != null) {
                                                                                                sdkUri$QueryParam23 = null;
                                                                                            }
                                                                                            if (o149 != null) {
                                                                                                sdkUri$QueryParam24 = null;
                                                                                            }
                                                                                            f(path, j73.A(new SdkUri$QueryParam[]{sdkUri$QueryParam23, sdkUri$QueryParam24}));
                                                                                            return null;
                                                                                        }
                                                                                        if (jl40.l(path, "/saving_transfer")) {
                                                                                            ci01Var.getClass();
                                                                                            return ci01.c(uri);
                                                                                        }
                                                                                        if (jl40.l(path, "/mark_event_read")) {
                                                                                            this.i.getClass();
                                                                                            return nw00.a(uri);
                                                                                        }
                                                                                        if (jl40.l(path, "/me2me_debit_autopull_settings")) {
                                                                                            return DeeplinkAction.Me2MeAutoPullList.INSTANCE;
                                                                                        }
                                                                                        if (jl40.l(path, "/user_cards")) {
                                                                                            return new DeeplinkAction.UserCards(bzk0.o(uri, SdkUri$QueryParam.SNACKBAR_TITLE), bzk0.o(uri, SdkUri$QueryParam.SNACKBAR_SUBTITLE));
                                                                                        }
                                                                                        if (jl40.l(path, "/rename_card")) {
                                                                                            String o152 = bzk0.o(uri, SdkUri$QueryParam.TRUST_CARD_ID);
                                                                                            if (o152 != null) {
                                                                                                return new DeeplinkAction.CardRename(o152);
                                                                                            }
                                                                                        } else if (jl40.l(path, "/sbp_account_details")) {
                                                                                            String o153 = bzk0.o(uri, SdkUri$QueryParam.ACCOUNT_ID);
                                                                                            if (o153 != null) {
                                                                                                return new DeeplinkAction.SbpAccountDetails(o153);
                                                                                            }
                                                                                        } else {
                                                                                            if (jl40.l(path, "/sbp_subscription_consent")) {
                                                                                                return new SbpSubscriptionConsentAction(uri);
                                                                                            }
                                                                                            if (jl40.l(path, "/unbind_sbp_account")) {
                                                                                                String o154 = bzk0.o(uri, SdkUri$QueryParam.ACCOUNT_ID);
                                                                                                if (o154 != null) {
                                                                                                    return new SbpAccountUnbind(o154, uri);
                                                                                                }
                                                                                            } else {
                                                                                                if (jl40.l(path, hsp0.b())) {
                                                                                                    String o155 = bzk0.o(uri, SdkUri$QueryParam.ORIGIN);
                                                                                                    if (o155 == null) {
                                                                                                        o155 = DefaultOriginValues.Unknown.getValue();
                                                                                                    }
                                                                                                    return new DeeplinkAction.FpsAccountMembers(o155);
                                                                                                }
                                                                                                if (jl40.l(path, "/send_analytics")) {
                                                                                                    String o156 = bzk0.o(uri, SdkUri$QueryParam.EVENT_NAME);
                                                                                                    if (o156 != null) {
                                                                                                        return new DeeplinkAction.SendAnalytics(o156, bzk0.o(uri, SdkUri$QueryParam.PARAMS));
                                                                                                    }
                                                                                                } else if (jl40.l(path, "/send_ui_stat_event")) {
                                                                                                    String o157 = bzk0.o(uri, SdkUri$QueryParam.EVENT_NAME);
                                                                                                    if (o157 != null) {
                                                                                                        return new DeeplinkAction.SendUiStatEvent(o157, bzk0.o(uri, SdkUri$QueryParam.PAYLOAD_TYPE), bzk0.o(uri, SdkUri$QueryParam.PAYLOAD));
                                                                                                    }
                                                                                                } else {
                                                                                                    if (jl40.l(path, "/stories") || jl40.l(path, "/info_screen")) {
                                                                                                        String o158 = bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID);
                                                                                                        String o159 = bzk0.o(uri, SdkUri$QueryParam.TARGET);
                                                                                                        String o160 = bzk0.o(uri, SdkUri$QueryParam.PROGRESS);
                                                                                                        boolean i11 = bzk0.i(uri, SdkUri$QueryParam.SHOW_BACK_BUTTON, false);
                                                                                                        boolean i12 = bzk0.i(uri, SdkUri$QueryParam.SHOW_CLOSE_BUTTON, true);
                                                                                                        String o161 = bzk0.o(uri, SdkUri$QueryParam.START_STORY_ID);
                                                                                                        Map d5 = sd90.d(uri);
                                                                                                        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                                                                                                        for (Map.Entry entry2 : d5.entrySet()) {
                                                                                                            String str9 = (String) entry2.getKey();
                                                                                                            if (!jl40.l(str9, SdkUri$QueryParam.TARGET.getParamValue()) && !jl40.l(str9, SdkUri$QueryParam.AGREEMENT_ID.getParamValue()) && !jl40.l(str9, SdkUri$QueryParam.PROGRESS.getParamValue()) && !jl40.l(str9, SdkUri$QueryParam.SHOW_BACK_BUTTON.getParamValue()) && !jl40.l(str9, SdkUri$QueryParam.SHOW_CLOSE_BUTTON.getParamValue())) {
                                                                                                                linkedHashMap5.put(entry2.getKey(), entry2.getValue());
                                                                                                            }
                                                                                                        }
                                                                                                        LinkedHashMap linkedHashMap6 = !linkedHashMap5.isEmpty() ? linkedHashMap5 : null;
                                                                                                        if (o159 != null) {
                                                                                                            return new DeeplinkAction.Stories(o159, o158, o160, i11, i12, o161, linkedHashMap6);
                                                                                                        }
                                                                                                        f(path, rcc.b(SdkUri$QueryParam.TARGET));
                                                                                                        return null;
                                                                                                    }
                                                                                                    if (jl40.l(path, "/vertical_stories")) {
                                                                                                        String o162 = bzk0.o(uri, SdkUri$QueryParam.START_STORY_ID);
                                                                                                        if (o162 != null) {
                                                                                                            return new DeeplinkAction.VerticalStories(o162);
                                                                                                        }
                                                                                                    } else {
                                                                                                        if (jl40.l(path, "/next_story")) {
                                                                                                            return new DeeplinkAction.NextStory(bzk0.o(uri, SdkUri$QueryParam.TARGET));
                                                                                                        }
                                                                                                        if (jl40.l(path, "/pfm")) {
                                                                                                            return DeeplinkAction.Pfm.INSTANCE;
                                                                                                        }
                                                                                                        if (jl40.l(path, "/pfm_reset_filters")) {
                                                                                                            return new PfmResetFilters(uri);
                                                                                                        }
                                                                                                        if (jl40.l(path, "/pfm_test_calendar_bottom_sheet")) {
                                                                                                            String o163 = bzk0.o(uri, SdkUri$QueryParam.START_DATE);
                                                                                                            String o164 = bzk0.o(uri, SdkUri$QueryParam.END_DATE);
                                                                                                            String o165 = bzk0.o(uri, SdkUri$QueryParam.FIRST_AVAILABLE_DATE);
                                                                                                            return new DeeplinkAction.PfmCalendarBottomSheet(o163, o164, o165 != null ? o165 : "");
                                                                                                        }
                                                                                                        if (jl40.l(path, "/savings_diff_rate_calendar")) {
                                                                                                            return DeeplinkAction.DiffRateCalendar.INSTANCE;
                                                                                                        }
                                                                                                        if (jl40.l(path, "/transactions_feed") || jl40.l(path, "/transaction_feed_filter_selected")) {
                                                                                                            return this.r.a(uri);
                                                                                                        }
                                                                                                        if (jl40.l(path, "/bottom_sheet")) {
                                                                                                            String o166 = bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID);
                                                                                                            String o167 = bzk0.o(uri, SdkUri$QueryParam.TARGET);
                                                                                                            Map d6 = sd90.d(uri);
                                                                                                            if (d6.isEmpty()) {
                                                                                                                d6 = null;
                                                                                                            }
                                                                                                            if (d6 != null) {
                                                                                                                linkedHashMap3 = new LinkedHashMap();
                                                                                                                for (Map.Entry entry3 : d6.entrySet()) {
                                                                                                                    String str10 = (String) entry3.getKey();
                                                                                                                    if (!jl40.l(str10, SdkUri$QueryParam.TARGET.getParamValue()) && !jl40.l(str10, SdkUri$QueryParam.AGREEMENT_ID.getParamValue())) {
                                                                                                                        linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                                                                                                                    }
                                                                                                                }
                                                                                                            } else {
                                                                                                                linkedHashMap3 = null;
                                                                                                            }
                                                                                                            String o168 = bzk0.o(uri, SdkUri$QueryParam.SKELETON_ID);
                                                                                                            if (o167 != null) {
                                                                                                                return new DeeplinkAction.BottomSheet(o167, o166, linkedHashMap3, o168);
                                                                                                            }
                                                                                                            f(path, rcc.b(SdkUri$QueryParam.TARGET));
                                                                                                            return null;
                                                                                                        }
                                                                                                        if (jl40.l(path, "/pdf_load_by_id")) {
                                                                                                            String o169 = bzk0.o(uri, SdkUri$QueryParam.ID);
                                                                                                            String o170 = bzk0.o(uri, SdkUri$QueryParam.TARGET);
                                                                                                            Long l7 = bzk0.l(uri, SdkUri$QueryParam.LIFETIME_IN_SECONDS);
                                                                                                            Map d7 = sd90.d(uri);
                                                                                                            if (d7.isEmpty()) {
                                                                                                                d7 = null;
                                                                                                            }
                                                                                                            if (d7 != null) {
                                                                                                                linkedHashMap2 = new LinkedHashMap();
                                                                                                                for (Map.Entry entry4 : d7.entrySet()) {
                                                                                                                    if (!scc.g(SdkUri$QueryParam.ID.getParamValue(), SdkUri$QueryParam.TARGET.getParamValue(), SdkUri$QueryParam.LIFETIME_IN_SECONDS.getParamValue()).contains((String) entry4.getKey())) {
                                                                                                                        linkedHashMap2.put(entry4.getKey(), entry4.getValue());
                                                                                                                    }
                                                                                                                }
                                                                                                            } else {
                                                                                                                linkedHashMap2 = null;
                                                                                                            }
                                                                                                            if (o169 != null) {
                                                                                                                return new DeeplinkAction.PdfLoadById(o169, l7, o170, linkedHashMap2);
                                                                                                            }
                                                                                                            f(path, rcc.b(SdkUri$QueryParam.ID));
                                                                                                            return null;
                                                                                                        }
                                                                                                        boolean l8 = jl40.l(path, "/divkit");
                                                                                                        c cVar = this.x;
                                                                                                        if (l8) {
                                                                                                            return cVar.a(uri);
                                                                                                        }
                                                                                                        if (jl40.l(path, "/start_session")) {
                                                                                                            return DeeplinkAction.StartSession.INSTANCE;
                                                                                                        }
                                                                                                        if (jl40.l(path, "/status_screen")) {
                                                                                                            String o171 = bzk0.o(uri, SdkUri$QueryParam.TARGET);
                                                                                                            if (o171 != null) {
                                                                                                                Map d8 = sd90.d(uri);
                                                                                                                if (d8.isEmpty()) {
                                                                                                                    d8 = null;
                                                                                                                }
                                                                                                                if (d8 != null) {
                                                                                                                    linkedHashMap = new LinkedHashMap();
                                                                                                                    for (Map.Entry entry5 : d8.entrySet()) {
                                                                                                                        if (!jl40.l((String) entry5.getKey(), SdkUri$QueryParam.TARGET.getParamValue())) {
                                                                                                                            linkedHashMap.put(entry5.getKey(), entry5.getValue());
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    linkedHashMap = null;
                                                                                                                }
                                                                                                                return new DeeplinkAction.StatusScreenAction(o171, linkedHashMap);
                                                                                                            }
                                                                                                        } else {
                                                                                                            if (jl40.l(path, "/transfers_dashboard")) {
                                                                                                                String o172 = bzk0.o(uri, SdkUri$QueryParam.TOKENIZATION_PRODUCT_ID);
                                                                                                                if (o172 == null) {
                                                                                                                    bVar.getClass();
                                                                                                                    if (((CommonFeatureFlag) bVar.d(wlp.Z).getData()).isEnabled()) {
                                                                                                                        x4c.g("tokenizationProductId is null for /transfers_dashboard (used client default)", null, "defaultValue=wallet", rcc.b(orp0Var), 2);
                                                                                                                    }
                                                                                                                    o172 = "wallet";
                                                                                                                }
                                                                                                                String o173 = bzk0.o(uri, SdkUri$QueryParam.ORIGIN);
                                                                                                                if (o173 == null) {
                                                                                                                    o173 = DefaultOriginValues.Unknown.getValue();
                                                                                                                }
                                                                                                                return new DeeplinkAction.TransfersDashboard(o173, bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID), bzk0.o(uri, SdkUri$QueryParam.AUTOPAYMENT_ID), o172);
                                                                                                            }
                                                                                                            if (jl40.l(path, "/split_merchants")) {
                                                                                                                return DeeplinkAction.Merchants.INSTANCE;
                                                                                                            }
                                                                                                            if (jl40.l(path, "/plus_home")) {
                                                                                                                String o174 = bzk0.o(uri, SdkUri$QueryParam.URL);
                                                                                                                i2 = bzk0.i(uri, SdkUri$QueryParam.PRESENT_MODALLY, false);
                                                                                                                return new DeeplinkAction.PlusHome(o174, i2, bzk0.i(uri, SdkUri$QueryParam.FIT_WINDOW_TOP, true));
                                                                                                            }
                                                                                                            if (jl40.l(path, "/buy_plus")) {
                                                                                                                String o175 = bzk0.o(uri, SdkUri$QueryParam.OFFER_ID);
                                                                                                                String o176 = bzk0.o(uri, SdkUri$QueryParam.PRODUCT_TARGET);
                                                                                                                if (o175 != null && !evu0.J(o175) && o176 != null && !evu0.J(o176)) {
                                                                                                                    return new DeeplinkAction.PlusCheckout(o175, o176, bzk0.o(uri, SdkUri$QueryParam.SUCCESS), bzk0.o(uri, SdkUri$QueryParam.FAIL));
                                                                                                                }
                                                                                                            } else {
                                                                                                                if (jl40.l(path, "/merchant_offers")) {
                                                                                                                    return DeeplinkAction.MerchantOffers.INSTANCE;
                                                                                                                }
                                                                                                                if (jl40.l(path, "/merchant_offers_search")) {
                                                                                                                    return DeeplinkAction.MerchantOffersSearch.INSTANCE;
                                                                                                                }
                                                                                                                if (jl40.l(path, "/merchant_offers_search_suggest")) {
                                                                                                                    SdkUri$QueryParam sdkUri$QueryParam25 = SdkUri$QueryParam.QUERY;
                                                                                                                    String o177 = bzk0.o(uri, sdkUri$QueryParam25);
                                                                                                                    if (o177 != null) {
                                                                                                                        return new MerchantOffersSearchSuggest(uri, o177);
                                                                                                                    }
                                                                                                                    e(path, rcc.b(sdkUri$QueryParam25), rcc.b(lrp0.q));
                                                                                                                    return null;
                                                                                                                }
                                                                                                                if (jl40.l(path, "/merchant_offers_test_search")) {
                                                                                                                    return DeeplinkAction.MerchantOffersTestSearch.INSTANCE;
                                                                                                                }
                                                                                                                if (jl40.l(path, "/split_future_payments")) {
                                                                                                                    return DeeplinkAction.FuturePayments.INSTANCE;
                                                                                                                }
                                                                                                                if (jl40.l(path, "/credit_limit_settings_term")) {
                                                                                                                    String o178 = bzk0.o(uri, SdkUri$QueryParam.INITIAL_SCREEN_ID);
                                                                                                                    i = bzk0.i(uri, SdkUri$QueryParam.FIT_WINDOW_TOP, false);
                                                                                                                    return new DeeplinkAction.CreditLimitSettingsTerm(o178, i);
                                                                                                                }
                                                                                                                if (jl40.l(path, "/credit_limit_settings_term_from_card")) {
                                                                                                                    String o179 = bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID);
                                                                                                                    if (o179 != null) {
                                                                                                                        return new DeeplinkAction.CreditLimitSettingsTermFromCard(o179, bzk0.o(uri, SdkUri$QueryParam.INITIAL_SCREEN_ID), bzk0.o(uri, SdkUri$QueryParam.BOTTOM_SHEET_URL));
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    if (jl40.l(path, "/show_transfer_check_notice")) {
                                                                                                                        return DeeplinkAction.ShowTransferCheckNotice.INSTANCE;
                                                                                                                    }
                                                                                                                    if (jl40.l(path, "/qr_payment_agreement_selected")) {
                                                                                                                        String o180 = bzk0.o(uri, SdkUri$QueryParam.ID);
                                                                                                                        Iterator<E> it2 = ProductType.getEntries().iterator();
                                                                                                                        while (true) {
                                                                                                                            if (!it2.hasNext()) {
                                                                                                                                obj = null;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            obj = it2.next();
                                                                                                                            ProductType productType = (ProductType) obj;
                                                                                                                            String o181 = bzk0.o(uri, SdkUri$QueryParam.PRODUCT_CODE);
                                                                                                                            if (o181 != null ? cvu0.t(o181, productType.name(), true) : false) {
                                                                                                                                break;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        ProductType productType2 = (ProductType) obj;
                                                                                                                        String o182 = bzk0.o(uri, SdkUri$QueryParam.AUTOPAYMENT_ID);
                                                                                                                        String o183 = bzk0.o(uri, SdkUri$QueryParam.MEMBER_ID);
                                                                                                                        if (o180 != null && productType2 != null) {
                                                                                                                            return new DeeplinkAction.QrPaymentsSelectAgreement(o180, productType2, o182, o183);
                                                                                                                        }
                                                                                                                    } else if (jl40.l(path, "/qr_credit_limit_term")) {
                                                                                                                        List<SdkUri$QueryParam> g2 = scc.g(SdkUri$QueryParam.TERM_TITLE, SdkUri$QueryParam.TERM_SUBTITLE, SdkUri$QueryParam.TERM_TODAY_PAYMENT, SdkUri$QueryParam.TERM_PLAN_PAYMENT, SdkUri$QueryParam.TERM_BUTTON_TEXT, SdkUri$QueryParam.SELECT_TERM_ID);
                                                                                                                        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                                                                                                                        for (SdkUri$QueryParam sdkUri$QueryParam26 : g2) {
                                                                                                                            String o184 = bzk0.o(uri, sdkUri$QueryParam26);
                                                                                                                            if (o184 != null) {
                                                                                                                                linkedHashMap7.put(sdkUri$QueryParam26.getParamValue(), o184);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        String o185 = bzk0.o(uri, SdkUri$QueryParam.SELECT_TERM_ID);
                                                                                                                        if (o185 != null) {
                                                                                                                            return new DeeplinkAction.QrCreditLimitTerm(o185, linkedHashMap7.size() == g2.size() ? linkedHashMap7 : null);
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        if (jl40.l(path, "/open_pro_acquire_card")) {
                                                                                                                            return DeeplinkAction.OpenProAcquireCard.INSTANCE;
                                                                                                                        }
                                                                                                                        if (jl40.l(path, "/a3_requisites")) {
                                                                                                                            return cVar.b(uri);
                                                                                                                        }
                                                                                                                        if (jl40.l(path, "/pro_topup_bottom_sheet")) {
                                                                                                                            return this.u.a();
                                                                                                                        }
                                                                                                                        if (jl40.l(path, "/send_pro_open_screen_request")) {
                                                                                                                            String o186 = bzk0.o(uri, SdkUri$QueryParam.ACTION);
                                                                                                                            if (o186 != null) {
                                                                                                                                return new DeeplinkAction.SendProOpenScreenRequest(o186);
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            if (jl40.l(path, "/finish_upgrade_split")) {
                                                                                                                                return DeeplinkAction.FinishUpgradeSplit.INSTANCE;
                                                                                                                            }
                                                                                                                            if (jl40.l(path, "/logout_suggest")) {
                                                                                                                                return DeeplinkAction.LogoutSuggest.INSTANCE;
                                                                                                                            }
                                                                                                                            if (jl40.l(path, "/passport_account_management")) {
                                                                                                                                return DeeplinkAction.PassportAccount.INSTANCE;
                                                                                                                            }
                                                                                                                            if (jl40.l(path, "/resolve_qr_detailed")) {
                                                                                                                                SdkUri$QueryParam sdkUri$QueryParam27 = SdkUri$QueryParam.QR;
                                                                                                                                String o187 = bzk0.o(uri, sdkUri$QueryParam27);
                                                                                                                                if (o187 != null) {
                                                                                                                                    return new DeeplinkAction.ResolveQrDetailed(o187);
                                                                                                                                }
                                                                                                                                e(path, rcc.b(sdkUri$QueryParam27), rcc.b(orp0Var));
                                                                                                                                return null;
                                                                                                                            }
                                                                                                                            if (jl40.l(path, "/payment_sdk_screen")) {
                                                                                                                                SdkUri$QueryParam sdkUri$QueryParam28 = SdkUri$QueryParam.URL;
                                                                                                                                String o188 = bzk0.o(uri, sdkUri$QueryParam28);
                                                                                                                                if (o188 != null) {
                                                                                                                                    return new DeeplinkAction.PaymentSdk(o188);
                                                                                                                                }
                                                                                                                                f(path, rcc.b(sdkUri$QueryParam28));
                                                                                                                                return null;
                                                                                                                            }
                                                                                                                            if (jl40.l(path, "/paymentsdk")) {
                                                                                                                                SdkUri$QueryParam sdkUri$QueryParam29 = SdkUri$QueryParam.URL;
                                                                                                                                String o189 = bzk0.o(uri, sdkUri$QueryParam29);
                                                                                                                                if (o189 != null) {
                                                                                                                                    return new DeeplinkAction.TransportPaymentSDK(o189);
                                                                                                                                }
                                                                                                                                f(path, rcc.b(sdkUri$QueryParam29));
                                                                                                                                return null;
                                                                                                                            }
                                                                                                                            if (jl40.l(path, "/reload_screen")) {
                                                                                                                                return DeeplinkAction.ReloadScreen.INSTANCE;
                                                                                                                            }
                                                                                                                            if (jl40.l(path, "/nfc_system_settings")) {
                                                                                                                                NfcSystemSettingsType d9 = atb1.d(bzk0.o(uri, SdkUri$QueryParam.TARGET));
                                                                                                                                if (d9 != null) {
                                                                                                                                    return new DeeplinkAction.NfcSystemSettings(d9);
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                if (jl40.l(path, "/nfc_enqueue_tokenization")) {
                                                                                                                                    return new DeeplinkAction.NfcEnqueueTokenization(bzk0.i(uri, SdkUri$QueryParam.WIPE_DATA, false));
                                                                                                                                }
                                                                                                                                if (jl40.l(path, "/nfc_restart_application")) {
                                                                                                                                    return new DeeplinkAction.NfcRestartApplication(bzk0.i(uri, SdkUri$QueryParam.WIPE_DATA, false));
                                                                                                                                }
                                                                                                                                if (jl40.l(path, "/nfc_yellow_path_enroll")) {
                                                                                                                                    return DeeplinkAction.NfcYellowPathEnroll.INSTANCE;
                                                                                                                                }
                                                                                                                                if (jl40.l(path, "/nfc_yellow_path_confirm")) {
                                                                                                                                    return DeeplinkAction.NfcYellowPathConfirm.INSTANCE;
                                                                                                                                }
                                                                                                                                if (jl40.l(path, "/nfc_yellow_path_activate")) {
                                                                                                                                    SdkUri$QueryParam sdkUri$QueryParam30 = SdkUri$QueryParam.METHOD;
                                                                                                                                    String o190 = bzk0.o(uri, sdkUri$QueryParam30);
                                                                                                                                    if (o190 != null) {
                                                                                                                                        return new DeeplinkAction.NfcYellowPathActivate(o190);
                                                                                                                                    }
                                                                                                                                    f(path, rcc.b(sdkUri$QueryParam30));
                                                                                                                                    return null;
                                                                                                                                }
                                                                                                                                if (jl40.l(path, "/nfc_yellow_path_reactivate")) {
                                                                                                                                    return DeeplinkAction.NfcYellowPathReactivate.INSTANCE;
                                                                                                                                }
                                                                                                                                if (jl40.l(path, "/nfc_yellow_path_verify")) {
                                                                                                                                    SdkUri$QueryParam sdkUri$QueryParam31 = SdkUri$QueryParam.CODE;
                                                                                                                                    String o191 = bzk0.o(uri, sdkUri$QueryParam31);
                                                                                                                                    if (o191 != null) {
                                                                                                                                        return new DeeplinkAction.NfcYellowPathVerify(o191);
                                                                                                                                    }
                                                                                                                                    f(path, rcc.b(sdkUri$QueryParam31));
                                                                                                                                    return null;
                                                                                                                                }
                                                                                                                                if (jl40.l(path, "/nfc_card_input_next_step")) {
                                                                                                                                    return DeeplinkAction.NfcCardInputNextStep.INSTANCE;
                                                                                                                                }
                                                                                                                                if (jl40.l(path, "/set_app_icon")) {
                                                                                                                                    String o192 = bzk0.o(uri, SdkUri$QueryParam.ICON_ID);
                                                                                                                                    if (o192 != null) {
                                                                                                                                        return new DeeplinkAction.SetAppIcon(o192);
                                                                                                                                    }
                                                                                                                                } else if (jl40.l(path, "/choose_app_icon")) {
                                                                                                                                    bVar.getClass();
                                                                                                                                    String chooseAppIconScreenDeeplink = ((AppIconConfigSchema) bVar.d(bu2.a).getData()).getChooseAppIconScreenDeeplink();
                                                                                                                                    DeeplinkAction.Divkit a4 = chooseAppIconScreenDeeplink != null ? cVar.a(Uri.parse(chooseAppIconScreenDeeplink)) : null;
                                                                                                                                    if (a4 != null) {
                                                                                                                                        return new DeeplinkAction.ChooseAppIcon(a4);
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    if (jl40.l(path, "/finalize_payment_choice")) {
                                                                                                                                        this.C.getClass();
                                                                                                                                        return k7r.a(uri);
                                                                                                                                    }
                                                                                                                                    if (jl40.l(path, "/default_payment_method_set")) {
                                                                                                                                        String o193 = bzk0.o(uri, SdkUri$QueryParam.PRODUCT_ID);
                                                                                                                                        if (o193 != null) {
                                                                                                                                            Map d10 = sd90.d(uri);
                                                                                                                                            LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                                                                                                                                            for (Map.Entry entry6 : d10.entrySet()) {
                                                                                                                                                if (!jl40.l((String) entry6.getKey(), SdkUri$QueryParam.PRODUCT_ID.getParamValue())) {
                                                                                                                                                    linkedHashMap8.put(entry6.getKey(), entry6.getValue());
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            return new DefaultPaymentMethodSet(uri, o193, kotlin.collections.b.v(linkedHashMap8));
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        if (jl40.l(path, "/reload_payment_method_sheet")) {
                                                                                                                                            return new DeeplinkAction.ReloadPaymentMethodSheet(bzk0.o(uri, SdkUri$QueryParam.PAYMENT_METHOD_ID), bzk0.o(uri, SdkUri$QueryParam.TRUST_ID));
                                                                                                                                        }
                                                                                                                                        if (jl40.l(path, "/personal_wallet")) {
                                                                                                                                            return new DeeplinkAction.PersonalWallet(uri);
                                                                                                                                        }
                                                                                                                                        if (jl40.l(path, "/quickpay")) {
                                                                                                                                            return new DeeplinkAction.QuickPay(uri);
                                                                                                                                        }
                                                                                                                                        if (jl40.l(path, "/cbdc_debug")) {
                                                                                                                                            return DeeplinkAction.CbdcDebug.INSTANCE;
                                                                                                                                        }
                                                                                                                                        if (jl40.l(path, "/cbdc_state")) {
                                                                                                                                            String o194 = bzk0.o(uri, SdkUri$QueryParam.TARGET);
                                                                                                                                            return new DeeplinkAction.CbdcState(o194 != null ? Uri.parse(o194) : null);
                                                                                                                                        }
                                                                                                                                        if (jl40.l(path, "/cbdc_registration")) {
                                                                                                                                            return new DeeplinkAction.CbdcRegistration(bzk0.o(uri, SdkUri$QueryParam.APPLICATION_ID));
                                                                                                                                        }
                                                                                                                                        if (jl40.l(path, "/cbdc_accept_consent")) {
                                                                                                                                            String o195 = bzk0.o(uri, SdkUri$QueryParam.DOCUMENT_TYPE);
                                                                                                                                            if (o195 != null) {
                                                                                                                                                return new CbdcAcceptConsent(o195, bzk0.o(uri, SdkUri$QueryParam.DOCUMENT_URL), null, 4, null);
                                                                                                                                            }
                                                                                                                                        } else if (jl40.l(path, "/cbdc_cert_issue")) {
                                                                                                                                            String o196 = bzk0.o(uri, SdkUri$QueryParam.TYPE);
                                                                                                                                            if (o196 != null) {
                                                                                                                                                return new DeeplinkAction.CbdcCertIssue(o196, bzk0.o(uri, SdkUri$QueryParam.APPLICATION_ID), bzk0.o(uri, SdkUri$QueryParam.FULL_NAME), bzk0.o(uri, SdkUri$QueryParam.SNILS));
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            if (jl40.l(path, "/cbdc_dashboard")) {
                                                                                                                                                return DeeplinkAction.CbdcDashboard.INSTANCE;
                                                                                                                                            }
                                                                                                                                            if (jl40.l(path, "/remove_item") && (o = bzk0.o(uri, SdkUri$QueryParam.ID)) != null) {
                                                                                                                                                return new DeeplinkAction.RemoveItem(o);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return null;
                    }
                    String o197 = bzk0.o(uri, SdkUri$QueryParam.TEXT);
                    if (o197 != null) {
                        return new DeeplinkAction.Share(o197);
                    }
                }
            }
        }
        return null;
    }

    public final BaseDeeplinkAction d(Uri uri, boolean z) {
        BaseDeeplinkAction d;
        com.ybsdk.rconfig.b bVar = this.f;
        bVar.getClass();
        return (!kotlin.collections.a.G(((DeeplinksGeneratorConfig) bVar.d(f4h.a).getData()).getEnabledPaths(), uri.getPath()) || (d = t691.d(uri, new xz3(this, z, 5))) == null) ? c(uri, z) : d;
    }

    public final void g(String str, String str2) {
        rt1 rt1Var = this.H.X;
        LinkedHashMap w = g8e.w(2, Constants.DEEPLINK, str);
        if (str2 != null) {
            w.put("error", str2);
        }
        rt1Var.a.a("push_notifications.deeplink_push.tapped", w);
    }
}
