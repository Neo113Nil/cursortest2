package androidx.datastore.core;

import defpackage.bvf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vcs0;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {114, 114}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
final class SimpleActor$offer$2 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ vcs0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleActor$offer$2(vcs0 vcs0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = vcs0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SimpleActor$offer$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SimpleActor$offer$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        if (r1.invoke(r6, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0055, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0048, code lost:
    
        if (r6 != r0) goto L15;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0053 -> B:6:0x0056). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        wls wlsVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (((AtomicInteger) this.this$0.d.b).get() <= 0) {
                ny61.r("Check failed.");
                return null;
            }
            bvf0.t(this.this$0.a);
            vcs0 vcs0Var = this.this$0;
            wlsVar = vcs0Var.b;
            kotlinx.coroutines.channels.a aVar = vcs0Var.c;
            this.L$0 = wlsVar;
            this.label = 1;
            aVar.getClass();
            obj = kotlinx.coroutines.channels.a.J(aVar, this);
        } else if (i == 1) {
            wlsVar = (wls) this.L$0;
            kotlin.b.b(obj);
            this.L$0 = null;
            this.label = 2;
        } else {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            if (((AtomicInteger) this.this$0.d.b).decrementAndGet() == 0) {
                return zy11.a;
            }
            bvf0.t(this.this$0.a);
            vcs0 vcs0Var2 = this.this$0;
            wlsVar = vcs0Var2.b;
            kotlinx.coroutines.channels.a aVar2 = vcs0Var2.c;
            this.L$0 = wlsVar;
            this.label = 1;
            aVar2.getClass();
            obj = kotlinx.coroutines.channels.a.J(aVar2, this);
        }
    }
}
