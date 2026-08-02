package defpackage;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class il0 {
    public static final il0 b = new il0("", 0);
    public final String a;

    public il0(String str, int i) {
        switch (i) {
            case 1:
                this.a = b64.d(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
                break;
            default:
                this.a = str;
                break;
        }
    }

    public static String f(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = unr0.o(str2, " [", TextUtils.join(Extension.FIX_SPACE, objArr), "]");
            }
        }
        return g8e.p(str, " : ", str2);
    }

    public void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            f(this.a, str, objArr);
        }
    }

    public void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", f(this.a, str, objArr));
        }
    }

    public void c(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", f(this.a, str, objArr), remoteException);
        }
    }

    public void d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", f(this.a, str, objArr));
        }
    }

    public void e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            f(this.a, str, objArr);
        }
    }
}
