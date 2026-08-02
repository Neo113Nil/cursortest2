package yads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes10.dex */
public interface p30 extends l30 {
    long a(u30 u30Var);

    void a(v93 v93Var);

    void close();

    default Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    Uri getUri();
}
