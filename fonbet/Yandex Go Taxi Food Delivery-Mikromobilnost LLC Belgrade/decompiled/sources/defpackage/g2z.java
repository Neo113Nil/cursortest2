package defpackage;

import android.content.SharedPreferences;
import com.ybsdk.feature.persistence.api.StorageType;

/* loaded from: classes9.dex */
public final class g2z {
    public final SharedPreferences a;

    public g2z(a1b0 a1b0Var) {
        this.a = ((c1b0) a1b0Var).a(StorageType.LOCAL_CONFIG);
    }
}
