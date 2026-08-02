package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.messaging.activity.c;
import kotlin.a;

/* loaded from: classes15.dex */
public abstract class mt11 {
    public static volatile Context a;
    public static final i3y b = a.a(new c());

    public static lt11 a(Activity activity) {
        a = activity.getApplicationContext();
        return (lt11) b.getValue();
    }
}
