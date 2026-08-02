package com.yandex.fintechsdk.features.bdui.internal.presentation.action.card.pay.poll;

import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import com.yandex.fintechsdk.adapters.yb.sdk.impl.c;
import defpackage.fp51;
import defpackage.ig5;
import defpackage.jh5;
import defpackage.mvg;
import defpackage.nba1;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uxd0;
import defpackage.vm50;
import defpackage.vs90;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.features.bdui.internal.presentation.action.card.pay.poll.PollPayCardActionHandler$handle$4", f = "PollPayCardActionHandler.kt", l = {52, 69}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class PollPayCardActionHandler$handle$4 extends SuspendLambda implements wls {
    final /* synthetic */ ig5 $action;
    final /* synthetic */ fp51 $bankAdapter;
    final /* synthetic */ jh5 $context;
    final /* synthetic */ int $triesCount;
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollPayCardActionHandler$handle$4(int i, a aVar, ig5 ig5Var, fp51 fp51Var, jh5 jh5Var, Continuation continuation) {
        super(2, continuation);
        this.$triesCount = i;
        this.this$0 = aVar;
        this.$action = ig5Var;
        this.$bankAdapter = fp51Var;
        this.$context = jh5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PollPayCardActionHandler$handle$4(this.$triesCount, this.this$0, this.$action, this.$bankAdapter, this.$context, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PollPayCardActionHandler$handle$4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0070  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00d5 -> B:6:0x00da). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jh5 jh5Var;
        ig5 ig5Var;
        a aVar;
        fp51 fp51Var;
        int i;
        int i2;
        fp51 fp51Var2;
        Object obj2;
        a aVar2;
        jh5 jh5Var2;
        int i3;
        int i4;
        vs90 vs90Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = this.label;
        zy11 zy11Var = zy11.a;
        if (i5 == 0) {
            b.b(obj);
            int i6 = this.$triesCount;
            fp51 fp51Var3 = this.$bankAdapter;
            a aVar3 = this.this$0;
            ig5 ig5Var2 = this.$action;
            jh5Var = this.$context;
            ig5Var = ig5Var2;
            aVar = aVar3;
            fp51Var = fp51Var3;
            i = i6;
            i2 = 0;
            if (i2 < i) {
            }
        } else if (i5 == 1) {
            int i7 = this.I$2;
            int i8 = this.I$1;
            i3 = this.I$0;
            jh5Var2 = (jh5) this.L$3;
            ig5Var = (ig5) this.L$2;
            aVar2 = (a) this.L$1;
            fp51 fp51Var4 = (fp51) this.L$0;
            b.b(obj);
            i4 = i7;
            i2 = i8;
            fp51Var2 = fp51Var4;
            obj2 = obj;
            vs90Var = (vs90) obj2;
            if (vs90Var == null) {
            }
        } else {
            if (i5 != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = this.I$1;
            i = this.I$0;
            jh5 jh5Var3 = (jh5) this.L$3;
            ig5 ig5Var3 = (ig5) this.L$2;
            a aVar4 = (a) this.L$1;
            fp51 fp51Var5 = (fp51) this.L$0;
            b.b(obj);
            jh5Var = jh5Var3;
            fp51Var = fp51Var5;
            ig5Var = ig5Var3;
            aVar = aVar4;
            i2++;
            if (i2 < i) {
                this.L$0 = fp51Var;
                this.L$1 = aVar;
                this.L$2 = ig5Var;
                this.L$3 = jh5Var;
                this.I$0 = i;
                this.I$1 = i2;
                this.I$2 = i2;
                this.label = 1;
                c cVar = (c) fp51Var;
                obj2 = cVar.a(this);
                if (obj2 != coroutineSingletons) {
                    jh5 jh5Var4 = jh5Var;
                    aVar2 = aVar;
                    jh5Var2 = jh5Var4;
                    fp51Var2 = cVar;
                    i3 = i;
                    i4 = i2;
                    vs90Var = (vs90) obj2;
                    if (vs90Var == null) {
                        String str = vs90Var.a;
                        FlexAdapter flexAdapter = aVar2.b;
                        if (flexAdapter != null) {
                            uxd0 uxd0Var = (uxd0) ig5Var;
                            flexAdapter.updateStateValue(uxd0Var.c, uxd0Var.d, str);
                        }
                        vm50 vm50Var = ((uxd0) ig5Var).e;
                        if (vm50Var != null) {
                            jh5Var2.a.dispatch(vm50Var);
                        }
                        nba1.g(aVar2.a, i4 + 1, true);
                        return zy11Var;
                    }
                    long j = ((int) ((uxd0) ig5Var).b) * 1000;
                    this.L$0 = fp51Var2;
                    this.L$1 = aVar2;
                    this.L$2 = ig5Var;
                    this.L$3 = jh5Var2;
                    this.I$0 = i3;
                    this.I$1 = i2;
                    this.label = 2;
                    if (kotlinx.coroutines.a.i(j, this) != coroutineSingletons) {
                        a aVar5 = aVar2;
                        jh5Var = jh5Var2;
                        aVar = aVar5;
                        i = i3;
                        fp51Var = fp51Var2;
                        i2++;
                        if (i2 < i) {
                            nba1.g(this.this$0.a, this.$triesCount, false);
                            vm50 vm50Var2 = ((uxd0) this.$action).e;
                            if (vm50Var2 != null) {
                                this.$context.a.dispatch(vm50Var2);
                            }
                            return zy11Var;
                        }
                    }
                }
                return coroutineSingletons;
            }
        }
    }
}
