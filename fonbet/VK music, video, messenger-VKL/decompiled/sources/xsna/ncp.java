package xsna;

import com.vk.im.engine.models.emails.Email;
import java.util.Collection;
import java.util.Map;

/* compiled from: EmailsStorageManager.kt */
/* loaded from: classes2.dex */
public interface ncp {
    void a(Collection<Email> collection);

    Email b(long j);

    Map<Long, Email> c(Collection<Long> collection);
}
