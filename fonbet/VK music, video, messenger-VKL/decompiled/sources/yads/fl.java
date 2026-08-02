package yads;

import xsna.cgn;
import xsna.odj;

/* loaded from: classes10.dex */
public final class fl extends Exception {
    public final int b;
    public final boolean c;
    public final nx0 d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fl(int i, int i2, int i3, int i4, nx0 nx0Var, boolean z, RuntimeException runtimeException) {
        super(r5.toString(), runtimeException);
        StringBuilder a = odj.a(i, i2, "AudioTrack init failed ", " Config(", ", ");
        cgn.a(i3, i4, ", ", ")", a);
        a.append(z ? " (recoverable)" : "");
        this.b = i;
        this.c = z;
        this.d = nx0Var;
    }
}
