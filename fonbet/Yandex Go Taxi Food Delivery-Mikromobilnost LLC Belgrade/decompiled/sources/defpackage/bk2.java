package defpackage;

import android.content.ContentResolver;
import android.provider.Settings;

/* loaded from: classes11.dex */
public class bk2 {
    public static float a(ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
}
