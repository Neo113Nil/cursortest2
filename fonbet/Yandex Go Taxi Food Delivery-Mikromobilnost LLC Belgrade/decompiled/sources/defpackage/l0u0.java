package defpackage;

import android.content.Context;
import android.content.Intent;
import com.yandex.messaging.ui.auth.AuthorizeActivity;

/* loaded from: classes15.dex */
public final class l0u0 extends x40 {
    @Override // defpackage.x40
    public final Intent a(Context context, Object obj) {
        b64.D(obj);
        new Intent(context, (Class<?>) AuthorizeActivity.class);
        throw null;
    }

    @Override // defpackage.x40
    public final Object c(int i, Intent intent) {
        return Integer.valueOf(i);
    }
}
