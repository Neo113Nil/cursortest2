package com.ybsdk.feature.savings.internal.screens.account;

import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountLoadedType;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.feature.savings.internal.entities.AccountType;
import com.ybsdk.feature.savings.internal.interactors.d;
import com.ybsdk.rconfig.configs.SavingsAccountBalanceAnimation;
import defpackage.f8m0;
import defpackage.g8e;
import defpackage.k9m0;
import defpackage.m9m0;
import defpackage.mvg;
import defpackage.n4m0;
import defpackage.ndm0;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.qos;
import defpackage.r7m0;
import defpackage.s7m0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.vgb1;
import defpackage.wls;
import defpackage.x4c;
import defpackage.x6m0;
import defpackage.z7m0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.screens.account.SavingsAccountViewModel$loadInfo$3", f = "SavingsAccountViewModel.kt", l = {275, 290}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SavingsAccountViewModel$loadInfo$3 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $refreshing;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsAccountViewModel$loadInfo$3(a aVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$refreshing = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SavingsAccountViewModel$loadInfo$3(this.this$0, this.$refreshing, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SavingsAccountViewModel$loadInfo$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0044, code lost:
    
        if (r2 == r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x014d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        a aVar;
        qos qosVar;
        Object obj2;
        x6m0 x6m0Var;
        a aVar2;
        x6m0 x6m0Var2;
        Throwable a2;
        r0 r0Var;
        Object value;
        boolean z;
        pz40 Y;
        r0 r0Var2;
        Object value2;
        r7m0 r7m0Var;
        Iterator it;
        Object obj3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar3 = this.this$0;
            d dVar = aVar3.F;
            String agreementId = aVar3.B.getAgreementId();
            this.label = 1;
            a = dVar.a(agreementId, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                x6m0Var2 = (x6m0) this.L$2;
                aVar2 = (a) this.L$1;
                obj2 = this.L$0;
                b.b(obj);
                x6m0Var = x6m0Var2;
                aVar = aVar2;
                aVar.S = false;
                if (((SavingsAccountBalanceAnimation) ((ndm0) aVar.G).a.d(n4m0.c).getData()).isEnabled() && x6m0Var.j.getAmount().longValue() >= r1.a()) {
                    if (vgb1.d(aVar.F.a.b.a.a.getLong("savings_account_balance_animation_timestamp_".concat(aVar.B.getAgreementId()), -1L)) && x6m0Var.d != AccountType.DEPOSIT) {
                        z = true;
                        Y = aVar.Y();
                        do {
                            r0Var2 = (r0) Y;
                            value2 = r0Var2.getValue();
                            r7m0Var = (r7m0) value2;
                            it = x6m0Var.n.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj3 = null;
                                    break;
                                }
                                obj3 = it.next();
                                if (((s7m0) obj3).b) {
                                    break;
                                }
                            }
                        } while (!r0Var2.k(value2, r7m0.a(r7m0Var, null, x6m0Var, null, null, null, (s7m0) obj3, z, false, HProv.ALG_SID_SHA_224)));
                        aVar.M.c();
                        a = obj2;
                        a aVar4 = this.this$0;
                        a2 = Result.a(a);
                        if (a2 != null) {
                            Object X = aVar4.X();
                            SavingsAccountScreenParams savingsAccountScreenParams = aVar4.B;
                            x6m0 x6m0Var3 = ((r7m0) X).b;
                            aVar4.E.f0.J(SavingsEvents$SavingsAccountLoadedResult.ERROR, savingsAccountScreenParams.getAgreementId(), a.b0(aVar4, x6m0Var3 != null ? x6m0Var3.d : null), null, null, null);
                            x4c.g("Failed to load info for savings account", a2, g8e.o("agreementId: ", savingsAccountScreenParams.getAgreementId()), null, 8);
                            pz40 Y2 = aVar4.Y();
                            do {
                                r0Var = (r0) Y2;
                                value = r0Var.getValue();
                            } while (!r0Var.k(value, r7m0.a((r7m0) value, null, null, a2, null, null, null, false, false, 377)));
                            aVar4.M.d();
                        }
                        this.this$0.Z(new z7m0(false));
                        return zy11.a;
                    }
                }
                z = false;
                Y = aVar.Y();
                do {
                    r0Var2 = (r0) Y;
                    value2 = r0Var2.getValue();
                    r7m0Var = (r7m0) value2;
                    it = x6m0Var.n.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                        }
                    }
                } while (!r0Var2.k(value2, r7m0.a(r7m0Var, null, x6m0Var, null, null, null, (s7m0) obj3, z, false, HProv.ALG_SID_SHA_224)));
                aVar.M.c();
                a = obj2;
                a aVar42 = this.this$0;
                a2 = Result.a(a);
                if (a2 != null) {
                }
                this.this$0.Z(new z7m0(false));
                return zy11.a;
            }
            b.b(obj);
            a = ((Result) obj).getValue();
        }
        aVar = this.this$0;
        boolean z2 = this.$refreshing;
        if (!(a instanceof Result.Failure)) {
            x6m0 x6m0Var4 = (x6m0) a;
            SavingsEvents$SavingsAccountLoadedType b0 = a.b0(aVar, x6m0Var4.d);
            AccountType accountType = x6m0Var4.d;
            if ((accountType == null ? -1 : f8m0.a[accountType.ordinal()]) == 3) {
                List list = x6m0Var4.m;
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : list) {
                    if (obj4 instanceof m9m0) {
                        arrayList.add(obj4);
                    }
                }
                m9m0 m9m0Var = (m9m0) kotlin.collections.a.R(arrayList);
                if (m9m0Var == null) {
                    qosVar = new qos(Boolean.FALSE, null, null);
                } else {
                    ArrayList arrayList2 = m9m0Var.d;
                    if (arrayList2.isEmpty()) {
                        qosVar = new qos(Boolean.TRUE, null, null);
                    } else {
                        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(((k9m0) it2.next()).a);
                        }
                        qosVar = new qos(Boolean.TRUE, (String) kotlin.collections.a.Z(arrayList3), arrayList3);
                    }
                }
            } else {
                qosVar = new qos(null, null, null);
            }
            aVar.E.f0.J(SavingsEvents$SavingsAccountLoadedResult.OK, aVar.B.getAgreementId(), b0, qosVar.a, qosVar.b, qosVar.c);
            for (s7m0 s7m0Var : x6m0Var4.n) {
                ThemedImageUrlEntity themedImageUrlEntity = s7m0Var.d;
                if (themedImageUrlEntity != null) {
                    aVar.w0(themedImageUrlEntity);
                }
                ThemedImageUrlEntity themedImageUrlEntity2 = s7m0Var.p;
                if (themedImageUrlEntity2 != null) {
                    aVar.w0(themedImageUrlEntity2);
                }
            }
            if (!z2) {
                this.L$0 = a;
                this.L$1 = aVar;
                this.L$2 = x6m0Var4;
                this.label = 2;
                if (kotlinx.coroutines.a.i(300L, this) != coroutineSingletons) {
                    obj2 = a;
                    aVar2 = aVar;
                    x6m0Var2 = x6m0Var4;
                    x6m0Var = x6m0Var2;
                    aVar = aVar2;
                    aVar.S = false;
                    if (((SavingsAccountBalanceAnimation) ((ndm0) aVar.G).a.d(n4m0.c).getData()).isEnabled()) {
                        if (vgb1.d(aVar.F.a.b.a.a.getLong("savings_account_balance_animation_timestamp_".concat(aVar.B.getAgreementId()), -1L))) {
                            z = true;
                            Y = aVar.Y();
                            do {
                                r0Var2 = (r0) Y;
                                value2 = r0Var2.getValue();
                                r7m0Var = (r7m0) value2;
                                it = x6m0Var.n.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                    }
                                }
                            } while (!r0Var2.k(value2, r7m0.a(r7m0Var, null, x6m0Var, null, null, null, (s7m0) obj3, z, false, HProv.ALG_SID_SHA_224)));
                            aVar.M.c();
                            a = obj2;
                        }
                    }
                    z = false;
                    Y = aVar.Y();
                    do {
                        r0Var2 = (r0) Y;
                        value2 = r0Var2.getValue();
                        r7m0Var = (r7m0) value2;
                        it = x6m0Var.n.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                            }
                        }
                    } while (!r0Var2.k(value2, r7m0.a(r7m0Var, null, x6m0Var, null, null, null, (s7m0) obj3, z, false, HProv.ALG_SID_SHA_224)));
                    aVar.M.c();
                    a = obj2;
                }
                return coroutineSingletons;
            }
            obj2 = a;
            x6m0Var = x6m0Var4;
            aVar.S = false;
            if (((SavingsAccountBalanceAnimation) ((ndm0) aVar.G).a.d(n4m0.c).getData()).isEnabled()) {
            }
            z = false;
            Y = aVar.Y();
            do {
                r0Var2 = (r0) Y;
                value2 = r0Var2.getValue();
                r7m0Var = (r7m0) value2;
                it = x6m0Var.n.iterator();
                while (true) {
                    if (!it.hasNext()) {
                    }
                }
            } while (!r0Var2.k(value2, r7m0.a(r7m0Var, null, x6m0Var, null, null, null, (s7m0) obj3, z, false, HProv.ALG_SID_SHA_224)));
            aVar.M.c();
            a = obj2;
        }
        a aVar422 = this.this$0;
        a2 = Result.a(a);
        if (a2 != null) {
        }
        this.this$0.Z(new z7m0(false));
        return zy11.a;
    }
}
