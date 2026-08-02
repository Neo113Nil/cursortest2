package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
public final class oy40 {
    public static final oy40 b = new oy40();
    public static final ny40 c = new ny40();
    public final AtomicReference a = new AtomicReference();

    public static oy40 b() {
        return b;
    }

    public final ny40 a() {
        ny40 ny40Var = (ny40) this.a.get();
        return ny40Var == null ? c : ny40Var;
    }
}
