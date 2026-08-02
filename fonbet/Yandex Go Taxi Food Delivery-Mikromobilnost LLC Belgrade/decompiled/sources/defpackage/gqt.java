package defpackage;

import android.content.Intent;
import android.view.View;

/* loaded from: classes5.dex */
public interface gqt {
    View getPlatformView();

    void processActivityResult(int i, int i2, Intent intent);

    boolean processOnBackPressed();

    void processOnNewIntent(Intent intent);

    void processPermissionsResult(int i, String[] strArr, int[] iArr);
}
