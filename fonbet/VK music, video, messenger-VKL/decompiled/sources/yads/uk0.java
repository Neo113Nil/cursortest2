package yads;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;
import androidx.annotation.Nullable;

/* loaded from: classes10.dex */
public abstract class uk0 {
    public static boolean a(@Nullable Throwable th) {
        return th instanceof DeniedByServerException;
    }

    public static boolean b(@Nullable Throwable th) {
        return th instanceof NotProvisionedException;
    }
}
