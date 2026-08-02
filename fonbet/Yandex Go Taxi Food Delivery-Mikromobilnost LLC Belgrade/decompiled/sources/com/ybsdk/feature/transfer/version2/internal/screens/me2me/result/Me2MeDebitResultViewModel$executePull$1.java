package com.ybsdk.feature.transfer.version2.internal.screens.me2me.result;

import com.ybsdk.feature.transfer.version2.api.TransferTwoFactorScreenProvider$Request;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.domain.Me2MeDebitResultEntity$Status;
import defpackage.ct11;
import defpackage.fi9;
import defpackage.k910;
import defpackage.mjb1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pi00;
import defpackage.pi01;
import defpackage.pk11;
import defpackage.pz40;
import defpackage.qk11;
import defpackage.rk11;
import defpackage.sk11;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.Me2MeDebitResultViewModel$executePull$1", f = "Me2MeDebitResultViewModel.kt", l = {61, 71, 80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class Me2MeDebitResultViewModel$executePull$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $verificationToken;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Me2MeDebitResultViewModel$executePull$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$verificationToken = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Me2MeDebitResultViewModel$executePull$1(this.this$0, this.$verificationToken, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((Me2MeDebitResultViewModel$executePull$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b5, code lost:
    
        if (com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.a.e0(r1, r2, r3, r12) == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010a, code lost:
    
        if (r2.collect(r4, r12) == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x003d, code lost:
    
        if (r13 == r0) goto L41;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object d;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        pk11 pk11Var;
        r0 r0Var3;
        Object value3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.domain.a aVar2 = aVar.G;
            String str = ((k910) aVar.X()).g;
            String str2 = this.$verificationToken;
            this.label = 1;
            d = aVar2.d(str, str2, this);
        } else {
            if (i != 1) {
                if (i == 2 || i == 3) {
                    b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            d = ((Result) obj).getValue();
        }
        a aVar3 = this.this$0;
        Throwable a = Result.a(d);
        if (a != null) {
            x4c.g("[me2me debit] can't get transferId", a, null, null, 12);
            pz40 Y = aVar3.Y();
            do {
                r0Var3 = (r0) Y;
                value3 = r0Var3.getValue();
            } while (!r0Var3.k(value3, mjb1.f(aVar3.B.getUndefinedResultPage(), Me2MeDebitResultEntity$Status.FAILED)));
            aVar3.F.A(((k910) aVar3.X()).b);
        }
        a aVar4 = this.this$0;
        if (!(d instanceof Result.Failure)) {
            sk11 sk11Var = (sk11) d;
            if (sk11Var instanceof pk11) {
                pz40 Y2 = aVar4.Y();
                do {
                    r0Var2 = (r0) Y2;
                    value2 = r0Var2.getValue();
                    pk11Var = (pk11) sk11Var;
                } while (!r0Var2.k(value2, k910.a((k910) value2, null, null, pk11Var.b, 63)));
                String str3 = pk11Var.a;
                TransferTwoFactorScreenProvider$Request transferTwoFactorScreenProvider$Request = TransferTwoFactorScreenProvider$Request.CONFIRM_ME2ME_DEBIT;
                this.L$0 = d;
                this.label = 2;
            } else if (sk11Var instanceof qk11) {
                pz40 Y3 = aVar4.Y();
                do {
                    r0Var = (r0) Y3;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, mjb1.e(aVar4.B.getUndefinedResultPage(), (ct11) sk11Var)));
                aVar4.F.A(((k910) aVar4.X()).b);
            } else {
                if (!(sk11Var instanceof rk11)) {
                    w511.b();
                    return null;
                }
                fi9 c = aVar4.G.c(((pi01) ((rk11) sk11Var).a).a);
                pi00 pi00Var = new pi00(i2, aVar4);
                this.L$0 = d;
                this.label = 3;
            }
        }
        return zy11.a;
    }
}
