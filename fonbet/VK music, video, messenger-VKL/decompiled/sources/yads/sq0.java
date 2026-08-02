package yads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes10.dex */
public interface sq0 {
    nq0[] createExtractors();

    default nq0[] createExtractors(Uri uri, Map map) {
        return createExtractors();
    }
}
