package ru.mail.libverify.fetcher;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import ru.mail.verify.core.utils.FileLog;

/* loaded from: classes9.dex */
public final class a {
    public static void a(@NonNull Context context) {
        if (FetcherJobService.a(context)) {
            return;
        }
        int i = FetcherService.a;
        FileLog.d("FetcherService", "fetcher start requested");
        Intent intent = new Intent(context, (Class<?>) FetcherService.class);
        intent.setAction("fetcher_start");
        try {
            context.startService(intent);
        } catch (Throwable th) {
            FileLog.e("FetcherService", "failed to start fetcher service", th);
        }
    }

    public static void b(@NonNull Context context) {
        if (FetcherJobService.b(context)) {
            return;
        }
        int i = FetcherService.a;
        FileLog.d("FetcherService", "fetcher stop requested");
        Intent intent = new Intent(context, (Class<?>) FetcherService.class);
        intent.setAction("fetcher_stop");
        try {
            context.startService(intent);
        } catch (Throwable th) {
            FileLog.e("FetcherService", "failed to stop fetcher service", th);
        }
    }
}
