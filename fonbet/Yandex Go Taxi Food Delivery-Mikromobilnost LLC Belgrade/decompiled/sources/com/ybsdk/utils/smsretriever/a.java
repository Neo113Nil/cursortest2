package com.ybsdk.utils.smsretriever;

import android.content.Context;
import com.google.android.gms.common.b;
import com.google.android.gms.tasks.zzw;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.vendor.huawei.sms.HuaweiSmsRetriever;
import defpackage.bvf0;
import defpackage.e491;
import defpackage.i5z0;
import defpackage.iws;
import defpackage.la5;
import defpackage.mm2;
import defpackage.owt;
import defpackage.qir;
import defpackage.sst;
import defpackage.xen;
import java.util.regex.Pattern;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class a {
    public static final Pattern g = Pattern.compile("(\\d+)");
    public final Context a;
    public final boolean b;
    public final AppAnalyticsReporter c;
    public final la5 d;
    public final SmsRetrieverReceiver e;
    public final r0 f;

    public a(Context context, AppAnalyticsReporter appAnalyticsReporter, boolean z) {
        this.a = context;
        this.b = z;
        this.c = appAnalyticsReporter;
        la5 a = a();
        this.d = a;
        this.e = new SmsRetrieverReceiver(a, new SmsRetrieverHelper$smsRetrieverReceiver$1(1, this, a.class, "processMessage", "processMessage(Ljava/lang/String;)V", 0));
        this.f = bvf0.c(null);
    }

    public final la5 a() {
        AppAnalyticsReporter appAnalyticsReporter = this.c;
        boolean z = this.b;
        Context context = this.a;
        try {
            owt owtVar = new owt(context, appAnalyticsReporter, z);
            if (com.google.android.gms.common.a.d.d(context, b.a) == 0) {
                if (!owtVar.e()) {
                    owtVar = null;
                }
                if (owtVar != null) {
                    return owtVar;
                }
                return null;
            }
        } catch (Throwable unused) {
            i5z0.a.g("Failed to instantiate GoogleSmsRetriever", new Object[0]);
        }
        try {
            HuaweiSmsRetriever huaweiSmsRetriever = new HuaweiSmsRetriever(context, z, appAnalyticsReporter);
            if (huaweiSmsRetriever.isAvailable()) {
                return (la5) huaweiSmsRetriever.getIfApiAvailableOrNull();
            }
        } catch (Throwable unused2) {
            i5z0.a.g("Failed to instantiate GoogleSmsRetriever", new Object[0]);
        }
        return null;
    }

    public final void b() {
        la5 la5Var = this.d;
        if (la5Var != null) {
            zzw e = new e491(((owt) la5Var).c, null, e491.k, mm2.V0, sst.c).e();
            e.d(new qir(12));
            e.f(new xen(21, new iws(6)));
        }
    }
}
