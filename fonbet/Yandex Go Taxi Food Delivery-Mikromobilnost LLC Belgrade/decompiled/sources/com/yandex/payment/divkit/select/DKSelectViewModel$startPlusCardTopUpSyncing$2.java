package com.yandex.payment.divkit.select;

import com.yandex.payment.sdk.core.data.PaymentSettings;
import defpackage.aeq0;
import defpackage.jcv0;
import defpackage.kq4;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qv90;
import defpackage.rwo;
import defpackage.sv90;
import defpackage.tse;
import defpackage.tyh0;
import defpackage.uv90;
import defpackage.wga0;
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
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.select.DKSelectViewModel$startPlusCardTopUpSyncing$2", f = "DKSelectViewModel.kt", l = {500, 504, 505, 509, 524, 533, 534}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class DKSelectViewModel$startPlusCardTopUpSyncing$2 extends SuspendLambda implements wls {
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
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DKSelectViewModel$startPlusCardTopUpSyncing$2(h hVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DKSelectViewModel$startPlusCardTopUpSyncing$2 dKSelectViewModel$startPlusCardTopUpSyncing$2 = new DKSelectViewModel$startPlusCardTopUpSyncing$2(this.this$0, continuation);
        dKSelectViewModel$startPlusCardTopUpSyncing$2.L$0 = obj;
        return dKSelectViewModel$startPlusCardTopUpSyncing$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DKSelectViewModel$startPlusCardTopUpSyncing$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x022f, code lost:
    
        if (r5 == r2) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x01dc, code lost:
    
        if (r5 == r2) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c3, code lost:
    
        if (r5 == r2) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ec  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0193 -> B:19:0x0198). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x01e6 -> B:24:0x01e7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x01ec -> B:25:0x01e9). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref$BooleanRef ref$BooleanRef;
        h hVar;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Ref$BooleanRef ref$BooleanRef2;
        int i6;
        h hVar2;
        int i7;
        int i8;
        int i9;
        int i10;
        Object obj2;
        Result result;
        int i11;
        boolean z;
        PaymentSettings paymentSettings;
        BigDecimal bigDecimal;
        Object a;
        h hVar3;
        int i12;
        int i13;
        String total;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i14 = this.label;
        int i15 = 0;
        zy11 zy11Var = zy11.a;
        boolean z2 = true;
        PaymentSettings paymentSettings2 = null;
        switch (i14) {
            case 0:
                kotlin.b.b(obj);
                r0 r0Var = this.this$0.W;
                PlusCardTopUpState plusCardTopUpState = PlusCardTopUpState.LOADING;
                this.L$0 = tseVar;
                this.label = 1;
                r0Var.emit(plusCardTopUpState, this);
                break;
            case 1:
                kotlin.b.b(obj);
                ref$BooleanRef = new Ref$BooleanRef();
                hVar = this.this$0;
                i = 0;
                i2 = 0;
                i3 = 10;
                if (i < i3) {
                    this.L$0 = paymentSettings2;
                    this.L$1 = ref$BooleanRef;
                    this.L$2 = hVar;
                    this.L$3 = paymentSettings2;
                    this.L$4 = paymentSettings2;
                    this.L$5 = paymentSettings2;
                    this.L$6 = paymentSettings2;
                    this.L$7 = paymentSettings2;
                    this.I$0 = i2;
                    this.I$1 = i3;
                    this.I$2 = i;
                    this.I$3 = i;
                    this.I$4 = i15;
                    this.label = 2;
                    if (kotlinx.coroutines.a.i(1000L, this) != coroutineSingletons) {
                        ref$BooleanRef2 = ref$BooleanRef;
                        i5 = i;
                        i4 = i15;
                        com.yandex.payment.sdk.core.utils.a aVar = com.yandex.payment.sdk.core.utils.a.a;
                        this.L$0 = paymentSettings2;
                        this.L$1 = ref$BooleanRef2;
                        this.L$2 = hVar;
                        this.L$3 = paymentSettings2;
                        this.I$0 = i2;
                        this.I$1 = i3;
                        this.I$2 = i5;
                        this.I$3 = i;
                        this.I$4 = i4;
                        this.label = 3;
                        obj2 = aVar.b(this);
                        if (obj2 != coroutineSingletons) {
                            int i16 = i;
                            i6 = i4;
                            hVar2 = hVar;
                            i7 = i2;
                            i8 = i3;
                            i9 = i5;
                            i10 = i16;
                            result = (Result) obj2;
                            if (result == null) {
                                Object value = result.getValue();
                                if (value instanceof Result.Failure) {
                                    i11 = i15;
                                    z = true;
                                    h hVar4 = hVar2;
                                    ref$BooleanRef = ref$BooleanRef2;
                                    int i17 = i9 + 1;
                                    i3 = i8;
                                    i2 = i7;
                                    z2 = z;
                                    hVar = hVar4;
                                    i = i17;
                                    i15 = i11;
                                    paymentSettings2 = null;
                                    if (i < i3) {
                                    }
                                } else {
                                    kq4 kq4Var = (kq4) value;
                                    uv90 uv90Var = hVar2.G;
                                    PaymentSettings g = uv90Var != null ? ((wga0) uv90Var).g() : paymentSettings2;
                                    com.yandex.payment.divkit.usecases.m mVar = hVar2.A;
                                    if (g == null || (total = g.getTotal()) == null) {
                                        paymentSettings = g;
                                        bigDecimal = BigDecimal.ZERO;
                                    } else {
                                        paymentSettings = g;
                                        bigDecimal = new BigDecimal(total);
                                    }
                                    String currency = paymentSettings != null ? paymentSettings.getCurrency() : null;
                                    if (currency == null) {
                                        currency = "";
                                    }
                                    kq4 kq4Var2 = new kq4(bigDecimal, currency);
                                    this.L$0 = null;
                                    this.L$1 = ref$BooleanRef2;
                                    this.L$2 = hVar2;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.L$5 = value;
                                    this.L$6 = null;
                                    this.L$7 = null;
                                    this.I$0 = i7;
                                    this.I$1 = i8;
                                    this.I$2 = i9;
                                    this.I$3 = i10;
                                    this.I$4 = i6;
                                    i11 = 0;
                                    this.I$5 = 0;
                                    this.label = 4;
                                    a = mVar.a(kq4Var, kq4Var2, this);
                                    if (a != coroutineSingletons) {
                                        Ref$BooleanRef ref$BooleanRef3 = ref$BooleanRef2;
                                        hVar3 = hVar2;
                                        ref$BooleanRef = ref$BooleanRef3;
                                        i12 = i6;
                                        i13 = 0;
                                        if (!((jcv0) a).a.equals(BigDecimal.ZERO)) {
                                            rwo rwoVar = hVar3.c;
                                            qv90.a.getClass();
                                            ((y22) rwoVar).a(sv90.Y(i10 + 1));
                                            ref$BooleanRef.element = true;
                                            r0 r0Var2 = hVar3.W;
                                            PlusCardTopUpState plusCardTopUpState2 = PlusCardTopUpState.DATA;
                                            this.L$0 = null;
                                            this.L$1 = ref$BooleanRef;
                                            this.L$2 = null;
                                            this.L$3 = null;
                                            this.L$4 = null;
                                            this.L$5 = null;
                                            this.L$6 = null;
                                            this.L$7 = null;
                                            this.I$0 = i7;
                                            this.I$1 = i10;
                                            this.I$2 = i12;
                                            this.I$3 = i13;
                                            this.label = 5;
                                            r0Var2.emit(plusCardTopUpState2, this);
                                            break;
                                        } else {
                                            h hVar5 = hVar3;
                                            ref$BooleanRef2 = ref$BooleanRef;
                                            hVar2 = hVar5;
                                            z = true;
                                            h hVar42 = hVar2;
                                            ref$BooleanRef = ref$BooleanRef2;
                                            int i172 = i9 + 1;
                                            i3 = i8;
                                            i2 = i7;
                                            z2 = z;
                                            hVar = hVar42;
                                            i = i172;
                                            i15 = i11;
                                            paymentSettings2 = null;
                                            if (i < i3) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                i11 = i15;
                                z = z2;
                                h hVar422 = hVar2;
                                ref$BooleanRef = ref$BooleanRef2;
                                int i1722 = i9 + 1;
                                i3 = i8;
                                i2 = i7;
                                z2 = z;
                                hVar = hVar422;
                                i = i1722;
                                i15 = i11;
                                paymentSettings2 = null;
                                if (i < i3) {
                                }
                            }
                        }
                    }
                }
                if (!ref$BooleanRef.element) {
                    rwo rwoVar2 = this.this$0.c;
                    qv90.a.getClass();
                    ((y22) rwoVar2).a(sv90.X());
                    r0 r0Var3 = this.this$0.W;
                    PlusCardTopUpState plusCardTopUpState3 = PlusCardTopUpState.DATA;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.label = 6;
                    r0Var3.emit(plusCardTopUpState3, this);
                    break;
                }
            case 2:
                i4 = this.I$4;
                i = this.I$3;
                i5 = this.I$2;
                i3 = this.I$1;
                i2 = this.I$0;
                hVar = (h) this.L$2;
                ref$BooleanRef2 = (Ref$BooleanRef) this.L$1;
                kotlin.b.b(obj);
                com.yandex.payment.sdk.core.utils.a aVar2 = com.yandex.payment.sdk.core.utils.a.a;
                this.L$0 = paymentSettings2;
                this.L$1 = ref$BooleanRef2;
                this.L$2 = hVar;
                this.L$3 = paymentSettings2;
                this.I$0 = i2;
                this.I$1 = i3;
                this.I$2 = i5;
                this.I$3 = i;
                this.I$4 = i4;
                this.label = 3;
                obj2 = aVar2.b(this);
                if (obj2 != coroutineSingletons) {
                }
            case 3:
                int i18 = this.I$4;
                int i19 = this.I$3;
                int i20 = this.I$2;
                int i21 = this.I$1;
                int i22 = this.I$0;
                h hVar6 = (h) this.L$2;
                ref$BooleanRef2 = (Ref$BooleanRef) this.L$1;
                kotlin.b.b(obj);
                i6 = i18;
                hVar2 = hVar6;
                i7 = i22;
                i8 = i21;
                i9 = i20;
                i10 = i19;
                obj2 = obj;
                result = (Result) obj2;
                if (result == null) {
                }
                break;
            case 4:
                int i23 = this.I$5;
                int i24 = this.I$4;
                i10 = this.I$3;
                i9 = this.I$2;
                i8 = this.I$1;
                i7 = this.I$0;
                hVar3 = (h) this.L$2;
                Ref$BooleanRef ref$BooleanRef4 = (Ref$BooleanRef) this.L$1;
                kotlin.b.b(obj);
                i12 = i24;
                i11 = 0;
                a = obj;
                i13 = i23;
                ref$BooleanRef = ref$BooleanRef4;
                if (!((jcv0) a).a.equals(BigDecimal.ZERO)) {
                }
                break;
            case 5:
                ref$BooleanRef = (Ref$BooleanRef) this.L$1;
                kotlin.b.b(obj);
                if (!ref$BooleanRef.element) {
                }
            case 6:
                kotlin.b.b(obj);
                n0 n0Var = this.this$0.S;
                aeq0 aeq0Var = new aeq0(tyh0.paymentsdk_error, tyh0.paymentsdk_error_create_card);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 7;
                return n0Var.emit(aeq0Var, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
            case 7:
                kotlin.b.b(obj);
                return zy11Var;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
