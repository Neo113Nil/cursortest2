package ru.mail.libverify.g0;

import android.os.Message;
import androidx.annotation.NonNull;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes9.dex */
public interface d {
    void a();

    void a(@NonNull Message message);

    void a(@NonNull ru.mail.libverify.api.q qVar);

    @NonNull
    ru.mail.libverify.p0.b b();

    @NonNull
    ThreadPoolExecutor d();

    void post(@NonNull Message message);

    void reset();
}
