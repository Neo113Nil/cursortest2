package xsna;

import io.requery.android.database.sqlite.SQLiteStatementType;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GroupedNotificationListView.kt */
@b6l(c = "com.vk.notifications.list.impl.presentation.base.view.grouped.GroupedNotificationListView$ContentSurface$1$1", f = "GroupedNotificationListView.kt", l = {SQLiteStatementType.STATEMENT_OTHER}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class bou extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ dlv0 $snackbarHostState;
    final /* synthetic */ mtk0<Integer> $snackbarKey$delegate;
    final /* synthetic */ String $text;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bou(dlv0 dlv0Var, String str, mtk0<Integer> mtk0Var, spj<? super bou> spjVar) {
        super(2, spjVar);
        this.$snackbarHostState = dlv0Var;
        this.$text = str;
        this.$snackbarKey$delegate = mtk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new bou(this.$snackbarHostState, this.$text, this.$snackbarKey$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((bou) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.$snackbarKey$delegate.getValue().intValue() != 0) {
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
