package xsna;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: SynchronizedCaptureSessionOpener.java */
/* loaded from: classes11.dex */
public final class zon0 {

    @NonNull
    public final xon0 a;

    /* compiled from: SynchronizedCaptureSessionOpener.java */
    public static class a {
        public final tli0 a;
        public final mtu b;
        public final Handler c;
        public final hs9 d;
        public final HashSet e;

        public a(@NonNull tli0 tli0Var, @NonNull mtu mtuVar, @NonNull Handler handler, @NonNull hs9 hs9Var, int i) {
            HashSet hashSet = new HashSet();
            this.e = hashSet;
            this.a = tli0Var;
            this.b = mtuVar;
            this.c = handler;
            this.d = hs9Var;
            if (i == 2) {
                hashSet.add("deferrableSurface_close");
            }
            if (i == 2) {
                hashSet.add("wait_for_request");
            }
        }

        @NonNull
        public final zon0 a() {
            HashSet hashSet = this.e;
            if (hashSet.isEmpty()) {
                return new zon0(new xon0(this.d, this.a, this.b, this.c));
            }
            return new zon0(new yon0(hashSet, this.d, this.a, this.b, this.c));
        }
    }

    /* compiled from: SynchronizedCaptureSessionOpener.java */
    public interface b {
        @NonNull
        ugz a(@NonNull ArrayList arrayList);

        @NonNull
        ugz<Void> f(@NonNull CameraDevice cameraDevice, @NonNull zsi0 zsi0Var);

        boolean stop();
    }

    public zon0(@NonNull xon0 xon0Var) {
        this.a = xon0Var;
    }
}
