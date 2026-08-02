package yads;

import android.system.ErrnoException;
import android.system.OsConstants;
import androidx.annotation.Nullable;

/* loaded from: classes10.dex */
public abstract class av0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean a(@Nullable Throwable th) {
        return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
    }
}
