package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.yb70;

/* compiled from: NotificationListView.kt */
@b6l(c = "com.vk.notifications.list.impl.presentation.base.view.list.NotificationListView$ContentSurface$1$1", f = "NotificationListView.kt", l = {152}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class jc70 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ dlv0 $snackbarHostState;
    final /* synthetic */ yb70.g $snackbarState;
    final /* synthetic */ String $text;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc70(yb70.g gVar, dlv0 dlv0Var, String str, spj<? super jc70> spjVar) {
        super(2, spjVar);
        this.$snackbarState = gVar;
        this.$snackbarHostState = dlv0Var;
        this.$text = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new jc70(this.$snackbarState, this.$snackbarHostState, this.$text, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((jc70) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.$snackbarState.a != 0) {
                dlv0 dlv0Var = this.$snackbarHostState;
                String str = this.$text;
                this.label = 1;
                if (dlv0.d(dlv0Var, str, null, this, 30) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
