package yads;

import android.media.MediaDrmResetException;
import androidx.annotation.Nullable;

/* loaded from: classes10.dex */
public abstract class wk0 {
    public static boolean a(@Nullable Throwable th) {
        return th instanceof MediaDrmResetException;
    }
}
