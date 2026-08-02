package xsna;

import androidx.annotation.Nullable;
import com.vk.lists.c;

/* compiled from: PaginationUtils.java */
/* loaded from: classes17.dex */
public final class ze90 {
    public static <T> c.h a(int i, od90<T> od90Var, @Nullable nd90<T> nd90Var, @Nullable io.reactivex.rxjava3.disposables.b bVar) {
        na90 na90Var = new na90(i, od90Var, nd90Var, bVar);
        if (i == 0) {
            return new c.h((c.l) na90Var);
        }
        if (i == 1) {
            return new c.h((c.m) na90Var);
        }
        throw new IllegalStateException(lhg.a(i, "Not supported pagination type: "));
    }
}
