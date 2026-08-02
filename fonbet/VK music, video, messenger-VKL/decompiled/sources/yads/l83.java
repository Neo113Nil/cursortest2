package yads;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import xsna.e630;
import xsna.h5s;
import xsna.xe9;

/* loaded from: classes10.dex */
public final class l83 implements xq {
    public static final wq g = new e630(15);
    public final int b;
    public final String c;
    public final int d;
    public final nx0[] e;
    public int f;

    public l83(String str, nx0... nx0VarArr) {
        ni.a(nx0VarArr.length > 0);
        this.c = str;
        this.e = nx0VarArr;
        this.b = nx0VarArr.length;
        int d = iu1.d(nx0VarArr[0].m);
        this.d = d == -1 ? iu1.d(nx0VarArr[0].l) : d;
        a();
    }

    public final nx0 a(int i) {
        return this.e[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l83.class == obj.getClass()) {
            l83 l83Var = (l83) obj;
            if (this.c.equals(l83Var.c) && Arrays.equals(this.e, l83Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = k4.a(this.c, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31) + Arrays.hashCode(this.e);
        }
        return this.f;
    }

    public final int a(nx0 nx0Var) {
        int i = 0;
        while (true) {
            nx0[] nx0VarArr = this.e;
            if (i >= nx0VarArr.length) {
                return -1;
            }
            if (nx0Var == nx0VarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public static l83 a(Bundle bundle) {
        tn2 a;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        if (parcelableArrayList == null) {
            p51 p51Var = s51.c;
            a = tn2.f;
        } else {
            a = yq.a(nx0.I, parcelableArrayList);
        }
        return new l83(bundle.getString(Integer.toString(1, 36), ""), (nx0[]) a.toArray(new nx0[0]));
    }

    public l83(nx0... nx0VarArr) {
        this("", nx0VarArr);
    }

    public final void a() {
        String str = this.e[0].d;
        if (str == null || str.equals(C.LANGUAGE_UNDETERMINED)) {
            str = "";
        }
        int i = this.e[0].f | 16384;
        int i2 = 1;
        while (true) {
            nx0[] nx0VarArr = this.e;
            if (i2 >= nx0VarArr.length) {
                return;
            }
            String str2 = nx0VarArr[i2].d;
            if (str2 == null || str2.equals(C.LANGUAGE_UNDETERMINED)) {
                str2 = "";
            }
            if (!str.equals(str2)) {
                nx0[] nx0VarArr2 = this.e;
                ji1.b("TrackGroup", ji1.a("", new IllegalStateException(h5s.c(i2, ")", xe9.a("Different languages combined in one TrackGroup: '", nx0VarArr2[0].d, "' (track 0) and '", nx0VarArr2[i2].d, "' (track ")))));
                return;
            } else {
                nx0[] nx0VarArr3 = this.e;
                if (i != (nx0VarArr3[i2].f | 16384)) {
                    ji1.b("TrackGroup", ji1.a("", new IllegalStateException(h5s.c(i2, ")", xe9.a("Different role flags combined in one TrackGroup: '", Integer.toBinaryString(nx0VarArr3[0].f), "' (track 0) and '", Integer.toBinaryString(this.e[i2].f), "' (track ")))));
                    return;
                }
                i2++;
            }
        }
    }
}
