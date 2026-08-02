package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes9.dex */
public final class bqd0 {
    public final SharedPreferences a;

    public bqd0(Context context) {
        this.a = context.getSharedPreferences("ru.yandex.taxi.plus.sdk.servertime.delta", 0);
    }
}
