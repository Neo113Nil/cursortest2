package yads;

import io.appmetrica.analytics.IReporter;
import java.util.Map;
import kotlin.Lazy;

/* loaded from: classes10.dex */
public final class gh implements jp2 {
    public final zg a;
    public final Lazy b;

    public gh(Lazy lazy, zg zgVar) {
        this.a = zgVar;
        this.b = lazy;
    }

    @Override // yads.jp2
    public final void a(fp2 fp2Var) {
        if (this.a.a()) {
            try {
                ((IReporter) this.b.getValue()).reportEvent(fp2Var.a, fp2Var.b);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // yads.jp2
    public final void reportAnr(Map map) {
        if (this.a.a()) {
            try {
                ((IReporter) this.b.getValue()).reportAnr(map);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // yads.sm0
    public final void reportError(String str, Throwable th) {
        if (this.a.a()) {
            try {
                ((IReporter) this.b.getValue()).reportError(str, th);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // yads.jp2
    public final void reportUnhandledException(Throwable th) {
        if (this.a.a()) {
            try {
                ((IReporter) this.b.getValue()).reportUnhandledException(th);
            } catch (Throwable unused) {
            }
        }
    }
}
