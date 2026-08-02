package com.yandex.quark.file.download.tracking;

import android.app.DownloadManager;
import android.content.Context;
import android.database.Cursor;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi.MapiClientImpl;
import defpackage.b64;
import defpackage.g8e;
import defpackage.ike;
import defpackage.jwu;
import defpackage.kwu;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.pzq;
import defpackage.qzq;
import defpackage.r7m;
import defpackage.rzq;
import defpackage.sjh;
import defpackage.sls;
import defpackage.szq;
import defpackage.tje;
import defpackage.tzq;
import defpackage.uyj;
import defpackage.va90;
import defpackage.w511;
import defpackage.wly0;
import defpackage.x4e;
import defpackage.zq6;
import defpackage.zwf0;
import defpackage.zy11;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes8.dex */
public final class a {
    public final va90 a;
    public final zwf0 b;
    public final zq6 c;
    public final wly0 d;
    public final ike e;
    public final long f;
    public final long g;
    public final sls h;

    public a(Context context, zwf0 zwf0Var, zq6 zq6Var, wly0 wly0Var, ike ikeVar) {
        va90 va90Var = new va90((DownloadManager) context.getApplicationContext().getSystemService(DownloadManager.class));
        FileDownloadResultTracker$1 fileDownloadResultTracker$1 = FileDownloadResultTracker$1.b;
        this.a = va90Var;
        this.b = zwf0Var;
        this.c = zq6Var;
        this.d = wly0Var;
        this.e = ikeVar;
        this.f = 500L;
        this.g = MapiClientImpl.RETRIES_TIME_MILLIS;
        this.h = fileDownloadResultTracker$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x01f4, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0172, code lost:
    
        r2 = r17;
        r0 = defpackage.b64.s(r16.b(), r16.a(), "Download status=", " reason=", " downloadId=");
        r0.append(r11);
        r5.c(r2, r0.toString());
        r0 = r16.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0195, code lost:
    
        if (r0 == 1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0198, code lost:
    
        if (r0 == 2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x019b, code lost:
    
        if (r0 == 4) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x019f, code lost:
    
        if (r0 == 8) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01a3, code lost:
    
        if (r0 == 16) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a5, code lost:
    
        r9.L$0 = r6;
        r9.J$0 = r11;
        r9.J$1 = r13;
        r9.label = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01b2, code lost:
    
        if (kotlinx.coroutines.a.i(r3, r9) != r7) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01c1, code lost:
    
        r21.b(r11, r6, r16.b(), r16.a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01d0, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01d1, code lost:
    
        r21.b(r11, r6, r16.b(), r16.a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01e0, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01e1, code lost:
    
        r10 = r6;
        r9.L$0 = r10;
        r9.J$0 = r11;
        r9.J$1 = r13;
        r9.label = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01f2, code lost:
    
        if (kotlinx.coroutines.a.i(r3, r9) != r7) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01f5, code lost:
    
        r17 = r2;
        r0 = r21;
        r6 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x01b2 -> B:12:0x01b5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, long j, tzq tzqVar, ContinuationImpl continuationImpl) {
        FileDownloadResultTracker$monitorDownload$1 fileDownloadResultTracker$monitorDownload$1;
        int i;
        String str;
        Throwable th;
        long j2;
        String str2;
        long longValue;
        FileDownloadResultTracker$monitorDownload$1 fileDownloadResultTracker$monitorDownload$12;
        tzq tzqVar2;
        long longValue2;
        sls slsVar;
        String str3;
        Throwable th2;
        r7m r7mVar;
        String str4;
        a aVar2 = aVar;
        sls slsVar2 = aVar2.h;
        long j3 = aVar2.f;
        zwf0 zwf0Var = aVar2.b;
        if (continuationImpl instanceof FileDownloadResultTracker$monitorDownload$1) {
            fileDownloadResultTracker$monitorDownload$1 = (FileDownloadResultTracker$monitorDownload$1) continuationImpl;
            int i2 = fileDownloadResultTracker$monitorDownload$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fileDownloadResultTracker$monitorDownload$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fileDownloadResultTracker$monitorDownload$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fileDownloadResultTracker$monitorDownload$1.label;
                str = " host=";
                if (i != 0) {
                    th = null;
                    b.b(obj);
                    String b = tzqVar.b();
                    StringBuilder sb = new StringBuilder("Started monitoring downloadId=");
                    j2 = j;
                    sb.append(j2);
                    sb.append(" host=");
                    sb.append(b);
                    zwf0Var.info("FileDownloadResultTracker", sb.toString());
                    str2 = "FileDownloadResultTracker";
                    longValue = ((Number) slsVar2.invoke()).longValue() + aVar2.g;
                    fileDownloadResultTracker$monitorDownload$12 = fileDownloadResultTracker$monitorDownload$1;
                    tzqVar2 = tzqVar;
                } else if (i == 1) {
                    long j4 = fileDownloadResultTracker$monitorDownload$1.J$1;
                    j2 = fileDownloadResultTracker$monitorDownload$1.J$0;
                    tzq tzqVar3 = (tzq) fileDownloadResultTracker$monitorDownload$1.L$0;
                    b.b(obj);
                    longValue = j4;
                    fileDownloadResultTracker$monitorDownload$12 = fileDownloadResultTracker$monitorDownload$1;
                    tzqVar2 = tzqVar3;
                    aVar2 = aVar;
                    str2 = "FileDownloadResultTracker";
                    th = null;
                    slsVar2 = slsVar2;
                    str = " host=";
                } else if (i == 2) {
                    long j5 = fileDownloadResultTracker$monitorDownload$1.J$1;
                    j2 = fileDownloadResultTracker$monitorDownload$1.J$0;
                    tzq tzqVar4 = (tzq) fileDownloadResultTracker$monitorDownload$1.L$0;
                    b.b(obj);
                    slsVar = slsVar2;
                    str3 = " host=";
                    longValue = j5;
                    fileDownloadResultTracker$monitorDownload$12 = fileDownloadResultTracker$monitorDownload$1;
                    str2 = "FileDownloadResultTracker";
                    aVar2 = aVar2;
                    tzqVar2 = tzqVar4;
                    slsVar2 = slsVar;
                    str = str3;
                    th = null;
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j6 = fileDownloadResultTracker$monitorDownload$1.J$1;
                    long j7 = fileDownloadResultTracker$monitorDownload$1.J$0;
                    tzq tzqVar5 = (tzq) fileDownloadResultTracker$monitorDownload$1.L$0;
                    b.b(obj);
                    slsVar = slsVar2;
                    str3 = " host=";
                    String str5 = "FileDownloadResultTracker";
                    longValue = j6;
                    j2 = j7;
                    fileDownloadResultTracker$monitorDownload$12 = fileDownloadResultTracker$monitorDownload$1;
                    tzqVar2 = tzqVar5;
                    aVar2 = aVar;
                    str2 = str5;
                    slsVar2 = slsVar;
                    str = str3;
                    th = null;
                }
                while (true) {
                    longValue2 = ((Number) slsVar2.invoke()).longValue();
                    zy11 zy11Var = zy11.a;
                    if (longValue2 < longValue) {
                        String str6 = str;
                        tzq tzqVar6 = tzqVar2;
                        a aVar3 = aVar2;
                        zwf0Var.e(str2, "Download monitoring timed out for downloadId=" + j2 + str6 + tzqVar6.b());
                        aVar3.d(new qzq(tzqVar6.b(), "monitor_timeout"));
                        return zy11Var;
                    }
                    va90 va90Var = aVar2.a;
                    va90Var.getClass();
                    Cursor query = ((DownloadManager) va90Var.a).query(new DownloadManager.Query().setFilterById(j2));
                    try {
                        Cursor cursor = query;
                        if (cursor.moveToFirst()) {
                            int i3 = cursor.getInt(cursor.getColumnIndexOrThrow(ACSPConstants.STATUS));
                            slsVar = slsVar2;
                            int columnIndex = cursor.getColumnIndex(CRLReasonCodeExtension.REASON);
                            str3 = str;
                            Integer valueOf = columnIndex == -1 ? null : Integer.valueOf(cursor.getInt(columnIndex));
                            r7m r7mVar2 = new r7m(i3, valueOf != null ? valueOf.intValue() : -1);
                            th2 = null;
                            ooc.g(query, null);
                            r7mVar = r7mVar2;
                        } else {
                            ooc.g(query, th);
                            slsVar = slsVar2;
                            str3 = str;
                            th2 = null;
                            r7mVar = null;
                        }
                        if (r7mVar != null) {
                            break;
                        }
                        str4 = str2;
                        zwf0Var.c(str4, "Download status is not available yet for downloadId=" + j2);
                        fileDownloadResultTracker$monitorDownload$12.L$0 = tzqVar2;
                        fileDownloadResultTracker$monitorDownload$12.J$0 = j2;
                        fileDownloadResultTracker$monitorDownload$12.J$1 = longValue;
                        fileDownloadResultTracker$monitorDownload$12.label = 1;
                        if (kotlinx.coroutines.a.i(j3, fileDownloadResultTracker$monitorDownload$12) == coroutineSingletons) {
                            break;
                        }
                        aVar2 = aVar;
                        str2 = str4;
                        th = th2;
                        slsVar2 = slsVar;
                        str = str3;
                    } finally {
                    }
                }
            }
        }
        fileDownloadResultTracker$monitorDownload$1 = new FileDownloadResultTracker$monitorDownload$1(aVar2, continuationImpl);
        Object obj2 = fileDownloadResultTracker$monitorDownload$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fileDownloadResultTracker$monitorDownload$1.label;
        str = " host=";
        if (i != 0) {
        }
        while (true) {
            longValue2 = ((Number) slsVar2.invoke()).longValue();
            zy11 zy11Var2 = zy11.a;
            if (longValue2 < longValue) {
            }
            aVar2 = aVar;
            str2 = str4;
            th = th2;
            slsVar2 = slsVar;
            str = str3;
        }
    }

    public final void b(long j, tzq tzqVar, int i, int i2) {
        zwf0 zwf0Var = this.b;
        if (i == 8) {
            zwf0Var.info("FileDownloadResultTracker", "Download succeeded downloadId=" + j + " fileName=" + tzqVar.a());
            d(new rzq(tzqVar.b()));
            return;
        }
        if (i == 16) {
            String a = pzq.a(i2);
            StringBuilder k = x4e.k("Download failed downloadId=", j, " fileName=", tzqVar.a());
            k.append(" reason=");
            k.append(a);
            zwf0Var.e("FileDownloadResultTracker", k.toString());
            d(new qzq(tzqVar.b(), a));
            return;
        }
        String a2 = pzq.a(i2);
        String a3 = tzqVar.a();
        StringBuilder sb = new StringBuilder("Download finished with unexpected status=");
        sb.append(i);
        sb.append(" downloadId=");
        sb.append(j);
        zwf0Var.e("FileDownloadResultTracker", g8e.r(sb, " fileName=", a3, " reason=", a2));
        d(new qzq(tzqVar.b(), a2));
    }

    public final void c(String str, String str2, String str3) {
        String str4;
        kwu kwuVar = null;
        try {
            jwu jwuVar = new jwu();
            jwuVar.i(null, str2);
            kwuVar = jwuVar.e();
        } catch (IllegalArgumentException unused) {
        }
        if (kwuVar == null || (str4 = kwuVar.d) == null) {
            str4 = "unknown";
        }
        StringBuilder v = b64.v("File download failed host=", str4, " fileName=", str3, " reason=");
        v.append(str);
        this.b.f("FileDownloadResultTracker", v.toString());
        d(new qzq(str4, str));
    }

    public final void d(szq szqVar) {
        this.c.b(szqVar);
        boolean z = szqVar instanceof qzq;
        zwf0 zwf0Var = this.b;
        if (!z) {
            if (!(szqVar instanceof rzq)) {
                w511.b();
                return;
            }
            Object obj = szqVar.b.get(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST);
            zwf0Var.info("FileDownloadResultTracker", "Sent metric event=" + szqVar.a + " host=" + obj);
            return;
        }
        Map map = szqVar.b;
        Object obj2 = map.get(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST);
        Object obj3 = map.get(CRLReasonCodeExtension.REASON);
        zwf0Var.info("FileDownloadResultTracker", "Sent metric event=" + szqVar.a + " host=" + obj2 + " reason=" + obj3);
    }

    public final void e(long j, String str, String str2) {
        kwu kwuVar;
        String str3;
        try {
            jwu jwuVar = new jwu();
            jwuVar.i(null, str);
            kwuVar = jwuVar.e();
        } catch (IllegalArgumentException unused) {
            kwuVar = null;
        }
        if (kwuVar == null || (str3 = kwuVar.d) == null) {
            str3 = "unknown";
        }
        tzq tzqVar = new tzq(str3, str2);
        this.d.getClass();
        sjh sjhVar = uyj.a;
        tje.N(this.e, mdh.b, null, new FileDownloadResultTracker$trackEnqueued$1(this, j, tzqVar, null), 2);
    }
}
