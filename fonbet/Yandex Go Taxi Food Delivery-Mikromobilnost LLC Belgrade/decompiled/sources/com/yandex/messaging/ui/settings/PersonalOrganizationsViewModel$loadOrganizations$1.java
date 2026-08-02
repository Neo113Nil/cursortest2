package com.yandex.messaging.ui.settings;

import defpackage.ab4;
import defpackage.au11;
import defpackage.hb4;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r5b0;
import defpackage.rk80;
import defpackage.tcc;
import defpackage.tse;
import defpackage.tz10;
import defpackage.w2b1;
import defpackage.w4b0;
import defpackage.wh80;
import defpackage.wls;
import defpackage.x4b0;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.settings.PersonalOrganizationsViewModel$loadOrganizations$1", f = "PersonalOrganizationsViewModel.kt", l = {90}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class PersonalOrganizationsViewModel$loadOrganizations$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ e this$0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lx4b0;", "personalInfo", "", "currentOrgId", "Lkotlin/Pair;", "<anonymous>", "(Lx4b0;J)Lkotlin/Pair;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.messaging.ui.settings.PersonalOrganizationsViewModel$loadOrganizations$1$1", f = "PersonalOrganizationsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.ui.settings.PersonalOrganizationsViewModel$loadOrganizations$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements zls {
        /* synthetic */ long J$0;
        /* synthetic */ Object L$0;
        int label;

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            long longValue = ((Number) obj2).longValue();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(3, (Continuation) obj3);
            anonymousClass1.L$0 = (x4b0) obj;
            anonymousClass1.J$0 = longValue;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return new Pair((x4b0) this.L$0, new Long(this.J$0));
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Pair;", "Lx4b0;", "", "<destruct>", "Lzy11;", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.messaging.ui.settings.PersonalOrganizationsViewModel$loadOrganizations$1$2", f = "PersonalOrganizationsViewModel.kt", l = {HProv.PP_HASHOID}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.ui.settings.PersonalOrganizationsViewModel$loadOrganizations$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(e eVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((Pair) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            zy11 zy11Var;
            boolean z;
            long j;
            List o0;
            Object value;
            List list;
            Object obj2;
            Long valueOf;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            zy11 zy11Var2 = zy11.a;
            if (i != 0) {
                if (i == 1) {
                    kotlin.b.b(obj);
                    return zy11Var2;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            Pair pair = (Pair) this.L$0;
            x4b0 x4b0Var = (x4b0) pair.getFirst();
            long longValue = ((Number) pair.getSecond()).longValue();
            e eVar = this.this$0;
            eVar.getClass();
            this.label = 1;
            rk80 rk80Var = eVar.B;
            ArrayList a = x4b0Var.a();
            boolean z2 = x4b0Var.l;
            if (a.isEmpty()) {
                o0 = EmptyList.a;
                zy11Var = zy11Var2;
                z = z2;
                j = longValue;
            } else {
                ArrayList arrayList = new ArrayList(tcc.n(a, 10));
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    w4b0 w4b0Var = (w4b0) it.next();
                    long j2 = w4b0Var.a;
                    String str = w4b0Var.b;
                    zy11 zy11Var3 = zy11Var2;
                    boolean z3 = z2;
                    long j3 = longValue;
                    arrayList.add(new rk80(j2, new au11(str), ab4.b(eVar.w.b, String.valueOf(j2), w2b1.a(str), hb4.a, 4), w4b0Var.f && eVar.x.a(tz10.L), 0));
                    z2 = z3;
                    zy11Var2 = zy11Var3;
                    longValue = j3;
                }
                zy11Var = zy11Var2;
                z = z2;
                j = longValue;
                o0 = z ? arrayList : kotlin.collections.a.o0(arrayList, rk80Var);
            }
            r0 r0Var = eVar.C;
            do {
                value = r0Var.getValue();
                r5b0 r5b0Var = (r5b0) value;
                list = o0;
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (((rk80) obj2).a == j) {
                        break;
                    }
                }
                rk80 rk80Var2 = (rk80) obj2;
                valueOf = Long.valueOf(rk80Var2 != null ? rk80Var2.a : (!z || o0.isEmpty()) ? rk80Var.a : ((rk80) kotlin.collections.a.P(o0)).a);
                r5b0Var.getClass();
            } while (!r0Var.k(value, new r5b0(o0, valueOf)));
            Object collect = kotlinx.coroutines.flow.e.C(new g(list), new PersonalOrganizationsViewModel$subscribeToUnreadCounts$2(eVar, null)).collect(new wh80(15, eVar), this);
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (collect != coroutineSingletons2) {
                collect = zy11Var;
            }
            if (collect != coroutineSingletons2) {
                collect = zy11Var;
            }
            return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalOrganizationsViewModel$loadOrganizations$1(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PersonalOrganizationsViewModel$loadOrganizations$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PersonalOrganizationsViewModel$loadOrganizations$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        m0 m0Var = new m0(this.this$0.b.a(zy11Var), this.this$0.c.a(zy11Var), new AnonymousClass1(3, null));
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
        this.label = 1;
        return kotlinx.coroutines.flow.e.k(m0Var, anonymousClass2, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
