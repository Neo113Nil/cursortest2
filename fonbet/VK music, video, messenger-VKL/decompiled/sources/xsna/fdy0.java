package xsna;

import java.security.SecureRandom;
import java.util.List;
import one.video.calls.sdk_private.f;

/* compiled from: ServerHello.java */
/* loaded from: classes8.dex */
public final class fdy0 extends bdy0 {
    public static final byte[] e = {-49, 33, -83, 116, -27, -102, 97, 17, -66, 29, -116, 2, 30, 101, -72, -111, -62, -94, 17, 22, 122, -69, -116, 94, 7, -98, 9, -30, -56, -88, 51, -100};
    public byte[] a;
    public byte[] b;
    public f.b c;
    public List<pt50> d;

    static {
        new SecureRandom();
    }

    @Override // xsna.bdy0
    public final f.d c() {
        return f.d.server_hello;
    }

    @Override // xsna.bdy0
    public final byte[] d() {
        return this.a;
    }
}
