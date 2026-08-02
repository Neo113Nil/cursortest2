package xsna;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.vk.auth.smartflow.impl.sms.OtpSmsReceiver$receiver$1;
import xsna.o090;
import xsna.ya6;

/* compiled from: OtpSmsReceiver.kt */
/* loaded from: classes15.dex */
public final class o090 {
    public final Context a;
    public final ya6.d b;
    public final bpn0 c = new bpn0(new pr0(26));
    public final OtpSmsReceiver$receiver$1 d = new BroadcastReceiver() { // from class: com.vk.auth.smartflow.impl.sms.OtpSmsReceiver$receiver$1
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Bundle extras;
            Intent intent2;
            o090 o090Var = o090.this;
            if (!((IntentFilter) o090Var.c.getValue()).matchAction(intent.getAction()) || (extras = intent.getExtras()) == null) {
                return;
            }
            Object obj = extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
            Status status = obj instanceof Status ? (Status) obj : null;
            if (status == null || status.b != 0 || (intent2 = (Intent) extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_CONSENT_INTENT")) == null) {
                return;
            }
            o090Var.b.invoke(intent2);
        }
    };

    /* JADX WARN: Type inference failed for: r1v2, types: [com.vk.auth.smartflow.impl.sms.OtpSmsReceiver$receiver$1] */
    public o090(Context context, ya6.d dVar) {
        this.a = context;
        this.b = dVar;
    }
}
