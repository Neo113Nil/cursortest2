package defpackage;

import kotlin.coroutines.Continuation;
import ru.rt.ebs.cryptosdk.presentation.base.BaseFragment;

/* loaded from: classes4.dex */
public final class n271 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseFragment b;

    public /* synthetic */ n271(BaseFragment baseFragment, int i) {
        this.a = i;
        this.b = baseFragment;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        BaseFragment baseFragment = this.b;
        switch (i) {
            case 0:
                baseFragment.onViewStateChanged((tt11) obj);
                break;
            default:
                baseFragment.onViewEffect((xs11) obj);
                break;
        }
        return zy11Var;
    }
}
