package xsna;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: DataSource.java */
/* loaded from: classes12.dex */
public interface zuk<T> {
    boolean a();

    Throwable b();

    boolean c();

    boolean close();

    void d(vvk<T> vvkVar, Executor executor);

    Map<String, Object> getExtras();

    float getProgress();

    T getResult();
}
