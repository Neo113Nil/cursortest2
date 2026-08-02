package com.yandex.mobile.drive.scan.ui;

import android.view.View;
import defpackage.d6z;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pdy;
import defpackage.tob1;
import defpackage.tse;
import defpackage.wlm0;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mobile.drive.scan.ui.ScanPresenter$capturePhoto$1", f = "ScanPresenter.kt", l = {IDialogId.DIALOG_PIN_WND_IDD_PASSWORD}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ScanPresenter$capturePhoto$1 extends SuspendLambda implements wls {
    final /* synthetic */ pdy $controller;
    final /* synthetic */ c $view;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanPresenter$capturePhoto$1(b bVar, c cVar, pdy pdyVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$view = cVar;
        this.$controller = pdyVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScanPresenter$capturePhoto$1(this.this$0, this.$view, this.$controller, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScanPresenter$capturePhoto$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Integer num = this.this$0.s;
            if ((num == null || num.intValue() != 1) && this.this$0.i.a().isSelfie()) {
                View view = this.$view.j;
                view.setAlpha(1.0f);
                view.setVisibility(0);
                pdy pdyVar = this.$controller;
                pdyVar.getClass();
                tob1.b();
                if ((pdyVar.b & 1) != 0) {
                    this.label = 1;
                    if (kotlinx.coroutines.a.i(500L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        c cVar = this.$view;
        cVar.i.setVisibility(8);
        cVar.b.setVisibility(0);
        pdy pdyVar2 = this.$controller;
        b bVar = this.this$0;
        Executor executor = bVar.A;
        wlm0 wlm0Var = bVar.B;
        pdyVar2.getClass();
        tob1.b();
        d6z.y("Camera not initialized.", pdyVar2.l());
        tob1.b();
        d6z.y("ImageCapture disabled.", (pdyVar2.b & 1) != 0);
        tob1.b();
        if (pdyVar2.e.J() == 3 && (pdyVar2.h() == null || pdyVar2.h().b == null)) {
            ny61.r("No window set in PreviewView despite setting FLASH_MODE_SCREEN");
            return null;
        }
        pdyVar2.e.P(executor, wlm0Var);
        return zy11.a;
    }
}
