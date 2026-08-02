package ru.mail.libverify.storage;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.HashSet;
import ru.mail.libverify.api.VerificationFactory;
import ru.mail.libverify.platform.core.IPlatformUtils;
import ru.mail.libverify.sms.IncomingCallReceiver;
import ru.mail.libverify.sms.IncomingSmsReceiver;
import ru.mail.libverify.utils.BatteryLevelReceiver;
import ru.mail.libverify.utils.SystemRestartReceiver;
import ru.mail.verify.core.utils.network.NetworkStateReceiver;

/* loaded from: classes9.dex */
public final class c {
    private static final HashSet<Object> a = new HashSet<>();
    private static final HashSet<Object> b = new HashSet<>();
    private static final HashSet<Object> c = new HashSet<>();
    private static final HashSet<Object> d = new HashSet<>();
    private static final HashSet<Object> e = new HashSet<>();

    public static void a(@NonNull Context context, @NonNull Object obj, int i) {
        IPlatformUtils utils = VerificationFactory.getPlatformService(context).getUtils();
        if (utils == null || i == 0) {
            return;
        }
        synchronized (c.class) {
            if ((i & 1) == 1) {
                try {
                    HashSet<Object> hashSet = b;
                    if (hashSet.add(obj) && hashSet.size() == 1) {
                        utils.enableReceiver(context, IncomingCallReceiver.class);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if ((i & 4) == 4) {
                HashSet<Object> hashSet2 = c;
                if (hashSet2.add(obj) && hashSet2.size() == 1) {
                    utils.enableReceiver(context, IncomingSmsReceiver.class);
                }
            }
            if ((i & 8) == 8) {
                HashSet<Object> hashSet3 = a;
                if (hashSet3.add(obj) && hashSet3.size() == 1) {
                    NetworkStateReceiver.d(context);
                }
            }
            if ((i & 16) == 16) {
                HashSet<Object> hashSet4 = d;
                if (hashSet4.add(obj) && hashSet4.size() == 1) {
                    utils.enableReceiver(context, BatteryLevelReceiver.class);
                }
            }
            if ((i & 32) == 32) {
                HashSet<Object> hashSet5 = e;
                if (hashSet5.add(obj) && hashSet5.size() == 1) {
                    utils.enableReceiver(context, SystemRestartReceiver.class);
                }
            }
        }
    }

    public static void a(@NonNull Context context, @NonNull Object obj) {
        synchronized (c.class) {
            try {
                IPlatformUtils utils = VerificationFactory.getPlatformService(context).getUtils();
                if (utils == null) {
                    return;
                }
                HashSet<Object> hashSet = b;
                if (hashSet.remove(obj) && hashSet.isEmpty()) {
                    utils.disableReceiver(context, IncomingCallReceiver.class);
                }
                HashSet<Object> hashSet2 = c;
                if (hashSet2.remove(obj) && hashSet2.isEmpty()) {
                    utils.disableReceiver(context, IncomingSmsReceiver.class);
                }
                HashSet<Object> hashSet3 = d;
                if (hashSet3.remove(obj) && hashSet3.isEmpty()) {
                    utils.disableReceiver(context, BatteryLevelReceiver.class);
                }
                HashSet<Object> hashSet4 = a;
                if (hashSet4.remove(obj) && hashSet4.isEmpty()) {
                    NetworkStateReceiver.c(context);
                }
                HashSet<Object> hashSet5 = e;
                if (hashSet5.remove(obj) && hashSet5.isEmpty()) {
                    utils.disableReceiver(context, SystemRestartReceiver.class);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
