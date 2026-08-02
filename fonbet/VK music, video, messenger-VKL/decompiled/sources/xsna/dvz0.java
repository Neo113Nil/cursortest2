package xsna;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.regex.Matcher;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.1.0 */
/* loaded from: classes.dex */
public final class dvz0 extends com.google.android.gms.internal.cloudmessaging.zzf {
    public final /* synthetic */ upg0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvz0(upg0 upg0Var, Looper looper) {
        super(looper);
        this.a = upg0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        upg0 upg0Var = this.a;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new i701());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof com.google.android.gms.cloudmessaging.zze) {
                        upg0Var.g = (com.google.android.gms.cloudmessaging.zze) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        upg0Var.f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!dz5.M(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        "Unexpected response action: ".concat(String.valueOf(action));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = upg0.j.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            "Unexpected response string: ".concat(stringExtra);
                            return;
                        }
                        return;
                    }
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    if (group != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                        upg0Var.b(group, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras()));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    "Received InstanceID error ".concat(stringExtra2);
                }
                if (!stringExtra2.startsWith(HiAnalyticsConstant.REPORT_VAL_SEPARATOR)) {
                    synchronized (upg0Var.a) {
                        int i = 0;
                        while (true) {
                            try {
                                dpj0 dpj0Var = upg0Var.a;
                                if (i < dpj0Var.d) {
                                    upg0Var.b((String) dpj0Var.f(i), intent2.getExtras());
                                    i++;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                String[] split = stringExtra2.split("\\|");
                if (split.length <= 2 || !dz5.M(split[1], "ID")) {
                    "Unexpected structured response ".concat(stringExtra2);
                    return;
                }
                String str = split[2];
                String str2 = split[3];
                if (str2.startsWith(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
                    str2 = str2.substring(1);
                }
                upg0Var.b(str, intent2.putExtra("error", str2).getExtras());
            }
        }
    }
}
