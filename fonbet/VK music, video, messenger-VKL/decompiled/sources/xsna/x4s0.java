package xsna;

import android.os.Build;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: VideoBackgroundServiceConnection.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class x4s0 extends FunctionReferenceImpl implements gzs<Boolean> {
    @Override // xsna.gzs
    public final Boolean invoke() {
        boolean z;
        w4s0 w4s0Var = (w4s0) this.receiver;
        w4s0Var.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            c63 c63Var = c63.a;
            if (!c63.f && w4s0Var.e() == null) {
                z = false;
                return Boolean.valueOf(z);
            }
        }
        z = true;
        return Boolean.valueOf(z);
    }
}
