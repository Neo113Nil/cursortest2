package xsna;

import kotlin.Result;
import org.json.JSONObject;

/* compiled from: ImRevalidateCanWriteConfig.kt */
/* loaded from: classes2.dex */
public final class vbw {
    public static final a b = new a();
    public static final vbw c = new vbw(0);
    public final long a;

    /* compiled from: ImRevalidateCanWriteConfig.kt */
    public static final class a {
        public static vbw a(String str) {
            Object failure;
            try {
                failure = drm0.N(str) ? vbw.c : new vbw(new JSONObject(str).optLong("window_ms", 0L));
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
            Throwable a = Result.a(failure);
            if (a != null) {
                bVar.a(a);
            }
            if (Result.a(failure) != null) {
                vbw.b.getClass();
                failure = vbw.c;
            }
            return (vbw) failure;
        }
    }

    public vbw(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vbw) && this.a == ((vbw) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return vu5.a(')', this.a, new StringBuilder("ImRevalidateCanWriteConfig(windowMs="));
    }
}
