package com.yandex.plus.home.ybsdk;

import com.yandex.plus.log.api.LogPriority;
import defpackage.gqd0;
import defpackage.hqd0;
import defpackage.jqd0;
import defpackage.kqd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rkd0;
import defpackage.tse;
import defpackage.unr0;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collections;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ljqd0;", "<anonymous>", "(Ltse;)Ljqd0;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.ybsdk.TreasuryAdapterProxy$getShortcut$2", f = "TreasuryAdapterProxy.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TreasuryAdapterProxy$getShortcut$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $json;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TreasuryAdapterProxy$getShortcut$2(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$json = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TreasuryAdapterProxy$getShortcut$2 treasuryAdapterProxy$getShortcut$2 = new TreasuryAdapterProxy$getShortcut$2(this.this$0, this.$json, continuation);
        treasuryAdapterProxy$getShortcut$2.L$0 = obj;
        return treasuryAdapterProxy$getShortcut$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TreasuryAdapterProxy$getShortcut$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Result.Failure failure;
        Throwable a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                rkd0 rkd0Var = this.this$0.c;
                String str = this.$json;
                LogPriority logPriority = LogPriority.INFO;
                if (rkd0Var.e(logPriority)) {
                    rkd0Var.b(logPriority, "TreasuryAdapterProxy", unr0.l(')', "getShortcut(json=", str), null);
                }
                a aVar = this.this$0;
                String str2 = this.$json;
                kqd0 kqd0Var = aVar.a;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                obj = kqd0Var.b(str2, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
            obj = failure;
            a aVar2 = this.this$0;
            a = Result.a(obj);
            if (a != null) {
            }
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
            obj = failure;
            a aVar22 = this.this$0;
            a = Result.a(obj);
            if (a != null) {
            }
        }
        a aVar222 = this.this$0;
        a = Result.a(obj);
        if (a != null) {
            rkd0 rkd0Var2 = aVar222.c;
            LogPriority logPriority2 = LogPriority.ERROR;
            if (rkd0Var2.e(logPriority2)) {
                rkd0Var2.b(logPriority2, "TreasuryAdapterProxy", "getShortcut() error", a);
            }
            return new hqd0(Collections.singletonList(new gqd0(a, null)));
        }
        jqd0 jqd0Var = (jqd0) obj;
        rkd0 rkd0Var3 = aVar222.c;
        LogPriority logPriority3 = LogPriority.INFO;
        if (!rkd0Var3.e(logPriority3)) {
            return jqd0Var;
        }
        rkd0Var3.b(logPriority3, "TreasuryAdapterProxy", "getShortcut() success", null);
        return jqd0Var;
    }
}
