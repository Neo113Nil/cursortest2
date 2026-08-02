package xsna;

import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import xsna.b330;
import xsna.buk;

/* compiled from: ByteArrayLoader.java */
/* loaded from: classes12.dex */
public final class qt8<Data> implements b330<byte[], Data> {
    public final b<Data> a;

    /* compiled from: ByteArrayLoader.java */
    public static class a implements c330<byte[], ByteBuffer> {

        /* compiled from: ByteArrayLoader.java */
        /* renamed from: xsna.qt8$a$a, reason: collision with other inner class name */
        public class C3572a implements b<ByteBuffer> {
            @Override // xsna.qt8.b
            public final ByteBuffer a(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }

            @Override // xsna.qt8.b
            public final Class<ByteBuffer> b() {
                return ByteBuffer.class;
            }
        }

        @Override // xsna.c330
        @NonNull
        public final b330<byte[], ByteBuffer> d(@NonNull j540 j540Var) {
            return new qt8(new C3572a());
        }
    }

    /* compiled from: ByteArrayLoader.java */
    public interface b<Data> {
        Data a(byte[] bArr);

        Class<Data> b();
    }

    /* compiled from: ByteArrayLoader.java */
    public static class d implements c330<byte[], InputStream> {

        /* compiled from: ByteArrayLoader.java */
        public class a implements b<InputStream> {
            @Override // xsna.qt8.b
            public final InputStream a(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }

            @Override // xsna.qt8.b
            public final Class<InputStream> b() {
                return InputStream.class;
            }
        }

        @Override // xsna.c330
        @NonNull
        public final b330<byte[], InputStream> d(@NonNull j540 j540Var) {
            return new qt8(new a());
        }
    }

    public qt8(b<Data> bVar) {
        this.a = bVar;
    }

    @Override // xsna.b330
    public final b330.a a(@NonNull byte[] bArr, int i, int i2, @NonNull au80 au80Var) {
        byte[] bArr2 = bArr;
        return new b330.a(new qp70(bArr2), new c(bArr2, this.a));
    }

    @Override // xsna.b330
    public final /* bridge */ /* synthetic */ boolean b(@NonNull byte[] bArr) {
        return true;
    }

    /* compiled from: ByteArrayLoader.java */
    public static class c<Data> implements buk<Data> {
        public final byte[] b;
        public final b<Data> c;

        public c(byte[] bArr, b<Data> bVar) {
            this.b = bArr;
            this.c = bVar;
        }

        @Override // xsna.buk
        @NonNull
        public final Class<Data> b() {
            return this.c.b();
        }

        @Override // xsna.buk
        public final void d(@NonNull Priority priority, @NonNull buk.a<? super Data> aVar) {
            aVar.c(this.c.a(this.b));
        }

        @Override // xsna.buk
        @NonNull
        public final DataSource e() {
            return DataSource.LOCAL;
        }

        @Override // xsna.buk
        public final void a() {
        }

        @Override // xsna.buk
        public final void cancel() {
        }
    }
}
