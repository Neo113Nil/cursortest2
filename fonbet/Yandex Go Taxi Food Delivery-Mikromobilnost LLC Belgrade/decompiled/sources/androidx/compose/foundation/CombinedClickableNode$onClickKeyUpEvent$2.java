package androidx.compose.foundation;

import defpackage.mvg;
import defpackage.npb1;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xic;
import defpackage.xp31;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.CombinedClickableNode$onClickKeyUpEvent$2", f = "Clickable.kt", l = {1628, 1632}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class CombinedClickableNode$onClickKeyUpEvent$2 extends SuspendLambda implements wls {
    final /* synthetic */ long $keyCode;
    long J$0;
    long J$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedClickableNode$onClickKeyUpEvent$2(d dVar, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$keyCode = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CombinedClickableNode$onClickKeyUpEvent$2(this.this$0, this.$keyCode, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CombinedClickableNode$onClickKeyUpEvent$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        if (kotlinx.coroutines.a.i(r4 - r6, r10) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        if (kotlinx.coroutines.a.i(r6, r10) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long a;
        long e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            xp31 xp31Var = (xp31) npb1.c(this.this$0, androidx.compose.ui.platform.j.t);
            a = xp31Var.a();
            e = xp31Var.e();
            this.J$0 = a;
            this.J$1 = e;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                this.this$0.B.invoke();
                return zy11.a;
            }
            e = this.J$1;
            a = this.J$0;
            kotlin.b.b(obj);
        }
        xic xicVar = (xic) this.this$0.V.e(this.$keyCode);
        if (xicVar != null) {
            xicVar.b = true;
        }
        this.label = 2;
    }
}
