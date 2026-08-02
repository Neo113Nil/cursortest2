package com.yandex.go.summary.interactor.common.state;

import defpackage.elx0;
import defpackage.mex0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zvd;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzvd;", "<anonymous>", "(Ltse;)Lzvd;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.common.state.SelectorUiStateInteractor$getTariffSelectorUiState$2$compoundTariffCellsUiState$2$1", f = "SelectorUiStateInteractor.kt", l = {178, 179}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SelectorUiStateInteractor$getTariffSelectorUiState$2$compoundTariffCellsUiState$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<elx0> $group;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectorUiStateInteractor$getTariffSelectorUiState$2$compoundTariffCellsUiState$2$1(List list, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$group = list;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SelectorUiStateInteractor$getTariffSelectorUiState$2$compoundTariffCellsUiState$2$1 selectorUiStateInteractor$getTariffSelectorUiState$2$compoundTariffCellsUiState$2$1 = new SelectorUiStateInteractor$getTariffSelectorUiState$2$compoundTariffCellsUiState$2$1(this.$group, this.this$0, continuation);
        selectorUiStateInteractor$getTariffSelectorUiState$2$compoundTariffCellsUiState$2$1.L$0 = obj;
        return selectorUiStateInteractor$getTariffSelectorUiState$2$compoundTariffCellsUiState$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectorUiStateInteractor$getTariffSelectorUiState$2$compoundTariffCellsUiState$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00aa, code lost:
    
        if (r10 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        noh h;
        mex0 mex0Var;
        mex0 mex0Var2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Iterator<T> it = this.$group.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((elx0) obj2).v) {
                    break;
                }
            }
            elx0 elx0Var = (elx0) obj2;
            Iterator<T> it2 = this.$group.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it2.next();
                if (!((elx0) obj3).v) {
                    break;
                }
            }
            qoh h2 = tje.h(tseVar, null, null, new SelectorUiStateInteractor$getTariffSelectorUiState$2$compoundTariffCellsUiState$2$1$originalDeferred$1(elx0Var, this.this$0, null), 3);
            h = tje.h(tseVar, null, null, new SelectorUiStateInteractor$getTariffSelectorUiState$2$compoundTariffCellsUiState$2$1$alternativeDeferred$1((elx0) obj3, this.this$0, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = h;
            this.label = 1;
            obj = h2.s(this);
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mex0Var = (mex0) this.L$5;
                kotlin.b.b(obj);
                mex0 mex0Var3 = (mex0) obj;
                mex0Var2 = (mex0Var == null || mex0Var3 != null) ? (mex0Var == null || mex0Var3 == null) ? mex0Var : mex0Var3 : null;
                if (mex0Var2 != null) {
                    return null;
                }
                return new zvd(mex0Var != null ? mex0Var3 : null, mex0Var2);
            }
            h = (noh) this.L$4;
            kotlin.b.b(obj);
        }
        mex0 mex0Var4 = (mex0) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = mex0Var4;
        this.label = 2;
        Object k = h.k(this);
        if (k != coroutineSingletons) {
            mex0Var = mex0Var4;
            obj = k;
            mex0 mex0Var32 = (mex0) obj;
            if (mex0Var == null) {
            }
            if (mex0Var2 != null) {
            }
        }
        return coroutineSingletons;
    }
}
