package com.ybsdk.feature.webview.internal.utils;

import android.webkit.GeolocationPermissions;
import com.ybsdk.core.permissions.RequestPermissionResult;
import defpackage.i5z0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qi51;
import defpackage.tse;
import defpackage.wls;
import defpackage.zgf;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.webview.internal.utils.GeolocationPermissionManager$onPermissionRequested$1", f = "GeolocationPermissionManager.kt", l = {28}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class GeolocationPermissionManager$onPermissionRequested$1 extends SuspendLambda implements wls {
    final /* synthetic */ qi51 $callback;
    final /* synthetic */ String $origin;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeolocationPermissionManager$onPermissionRequested$1(a aVar, qi51 qi51Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$callback = qi51Var;
        this.$origin = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GeolocationPermissionManager$onPermissionRequested$1(this.this$0, this.$callback, this.$origin, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GeolocationPermissionManager$onPermissionRequested$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.ybsdk.core.permissions.a aVar = this.this$0.b;
            this.label = 1;
            obj = aVar.c(true, this);
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
        boolean isGranted = ((RequestPermissionResult) obj).getIsGranted();
        qi51 qi51Var = this.$callback;
        ((GeolocationPermissions.Callback) ((zgf) qi51Var).b).invoke(this.$origin, isGranted, false);
        i5z0.a.a("Geo permission granted", new Object[0]);
        return zy11.a;
    }
}
