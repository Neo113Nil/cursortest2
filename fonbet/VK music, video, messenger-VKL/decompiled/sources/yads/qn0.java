package yads;

import android.os.SystemClock;
import android.text.TextUtils;
import xsna.pzl;

/* loaded from: classes10.dex */
public final class qn0 extends cf2 {
    public final int d;
    public final String e;
    public final int f;
    public final nx0 g;
    public final int h;
    public final sn1 i;
    public final boolean j;

    public qn0(int i, Throwable th, int i2, int i3) {
        this(a(i, null, null, -1, null, 4), th, i2, i, null, -1, null, 4, null, SystemClock.elapsedRealtime(), false);
    }

    public static String a(int i, String str, String str2, int i2, nx0 nx0Var, int i3) {
        String str3;
        String str4;
        if (i == 0) {
            str3 = "Source error";
        } else if (i != 1) {
            str3 = i != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(" error, index=");
            sb.append(i2);
            sb.append(", format=");
            sb.append(nx0Var);
            sb.append(", format_supported=");
            int i4 = mc3.a;
            if (i3 == 0) {
                str4 = "NO";
            } else if (i3 == 1) {
                str4 = "NO_UNSUPPORTED_TYPE";
            } else if (i3 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i3 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i3 != 4) {
                    throw new IllegalStateException();
                }
                str4 = "YES";
            }
            sb.append(str4);
            str3 = sb.toString();
        }
        return !TextUtils.isEmpty(str) ? pzl.b(str3, ": ", str) : str3;
    }

    public qn0(String str, Throwable th, int i, int i2, String str2, int i3, nx0 nx0Var, int i4, zn1 zn1Var, long j, boolean z) {
        super(str, th, i, j);
        ni.a(!z || i2 == 1);
        ni.a(th != null || i2 == 3);
        this.d = i2;
        this.e = str2;
        this.f = i3;
        this.g = nx0Var;
        this.h = i4;
        this.i = zn1Var;
        this.j = z;
    }
}
