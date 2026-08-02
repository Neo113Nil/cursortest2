package com.yandex.go.payments.shared.members.cardselector;

import com.yandex.go.payments.paymentlist.domain.converter.i;
import com.yandex.go.payments.shared.data.model.Account;
import com.yandex.go.payments.shared.v;
import defpackage.d4m;
import defpackage.edi0;
import defpackage.fl8;
import defpackage.gca0;
import defpackage.il;
import defpackage.jfa0;
import defpackage.jl40;
import defpackage.jw90;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.n65;
import defpackage.na0;
import defpackage.nea0;
import defpackage.ny61;
import defpackage.rhq0;
import defpackage.rn8;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.u0k;
import defpackage.uyj;
import defpackage.wls;
import defpackage.xw91;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.members.cardselector.CardSelectorPresenter$attachView$1", f = "CardSelectorPresenter.kt", l = {83, 85, HProv.ALG_SID_KECCAK_224, 91}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class CardSelectorPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ rn8 $mvpView;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardSelectorPresenter$attachView$1(a aVar, rn8 rn8Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$mvpView = rn8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardSelectorPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardSelectorPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x016d, code lost:
    
        if (r14 == r0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c0, code lost:
    
        if (r14 == r0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0081, code lost:
    
        if (r14 == r0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0094, code lost:
    
        if (r14 == r0) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0134 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jw90 b;
        jfa0 jfa0Var;
        Iterator it;
        Object obj2;
        nea0 nea0Var;
        rhq0 rhq0Var;
        CardSelectorPresenter$attachView$1 cardSelectorPresenter$attachView$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            b = aVar.D.b(aVar.C.a(), xw91.b, new n65[0]);
            a aVar2 = this.this$0;
            il ilVar = aVar2.E;
            if (ilVar.a != null) {
                aVar2.x.getClass();
                sjh sjhVar = uyj.a;
                mdh mdhVar = mdh.b;
                CardSelectorPresenter$attachView$1$paymentOptionsForPmlScreen$1 cardSelectorPresenter$attachView$1$paymentOptionsForPmlScreen$1 = new CardSelectorPresenter$attachView$1$paymentOptionsForPmlScreen$1(this.this$0, b, null);
                this.L$0 = null;
                this.label = 1;
                obj = tje.k0(mdhVar, cardSelectorPresenter$attachView$1$paymentOptionsForPmlScreen$1, this);
            } else {
                v vVar = aVar2.y;
                String str = ilVar.b;
                this.L$0 = b;
                this.label = 2;
                obj = vVar.g(str, this);
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            b.b(obj);
            jfa0Var = (jfa0) obj;
            a aVar3 = this.this$0;
            int i2 = a.K;
            aVar3.getClass();
            List list = jfa0Var.a;
            ArrayList arrayList = new ArrayList();
            while (r3.hasNext()) {
            }
            it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            nea0Var = (nea0) obj2;
            if (nea0Var != null) {
            }
            rhq0Var = null;
            jfa0 a = jfa0.a(jfa0Var, arrayList, rhq0Var, 4);
            i iVar = this.this$0.H;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 4;
            cardSelectorPresenter$attachView$1 = this;
            obj = iVar.n(a, null, d4m.a, true, cardSelectorPresenter$attachView$1);
        } else if (i == 2) {
            b = (jw90) this.L$0;
            b.b(obj);
            Account account = (Account) obj;
            a aVar4 = this.this$0;
            aVar4.E.a = account;
            aVar4.I = account.e.b;
            aVar4.x.getClass();
            sjh sjhVar2 = uyj.a;
            mdh mdhVar2 = mdh.b;
            CardSelectorPresenter$attachView$1$paymentOptionsForPmlScreen$2 cardSelectorPresenter$attachView$1$paymentOptionsForPmlScreen$2 = new CardSelectorPresenter$attachView$1$paymentOptionsForPmlScreen$2(this.this$0, b, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
            obj = tje.k0(mdhVar2, cardSelectorPresenter$attachView$1$paymentOptionsForPmlScreen$2, this);
        } else if (i == 3) {
            b.b(obj);
            jfa0Var = (jfa0) obj;
            a aVar32 = this.this$0;
            int i22 = a.K;
            aVar32.getClass();
            List list2 = jfa0Var.a;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list2) {
                nea0 nea0Var2 = (nea0) obj3;
                u0k u0kVar = nea0Var2.a;
                if (u0kVar instanceof fl8) {
                    fl8 fl8Var = (fl8) u0kVar;
                    if (fl8Var.c && !fl8Var.h && jl40.l(nea0Var2.b, xw91.C)) {
                        arrayList2.add(obj3);
                    }
                } else if (u0kVar instanceof na0) {
                    arrayList2.add(obj3);
                }
            }
            it = arrayList2.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                u0k u0kVar2 = ((nea0) obj2).a;
                fl8 fl8Var2 = u0kVar2 instanceof fl8 ? (fl8) u0kVar2 : null;
                if (jl40.l(fl8Var2 != null ? fl8Var2.a : null, aVar32.I)) {
                    break;
                }
            }
            nea0Var = (nea0) obj2;
            if (nea0Var != null) {
                u0k u0kVar3 = nea0Var.a;
                fl8 fl8Var3 = u0kVar3 instanceof fl8 ? (fl8) u0kVar3 : null;
                if (fl8Var3 != null) {
                    rhq0Var = new rhq0(new edi0(fl8Var3, nea0Var.b), null);
                    jfa0 a2 = jfa0.a(jfa0Var, arrayList2, rhq0Var, 4);
                    i iVar2 = this.this$0.H;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                    cardSelectorPresenter$attachView$1 = this;
                    obj = iVar2.n(a2, null, d4m.a, true, cardSelectorPresenter$attachView$1);
                }
            }
            rhq0Var = null;
            jfa0 a22 = jfa0.a(jfa0Var, arrayList2, rhq0Var, 4);
            i iVar22 = this.this$0.H;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 4;
            cardSelectorPresenter$attachView$1 = this;
            obj = iVar22.n(a22, null, d4m.a, true, cardSelectorPresenter$attachView$1);
        } else {
            if (i != 4) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            cardSelectorPresenter$attachView$1 = this;
        }
        cardSelectorPresenter$attachView$1.$mvpView.x((gca0) obj);
        return zy11.a;
    }
}
