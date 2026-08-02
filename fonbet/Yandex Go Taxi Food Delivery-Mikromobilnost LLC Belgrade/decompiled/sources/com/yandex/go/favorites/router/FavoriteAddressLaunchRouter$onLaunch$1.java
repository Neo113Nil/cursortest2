package com.yandex.go.favorites.router;

import defpackage.edp;
import defpackage.hxx;
import defpackage.idp;
import defpackage.jip;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qe0;
import defpackage.tse;
import defpackage.wls;
import defpackage.y01;
import defpackage.ydp;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.favorites.edit.arguments.NewFavorite;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.favorites.router.FavoriteAddressLaunchRouter$onLaunch$1", f = "FavoriteAddressLaunchRouter.kt", l = {30}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class FavoriteAddressLaunchRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ edp $payload;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteAddressLaunchRouter$onLaunch$1(a aVar, edp edpVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$payload = edpVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FavoriteAddressLaunchRouter$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FavoriteAddressLaunchRouter$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            edp edpVar = this.$payload;
            this.label = 1;
            obj = a.P(aVar, edpVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a aVar2 = this.this$0;
        edp edpVar2 = this.$payload;
        hxx hxxVar = hxx.a;
        if (booleanValue) {
            aVar2.getClass();
            aVar2.E((m950) aVar2.E.get(), new ydp(edpVar2.a.getAddress(), edpVar2.a instanceof NewFavorite, null, qe0.b, 12), new y01(aVar2, 2), hxxVar);
        } else {
            aVar2.getClass();
            aVar2.E((m950) aVar2.D.get(), new jip(edpVar2.a, edpVar2.b), new idp(aVar2), hxxVar);
        }
        return zy11.a;
    }
}
