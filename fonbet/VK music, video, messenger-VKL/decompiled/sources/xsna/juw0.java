package xsna;

import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkPayCheckoutItem;
import xsna.mp90;
import xsna.op90;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class juw0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ juw0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((kuw0) this.c).m.a(new mp90.a.C3363a(((op90.a) this.d).c()));
                break;
            default:
                shn0 shn0Var = (shn0) this.c;
                gzs gzsVar = (gzs) this.d;
                shn0Var.a(SchemeStatSak$TypeVkPayCheckoutItem.EventType.SHOW_FULL_PAY_BOX);
                gzsVar.invoke();
                break;
        }
        return s3q0.a;
    }
}
