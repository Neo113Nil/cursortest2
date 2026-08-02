package xsna;

import com.vk.im.engine.models.EngineInvalidateSource;
import com.vk.im.engine.models.credentials.UserCredentials;
import java.util.concurrent.Future;

/* compiled from: ImEngineLifecycleControllerImpl.kt */
/* loaded from: classes.dex */
public final class s1w implements r1w {
    public final a1w a;

    public s1w(a1w a1wVar) {
        this.a = a1wVar;
    }

    @Override // xsna.r1w
    public final void a(UserCredentials userCredentials, EngineInvalidateSource engineInvalidateSource) {
        this.a.f(userCredentials, engineInvalidateSource);
    }

    @Override // xsna.r1w
    public final void b() {
        this.a.y();
    }

    @Override // xsna.r1w
    public final Future<?> c(boolean z) {
        return this.a.v(z);
    }

    @Override // xsna.r1w
    public final void d(whc whcVar) {
        this.a.g(whcVar);
    }

    @Override // xsna.r1w
    public final void e(zwi zwiVar, EngineInvalidateSource engineInvalidateSource) {
        this.a.e(zwiVar, engineInvalidateSource);
    }
}
