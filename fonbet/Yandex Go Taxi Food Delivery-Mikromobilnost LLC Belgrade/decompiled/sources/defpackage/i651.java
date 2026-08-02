package defpackage;

import android.content.Intent;
import android.content.res.Configuration;

/* loaded from: classes11.dex */
public interface i651 {
    String getUniqueInstanceId();

    void onActivityResult(int i, int i2, Intent intent);

    void onActivityResumeChanged(boolean z);

    void onActivityStartChanged(boolean z);

    void onConfigurationChanged(Configuration configuration);

    void onLayout();

    void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
}
