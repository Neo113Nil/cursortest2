package com.yandex.plus.home.feature.panel.internalapi;

import android.view.View;
import com.yandex.plus.home.common.utils.flow.ColdFlow;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.panel.internalapi.PlusViewAwarenessDetectorImpl$detectViewAware$2", f = "PlusViewAwarenessDetectorImpl.kt", l = {HProv.PP_SIGNATUREOID}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PlusViewAwarenessDetectorImpl$detectViewAware$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $needNotifyImmediately;
    final /* synthetic */ View $shortcutView;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusViewAwarenessDetectorImpl$detectViewAware$2(View view, a aVar, Continuation continuation, boolean z) {
        super(2, continuation);
        this.$needNotifyImmediately = z;
        this.this$0 = aVar;
        this.$shortcutView = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        boolean z = this.$needNotifyImmediately;
        return new PlusViewAwarenessDetectorImpl$detectViewAware$2(this.$shortcutView, this.this$0, continuation, z);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusViewAwarenessDetectorImpl$detectViewAware$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            if (!this.$needNotifyImmediately) {
                this.label = 1;
                if (kotlinx.coroutines.a.i(1500L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        a.e(this.$shortcutView, this.this$0);
        ColdFlow coldFlow = (ColdFlow) this.this$0.g.get(this.$shortcutView.getId());
        zy11 zy11Var = zy11.a;
        if (coldFlow != null) {
            coldFlow.a.g(new Pair(Boolean.TRUE, zy11Var));
        }
        ColdFlow coldFlow2 = (ColdFlow) this.this$0.g.get(this.$shortcutView.getId());
        if (coldFlow2 != null) {
            coldFlow2.a.g(new Pair(Boolean.FALSE, null));
        }
        return zy11Var;
    }
}
