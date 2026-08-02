package com.ybsdk.qr;

import android.net.Uri;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.screens.initial.deeplink.SdkUri$QueryParam;
import defpackage.a3h;
import defpackage.cbg0;
import defpackage.ctj0;
import defpackage.dtj0;
import defpackage.jl40;
import defpackage.kdg0;
import defpackage.ldg0;
import defpackage.mdg0;
import defpackage.ny61;
import defpackage.qpi0;
import defpackage.scc;
import defpackage.sd90;
import defpackage.usj0;
import defpackage.w691;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a {
    public final qpi0 a;
    public final a3h b;
    public final com.ybsdk.feature.qr.internal.domain.a c;

    public a(qpi0 qpi0Var, a3h a3hVar, com.ybsdk.feature.qr.internal.domain.a aVar) {
        this.a = qpi0Var;
        this.b = a3hVar;
        this.c = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Uri uri, String str, String str2, ContinuationImpl continuationImpl) {
        QrResolvingEngine$resolveDetailed$1 qrResolvingEngine$resolveDetailed$1;
        int i;
        usj0 usj0Var;
        Deeplink e;
        String str3;
        Deeplink deeplink;
        String str4;
        usj0 usj0Var2;
        if (continuationImpl instanceof QrResolvingEngine$resolveDetailed$1) {
            qrResolvingEngine$resolveDetailed$1 = (QrResolvingEngine$resolveDetailed$1) continuationImpl;
            int i2 = qrResolvingEngine$resolveDetailed$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qrResolvingEngine$resolveDetailed$1.label = i2 - Integer.MIN_VALUE;
                Object obj = qrResolvingEngine$resolveDetailed$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qrResolvingEngine$resolveDetailed$1.label;
                if (i != 0) {
                    b.b(obj);
                    e = w691.e(this.b, uri, true, null, false, 12);
                    if (e == null) {
                        return new kdg0(false, str2, null, null, null, null);
                    }
                    BaseDeeplinkAction action = e.getAction();
                    DeeplinkAction.ResolveQrDetailed resolveQrDetailed = action instanceof DeeplinkAction.ResolveQrDetailed ? (DeeplinkAction.ResolveQrDetailed) action : null;
                    if (resolveQrDetailed == null) {
                        str3 = str2;
                        if (usj0Var == null) {
                            usj0Var = new usj0(scc.h(e.getFallback()));
                        }
                        if (usj0Var.a().isEmpty()) {
                            return new kdg0(false, str3, null, usj0Var.b(), usj0Var.c(), null);
                        }
                        usj0 usj0Var3 = usj0Var;
                        return new kdg0(true, str3, new ldg0(usj0Var.a()), usj0Var.b(), usj0Var3.c(), kotlin.collections.a.X(usj0Var3.a(), ",", null, null, new cbg0(8), 30));
                    }
                    String qr = resolveQrDetailed.getQr();
                    qrResolvingEngine$resolveDetailed$1.L$0 = str2;
                    qrResolvingEngine$resolveDetailed$1.L$1 = e;
                    qrResolvingEngine$resolveDetailed$1.label = 1;
                    Object a = this.c.a(qr, str, qrResolvingEngine$resolveDetailed$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    deeplink = e;
                    str4 = str2;
                    usj0Var2 = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    deeplink = (Deeplink) qrResolvingEngine$resolveDetailed$1.L$1;
                    str4 = (String) qrResolvingEngine$resolveDetailed$1.L$0;
                    b.b(obj);
                    usj0Var2 = ((Result) obj).getValue();
                }
                usj0Var = usj0Var2 instanceof Result.Failure ? null : usj0Var2;
                str3 = str4;
                e = deeplink;
                if (usj0Var == null) {
                }
                if (usj0Var.a().isEmpty()) {
                }
            }
        }
        qrResolvingEngine$resolveDetailed$1 = new QrResolvingEngine$resolveDetailed$1(this, continuationImpl);
        Object obj2 = qrResolvingEngine$resolveDetailed$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qrResolvingEngine$resolveDetailed$1.label;
        if (i != 0) {
        }
        usj0Var = usj0Var2 instanceof Result.Failure ? null : usj0Var2;
        str3 = str4;
        e = deeplink;
        if (usj0Var == null) {
        }
        if (usj0Var.a().isEmpty()) {
        }
    }

    public final Object b(String str, String str2, dtj0 dtj0Var, String str3, String str4, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        String str5;
        String str6;
        List a = dtj0Var != null ? dtj0Var.a() : null;
        kdg0 kdg0Var = new kdg0(false, StringUtils.UNDEFINED, null, null, null, null);
        if (a != null && !a.isEmpty()) {
            List a2 = dtj0Var.a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : a2) {
                List c = ((ctj0) obj).c();
                if (!(c instanceof Collection) || !c.isEmpty()) {
                    Iterator it = c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (this.a.a((String) it.next()).h(str)) {
                                arrayList.add(obj);
                                break;
                            }
                        }
                    }
                }
            }
            ctj0 ctj0Var = (ctj0) kotlin.collections.a.R(arrayList);
            if (ctj0Var == null || (str5 = ctj0Var.b()) == null) {
                String b = z2 ? dtj0Var.b() : null;
                if (b != null) {
                    str5 = b;
                }
            }
            if (ctj0Var == null || (str6 = ctj0Var.a()) == null) {
                str6 = StringUtils.UNDEFINED;
            }
            String str7 = str6;
            Uri i = sd90.i(Uri.parse(str5), kotlin.collections.b.i(new Pair(SdkUri$QueryParam.URL.getParamValue(), str), new Pair(SdkUri$QueryParam.AGREEMENT_ID.getParamValue(), str3), new Pair(SdkUri$QueryParam.AUTOPAYMENT_ID.getParamValue(), str4)));
            if (!jl40.l(i.getPath(), "/resolve_qr_detailed") || !z) {
                return new kdg0(true, str7, new mdg0(i), null, null, i.toString());
            }
            if (str2 == null) {
                str2 = "";
            }
            return a(i, str2, str7, continuationImpl);
        }
        return kdg0Var;
    }
}
