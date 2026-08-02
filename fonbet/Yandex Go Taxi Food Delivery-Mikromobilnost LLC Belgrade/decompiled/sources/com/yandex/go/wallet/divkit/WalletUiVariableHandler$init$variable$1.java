package com.yandex.go.wallet.divkit;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import defpackage.avj0;
import defpackage.dai0;
import defpackage.ffx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vng;
import defpackage.wls;
import defpackage.z131;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lc231;", "<anonymous>", "(Ltse;)Lc231;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.wallet.divkit.WalletUiVariableHandler$init$variable$1", f = "WalletUiVariableHandler.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class WalletUiVariableHandler$init$variable$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $navigationIconRes;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletUiVariableHandler$init$variable$1(a aVar, int i, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$navigationIconRes = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalletUiVariableHandler$init$variable$1(this.this$0, this.$navigationIconRes, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WalletUiVariableHandler$init$variable$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Drawable t = vng.t(this.$navigationIconRes, ((avj0) ((zuj0) this.this$0.b.get())).a);
        Bitmap e0 = t != null ? ffx.e0(t) : null;
        String K = e0 != null ? dai0.K(e0) : null;
        if (K == null) {
            K = "";
        }
        return new z131("wallet.navigation_icon_preview", K);
    }
}
