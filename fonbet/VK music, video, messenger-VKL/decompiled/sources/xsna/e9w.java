package xsna;

import com.vk.im.log.LogLevel;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ImLoggerFactory.kt */
/* loaded from: classes.dex */
public final class e9w {
    public static final AtomicReference<LogLevel> a = new AtomicReference<>(LogLevel.VERBOSE);

    public static final f9w a(Class cls) {
        return b(cls.getSimpleName());
    }

    public static final f9w b(String str) {
        return new f9w(str, a);
    }
}
