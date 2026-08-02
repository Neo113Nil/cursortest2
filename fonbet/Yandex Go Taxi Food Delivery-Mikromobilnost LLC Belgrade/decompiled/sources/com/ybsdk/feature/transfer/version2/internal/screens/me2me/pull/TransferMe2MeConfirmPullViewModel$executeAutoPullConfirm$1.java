package com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull;

import com.ybsdk.core.analytics.generated.delegates.Me2mePullDebitEvents$Me2mePullDebitAutoPullScreenConfirmResultResult;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.transfer.version2.api.TransferTwoFactorScreenProvider$Request;
import defpackage.dzh0;
import defpackage.g8e;
import defpackage.gao;
import defpackage.gm01;
import defpackage.km01;
import defpackage.lrp0;
import defpackage.mvg;
import defpackage.n0t0;
import defpackage.ny61;
import defpackage.pk11;
import defpackage.pz40;
import defpackage.qk11;
import defpackage.r8j0;
import defpackage.rk11;
import defpackage.s8j0;
import defpackage.sk11;
import defpackage.t8j0;
import defpackage.tse;
import defpackage.u8j0;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull.TransferMe2MeConfirmPullViewModel$executeAutoPullConfirm$1", f = "TransferMe2MeConfirmPullViewModel.kt", l = {65, 82}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransferMe2MeConfirmPullViewModel$executeAutoPullConfirm$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $verificationToken;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferMe2MeConfirmPullViewModel$executeAutoPullConfirm$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$verificationToken = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransferMe2MeConfirmPullViewModel$executeAutoPullConfirm$1(this.this$0, this.$verificationToken, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransferMe2MeConfirmPullViewModel$executeAutoPullConfirm$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x009b, code lost:
    
        if (r15 == r0) goto L67;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        Object t8j0Var;
        Object a;
        r0 r0Var2;
        Object value2;
        Object t8j0Var2;
        r0 r0Var3;
        Object value3;
        Object t8j0Var3;
        r0 r0Var4;
        Object value4;
        pk11 pk11Var;
        Object t8j0Var4;
        a aVar;
        r0 r0Var5;
        Object value5;
        Object t8j0Var5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            pz40 Y = this.this$0.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
                u8j0 u8j0Var = (u8j0) value;
                if (u8j0Var instanceof r8j0) {
                    r8j0 r8j0Var = (r8j0) u8j0Var;
                    t8j0Var = new r8j0(km01.a((km01) r8j0Var.a, Status.CONFIRMING_PROGRESS, null, 23), r8j0Var.b, r8j0Var.c, r8j0Var.d);
                } else if (u8j0Var instanceof s8j0) {
                    t8j0Var = new s8j0(((s8j0) u8j0Var).a);
                } else {
                    if (!(u8j0Var instanceof t8j0)) {
                        w511.b();
                        return null;
                    }
                    t8j0Var = new t8j0();
                }
            } while (!r0Var.k(value, t8j0Var));
            a aVar2 = this.this$0;
            com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull.domain.a aVar3 = aVar2.I;
            String partnerId = aVar2.D.getPartnerId();
            km01 km01Var = (km01) ((u8j0) this.this$0.X()).a();
            String str = km01Var != null ? km01Var.e : null;
            String str2 = this.$verificationToken;
            this.label = 1;
            a = aVar3.a(partnerId, str, str2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = (a) this.L$0;
                b.b(obj);
                aVar.G.c(Me2mePullDebitEvents$Me2mePullDebitAutoPullScreenConfirmResultResult.TWO_FA);
                return zy11.a;
            }
            b.b(obj);
            a = ((Result) obj).getValue();
        }
        a aVar4 = this.this$0;
        Throwable a2 = Result.a(a);
        if (a2 == null) {
            sk11 sk11Var = (sk11) a;
            if (sk11Var instanceof rk11) {
                u8j0 u8j0Var2 = aVar4.H;
                if (u8j0Var2 == null) {
                    u8j0Var2 = (u8j0) aVar4.X();
                }
                pz40 Y2 = aVar4.Y();
                do {
                    r0Var5 = (r0) Y2;
                    value5 = r0Var5.getValue();
                    if (u8j0Var2 instanceof r8j0) {
                        r8j0 r8j0Var2 = (r8j0) u8j0Var2;
                        t8j0Var5 = new r8j0(km01.a((km01) r8j0Var2.a, Status.CONFIRMED, null, 7), r8j0Var2.b, r8j0Var2.c, r8j0Var2.d);
                    } else if (u8j0Var2 instanceof s8j0) {
                        t8j0Var5 = new s8j0(((s8j0) u8j0Var2).a);
                    } else {
                        if (!(u8j0Var2 instanceof t8j0)) {
                            w511.b();
                            return null;
                        }
                        t8j0Var5 = new t8j0();
                    }
                } while (!r0Var5.k(value5, t8j0Var5));
                aVar4.G.c(Me2mePullDebitEvents$Me2mePullDebitAutoPullScreenConfirmResultResult.OK);
            } else {
                if (sk11Var instanceof pk11) {
                    pz40 Y3 = aVar4.Y();
                    do {
                        r0Var4 = (r0) Y3;
                        value4 = r0Var4.getValue();
                        u8j0 u8j0Var3 = (u8j0) value4;
                        pk11Var = (pk11) sk11Var;
                        if (u8j0Var3 instanceof r8j0) {
                            r8j0 r8j0Var3 = (r8j0) u8j0Var3;
                            t8j0Var4 = new r8j0(km01.a((km01) r8j0Var3.a, Status.INITIAL, pk11Var.b, 7), r8j0Var3.b, r8j0Var3.c, r8j0Var3.d);
                        } else if (u8j0Var3 instanceof s8j0) {
                            t8j0Var4 = new s8j0(((s8j0) u8j0Var3).a);
                        } else {
                            if (!(u8j0Var3 instanceof t8j0)) {
                                w511.b();
                                return null;
                            }
                            t8j0Var4 = new t8j0();
                        }
                    } while (!r0Var4.k(value4, t8j0Var4));
                    String str3 = pk11Var.a;
                    TransferTwoFactorScreenProvider$Request transferTwoFactorScreenProvider$Request = TransferTwoFactorScreenProvider$Request.CONFIRM_ME2ME_AUTO_PULL;
                    this.L$0 = aVar4;
                    this.label = 2;
                    if (a.b0(aVar4, str3, transferTwoFactorScreenProvider$Request, this) != coroutineSingletons) {
                        aVar = aVar4;
                        aVar.G.c(Me2mePullDebitEvents$Me2mePullDebitAutoPullScreenConfirmResultResult.TWO_FA);
                    }
                    return coroutineSingletons;
                }
                if (!(sk11Var instanceof qk11)) {
                    w511.b();
                    return null;
                }
                pz40 Y4 = aVar4.Y();
                do {
                    r0Var3 = (r0) Y4;
                    value3 = r0Var3.getValue();
                    u8j0 u8j0Var4 = (u8j0) value3;
                    if (u8j0Var4 instanceof r8j0) {
                        r8j0 r8j0Var4 = (r8j0) u8j0Var4;
                        t8j0Var3 = new r8j0(km01.a((km01) r8j0Var4.a, Status.INITIAL, null, 7), r8j0Var4.b, r8j0Var4.c, r8j0Var4.d);
                    } else if (u8j0Var4 instanceof s8j0) {
                        t8j0Var3 = new s8j0(((s8j0) u8j0Var4).a);
                    } else {
                        if (!(u8j0Var4 instanceof t8j0)) {
                            w511.b();
                            return null;
                        }
                        t8j0Var3 = new t8j0();
                    }
                } while (!r0Var3.k(value3, t8j0Var3));
                qk11 qk11Var = (qk11) sk11Var;
                aVar4.Z(new gm01(new n0t0(g8e.i(Text.Companion, qk11Var.a), d.f(qk11Var.b))));
                aVar4.G.c(Me2mePullDebitEvents$Me2mePullDebitAutoPullScreenConfirmResultResult.ERROR);
            }
        } else {
            aVar4.H = (u8j0) aVar4.X();
            x4c.g("Can't confirm me2me auto pull", a2, null, Collections.singletonList(lrp0.p), 4);
            pz40 Y5 = aVar4.Y();
            do {
                r0Var2 = (r0) Y5;
                value2 = r0Var2.getValue();
                u8j0 u8j0Var5 = (u8j0) value2;
                if (u8j0Var5 instanceof r8j0) {
                    r8j0 r8j0Var5 = (r8j0) u8j0Var5;
                    t8j0Var2 = new r8j0(km01.a((km01) r8j0Var5.a, Status.INITIAL, null, 7), r8j0Var5.b, r8j0Var5.c, r8j0Var5.d);
                } else if (u8j0Var5 instanceof s8j0) {
                    t8j0Var2 = new s8j0(((s8j0) u8j0Var5).a);
                } else {
                    if (!(u8j0Var5 instanceof t8j0)) {
                        w511.b();
                        return null;
                    }
                    t8j0Var2 = new t8j0();
                }
            } while (!r0Var2.k(value2, t8j0Var2));
            aVar4.Z(new gm01(gao.d(new Text.Resource(dzh0.ybsdk_transfer_auto_pull_permission_error_title), new Text.Resource(dzh0.ybsdk_transfer_auto_pull_permission_error_subtitle), a2)));
            aVar4.G.c(Me2mePullDebitEvents$Me2mePullDebitAutoPullScreenConfirmResultResult.ERROR);
        }
        return zy11.a;
    }
}
