package com.ybsdk.feature.transfer.version2.internal.screens.fpspay.presentation;

import com.ybsdk.core.navigation.cicerone.Screen;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.transfer.version2.api.TransferTwoFactorScreenProvider$Request;
import defpackage.abs;
import defpackage.fl1;
import defpackage.hu01;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pk11;
import defpackage.pz40;
import defpackage.qk11;
import defpackage.r8j0;
import defpackage.rk11;
import defpackage.s8j0;
import defpackage.sk11;
import defpackage.t8j0;
import defpackage.tfl0;
import defpackage.tse;
import defpackage.tu01;
import defpackage.u8j0;
import defpackage.w511;
import defpackage.was;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.fpspay.presentation.FpsPayEnrollViewModel$onEnrollButtonClick$2", f = "FpsPayEnrollViewModel.kt", l = {HProv.ALG_SID_NO_HASH, HProv.PP_RESERVED1}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FpsPayEnrollViewModel$onEnrollButtonClick$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $verificationToken;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FpsPayEnrollViewModel$onEnrollButtonClick$2(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$verificationToken = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FpsPayEnrollViewModel$onEnrollButtonClick$2(this.this$0, this.$verificationToken, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FpsPayEnrollViewModel$onEnrollButtonClick$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x013e, code lost:
    
        if (r1 == r7) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0140, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c3, code lost:
    
        if (r0 == r7) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01a5  */
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
        pk11 pk11Var;
        Object t8j0Var2;
        tfl0 tfl0Var;
        Object b;
        pz40 Y;
        r0 r0Var3;
        Object value3;
        u8j0 u8j0Var;
        Object t8j0Var3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            pz40 Y2 = this.this$0.Y();
            do {
                r0Var = (r0) Y2;
                value = r0Var.getValue();
                u8j0 u8j0Var2 = (u8j0) value;
                if (u8j0Var2 instanceof r8j0) {
                    r8j0 r8j0Var = (r8j0) u8j0Var2;
                    t8j0Var = new r8j0(was.a((was) r8j0Var.a, null, null, null, true, 95), r8j0Var.b, r8j0Var.c, r8j0Var.d);
                } else if (u8j0Var2 instanceof s8j0) {
                    t8j0Var = new s8j0(((s8j0) u8j0Var2).a);
                } else {
                    if (!(u8j0Var2 instanceof t8j0)) {
                        w511.b();
                        return null;
                    }
                    t8j0Var = new t8j0();
                }
            } while (!r0Var.k(value, t8j0Var));
            a aVar = this.this$0;
            com.ybsdk.feature.transfer.version2.internal.screens.fpspay.data.a aVar2 = aVar.C;
            String str = this.$verificationToken;
            was wasVar = (was) ((u8j0) aVar.X()).a();
            if (wasVar != null) {
                String str2 = wasVar.e;
                a aVar3 = this.this$0;
                String tokenIntentId = aVar3.B.getTokenIntentId();
                was wasVar2 = (was) ((u8j0) this.this$0.X()).a();
                if (wasVar2 != null) {
                    fl1 fl1Var = wasVar2.b;
                    String str3 = fl1Var != null ? fl1Var.a : null;
                    this.label = 1;
                    a = aVar2.a(str, str2, aVar3, tokenIntentId, str3, this);
                }
            }
            return zy11.a;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tfl0Var = (tfl0) this.L$0;
            b.b(obj);
            b = obj;
            tfl0Var.h((Screen) b);
            Y = this.this$0.Y();
            do {
                r0Var3 = (r0) Y;
                value3 = r0Var3.getValue();
                u8j0Var = (u8j0) value3;
                if (!(u8j0Var instanceof r8j0)) {
                    r8j0 r8j0Var2 = (r8j0) u8j0Var;
                    t8j0Var3 = new r8j0(was.a((was) r8j0Var2.a, null, null, null, false, 95), r8j0Var2.b, r8j0Var2.c, r8j0Var2.d);
                } else if (u8j0Var instanceof s8j0) {
                    t8j0Var3 = new s8j0(((s8j0) u8j0Var).a);
                } else {
                    if (!(u8j0Var instanceof t8j0)) {
                        w511.b();
                        return null;
                    }
                    t8j0Var3 = new t8j0();
                }
            } while (!r0Var3.k(value3, t8j0Var3));
            return zy11.a;
        }
        b.b(obj);
        a = ((Result) obj).getValue();
        a aVar4 = this.this$0;
        if (Result.a(a) == null) {
            sk11 sk11Var = (sk11) a;
            if (sk11Var instanceof pk11) {
                pz40 Y3 = aVar4.Y();
                do {
                    r0Var2 = (r0) Y3;
                    value2 = r0Var2.getValue();
                    u8j0 u8j0Var3 = (u8j0) value2;
                    pk11Var = (pk11) sk11Var;
                    if (u8j0Var3 instanceof r8j0) {
                        r8j0 r8j0Var3 = (r8j0) u8j0Var3;
                        t8j0Var2 = new r8j0(was.a((was) r8j0Var3.a, null, null, pk11Var.b, false, 111), r8j0Var3.b, r8j0Var3.c, r8j0Var3.d);
                    } else if (u8j0Var3 instanceof s8j0) {
                        t8j0Var2 = new s8j0(((s8j0) u8j0Var3).a);
                    } else {
                        if (!(u8j0Var3 instanceof t8j0)) {
                            w511.b();
                            return null;
                        }
                        t8j0Var2 = new t8j0();
                    }
                } while (!r0Var2.k(value2, t8j0Var2));
                tfl0Var = aVar4.G;
                hu01 hu01Var = aVar4.F;
                Text.Empty empty = Text.Empty.INSTANCE;
                String str4 = pk11Var.a;
                TransferTwoFactorScreenProvider$Request transferTwoFactorScreenProvider$Request = TransferTwoFactorScreenProvider$Request.CONFIRM_FPS_PAY;
                this.L$0 = tfl0Var;
                this.label = 2;
                b = ((tu01) hu01Var).b(null, empty, str4, transferTwoFactorScreenProvider$Request, null);
            } else if (sk11Var instanceof qk11) {
                qk11 qk11Var = (qk11) sk11Var;
                aVar4.Z(new abs(qk11Var.a, qk11Var.b));
            } else {
                if (!(sk11Var instanceof rk11)) {
                    w511.b();
                    return null;
                }
                aVar4.n0(FpsPayEnrollViewModel$ReturnToSbpStatus.SUCCESS);
            }
        } else {
            aVar4.Z(new abs(null, null));
        }
        Y = this.this$0.Y();
        do {
            r0Var3 = (r0) Y;
            value3 = r0Var3.getValue();
            u8j0Var = (u8j0) value3;
            if (!(u8j0Var instanceof r8j0)) {
            }
        } while (!r0Var3.k(value3, t8j0Var3));
        return zy11.a;
    }
}
