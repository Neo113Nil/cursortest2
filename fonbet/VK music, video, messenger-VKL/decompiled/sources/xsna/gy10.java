package xsna;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: MediaSessionManager.java */
/* loaded from: classes12.dex */
public final class gy10 {
    public hy10 a;

    public gy10(@NonNull String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        hy10 hy10Var = new hy10(str, i, i2);
        new MediaSessionManager.RemoteUserInfo(str, i, i2);
        this.a = hy10Var;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gy10) {
            return this.a.equals(((gy10) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
