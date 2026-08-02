package xsna;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import xsna.b330;
import xsna.buk;

/* compiled from: DataUrlLoader.java */
/* loaded from: classes12.dex */
public final class yvk<Model, Data> implements b330<Model, Data> {
    public final b.a a;

    /* compiled from: DataUrlLoader.java */
    public static final class b<Model> implements c330<Model, InputStream> {
        public final a a = new a();

        /* compiled from: DataUrlLoader.java */
        public class a {
            public final ByteArrayInputStream a(String str) throws IllegalArgumentException {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int indexOf = str.indexOf(44);
                if (indexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, indexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // xsna.c330
        @NonNull
        public final b330<Model, InputStream> d(@NonNull j540 j540Var) {
            return new yvk(this.a);
        }
    }

    public yvk(b.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.b330
    public final b330.a<Data> a(@NonNull Model model, int i, int i2, @NonNull au80 au80Var) {
        return new b330.a<>(new qp70(model), new a(model.toString(), this.a));
    }

    @Override // xsna.b330
    public final boolean b(@NonNull Model model) {
        return model.toString().startsWith("data:image");
    }

    /* compiled from: DataUrlLoader.java */
    public static final class a<Data> implements buk<Data> {
        public final String b;
        public final b.a c;
        public ByteArrayInputStream d;

        public a(String str, b.a aVar) {
            this.b = str;
            this.c = aVar;
        }

        @Override // xsna.buk
        public final void a() {
            try {
                this.d.close();
            } catch (IOException unused) {
            }
        }

        @Override // xsna.buk
        @NonNull
        public final Class<Data> b() {
            return InputStream.class;
        }

        @Override // xsna.buk
        public final void d(@NonNull Priority priority, @NonNull buk.a<? super Data> aVar) {
            try {
                ByteArrayInputStream a = this.c.a(this.b);
                this.d = a;
                aVar.c(a);
            } catch (IllegalArgumentException e) {
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
