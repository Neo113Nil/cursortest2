package com.ybsdk.di.modules.mediators;

import android.net.Uri;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrRecognizedSource;
import defpackage.dtj0;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.j3h;
import defpackage.jl40;
import defpackage.kdg0;
import defpackage.ldg0;
import defpackage.mdg0;
import defpackage.ndg0;
import defpackage.ny61;
import defpackage.odg0;
import defpackage.pdg0;
import defpackage.rdg0;
import defpackage.rt1;
import defpackage.s7s0;
import defpackage.sls;
import defpackage.w511;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.LinkedHashMap;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final j3h a;
    public final AppAnalyticsReporter b;
    public final com.ybsdk.qr.a c;

    public a(j3h j3hVar, AppAnalyticsReporter appAnalyticsReporter, com.ybsdk.qr.a aVar) {
        this.a = j3hVar;
        this.b = appAnalyticsReporter;
        this.c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, dtj0 dtj0Var, String str3, String str4, QrPaymentEvents$QrRecognizedSource qrPaymentEvents$QrRecognizedSource, ContinuationImpl continuationImpl) {
        QrResultRemoteRulesListenerImpl$onQrRecognized$1 qrResultRemoteRulesListenerImpl$onQrRecognized$1;
        int i;
        String str5;
        QrPaymentEvents$QrRecognizedSource qrPaymentEvents$QrRecognizedSource2;
        String str6;
        String str7;
        ndg0 ndg0Var;
        sls s7s0Var;
        String str8;
        String str9;
        String host;
        if (continuationImpl instanceof QrResultRemoteRulesListenerImpl$onQrRecognized$1) {
            qrResultRemoteRulesListenerImpl$onQrRecognized$1 = (QrResultRemoteRulesListenerImpl$onQrRecognized$1) continuationImpl;
            int i2 = qrResultRemoteRulesListenerImpl$onQrRecognized$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qrResultRemoteRulesListenerImpl$onQrRecognized$1.label = i2 - Integer.MIN_VALUE;
                QrResultRemoteRulesListenerImpl$onQrRecognized$1 qrResultRemoteRulesListenerImpl$onQrRecognized$12 = qrResultRemoteRulesListenerImpl$onQrRecognized$1;
                Object obj = qrResultRemoteRulesListenerImpl$onQrRecognized$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qrResultRemoteRulesListenerImpl$onQrRecognized$12.label;
                str5 = null;
                if (i != 0) {
                    b.b(obj);
                    String obj2 = evu0.k0(str).toString();
                    qrResultRemoteRulesListenerImpl$onQrRecognized$12.L$0 = str;
                    qrResultRemoteRulesListenerImpl$onQrRecognized$12.L$1 = str2;
                    qrPaymentEvents$QrRecognizedSource2 = qrPaymentEvents$QrRecognizedSource;
                    qrResultRemoteRulesListenerImpl$onQrRecognized$12.L$2 = qrPaymentEvents$QrRecognizedSource2;
                    qrResultRemoteRulesListenerImpl$onQrRecognized$12.label = 1;
                    obj = this.c.b(obj2, str2, dtj0Var, str3, str4, true, true, qrResultRemoteRulesListenerImpl$onQrRecognized$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str6 = str;
                    str7 = str2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    QrPaymentEvents$QrRecognizedSource qrPaymentEvents$QrRecognizedSource3 = (QrPaymentEvents$QrRecognizedSource) qrResultRemoteRulesListenerImpl$onQrRecognized$12.L$2;
                    str7 = (String) qrResultRemoteRulesListenerImpl$onQrRecognized$12.L$1;
                    String str10 = (String) qrResultRemoteRulesListenerImpl$onQrRecognized$12.L$0;
                    b.b(obj);
                    qrPaymentEvents$QrRecognizedSource2 = qrPaymentEvents$QrRecognizedSource3;
                    str6 = str10;
                }
                kdg0 kdg0Var = (kdg0) obj;
                ndg0Var = kdg0Var.c;
                String str11 = kdg0Var.b;
                boolean z = kdg0Var.a;
                if (!(ndg0Var instanceof mdg0)) {
                    s7s0Var = new rdg0(this, ndg0Var);
                } else if (ndg0Var instanceof ldg0) {
                    s7s0Var = new rdg0(ndg0Var, this);
                } else {
                    if (ndg0Var != null) {
                        w511.b();
                        return null;
                    }
                    s7s0Var = new s7s0(23);
                }
                str8 = kdg0Var.d;
                str9 = kdg0Var.e;
                rt1 rt1Var = this.b.Y;
                host = Uri.parse(str6).getHost();
                if (host == null) {
                    str5 = host;
                } else if (jl40.l(str11, StringUtils.UNDEFINED)) {
                    str5 = str6;
                }
                LinkedHashMap w = g8e.w(7, "category", str11);
                w.put("passed", Boolean.valueOf(z));
                if (str5 != null) {
                    w.put("details", str5);
                }
                if (str8 != null) {
                    w.put("qr_type", str8);
                }
                if (str9 != null) {
                    w.put("qrc_id", str9);
                }
                if (str7 != null) {
                    w.put("origin", str7);
                }
                if (qrPaymentEvents$QrRecognizedSource2 != null) {
                    w.put("source", qrPaymentEvents$QrRecognizedSource2.getOriginalValue());
                }
                rt1Var.a.a("qr.recognized", w);
                return !z ? new odg0(str11, kdg0Var.f, s7s0Var) : new pdg0(str11);
            }
        }
        qrResultRemoteRulesListenerImpl$onQrRecognized$1 = new QrResultRemoteRulesListenerImpl$onQrRecognized$1(this, continuationImpl);
        QrResultRemoteRulesListenerImpl$onQrRecognized$1 qrResultRemoteRulesListenerImpl$onQrRecognized$122 = qrResultRemoteRulesListenerImpl$onQrRecognized$1;
        Object obj3 = qrResultRemoteRulesListenerImpl$onQrRecognized$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qrResultRemoteRulesListenerImpl$onQrRecognized$122.label;
        str5 = null;
        if (i != 0) {
        }
        kdg0 kdg0Var2 = (kdg0) obj3;
        ndg0Var = kdg0Var2.c;
        String str112 = kdg0Var2.b;
        boolean z2 = kdg0Var2.a;
        if (!(ndg0Var instanceof mdg0)) {
        }
        str8 = kdg0Var2.d;
        str9 = kdg0Var2.e;
        rt1 rt1Var2 = this.b.Y;
        host = Uri.parse(str6).getHost();
        if (host == null) {
        }
        LinkedHashMap w2 = g8e.w(7, "category", str112);
        w2.put("passed", Boolean.valueOf(z2));
        if (str5 != null) {
        }
        if (str8 != null) {
        }
        if (str9 != null) {
        }
        if (str7 != null) {
        }
        if (qrPaymentEvents$QrRecognizedSource2 != null) {
        }
        rt1Var2.a.a("qr.recognized", w2);
        if (!z2) {
        }
    }
}
