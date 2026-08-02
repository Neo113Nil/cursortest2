package androidx.compose.material3;

import defpackage.hh;
import defpackage.i72;
import defpackage.j18;
import defpackage.mf60;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o0t0;
import defpackage.q0t0;
import defpackage.r0t0;
import defpackage.s0t0;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "androidx.compose.material3.SnackbarHostKt$SnackbarHost$1$1", f = "SnackbarHost.kt", l = {231}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class SnackbarHostKt$SnackbarHost$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ hh $accessibilityManager;
    final /* synthetic */ o0t0 $currentSnackbarData;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$SnackbarHost$1$1(o0t0 o0t0Var, hh hhVar, Continuation continuation) {
        super(2, continuation);
        this.$currentSnackbarData = o0t0Var;
        this.$accessibilityManager = hhVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SnackbarHostKt$SnackbarHost$1$1(this.$currentSnackbarData, this.$accessibilityManager, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SnackbarHostKt$SnackbarHost$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            o0t0 o0t0Var = this.$currentSnackbarData;
            if (o0t0Var != null) {
                s0t0 s0t0Var = ((r0t0) o0t0Var).a;
                SnackbarDuration snackbarDuration = s0t0Var.a;
                s0t0Var.getClass();
                hh hhVar = this.$accessibilityManager;
                int i2 = q0t0.a[snackbarDuration.ordinal()];
                long j2 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
                if (i2 == 1) {
                    j = Long.MAX_VALUE;
                } else if (i2 == 2) {
                    j = 10000;
                } else {
                    if (i2 != 3) {
                        w511.b();
                        return null;
                    }
                    j = 4000;
                }
                if (hhVar != null) {
                    i72 i72Var = (i72) hhVar;
                    if (j < 2147483647L) {
                        int recommendedTimeoutMillis = i72Var.a.getRecommendedTimeoutMillis((int) j, 7);
                        if (recommendedTimeoutMillis != Integer.MAX_VALUE) {
                            j2 = recommendedTimeoutMillis;
                        }
                        this.label = 1;
                        if (kotlinx.coroutines.a.i(j2, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                j2 = j;
                this.label = 1;
                if (kotlinx.coroutines.a.i(j2, this) == coroutineSingletons) {
                }
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        j18 j18Var = ((r0t0) this.$currentSnackbarData).b;
        if (j18Var.t() instanceof mf60) {
            j18Var.resumeWith(SnackbarResult.Dismissed);
        }
        return zy11.a;
    }
}
