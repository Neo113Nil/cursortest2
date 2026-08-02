package xsna;

import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import xsna.b330;
import xsna.buk;

/* compiled from: ByteBufferFileLoader.java */
/* loaded from: classes12.dex */
public final class au8 implements b330<File, ByteBuffer> {

    /* compiled from: ByteBufferFileLoader.java */
    public static class b implements c330<File, ByteBuffer> {
        @Override // xsna.c330
        @NonNull
        public final b330<File, ByteBuffer> d(@NonNull j540 j540Var) {
            return new au8();
        }
    }

    @Override // xsna.b330
    public final b330.a<ByteBuffer> a(@NonNull File file, int i, int i2, @NonNull au80 au80Var) {
        File file2 = file;
        return new b330.a<>(new qp70(file2), new a(file2));
    }

    @Override // xsna.b330
    public final /* bridge */ /* synthetic */ boolean b(@NonNull File file) {
        return true;
    }

    /* compiled from: ByteBufferFileLoader.java */
    public static final class a implements buk<ByteBuffer> {
        public final File b;

        public a(File file) {
            this.b = file;
        }

        @Override // xsna.buk
        @NonNull
        public final Class<ByteBuffer> b() {
            return ByteBuffer.class;
        }

        @Override // xsna.buk
        public final void d(@NonNull Priority priority, @NonNull buk.a<? super ByteBuffer> aVar) {
            try {
                aVar.c(du8.a(this.b));
            } catch (IOException e) {
                aVar.f(e);
            }
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
