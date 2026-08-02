package com.yandex.go.places.common.flex.actions.deeplink;

import android.net.Uri;
import com.yandex.go.flex.common.api.actions.DeeplinkNavigationAction;
import defpackage.bgb0;
import defpackage.cvu0;
import defpackage.f3h;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.common.flex.actions.deeplink.DeeplinkPlacesNavigationActionHandler$handle$1", f = "DeeplinkPlacesNavigationActionHandler.kt", l = {34}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class DeeplinkPlacesNavigationActionHandler$handle$1 extends SuspendLambda implements wls {
    final /* synthetic */ DeeplinkNavigationAction $action;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeeplinkPlacesNavigationActionHandler$handle$1(DeeplinkNavigationAction deeplinkNavigationAction, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$action = deeplinkNavigationAction;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeeplinkPlacesNavigationActionHandler$handle$1(this.$action, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeeplinkPlacesNavigationActionHandler$handle$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Uri uri;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            Uri parse = Uri.parse(this.$action.a);
            a aVar = this.this$0;
            String str = this.$action.a;
            aVar.getClass();
            boolean x = cvu0.x(str.toLowerCase(Locale.US), "tel:", false);
            a aVar2 = this.this$0;
            if (x) {
                bgb0.i(aVar2.a, parse);
                return zy11Var;
            }
            f3h f3hVar = aVar2.x;
            this.L$0 = parse;
            this.label = 1;
            Boolean b = f3hVar.b(parse);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
            uri = parse;
            obj = b;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uri = (Uri) this.L$0;
            b.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return zy11Var;
        }
        a aVar3 = this.this$0;
        aVar3.c.a(uri, aVar3.w);
        return zy11Var;
    }
}
