package xsna;

import android.content.res.Resources;

/* compiled from: ResourcesExt.kt */
/* loaded from: classes.dex */
public final class gbg0 {
    public static final int a(Resources resources, float f) {
        return Math.round(f * resources.getDisplayMetrics().density);
    }

    public static final String b(Resources resources, int i) {
        try {
            return resources.getResourceEntryName(i);
        } catch (Resources.NotFoundException unused) {
            return "";
        }
    }
}
