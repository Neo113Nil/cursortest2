package ru.mail.libverify.api;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import ru.mail.libverify.InternalApi;

@InternalApi
/* loaded from: classes9.dex */
public class b {
    public static boolean a(@NonNull Context context) throws Exception {
        return !((AccessibilityManager) context.getSystemService("accessibility")).getEnabledAccessibilityServiceList(-1).isEmpty();
    }
}
