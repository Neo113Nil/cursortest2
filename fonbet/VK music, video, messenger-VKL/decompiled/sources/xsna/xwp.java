package xsna;

import android.os.RemoteException;
import androidx.health.platform.client.error.ErrorStatus;
import java.io.IOException;
import kotlin.Pair;

/* compiled from: ErrorStatusConverter.kt */
/* loaded from: classes12.dex */
public final class xwp {
    public static final Object a = pn00.k(new Pair(1, fpf0.a(UnsupportedOperationException.class)), new Pair(2, fpf0.a(UnsupportedOperationException.class)), new Pair(3, fpf0.a(UnsupportedOperationException.class)), new Pair(4, fpf0.a(SecurityException.class)), new Pair(10000, fpf0.a(SecurityException.class)), new Pair(10001, fpf0.a(SecurityException.class)), new Pair(10002, fpf0.a(IllegalArgumentException.class)), new Pair(Integer.valueOf(yup.PERMISSION_NOT_DECLARED), fpf0.a(SecurityException.class)), new Pair(Integer.valueOf(yup.INVALID_PERMISSION_RATIONALE_DECLARATION), fpf0.a(SecurityException.class)), new Pair(Integer.valueOf(yup.INVALID_UID), fpf0.a(RemoteException.class)), new Pair(Integer.valueOf(yup.DATABASE_ERROR), fpf0.a(IOException.class)), new Pair(Integer.valueOf(yup.INTERNAL_ERROR), fpf0.a(RemoteException.class)), new Pair(Integer.valueOf(yup.CHANGES_TOKEN_OUTDATED), fpf0.a(RemoteException.class)), new Pair(Integer.valueOf(yup.TRANSACTION_TOO_LARGE), fpf0.a(RemoteException.class)));

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public static final Exception a(ErrorStatus errorStatus) {
        String str = errorStatus.d;
        dcy dcyVar = (dcy) a.get(Integer.valueOf(errorStatus.c));
        return dcyVar != null ? dcyVar.equals(fpf0.a(SecurityException.class)) ? new SecurityException(str) : dcyVar.equals(fpf0.a(RemoteException.class)) ? new RemoteException(str) : dcyVar.equals(fpf0.a(IllegalArgumentException.class)) ? new IllegalArgumentException(str) : dcyVar.equals(fpf0.a(IOException.class)) ? new IOException(str) : new UnsupportedOperationException(str) : new UnsupportedOperationException(str);
    }
}
