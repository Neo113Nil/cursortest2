package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes11.dex */
public class etx0 {
    public final sol0 a;

    public etx0(Looper looper) {
        this.a = new sol0(new Handler(looper));
    }

    public etx0() {
        this(Looper.getMainLooper());
    }
}
