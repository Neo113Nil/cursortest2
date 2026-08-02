package xsna;

import com.vk.im.engine.models.EngineInvalidateSource;
import com.vk.im.engine.models.credentials.UserCredentials;
import java.util.concurrent.Future;

/* compiled from: ImEngineLifecycleController.kt */
/* loaded from: classes.dex */
public interface r1w {
    void a(UserCredentials userCredentials, EngineInvalidateSource engineInvalidateSource);

    void b();

    Future<?> c(boolean z);

    void d(whc whcVar);

    void e(zwi zwiVar, EngineInvalidateSource engineInvalidateSource);
}
