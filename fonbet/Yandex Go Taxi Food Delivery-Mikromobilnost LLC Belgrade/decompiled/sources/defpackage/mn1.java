package defpackage;

import ru.yandex.logistics.sdk.cargo_form.impl.ai_widgets.ui.ai_chat.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class mn1 implements wls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ mn1(vn1 vn1Var, float f, oz40 oz40Var, tls tlsVar, tls tlsVar2, int i) {
        this.w = vn1Var;
        this.b = f;
        this.x = oz40Var;
        this.y = tlsVar;
        this.z = tlsVar2;
        this.c = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.c;
        Object obj3 = this.z;
        Object obj4 = this.y;
        Object obj5 = this.x;
        Object obj6 = this.w;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                a.a((vn1) obj6, this.b, (oz40) obj5, (tls) obj4, (tls) obj3, (fid) obj, O);
                break;
            default:
                ((Integer) obj2).getClass();
                int O2 = vng.O(i2 | 1);
                h740.a((l8v) obj6, (ldc) obj5, (ldc) obj4, this.b, (nhe) obj3, (fid) obj, O2);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ mn1(l8v l8vVar, ldc ldcVar, ldc ldcVar2, float f, nhe nheVar, int i) {
        this.w = l8vVar;
        this.x = ldcVar;
        this.y = ldcVar2;
        this.b = f;
        this.z = nheVar;
        this.c = i;
    }
}
