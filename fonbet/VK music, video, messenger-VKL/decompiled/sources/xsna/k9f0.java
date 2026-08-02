package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: RecentGifsDao.kt */
/* loaded from: classes2.dex */
public interface k9f0 {
    void a(ArrayList arrayList);

    void b();

    default void c(ArrayList arrayList) {
        b();
        a(arrayList);
    }

    List<j9f0> getAll();
}
