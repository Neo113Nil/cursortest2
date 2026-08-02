package xsna;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public abstract class yq01 {
    public static final w501 a;

    static {
        Map unmodifiableMap = Collections.unmodifiableMap(new HashMap());
        if (unmodifiableMap == null) {
            throw new NullPointerException("Null splitInstallErrorCodeByModule");
        }
        a = new w501(null, unmodifiableMap);
    }

    @Nullable
    public abstract Integer a();

    public abstract Map b();
}
