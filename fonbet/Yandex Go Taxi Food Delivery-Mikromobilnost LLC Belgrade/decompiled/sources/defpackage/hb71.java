package defpackage;

import android.system.ErrnoException;
import android.system.OsConstants;

/* loaded from: classes7.dex */
public abstract class hb71 {
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Throwable th) {
        return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
    }
}
