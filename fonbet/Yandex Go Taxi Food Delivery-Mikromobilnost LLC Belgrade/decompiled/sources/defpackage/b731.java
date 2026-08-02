package defpackage;

import android.content.Context;
import android.util.Size;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes10.dex */
public interface b731 {
    default List e() {
        return Collections.EMPTY_LIST;
    }

    default List g() {
        return Collections.EMPTY_LIST;
    }

    default boolean h(String str, LinkedHashMap linkedHashMap) {
        return false;
    }

    default boolean j() {
        return false;
    }

    default void l(ar7 ar7Var) {
    }

    default Size[] n() {
        return new Size[0];
    }

    default List o() {
        return Collections.EMPTY_LIST;
    }

    default m0r0 p(Context context) {
        return null;
    }

    default boolean r() {
        c94 c94Var = c94.z;
        if (a3c.a(c94Var) || azo.e(c94Var)) {
            return false;
        }
        return !g().isEmpty();
    }

    default boolean s() {
        return false;
    }
}
