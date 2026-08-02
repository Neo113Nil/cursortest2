package xsna;

import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.httpexecutor.api.NetworkClient;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Ref$ObjectRef;
import okhttp3.p;

/* compiled from: NetworkLoaderDelegate.kt */
/* loaded from: classes.dex */
public final class e460 {

    /* compiled from: NetworkLoaderDelegate.kt */
    /* loaded from: classes18.dex */
    public static final class a {
        public final b a;
        public final int b;
        public final String c;

        public a(b bVar, int i, String str) {
            this.a = bVar;
            this.b = i;
            this.c = str;
        }

        public final InputStream a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public final String c() {
            return this.c;
        }
    }

    /* compiled from: NetworkLoaderDelegate.kt */
    /* loaded from: classes18.dex */
    public static final class b extends InputStream {
        public final InputStream b;
        public final dr4 c;

        public b(InputStream inputStream, dr4 dr4Var) {
            this.b = inputStream;
            this.c = dr4Var;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.b.available();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.b.close();
            this.c.invoke();
        }

        @Override // java.io.InputStream
        public final void mark(int i) {
            this.b.mark(i);
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return this.b.markSupported();
        }

        @Override // java.io.InputStream
        public final int read() {
            return this.b.read();
        }

        @Override // java.io.InputStream
        public final void reset() {
            this.b.reset();
        }

        @Override // java.io.InputStream
        public final long skip(long j) {
            return this.b.skip(j);
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr) {
            return this.b.read(bArr);
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            return this.b.read(bArr, i, i2);
        }
    }

    public static a a(Uri uri) {
        if (!epx.f(uri.getScheme(), "http") && !epx.f(uri.getScheme(), HttpRequest.DEFAULT_SCHEME)) {
            throw new IllegalArgumentException(i6n0.a(uri, "Only http/https source is supported. Source: "));
        }
        p.a aVar = new p.a();
        aVar.d();
        aVar.i(uri.toString());
        okhttp3.p b2 = aVar.b();
        o260 o260Var = d260.a;
        if (o260Var == null) {
            o260Var = null;
        }
        o260Var.getClass();
        okhttp3.u execute = ((f8f0) o260Var.b(NetworkClient.ClientType.CLIENT_DEFAULT).a(b2)).execute();
        okhttp3.v m = execute.m();
        if (m != null) {
            return new a(new b(m.byteStream(), new dr4(execute, 6)), execute.o(), okhttp3.u.r("X-Frontend", execute));
        }
        throw new IllegalStateException("Expected byte-stream, received null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.io.InputStream] */
    public static f460 b(Uri uri, kbr kbrVar) {
        T t;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        try {
            a a2 = a(uri);
            int b2 = a2.b();
            if (200 > b2 || b2 >= 300) {
                throw new IllegalArgumentException(("Response not successful: code is " + a2.b() + " for " + uri).toString());
            }
            ref$ObjectRef.element = a2.a();
            long currentTimeMillis = System.currentTimeMillis();
            kbrVar.g(new ppe(ref$ObjectRef, 1));
            f460 f460Var = new f460(System.currentTimeMillis() - currentTimeMillis, a2.b(), a2.c());
            if (r5 != null) {
                try {
                    ((InputStream) t).close();
                } catch (IOException unused) {
                }
            }
            return f460Var;
        } finally {
            InputStream inputStream = (InputStream) ref$ObjectRef.element;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
    }
}
