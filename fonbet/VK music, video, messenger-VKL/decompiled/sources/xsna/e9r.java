package xsna;

import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import xsna.b330;
import xsna.buk;

/* compiled from: FileLoader.java */
/* loaded from: classes12.dex */
public final class e9r<Data> implements b330<File, Data> {
    public final d<Data> a;

    /* compiled from: FileLoader.java */
    public static class a<Data> implements c330<File, Data> {
        public final d<Data> a;

        public a(d<Data> dVar) {
            this.a = dVar;
        }

        @Override // xsna.c330
        @NonNull
        public final b330<File, Data> d(@NonNull j540 j540Var) {
            return new e9r(this.a);
        }
    }

    /* compiled from: FileLoader.java */
    public static class b extends a<ParcelFileDescriptor> {
    }

    /* compiled from: FileLoader.java */
    public interface d<Data> {
        void a(Data data) throws IOException;

        Class<Data> b();

        Data c(File file) throws FileNotFoundException;
    }

    /* compiled from: FileLoader.java */
    public static class e extends a<InputStream> {
    }

    public e9r(d<Data> dVar) {
        this.a = dVar;
    }

    @Override // xsna.b330
    public final b330.a a(@NonNull File file, int i, int i2, @NonNull au80 au80Var) {
        File file2 = file;
        return new b330.a(new qp70(file2), new c(file2, this.a));
    }

    @Override // xsna.b330
    public final /* bridge */ /* synthetic */ boolean b(@NonNull File file) {
        return true;
    }

    /* compiled from: FileLoader.java */
    public static final class c<Data> implements buk<Data> {
        public final File b;
        public final d<Data> c;
        public Data d;

        public c(File file, d<Data> dVar) {
            this.b = file;
            this.c = dVar;
        }

        @Override // xsna.buk
        public final void a() {
            Data data = this.d;
            if (data != null) {
                try {
                    this.c.a(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // xsna.buk
        @NonNull
        public final Class<Data> b() {
            return this.c.b();
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [Data, java.lang.Object] */
        @Override // xsna.buk
        public final void d(@NonNull Priority priority, @NonNull buk.a<? super Data> aVar) {
            try {
                Data c = this.c.c(this.b);
                this.d = c;
                aVar.c(c);
            } catch (FileNotFoundException e) {
                aVar.f(e);
            }
        }

        @Override // xsna.buk
        @NonNull
        public final DataSource e() {
            return DataSource.LOCAL;
        }

        @Override // xsna.buk
        public final void cancel() {
        }
    }
}
