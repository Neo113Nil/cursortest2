package com.ybsdk.screens.notice.presentation;

import android.content.Context;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.screens.notice.domain.entities.TopupValueEntity;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.tse;
import defpackage.vxz0;
import defpackage.wls;
import defpackage.x4c;
import defpackage.z94;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.notice.presentation.TopupNoticeDeprecatedViewModel$invalidate$2", f = "TopupNoticeDeprecatedViewModel.kt", l = {HProv.ALG_SID_GR3410_12_256}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TopupNoticeDeprecatedViewModel$invalidate$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopupNoticeDeprecatedViewModel$invalidate$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TopupNoticeDeprecatedViewModel$invalidate$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TopupNoticeDeprecatedViewModel$invalidate$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            com.ybsdk.screens.notice.data.a aVar2 = aVar.C;
            TopupValueEntity topupValueEntity = aVar.F;
            this.label = 1;
            b = aVar2.b(topupValueEntity, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            b = ((Result) obj).getValue();
        }
        a aVar3 = this.this$0;
        if (!(b instanceof Result.Failure)) {
            vxz0 vxz0Var = (vxz0) b;
            pz40 Y = aVar3.Y();
            do {
                r0Var2 = (r0) Y;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, new r8j0(vxz0Var, null, 14)));
            Context context = (Context) ((TopupNoticeDeprecatedFragment$createViewModel$1) aVar3.G).invoke();
            z94.x(aVar3.D.o0, d.a(context, vxz0Var.a).toString(), d.a(context, vxz0Var.b).toString(), vxz0Var.e, null, 8);
        }
        a aVar4 = this.this$0;
        Throwable a = Result.a(b);
        if (a != null) {
            pz40 Y2 = aVar4.Y();
            do {
                r0Var = (r0) Y2;
                value = r0Var.getValue();
            } while (!r0Var.k(value, new s8j0(a)));
            x4c.g("getTopupNotice failed", a, null, null, 12);
            z94.x(aVar4.D.o0, null, null, null, a.toString(), 7);
        }
        return zy11.a;
    }
}
