package defpackage;

import androidx.compose.runtime.internal.a;
import com.yandex.go.chargers.feedback.ui.b;

/* loaded from: classes5.dex */
public final /* synthetic */ class an1 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object w;

    public /* synthetic */ an1(int i, Object obj, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.w = obj;
        this.c = i2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.c;
        Object obj3 = this.w;
        int i3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                dn1.f((bj6) obj3, i3, (fid) obj, vng.O(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                int O = vng.O(i2 | 1);
                b.j(i3, O, (fid) obj, (tls) obj3);
                break;
            case 2:
                a aVar = (a) obj3;
                fid fidVar = (fid) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    bts btsVar = (bts) fidVar;
                    if (btsVar.E()) {
                        btsVar.Y();
                        break;
                    }
                }
                aVar.invoke(Integer.valueOf(i3), Integer.valueOf(i2), fidVar, 0);
                break;
            default:
                ((Integer) obj2).getClass();
                t5l0.e(i3, (dcl0) obj3, (fid) obj, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ an1(Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.w = obj;
        this.b = i;
        this.c = i2;
    }
}
