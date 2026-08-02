package com.yandex.go.diagnostic_qr;

import com.yandex.go.diagnostic_qr.network.QrDiagnosticDataApi;
import com.yandex.go.diagnostic_qr.network.QrDiagnosticDataParam;
import defpackage.cmt;
import defpackage.h3y;
import defpackage.jst;
import defpackage.ny61;
import defpackage.tse;
import defpackage.x6g0;
import defpackage.zy11;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final tse a;
    public final x6g0 b;
    public final h3y c;

    public a(tse tseVar, x6g0 x6g0Var, h3y h3yVar) {
        this.a = tseVar;
        this.b = x6g0Var;
        this.c = h3yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, String str, ContinuationImpl continuationImpl) {
        QrDiagnosticDataInteractorImpl$sendDiagnosticData$1 qrDiagnosticDataInteractorImpl$sendDiagnosticData$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof QrDiagnosticDataInteractorImpl$sendDiagnosticData$1) {
            qrDiagnosticDataInteractorImpl$sendDiagnosticData$1 = (QrDiagnosticDataInteractorImpl$sendDiagnosticData$1) continuationImpl;
            int i2 = qrDiagnosticDataInteractorImpl$sendDiagnosticData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qrDiagnosticDataInteractorImpl$sendDiagnosticData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = qrDiagnosticDataInteractorImpl$sendDiagnosticData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qrDiagnosticDataInteractorImpl$sendDiagnosticData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Date time = Calendar.getInstance().getTime();
                    String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US).format(time);
                    long epochMilli = time.toInstant().toEpochMilli();
                    cmt<zy11> a = ((QrDiagnosticDataApi) aVar.c.get()).a(new QrDiagnosticDataParam(format, epochMilli, str));
                    qrDiagnosticDataInteractorImpl$sendDiagnosticData$1.L$0 = null;
                    qrDiagnosticDataInteractorImpl$sendDiagnosticData$1.L$1 = null;
                    qrDiagnosticDataInteractorImpl$sendDiagnosticData$1.L$2 = null;
                    qrDiagnosticDataInteractorImpl$sendDiagnosticData$1.L$3 = null;
                    qrDiagnosticDataInteractorImpl$sendDiagnosticData$1.L$4 = null;
                    qrDiagnosticDataInteractorImpl$sendDiagnosticData$1.J$0 = epochMilli;
                    qrDiagnosticDataInteractorImpl$sendDiagnosticData$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.a(a, null, qrDiagnosticDataInteractorImpl$sendDiagnosticData$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                jst.e.getClass();
                return zy11.a;
            }
        }
        qrDiagnosticDataInteractorImpl$sendDiagnosticData$1 = new QrDiagnosticDataInteractorImpl$sendDiagnosticData$1(aVar, continuationImpl);
        Object obj2 = qrDiagnosticDataInteractorImpl$sendDiagnosticData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qrDiagnosticDataInteractorImpl$sendDiagnosticData$1.label;
        if (i != 0) {
        }
        jst.e.getClass();
        return zy11.a;
    }
}
