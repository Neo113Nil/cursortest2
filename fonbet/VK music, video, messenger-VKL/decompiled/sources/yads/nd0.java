package yads;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class nd0 {
    public final md0 a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public nd0(md0 md0Var) {
        this.a = md0Var;
    }

    public final nq0 a(Object... objArr) {
        Constructor a;
        synchronized (this.b) {
            if (!this.b.get()) {
                try {
                    a = this.a.a();
                } catch (ClassNotFoundException unused) {
                    this.b.set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            a = null;
        }
        if (a == null) {
            return null;
        }
        try {
            return (nq0) a.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }
}
