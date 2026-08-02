package xsna;

import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import xsna.buk;

/* compiled from: AssetPathFetcher.java */
/* loaded from: classes12.dex */
public abstract class ax3<T> implements buk<T> {
    public final String b;
    public final AssetManager c;
    public T d;

    public ax3(AssetManager assetManager, String str) {
        this.c = assetManager;
        this.b = str;
    }

    @Override // xsna.buk
    public final void a() {
        T t = this.d;
        if (t == null) {
            return;
        }
        try {
            c(t);
        } catch (IOException unused) {
        }
    }

    public abstract void c(T t) throws IOException;

    @Override // xsna.buk
    public final void d(@NonNull Priority priority, @NonNull buk.a<? super T> aVar) {
        try {
            T f = f(this.c, this.b);
            this.d = f;
            aVar.c(f);
        } catch (IOException e) {
            aVar.f(e);
        }
    }

    @Override // xsna.buk
    @NonNull
    public final DataSource e() {
        return DataSource.LOCAL;
    }

    public abstract T f(AssetManager assetManager, String str) throws IOException;

    @Override // xsna.buk
    public final void cancel() {
    }
}
