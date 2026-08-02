package ru.mail.libverify.n0;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import java.util.Random;
import ru.mail.verify.core.utils.FileLog;

/* loaded from: classes9.dex */
public final class a extends BroadcastReceiver {

    /* renamed from: ru.mail.libverify.n0.a$a, reason: collision with other inner class name */
    public static class C2209a {

        @NonNull
        private final Intent a;

        @NonNull
        private final Context b;
        private final boolean c;
        private long d;
        private boolean e;
        private boolean f;

        public /* synthetic */ C2209a(Context context, boolean z, int i) {
            this(context, z);
        }

        @NonNull
        public final C2209a a(@NonNull String str) {
            this.a.setAction(str);
            return this;
        }

        @NonNull
        public final C2209a b() {
            this.e = true;
            return this;
        }

        public final void c() {
            int i = 0;
            if (!this.c) {
                Context context = this.b;
                Intent intent = this.a;
                FileLog.v("AlarmBuilder", "build %s (extras: %s, shift: %s, repeat: %s, update: %s)", intent, e.a(intent.getExtras()), Boolean.valueOf(this.f), Boolean.valueOf(this.e), Boolean.TRUE);
                a.a(context, new b(i, PendingIntent.getBroadcast(this.b, 0, this.a, new ru.mail.libverify.z.a().d().c().a()), this.a.getAction()), this.d, this.f, this.e);
                return;
            }
            Context context2 = this.b;
            Intent intent2 = this.a;
            FileLog.v("AlarmBuilder", "build %s (extras: %s, shift: %s, repeat: %s, update: %s)", intent2, e.a(intent2.getExtras()), Boolean.valueOf(this.f), Boolean.valueOf(this.e), Boolean.TRUE);
            PendingIntent broadcast = PendingIntent.getBroadcast(this.b, 0, this.a, new ru.mail.libverify.z.a().d().c().a());
            String action = this.a.getAction();
            AlarmManager alarmManager = (AlarmManager) context2.getSystemService(NotificationCompat.CATEGORY_ALARM);
            if (alarmManager == null) {
                return;
            }
            if (broadcast != null) {
                alarmManager.cancel(broadcast);
            }
            FileLog.v("AlarmReceiver", "canceled alarm: %s", action);
        }

        private C2209a(@NonNull Context context, boolean z) {
            this.d = 0L;
            this.e = false;
            this.f = true;
            this.a = new Intent(context, (Class<?>) a.class);
            this.b = context;
            this.c = z;
        }

        @NonNull
        public final C2209a a(@NonNull String str, @NonNull String str2) {
            this.a.putExtra(str, str2);
            this.a.addCategory(str + StringUtils.PROCESS_POSTFIX_DELIMITER + str2);
            return this;
        }

        @NonNull
        public final C2209a a(long j) throws IllegalArgumentException {
            if (j > 0) {
                this.d = j;
                return this;
            }
            throw new IllegalArgumentException("timeout must be > 0");
        }

        @NonNull
        public final C2209a a() {
            this.f = false;
            return this;
        }
    }

    public static class b {

        @Nullable
        private final PendingIntent a;

        @Nullable
        private final String b;

        public /* synthetic */ b(int i, PendingIntent pendingIntent, String str) {
            this(pendingIntent, str);
        }

        private b(@Nullable PendingIntent pendingIntent, @Nullable String str) {
            this.a = pendingIntent;
            this.b = str;
        }
    }

    @NonNull
    public static C2209a a(@NonNull Context context, boolean z) {
        return new C2209a(context, z, 0);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NonNull Context context, @Nullable Intent intent) {
        if (intent == null) {
            return;
        }
        if (ru.mail.libverify.d0.a.e(context)) {
            FileLog.v("AlarmReceiver", "handle %s (extras: %s)", intent, e.a(intent.getExtras()));
            if (intent.getCategories() != null && !intent.getCategories().isEmpty()) {
                Intent intent2 = new Intent(intent);
                Iterator<String> it = intent.getCategories().iterator();
                while (it.hasNext()) {
                    String[] split = it.next().split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                    if (split.length == 2) {
                        intent2.putExtra(split[0], split[1]);
                    }
                }
                intent = intent2;
            }
            ru.mail.verify.core.utils.d.a(context, intent);
            return;
        }
        FileLog.d("AlarmReceiver", "An alarm received, but no libverify installation found. Next initialize will be disabled.");
        Intent intent3 = new Intent(context, (Class<?>) a.class);
        String a = e.a(intent3.getExtras());
        Boolean bool = Boolean.TRUE;
        FileLog.v("AlarmBuilder", "build %s (extras: %s, shift: %s, repeat: %s, update: %s)", intent3, a, bool, Boolean.FALSE, bool);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent3, new ru.mail.libverify.z.a().d().c().a());
        String action = intent3.getAction();
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (alarmManager == null) {
            return;
        }
        if (broadcast != null) {
            alarmManager.cancel(broadcast);
        }
        FileLog.v("AlarmReceiver", "canceled alarm: %s", action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(@NonNull Context context, @NonNull b bVar, long j, boolean z, boolean z2) {
        try {
            if (j <= 0) {
                throw new IllegalArgumentException("timeout must be > 0");
            }
            FileLog.v("AlarmReceiver", "set up alarm %s : timeout = %d, shift = %s, repeating = %s", bVar.b, Long.valueOf(j), Boolean.valueOf(z), Boolean.valueOf(z2));
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
            if (alarmManager == null) {
                return;
            }
            PendingIntent pendingIntent = bVar.a;
            if (pendingIntent != null) {
                alarmManager.cancel(pendingIntent);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (z2) {
                long nextInt = (!z || j >= 2147483647L) ? currentTimeMillis + j : new Random().nextInt((int) j) + (j / 2) + currentTimeMillis;
                PendingIntent pendingIntent2 = bVar.a;
                if (pendingIntent2 != null) {
                    alarmManager.setInexactRepeating(1, nextInt, j, pendingIntent2);
                    return;
                }
                return;
            }
            long j2 = currentTimeMillis + j;
            PendingIntent pendingIntent3 = bVar.a;
            if (pendingIntent3 != null) {
                alarmManager.set(1, j2, pendingIntent3);
            }
        } catch (Throwable th) {
            ru.mail.libverify.n0.b.a("AlarmReceiver", "error in setup an alarm logic", th);
        }
    }
}
