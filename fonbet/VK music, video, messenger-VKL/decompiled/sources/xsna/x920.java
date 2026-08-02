package xsna;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;

/* compiled from: MessageInflater.kt */
/* loaded from: classes8.dex */
public final class x920 implements Closeable {
    public final boolean b;
    public final vl8 c;
    public final Inflater d;
    public final evw e;

    public x920(boolean z) {
        this.b = z;
        vl8 vl8Var = new vl8();
        this.c = vl8Var;
        Inflater inflater = new Inflater(true);
        this.d = inflater;
        this.e = new evw(vl8Var, inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.e.close();
    }
}
