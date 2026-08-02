package xsna;

import android.content.Context;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes.dex */
public abstract class kqz0 {

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class a {
        public static final boolean a;
        public static final boolean b;

        static {
            boolean z;
            try {
                Class.forName(qfy0.class.getName());
                z = true;
            } catch (Throwable unused) {
                gu8.c(null, "ExoPlayer doesn't exist, add ExoPlayer dependency to play video");
                z = false;
            }
            a = z;
            b = true;
        }
    }

    public static loy0 a(Context context, boolean z) {
        if (z) {
            try {
                if (a.a) {
                    return new qfy0(context);
                }
            } catch (Throwable th) {
                gu8.e(null, "MediaUtils error: exception occurred while creating ExoVideoPlayer: " + th.getMessage());
            }
        }
        return pfy0.a(context);
    }
}
