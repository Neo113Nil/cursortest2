package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.a;

/* loaded from: classes9.dex */
public final class ei11 {
    public final SharedPreferences a;
    public volatile eid b;

    public ei11(Context context) {
        this.a = context.getSharedPreferences("trusted_ssl_certificates", 0);
    }

    public final eid a() {
        eid eidVar = this.b;
        if (eidVar != null) {
            return eidVar;
        }
        boolean z = this.a.getBoolean(BackendConfig.Restrictions.ENABLED, false);
        Set<String> stringSet = this.a.getStringSet("certificates", EmptySet.a);
        eid eidVar2 = new eid(z, stringSet != null ? a.J0(stringSet) : EmptyList.a);
        if (this.b == null) {
            this.b = eidVar2;
        }
        eid eidVar3 = this.b;
        return eidVar3 == null ? eidVar2 : eidVar3;
    }
}
