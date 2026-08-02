package defpackage;

import com.yandex.go.design.compose.radio.RadioSize;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class o360 implements wls {
    public final /* synthetic */ cms A;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ o360(i360 i360Var, d360 d360Var, boolean z, boolean z2, wls wlsVar, int i, int i2) {
        this.y = i360Var;
        this.z = d360Var;
        this.b = z;
        this.c = z2;
        this.A = wlsVar;
        this.w = i;
        this.x = i2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        cms cmsVar = this.A;
        Object obj3 = this.z;
        Object obj4 = this.y;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                zsb1.d((i360) obj4, (d360) obj3, this.b, this.c, (wls) cmsVar, (fid) obj, O, this.x);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int O2 = vng.O(i2 | 1);
                wfa1.a(this.b, (f530) obj4, (RadioSize) obj3, (tls) cmsVar, this.c, (fid) obj, O2, this.x);
                break;
            default:
                ((Integer) obj2).getClass();
                int O3 = vng.O(i2 | 1);
                a.a((jvs0) obj4, this.b, this.c, (tls) obj3, (tls) cmsVar, (fid) obj, O3, this.x);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ o360(jvs0 jvs0Var, boolean z, boolean z2, tls tlsVar, tls tlsVar2, int i, int i2) {
        this.y = jvs0Var;
        this.b = z;
        this.c = z2;
        this.z = tlsVar;
        this.A = tlsVar2;
        this.w = i;
        this.x = i2;
    }

    public /* synthetic */ o360(boolean z, f530 f530Var, RadioSize radioSize, tls tlsVar, boolean z2, int i, int i2) {
        this.b = z;
        this.y = f530Var;
        this.z = radioSize;
        this.A = tlsVar;
        this.c = z2;
        this.w = i;
        this.x = i2;
    }
}
