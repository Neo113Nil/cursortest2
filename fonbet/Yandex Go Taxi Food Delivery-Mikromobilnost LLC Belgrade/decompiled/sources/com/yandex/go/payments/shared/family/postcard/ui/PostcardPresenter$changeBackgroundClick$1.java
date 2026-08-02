package com.yandex.go.payments.shared.family.postcard.ui;

import android.graphics.Bitmap;
import com.yandex.go.payments.shared.family.web.nativeapi.request.BackgroundState;
import defpackage.g16;
import defpackage.kfe0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.BuildConfig;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.family.postcard.ui.PostcardPresenter$changeBackgroundClick$1", f = "PostcardPresenter.kt", l = {BuildConfig.API_LEVEL}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PostcardPresenter$changeBackgroundClick$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostcardPresenter$changeBackgroundClick$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PostcardPresenter$changeBackgroundClick$1(this.this$0, this.$url, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PostcardPresenter$changeBackgroundClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            g16 b = this.this$0.x.b().b(this.$url);
            this.label = 1;
            obj = ru.yandex.taxi.utils.a.b(b, this);
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
        ((kfe0) this.this$0.Dg()).P7(false);
        kfe0 kfe0Var = (kfe0) this.this$0.Dg();
        a aVar = this.this$0;
        kfe0Var.be(bitmap, ((BackgroundState) aVar.G.get(aVar.F)).b);
        a aVar2 = this.this$0;
        aVar2.H[aVar2.F] = bitmap;
        return zy11.a;
    }
}
