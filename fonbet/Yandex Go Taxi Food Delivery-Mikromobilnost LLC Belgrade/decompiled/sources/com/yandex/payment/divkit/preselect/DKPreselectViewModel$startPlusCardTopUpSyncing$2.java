package com.yandex.payment.divkit.preselect;

import com.yandex.payment.divkit.select.PlusCardTopUpState;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qv90;
import defpackage.rwo;
import defpackage.sv90;
import defpackage.tse;
import defpackage.tyh0;
import defpackage.wls;
import defpackage.y22;
import defpackage.zve0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.preselect.DKPreselectViewModel$startPlusCardTopUpSyncing$2", f = "DKPreselectViewModel.kt", l = {526, 530, 531, 540, 548, 549}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class DKPreselectViewModel$startPlusCardTopUpSyncing$2 extends SuspendLambda implements wls {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DKPreselectViewModel$startPlusCardTopUpSyncing$2(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DKPreselectViewModel$startPlusCardTopUpSyncing$2 dKPreselectViewModel$startPlusCardTopUpSyncing$2 = new DKPreselectViewModel$startPlusCardTopUpSyncing$2(this.this$0, continuation);
        dKPreselectViewModel$startPlusCardTopUpSyncing$2.L$0 = obj;
        return dKPreselectViewModel$startPlusCardTopUpSyncing$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DKPreselectViewModel$startPlusCardTopUpSyncing$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0156, code lost:
    
        if (r4 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00dc, code lost:
    
        if (r15 != r1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        if (r4 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00dc -> B:20:0x0055). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        f fVar;
        int i;
        Ref$BooleanRef ref$BooleanRef;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        f fVar2;
        Ref$BooleanRef ref$BooleanRef2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = this.label;
        zy11 zy11Var = zy11.a;
        switch (i9) {
            case 0:
                kotlin.b.b(obj);
                r0 r0Var = this.this$0.J;
                PlusCardTopUpState plusCardTopUpState = PlusCardTopUpState.LOADING;
                this.L$0 = tseVar;
                this.label = 1;
                r0Var.emit(plusCardTopUpState, this);
                break;
            case 1:
                kotlin.b.b(obj);
                Ref$BooleanRef ref$BooleanRef3 = new Ref$BooleanRef();
                fVar = this.this$0;
                i = 10;
                ref$BooleanRef = ref$BooleanRef3;
                i2 = 0;
                i3 = 0;
                if (i2 < i) {
                    this.L$0 = null;
                    this.L$1 = ref$BooleanRef;
                    this.L$2 = fVar;
                    this.L$3 = null;
                    this.I$0 = i3;
                    this.I$1 = i;
                    this.I$2 = i2;
                    this.I$3 = i2;
                    this.I$4 = 0;
                    this.label = 2;
                    if (kotlinx.coroutines.a.i(1000L, this) != coroutineSingletons) {
                        fVar2 = fVar;
                        i7 = i;
                        i4 = 0;
                        i8 = i3;
                        i5 = i2;
                        i6 = i5;
                        com.yandex.payment.sdk.core.utils.a aVar = com.yandex.payment.sdk.core.utils.a.a;
                        this.L$0 = null;
                        this.L$1 = ref$BooleanRef;
                        this.L$2 = fVar2;
                        this.L$3 = null;
                        this.I$0 = i8;
                        this.I$1 = i7;
                        this.I$2 = i6;
                        this.I$3 = i5;
                        this.I$4 = i4;
                        this.label = 3;
                        obj = aVar.b(this);
                        break;
                    }
                }
                if (!ref$BooleanRef.element) {
                    rwo rwoVar = this.this$0.c;
                    qv90.a.getClass();
                    ((y22) rwoVar).a(sv90.X());
                    r0 r0Var2 = this.this$0.J;
                    PlusCardTopUpState plusCardTopUpState2 = PlusCardTopUpState.DATA;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 5;
                    r0Var2.emit(plusCardTopUpState2, this);
                    break;
                }
            case 2:
                i4 = this.I$4;
                i5 = this.I$3;
                i6 = this.I$2;
                i7 = this.I$1;
                i8 = this.I$0;
                fVar2 = (f) this.L$2;
                ref$BooleanRef = (Ref$BooleanRef) this.L$1;
                kotlin.b.b(obj);
                com.yandex.payment.sdk.core.utils.a aVar2 = com.yandex.payment.sdk.core.utils.a.a;
                this.L$0 = null;
                this.L$1 = ref$BooleanRef;
                this.L$2 = fVar2;
                this.L$3 = null;
                this.I$0 = i8;
                this.I$1 = i7;
                this.I$2 = i6;
                this.I$3 = i5;
                this.I$4 = i4;
                this.label = 3;
                obj = aVar2.b(this);
                break;
            case 3:
                i4 = this.I$4;
                i5 = this.I$3;
                i6 = this.I$2;
                i7 = this.I$1;
                i8 = this.I$0;
                fVar2 = (f) this.L$2;
                ref$BooleanRef = (Ref$BooleanRef) this.L$1;
                kotlin.b.b(obj);
                int i10 = i5;
                int i11 = i4;
                fVar = fVar2;
                int i12 = i6;
                Result result = (Result) obj;
                if (result != null) {
                    Object value = result.getValue();
                    if (!(value instanceof Result.Failure)) {
                        rwo rwoVar2 = fVar.c;
                        qv90.a.getClass();
                        ((y22) rwoVar2).a(sv90.Y(i10 + 1));
                        ref$BooleanRef.element = true;
                        r0 r0Var3 = fVar.J;
                        PlusCardTopUpState plusCardTopUpState3 = PlusCardTopUpState.DATA;
                        this.L$0 = null;
                        this.L$1 = ref$BooleanRef;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.I$0 = i8;
                        this.I$1 = i10;
                        this.I$2 = i11;
                        this.I$3 = 0;
                        this.label = 4;
                        r0Var3.emit(plusCardTopUpState3, this);
                        if (zy11Var != coroutineSingletons) {
                            ref$BooleanRef2 = ref$BooleanRef;
                            ref$BooleanRef = ref$BooleanRef2;
                            if (!ref$BooleanRef.element) {
                            }
                        }
                    }
                }
                i2 = i12 + 1;
                i = i7;
                i3 = i8;
                if (i2 < i) {
                }
                if (!ref$BooleanRef.element) {
                }
            case 4:
                ref$BooleanRef2 = (Ref$BooleanRef) this.L$1;
                kotlin.b.b(obj);
                ref$BooleanRef = ref$BooleanRef2;
                if (!ref$BooleanRef.element) {
                }
            case 5:
                kotlin.b.b(obj);
                n0 n0Var = this.this$0.F;
                zve0 zve0Var = new zve0(tyh0.paymentsdk_error, tyh0.paymentsdk_error_create_card);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 6;
                return n0Var.emit(zve0Var, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
            case 6:
                kotlin.b.b(obj);
                return zy11Var;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
