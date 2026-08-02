package defpackage;

import android.graphics.Path;
import androidx.compose.ui.graphics.Path$Direction;

/* loaded from: classes10.dex */
public abstract class nb2 {
    public static final jb2 a() {
        return new jb2(0);
    }

    public static final Path.Direction b(Path$Direction path$Direction) {
        int i = mb2.a[path$Direction.ordinal()];
        if (i == 1) {
            return Path.Direction.CCW;
        }
        if (i == 2) {
            return Path.Direction.CW;
        }
        w511.b();
        return null;
    }

    public static final void c(String str) {
        throw new IllegalStateException(str);
    }
}
