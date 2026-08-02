package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: FavoritesDao.kt */
/* loaded from: classes5.dex */
public interface ftq {
    void a(ArrayList arrayList);

    void b();

    default void c(ArrayList arrayList) {
        b();
        a(arrayList);
    }

    List<atq> d();
}
