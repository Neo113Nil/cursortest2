package defpackage;

import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.carousel_items.b;

/* loaded from: classes5.dex */
public final /* synthetic */ class hy8 implements wls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object w;

    public /* synthetic */ hy8(ugh ughVar, int i, long j, int i2) {
        this.w = ughVar;
        this.c = i;
        this.b = j;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.w;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(1);
                b.a((ugh) obj3, this.c, this.b, (fid) obj, O);
                break;
            default:
                ((Integer) obj2).intValue();
                int O2 = vng.O(this.c | 1);
                t1a1.b((String) obj3, this.b, (fid) obj, O2);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ hy8(String str, long j, int i) {
        this.w = str;
        this.b = j;
        this.c = i;
    }
}
