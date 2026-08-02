package com.ybsdk.feature.autotopup.internal.presentation.setup.v1;

import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsSaveInitiatedVersion;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsSaveLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsSaveLoadedVersion;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.navigation.cicerone.Screen;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.autotopup.api.AutoTopupType;
import com.ybsdk.feature.autotopup.internal.domain.e;
import com.ybsdk.feature.autotopup.internal.domain.entities.ConfirmInstructionEntity;
import com.ybsdk.feature.autotopup.internal.presentation.result.AutoTopupResultParams;
import defpackage.c5a0;
import defpackage.f5a0;
import defpackage.g8e;
import defpackage.gao;
import defpackage.h52;
import defpackage.h5a0;
import defpackage.iz3;
import defpackage.j04;
import defpackage.k2b1;
import defpackage.l04;
import defpackage.lrp0;
import defpackage.mvg;
import defpackage.n0t0;
import defpackage.ny61;
import defpackage.nz3;
import defpackage.nzl0;
import defpackage.oz3;
import defpackage.pk11;
import defpackage.pz40;
import defpackage.qk11;
import defpackage.qz3;
import defpackage.rk11;
import defpackage.rsa1;
import defpackage.sk11;
import defpackage.tfl0;
import defpackage.tse;
import defpackage.ty3;
import defpackage.uk11;
import defpackage.vou0;
import defpackage.vv3;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import defpackage.z94;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.autotopup.internal.presentation.setup.v1.AutoTopupSetupViewModel$saveAutoTopup$2", f = "AutoTopupSetupViewModel.kt", l = {548, 567, 588, 609, 622}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupSetupViewModel$saveAutoTopup$2 extends SuspendLambda implements wls {
    final /* synthetic */ qz3 $autoTopupSetupEntity;
    final /* synthetic */ h5a0 $selectedPaymentMethod;
    final /* synthetic */ String $verificationToken;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupSetupViewModel$saveAutoTopup$2(b bVar, qz3 qz3Var, h5a0 h5a0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$autoTopupSetupEntity = qz3Var;
        this.$selectedPaymentMethod = h5a0Var;
        this.$verificationToken = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AutoTopupSetupViewModel$saveAutoTopup$2(this.this$0, this.$autoTopupSetupEntity, this.$selectedPaymentMethod, this.$verificationToken, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoTopupSetupViewModel$saveAutoTopup$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0068, code lost:
    
        if (r0 == r8) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0206, code lost:
    
        if (r0.h0(r17, r14, r3, r59) == r8) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x020a, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0285, code lost:
    
        if (r0.h0(r2, r14, null, r59) == r8) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02e0, code lost:
    
        if (r0 == r8) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b0;
        nzl0 nzl0Var;
        Object obj2;
        ThemedImageUrlEntity themedImageUrlEntity;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        pk11 pk11Var;
        tfl0 tfl0Var;
        Object b;
        r0 r0Var3;
        Object value3;
        Throwable a;
        pz40 Y;
        r0 r0Var4;
        Object value4;
        r0 r0Var5;
        Object value5;
        lrp0 lrp0Var = lrp0.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            qz3 qz3Var = this.$autoTopupSetupEntity;
            h5a0 h5a0Var = this.$selectedPaymentMethod;
            this.label = 1;
            b0 = b.b0(bVar, qz3Var, h5a0Var, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 && i != 4) {
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        tfl0 tfl0Var2 = (tfl0) this.L$1;
                        obj2 = this.L$0;
                        kotlin.b.b(obj);
                        tfl0Var = tfl0Var2;
                        b = obj;
                        tfl0Var.h((Screen) b);
                        b bVar2 = this.this$0;
                        qz3 qz3Var2 = this.$autoTopupSetupEntity;
                        a = Result.a(obj2);
                        if (a != null) {
                        }
                        Y = this.this$0.Y();
                        do {
                            r0Var4 = (r0) Y;
                            value4 = r0Var4.getValue();
                        } while (!r0Var4.k(value4, j04.a((j04) value4, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262139)));
                        return zy11Var;
                    }
                    Object obj3 = this.L$0;
                    kotlin.b.b(obj);
                    obj2 = obj3;
                    b bVar22 = this.this$0;
                    qz3 qz3Var22 = this.$autoTopupSetupEntity;
                    a = Result.a(obj2);
                    if (a != null) {
                        bVar22.I.h(a.getMessage(), k2b1.d(qz3Var22, ((j04) bVar22.X()).k), ((j04) bVar22.X()).l);
                        pz40 Y2 = bVar22.Y();
                        do {
                            r0Var5 = (r0) Y2;
                            value5 = r0Var5.getValue();
                        } while (!r0Var5.k(value5, j04.a((j04) value5, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262079)));
                        bVar22.Y0(gao.e(null, null, a, 3));
                        x4c.g("Error while saving auto topup", a, null, Collections.singletonList(lrp0Var), 4);
                    }
                    Y = this.this$0.Y();
                    do {
                        r0Var4 = (r0) Y;
                        value4 = r0Var4.getValue();
                    } while (!r0Var4.k(value4, j04.a((j04) value4, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262139)));
                    return zy11Var;
                }
                ThemedImageUrlEntity themedImageUrlEntity2 = (ThemedImageUrlEntity) this.L$1;
                nzl0 nzl0Var2 = (nzl0) this.L$0;
                kotlin.b.b(obj);
                nzl0Var = nzl0Var2;
                obj2 = ((Result) obj).getValue();
                themedImageUrlEntity = themedImageUrlEntity2;
                b bVar3 = this.this$0;
                qz3 qz3Var3 = this.$autoTopupSetupEntity;
                if (!(obj2 instanceof Result.Failure)) {
                    sk11 sk11Var = (sk11) obj2;
                    if (sk11Var instanceof rk11) {
                        l04 l04Var = bVar3.I;
                        e eVar = bVar3.M;
                        AutoTopupType d = k2b1.d(qz3Var3, ((j04) bVar3.X()).k);
                        String str = qz3Var3.l;
                        Boolean bool = ((j04) bVar3.X()).l;
                        z94.f(l04Var.a.e, AutotopupEvents$AutoTopupSettingsSaveLoadedResult.OK, null, nzl0Var.b, nzl0Var.c, h52.a(nzl0Var.d), rsa1.c(d), bool != null ? rsa1.e(bool.booleanValue()) : null, null, null, null, null, null, AutotopupEvents$AutoTopupSettingsSaveLoadedVersion.V1, 3970);
                        pz40 Y3 = bVar3.Y();
                        do {
                            r0Var3 = (r0) Y3;
                            value3 = r0Var3.getValue();
                        } while (!r0Var3.k(value3, j04.a((j04) value3, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262079)));
                        if (!((j04) bVar3.X()).d() || (((j04) bVar3.X()).f instanceof f5a0)) {
                            nz3 nz3Var = qz3Var3.h;
                            oz3 oz3Var = nz3Var != null ? nz3Var.b : null;
                            if (((j04) bVar3.X()).f() || oz3Var == null) {
                                ty3 ty3Var = (ty3) ((rk11) sk11Var).a;
                                boolean z = str == null;
                                this.L$0 = obj2;
                                this.L$1 = null;
                                this.label = 3;
                            } else {
                                ConfirmInstructionEntity confirmInstructionEntity = oz3Var.b;
                                iz3 iz3Var = bVar3.D;
                                ty3 ty3Var2 = (ty3) ((rk11) sk11Var).a;
                                AutoTopupResultParams.Polling polling = new AutoTopupResultParams.Polling(ty3Var2.a, ty3Var2.b, ty3Var2.c, themedImageUrlEntity, confirmInstructionEntity.getTitle(), confirmInstructionEntity.getDescription(), eVar.c.a(), bVar3.c0());
                                iz3Var.getClass();
                                FragmentScreen a2 = iz3.a(polling);
                                bVar3.O.a.e.a.a("auto_topup.binding_payment.pending", null);
                                bVar3.C.l(a2);
                            }
                        } else {
                            ty3 ty3Var3 = (ty3) ((rk11) sk11Var).a;
                            ty3 ty3Var4 = new ty3(ty3Var3.a, ty3Var3.b, ty3Var3.c, ty3Var3.d, eVar.c.a());
                            boolean z2 = str == null;
                            vou0 vou0Var = qz3Var3.i;
                            this.L$0 = obj2;
                            this.L$1 = null;
                            this.label = 4;
                        }
                        obj2 = obj3;
                    } else if (sk11Var instanceof pk11) {
                        pz40 Y4 = bVar3.Y();
                        do {
                            r0Var2 = (r0) Y4;
                            value2 = r0Var2.getValue();
                            pk11Var = (pk11) sk11Var;
                        } while (!r0Var2.k(value2, j04.a((j04) value2, null, false, null, null, null, pk11Var.b, null, null, null, null, null, null, null, null, null, null, 262079)));
                        tfl0Var = bVar3.C;
                        uk11 uk11Var = bVar3.E;
                        String str2 = pk11Var.a;
                        this.L$0 = obj2;
                        this.L$1 = tfl0Var;
                        this.label = 5;
                        b = ((vv3) uk11Var).b(str2);
                    } else {
                        if (!(sk11Var instanceof qk11)) {
                            w511.b();
                            return null;
                        }
                        l04 l04Var2 = bVar3.I;
                        qk11 qk11Var = (qk11) sk11Var;
                        String str3 = qk11Var.a;
                        l04Var2.h(str3, k2b1.d(qz3Var3, ((j04) bVar3.X()).k), ((j04) bVar3.X()).l);
                        pz40 Y5 = bVar3.Y();
                        do {
                            r0Var = (r0) Y5;
                            value = r0Var.getValue();
                        } while (!r0Var.k(value, j04.a((j04) value, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262079)));
                        bVar3.Y0(new n0t0(g8e.i(Text.Companion, str3), d.f(qk11Var.b)));
                        x4c.g("Saving auto topup - 2fa denied", null, "entity: " + sk11Var, Collections.singletonList(lrp0Var), 2);
                    }
                    return coroutineSingletons;
                }
                b bVar222 = this.this$0;
                qz3 qz3Var222 = this.$autoTopupSetupEntity;
                a = Result.a(obj2);
                if (a != null) {
                }
                Y = this.this$0.Y();
                do {
                    r0Var4 = (r0) Y;
                    value4 = r0Var4.getValue();
                } while (!r0Var4.k(value4, j04.a((j04) value4, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262139)));
                return zy11Var;
            }
            kotlin.b.b(obj);
            b0 = obj;
        }
        nzl0Var = (nzl0) b0;
        if (nzl0Var != null) {
            h5a0 h5a0Var2 = nzl0Var.d;
            b bVar4 = this.this$0;
            l04 l04Var3 = bVar4.I;
            AutoTopupType d2 = k2b1.d(this.$autoTopupSetupEntity, ((j04) bVar4.X()).k);
            Boolean bool2 = ((j04) this.this$0.X()).l;
            z94.e(l04Var3.a.e, nzl0Var.b, nzl0Var.c, h52.a(h5a0Var2), rsa1.c(d2), bool2 != null ? rsa1.e(bool2.booleanValue()) : null, null, null, null, null, null, AutotopupEvents$AutoTopupSettingsSaveInitiatedVersion.V1, 992);
            this.this$0.I.a.e.a.a("auto_topup.settings.selected_account", g8e.w(1, "nspk_id", h5a0Var2.getId()));
            if (h5a0Var2 instanceof c5a0) {
                x4c.g("Card type is not supported for auto topup", null, h5a0Var2, null, 10);
                return zy11Var;
            }
            ThemedImageUrlEntity d3 = h5a0Var2.d();
            b bVar5 = this.this$0;
            e eVar2 = bVar5.M;
            String str4 = this.$autoTopupSetupEntity.l;
            String str5 = ((j04) bVar5.X()).g;
            String str6 = this.$verificationToken;
            this.L$0 = nzl0Var;
            this.L$1 = d3;
            this.label = 2;
            Object f = eVar2.f(str4, nzl0Var, bVar5, str5, str6, this);
            if (f != coroutineSingletons) {
                obj2 = f;
                themedImageUrlEntity = d3;
                b bVar32 = this.this$0;
                qz3 qz3Var32 = this.$autoTopupSetupEntity;
                if (!(obj2 instanceof Result.Failure)) {
                }
                b bVar2222 = this.this$0;
                qz3 qz3Var2222 = this.$autoTopupSetupEntity;
                a = Result.a(obj2);
                if (a != null) {
                }
                Y = this.this$0.Y();
                do {
                    r0Var4 = (r0) Y;
                    value4 = r0Var4.getValue();
                } while (!r0Var4.k(value4, j04.a((j04) value4, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262139)));
            }
            return coroutineSingletons;
        }
        return zy11Var;
    }
}
