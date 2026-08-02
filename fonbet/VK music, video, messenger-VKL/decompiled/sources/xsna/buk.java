package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

/* compiled from: DataFetcher.java */
/* loaded from: classes12.dex */
public interface buk<T> {

    /* compiled from: DataFetcher.java */
    public interface a<T> {
        void c(@Nullable T t);

        void f(@NonNull Exception exc);
    }

    void a();

    @NonNull
    Class<T> b();

    void cancel();

    void d(@NonNull Priority priority, @NonNull a<? super T> aVar);

    @NonNull
    DataSource e();
}
