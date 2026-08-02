package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TextContextMenuToolbarHandlerModifier.kt */
@b6l(c = "androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode$show$1", f = "TextContextMenuToolbarHandlerModifier.kt", l = {205, 206, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class mdo0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ gdo0 $provider;
    Object L$0;
    int label;
    final /* synthetic */ ndo0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdo0(ndo0 ndo0Var, gdo0 gdo0Var, spj<? super mdo0> spjVar) {
        super(2, spjVar);
        this.this$0 = ndo0Var;
        this.$provider = gdo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new mdo0(this.this$0, this.$provider, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((mdo0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r7.invoke(r6) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        if (r7.a(r1, r6) == r0) goto L37;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (Throwable th2) {
            izs<? super spj<? super s3q0>, ? extends Object> izsVar = this.this$0.t;
            if (izsVar == null) {
                throw th2;
            }
            this.L$0 = th2;
            this.label = 4;
            if (izsVar.invoke(this) != coroutineSingletons) {
                th = th2;
            }
        }
        if (i == 0) {
            kotlin.a.a(obj);
            izs<? super spj<? super s3q0>, ? extends Object> izsVar2 = this.this$0.s;
            if (izsVar2 != null) {
                this.label = 1;
                if (izsVar2.invoke(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.a.a(obj);
                    izs<? super spj<? super s3q0>, ? extends Object> izsVar3 = this.this$0.t;
                    if (izsVar3 != null) {
                        this.label = 3;
                    }
                    return s3q0.a;
                }
                if (i == 3) {
                    kotlin.a.a(obj);
                    return s3q0.a;
                }
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = (Throwable) this.L$0;
                kotlin.a.a(obj);
                throw th;
            }
            kotlin.a.a(obj);
        }
        gdo0 gdo0Var = this.$provider;
        ndo0 ndo0Var = this.this$0;
        this.label = 2;
    }
}
