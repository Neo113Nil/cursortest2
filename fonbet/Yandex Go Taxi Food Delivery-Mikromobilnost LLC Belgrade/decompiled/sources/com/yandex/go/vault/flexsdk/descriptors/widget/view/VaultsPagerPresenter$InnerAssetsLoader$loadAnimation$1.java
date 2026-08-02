package com.yandex.go.vault.flexsdk.descriptors.widget.view;

import defpackage.hst;
import defpackage.jst;
import defpackage.mvg;
import defpackage.nsz;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.ytz;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.vault.flexsdk.descriptors.widget.view.VaultsPagerPresenter$InnerAssetsLoader$loadAnimation$1", f = "VaultsPagerPresenter.kt", l = {162}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VaultsPagerPresenter$InnerAssetsLoader$loadAnimation$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $onSuccess;
    final /* synthetic */ String $url;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VaultsPagerPresenter$InnerAssetsLoader$loadAnimation$1(b bVar, String str, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$url = str;
        this.$onSuccess = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VaultsPagerPresenter$InnerAssetsLoader$loadAnimation$1(this.this$0, this.$url, this.$onSuccess, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VaultsPagerPresenter$InnerAssetsLoader$loadAnimation$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        hst hstVar;
        tls tlsVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                b bVar = this.this$0;
                String str = this.$url;
                tls tlsVar2 = this.$onSuccess;
                hst hstVar2 = jst.e;
                try {
                    ytz ytzVar = bVar.D;
                    this.L$0 = tlsVar2;
                    this.L$1 = hstVar2;
                    this.label = 1;
                    obj = ((com.yandex.go.lottie_loader.a) ytzVar).a(str, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    tlsVar = tlsVar2;
                    hstVar = hstVar2;
                } catch (Throwable th) {
                    th = th;
                    hstVar = hstVar2;
                    hstVar.j(th);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hstVar = (hst) this.L$1;
                tlsVar = (tls) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    hstVar.j(th);
                    return zy11.a;
                }
            }
            nsz nszVar = (nsz) obj;
            if (nszVar != null) {
                tlsVar.invoke(nszVar);
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
