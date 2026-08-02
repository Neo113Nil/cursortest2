package ru.mail.libverify.l0;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.HashSet;
import ru.mail.verify.core.utils.network.NetworkStateReceiver;

/* loaded from: classes9.dex */
public final class b {
    private static final HashSet<Object> a = new HashSet<>();

    public static void a(@NonNull Context context, @NonNull Object obj, int i) {
        if (i == 0) {
            return;
        }
        synchronized (b.class) {
            if ((i & 1) == 1) {
                try {
                    HashSet<Object> hashSet = a;
                    if (hashSet.add(obj) && hashSet.size() == 1) {
                        NetworkStateReceiver.d(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void a(@NonNull Context context, @NonNull Object obj) {
        synchronized (b.class) {
            try {
                HashSet<Object> hashSet = a;
                if (hashSet.remove(obj) && hashSet.isEmpty()) {
                    NetworkStateReceiver.c(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
