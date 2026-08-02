package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes10.dex */
public interface kpg extends apg {
    void addTransferListener(cj01 cj01Var);

    void close();

    default Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    Uri getUri();

    long open(npg npgVar);
}
