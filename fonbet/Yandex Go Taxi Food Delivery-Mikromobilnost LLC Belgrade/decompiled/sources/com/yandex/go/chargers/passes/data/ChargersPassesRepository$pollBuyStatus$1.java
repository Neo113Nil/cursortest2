package com.yandex.go.chargers.passes.data;

import com.ybsdk.widgets.common.BlendingGradientView;
import defpackage.e3n;
import defpackage.kp50;
import defpackage.mvg;
import defpackage.nia;
import defpackage.ny61;
import defpackage.o430;
import defpackage.pia;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lpia;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.passes.data.ChargersPassesRepository$pollBuyStatus$1", f = "ChargersPassesRepository.kt", l = {BlendingGradientView.BASE_ALPHA, 154, HProv.PP_LICENSE}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersPassesRepository$pollBuyStatus$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $operationId;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersPassesRepository$pollBuyStatus$1(r0 r0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = r0Var;
        this.$operationId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersPassesRepository$pollBuyStatus$1 chargersPassesRepository$pollBuyStatus$1 = new ChargersPassesRepository$pollBuyStatus$1(this.this$0, this.$operationId, continuation);
        chargersPassesRepository$pollBuyStatus$1.L$0 = obj;
        return chargersPassesRepository$pollBuyStatus$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersPassesRepository$pollBuyStatus$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0066, code lost:
    
        if (r12 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x009f -> B:7:0x004e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        r0 r0Var;
        r0 r0Var2;
        String str2;
        pia piaVar;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            r0 r0Var3 = this.this$0;
            str = this.$operationId;
            r0Var = r0Var3;
        } else {
            if (i == 1) {
                str = (String) this.L$2;
                r0Var = (r0) this.L$1;
                kotlin.b.b(obj);
                pia piaVar2 = (pia) obj;
                this.L$0 = vprVar;
                this.L$1 = r0Var;
                this.L$2 = str;
                this.L$3 = piaVar2;
                this.label = 2;
                if (vprVar.emit(piaVar2, this) != coroutineSingletons) {
                    r0Var2 = r0Var;
                    str2 = str;
                    piaVar = piaVar2;
                    if (piaVar instanceof nia) {
                    }
                    return zy11.a;
                }
                return coroutineSingletons;
            }
            if (i == 2) {
                piaVar = (pia) this.L$3;
                str2 = (String) this.L$2;
                r0Var2 = (r0) this.L$1;
                kotlin.b.b(obj);
                if (piaVar instanceof nia) {
                    o430 o430Var = e3n.b;
                    long V = kp50.V(2000L, DurationUnit.MILLISECONDS);
                    this.L$0 = vprVar;
                    this.L$1 = r0Var2;
                    this.L$2 = str2;
                    this.L$3 = null;
                    this.label = 3;
                    if (kotlinx.coroutines.a.j(V, this) != coroutineSingletons) {
                        str = str2;
                        r0Var = r0Var2;
                    }
                    return coroutineSingletons;
                }
                return zy11.a;
            }
            if (i != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.L$2;
            r0Var = (r0) this.L$1;
            kotlin.b.b(obj);
        }
        if (kotlinx.coroutines.a.p(get_context())) {
            this.L$0 = vprVar;
            this.L$1 = r0Var;
            this.L$2 = str;
            this.L$3 = null;
            this.label = 1;
            obj = r0Var.b(str, this);
        }
        return zy11.a;
    }
}
