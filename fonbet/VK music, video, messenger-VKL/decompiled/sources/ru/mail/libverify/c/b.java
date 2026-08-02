package ru.mail.libverify.c;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutorService;
import ru.mail.libverify.InternalApi;
import ru.mail.libverify.platform.storage.KeyValueStorage;
import ru.mail.libverify.u.w;
import ru.mail.verify.core.utils.components.MessageBus;

@InternalApi
/* loaded from: classes9.dex */
public interface b {
    @NonNull
    MessageBus a();

    @NonNull
    ru.mail.libverify.p0.b b();

    @NonNull
    KeyValueStorage c();

    @NonNull
    ExecutorService d();

    @NonNull
    w e();
}
