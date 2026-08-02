package xsna;

import android.os.Looper;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: SafeHandlerProvider.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class jzg0 extends FunctionReferenceImpl implements gzs<Looper> {
    public static final jzg0 b = new jzg0(0, Looper.class, "getMainLooper", "getMainLooper()Landroid/os/Looper;", 0);

    @Override // xsna.gzs
    public final Looper invoke() {
        return Looper.getMainLooper();
    }
}
