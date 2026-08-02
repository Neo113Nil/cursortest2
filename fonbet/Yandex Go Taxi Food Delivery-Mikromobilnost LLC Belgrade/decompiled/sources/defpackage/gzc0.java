package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.fonts.Font;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureTarget;
import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class gzc0 {
    public static /* synthetic */ Font.Builder h(Font font) {
        return new Font.Builder(font);
    }

    public static /* synthetic */ ScrollCaptureTarget m(AndroidComposeView androidComposeView, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(androidComposeView, rect, point, scrollCaptureCallback);
    }
}
