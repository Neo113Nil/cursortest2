package com.yandex.div.core.view2.divs.widgets;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.view2.Div2View;
import defpackage.h8;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@mvg(c = "com.yandex.div.core.view2.divs.widgets.ReleaseUtils$releaseAndRemoveChildren$$inlined$executeOnMainThreadBlocking$1", f = "ReleaseUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class ReleaseUtils$releaseAndRemoveChildren$$inlined$executeOnMainThreadBlocking$1 extends SuspendLambda implements wls {
    final /* synthetic */ Div2View $divView$inlined;
    final /* synthetic */ ViewGroup $this_releaseAndRemoveChildren$inlined;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReleaseUtils$releaseAndRemoveChildren$$inlined$executeOnMainThreadBlocking$1(Continuation continuation, ViewGroup viewGroup, Div2View div2View) {
        super(2, continuation);
        this.$this_releaseAndRemoveChildren$inlined = viewGroup;
        this.$divView$inlined = div2View;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReleaseUtils$releaseAndRemoveChildren$$inlined$executeOnMainThreadBlocking$1(continuation, this.$this_releaseAndRemoveChildren$inlined, this.$divView$inlined);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ReleaseUtils$releaseAndRemoveChildren$$inlined$executeOnMainThreadBlocking$1 releaseUtils$releaseAndRemoveChildren$$inlined$executeOnMainThreadBlocking$1 = (ReleaseUtils$releaseAndRemoveChildren$$inlined$executeOnMainThreadBlocking$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        releaseUtils$releaseAndRemoveChildren$$inlined$executeOnMainThreadBlocking$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ViewGroup viewGroup = this.$this_releaseAndRemoveChildren$inlined;
        Div2View div2View = this.$divView$inlined;
        h8 h8Var = new h8(3, viewGroup);
        while (h8Var.hasNext()) {
            wwg.Y(div2View.getReleaseViewVisitor$div_release(), (View) h8Var.next());
        }
        this.$this_releaseAndRemoveChildren$inlined.removeAllViews();
        return zy11.a;
    }
}
