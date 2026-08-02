package xsna;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: DaggerTransportRuntimeComponent.java */
/* loaded from: classes.dex */
public final class dsk implements Closeable {
    public e9e0<Executor> b;
    public p6x c;
    public e9e0 d;
    public w8h0 e;
    public e9e0<String> f;
    public e9e0<oyg0> g;
    public e9e0<zop0> h;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.g.get().close();
    }
}
