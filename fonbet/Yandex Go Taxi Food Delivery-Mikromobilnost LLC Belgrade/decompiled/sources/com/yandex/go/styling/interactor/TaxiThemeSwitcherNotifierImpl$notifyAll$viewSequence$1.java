package com.yandex.go.styling.interactor;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.h8;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.srq0;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import ru.yandex.taxi.widget.dialog.BaseDialog;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsrq0;", "Landroid/view/View;", "Lzy11;", "<anonymous>", "(Lsrq0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.styling.interactor.TaxiThemeSwitcherNotifierImpl$notifyAll$viewSequence$1", f = "TaxiThemeSwitcherNotifierImpl.kt", l = {150, ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class TaxiThemeSwitcherNotifierImpl$notifyAll$viewSequence$1 extends RestrictedSuspendLambda implements wls {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiThemeSwitcherNotifierImpl$notifyAll$viewSequence$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TaxiThemeSwitcherNotifierImpl$notifyAll$viewSequence$1 taxiThemeSwitcherNotifierImpl$notifyAll$viewSequence$1 = new TaxiThemeSwitcherNotifierImpl$notifyAll$viewSequence$1(this.this$0, continuation);
        taxiThemeSwitcherNotifierImpl$notifyAll$viewSequence$1.L$0 = obj;
        return taxiThemeSwitcherNotifierImpl$notifyAll$viewSequence$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiThemeSwitcherNotifierImpl$notifyAll$viewSequence$1) create((srq0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x009f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b bVar;
        Iterator it;
        Iterator h8Var;
        srq0 srq0Var = (srq0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List list = (List) this.this$0.j.getValue();
            bVar = this.this$0;
            it = list.iterator();
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                h8Var = (Iterator) this.L$3;
                kotlin.b.b(obj);
                while (h8Var.hasNext()) {
                    View view = (View) h8Var.next();
                    if (view instanceof BaseDialog) {
                        this.L$0 = srq0Var;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = h8Var;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.label = 2;
                        if (srq0Var.a(view, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                return zy11.a;
            }
            it = (Iterator) this.L$3;
            bVar = (b) this.L$2;
            kotlin.b.b(obj);
        }
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            View findViewById = bVar.a.findViewById(intValue);
            if (findViewById != null) {
                this.L$0 = srq0Var;
                this.L$1 = null;
                this.L$2 = bVar;
                this.L$3 = it;
                this.L$4 = null;
                this.L$5 = null;
                this.I$0 = intValue;
                this.label = 1;
                if (srq0Var.a(findViewById, this) == coroutineSingletons) {
                    break;
                }
            }
        }
        h8Var = new h8(3, (ViewGroup) this.this$0.a.requireViewById(R.id.content));
        while (h8Var.hasNext()) {
        }
        return zy11.a;
    }
}
