package xsna;

import android.view.View;
import com.vk.voip.VoipService;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import kotlin.Pair;
import xsna.cvq0;
import xsna.s8z0;
import xsna.ymq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class gwn0 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.h, i0u0, io.reactivex.rxjava3.functions.m, s8z0.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gwn0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (io.reactivex.rxjava3.core.e) ((fyi0) obj2).invoke(obj);
            case 1:
            case 2:
            default:
                return (sww0) ((tbs0) obj2).invoke(obj);
            case 3:
                return ((cvq0.a) obj2).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.t) ((tbs0) obj2).invoke(obj);
            case 5:
                return (io.reactivex.rxjava3.core.t) ((tbs0) obj2).invoke(obj);
            case 6:
                return (Pair) ((pps) obj2).invoke(obj);
            case 7:
                return (io.reactivex.rxjava3.core.t) ((w9t0) obj2).invoke(obj);
            case 8:
                return (VoipActionsFeatureState.q) ((fyi0) obj2).invoke(obj);
            case 9:
                int i2 = cdw0.o1;
                return (String) ((fyi0) obj2).invoke(obj);
            case 10:
                return (Boolean) ((y160) obj2).invoke(obj);
        }
    }

    @Override // io.reactivex.rxjava3.functions.h
    public Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        return (ymq0.a) ((xmq0) this.c).invoke(obj, obj2, obj3, obj4);
    }

    @Override // xsna.i0u0
    public View get() {
        return ((arq0) this.c).itemView;
    }

    @Override // xsna.s8z0.a
    public void i(z9z0 z9z0Var) {
        ((lly0) this.c).p = z9z0Var;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        foh fohVar = (foh) this.c;
        Object obj2 = VoipService.q;
        return ((Boolean) fohVar.invoke(obj)).booleanValue();
    }
}
