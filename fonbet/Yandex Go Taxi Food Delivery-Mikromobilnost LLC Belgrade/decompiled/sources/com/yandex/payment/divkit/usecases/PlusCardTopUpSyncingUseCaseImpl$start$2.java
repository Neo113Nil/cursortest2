package com.yandex.payment.divkit.usecases;

import com.yandex.payment.sdk.core.data.PaymentSettings;
import defpackage.jcv0;
import defpackage.kq4;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qv90;
import defpackage.rwo;
import defpackage.sv90;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.y22;
import defpackage.zy11;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Z"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.usecases.PlusCardTopUpSyncingUseCaseImpl$start$2", f = "PlusCardTopUpSyncingUseCase.kt", l = {29, 30, 33}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class PlusCardTopUpSyncingUseCaseImpl$start$2 extends SuspendLambda implements wls {
    final /* synthetic */ PaymentSettings $paymentSettings;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    int I$5;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusCardTopUpSyncingUseCaseImpl$start$2(s sVar, PaymentSettings paymentSettings, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sVar;
        this.$paymentSettings = paymentSettings;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PlusCardTopUpSyncingUseCaseImpl$start$2 plusCardTopUpSyncingUseCaseImpl$start$2 = new PlusCardTopUpSyncingUseCaseImpl$start$2(this.this$0, this.$paymentSettings, continuation);
        plusCardTopUpSyncingUseCaseImpl$start$2.L$0 = obj;
        return plusCardTopUpSyncingUseCaseImpl$start$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusCardTopUpSyncingUseCaseImpl$start$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ee, code lost:
    
        if (r15 != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0183, code lost:
    
        r2 = r7;
        r7 = r3;
        r3 = r2;
        r2 = r9;
        r5 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x015e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x014d -> B:7:0x0152). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        Ref$BooleanRef ref$BooleanRef;
        int i2;
        s sVar;
        PaymentSettings paymentSettings;
        int i3;
        Object obj2;
        int i4;
        int i5;
        int i6;
        char c;
        Object obj3;
        int i7;
        int i8;
        Object a;
        int i9;
        int i10;
        PaymentSettings paymentSettings2;
        s sVar2;
        Ref$BooleanRef ref$BooleanRef2;
        String total;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = this.label;
        char c2 = 3;
        int i12 = 2;
        int i13 = 0;
        int i14 = 1;
        Object obj4 = null;
        if (i11 == 0) {
            kotlin.b.b(obj);
            i = 10;
            ref$BooleanRef = new Ref$BooleanRef();
            i2 = 0;
            sVar = this.this$0;
            paymentSettings = this.$paymentSettings;
            i3 = 0;
            if (i3 < i) {
            }
            if (!ref$BooleanRef.element) {
            }
            return Boolean.valueOf(ref$BooleanRef.element);
        }
        if (i11 != 1) {
            if (i11 == 2) {
                int i15 = this.I$4;
                i3 = this.I$3;
                int i16 = this.I$2;
                i = this.I$1;
                i2 = this.I$0;
                paymentSettings = (PaymentSettings) this.L$3;
                sVar = (s) this.L$2;
                ref$BooleanRef = (Ref$BooleanRef) this.L$1;
                kotlin.b.b(obj);
                i4 = 1;
                i5 = i16;
                obj2 = obj;
                i6 = i15;
                Result result = (Result) obj2;
                if (result != null) {
                    Object value = result.getValue();
                    if (!(value instanceof Result.Failure)) {
                        kq4 kq4Var = (kq4) value;
                        m mVar = sVar.a;
                        i8 = i4;
                        BigDecimal bigDecimal = (paymentSettings == null || (total = paymentSettings.getTotal()) == null) ? BigDecimal.ZERO : new BigDecimal(total);
                        String currency = paymentSettings != null ? paymentSettings.getCurrency() : null;
                        if (currency == null) {
                            currency = "";
                        }
                        kq4 kq4Var2 = new kq4(bigDecimal, currency);
                        obj3 = null;
                        this.L$0 = null;
                        this.L$1 = ref$BooleanRef;
                        this.L$2 = sVar;
                        this.L$3 = paymentSettings;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.L$6 = value;
                        this.L$7 = null;
                        this.I$0 = i2;
                        this.I$1 = i;
                        this.I$2 = i5;
                        this.I$3 = i3;
                        this.I$4 = i6;
                        i13 = 0;
                        this.I$5 = 0;
                        c = 3;
                        this.label = 3;
                        a = mVar.a(kq4Var, kq4Var2, this);
                        if (a != coroutineSingletons) {
                            i9 = i;
                            i10 = i2;
                            paymentSettings2 = paymentSettings;
                            sVar2 = sVar;
                            ref$BooleanRef2 = ref$BooleanRef;
                            if (!((jcv0) a).a.equals(BigDecimal.ZERO)) {
                            }
                        }
                        return coroutineSingletons;
                    }
                }
                Object obj5 = obj4;
                c = c2;
                obj3 = obj5;
                i7 = i4;
                i13 = 0;
                i3 = i5 + 1;
                char c3 = c;
                obj4 = obj3;
                c2 = c3;
                i14 = i7;
                i12 = 2;
                if (i3 < i) {
                }
                if (!ref$BooleanRef.element) {
                }
                return Boolean.valueOf(ref$BooleanRef.element);
            }
            if (i11 != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i17 = this.I$3;
            int i18 = this.I$2;
            i9 = this.I$1;
            i10 = this.I$0;
            paymentSettings2 = (PaymentSettings) this.L$3;
            sVar2 = (s) this.L$2;
            ref$BooleanRef2 = (Ref$BooleanRef) this.L$1;
            kotlin.b.b(obj);
            c = 3;
            obj3 = null;
            i8 = 1;
            i5 = i18;
            i3 = i17;
            a = obj;
            if (!((jcv0) a).a.equals(BigDecimal.ZERO)) {
                rwo rwoVar = sVar2.b;
                qv90.a.getClass();
                ((y22) rwoVar).a(sv90.Y(i3 + 1));
                ref$BooleanRef2.element = i8;
                ref$BooleanRef = ref$BooleanRef2;
                if (!ref$BooleanRef.element) {
                    rwo rwoVar2 = this.this$0.b;
                    qv90.a.getClass();
                    ((y22) rwoVar2).a(sv90.X());
                }
                return Boolean.valueOf(ref$BooleanRef.element);
            }
            i7 = i8;
            ref$BooleanRef = ref$BooleanRef2;
            sVar = sVar2;
            paymentSettings = paymentSettings2;
            i2 = i10;
            i = i9;
            i3 = i5 + 1;
            char c32 = c;
            obj4 = obj3;
            c2 = c32;
            i14 = i7;
            i12 = 2;
            if (i3 < i) {
                this.L$0 = obj4;
                this.L$1 = ref$BooleanRef;
                this.L$2 = sVar;
                this.L$3 = paymentSettings;
                this.L$4 = obj4;
                this.L$5 = obj4;
                this.L$6 = obj4;
                this.L$7 = obj4;
                this.I$0 = i2;
                this.I$1 = i;
                this.I$2 = i3;
                this.I$3 = i3;
                this.I$4 = i13;
                this.label = i14;
                i4 = i14;
                if (kotlinx.coroutines.a.i(1000L, this) != coroutineSingletons) {
                    i5 = i3;
                    i6 = 0;
                    tls tlsVar = sVar.d;
                    this.L$0 = obj4;
                    this.L$1 = ref$BooleanRef;
                    this.L$2 = sVar;
                    this.L$3 = paymentSettings;
                    this.L$4 = obj4;
                    this.I$0 = i2;
                    this.I$1 = i;
                    this.I$2 = i5;
                    this.I$3 = i3;
                    this.I$4 = i6;
                    this.label = i12;
                    obj2 = tlsVar.invoke(this);
                }
                return coroutineSingletons;
            }
            if (!ref$BooleanRef.element) {
            }
            return Boolean.valueOf(ref$BooleanRef.element);
        }
        int i19 = this.I$4;
        i3 = this.I$3;
        int i20 = this.I$2;
        i = this.I$1;
        i2 = this.I$0;
        paymentSettings = (PaymentSettings) this.L$3;
        sVar = (s) this.L$2;
        ref$BooleanRef = (Ref$BooleanRef) this.L$1;
        kotlin.b.b(obj);
        i4 = 1;
        i5 = i20;
        i6 = i19;
        tls tlsVar2 = sVar.d;
        this.L$0 = obj4;
        this.L$1 = ref$BooleanRef;
        this.L$2 = sVar;
        this.L$3 = paymentSettings;
        this.L$4 = obj4;
        this.I$0 = i2;
        this.I$1 = i;
        this.I$2 = i5;
        this.I$3 = i3;
        this.I$4 = i6;
        this.label = i12;
        obj2 = tlsVar2.invoke(this);
    }
}
