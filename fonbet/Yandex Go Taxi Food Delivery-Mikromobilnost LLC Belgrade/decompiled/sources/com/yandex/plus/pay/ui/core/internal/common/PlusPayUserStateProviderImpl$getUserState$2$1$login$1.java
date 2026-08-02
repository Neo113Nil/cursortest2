package com.yandex.plus.pay.ui.core.internal.common;

import com.yandex.plus.pay.api.model.PlusPayUserStatus;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.core.internal.common.PlusPayUserStateProviderImpl$getUserState$2$1$login$1", f = "PlusPayUserStateProviderImpl.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PlusPayUserStateProviderImpl$getUserState$2$1$login$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $forceUpdate;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusPayUserStateProviderImpl$getUserState$2$1$login$1(a aVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$forceUpdate = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PlusPayUserStateProviderImpl$getUserState$2$1$login$1 plusPayUserStateProviderImpl$getUserState$2$1$login$1 = new PlusPayUserStateProviderImpl$getUserState$2$1$login$1(this.this$0, this.$forceUpdate, continuation);
        plusPayUserStateProviderImpl$getUserState$2$1$login$1.L$0 = obj;
        return plusPayUserStateProviderImpl$getUserState$2$1$login$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusPayUserStateProviderImpl$getUserState$2$1$login$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0079  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object failure;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                String str = this.this$0.e;
                if (str != null) {
                    if (this.$forceUpdate) {
                        str = null;
                    }
                    if (str != null) {
                        return str;
                    }
                }
                com.yandex.plus.pay.internal.feature.user.a aVar = (com.yandex.plus.pay.internal.feature.user.a) ((com.yandex.plus.pay.internal.b) this.this$0.c).d.getValue();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                obj = aVar.a(this);
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
            obj2 = ((PlusPayUserStatus) obj).getLogin();
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
            obj2 = failure;
            String str2 = (String) (obj2 instanceof Result.Failure ? null : obj2);
            this.this$0.e = str2;
            return str2;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
            obj2 = failure;
            String str22 = (String) (obj2 instanceof Result.Failure ? null : obj2);
            this.this$0.e = str22;
            return str22;
        }
        String str222 = (String) (obj2 instanceof Result.Failure ? null : obj2);
        this.this$0.e = str222;
        return str222;
    }
}
