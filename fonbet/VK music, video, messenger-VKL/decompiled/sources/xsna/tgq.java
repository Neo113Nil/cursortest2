package xsna;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* compiled from: ExtractorsFactory.java */
/* loaded from: classes12.dex */
public interface tgq {
    public static final sgq a = new sgq();

    pgq[] createExtractors();

    default pgq[] createExtractors(Uri uri, Map<String, List<String>> map) {
        return createExtractors();
    }

    default void b() {
    }

    default void a(anl anlVar) {
    }

    @Deprecated
    default void c(boolean z) {
    }
}
