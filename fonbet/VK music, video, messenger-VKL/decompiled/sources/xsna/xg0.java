package xsna;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import java.util.Objects;
import xsna.kr10;

/* compiled from: AdPlaybackState.java */
/* loaded from: classes12.dex */
public final class xg0 {
    public static final xg0 c = new xg0(new a[0]);
    public static final a d;
    public final int a;
    public final a[] b;

    /* compiled from: AdPlaybackState.java */
    public static final class a {
        public final int a;
        public final int b;

        @Deprecated
        public final Uri[] c;
        public final kr10[] d;
        public final int[] e;
        public final long[] f;
        public final String[] g;
        public final b[] h;

        static {
            cq.h(0, 1, 2, 3, 4);
            cq.h(5, 6, 7, 8, 9);
            y2r0.L(10);
            y2r0.L(11);
        }

        public a(int i, int i2, int[] iArr, kr10[] kr10VarArr, long[] jArr, String[] strArr, b[] bVarArr) {
            Uri uri;
            int i3 = 0;
            fxc0.p(iArr.length == kr10VarArr.length);
            fxc0.p(iArr.length == bVarArr.length);
            this.a = i;
            this.b = i2;
            this.e = iArr;
            this.d = kr10VarArr;
            this.f = jArr;
            this.c = new Uri[kr10VarArr.length];
            while (true) {
                Uri[] uriArr = this.c;
                if (i3 >= uriArr.length) {
                    this.g = strArr;
                    this.h = bVarArr;
                    return;
                }
                kr10 kr10Var = kr10VarArr[i3];
                if (kr10Var == null) {
                    uri = null;
                } else {
                    kr10.f fVar = kr10Var.b;
                    fVar.getClass();
                    uri = fVar.a;
                }
                uriArr[i3] = uri;
                i3++;
            }
        }

        public final int a(int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.e;
                if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.e, aVar.e) && Arrays.equals(this.f, aVar.f) && Arrays.equals(this.g, aVar.g) && Arrays.equals(this.h, aVar.h);
        }

        public final int hashCode() {
            int i = ((this.a * 31) + this.b) * 31;
            int i2 = (int) 0;
            return (Arrays.hashCode(this.h) + ((((((Arrays.hashCode(this.f) + dq.d((Arrays.hashCode(this.d) + ((i + i2) * 31)) * 31, 31, this.e)) * 31) + i2) * 961) + Arrays.hashCode(this.g)) * 31)) * 31;
        }
    }

    /* compiled from: AdPlaybackState.java */
    public static final class b {
        static {
            y2r0.L(0);
            y2r0.L(1);
            y2r0.L(2);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Objects.hash(0L, 0L, null);
        }
    }

    static {
        a aVar = new a(-1, -1, new int[0], new kr10[0], new long[0], new String[0], new b[0]);
        int[] iArr = aVar.e;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = aVar.f;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, C.TIME_UNSET);
        kr10[] kr10VarArr = (kr10[]) Arrays.copyOf(aVar.d, 0);
        String[] strArr = (String[]) Arrays.copyOf(aVar.g, 0);
        b[] bVarArr = aVar.h;
        d = new a(0, aVar.b, copyOf, kr10VarArr, copyOf2, strArr, (b[]) Arrays.copyOf(bVarArr, Math.max(0, bVarArr.length)));
        y2r0.L(1);
        y2r0.L(2);
        y2r0.L(3);
        y2r0.L(4);
    }

    public xg0(a[] aVarArr) {
        this.a = aVarArr.length;
        this.b = aVarArr;
    }

    public final a a(int i) {
        return i < 0 ? d : this.b[i];
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xg0.class != obj.getClass()) {
            return false;
        }
        xg0 xg0Var = (xg0) obj;
        return this.a == xg0Var.a && Arrays.equals(this.b, xg0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (((((this.a * 961) + ((int) 0)) * 31) + ((int) C.TIME_UNSET)) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i = 0;
        while (true) {
            a[] aVarArr = this.b;
            if (i >= aVarArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=0, ads=[");
            aVarArr[i].getClass();
            for (int i2 = 0; i2 < aVarArr[i].e.length; i2++) {
                sb.append("ad(state=");
                int i3 = aVarArr[i].e[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append('R');
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(aVarArr[i].f[i2]);
                sb.append(')');
                if (i2 < aVarArr[i].e.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < aVarArr.length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
