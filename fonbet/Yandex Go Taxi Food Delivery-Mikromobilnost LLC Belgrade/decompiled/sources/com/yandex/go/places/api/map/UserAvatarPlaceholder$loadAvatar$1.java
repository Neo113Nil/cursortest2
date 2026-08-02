package com.yandex.go.places.api.map;

import android.graphics.Bitmap;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.runtime.image.ImageProvider;
import defpackage.bk21;
import defpackage.f4c0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ro21;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.api.map.UserAvatarPlaceholder$loadAvatar$1", f = "UserAvatarPlaceholder.kt", l = {145}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class UserAvatarPlaceholder$loadAvatar$1 extends SuspendLambda implements wls {
    final /* synthetic */ ro21 $assets;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAvatarPlaceholder$loadAvatar$1(b bVar, ro21 ro21Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$assets = ro21Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserAvatarPlaceholder$loadAvatar$1(this.this$0, this.$assets, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserAvatarPlaceholder$loadAvatar$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.places.impl.ui.common.map.location.a aVar = this.this$0.c;
            this.label = 1;
            obj = aVar.b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        Bitmap bitmap = (Bitmap) obj;
        b bVar = this.this$0;
        bVar.C = new bk21(this.$assets, bitmap);
        f4c0 f4c0Var = bVar.z;
        IconStyle iconStyle = bVar.B;
        IconStyle iconStyle2 = bVar.A;
        iconStyle2.setAnchor(b.F);
        f4c0 f4c0Var2 = bVar.y;
        f4c0Var2.D(iconStyle2);
        f4c0Var2.y(bVar.x);
        f4c0Var2.k(10.01f);
        iconStyle.setAnchor(b.G);
        f4c0Var.D(iconStyle);
        f4c0Var.k(10.02f);
        f4c0Var.y(ImageProvider.fromBitmap(bitmap));
        return zy11.a;
    }
}
