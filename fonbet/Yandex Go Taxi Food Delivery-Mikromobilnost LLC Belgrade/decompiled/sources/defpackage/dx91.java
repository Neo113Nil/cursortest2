package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes11.dex */
public final class dx91 {
    public static final dx91 b;
    public static final dx91 c;
    public final Throwable a;

    static {
        if (zfb1.w) {
            c = null;
            b = null;
        } else {
            c = new dx91(null);
            b = new dx91(null);
        }
    }

    public dx91(CancellationException cancellationException) {
        this.a = cancellationException;
    }
}
