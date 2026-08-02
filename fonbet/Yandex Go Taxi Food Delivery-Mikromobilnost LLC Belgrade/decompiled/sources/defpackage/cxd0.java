package defpackage;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final /* synthetic */ class cxd0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ tls x;

    public /* synthetic */ cxd0(String str, ArrayList arrayList, boolean z, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = arrayList;
        this.w = z;
        this.x = tlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(1);
                gxd0.d(this.b, this.c, this.w, this.x, (fid) obj, O);
                break;
            default:
                ((Integer) obj2).getClass();
                int O2 = vng.O(1);
                gxd0.g(this.b, this.c, this.w, this.x, (fid) obj, O2);
                break;
        }
        return zy11Var;
    }
}
