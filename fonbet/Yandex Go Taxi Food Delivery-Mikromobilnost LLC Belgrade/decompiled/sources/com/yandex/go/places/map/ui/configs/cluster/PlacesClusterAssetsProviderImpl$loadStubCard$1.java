package com.yandex.go.places.map.ui.configs.cluster;

import android.graphics.Bitmap;
import defpackage.g16;
import defpackage.i2c0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zfc0;
import defpackage.zwy0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.map.ui.configs.cluster.PlacesClusterAssetsProviderImpl$loadStubCard$1", f = "PlacesClusterAssetsProviderImpl.kt", l = {64}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesClusterAssetsProviderImpl$loadStubCard$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $url;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesClusterAssetsProviderImpl$loadStubCard$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlacesClusterAssetsProviderImpl$loadStubCard$1(this.this$0, this.$url, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlacesClusterAssetsProviderImpl$loadStubCard$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            i2c0 i2 = this.this$0.a.f.i(1.0f);
            g16 g = this.this$0.d.b().b(this.$url).g(i2.a, i2.b);
            this.L$0 = null;
            this.label = 1;
            obj = ru.yandex.taxi.utils.a.b(g, this);
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
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            a aVar = this.this$0;
            zfc0 zfc0Var = aVar.a;
            aVar.f = zfc0Var.f.b(new zwy0(bitmap, null), 1.0f);
        }
        return zy11.a;
    }
}
