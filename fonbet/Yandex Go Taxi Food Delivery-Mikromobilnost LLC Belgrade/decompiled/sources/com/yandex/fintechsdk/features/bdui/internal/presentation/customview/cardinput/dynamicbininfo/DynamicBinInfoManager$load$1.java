package com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.dynamicbininfo;

import defpackage.et5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ot5;
import defpackage.tse;
import defpackage.wls;
import defpackage.zc7;
import defpackage.zy11;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.dynamicbininfo.DynamicBinInfoManager$load$1", f = "DynamicBinInfoManager.kt", l = {72, HProv.ALG_SID_GR3410_12_256}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class DynamicBinInfoManager$load$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $cleanNumber;
    final /* synthetic */ String $prefix;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicBinInfoManager$load$1(String str, String str2, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$cleanNumber = str;
        this.$prefix = str2;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DynamicBinInfoManager$load$1(this.$cleanNumber, this.$prefix, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DynamicBinInfoManager$load$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        if (com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.dynamicbininfo.a.a(r4, r5, r11) == r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0086  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ot5 ot5Var;
        a aVar;
        a aVar2;
        a aVar3;
        ot5 ot5Var2;
        et5 et5Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                ot5Var = new ot5(this.$cleanNumber, this.$prefix, UUID.randomUUID().toString(), System.currentTimeMillis());
                aVar = this.this$0;
                try {
                    this.L$0 = ot5Var;
                    this.L$1 = aVar;
                    this.L$2 = aVar;
                    this.label = 1;
                    if (kotlinx.coroutines.a.i(300L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar2 = aVar;
                } catch (Throwable unused) {
                    aVar3 = aVar;
                    ot5Var2 = ot5Var;
                    aVar3.getClass();
                    zc7 c = aVar3.c(ot5Var2.a);
                    if (c != null) {
                    }
                    if (et5Var != null) {
                    }
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar3 = (a) this.L$1;
                    ot5Var2 = (ot5) this.L$0;
                    try {
                        b.b(obj);
                    } catch (Throwable unused2) {
                        aVar3.getClass();
                        zc7 c2 = aVar3.c(ot5Var2.a);
                        if (c2 != null) {
                        }
                        if (et5Var != null) {
                        }
                        return zy11.a;
                    }
                    return zy11.a;
                }
                a aVar4 = (a) this.L$2;
                aVar2 = (a) this.L$1;
                ot5Var = (ot5) this.L$0;
                try {
                    b.b(obj);
                    aVar = aVar4;
                } catch (Throwable unused3) {
                    aVar3 = aVar4;
                    ot5Var2 = ot5Var;
                    aVar3.getClass();
                    zc7 c22 = aVar3.c(ot5Var2.a);
                    et5Var = c22 != null ? c22.b : null;
                    if (et5Var != null) {
                        aVar3.f.invoke(et5Var, ot5Var2);
                    } else {
                        aVar3.g.invoke();
                    }
                    return zy11.a;
                }
            }
            this.L$0 = ot5Var;
            this.L$1 = aVar;
            this.L$2 = null;
            this.label = 2;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
