package defpackage;

import androidx.compose.foundation.c;
import androidx.compose.foundation.lazy.grid.a;
import androidx.compose.foundation.lazy.grid.b;
import com.google.ar.core.ImageMetadata;
import ru.yandex.taxi.logistics.sdk.photocomments.PhotocommentsMode;

/* loaded from: classes10.dex */
public final /* synthetic */ class d4y implements wls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ tls x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    public /* synthetic */ d4y(f530 f530Var, b bVar, s1u s1uVar, j690 j690Var, snr snrVar, boolean z, c cVar, k43 k43Var, h43 h43Var, tls tlsVar, int i, int i2) {
        this.c = f530Var;
        this.A = bVar;
        this.B = s1uVar;
        this.w = j690Var;
        this.C = snrVar;
        this.b = z;
        this.D = cVar;
        this.E = k43Var;
        this.F = h43Var;
        this.x = tlsVar;
        this.y = i;
        this.z = i2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.y;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.F;
        Object obj4 = this.E;
        Object obj5 = this.D;
        Object obj6 = this.C;
        Object obj7 = this.w;
        Object obj8 = this.B;
        Object obj9 = this.A;
        Object obj10 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                a.a((f530) obj10, (b) obj9, (s1u) obj8, (j690) obj7, (snr) obj6, this.b, (c) obj5, (k43) obj4, (h43) obj3, this.x, (fid) obj, vng.O(i2 | 1), vng.O(this.z));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.photocomments.a.k((dlb0) obj9, (gv90) obj8, this.b, (PhotocommentsMode) obj6, (tkb0) obj5, (f530) obj10, (j690) obj7, this.x, (tls) obj4, (sls) obj3, (fid) obj, vng.O(i2 | 1), this.z);
                break;
            default:
                imy0 imy0Var = (imy0) obj10;
                String str = (String) obj9;
                ety0 ety0Var = (ety0) obj8;
                lkx lkxVar = (lkx) obj7;
                xjx xjxVar = (xjx) obj6;
                gy31 gy31Var = (gy31) obj5;
                zx40 zx40Var = (zx40) obj4;
                ehr0 ehr0Var = (ehr0) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    vhb1.b(btsVar, hzh0.default_error_message);
                    f530 a = ljs0.a(c530.a, 280.0f, 56.0f);
                    a6t0 a6t0Var = new a6t0(imy0Var.i);
                    boolean z = this.b;
                    ne5.b(str, this.x, a, z, false, ety0Var, lkxVar, xjxVar, false, this.y, this.z, gy31Var, null, zx40Var, a6t0Var, wwg.S(1451491557, true, new e1z0(str, z, gy31Var, zx40Var, ehr0Var, imy0Var), btsVar), btsVar, 0, ImageMetadata.EDGE_MODE, 4096);
                    break;
                }
        }
        return zy11Var;
    }

    public /* synthetic */ d4y(dlb0 dlb0Var, gv90 gv90Var, boolean z, PhotocommentsMode photocommentsMode, tkb0 tkb0Var, f530 f530Var, j690 j690Var, tls tlsVar, tls tlsVar2, sls slsVar, int i, int i2) {
        this.A = dlb0Var;
        this.B = gv90Var;
        this.b = z;
        this.C = photocommentsMode;
        this.D = tkb0Var;
        this.c = f530Var;
        this.w = j690Var;
        this.x = tlsVar;
        this.E = tlsVar2;
        this.F = slsVar;
        this.y = i;
        this.z = i2;
    }

    public /* synthetic */ d4y(imy0 imy0Var, String str, tls tlsVar, boolean z, ety0 ety0Var, lkx lkxVar, xjx xjxVar, int i, int i2, gy31 gy31Var, zx40 zx40Var, ehr0 ehr0Var) {
        this.c = imy0Var;
        this.A = str;
        this.x = tlsVar;
        this.b = z;
        this.B = ety0Var;
        this.w = lkxVar;
        this.C = xjxVar;
        this.y = i;
        this.z = i2;
        this.D = gy31Var;
        this.E = zx40Var;
        this.F = ehr0Var;
    }
}
