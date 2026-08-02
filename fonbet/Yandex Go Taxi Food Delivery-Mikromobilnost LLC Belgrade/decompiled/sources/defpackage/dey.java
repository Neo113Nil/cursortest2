package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.b;

/* loaded from: classes11.dex */
public interface dey {
    void addCallback(String str, b bVar);

    b getCallbackOrNull(String str, Class cls);

    Activity getLifecycleActivity();

    void startActivityForResult(Intent intent, int i);
}
