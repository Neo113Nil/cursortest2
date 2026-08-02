package com.yandex.go.vault.flexsdk.descriptors.widget.view;

import android.graphics.Bitmap;
import defpackage.c431;
import defpackage.g16;
import defpackage.hst;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.obv;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.vault.flexsdk.descriptors.widget.view.VaultsPagerPresenter$getKeyImage$1", f = "VaultsPagerPresenter.kt", l = {MSException.ERROR_INVALID_PARAMETER}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VaultsPagerPresenter$getKeyImage$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $keyImageTag;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VaultsPagerPresenter$getKeyImage$1(b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$keyImageTag = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VaultsPagerPresenter$getKeyImage$1(this.this$0, this.$keyImageTag, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VaultsPagerPresenter$getKeyImage$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        hst hstVar;
        c431 c431Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                b bVar = this.this$0;
                String str = this.$keyImageTag;
                hst hstVar2 = jst.e;
                try {
                    c431 c431Var2 = (c431) bVar.Dg();
                    try {
                        g16 i2 = bVar.z.b().i(new obv(str, null, 6, 0));
                        this.L$0 = hstVar2;
                        this.L$1 = c431Var2;
                        this.label = 1;
                        obj = i2.a(this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        hstVar = hstVar2;
                        c431Var = c431Var2;
                    } catch (Throwable th2) {
                        th = th2;
                        hstVar = hstVar2;
                        hstVar.j(th);
                        return zy11.a;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c431Var = (c431) this.L$1;
                hstVar = (hst) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th4) {
                    th = th4;
                    hstVar.j(th);
                    return zy11.a;
                }
            }
            c431Var.onKeyImageReady((Bitmap) obj);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
