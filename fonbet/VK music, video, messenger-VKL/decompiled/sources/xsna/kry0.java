package xsna;

import java.io.IOException;
import java.io.PushbackInputStream;
import java.io.UncheckedIOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.function.Function;
import one.video.calls.sdk_private.b0;

/* compiled from: CapsuleProtocolStreamImpl.java */
/* loaded from: classes8.dex */
public final class kry0 {
    public b0.a a;
    public HashMap b;
    public PushbackInputStream c;

    public final uqy0 a() throws IOException {
        PushbackInputStream pushbackInputStream = this.c;
        long k = alk.k(pushbackInputStream);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        pushbackInputStream.unread(allocate.array(), 0, alk.g(k, allocate));
        HashMap hashMap = this.b;
        if (hashMap.containsKey(Long.valueOf(k))) {
            try {
                return (uqy0) ((Function) hashMap.get(Long.valueOf(k))).apply(pushbackInputStream);
            } catch (UncheckedIOException e) {
                throw e.getCause();
            }
        }
        long k2 = alk.k(pushbackInputStream);
        int k3 = (int) alk.k(pushbackInputStream);
        this.a.c.read(new byte[k3]);
        zqy0 zqy0Var = new zqy0();
        zqy0Var.a = k2;
        zqy0Var.b = k3;
        return zqy0Var;
    }
}
