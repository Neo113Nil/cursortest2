package com.ybsdk.feature.kycesia.internal.screens.browser;

import android.net.Uri;
import defpackage.i5z0;
import defpackage.mvg;
import defpackage.n570;
import defpackage.ny61;
import defpackage.p570;
import defpackage.pz40;
import defpackage.rt1;
import defpackage.sbo;
import defpackage.tse;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.kycesia.internal.screens.browser.OpenEsiaViewModel$retry$1", f = "OpenEsiaViewModel.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class OpenEsiaViewModel$retry$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenEsiaViewModel$retry$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OpenEsiaViewModel$retry$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OpenEsiaViewModel$retry$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            com.ybsdk.di.modules.features.kyc.a aVar = this.this$0.D;
            this.label = 1;
            a = aVar.a(this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            a = ((Result) obj).getValue();
        }
        a aVar2 = this.this$0;
        if (!(a instanceof Result.Failure)) {
            sbo sboVar = (sbo) a;
            aVar2.Z(new p570(Uri.parse(sboVar.a)));
            rt1 rt1Var = aVar2.F.s0;
            String str = sboVar.b;
            LinkedHashMap linkedHashMap = new LinkedHashMap(1);
            if (str != null) {
                linkedHashMap.put("url", str);
            }
            rt1Var.a.a("esia.open_browser", linkedHashMap);
        }
        a aVar3 = this.this$0;
        Throwable a2 = Result.a(a);
        if (a2 != null) {
            x4c.g("Failed to create authorization url for esia", a2, null, null, 12);
            i5z0.a.f(a2, "Failed to create authorization url for esia", new Object[0]);
            pz40 Y = aVar3.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, n570.a((n570) value, a2, 2)));
        }
        return zy11.a;
    }
}
