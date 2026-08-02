package defpackage;

import android.util.Log;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* loaded from: classes.dex */
public final class bkg0 implements j0r {
    public static final Charset c = Charset.forName("UTF-8");
    public final File a;
    public akg0 b;

    public bkg0(File file) {
        this.a = file;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003b  */
    @Override // defpackage.j0r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] a() {
        rv4 rv4Var;
        if (this.a.exists()) {
            b();
            akg0 akg0Var = this.b;
            if (akg0Var != null) {
                int[] iArr = {0};
                byte[] bArr = new byte[akg0Var.B()];
                try {
                    this.b.d(new e6w(bArr, iArr));
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e);
                }
                rv4Var = new rv4(bArr, iArr[0]);
                if (rv4Var != null) {
                    return null;
                }
                int i = rv4Var.a;
                byte[] bArr2 = new byte[i];
                System.arraycopy(rv4Var.b, 0, bArr2, 0, i);
                return bArr2;
            }
        }
        rv4Var = null;
        if (rv4Var != null) {
        }
    }

    public final void b() {
        File file = this.a;
        if (this.b == null) {
            try {
                this.b = new akg0(file);
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e);
            }
        }
    }

    @Override // defpackage.j0r
    public final void c() {
        f();
        this.a.delete();
    }

    @Override // defpackage.j0r
    public final void e(long j, String str) {
        b();
        if (this.b == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > 16384) {
                str = "...".concat(str.substring(str.length() - 16384));
            }
            this.b.a(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(c));
            while (!this.b.e() && this.b.B() > 65536) {
                this.b.o();
            }
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e);
        }
    }

    @Override // defpackage.j0r
    public final void f() {
        CommonUtils.b(this.b, "There was a problem closing the Crashlytics log file.");
        this.b = null;
    }

    @Override // defpackage.j0r
    public final String g() {
        byte[] a = a();
        if (a != null) {
            return new String(a, c);
        }
        return null;
    }
}
