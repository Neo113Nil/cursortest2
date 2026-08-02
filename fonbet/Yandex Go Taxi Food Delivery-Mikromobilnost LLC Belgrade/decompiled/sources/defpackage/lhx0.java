package defpackage;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes14.dex */
public interface lhx0 extends mhx0 {
    String b();

    @Override // defpackage.mhx0
    default Set c() {
        return Collections.singleton(b());
    }
}
