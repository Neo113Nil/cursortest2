package com.yandex.go.payments.sbp.ui.home;

import com.yandex.go.payments.data.model.response.BankListSection;
import com.yandex.go.payments.data.model.response.SearchBar;
import com.yandex.go.payments.sbp.data.model.SbpTokenHomeResponse;
import com.yandex.go.payments.sbp.domain.c;
import com.yandex.go.payments.ui.PaymentIconInfoType;
import defpackage.cfj0;
import defpackage.dq4;
import defpackage.dyc;
import defpackage.e3n;
import defpackage.f8z0;
import defpackage.iq4;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rcc;
import defpackage.s630;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tse;
import defpackage.vgm0;
import defpackage.wls;
import defpackage.ycc;
import defpackage.ygm0;
import defpackage.zgm0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.sbp.ui.home.SbpHomePresenter$requestSbpTokenHomeInfo$1", f = "SbpHomePresenter.kt", l = {45, 112, 48}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SbpHomePresenter$requestSbpTokenHomeInfo$1 extends SuspendLambda implements wls {
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ygm0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SbpHomePresenter$requestSbpTokenHomeInfo$1(ygm0 ygm0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ygm0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SbpHomePresenter$requestSbpTokenHomeInfo$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SbpHomePresenter$requestSbpTokenHomeInfo$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00aa, code lost:
    
        if (kotlinx.coroutines.a.i(r3, r33) == r1) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x01e8  */
    /* JADX WARN: Type inference failed for: r14v0, types: [T, kotlin.Result] */
    /* JADX WARN: Type inference failed for: r28v2, types: [java.lang.Throwable] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef ref$ObjectRef;
        long a;
        long j;
        Object b;
        Ref$ObjectRef ref$ObjectRef2;
        Object value;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        Continuation continuation = null;
        if (i == 0) {
            kotlin.b.b(obj);
            ((vgm0) this.this$0.Dg()).setLoadingVisibility(true);
            ygm0 ygm0Var = this.this$0;
            ref$ObjectRef = new Ref$ObjectRef();
            a = s630.a();
            c cVar = ygm0Var.x;
            this.L$0 = ref$ObjectRef;
            this.L$1 = null;
            this.L$2 = ref$ObjectRef;
            j = 500;
            this.J$0 = 500L;
            this.J$1 = a;
            this.label = 1;
            b = cVar.b(this);
            if (b != coroutineSingletons) {
                ref$ObjectRef2 = ref$ObjectRef;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.L$0;
                kotlin.b.b(obj);
                value = obj2;
                ygm0 ygm0Var2 = this.this$0;
                if (Result.a(value) != null) {
                    ((vgm0) ygm0Var2.Dg()).setLoadingVisibility(false);
                    ((vgm0) ygm0Var2.Dg()).h6();
                }
                return zy11.a;
            }
            Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) this.L$0;
            kotlin.b.b(obj);
            ref$ObjectRef = ref$ObjectRef3;
            value = ((Result) ref$ObjectRef.element).getValue();
            ygm0 ygm0Var3 = this.this$0;
            if (value instanceof Result.Failure) {
                ygm0 ygm0Var22 = this.this$0;
                if (Result.a(value) != null) {
                }
                return zy11.a;
            }
            SbpTokenHomeResponse sbpTokenHomeResponse = (SbpTokenHomeResponse) value;
            this.L$0 = value;
            this.L$1 = null;
            this.label = 3;
            ((vgm0) ygm0Var3.Dg()).setLoadingVisibility(false);
            vgm0 vgm0Var = (vgm0) ygm0Var3.Dg();
            c cVar2 = ygm0Var3.x;
            cVar2.getClass();
            String str = sbpTokenHomeResponse.a;
            SearchBar searchBar = sbpTokenHomeResponse.b;
            vgm0Var.ya(new zgm0(str, searchBar.a, searchBar.b));
            List list = sbpTokenHomeResponse.c;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                BankListSection bankListSection = (BankListSection) it.next();
                ListBuilder a2 = rcc.a();
                String str2 = bankListSection.a;
                List list2 = bankListSection.b;
                if (str2 != null) {
                    a2.add(new dq4(str2));
                }
                List list3 = list2;
                ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
                int i2 = 0;
                for (Object obj3 : list3) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        ?? r28 = continuation;
                        scc.m();
                        throw r28;
                    }
                    BankListSection.BankItem bankItem = (BankListSection.BankItem) obj3;
                    boolean z2 = z;
                    String str3 = bankItem.a;
                    String str4 = bankItem.b;
                    Continuation continuation2 = continuation;
                    String str5 = bankItem.c;
                    Object obj4 = value;
                    String str6 = bankItem.e;
                    if (str6 == null) {
                        str6 = "";
                    }
                    arrayList2.add(new iq4(str3, str4, str6, str5, bankItem.g, bankItem.f, bankItem.d, i2 < list2.size() + (-1) ? z2 : false, ygm0Var3.z.e(PaymentIconInfoType.SBP_TOKEN_BANK_NAME, bankItem.c, new dyc(3))));
                    z = z2;
                    i2 = i3;
                    continuation = continuation2;
                    value = obj4;
                    it = it;
                }
                a2.addAll(arrayList2);
                ycc.r(a2.j(), arrayList);
                z = z;
            }
            Object obj5 = value;
            if (new o(cVar2.a(arrayList, ygm0Var3.A), new SbpHomePresenter$onSbpHomeContentLoaded$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), continuation)).collect(new cfj0(23, ygm0Var3), this) != coroutineSingletons) {
                obj2 = obj5;
                value = obj2;
                ygm0 ygm0Var222 = this.this$0;
                if (Result.a(value) != null) {
                }
                return zy11.a;
            }
            return coroutineSingletons;
        }
        long j2 = this.J$1;
        long j3 = this.J$0;
        ref$ObjectRef2 = (Ref$ObjectRef) this.L$2;
        Ref$ObjectRef ref$ObjectRef4 = (Ref$ObjectRef) this.L$0;
        kotlin.b.b(obj);
        b = ((Result) obj).getValue();
        ref$ObjectRef = ref$ObjectRef4;
        j = j3;
        a = j2;
        ref$ObjectRef2.element = new Result(b);
        long a3 = f8z0.a(a);
        long max = Long.max(j - e3n.o(a3, DurationUnit.MILLISECONDS), 0L);
        this.L$0 = ref$ObjectRef;
        this.L$1 = null;
        this.L$2 = null;
        this.J$0 = j;
        this.J$1 = a3;
        this.label = 2;
    }
}
