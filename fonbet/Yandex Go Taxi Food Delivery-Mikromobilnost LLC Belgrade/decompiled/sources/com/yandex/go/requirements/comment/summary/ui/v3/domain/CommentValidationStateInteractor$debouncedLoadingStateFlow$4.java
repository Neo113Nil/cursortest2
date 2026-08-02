package com.yandex.go.requirements.comment.summary.ui.v3.domain;

import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rmc;
import defpackage.vpr;
import defpackage.xby;
import defpackage.zls;
import defpackage.zmc;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Ltmc;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.requirements.comment.summary.ui.v3.domain.CommentValidationStateInteractor$debouncedLoadingStateFlow$4", f = "CommentValidationStateInteractor.kt", l = {CalendarDayView.DISABLED_DAY_ALPHA}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class CommentValidationStateInteractor$debouncedLoadingStateFlow$4 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ zmc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentValidationStateInteractor$debouncedLoadingStateFlow$4(zmc zmcVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = zmcVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CommentValidationStateInteractor$debouncedLoadingStateFlow$4 commentValidationStateInteractor$debouncedLoadingStateFlow$4 = new CommentValidationStateInteractor$debouncedLoadingStateFlow$4(this.this$0, (Continuation) obj3);
        commentValidationStateInteractor$debouncedLoadingStateFlow$4.L$0 = (vpr) obj;
        commentValidationStateInteractor$debouncedLoadingStateFlow$4.L$1 = (Throwable) obj2;
        return commentValidationStateInteractor$debouncedLoadingStateFlow$4.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Throwable th = (Throwable) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            xby.l(jst.e, "SUMMARY:COMMENT_V3:COMMENT_VALIDATE_STATE_MAP", null, th, "Error in debouncedLoadingStateFlow", 2);
            zmc zmcVar = this.this$0;
            int i2 = zmc.h;
            zmcVar.getClass();
            rmc a = zmc.a();
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(a, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
