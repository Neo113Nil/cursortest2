package com.yandex.go.taxi.order.details.v2.state.elements.driver.avatar;

import com.yandex.go.image.domain.requests.f;
import defpackage.ggk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sfv;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Ltse;)Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.driver.avatar.RideCardDriverAvatarRepository$takeAvatarFromCache$2", f = "RideCardDriverAvatarRepository.kt", l = {30}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardDriverAvatarRepository$takeAvatarFromCache$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ ggk0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardDriverAvatarRepository$takeAvatarFromCache$2(ggk0 ggk0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ggk0Var;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardDriverAvatarRepository$takeAvatarFromCache$2(this.this$0, this.$url, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardDriverAvatarRepository$takeAvatarFromCache$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        f g = this.this$0.b.g();
        g.e(((Number) this.this$0.d.getValue()).intValue(), ((Number) this.this$0.d.getValue()).intValue());
        g.f(new sfv(0.0f, 0));
        g.d(this.$url);
        this.label = 1;
        Object b = g.b(this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
