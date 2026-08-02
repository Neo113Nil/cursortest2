package com.yandex.passport.internal.flags.experiments;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes8.dex */
public final class k {
    public final SharedPreferences a;

    public k(Context context) {
        this.a = context.getSharedPreferences("experiments_overrides", 0);
    }
}
