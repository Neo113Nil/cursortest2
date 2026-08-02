package defpackage;

import java.util.List;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.circle_input.a;
import ru.yandex.taxi.logistics.sdk.photocomments.PhotocommentsMode;

/* loaded from: classes5.dex */
public final /* synthetic */ class nub implements wls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ cms c;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ nub(pd5 pd5Var, List list, boolean z, tls tlsVar, sls slsVar, sls slsVar2, sls slsVar3, int i) {
        this.a = 1;
        this.x = pd5Var;
        this.y = list;
        this.b = z;
        this.z = tlsVar;
        this.c = slsVar;
        this.A = slsVar2;
        this.B = slsVar3;
        this.w = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        cms cmsVar = this.c;
        Object obj3 = this.B;
        Object obj4 = this.A;
        Object obj5 = this.z;
        Object obj6 = this.y;
        Object obj7 = this.x;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                a.c((String) obj7, (String) obj6, (gty0) obj5, (CharSequence) obj4, this.b, (wls) obj3, (sls) cmsVar, (fid) obj, O);
                break;
            case 1:
                ((Integer) obj2).intValue();
                int O2 = vng.O(i2 | 1);
                dha1.b((pd5) obj7, (List) obj6, this.b, (tls) obj5, (sls) cmsVar, (sls) obj4, (sls) obj3, (fid) obj, O2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int O3 = vng.O(i2 | 1);
                dha1.e((CharSequence) obj4, (CharSequence) obj7, (CharSequence) obj6, (CharSequence) obj5, (sls) cmsVar, (sls) obj3, this.b, (fid) obj, O3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int O4 = vng.O(i2 | 1);
                vi91.b((f530) obj7, (sls) cmsVar, this.b, (ehr0) obj6, (g4v) obj5, (zx40) obj4, (wls) obj3, (fid) obj, O4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int O5 = vng.O(i2 | 1);
                cl91.s((String) obj7, (String) obj6, (String) obj5, (ovi0) obj4, (ll30) obj3, (tls) cmsVar, this.b, (fid) obj, O5);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int O6 = vng.O(i2 | 1);
                ru.yandex.taxi.logistics.sdk.photocomments.a.d((ikb0) obj6, (String) obj7, this.b, (PhotocommentsMode) obj5, (tkb0) obj4, (tls) obj3, (tls) cmsVar, (fid) obj, O6);
                break;
            default:
                ((Integer) obj2).getClass();
                int O7 = vng.O(i2 | 1);
                aka1.d((u4y) obj7, (m0j0) obj6, (Integer) obj5, (f530) obj4, this.b, (f530) obj3, (androidx.compose.runtime.internal.a) cmsVar, (fid) obj, O7);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ nub(f530 f530Var, sls slsVar, boolean z, ehr0 ehr0Var, g4v g4vVar, zx40 zx40Var, wls wlsVar, int i) {
        this.a = 3;
        this.x = f530Var;
        this.c = slsVar;
        this.b = z;
        this.y = ehr0Var;
        this.z = g4vVar;
        this.A = zx40Var;
        this.B = wlsVar;
        this.w = i;
    }

    public /* synthetic */ nub(ikb0 ikb0Var, String str, boolean z, PhotocommentsMode photocommentsMode, tkb0 tkb0Var, tls tlsVar, tls tlsVar2, int i) {
        this.a = 5;
        this.y = ikb0Var;
        this.x = str;
        this.b = z;
        this.z = photocommentsMode;
        this.A = tkb0Var;
        this.B = tlsVar;
        this.c = tlsVar2;
        this.w = i;
    }

    public /* synthetic */ nub(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, sls slsVar, sls slsVar2, boolean z, int i) {
        this.a = 2;
        this.A = charSequence;
        this.x = charSequence2;
        this.y = charSequence3;
        this.z = charSequence4;
        this.c = slsVar;
        this.B = slsVar2;
        this.b = z;
        this.w = i;
    }

    public /* synthetic */ nub(Object obj, Object obj2, Object obj3, Object obj4, boolean z, Object obj5, cms cmsVar, int i, int i2) {
        this.a = i2;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
        this.A = obj4;
        this.b = z;
        this.B = obj5;
        this.c = cmsVar;
        this.w = i;
    }

    public /* synthetic */ nub(String str, String str2, String str3, ovi0 ovi0Var, ll30 ll30Var, tls tlsVar, boolean z, int i) {
        this.a = 4;
        this.x = str;
        this.y = str2;
        this.z = str3;
        this.A = ovi0Var;
        this.B = ll30Var;
        this.c = tlsVar;
        this.b = z;
        this.w = i;
    }
}
