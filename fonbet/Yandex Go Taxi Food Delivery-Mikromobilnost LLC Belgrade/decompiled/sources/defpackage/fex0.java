package defpackage;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes14.dex */
public interface fex0 {
    String b();

    default Set c() {
        return Collections.singleton(b());
    }
}
