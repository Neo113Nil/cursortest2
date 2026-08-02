package com.ybsdk.screens.menu.presentation;

import android.net.Uri;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.deeplink.api.DeeplinkNavigation;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import defpackage.dn10;
import defpackage.dzh0;
import defpackage.l3h;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tse;
import defpackage.unr0;
import defpackage.wls;
import defpackage.zn10;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.menu.presentation.MenuViewModel$onLoginClick$2", f = "MenuViewModel.kt", l = {99}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MenuViewModel$onLoginClick$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuViewModel$onLoginClick$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MenuViewModel$onLoginClick$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MenuViewModel$onLoginClick$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b0;
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            this.label = 1;
            b0 = b.b0(bVar, this);
            if (b0 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            b0 = ((Result) obj).getValue();
        }
        b bVar2 = this.this$0;
        if (!(b0 instanceof Result.Failure)) {
            ((l3h) bVar2.E).d(com.ybsdk.feature.deeplink.api.a.a(new DeeplinkAction.Redirect((Uri) b0, null, DeeplinkAction.Redirect.Auth.NONE, null, 8, null), DeeplinkNavigation.Add.INSTANCE));
        }
        b bVar3 = this.this$0;
        if (Result.a(b0) != null) {
            bVar3.Z(new zn10(unr0.h(Text.Companion, dzh0.ybsdk_common_default_error)));
        }
        pz40 Y = this.this$0.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, dn10.a((dn10) value, null, false, 15)));
        return zy11.a;
    }
}
