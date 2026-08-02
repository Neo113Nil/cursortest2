package xsna;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* compiled from: TrackGroup.java */
/* loaded from: classes12.dex */
public final class pfp0 {
    public final int a;
    public final String b;
    public final int c;
    public final androidx.media3.common.a[] d;
    public int e;

    static {
        y2r0.L(0);
        y2r0.L(1);
    }

    public pfp0(String str, androidx.media3.common.a... aVarArr) {
        fxc0.p(aVarArr.length > 0);
        this.b = str;
        this.d = aVarArr;
        this.a = aVarArr.length;
        String str2 = aVarArr[0].n;
        this.c = TextUtils.isEmpty(str2) ? io20.i(aVarArr[0].m) : io20.i(str2);
        String str3 = aVarArr[0].d;
        str3 = (str3 == null || str3.equals(C.LANGUAGE_UNDETERMINED)) ? "" : str3;
        int i = aVarArr[0].f | 16384;
        for (int i2 = 1; i2 < aVarArr.length; i2++) {
            String str4 = aVarArr[i2].d;
            if (!str3.equals((str4 == null || str4.equals(C.LANGUAGE_UNDETERMINED)) ? "" : str4)) {
                b(i2, "languages", aVarArr[0].d, aVarArr[i2].d);
                return;
            } else {
                if (i != (aVarArr[i2].f | 16384)) {
                    b(i2, "role flags", Integer.toBinaryString(aVarArr[0].f), Integer.toBinaryString(aVarArr[i2].f));
                    return;
                }
            }
        }
    }

    public static void b(int i, String str, @Nullable String str2, @Nullable String str3) {
        StringBuilder a = xe9.a("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        a.append(str3);
        a.append("' (track ");
        a.append(i);
        a.append(")");
        ahn.o("TrackGroup", "", new IllegalStateException(a.toString()));
    }

    public final int a(androidx.media3.common.a aVar) {
        int i = 0;
        while (true) {
            androidx.media3.common.a[] aVarArr = this.d;
            if (i >= aVarArr.length) {
                return -1;
            }
            if (aVar == aVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pfp0.class == obj.getClass()) {
            pfp0 pfp0Var = (pfp0) obj;
            if (this.b.equals(pfp0Var.b) && Arrays.equals(this.d, pfp0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d) + urd0.a(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.b);
        }
        return this.e;
    }

    public final String toString() {
        return this.b + ": " + Arrays.toString(this.d);
    }
}
