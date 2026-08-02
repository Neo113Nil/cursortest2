package androidx.compose.foundation;

import defpackage.jxe0;
import defpackage.kxe0;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zx40;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1", f = "Clickable.kt", l = {2157, 2162, 2163}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class AbstractClickableNode$handlePressInteractionRelease$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ zx40 $interactionSource;
    final /* synthetic */ l8x $job;
    final /* synthetic */ long $offset;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteractionRelease$1$1(l8x l8xVar, long j, zx40 zx40Var, Continuation continuation) {
        super(2, continuation);
        this.$job = l8xVar;
        this.$offset = j;
        this.$interactionSource = zx40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AbstractClickableNode$handlePressInteractionRelease$1$1(this.$job, this.$offset, this.$interactionSource, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AbstractClickableNode$handlePressInteractionRelease$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
    
        if (((defpackage.ay40) r8).a(r1, r7) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (((defpackage.ay40) r5).a(r8, r7) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r8.u0(r7) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kxe0 kxe0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            l8x l8xVar = this.$job;
            this.label = 1;
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kxe0Var = (kxe0) this.L$0;
            kotlin.b.b(obj);
            zx40 zx40Var = this.$interactionSource;
            this.L$0 = null;
            this.label = 3;
        }
        jxe0 jxe0Var = new jxe0(this.$offset);
        kxe0Var = new kxe0(jxe0Var);
        zx40 zx40Var2 = this.$interactionSource;
        this.L$0 = kxe0Var;
        this.label = 2;
    }
}
