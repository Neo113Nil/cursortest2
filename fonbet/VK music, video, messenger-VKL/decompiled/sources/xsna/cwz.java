package xsna;

import android.content.ContentResolver;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import xsna.buk;

/* compiled from: LocalUriFetcher.java */
/* loaded from: classes12.dex */
public abstract class cwz<T> implements buk<T> {
    public final Uri b;
    public final ContentResolver c;
    public T d;

    public cwz(ContentResolver contentResolver, Uri uri) {
        this.c = contentResolver;
        this.b = uri;
    }

    @Override // xsna.buk
    public final void a() {
        T t = this.d;
        if (t != null) {
            try {
                c(t);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void c(T t) throws IOException;

    /* JADX WARN: Type inference failed for: r2v3, types: [T, java.lang.Object] */
    @Override // xsna.buk
    public final void d(@NonNull Priority priority, @NonNull buk.a<? super T> aVar) {
        try {
            ?? r2 = (T) f(this.c, this.b);
            this.d = r2;
            aVar.c(r2);
        } catch (FileNotFoundException e) {
            aVar.f(e);
        }
    }

    @Override // xsna.buk
    @NonNull
    public final DataSource e() {
        return DataSource.LOCAL;
    }

    public abstract Object f(ContentResolver contentResolver, Uri uri) throws FileNotFoundException;

    @Override // xsna.buk
    public final void cancel() {
    }
}
