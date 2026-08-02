package ru.mail.libverify.d0;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executors;
import ru.mail.libverify.R;
import ru.mail.libverify.api.VerificationFactory;
import ru.mail.libverify.g0.b;
import ru.mail.libverify.g0.d;
import ru.mail.libverify.l0.c;
import ru.mail.libverify.l0.i;
import ru.mail.libverify.n0.e;
import ru.mail.verify.core.api.ApplicationModule;
import ru.mail.verify.core.api.m;
import ru.mail.verify.core.gcm.GcmProcessService;
import ru.mail.verify.core.utils.FileLog;
import xsna.yh9;

/* loaded from: classes11.dex */
public final class a {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile ApplicationModule a = null;
    private static volatile b b = null;
    private static volatile boolean c = false;
    private static volatile String d;
    private static final LinkedList<Runnable> e = new LinkedList<>();

    public static void a(@NonNull Message message) {
        b bVar = b;
        d dVar = bVar == null ? null : bVar.get();
        if (dVar != null) {
            dVar.post(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d b(@NonNull Context context) {
        if (!c) {
            synchronized (a.class) {
                try {
                    if (!c) {
                        Iterator<Runnable> it = e.iterator();
                        while (it.hasNext()) {
                            it.next().run();
                        }
                        c = true;
                    }
                } finally {
                }
            }
        }
        return c(context).get();
    }

    @NonNull
    public static b c(@NonNull Context context) {
        if (b == null) {
            synchronized (a.class) {
                try {
                    if (b == null) {
                        ApplicationModule a2 = a();
                        a2.b(context);
                        b = m.a().a(a2).a();
                    }
                } finally {
                }
            }
        }
        return b;
    }

    @NonNull
    public static String d(@NonNull Context context) {
        if (d == null) {
            synchronized (a.class) {
                try {
                    if (d == null) {
                        String string = context.getResources().getString(R.string.libverify_server_id);
                        if (TextUtils.isEmpty(string)) {
                            String a2 = e.a(context, VerificationFactory.LIBVERIFY_MANIFEST_SERVER_ID_KEY);
                            boolean a3 = a().e().a();
                            if (TextUtils.isEmpty(a2)) {
                                String pushSenderId = a().a(context).getPushSenderId();
                                if (TextUtils.isEmpty(pushSenderId)) {
                                    d = "empty";
                                    if (a3) {
                                        FileLog.e("InternalFactory", "Libverify server id must be provided ether in an application Manifest or in libverify.xml (see VerificationFactory class javadoc)");
                                    } else {
                                        FileLog.d("InternalFactory", "Libverify server id must be provided ether in an application Manifest or in libverify.xml (see VerificationFactory class javadoc)");
                                    }
                                } else {
                                    d = pushSenderId;
                                }
                            } else if (a2.startsWith("server_id:")) {
                                String substring = a2.substring(10);
                                if (TextUtils.isEmpty(substring)) {
                                    d = "empty";
                                    if (a3) {
                                        FileLog.e("InternalFactory", "Libverify server id provided in Manifest is illegal");
                                    } else {
                                        FileLog.d("InternalFactory", "Libverify server id provided in Manifest is illegal");
                                    }
                                } else {
                                    d = substring;
                                }
                            } else {
                                d = a2;
                            }
                        } else {
                            d = string;
                        }
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public static boolean e(@NonNull Context context) {
        return i.a(context) || c.a(context);
    }

    @NonNull
    public static ApplicationModule a() {
        if (a == null) {
            synchronized (a.class) {
                try {
                    if (a == null) {
                        a = new ApplicationModule();
                    }
                } finally {
                }
            }
        }
        return a;
    }

    public static void a(@NonNull Runnable runnable) {
        e.add(runnable);
    }

    public static void a(@NonNull Context context) {
        Executors.newSingleThreadExecutor().submit(new yh9(context, 17));
    }

    public static void a(@NonNull Context context, @NonNull Message message) {
        b(context).post(message);
    }

    public static void a(@NonNull Service service, @NonNull Message message) {
        b(service).a(message);
    }

    public static void a(@NonNull Context context, @Nullable String str, @NonNull Bundle bundle) {
        if (TextUtils.equals(str, d(context)) && e(context)) {
            Objects.requireNonNull(str, "");
            GcmProcessService.a(context, str, bundle);
        }
    }

    public static void a(@NonNull Context context, @Nullable String str, @NonNull Map<String, String> map) {
        if (TextUtils.equals(str, d(context)) && e(context)) {
            Objects.requireNonNull(str, "");
            GcmProcessService.a(context, str, map);
        }
    }
}
