package defpackage;

import android.content.Context;
import com.yandex.messaging.sdk.b;
import kotlin.a;

/* loaded from: classes8.dex */
public abstract class onp0 {
    public static volatile Context a;
    public static final i3y b = a.a(new b());

    public static enp0 a(Context context) {
        a = context.getApplicationContext();
        return (enp0) b.getValue();
    }
}
