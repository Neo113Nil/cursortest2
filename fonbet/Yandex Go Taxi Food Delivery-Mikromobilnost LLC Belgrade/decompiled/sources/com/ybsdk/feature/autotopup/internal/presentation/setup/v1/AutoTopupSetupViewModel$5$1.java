package com.ybsdk.feature.autotopup.internal.presentation.setup.v1;

import com.ybsdk.screens.common.c;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import defpackage.g191;
import defpackage.j04;
import defpackage.l76;
import defpackage.mvg;
import defpackage.nv3;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.autotopup.internal.presentation.setup.v1.AutoTopupSetupViewModel$5$1", f = "AutoTopupSetupViewModel.kt", l = {HProv.PP_CONTAINER_EXTENSION}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupSetupViewModel$5$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupSetupViewModel$5$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AutoTopupSetupViewModel$5$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoTopupSetupViewModel$5$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object valueOf;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g191 g191Var = this.this$0.G;
            this.label = 1;
            valueOf = Boolean.valueOf(((c) g191Var.a).a() != null);
            if (valueOf == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            valueOf = obj;
        }
        boolean booleanValue = ((Boolean) valueOf).booleanValue();
        b bVar = this.this$0;
        if (booleanValue) {
            pz40 Y = bVar.Y();
            do {
                r0Var2 = (r0) Y;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, j04.a((j04) value2, null, false, null, null, null, null, null, null, l76.x, null, null, null, null, null, null, null, 261631)));
        } else {
            pz40 Y2 = bVar.Y();
            do {
                r0Var = (r0) Y2;
                value = r0Var.getValue();
            } while (!r0Var.k(value, j04.a((j04) value, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 261631)));
            ((nv3) this.this$0.H).a.c(DeeplinkAction.SimplifiedIdInfo.INSTANCE.getDeeplinkUri().toString());
        }
        return zy11.a;
    }
}
