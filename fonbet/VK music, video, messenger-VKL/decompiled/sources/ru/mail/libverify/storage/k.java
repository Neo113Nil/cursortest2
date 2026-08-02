package ru.mail.libverify.storage;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;
import ru.mail.libverify.g0.p;
import ru.mail.libverify.platform.storage.KeyValueStorage;
import ru.mail.libverify.sms.IncomingSmsReceiver;
import ru.mail.libverify.utils.SystemRestartReceiver;
import ru.mail.verify.core.utils.FileLog;

/* loaded from: classes9.dex */
public final class k extends p {
    private static final HashMap<String, Boolean> c;

    @NonNull
    private final Context b;

    static {
        HashMap<String, Boolean> hashMap = new HashMap<>();
        c = hashMap;
        Boolean bool = Boolean.TRUE;
        hashMap.put("instance_broadcast_on_demand", bool);
        Boolean bool2 = Boolean.FALSE;
        hashMap.put("instance_intercept_sms", bool2);
        hashMap.put("instance_single_fetcher", bool);
        hashMap.put("instance_safety_net", bool);
        hashMap.put("instance_account_check_sms", bool2);
        hashMap.put("instance_track_package", bool2);
        hashMap.put("instance_send_call_stats", bool);
        hashMap.put("instance_update_alarms", bool);
        hashMap.put("instance_background_verify", bool);
        hashMap.put("instance_write_history", bool);
        hashMap.put("instance_add_shortcut", bool2);
    }

    public k(@NonNull KeyValueStorage keyValueStorage, @NonNull Context context) {
        super(keyValueStorage);
        this.b = context;
    }

    @Override // ru.mail.libverify.g0.p
    @NonNull
    public final HashMap a() {
        return c;
    }

    public final void b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Boolean> entry : c.entrySet()) {
            String key = entry.getKey();
            boolean a = a(entry.getKey());
            a(key, a);
            hashMap.put(key, Boolean.valueOf(a));
        }
        FileLog.v("VerifyFeatures", "current features:\n %s", hashMap);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // ru.mail.libverify.g0.p
    public final void a(@NonNull String str, boolean z) {
        char c2;
        str.getClass();
        switch (str.hashCode()) {
            case -1121254165:
                if (str.equals("instance_send_call_stats")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -873606646:
                if (str.equals("instance_write_history")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -867566589:
                if (str.equals("instance_broadcast_on_demand")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -565591910:
                if (str.equals("instance_safety_net")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 179899982:
                if (str.equals("instance_update_alarms")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 682306778:
                if (str.equals("instance_single_fetcher")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 849252136:
                if (str.equals("instance_track_package")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 1102840704:
                if (str.equals("instance_background_verify")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 1271208498:
                if (str.equals("instance_intercept_sms")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 1880219878:
                if (str.equals("instance_account_check_sms")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 1967155598:
                if (str.equals("instance_add_shortcut")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
            case 1:
            case 3:
            case 5:
            case 6:
            case 7:
            case '\t':
            case '\n':
                return;
            case 2:
                if (z) {
                    c.a(this.b, this);
                    return;
                } else {
                    c.a(this.b, this, -1);
                    return;
                }
            case 4:
                if (z) {
                    if (a("instance_broadcast_on_demand")) {
                        c.a(this.b, SystemRestartReceiver.class, 32);
                        return;
                    }
                    return;
                } else {
                    if (a("instance_broadcast_on_demand")) {
                        c.a(this.b, SystemRestartReceiver.class);
                        return;
                    }
                    return;
                }
            case '\b':
                if (z) {
                    if (a("instance_broadcast_on_demand")) {
                        c.a(this.b, IncomingSmsReceiver.class, 4);
                        return;
                    }
                    return;
                } else {
                    if (a("instance_broadcast_on_demand")) {
                        c.a(this.b, IncomingSmsReceiver.class);
                        return;
                    }
                    return;
                }
            default:
                FileLog.e("VerifyFeatures", "Illegal feature %s in processing", str);
                throw new IllegalArgumentException("Illegal feature in processing");
        }
    }
}
