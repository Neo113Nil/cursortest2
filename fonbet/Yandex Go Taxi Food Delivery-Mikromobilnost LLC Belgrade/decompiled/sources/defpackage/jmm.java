package defpackage;

import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes10.dex */
public interface jmm {
    static void c(jmm jmmVar, jmm jmmVar2) {
        if (jmmVar == jmmVar2) {
            return;
        }
        if (jmmVar2 != null) {
            jmmVar2.e(null);
        }
        if (jmmVar != null) {
            jmmVar.h(null);
        }
    }

    boolean a();

    rcf b();

    Map d();

    void e(mmm mmmVar);

    UUID f();

    byte[] g();

    DrmSession$DrmSessionException getError();

    int getState();

    void h(mmm mmmVar);

    boolean i(String str);
}
