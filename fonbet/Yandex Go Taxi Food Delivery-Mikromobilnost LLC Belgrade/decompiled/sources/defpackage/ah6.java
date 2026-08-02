package defpackage;

import com.yx360.design.compose.atoms.modal.a;
import ru.yandex.taxi.logistics.sdk.photocomments.PhotocommentsMode;

/* loaded from: classes11.dex */
public final /* synthetic */ class ah6 implements wls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ f530 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ ah6(wg6 wg6Var, f530 f530Var, wls wlsVar, to5 to5Var, wls wlsVar2, to5 to5Var2, wls wlsVar3, to5 to5Var3, int i, int i2) {
        this.y = wg6Var;
        this.b = f530Var;
        this.c = wlsVar;
        this.B = to5Var;
        this.z = wlsVar2;
        this.C = to5Var2;
        this.A = wlsVar3;
        this.D = to5Var3;
        this.w = i;
        this.x = i2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        Object obj3 = this.D;
        Object obj4 = this.C;
        Object obj5 = this.B;
        Object obj6 = this.A;
        Object obj7 = this.z;
        Object obj8 = this.c;
        Object obj9 = this.y;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                rab1.a((wg6) obj9, this.b, (wls) obj8, (to5) obj5, (wls) obj7, (to5) obj4, (wls) obj6, (to5) obj3, (fid) obj, O, this.x);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int O2 = vng.O(i2 | 1);
                a.a((sls) obj9, this.b, (trm) obj7, (String) obj6, (wls) obj8, null, (xjg) obj5, (qrm) obj4, (androidx.compose.runtime.internal.a) obj3, (fid) obj, O2, this.x);
                break;
            default:
                ((Integer) obj2).getClass();
                int O3 = vng.O(i2 | 1);
                ru.yandex.taxi.logistics.sdk.photocomments.a.b((dlb0) obj9, (PhotocommentsMode) obj8, (tkb0) obj7, this.b, (j690) obj6, (tls) obj5, (sls) obj4, (sls) obj3, (fid) obj, O3, this.x);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ ah6(sls slsVar, f530 f530Var, trm trmVar, String str, wls wlsVar, lu91 lu91Var, xjg xjgVar, qrm qrmVar, androidx.compose.runtime.internal.a aVar, int i, int i2) {
        this.y = slsVar;
        this.b = f530Var;
        this.z = trmVar;
        this.A = str;
        this.c = wlsVar;
        this.B = xjgVar;
        this.C = qrmVar;
        this.D = aVar;
        this.w = i;
        this.x = i2;
    }

    public /* synthetic */ ah6(dlb0 dlb0Var, PhotocommentsMode photocommentsMode, tkb0 tkb0Var, f530 f530Var, j690 j690Var, tls tlsVar, sls slsVar, sls slsVar2, int i, int i2) {
        this.y = dlb0Var;
        this.c = photocommentsMode;
        this.z = tkb0Var;
        this.b = f530Var;
        this.A = j690Var;
        this.B = tlsVar;
        this.C = slsVar;
        this.D = slsVar2;
        this.w = i;
        this.x = i2;
    }
}
