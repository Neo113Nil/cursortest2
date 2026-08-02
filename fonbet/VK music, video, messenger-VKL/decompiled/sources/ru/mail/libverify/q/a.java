package ru.mail.libverify.q;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import java.util.HashMap;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;

/* loaded from: classes9.dex */
public final class a implements b {
    private final Context a;

    public a(@NonNull Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // ru.mail.libverify.q.b
    public final void a(@NonNull HashMap hashMap) {
        try {
            PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0);
            hashMap.put("app_id", this.a.getPackageName());
            hashMap.put("app_build", Integer.valueOf(packageInfo.versionCode));
            hashMap.put(CallAnalyticsApiRequest.KEY_APP_VERSION, packageInfo.versionName);
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }
}
