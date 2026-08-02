package yads;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes10.dex */
public final class pl3 extends Lambda implements gzs {
    public static final pl3 b = new pl3();

    public pl3() {
        super(0);
    }

    @Override // xsna.gzs
    public final Object invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
