package com.yandex.payment.divkit.sbp;

import com.yandex.payment.divkit.usecases.k;
import defpackage.cnk;
import defpackage.duf;
import defpackage.fq4;
import defpackage.hyj0;
import defpackage.kyj0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.omk;
import defpackage.qyj0;
import defpackage.scc;
import defpackage.tse;
import defpackage.u2l;
import defpackage.w511;
import defpackage.wls;
import defpackage.ye60;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.sbp.DKSbpViewModel$loadListBanks$1", f = "DKSbpViewModel.kt", l = {205}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class DKSbpViewModel$loadListBanks$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqyj0;", "", "Lfq4;", "it", "Lzy11;", "<anonymous>", "(Lqyj0;)V"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "com.yandex.payment.divkit.sbp.DKSbpViewModel$loadListBanks$1$1", f = "DKSbpViewModel.kt", l = {190}, m = "invokeSuspend", v = 1)
    /* renamed from: com.yandex.payment.divkit.sbp.DKSbpViewModel$loadListBanks$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((qyj0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            fq4 fq4Var;
            Object obj2;
            qyj0 qyj0Var = (qyj0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            zy11 zy11Var = zy11.a;
            if (i == 0) {
                b.b(obj);
                if (qyj0Var instanceof hyj0) {
                    a.X(this.this$0);
                    return zy11Var;
                }
                if (!(qyj0Var instanceof kyj0)) {
                    w511.b();
                    return null;
                }
                a aVar = this.this$0;
                List list = (List) ((kyj0) qyj0Var).a;
                aVar.E = list;
                boolean isEmpty = list.isEmpty();
                a aVar2 = this.this$0;
                if (isEmpty) {
                    a.X(aVar2);
                    return zy11Var;
                }
                List list2 = aVar2.E;
                String str = aVar2.z;
                if (str == null) {
                    list2 = null;
                }
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (((fq4) obj2).c.equals(str)) {
                            break;
                        }
                    }
                    fq4Var = (fq4) obj2;
                } else {
                    fq4Var = null;
                }
                a aVar3 = this.this$0;
                if (fq4Var != null) {
                    aVar3.Y(fq4Var.c);
                    return zy11Var;
                }
                k kVar = aVar3.c;
                boolean z = aVar3.O;
                u2l u2lVar = aVar3.L;
                if (u2lVar == null) {
                    u2lVar = null;
                }
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                obj = kVar.a(list, z, u2lVar, this);
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
            omk omkVar = (omk) obj;
            a aVar4 = this.this$0;
            aVar4.J = true;
            Pair pair = new Pair("select_bank_screen_headerBackButtonVisible", "true");
            fq4 fq4Var2 = (fq4) kotlin.collections.a.b0(aVar4.E);
            String str2 = fq4Var2 != null ? fq4Var2.a : null;
            if (str2 == null) {
                str2 = "";
            }
            aVar4.b0(new duf(new cnk(omkVar, scc.g(pair, new Pair("select_bank_screen_last_bank_name", str2)))));
            return zy11Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DKSbpViewModel$loadListBanks$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DKSbpViewModel$loadListBanks$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DKSbpViewModel$loadListBanks$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        kotlinx.coroutines.flow.b a = aVar.b.a(aVar.x);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
        this.label = 1;
        Object collect = a.collect(new i0(ye60.a, anonymousClass1), this);
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
