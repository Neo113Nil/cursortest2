package xsna;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.util.IllegalFormatException;
import java.util.Locale;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes.dex */
public final class lq01 {
    public final String a;

    public lq01(String str) {
        this.a = sl9.c(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
    }

    public static String f(String str, String str2, @Nullable Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = fw3.c(str2, " [", TextUtils.join(", ", objArr), X3.j.e);
            }
        }
        return pzl.b(str, " : ", str2);
    }

    public final void a(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            f(this.a, str, objArr);
        }
    }

    public final void b(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", f(this.a, str, objArr));
        }
    }

    public final void c(RemoteException remoteException, String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", f(this.a, str, objArr), remoteException);
        }
    }

    public final void d(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            f(this.a, str, objArr);
        }
    }

    public final void e(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            f(this.a, str, objArr);
        }
    }
}
