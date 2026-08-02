package defpackage;

import com.yx360.design.BrandTheme;
import java.util.List;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;
import ru.yandex.taxi.masstransit.ui.compat.a;

/* loaded from: classes11.dex */
public final /* synthetic */ class fo1 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ fo1(qnm qnmVar, boolean z, BrandTheme brandTheme, wls wlsVar, int i, int i2) {
        this.a = 4;
        this.b = qnmVar;
        this.c = z;
        this.y = brandTheme;
        this.z = wlsVar;
        this.w = i;
        this.x = i2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.w;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.z;
        Object obj4 = this.y;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                pkf.a((f530) obj5, (String) obj4, this.c, (ehr0) obj3, (fid) obj, O, this.x);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int O2 = vng.O(i2 | 1);
                a.a((f530) obj5, (m1a0) obj4, this.c, (aj31) obj3, (fid) obj, O2, this.x);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int O3 = vng.O(i2 | 1);
                hqb1.a((f530) obj5, (vge) obj4, this.c, (wls) obj3, (fid) obj, O3, this.x);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int O4 = vng.O(i2 | 1);
                qti.c((el51) obj5, (YandexShapes) obj4, this.c, (androidx.compose.runtime.internal.a) obj3, (fid) obj, O4, this.x);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int O5 = vng.O(i2 | 1);
                ((qnm) obj5).a(this.c, (BrandTheme) obj4, (wls) obj3, (fid) obj, O5, this.x);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int O6 = vng.O(this.x | 1);
                ru.yandex.taxi.logistics.sdk.address_details.impl.ui.widget.route_point.a.i((List) obj5, (wls) obj4, (wls) obj3, this.c, this.w, (fid) obj, O6);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int O7 = vng.O(i2 | 1);
                c1z0.a((f530) obj5, (List) obj4, (tls) obj3, this.c, (fid) obj, O7, this.x);
                break;
            default:
                ((Integer) obj2).getClass();
                int O8 = vng.O(i2 | 1);
                qrb1.c((wts0) obj5, (tls) obj4, (wls) obj3, this.c, (fid) obj, O8, this.x);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ fo1(Object obj, Object obj2, cms cmsVar, boolean z, int i, int i2, int i3) {
        this.a = i3;
        this.b = obj;
        this.y = obj2;
        this.z = cmsVar;
        this.c = z;
        this.w = i;
        this.x = i2;
    }

    public /* synthetic */ fo1(Object obj, Object obj2, boolean z, Object obj3, int i, int i2, int i3) {
        this.a = i3;
        this.b = obj;
        this.y = obj2;
        this.c = z;
        this.z = obj3;
        this.w = i;
        this.x = i2;
    }
}
