package com.ybsdk.feature.main.internal.screens.sbpPartners;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.main.internal.data.network.c;
import defpackage.krl0;
import defpackage.mvg;
import defpackage.nhm0;
import defpackage.ny61;
import defpackage.ohm0;
import defpackage.pz40;
import defpackage.s8j0;
import defpackage.sem0;
import defpackage.t8j0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.uza;
import defpackage.vam0;
import defpackage.vem0;
import defpackage.wls;
import defpackage.y5e;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.main.internal.screens.sbpPartners.SbpPartnersViewModel$loadPartners$1", f = "SbpPartnersViewModel.kt", l = {227}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SbpPartnersViewModel$loadPartners$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SbpPartnersViewModel$loadPartners$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SbpPartnersViewModel$loadPartners$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SbpPartnersViewModel$loadPartners$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        t8j0 t8j0Var;
        a aVar;
        Object obj2;
        r0 r0Var2;
        Object value2;
        s8j0 s8j0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            com.ybsdk.core.analytics.a aVar2 = ((AppAnalyticsReporter) this.this$0.H.a).G.a;
            byte[] bArr = y5e.L;
            byte[] bArr2 = new byte[46];
            for (int i2 = 0; i2 < 46; i2++) {
                bArr2[i2] = (byte) (bArr[i2] ^ y5e.c[i2 % 8]);
            }
            aVar2.a(new String(bArr2, uza.a), null);
            pz40 Y = this.this$0.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
                t8j0Var = new t8j0();
                ((vem0) value).getClass();
            } while (!r0Var.k(value, new vem0(t8j0Var)));
            a aVar3 = this.this$0;
            c cVar = aVar3.B;
            this.L$0 = aVar3;
            this.label = 1;
            Object d = cVar.d(this);
            if (d == coroutineSingletons) {
                return coroutineSingletons;
            }
            aVar = aVar3;
            obj2 = d;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = (a) this.L$0;
            b.b(obj);
            obj2 = ((Result) obj).getValue();
        }
        krl0 krl0Var = aVar.H;
        boolean z = obj2 instanceof Result.Failure;
        if (!z) {
            krl0Var.g(null);
        }
        Throwable a = Result.a(obj2);
        if (a != null) {
            krl0Var.g(a);
        }
        a aVar4 = this.this$0;
        if (!z) {
            sem0 sem0Var = (sem0) obj2;
            ArrayList arrayList = sem0Var.a;
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new ohm0((nhm0) it.next()));
            }
            aVar4.a0(new vam0(7, arrayList2, sem0Var.b));
        }
        a aVar5 = this.this$0;
        Throwable a2 = Result.a(obj2);
        if (a2 != null) {
            pz40 Y2 = aVar5.Y();
            do {
                r0Var2 = (r0) Y2;
                value2 = r0Var2.getValue();
                s8j0Var = new s8j0(a2);
                ((vem0) value2).getClass();
            } while (!r0Var2.k(value2, new vem0(s8j0Var)));
        }
        return zy11.a;
    }
}
