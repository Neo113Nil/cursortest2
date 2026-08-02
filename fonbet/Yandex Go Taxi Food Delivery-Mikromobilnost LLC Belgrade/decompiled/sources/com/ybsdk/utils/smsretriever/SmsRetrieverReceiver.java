package com.ybsdk.utils.smsretriever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import defpackage.e5z0;
import defpackage.g0t0;
import defpackage.i5z0;
import defpackage.la5;
import defpackage.owt;
import defpackage.tls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/utils/smsretriever/SmsRetrieverReceiver;", "Landroid/content/BroadcastReceiver;", "Lla5;", "baseSmsRetriever", "Lkotlin/Function1;", "", "Lzy11;", "onSmsMessageReceived", "<init>", "(Lla5;Ltls;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lla5;", "Ltls;", "Companion", "g0t0", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SmsRetrieverReceiver extends BroadcastReceiver {
    public static final g0t0 Companion = new g0t0();
    private static final String TAG = "SmsRetrieverReceiver";
    private final la5 baseSmsRetriever;
    private final tls onSmsMessageReceived;

    public SmsRetrieverReceiver(la5 la5Var, tls tlsVar) {
        this.baseSmsRetriever = la5Var;
        this.onSmsMessageReceived = tlsVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.baseSmsRetriever == null) {
            e5z0 e5z0Var = i5z0.a;
            e5z0Var.m(TAG);
            e5z0Var.a("smsRetrieverMethod is null", new Object[0]);
            return;
        }
        e5z0 e5z0Var2 = i5z0.a;
        e5z0Var2.m(TAG);
        e5z0Var2.a("onReceive", new Object[0]);
        this.baseSmsRetriever.getClass();
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                e5z0Var2.m(TAG);
                e5z0Var2.a("Extras are null in received SMS", new Object[0]);
                return;
            }
            ((owt) this.baseSmsRetriever).getClass();
            Status status = (Status) extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
            Integer valueOf = status != null ? Integer.valueOf(status.getStatusCode()) : null;
            this.baseSmsRetriever.getClass();
            if (valueOf != null && valueOf.intValue() == 0) {
                this.baseSmsRetriever.getClass();
                String string = extras.getString("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                if (string != null) {
                    this.onSmsMessageReceived.invoke(string);
                    return;
                } else {
                    e5z0Var2.m(TAG);
                    e5z0Var2.a("Message is null", new Object[0]);
                    return;
                }
            }
            this.baseSmsRetriever.getClass();
            if (valueOf != null && valueOf.intValue() == 15) {
                e5z0Var2.m(TAG);
                e5z0Var2.a("Timeout waiting sms", new Object[0]);
            } else if (valueOf == null) {
                e5z0Var2.m(TAG);
                e5z0Var2.a("Extras status code not found in extras", new Object[0]);
            }
        }
    }
}
