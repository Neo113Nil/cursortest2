package defpackage;

import android.view.Surface;

/* loaded from: classes7.dex */
public abstract class fm61 {
    public static void a(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            nba1.c("VideoFrameReleaseHelper", nba1.b("Failed to call Surface.setFrameRate", e));
        }
    }
}
