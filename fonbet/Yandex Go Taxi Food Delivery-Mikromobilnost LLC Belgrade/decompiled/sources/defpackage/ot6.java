package defpackage;

import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.dynamic_timeline.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class ot6 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ ot6(int i, int i2, long j) {
        this.a = i2;
        this.b = j;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        long j = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                acb1.c(j, (fid) obj, vng.O(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                a.g(j, (fid) obj, vng.O(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                a.d(j, (fid) obj, vng.O(1));
                break;
            case 3:
                sva0 sva0Var = (sva0) obj2;
                if (sva0Var == null) {
                    sva0Var = new sva0();
                }
                sva0Var.d = true;
                sva0Var.e = Long.valueOf(System.nanoTime());
                sva0Var.l = Long.valueOf(j);
                break;
            case 4:
                sva0 sva0Var2 = (sva0) obj2;
                sva0Var2.k = Long.valueOf(j);
                break;
            case 5:
                sva0 sva0Var3 = (sva0) obj2;
                sva0Var3.c = true;
                sva0Var3.m = Long.valueOf(j);
                break;
            case 6:
                ((Integer) obj2).getClass();
                eqb1.d(j, (fid) obj, vng.O(1));
                break;
            default:
                ((Integer) obj2).getClass();
                eqb1.b(j, (fid) obj, vng.O(1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ ot6(long j, int i) {
        this.a = i;
        this.b = j;
    }
}
