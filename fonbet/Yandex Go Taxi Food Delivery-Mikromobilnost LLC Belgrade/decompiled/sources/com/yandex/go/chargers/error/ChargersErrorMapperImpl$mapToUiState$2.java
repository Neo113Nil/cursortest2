package com.yandex.go.chargers.error;

import com.yandex.go.chargers.error.api.ChargersErrorCode;
import com.yandex.go.chargers.error.api.ChargersErrorUiState$Action;
import com.yandex.go.chargers.error.api.ChargersErrorUiState$Icon;
import defpackage.avj0;
import defpackage.ay9;
import defpackage.cy9;
import defpackage.dy9;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.ry9;
import defpackage.sy9;
import defpackage.tje;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lsy9;", "<anonymous>", "(Ltse;)Lsy9;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.error.ChargersErrorMapperImpl$mapToUiState$2", f = "ChargersErrorMapperImpl.kt", l = {52, 53}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersErrorMapperImpl$mapToUiState$2 extends SuspendLambda implements wls {
    final /* synthetic */ cy9 $chargersErrorDetails;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersErrorMapperImpl$mapToUiState$2(cy9 cy9Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$chargersErrorDetails = cy9Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersErrorMapperImpl$mapToUiState$2 chargersErrorMapperImpl$mapToUiState$2 = new ChargersErrorMapperImpl$mapToUiState$2(this.$chargersErrorDetails, this.this$0, continuation);
        chargersErrorMapperImpl$mapToUiState$2.L$0 = obj;
        return chargersErrorMapperImpl$mapToUiState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersErrorMapperImpl$mapToUiState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0288  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        ChargersErrorCode chargersErrorCode;
        ry9 ry9Var;
        ry9 ry9Var2;
        noh nohVar;
        ry9 ry9Var3;
        ry9 ry9Var4;
        CharSequence charSequence;
        ry9 ry9Var5;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ay9 ay9Var = ChargersErrorCode.Companion;
            String str = this.$chargersErrorDetails.a;
            ay9Var.getClass();
            Iterator<E> it = ChargersErrorCode.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (jl40.l(((ChargersErrorCode) obj2).getStringValue(), str)) {
                    break;
                }
            }
            chargersErrorCode = (ChargersErrorCode) obj2;
            if (chargersErrorCode == null) {
                chargersErrorCode = ChargersErrorCode.UNKNOWN;
            }
            qoh h = tje.h(tseVar, null, null, new ChargersErrorMapperImpl$mapToUiState$2$titleAsync$1(this.this$0, chargersErrorCode, this.$chargersErrorDetails, null), 3);
            qoh h2 = tje.h(tseVar, null, null, new ChargersErrorMapperImpl$mapToUiState$2$subtitleAsync$1(this.this$0, chargersErrorCode, this.$chargersErrorDetails, null), 3);
            zuj0 zuj0Var = this.this$0.a;
            int[] iArr = dy9.a;
            switch (iArr[chargersErrorCode.ordinal()]) {
                case 1:
                    ry9Var = new ry9(((avj0) zuj0Var).h(kyh0.common_close), ChargersErrorUiState$Action.CLOSE);
                    break;
                case 2:
                case 3:
                case 4:
                    ry9Var = new ry9(((avj0) zuj0Var).h(kyh0.common_close), ChargersErrorUiState$Action.CLOSE);
                    break;
                case 5:
                    ry9Var = new ry9(((avj0) zuj0Var).h(kyh0.common_close), ChargersErrorUiState$Action.CLOSE);
                    break;
                case 6:
                    ry9Var = new ry9(((avj0) zuj0Var).h(kyh0.common_close), ChargersErrorUiState$Action.CLOSE);
                    break;
                case 7:
                    ry9Var = new ry9(((avj0) zuj0Var).h(kyh0.common_close), ChargersErrorUiState$Action.CLOSE);
                    break;
                case 8:
                    ry9Var = new ry9(((avj0) zuj0Var).h(kyh0.common_close), ChargersErrorUiState$Action.CLOSE);
                    break;
                case 9:
                    ry9Var = new ry9(((avj0) zuj0Var).h(kyh0.common_close), ChargersErrorUiState$Action.CLOSE);
                    break;
                case 10:
                    ry9Var = new ry9(((avj0) zuj0Var).h(kyh0.common_close), ChargersErrorUiState$Action.CLOSE);
                    break;
                case 11:
                    ry9Var = new ry9(((avj0) zuj0Var).h(kyh0.chargers_error_button_find_another_station), ChargersErrorUiState$Action.FIND_ANOTHER_STATION);
                    break;
                case 12:
                    ry9Var = new ry9(((avj0) zuj0Var).h(kyh0.common_close), ChargersErrorUiState$Action.CLOSE);
                    break;
                case 13:
                    ry9Var = new ry9(((avj0) zuj0Var).h(kyh0.chargers_error_button_find_another_station), ChargersErrorUiState$Action.FIND_ANOTHER_STATION);
                    break;
                case 14:
                    ry9Var = new ry9(((avj0) zuj0Var).h(kyh0.common_close), ChargersErrorUiState$Action.CLOSE);
                    break;
                case 15:
                    ry9Var = new ry9(((avj0) zuj0Var).h(kyh0.chargers_error_button_find_another_station), ChargersErrorUiState$Action.FIND_ANOTHER_STATION);
                    break;
                case 16:
                    ry9Var = new ry9(((avj0) zuj0Var).h(kyh0.common_close), ChargersErrorUiState$Action.CLOSE);
                    break;
                case 17:
                    ry9Var = new ry9(((avj0) zuj0Var).h(kyh0.chargers_error_button_to_payment_methods), ChargersErrorUiState$Action.RETURN_TO_PAYMENT);
                    break;
                case 18:
                    ry9Var = new ry9(((avj0) zuj0Var).h(kyh0.chargers_error_button_to_support), ChargersErrorUiState$Action.SUPPORT);
                    break;
                case 19:
                    ry9Var = new ry9(((avj0) zuj0Var).h(kyh0.common_got_it), ChargersErrorUiState$Action.RETRY);
                    break;
                default:
                    w511.b();
                    return null;
            }
            zuj0 zuj0Var2 = this.this$0.a;
            switch (iArr[chargersErrorCode.ordinal()]) {
                case 1:
                    ry9Var2 = new ry9(((avj0) zuj0Var2).h(kyh0.chargers_error_button_try_again), ChargersErrorUiState$Action.RETRY);
                    break;
                case 2:
                case 3:
                case 4:
                case 8:
                case 9:
                case 11:
                case 12:
                case 13:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    ry9Var2 = null;
                    break;
                case 5:
                    ry9Var2 = new ry9(((avj0) zuj0Var2).h(kyh0.chargers_error_button_try_again), ChargersErrorUiState$Action.RETRY);
                    break;
                case 6:
                    ry9Var2 = new ry9(((avj0) zuj0Var2).h(kyh0.chargers_error_button_try_again), ChargersErrorUiState$Action.RETRY);
                    break;
                case 7:
                    ry9Var2 = new ry9(((avj0) zuj0Var2).h(kyh0.chargers_error_button_try_again), ChargersErrorUiState$Action.RETRY);
                    break;
                case 10:
                    ry9Var2 = new ry9(((avj0) zuj0Var2).h(kyh0.chargers_error_button_try_again), ChargersErrorUiState$Action.RETRY);
                    break;
                case 14:
                    ry9Var2 = new ry9(((avj0) zuj0Var2).h(kyh0.chargers_error_button_try_again), ChargersErrorUiState$Action.RETRY);
                    break;
                default:
                    w511.b();
                    return null;
            }
            this.L$0 = null;
            this.L$1 = chargersErrorCode;
            this.L$2 = null;
            this.L$3 = h2;
            this.L$4 = ry9Var;
            this.L$5 = ry9Var2;
            this.label = 1;
            obj = h.s(this);
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (obj != coroutineSingletons) {
                nohVar = h2;
                ry9Var3 = ry9Var2;
                ry9Var4 = ry9Var;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            CharSequence charSequence2 = (CharSequence) this.L$6;
            ry9 ry9Var6 = (ry9) this.L$5;
            ry9Var4 = (ry9) this.L$4;
            ChargersErrorCode chargersErrorCode2 = (ChargersErrorCode) this.L$1;
            kotlin.b.b(obj);
            ry9Var5 = ry9Var6;
            chargersErrorCode = chargersErrorCode2;
            charSequence = charSequence2;
            ry9 ry9Var7 = ry9Var4;
            CharSequence charSequence3 = (CharSequence) obj;
            this.this$0.getClass();
            return new sy9(charSequence, charSequence3, ry9Var7, ry9Var5, dy9.a[chargersErrorCode.ordinal()] != 19 ? ChargersErrorUiState$Icon.NONE : ChargersErrorUiState$Icon.ERROR);
        }
        ry9Var3 = (ry9) this.L$5;
        ry9Var4 = (ry9) this.L$4;
        nohVar = (noh) this.L$3;
        chargersErrorCode = (ChargersErrorCode) this.L$1;
        kotlin.b.b(obj);
        CharSequence charSequence4 = (CharSequence) obj;
        this.L$0 = null;
        this.L$1 = chargersErrorCode;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = ry9Var4;
        this.L$5 = ry9Var3;
        this.L$6 = charSequence4;
        this.label = 2;
        Object k = nohVar.k(this);
        if (k != coroutineSingletons) {
            charSequence = charSequence4;
            ry9Var5 = ry9Var3;
            obj = k;
            ry9 ry9Var72 = ry9Var4;
            CharSequence charSequence32 = (CharSequence) obj;
            this.this$0.getClass();
            return new sy9(charSequence, charSequence32, ry9Var72, ry9Var5, dy9.a[chargersErrorCode.ordinal()] != 19 ? ChargersErrorUiState$Icon.NONE : ChargersErrorUiState$Icon.ERROR);
        }
        return coroutineSingletons;
    }
}
