package com.yandex.go.scooters.discovery;

import com.yandex.go.scooters.mosru.api.domain.model.ScootersMosRuWebViewOpenReason;
import com.yandex.go.scooters.photocontrol.api.ScootersExamType;
import com.yandex.go.scooters.subscription.api.ScootersSubscriptionEntryPoint;
import com.yandex.go.scooters.subscription.api.ScootersSubscriptionPayload$SubscriptionFromScreen;
import defpackage.axo0;
import defpackage.c21;
import defpackage.fno0;
import defpackage.izn0;
import defpackage.j73;
import defpackage.l76;
import defpackage.m950;
import defpackage.m970;
import defpackage.mio0;
import defpackage.mvg;
import defpackage.n970;
import defpackage.ny61;
import defpackage.o970;
import defpackage.oio0;
import defpackage.p970;
import defpackage.q970;
import defpackage.r970;
import defpackage.reo0;
import defpackage.s970;
import defpackage.seo0;
import defpackage.sy60;
import defpackage.t970;
import defpackage.teo0;
import defpackage.tse;
import defpackage.u970;
import defpackage.v6n0;
import defpackage.v970;
import defpackage.w511;
import defpackage.w970;
import defpackage.wls;
import defpackage.x970;
import defpackage.y4c0;
import defpackage.y970;
import defpackage.z970;
import defpackage.zin0;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.discovery.ScootersDiscoveryRouter$openSubRouter$1", f = "ScootersDiscoveryRouter.kt", l = {179, 185}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersDiscoveryRouter$openSubRouter$1 extends SuspendLambda implements wls {
    final /* synthetic */ z970 $action;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDiscoveryRouter$openSubRouter$1(z970 z970Var, m mVar, Continuation continuation) {
        super(2, continuation);
        this.$action = z970Var;
        this.this$0 = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersDiscoveryRouter$openSubRouter$1(this.$action, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersDiscoveryRouter$openSubRouter$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c9, code lost:
    
        if (com.yandex.go.scooters.discovery.m.P(r8, r7) == r0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01a7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01a5, code lost:
    
        if (com.yandex.go.scooters.discovery.m.Q(r8, r7) == r0) goto L74;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object oio0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            z970 z970Var = this.$action;
            if (z970Var instanceof x970) {
                m mVar = this.this$0;
                x970 x970Var = (x970) z970Var;
                mVar.A((m950) mVar.a0.get(), new axo0(x970Var.a, x970Var.b, false, ScootersSubscriptionEntryPoint.DEEPLINK, ScootersSubscriptionPayload$SubscriptionFromScreen.DISCOVERY, x970Var.c), new v6n0(mVar.D, 4));
            } else if (z970Var instanceof r970) {
                m mVar2 = this.this$0;
                r970 r970Var = (r970) z970Var;
                String str = r970Var.a;
                String str2 = r970Var.b;
                mVar2.getClass();
                mVar2.T(new seo0(str), str2);
            } else if (z970Var instanceof y970) {
                m mVar3 = this.this$0;
                y970 y970Var = (y970) z970Var;
                String str3 = y970Var.a;
                String str4 = y970Var.b;
                mVar3.getClass();
                mVar3.T(new teo0(str3), str4);
            } else if (z970Var instanceof m970) {
                this.this$0.T(l76.P, ((m970) z970Var).a);
            } else if (z970Var instanceof n970) {
                this.this$0.T(reo0.a, ((n970) z970Var).a);
            } else {
                boolean z = z970Var instanceof w970;
                c21 c21Var = sy60.Q2;
                if (z) {
                    m mVar4 = this.this$0;
                    mVar4.D((m950) mVar4.W.get(), new fno0(((w970) z970Var).a), c21Var);
                } else if (z970Var instanceof s970) {
                    m mVar5 = this.this$0;
                    this.label = 1;
                } else if (z970Var instanceof p970) {
                    m mVar6 = this.this$0;
                    mVar6.z((m950) mVar6.T.get(), new v6n0(mVar6.D, 2));
                } else if (z970Var instanceof q970) {
                    this.this$0.S(new izn0(ScootersMosRuWebViewOpenReason.DEEPLINK));
                } else if (z970Var instanceof v970) {
                    m mVar7 = this.this$0;
                    v970 v970Var = (v970) z970Var;
                    String str5 = v970Var.a;
                    String str6 = v970Var.b;
                    y4c0 a = mVar7.K.a();
                    if (str5 != null) {
                        int hashCode = str5.hashCode();
                        if (hashCode != -1223006557) {
                            if (hashCode != 90681097) {
                                if (hashCode == 2122391031 && str5.equals("photo_check_with_passport_required")) {
                                    oio0Var = new oio0(j73.f0(new ScootersExamType[]{ScootersExamType.SELFIE, ScootersExamType.PASSPORT}), str6);
                                    mVar7.D(a, oio0Var, c21Var);
                                }
                            } else if (str5.equals("check_status")) {
                                oio0Var = mio0.a;
                                mVar7.D(a, oio0Var, c21Var);
                            }
                        } else if (str5.equals("photo_check_required")) {
                            oio0Var = new oio0(Collections.singleton(ScootersExamType.SELFIE), str6);
                            mVar7.D(a, oio0Var, c21Var);
                        }
                    }
                    oio0Var = new oio0(Collections.singleton(ScootersExamType.SELFIE), str6);
                    mVar7.D(a, oio0Var, c21Var);
                } else if (z970Var instanceof t970) {
                    m mVar8 = this.this$0;
                    mVar8.C(mVar8.O.a(), c21Var);
                } else if (z970Var instanceof o970) {
                    m mVar9 = this.this$0;
                    o970 o970Var = (o970) z970Var;
                    mVar9.D((m950) mVar9.d0.get(), new zin0(o970Var.a, o970Var.b), c21Var);
                } else {
                    if (!(z970Var instanceof u970)) {
                        w511.b();
                        return null;
                    }
                    m mVar10 = this.this$0;
                    this.label = 2;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
