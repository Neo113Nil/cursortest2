package com.yandex.go.payments.sbp.navigation;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.yandex.go.payments.sbp.data.model.SbpTokenBindResponse;
import com.yandex.go.payments.sbp.domain.ErrorType;
import com.yandex.go.payments.sbp.domain.d;
import defpackage.dpb;
import defpackage.eao;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.sy60;
import defpackage.tse;
import defpackage.uim0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.sbp.navigation.SbpTokenBindingRouterImpl$startBinding$1", f = "SbpTokenBindingRouterImpl.kt", l = {80, 85}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SbpTokenBindingRouterImpl$startBinding$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $bankId;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SbpTokenBindingRouterImpl$startBinding$1(c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$bankId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SbpTokenBindingRouterImpl$startBinding$1(this.this$0, this.$bankId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SbpTokenBindingRouterImpl$startBinding$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x003b, code lost:
    
        if (r13 == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ad  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        dpb dpbVar = dpb.a;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            d dVar = cVar.K;
            String str = this.$bankId;
            String str2 = cVar.E;
            this.label = 1;
            a = dVar.a(str, str2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.L$0;
                kotlin.b.b(obj);
                a = obj2;
                c cVar2 = this.this$0;
                if (Result.a(a) != null) {
                    eao a2 = cVar2.M.a(ErrorType.DEFAULT_ERROR);
                    cVar2.j(dpbVar);
                    cVar2.A((m950) cVar2.O.get(), new uim0(a2), sy60.Q2);
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        c cVar3 = this.this$0;
        if (!(a instanceof Result.Failure)) {
            SbpTokenBindResponse sbpTokenBindResponse = (SbpTokenBindResponse) a;
            d dVar2 = cVar3.K;
            Context context = cVar3.G;
            dVar2.getClass();
            String str3 = sbpTokenBindResponse.a;
            Intent addFlags = str3 != null ? new Intent("android.intent.action.VIEW", Uri.parse(str3)).addFlags(SelfTester_JCP.IMITA) : null;
            String str4 = sbpTokenBindResponse.b;
            Intent addFlags2 = str4 != null ? new Intent("android.intent.action.VIEW", Uri.parse(str4)).addFlags(SelfTester_JCP.IMITA) : null;
            if (addFlags != null) {
                try {
                    context.startActivity(addFlags);
                    cVar3.j(dpbVar);
                } catch (Exception unused) {
                }
                cVar3.r(new qu(9));
            }
            if (addFlags2 != null) {
                try {
                    context.startActivity(addFlags2);
                    cVar3.j(dpbVar);
                    cVar3.r(new qu(9));
                } catch (Exception unused2) {
                }
            }
            String str5 = sbpTokenBindResponse.c;
            this.L$0 = a;
            this.L$1 = null;
            this.label = 2;
            if (c.T(cVar3, str5, this) != coroutineSingletons) {
                obj2 = a;
                a = obj2;
            }
            return coroutineSingletons;
        }
        c cVar22 = this.this$0;
        if (Result.a(a) != null) {
        }
        return zy11.a;
    }
}
