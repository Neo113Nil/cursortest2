package defpackage;

import android.os.Trace;
import androidx.camera.camera2.internal.l;
import androidx.camera.core.impl.CameraInternal$State;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class ht7 {
    public final StringBuilder a = new StringBuilder();
    public final Object b;
    public int c;
    public final jm7 d;
    public final HashMap e;
    public int f;

    public ht7(jm7 jm7Var) {
        Object obj = new Object();
        this.b = obj;
        this.e = new HashMap();
        this.c = 1;
        synchronized (obj) {
            this.d = jm7Var;
            this.f = this.c;
        }
    }

    public static void c(l lVar, CameraInternal$State cameraInternal$State) {
        if (jzz0.a()) {
            Trace.setCounter(ffx.f0("CX:State[" + lVar + "]"), cameraInternal$State.ordinal());
        }
    }

    public final ft7 a(String str) {
        HashMap hashMap = this.e;
        for (co7 co7Var : hashMap.keySet()) {
            if (str.equals(co7Var.c().c())) {
                return (ft7) hashMap.get(co7Var);
            }
        }
        return null;
    }

    public final void b() {
        boolean g = sgb1.g(3, "CameraStateRegistry");
        StringBuilder sb = this.a;
        if (g) {
            sb.setLength(0);
            sb.append("Recalculating open cameras:\n");
            sb.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            sb.append("-------------------------------------------------------------------\n");
        }
        int i = 0;
        for (Map.Entry entry : this.e.entrySet()) {
            if (sgb1.g(3, "CameraStateRegistry")) {
                sb.append(String.format(Locale.US, "%-45s%-22s\n", ((co7) entry.getKey()).toString(), ((ft7) entry.getValue()).a != null ? ((ft7) entry.getValue()).a.toString() : "UNKNOWN"));
            }
            CameraInternal$State cameraInternal$State = ((ft7) entry.getValue()).a;
            if (cameraInternal$State != null && cameraInternal$State.a()) {
                i++;
            }
        }
        if (sgb1.g(3, "CameraStateRegistry")) {
            sb.append("-------------------------------------------------------------------\n");
            Locale locale = Locale.US;
            sb.append(b64.d(i, this.c, "Open count: ", " (Max allowed: ", Extension.C_BRAKE));
            sgb1.g(3, "CameraStateRegistry");
        }
        this.f = Math.max(this.c - i, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008d A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:4:0x0007, B:6:0x001f, B:8:0x002e, B:11:0x003a, B:13:0x0068, B:15:0x006c, B:17:0x0070, B:23:0x0085, B:25:0x008d, B:28:0x0098, B:31:0x00a6, B:32:0x00a9, B:37:0x007e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:4:0x0007, B:6:0x001f, B:8:0x002e, B:11:0x003a, B:13:0x0068, B:15:0x006c, B:17:0x0070, B:23:0x0085, B:25:0x008d, B:28:0x0098, B:31:0x00a6, B:32:0x00a9, B:37:0x007e), top: B:3:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(l lVar) {
        boolean z;
        synchronized (this.b) {
            try {
                ft7 ft7Var = (ft7) this.e.get(lVar);
                d6z.v(ft7Var, "Camera must first be registered with registerCamera()");
                z = true;
                if (sgb1.g(3, "CameraStateRegistry")) {
                    this.a.setLength(0);
                    StringBuilder sb = this.a;
                    Locale locale = Locale.US;
                    int i = this.f;
                    CameraInternal$State cameraInternal$State = ft7Var.a;
                    boolean z2 = cameraInternal$State != null && cameraInternal$State.a();
                    sb.append("tryOpenCamera(" + lVar + ") [Available Cameras: " + i + ", Already Open: " + z2 + " (Previous state: " + ft7Var.a + ")]");
                }
                if (this.f <= 0) {
                    CameraInternal$State cameraInternal$State2 = ft7Var.a;
                    if (!(cameraInternal$State2 != null && cameraInternal$State2.a())) {
                        z = false;
                        if (sgb1.g(3, "CameraStateRegistry")) {
                            StringBuilder sb2 = this.a;
                            Locale locale2 = Locale.US;
                            sb2.append(" --> ".concat(z ? "SUCCESS" : "FAIL"));
                            sgb1.g(3, "CameraStateRegistry");
                        }
                        if (z) {
                            b();
                        }
                    }
                }
                CameraInternal$State cameraInternal$State3 = CameraInternal$State.OPENING;
                ft7Var.a = cameraInternal$State3;
                c(lVar, cameraInternal$State3);
                if (sgb1.g(3, "CameraStateRegistry")) {
                }
                if (z) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0051 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(String str, String str2) {
        boolean z;
        boolean z2;
        synchronized (this.b) {
            try {
                boolean z3 = true;
                if (this.d.b() != 2) {
                    return true;
                }
                ft7 a = a(str);
                CameraInternal$State cameraInternal$State = a != null ? a.a : null;
                ft7 a2 = str2 != null ? a(str2) : null;
                CameraInternal$State cameraInternal$State2 = a2 != null ? a2.a : null;
                CameraInternal$State cameraInternal$State3 = CameraInternal$State.OPEN;
                if (!cameraInternal$State3.equals(cameraInternal$State) && !CameraInternal$State.CONFIGURED.equals(cameraInternal$State)) {
                    z = false;
                    if (!cameraInternal$State3.equals(cameraInternal$State2) && !CameraInternal$State.CONFIGURED.equals(cameraInternal$State2)) {
                        z2 = false;
                        if (z || !z2) {
                            z3 = false;
                        }
                        return z3;
                    }
                    z2 = true;
                    if (z) {
                    }
                    z3 = false;
                    return z3;
                }
                z = true;
                if (!cameraInternal$State3.equals(cameraInternal$State2)) {
                    z2 = false;
                    if (z) {
                    }
                    z3 = false;
                    return z3;
                }
                z2 = true;
                if (z) {
                }
                z3 = false;
                return z3;
            } finally {
            }
        }
    }
}
