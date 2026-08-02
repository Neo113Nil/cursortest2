package com.ybsdk.feature.autotopup.internal.presentation.instruction;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsSaveLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsSaveLoadedVersion;
import com.ybsdk.core.navigation.cicerone.Screen;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.autotopup.api.AutoTopupType;
import com.ybsdk.feature.autotopup.internal.presentation.result.AutoTopupResultParams;
import defpackage.aw3;
import defpackage.bw3;
import defpackage.g8e;
import defpackage.gao;
import defpackage.h52;
import defpackage.iz3;
import defpackage.j4w;
import defpackage.l04;
import defpackage.mvg;
import defpackage.n0t0;
import defpackage.ny61;
import defpackage.pk11;
import defpackage.pz40;
import defpackage.qk11;
import defpackage.rk11;
import defpackage.rsa1;
import defpackage.sk11;
import defpackage.tfl0;
import defpackage.tse;
import defpackage.ty3;
import defpackage.uk11;
import defpackage.vv3;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import defpackage.z94;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.autotopup.internal.presentation.instruction.AutoTopupInstructionViewModel$saveTopup$2", f = "AutoTopupInstructionViewModel.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE, 80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupInstructionViewModel$saveTopup$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $verificationToken;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupInstructionViewModel$saveTopup$2(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$verificationToken = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AutoTopupInstructionViewModel$saveTopup$2(this.this$0, this.$verificationToken, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoTopupInstructionViewModel$saveTopup$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x017f, code lost:
    
        if (r0 == r9) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0181, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0075, code lost:
    
        if (r0 == r9) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x01e1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object l;
        Object obj2;
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
        r0 r0Var4;
        Object value4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            com.ybsdk.feature.autotopup.internal.data.b bVar = aVar.F;
            String str = ((aw3) aVar.X()).e;
            j4w j4wVar = ((aw3) this.this$0.X()).f;
            String str2 = ((aw3) this.this$0.X()).h;
            Boolean bool = ((aw3) this.this$0.X()).j;
            boolean a2 = this.this$0.I.a();
            String str3 = this.$verificationToken;
            a aVar2 = this.this$0;
            this.label = 1;
            l = bVar.l(str3, str2, str, j4wVar, bool, aVar2, a2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tfl0 tfl0Var2 = (tfl0) this.L$1;
                obj2 = this.L$0;
                b.b(obj);
                tfl0Var = tfl0Var2;
                b = obj;
                tfl0Var.h((Screen) b);
                a aVar3 = this.this$0;
                a = Result.a(obj2);
                if (a != null) {
                    pz40 Y = aVar3.Y();
                    do {
                        r0Var4 = (r0) Y;
                        value4 = r0Var4.getValue();
                    } while (!r0Var4.k(value4, aw3.a((aw3) value4, null, false, 639)));
                    aVar3.H.h(a.getMessage(), ((aw3) aVar3.X()).f.e, ((aw3) aVar3.X()).j);
                    aVar3.Z(new bw3(gao.e(null, null, a, 3)));
                    x4c.g("[auto-topup] Error while saving auto topup", null, a, null, 10);
                }
                return zy11.a;
            }
            b.b(obj);
            l = ((Result) obj).getValue();
        }
        obj2 = l;
        a aVar4 = this.this$0;
        if (!(obj2 instanceof Result.Failure)) {
            sk11 sk11Var = (sk11) obj2;
            if (sk11Var instanceof rk11) {
                pz40 Y2 = aVar4.Y();
                do {
                    r0Var3 = (r0) Y2;
                    value3 = r0Var3.getValue();
                } while (!r0Var3.k(value3, aw3.a((aw3) value3, null, false, 895)));
                l04 l04Var = aVar4.H;
                j4w j4wVar2 = ((aw3) aVar4.X()).f;
                AutoTopupType autoTopupType = ((aw3) aVar4.X()).f.e;
                Boolean bool2 = ((aw3) aVar4.X()).j;
                z94.f(l04Var.a.e, AutotopupEvents$AutoTopupSettingsSaveLoadedResult.OK, null, j4wVar2.b, j4wVar2.c, h52.a(j4wVar2.d), rsa1.c(autoTopupType), bool2 != null ? rsa1.e(bool2.booleanValue()) : null, null, null, null, null, null, AutotopupEvents$AutoTopupSettingsSaveLoadedVersion.V1, 3970);
                ty3 ty3Var = (ty3) ((rk11) sk11Var).a;
                iz3 iz3Var = aVar4.E;
                String str4 = ty3Var.a;
                AutoTopupInstructionParams autoTopupInstructionParams = aVar4.B;
                AutoTopupResultParams.Polling polling = new AutoTopupResultParams.Polling(str4, ty3Var.b, ty3Var.c, autoTopupInstructionParams.getInfoEntity().getPaymentMethod().getSelectedLogo(), autoTopupInstructionParams.getConfirmInstruction().getTitle(), autoTopupInstructionParams.getConfirmInstruction().getDescription(), aVar4.I.a(), null);
                iz3Var.getClass();
                FragmentScreen a3 = iz3.a(polling);
                aVar4.G.a.e.a.a("auto_topup.binding_payment.pending", null);
                aVar4.C.l(a3);
            } else if (sk11Var instanceof pk11) {
                pz40 Y3 = aVar4.Y();
                do {
                    r0Var2 = (r0) Y3;
                    value2 = r0Var2.getValue();
                    pk11Var = (pk11) sk11Var;
                } while (!r0Var2.k(value2, aw3.a((aw3) value2, pk11Var.b, false, 895)));
                tfl0Var = aVar4.C;
                uk11 uk11Var = aVar4.D;
                String str5 = pk11Var.a;
                this.L$0 = obj2;
                this.L$1 = tfl0Var;
                this.label = 2;
                b = ((vv3) uk11Var).b(str5);
            } else {
                if (!(sk11Var instanceof qk11)) {
                    w511.b();
                    return null;
                }
                pz40 Y4 = aVar4.Y();
                do {
                    r0Var = (r0) Y4;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, aw3.a((aw3) value, null, false, 639)));
                l04 l04Var2 = aVar4.H;
                String str6 = ((qk11) sk11Var).a;
                l04Var2.h(str6, ((aw3) aVar4.X()).f.e, ((aw3) aVar4.X()).j);
                aVar4.Z(new bw3(new n0t0(g8e.i(Text.Companion, str6), Text.Empty.INSTANCE)));
            }
        }
        a aVar32 = this.this$0;
        a = Result.a(obj2);
        if (a != null) {
        }
        return zy11.a;
    }
}
