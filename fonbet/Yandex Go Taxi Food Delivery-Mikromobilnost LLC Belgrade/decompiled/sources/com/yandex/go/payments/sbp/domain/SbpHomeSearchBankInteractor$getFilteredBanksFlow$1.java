package com.yandex.go.payments.sbp.domain;

import defpackage.dq4;
import defpackage.evu0;
import defpackage.hq4;
import defpackage.iq4;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "searchQuery", "", "Lhq4;", "<anonymous>", "(Ljava/lang/String;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.sbp.domain.SbpHomeSearchBankInteractor$getFilteredBanksFlow$1", f = "SbpHomeSearchBankInteractor.kt", l = {34}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SbpHomeSearchBankInteractor$getFilteredBanksFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<hq4> $originalBankList;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lhq4;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.payments.sbp.domain.SbpHomeSearchBankInteractor$getFilteredBanksFlow$1$1", f = "SbpHomeSearchBankInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.payments.sbp.domain.SbpHomeSearchBankInteractor$getFilteredBanksFlow$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ List<hq4> $originalBankList;
        final /* synthetic */ String $searchQuery;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, List list, c cVar, Continuation continuation) {
            super(2, continuation);
            this.$searchQuery = str;
            this.$originalBankList = list;
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$searchQuery, this.$originalBankList, this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            String obj2 = evu0.k0(this.$searchQuery).toString();
            List<hq4> list = this.$originalBankList;
            c cVar = this.this$0;
            ArrayList<hq4> arrayList = new ArrayList();
            for (Object obj3 : list) {
                hq4 hq4Var = (hq4) obj3;
                cVar.getClass();
                if (obj2.length() != 0) {
                    if (hq4Var instanceof dq4) {
                        continue;
                    } else {
                        if (!(hq4Var instanceof iq4)) {
                            w511.b();
                            return null;
                        }
                        iq4 iq4Var = (iq4) hq4Var;
                        if (!evu0.J(obj2) && !evu0.y(iq4Var.b, obj2, true)) {
                            List list2 = iq4Var.g;
                            if (list2 != null) {
                                List list3 = list2;
                                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                    Iterator it = list3.iterator();
                                    while (it.hasNext()) {
                                        if (evu0.y((String) it.next(), obj2, true)) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                arrayList.add(obj3);
            }
            String str = this.$searchQuery;
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            for (hq4 hq4Var2 : arrayList) {
                if (str.length() > 0 && (hq4Var2 instanceof iq4)) {
                    iq4 iq4Var2 = (iq4) hq4Var2;
                    hq4Var2 = new iq4(iq4Var2.a, iq4Var2.b, iq4Var2.c, iq4Var2.d, iq4Var2.e, iq4Var2.f, iq4Var2.g, true, iq4Var2.i);
                }
                arrayList2.add(hq4Var2);
            }
            return arrayList2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SbpHomeSearchBankInteractor$getFilteredBanksFlow$1(c cVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$originalBankList = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SbpHomeSearchBankInteractor$getFilteredBanksFlow$1 sbpHomeSearchBankInteractor$getFilteredBanksFlow$1 = new SbpHomeSearchBankInteractor$getFilteredBanksFlow$1(this.this$0, this.$originalBankList, continuation);
        sbpHomeSearchBankInteractor$getFilteredBanksFlow$1.L$0 = obj;
        return sbpHomeSearchBankInteractor$getFilteredBanksFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SbpHomeSearchBankInteractor$getFilteredBanksFlow$1) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.b.getClass();
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(str, this.$originalBankList, this.this$0, null);
        this.L$0 = null;
        this.label = 1;
        Object k0 = tje.k0(mdhVar, anonymousClass1, this);
        return k0 == coroutineSingletons ? coroutineSingletons : k0;
    }
}
