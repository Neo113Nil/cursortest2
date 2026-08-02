package xsna;

import androidx.annotation.Nullable;
import com.google.common.io.BaseEncoding;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import xsna.fi20;

/* compiled from: MdtaMetadataEntry.java */
/* loaded from: classes12.dex */
public final class vo10 implements fi20.a {
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    public vo10(String str, byte[] bArr, int i, int i2) {
        boolean z;
        byte b;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                if (i2 == 23 && bArr.length == 4) {
                    z = true;
                }
                fxc0.p(z);
                break;
            case "auxiliary.tracks.interleaved":
                if (i2 == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    z = true;
                }
                fxc0.p(z);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i2 == 78 && bArr.length == 8) {
                    z = true;
                }
                fxc0.p(z);
                break;
            case "auxiliary.tracks.map":
                fxc0.p(i2 == 0);
                break;
        }
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
    }

    public final ArrayList d() {
        fxc0.A(this.a.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte[] bArr = this.b;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i = tv4.a(arrayList, bArr[i + 2], i, 1)) {
        }
        return arrayList;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vo10.class == obj.getClass()) {
            vo10 vo10Var = (vo10) obj;
            if (this.a.equals(vo10Var.a) && Arrays.equals(this.b, vo10Var.b) && this.c == vo10Var.c && this.d == vo10Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + urd0.a(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.a)) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        String sb;
        String str = this.a;
        byte[] bArr = this.b;
        int i = this.d;
        if (i == 0) {
            if (str.equals("auxiliary.tracks.map")) {
                ArrayList d = d();
                StringBuilder e = fw3.e("track types = ");
                new op5(String.valueOf(',')).a(e, d.iterator());
                sb = e.toString();
            }
            String str2 = y2r0.a;
            sb = BaseEncoding.a().e().b(bArr);
        } else if (i == 1) {
            sb = y2r0.r(bArr);
        } else if (i == 23) {
            sb = String.valueOf(Float.intBitsToFloat(ipx.t(bArr)));
        } else if (i == 67) {
            sb = String.valueOf(ipx.t(bArr));
        } else if (i != 75) {
            if (i == 78) {
                sb = String.valueOf(new xi90(bArr).I());
            }
            String str22 = y2r0.a;
            sb = BaseEncoding.a().e().b(bArr);
        } else {
            sb = String.valueOf(Byte.toUnsignedInt(bArr[0]));
        }
        return y57.a("mdta: key=", str, ", value=", sb);
    }
}
