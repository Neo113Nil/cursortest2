package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public interface muw {
    ro00 a();

    default List b() {
        return Collections.singletonList(a());
    }
}
