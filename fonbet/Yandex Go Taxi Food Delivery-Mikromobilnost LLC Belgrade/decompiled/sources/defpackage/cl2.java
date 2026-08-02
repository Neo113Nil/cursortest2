package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes12.dex */
public final class cl2 {
    public final al2 a;
    public Thread b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicLong d = new AtomicLong(0);
    public final Handler e = new Handler(Looper.getMainLooper());
    public String f = "";

    public cl2(al2 al2Var) {
        this.a = al2Var;
    }
}
