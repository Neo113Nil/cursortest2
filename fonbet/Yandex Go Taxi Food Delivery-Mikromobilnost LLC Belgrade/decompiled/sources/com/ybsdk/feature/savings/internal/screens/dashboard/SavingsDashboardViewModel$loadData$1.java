package com.ybsdk.feature.savings.internal.screens.dashboard;

import com.ybsdk.feature.savings.internal.entities.SavingsDashboardPollStatus;
import com.ybsdk.feature.savings.internal.entities.SavingsDivEntity$ProductType;
import defpackage.ds31;
import defpackage.ebm0;
import defpackage.gc5;
import defpackage.iam0;
import defpackage.iyd0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.o8g0;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.qoh;
import defpackage.rbv;
import defpackage.ssa1;
import defpackage.sya1;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.screens.dashboard.SavingsDashboardViewModel$loadData$1", f = "SavingsDashboardViewModel.kt", l = {HProv.PP_NK_SYNC, Constants.VPN_TRAFFIC, 128}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SavingsDashboardViewModel$loadData$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $setLoadingState;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.feature.savings.internal.screens.dashboard.SavingsDashboardViewModel$loadData$1$2", f = "SavingsDashboardViewModel.kt", l = {HProv.PP_CONTAINER_EXTENSION_DEL}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.savings.internal.screens.dashboard.SavingsDashboardViewModel$loadData$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ SavingsDashboardPollStatus $pollStatus;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(a aVar, SavingsDashboardPollStatus savingsDashboardPollStatus, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$pollStatus = savingsDashboardPollStatus;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$pollStatus, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                a aVar = this.this$0;
                SavingsDashboardPollStatus savingsDashboardPollStatus = this.$pollStatus;
                this.label = 1;
                if (a.b0(aVar, savingsDashboardPollStatus, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsDashboardViewModel$loadData$1(a aVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$setLoadingState = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SavingsDashboardViewModel$loadData$1 savingsDashboardViewModel$loadData$1 = new SavingsDashboardViewModel$loadData$1(this.this$0, this.$setLoadingState, continuation);
        savingsDashboardViewModel$loadData$1.L$0 = obj;
        return savingsDashboardViewModel$loadData$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SavingsDashboardViewModel$loadData$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0142, code lost:
    
        if (r1.isActive() == true) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x00af, code lost:
    
        if (r4 == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0131  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        noh h;
        Object s;
        noh nohVar;
        Object value2;
        SavingsDashboardPollStatus savingsDashboardPollStatus;
        a aVar;
        Object k;
        Object obj2;
        SavingsDashboardPollStatus savingsDashboardPollStatus2;
        Object k2;
        Object obj3;
        a aVar2;
        Object obj4;
        boolean z;
        boolean z2;
        iam0 iam0Var;
        boolean z3;
        iam0 iam0Var2;
        boolean z4;
        iam0 iam0Var3;
        boolean z5;
        iam0 iam0Var4;
        ArrayList arrayList;
        List<gc5> list;
        List list2;
        List list3;
        boolean z6;
        List list4;
        boolean z7;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tse tseVar = (tse) this.L$0;
            a aVar3 = this.this$0;
            boolean z8 = this.$setLoadingState;
            pz40 Y = aVar3.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, ebm0.a((ebm0) value, null, false, null, z8, null, null, 0, false, false, null, Constants.RESULT_CHECK_ERROR_CARRIER_NOT_FOUND)));
            qoh h2 = tje.h(tseVar, null, null, new SavingsDashboardViewModel$loadData$1$dashboardDataRequest$1(this.this$0, null), 3);
            h = tje.h(tseVar, null, null, new SavingsDashboardViewModel$loadData$1$imageModel$1(this.this$0, null), 3);
            this.L$0 = h;
            this.label = 1;
            s = h2.s(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    value2 = this.L$4;
                    aVar = (a) this.L$3;
                    savingsDashboardPollStatus = (SavingsDashboardPollStatus) this.L$2;
                    obj2 = this.L$1;
                    nohVar = (noh) this.L$0;
                    b.b(obj);
                    k = obj;
                    a.c0(aVar, value2, (rbv) k);
                    this.this$0.G.c();
                    value2 = obj2;
                    savingsDashboardPollStatus2 = savingsDashboardPollStatus;
                    if (value2 instanceof Result.Failure) {
                        this.this$0.G.d();
                        if ((savingsDashboardPollStatus2 != null && sya1.c(savingsDashboardPollStatus2)) || savingsDashboardPollStatus2 == null) {
                            a aVar4 = this.this$0;
                            this.L$0 = value2;
                            this.L$1 = savingsDashboardPollStatus2;
                            this.L$2 = aVar4;
                            this.L$3 = value2;
                            this.L$4 = null;
                            this.label = 3;
                            k2 = nohVar.k(this);
                            if (k2 != coroutineSingletons) {
                                obj3 = value2;
                                aVar2 = aVar4;
                                obj4 = obj3;
                                a.c0(aVar2, obj3, (rbv) k2);
                                value2 = obj4;
                            }
                            return coroutineSingletons;
                        }
                    }
                    if (savingsDashboardPollStatus2 != null) {
                    }
                    z = true;
                    z2 = value2 instanceof Result.Failure;
                    iam0 iam0Var5 = (iam0) (z2 ? null : value2);
                    if ((iam0Var5 != null ? iam0Var5.g : null) == SavingsDashboardPollStatus.OPENING_ACCOUNT_POLLING) {
                    }
                    iam0Var = (iam0) (z2 ? null : value2);
                    if (iam0Var != null) {
                    }
                    z3 = false;
                    iam0Var2 = (iam0) (z2 ? null : value2);
                    if (iam0Var2 != null) {
                    }
                    z4 = false;
                    if (z2) {
                    }
                    iam0Var3 = (iam0) value2;
                    if (iam0Var3 != null) {
                    }
                    z5 = false;
                    a aVar5 = this.this$0;
                    o8g0 o8g0Var = aVar5.I;
                    iam0Var4 = ((ebm0) aVar5.X()).f;
                    if (iam0Var4 != null) {
                    }
                    arrayList = null;
                    o8g0Var.p(z2, r11, z3, z4, z5, arrayList);
                    this.this$0.N = false;
                    return zy11.a;
                }
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj3 = this.L$3;
                aVar2 = (a) this.L$2;
                savingsDashboardPollStatus2 = (SavingsDashboardPollStatus) this.L$1;
                Object obj5 = this.L$0;
                b.b(obj);
                obj4 = obj5;
                k2 = obj;
                a.c0(aVar2, obj3, (rbv) k2);
                value2 = obj4;
                if (savingsDashboardPollStatus2 != null || sya1.c(savingsDashboardPollStatus2)) {
                    z = true;
                } else {
                    pzt0 pzt0Var = this.this$0.K;
                    if (pzt0Var != null) {
                        z = true;
                    } else {
                        z = true;
                    }
                    a aVar6 = this.this$0;
                    aVar6.K = tje.N(ds31.a(aVar6), null, null, new AnonymousClass2(this.this$0, savingsDashboardPollStatus2, null), 3);
                }
                z2 = value2 instanceof Result.Failure;
                iam0 iam0Var52 = (iam0) (z2 ? null : value2);
                boolean z9 = (iam0Var52 != null ? iam0Var52.g : null) == SavingsDashboardPollStatus.OPENING_ACCOUNT_POLLING ? z : false;
                iam0Var = (iam0) (z2 ? null : value2);
                if (iam0Var != null || (list4 = iam0Var.f) == null) {
                    z3 = false;
                } else {
                    List<gc5> list5 = list4;
                    a aVar7 = this.this$0;
                    if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                        for (gc5 gc5Var : list5) {
                            aVar7.getClass();
                            if (a.o0(gc5Var) == SavingsDivEntity$ProductType.DEPOSIT) {
                                z7 = z;
                                break;
                            }
                        }
                    }
                    z7 = false;
                    z3 = z7;
                }
                iam0Var2 = (iam0) (z2 ? null : value2);
                if (iam0Var2 != null || (list3 = iam0Var2.f) == null) {
                    z4 = false;
                } else {
                    List<gc5> list6 = list3;
                    a aVar8 = this.this$0;
                    if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                        for (gc5 gc5Var2 : list6) {
                            aVar8.getClass();
                            if (a.o0(gc5Var2) == SavingsDivEntity$ProductType.SAVINGS) {
                                z6 = z;
                                break;
                            }
                        }
                    }
                    z6 = false;
                    z4 = z6;
                }
                if (z2) {
                    value2 = null;
                }
                iam0Var3 = (iam0) value2;
                if (iam0Var3 != null || (list2 = iam0Var3.f) == null) {
                    z5 = false;
                } else {
                    List<gc5> list7 = list2;
                    a aVar9 = this.this$0;
                    if (!(list7 instanceof Collection) || !list7.isEmpty()) {
                        for (gc5 gc5Var3 : list7) {
                            aVar9.getClass();
                            if (a.o0(gc5Var3) == SavingsDivEntity$ProductType.INVESTMENT) {
                                break;
                            }
                        }
                    }
                    z = false;
                    z5 = z;
                }
                a aVar52 = this.this$0;
                o8g0 o8g0Var2 = aVar52.I;
                iam0Var4 = ((ebm0) aVar52.X()).f;
                if (iam0Var4 != null || (list = iam0Var4.f) == null) {
                    arrayList = null;
                } else {
                    a aVar10 = this.this$0;
                    ArrayList arrayList2 = new ArrayList();
                    for (gc5 gc5Var4 : list) {
                        aVar10.getClass();
                        String d0 = a.d0(gc5Var4);
                        String b = d0 != null ? ssa1.b(d0) : null;
                        if (b != null) {
                            arrayList2.add(b);
                        }
                    }
                    arrayList = arrayList2;
                }
                o8g0Var2.p(z2, z9, z3, z4, z5, arrayList);
                this.this$0.N = false;
                return zy11.a;
            }
            h = (noh) this.L$0;
            b.b(obj);
            s = obj;
        }
        nohVar = h;
        value2 = ((Result) s).getValue();
        if (!(value2 instanceof Result.Failure)) {
            value2 = (iam0) ((iyd0) value2).a;
        }
        boolean z10 = value2 instanceof Result.Failure;
        iam0 iam0Var6 = (iam0) (z10 ? null : value2);
        savingsDashboardPollStatus = iam0Var6 != null ? iam0Var6.g : null;
        if (!z10) {
            aVar = this.this$0;
            this.L$0 = nohVar;
            this.L$1 = value2;
            this.L$2 = savingsDashboardPollStatus;
            this.L$3 = aVar;
            this.L$4 = value2;
            this.label = 2;
            k = nohVar.k(this);
            if (k != coroutineSingletons) {
                obj2 = value2;
                a.c0(aVar, value2, (rbv) k);
                this.this$0.G.c();
                value2 = obj2;
            }
            return coroutineSingletons;
        }
        savingsDashboardPollStatus2 = savingsDashboardPollStatus;
        if (value2 instanceof Result.Failure) {
        }
        if (savingsDashboardPollStatus2 != null) {
        }
        z = true;
        z2 = value2 instanceof Result.Failure;
        iam0 iam0Var522 = (iam0) (z2 ? null : value2);
        if ((iam0Var522 != null ? iam0Var522.g : null) == SavingsDashboardPollStatus.OPENING_ACCOUNT_POLLING) {
        }
        iam0Var = (iam0) (z2 ? null : value2);
        if (iam0Var != null) {
        }
        z3 = false;
        iam0Var2 = (iam0) (z2 ? null : value2);
        if (iam0Var2 != null) {
        }
        z4 = false;
        if (z2) {
        }
        iam0Var3 = (iam0) value2;
        if (iam0Var3 != null) {
        }
        z5 = false;
        a aVar522 = this.this$0;
        o8g0 o8g0Var22 = aVar522.I;
        iam0Var4 = ((ebm0) aVar522.X()).f;
        if (iam0Var4 != null) {
        }
        arrayList = null;
        o8g0Var22.p(z2, z9, z3, z4, z5, arrayList);
        this.this$0.N = false;
        return zy11.a;
    }
}
