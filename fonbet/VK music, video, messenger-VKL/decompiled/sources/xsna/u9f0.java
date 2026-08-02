package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: RecentsDao.kt */
/* loaded from: classes5.dex */
public interface u9f0 {
    void a(ArrayList arrayList);

    void b();

    default void c(ArrayList arrayList) {
        b();
        a(arrayList);
    }

    List<f4l0> i();
}
