package com.ybsdk.feature.transfer.version2.internal.screens.result;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams;
import com.ybsdk.feature.transfer.version2.internal.entities.ResultStatus;
import defpackage.az3;
import defpackage.ds31;
import defpackage.dzh0;
import defpackage.g8e;
import defpackage.gs01;
import defpackage.hs01;
import defpackage.kk01;
import defpackage.mk01;
import defpackage.mvg;
import defpackage.nh01;
import defpackage.nk01;
import defpackage.ny61;
import defpackage.pk11;
import defpackage.pxy0;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.qk11;
import defpackage.rk11;
import defpackage.rmy0;
import defpackage.sk11;
import defpackage.tje;
import defpackage.tse;
import defpackage.unr0;
import defpackage.w511;
import defpackage.wg01;
import defpackage.wls;
import defpackage.xg01;
import defpackage.yg01;
import defpackage.zg01;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.result.TransferMainResultViewModel$callConfirm$1", f = "TransferMainResultViewModel.kt", l = {165, 175}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransferMainResultViewModel$callConfirm$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $verificationToken;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferMainResultViewModel$callConfirm$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$verificationToken = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TransferMainResultViewModel$callConfirm$1 transferMainResultViewModel$callConfirm$1 = new TransferMainResultViewModel$callConfirm$1(this.this$0, this.$verificationToken, continuation);
        transferMainResultViewModel$callConfirm$1.L$0 = obj;
        return transferMainResultViewModel$callConfirm$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransferMainResultViewModel$callConfirm$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009e, code lost:
    
        if (com.ybsdk.feature.transfer.version2.internal.screens.result.a.d0(r0, r1, r24) == r6) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a0, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0051, code lost:
    
        if (r0 == r6) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        r0 r0Var4;
        Object value4;
        r0 r0Var5;
        Object value5;
        kk01 kk01Var;
        ResultStatus resultStatus;
        Text.Constant i;
        String str;
        r0 r0Var6;
        Object value6;
        pk11 pk11Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            b.b(obj);
            tse tseVar = (tse) this.L$0;
            a aVar = this.this$0;
            com.ybsdk.feature.transfer.version2.internal.domain.b bVar = aVar.N;
            TransferMainResultScreenParams transferMainResultScreenParams = ((kk01) aVar.X()).b;
            String str2 = this.$verificationToken;
            String str3 = ((kk01) this.this$0.X()).e;
            a aVar2 = this.this$0;
            this.L$0 = tseVar;
            this.label = 1;
            a = bVar.a(transferMainResultScreenParams, str2, str3, aVar2, this);
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            a = obj;
        }
        sk11 sk11Var = (sk11) a;
        if (sk11Var instanceof pk11) {
            this.this$0.p0(xg01.b);
            pz40 Y = this.this$0.Y();
            do {
                r0Var6 = (r0) Y;
                value6 = r0Var6.getValue();
                pk11Var = (pk11) sk11Var;
            } while (!r0Var6.k(value6, kk01.a((kk01) value6, null, null, null, pk11Var.b, null, null, null, null, null, null, null, 8175)));
            a aVar3 = this.this$0;
            String str4 = pk11Var.a;
            this.L$0 = null;
            this.label = 2;
        } else {
            boolean z = sk11Var instanceof qk11;
            wg01 wg01Var = wg01.b;
            gs01 gs01Var = gs01.a;
            if (z) {
                a aVar4 = this.this$0;
                ResultStatus resultStatus2 = ResultStatus.FAILED;
                qk11 qk11Var = (qk11) sk11Var;
                String str5 = qk11Var.a;
                aVar4.e0(resultStatus2, null, str5);
                a aVar5 = this.this$0;
                a.c0(aVar5, aVar5.G, gs01Var);
                this.this$0.p0(wg01Var);
                pz40 Y2 = this.this$0.Y();
                do {
                    r0Var5 = (r0) Y2;
                    value5 = r0Var5.getValue();
                    kk01Var = (kk01) value5;
                    resultStatus = ResultStatus.FAILED;
                    i = g8e.i(Text.Companion, str5);
                    str = qk11Var.b;
                } while (!r0Var5.k(value5, kk01.a(kk01Var, null, resultStatus, null, null, i, str != null ? new Text.Constant(str) : null, qk11Var.d, null, null, null, null, 7947)));
            } else {
                if (!(sk11Var instanceof rk11)) {
                    w511.b();
                    return null;
                }
                a aVar6 = this.this$0;
                rk11 rk11Var = (rk11) sk11Var;
                nh01 nh01Var = (nh01) rk11Var.a;
                aVar6.getClass();
                ResultStatus resultStatus3 = nh01Var.a;
                ResultStatus resultStatus4 = nh01Var.a;
                switch (mk01.a[resultStatus3.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        aVar6.a0(new pxy0(26, nh01Var));
                        break;
                    case 5:
                        aVar6.e0(resultStatus4, null, null);
                        pz40 Y3 = aVar6.Y();
                        do {
                            r0Var = (r0) Y3;
                            value = r0Var.getValue();
                        } while (!r0Var.k(value, a.f0(kk01.a((kk01) value, null, resultStatus3, null, null, null, null, null, null, null, null, null, 8187), aVar6.B.getTimeoutResultPage())));
                    case 6:
                        aVar6.e0(resultStatus3, null, null);
                        pz40 Y4 = aVar6.Y();
                        do {
                            r0Var2 = (r0) Y4;
                            value2 = r0Var2.getValue();
                        } while (!r0Var2.k(value2, kk01.a((kk01) value2, null, ResultStatus.FAILED, null, null, unr0.h(Text.Companion, dzh0.ybsdk_transfer_default_error), new Text.Constant(((kk01) aVar6.X()).a.getMessage()), null, null, null, null, null, 8091)));
                    case 7:
                        aVar6.e0(resultStatus4, null, null);
                        aVar6.a0(new rmy0(27, resultStatus3, nh01Var));
                        break;
                    default:
                        w511.b();
                        return null;
                }
                switch (nk01.a[nh01Var.a.ordinal()]) {
                    case 1:
                        this.this$0.D.a();
                        a aVar7 = this.this$0;
                        aVar7.e0(nh01Var.a, null, a.b0(aVar7, nh01Var));
                        a aVar8 = this.this$0;
                        a.c0(aVar8, aVar8.G, hs01.a);
                        this.this$0.p0(zg01.b);
                        pz40 Y5 = this.this$0.Y();
                        do {
                            r0Var3 = (r0) Y5;
                            value3 = r0Var3.getValue();
                        } while (!r0Var3.k(value3, kk01.a((kk01) value3, null, null, null, null, null, null, null, null, null, null, null, 8175)));
                    case 2:
                    case 3:
                        this.this$0.D.a();
                        a aVar9 = this.this$0;
                        aVar9.e0(nh01Var.a, null, a.b0(aVar9, nh01Var));
                        a aVar10 = this.this$0;
                        a.c0(aVar10, aVar10.G, gs01Var);
                        this.this$0.p0(wg01Var);
                        pz40 Y6 = this.this$0.Y();
                        do {
                            r0Var4 = (r0) Y6;
                            value4 = r0Var4.getValue();
                        } while (!r0Var4.k(value4, kk01.a((kk01) value4, null, null, null, null, null, null, null, null, null, null, null, 8175)));
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        String str6 = nh01Var.d;
                        a aVar11 = this.this$0;
                        if (str6 == null) {
                            aVar11.e0(ResultStatus.FAILED, null, "confirmError");
                            aVar11.D.a();
                            a.c0(aVar11, aVar11.G, gs01Var);
                            aVar11.p0(yg01.b);
                            aVar11.a0(new az3(rk11Var, 1));
                            break;
                        } else {
                            pzt0 pzt0Var = aVar11.M;
                            if (pzt0Var != null) {
                                pzt0Var.a(null);
                            }
                            aVar11.M = tje.N(ds31.a(aVar11), null, null, new TransferMainResultViewModel$callGetResult$1(aVar11, str6, null), 3);
                            break;
                        }
                    default:
                        w511.b();
                        return null;
                }
            }
        }
        return zy11.a;
    }
}
