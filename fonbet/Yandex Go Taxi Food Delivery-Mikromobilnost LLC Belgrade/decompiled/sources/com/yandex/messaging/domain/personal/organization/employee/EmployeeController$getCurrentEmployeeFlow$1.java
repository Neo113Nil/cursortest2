package com.yandex.messaging.domain.personal.organization.employee;

import com.yandex.messaging.MessengerEnvironment;
import defpackage.clb1;
import defpackage.il01;
import defpackage.il21;
import defpackage.jl21;
import defpackage.jl40;
import defpackage.l7;
import defpackage.lqo;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.tz10;
import defpackage.uun;
import defpackage.vl21;
import defpackage.vpr;
import defpackage.vun;
import defpackage.wls;
import defpackage.xl21;
import defpackage.xn21;
import defpackage.zls;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lvun;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.personal.organization.employee.EmployeeController$getCurrentEmployeeFlow$1", f = "EmployeeController.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class EmployeeController$getCurrentEmployeeFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $userId;
    final /* synthetic */ boolean $withCurrentOrganizationName;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ uun this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lvun;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.messaging.domain.personal.organization.employee.EmployeeController$getCurrentEmployeeFlow$1$1", f = "EmployeeController.kt", l = {65}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.domain.personal.organization.employee.EmployeeController$getCurrentEmployeeFlow$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ String $userId;
        final /* synthetic */ boolean $withCurrentOrganizationName;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ uun this$0;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "orgId", "nickname"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @mvg(c = "com.yandex.messaging.domain.personal.organization.employee.EmployeeController$getCurrentEmployeeFlow$1$1$1", f = "EmployeeController.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.yandex.messaging.domain.personal.organization.employee.EmployeeController$getCurrentEmployeeFlow$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C00861 extends SuspendLambda implements zls {
            /* synthetic */ long J$0;
            /* synthetic */ Object L$0;
            int label;

            @Override // defpackage.zls
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                long longValue = ((Number) obj).longValue();
                C00861 c00861 = new C00861(3, (Continuation) obj3);
                c00861.J$0 = longValue;
                c00861.L$0 = (String) obj2;
                return c00861.invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                long j = this.J$0;
                return new Pair(new Long(j), (String) this.L$0);
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvpr;", "Lvun;", "Lkotlin/Pair;", "", "", "<destruct>", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Pair;)V"}, k = 3, mv = {2, 1, 0})
        @mvg(c = "com.yandex.messaging.domain.personal.organization.employee.EmployeeController$getCurrentEmployeeFlow$1$1$2", f = "EmployeeController.kt", l = {71}, m = "invokeSuspend")
        /* renamed from: com.yandex.messaging.domain.personal.organization.employee.EmployeeController$getCurrentEmployeeFlow$1$1$2, reason: invalid class name */
        final class AnonymousClass2 extends SuspendLambda implements zls {
            final /* synthetic */ String $userId;
            final /* synthetic */ boolean $withCurrentOrganizationName;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;
            final /* synthetic */ uun this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(uun uunVar, String str, boolean z, Continuation continuation) {
                super(3, continuation);
                this.this$0 = uunVar;
                this.$userId = str;
                this.$withCurrentOrganizationName = z;
            }

            @Override // defpackage.zls
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$userId, this.$withCurrentOrganizationName, (Continuation) obj3);
                anonymousClass2.L$0 = (vpr) obj;
                anonymousClass2.L$1 = (Pair) obj2;
                return anonymousClass2.invokeSuspend(zy11.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x009f, code lost:
            
                if (r3 == null) goto L24;
             */
            /* JADX WARN: Removed duplicated region for block: B:81:0x0226 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:85:0x01b0  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                List c;
                Object obj2;
                vun vunVar;
                Object obj3;
                Object obj4;
                Object obj5;
                Object obj6;
                boolean z;
                Iterator it;
                boolean z2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.b.b(obj);
                    vpr vprVar = (vpr) this.L$0;
                    Pair pair = (Pair) this.L$1;
                    long longValue = ((Number) pair.getFirst()).longValue();
                    String str = (String) pair.getSecond();
                    uun uunVar = this.this$0;
                    String str2 = this.$userId;
                    boolean z3 = this.$withCurrentOrganizationName;
                    MessengerEnvironment messengerEnvironment = uunVar.b;
                    lqo lqoVar = uunVar.d;
                    jl21 jl21Var = uunVar.f;
                    vl21 vl21Var = uunVar.i;
                    xl21 xl21Var = (xl21) kotlin.collections.a.R(vl21Var.b(longValue, str2));
                    if (xl21Var == null) {
                        xl21Var = (xl21) kotlin.collections.a.R(vl21Var.c(str2));
                        if (xl21Var == null || (xl21Var.c == null && xl21Var.h == null)) {
                            xl21Var = null;
                        }
                    } else if (!z3) {
                        xl21Var = new xl21(xl21Var.a, xl21Var.b, null, xl21Var.d, xl21Var.e, xl21Var.f, xl21Var.g, xl21Var.h, xl21Var.i);
                    }
                    if (xl21Var != null) {
                        long j = xl21Var.b;
                        xn21.a(jl21Var.a, str2);
                        c = jl21Var.c.c(j, str2);
                    }
                    xn21.a(jl21Var.a, str2);
                    c = jl21Var.c.c(longValue, str2);
                    if ((lqoVar.a(tz10.j) && lqoVar.a(tz10.l) && longValue != 0) || clb1.d(messengerEnvironment)) {
                        if (xl21Var != null) {
                            longValue = xl21Var.b;
                        }
                        long j2 = longValue;
                        String str3 = xl21Var != null ? xl21Var.d : null;
                        String str4 = xl21Var != null ? xl21Var.e : null;
                        List list = c;
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj4 = null;
                                break;
                            }
                            obj4 = it2.next();
                            if (jl40.l(((il21) obj4).d, "email")) {
                                break;
                            }
                        }
                        il21 il21Var = (il21) obj4;
                        String str5 = il21Var != null ? il21Var.e : null;
                        Iterator it3 = list.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj5 = null;
                                break;
                            }
                            obj5 = it3.next();
                            if (jl40.l(((il21) obj5).d, "phone")) {
                                break;
                            }
                        }
                        il21 il21Var2 = (il21) obj5;
                        String str6 = il21Var2 != null ? il21Var2.e : null;
                        Iterator it4 = list.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                obj6 = null;
                                break;
                            }
                            obj6 = it4.next();
                            if (jl40.l(((il21) obj6).d, "work_phone")) {
                                break;
                            }
                        }
                        il21 il21Var3 = (il21) obj6;
                        String str7 = il21Var3 != null ? il21Var3.e : null;
                        String str8 = clb1.d(messengerEnvironment) ? str : null;
                        String str9 = xl21Var != null ? xl21Var.c : null;
                        String str10 = xl21Var != null ? xl21Var.h : null;
                        boolean z4 = xl21Var != null ? xl21Var.f : false;
                        if (lqoVar.a(tz10.L)) {
                            if (xl21Var != null ? xl21Var.g : false) {
                                z = true;
                                if ((list instanceof Collection) || !list.isEmpty()) {
                                    it = list.iterator();
                                    while (it.hasNext()) {
                                        if (((il21) it.next()).f) {
                                            z2 = true;
                                            break;
                                        }
                                    }
                                }
                                z2 = false;
                                vunVar = new vun(j2, str3, str4, str5, str6, str7, str8, str9, str10, z4, z, z2);
                            }
                        }
                        z = false;
                        if (list instanceof Collection) {
                        }
                        it = list.iterator();
                        while (it.hasNext()) {
                        }
                        z2 = false;
                        vunVar = new vun(j2, str3, str4, str5, str6, str7, str8, str9, str10, z4, z, z2);
                    } else if (((Boolean) androidx.room.util.a.b(uunVar.h.a, true, false, new il01(str2, 26))).booleanValue()) {
                        obj3 = null;
                        vunVar = null;
                        this.L$0 = obj3;
                        this.label = 1;
                        if (vprVar.emit(vunVar, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        Iterator it5 = c.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it5.next();
                            if (jl40.l(((il21) obj2).d, "email")) {
                                break;
                            }
                        }
                        il21 il21Var4 = (il21) obj2;
                        vunVar = new vun(longValue, null, null, il21Var4 != null ? il21Var4.e : null, null, null, null, null, null, false, false, false);
                    }
                    obj3 = null;
                    this.L$0 = obj3;
                    this.label = 1;
                    if (vprVar.emit(vunVar, this) == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(uun uunVar, String str, boolean z, Continuation continuation) {
            super(2, continuation);
            this.this$0 = uunVar;
            this.$userId = str;
            this.$withCurrentOrganizationName = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$userId, this.$withCurrentOrganizationName, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                vpr vprVar = (vpr) this.L$0;
                xn21.a(this.this$0.e, this.$userId);
                rol0 rol0Var = new rol0(new EmployeeController$getCurrentEmployeeFlow$1$1$userChangesFlow$1(this.this$0, this.$userId, null));
                uun uunVar = this.this$0;
                g X = e.X(new m0(uunVar.c.b(), new l7(8, rol0Var, uunVar, this.$userId), new C00861(3, null)), new AnonymousClass2(this.this$0, this.$userId, this.$withCurrentOrganizationName, null));
                this.label = 1;
                if (e.u(X, vprVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmployeeController$getCurrentEmployeeFlow$1(uun uunVar, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = uunVar;
        this.$userId = str;
        this.$withCurrentOrganizationName = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        EmployeeController$getCurrentEmployeeFlow$1 employeeController$getCurrentEmployeeFlow$1 = new EmployeeController$getCurrentEmployeeFlow$1(this.this$0, this.$userId, this.$withCurrentOrganizationName, continuation);
        employeeController$getCurrentEmployeeFlow$1.L$0 = obj;
        return employeeController$getCurrentEmployeeFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EmployeeController$getCurrentEmployeeFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            tpr F = e.F(new rol0(new AnonymousClass1(this.this$0, this.$userId, this.$withCurrentOrganizationName, null)), this.this$0.g.e);
            this.label = 1;
            if (e.u(F, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
