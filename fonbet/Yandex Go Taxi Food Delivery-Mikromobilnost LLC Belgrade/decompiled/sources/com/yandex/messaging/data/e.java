package com.yandex.messaging.data;

import android.content.SharedPreferences;
import defpackage.rol0;
import defpackage.tpr;

/* loaded from: classes15.dex */
public final class e {
    public final SharedPreferences a;

    public e(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public final Long a() {
        long j = this.a.getLong("user_current_org_id", -1L);
        if (j >= 0) {
            return Long.valueOf(j);
        }
        return null;
    }

    public final tpr b() {
        return kotlinx.coroutines.flow.e.t(new rol0(new SdkPreferenceStore$getCurrentOrganizationFlow$1(this, null)));
    }

    public final long c() {
        return this.a.getLong("user_current_org_id", 0L);
    }
}
