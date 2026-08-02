package xsna;

import com.vk.money.MoneyTransfersFragment;
import xsna.coc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class koc implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ koc(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                el50 el50Var = (el50) this.c;
                el50Var.D(el50Var, new u8(((coc.e) this.d).b, 24));
                break;
            default:
                MoneyTransfersFragment moneyTransfersFragment = (MoneyTransfersFragment) this.c;
                fgz fgzVar = (fgz) this.d;
                a830 a830Var = (a830) obj;
                int i = MoneyTransfersFragment.b1;
                moneyTransfersFragment.Z0 = a830Var.a;
                fgzVar.b(a830Var.b);
                break;
        }
    }
}
