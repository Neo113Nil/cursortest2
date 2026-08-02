package xsna;

import com.vk.dto.common.id.UserId;
import xsna.tra0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class vfh0 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vfh0(wfh0 wfh0Var, int i, tra0 tra0Var) {
        this.d = wfh0Var;
        this.c = i;
        this.e = tra0Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                wfh0 wfh0Var = (wfh0) obj3;
                tra0 tra0Var = (tra0) obj2;
                tra0.a aVar = (tra0.a) obj;
                int intValue = ((wak0) wfh0Var.p.a).getIntValue();
                if (intValue < 0) {
                    intValue = 0;
                }
                if (intValue <= i2) {
                    i2 = intValue;
                }
                int i3 = -i2;
                boolean z = wfh0Var.q;
                int i4 = z ? 0 : i3;
                if (!z) {
                    i3 = 0;
                }
                aVar.b = true;
                tra0.a.z(aVar, tra0Var, i4, i3);
                s3q0 s3q0Var = s3q0.a;
                aVar.b = false;
                return s3q0.a;
            default:
                xbs0 xbs0Var = (xbs0) obj3;
                Integer num = (Integer) obj2;
                ((Integer) obj).getClass();
                int i5 = xbs0Var.j;
                UserId userId = xbs0Var.i;
                String str = xbs0Var.q;
                if (num.intValue() <= 0) {
                    num = null;
                }
                return new owt(i5, userId, str, Integer.valueOf(i2), Integer.valueOf(num != null ? num.intValue() : xbs0Var.k), 0, null, null, xbs0Var.H, 992);
        }
    }

    public /* synthetic */ vfh0(xbs0 xbs0Var, Integer num, int i) {
        this.d = xbs0Var;
        this.e = num;
        this.c = i;
    }
}
