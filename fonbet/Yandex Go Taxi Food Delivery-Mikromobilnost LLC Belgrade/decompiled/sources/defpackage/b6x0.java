package defpackage;

import ru.yandex.taxi.logistics.sdk.ui.component.control.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class b6x0 implements wls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ b6x0(z4x0 z4x0Var, boolean z, long j, f530 f530Var, tls tlsVar, int i) {
        this.x = z4x0Var;
        this.w = z;
        this.b = j;
        this.y = f530Var;
        this.z = tlsVar;
        this.c = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.z;
        Object obj4 = this.y;
        Object obj5 = this.x;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(this.c | 1);
                a.o((z4x0) obj5, this.w, this.b, (f530) obj4, (tls) obj3, (fid) obj, O);
                break;
            default:
                ((Integer) obj2).getClass();
                int O2 = vng.O(1);
                ay41.a((String) obj5, (sls) obj4, this.b, this.c, this.w, (String) obj3, (fid) obj, O2);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ b6x0(String str, sls slsVar, long j, int i, boolean z, String str2, int i2) {
        this.x = str;
        this.y = slsVar;
        this.b = j;
        this.c = i;
        this.w = z;
        this.z = str2;
    }
}
