package defpackage;

import androidx.camera.core.impl.SessionConfig$SessionError;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class eyq0 implements fyq0 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final fyq0 b;

    public eyq0(fyq0 fyq0Var) {
        this.b = fyq0Var;
    }

    @Override // defpackage.fyq0
    public final void a(jyq0 jyq0Var, SessionConfig$SessionError sessionConfig$SessionError) {
        if (this.a.get()) {
            return;
        }
        this.b.a(jyq0Var, sessionConfig$SessionError);
    }

    public final void b() {
        this.a.set(true);
    }
}
