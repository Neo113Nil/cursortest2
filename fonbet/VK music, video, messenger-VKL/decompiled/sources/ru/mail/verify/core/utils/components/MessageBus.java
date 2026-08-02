package ru.mail.verify.core.utils.components;

import android.os.Message;
import androidx.annotation.NonNull;
import java.util.Collection;
import ru.mail.libverify.p0.a;
import ru.mail.libverify.p0.f;

/* loaded from: classes9.dex */
public interface MessageBus {
    void post(@NonNull Message message);

    void register(@NonNull Collection<a> collection, @NonNull f fVar);
}
