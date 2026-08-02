package defpackage;

import android.content.SharedPreferences;
import com.squareup.moshi.Moshi;
import com.ybsdk.di.modules.g;
import com.ybsdk.feature.persistence.api.StorageType;

/* loaded from: classes3.dex */
public final class cab0 {
    public final Moshi a;
    public final SharedPreferences b;
    public final /* synthetic */ g c;

    public cab0(Moshi moshi, a1b0 a1b0Var, g gVar, int i) {
        switch (i) {
            case 1:
                this.c = gVar;
                this.a = moshi;
                this.b = ((c1b0) a1b0Var).a(StorageType.SAVINGS_DASHBOARD_V4);
                break;
            default:
                this.c = gVar;
                this.a = moshi;
                this.b = ((c1b0) a1b0Var).a(StorageType.PFM_SETTINGS);
                break;
        }
    }
}
