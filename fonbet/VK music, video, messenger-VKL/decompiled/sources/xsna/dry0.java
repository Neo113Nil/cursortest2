package xsna;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: HttpStream.java */
/* loaded from: classes8.dex */
public interface dry0 {
    OutputStream a();

    void a(long j);

    InputStream b();

    void b(long j);

    default boolean d() {
        return !e();
    }

    boolean e();
}
