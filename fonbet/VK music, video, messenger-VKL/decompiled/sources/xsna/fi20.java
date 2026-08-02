package xsna;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import java.util.List;
import xsna.vr10;

/* compiled from: Metadata.java */
/* loaded from: classes12.dex */
public final class fi20 {
    public final a[] a;
    public final long b;

    public fi20() {
        throw null;
    }

    public fi20(a... aVarArr) {
        this(C.TIME_UNSET, aVarArr);
    }

    public final fi20 a(a... aVarArr) {
        if (aVarArr.length == 0) {
            return this;
        }
        String str = y2r0.a;
        a[] aVarArr2 = this.a;
        Object[] copyOf = Arrays.copyOf(aVarArr2, aVarArr2.length + aVarArr.length);
        System.arraycopy(aVarArr, 0, copyOf, aVarArr2.length, aVarArr.length);
        return new fi20(this.b, (a[]) copyOf);
    }

    public final fi20 b(@Nullable fi20 fi20Var) {
        return fi20Var == null ? this : a(fi20Var.a);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fi20.class == obj.getClass()) {
            fi20 fi20Var = (fi20) obj;
            if (Arrays.equals(this.a, fi20Var.a) && this.b == fi20Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return e600.b(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.a));
        long j = this.b;
        if (j == C.TIME_UNSET) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    public fi20(long j, a... aVarArr) {
        this.b = j;
        this.a = aVarArr;
    }

    public fi20(List<? extends a> list) {
        this((a[]) list.toArray(new a[0]));
    }

    /* compiled from: Metadata.java */
    public interface a {
        @Nullable
        default byte[] a() {
            return null;
        }

        @Nullable
        default androidx.media3.common.a b() {
            return null;
        }

        default void c(vr10.a aVar) {
        }
    }
}
