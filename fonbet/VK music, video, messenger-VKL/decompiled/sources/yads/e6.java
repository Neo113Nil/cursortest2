package yads;

import android.net.Uri;
import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import xsna.e630;

/* loaded from: classes10.dex */
public final class e6 implements xq {
    public static final e6 h = new e6(null, new d6[0], 0, C.TIME_UNSET, 0);
    public static final d6 i = new d6(0, -1, new int[0], new Uri[0], new long[0], 0, false).a();
    public static final wq j = new e630(14);
    public final Object b;
    public final int c;
    public final long d;
    public final long e;
    public final int f;
    public final d6[] g;

    public e6(Object obj, d6[] d6VarArr, long j2, long j3, int i2) {
        this.b = obj;
        this.d = j2;
        this.e = j3;
        this.c = d6VarArr.length + i2;
        this.g = d6VarArr;
        this.f = i2;
    }

    public static e6 a(Bundle bundle) {
        d6[] d6VarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(1, 36));
        if (parcelableArrayList == null) {
            d6VarArr = new d6[0];
        } else {
            d6[] d6VarArr2 = new d6[parcelableArrayList.size()];
            for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                d6VarArr2[i2] = (d6) d6.i.fromBundle((Bundle) parcelableArrayList.get(i2));
            }
            d6VarArr = d6VarArr2;
        }
        return new e6(null, d6VarArr, bundle.getLong(Integer.toString(2, 36), 0L), bundle.getLong(Integer.toString(3, 36), C.TIME_UNSET), bundle.getInt(Integer.toString(4, 36)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e6.class == obj.getClass()) {
            e6 e6Var = (e6) obj;
            if (mc3.a(this.b, e6Var.b) && this.c == e6Var.c && this.d == e6Var.d && this.e == e6Var.e && this.f == e6Var.f && Arrays.equals(this.g, e6Var.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.c * 31;
        Object obj = this.b;
        return ((((((((i2 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + this.f) * 31) + Arrays.hashCode(this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=");
        sb.append(this.b);
        sb.append(", adResumePositionUs=");
        sb.append(this.d);
        sb.append(", adGroups=[");
        for (int i2 = 0; i2 < this.g.length; i2++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.g[i2].b);
            sb.append(", ads=[");
            for (int i3 = 0; i3 < this.g[i2].e.length; i3++) {
                sb.append("ad(state=");
                int i4 = this.g[i2].e[i3];
                if (i4 == 0) {
                    sb.append('_');
                } else if (i4 == 1) {
                    sb.append('R');
                } else if (i4 == 2) {
                    sb.append('S');
                } else if (i4 == 3) {
                    sb.append('P');
                } else if (i4 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(this.g[i2].f[i3]);
                sb.append(')');
                if (i3 < this.g[i2].e.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i2 < this.g.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }

    public final d6 a(int i2) {
        int i3 = this.f;
        if (i2 < i3) {
            return i;
        }
        return this.g[i2 - i3];
    }
}
