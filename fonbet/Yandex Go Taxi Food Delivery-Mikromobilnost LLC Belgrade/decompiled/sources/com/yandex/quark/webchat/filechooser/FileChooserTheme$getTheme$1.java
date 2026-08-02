package com.yandex.quark.webchat.filechooser;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import defpackage.bdp;
import defpackage.dzq;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.x6f0;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "Lcom/yandex/quark/contracts/theme/ColorScheme;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.quark.webchat.filechooser.FileChooserTheme$getTheme$1", f = "FileChooserTheme.kt", l = {26}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class FileChooserTheme$getTheme$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ dzq this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileChooserTheme$getTheme$1(dzq dzqVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dzqVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FileChooserTheme$getTheme$1 fileChooserTheme$getTheme$1 = new FileChooserTheme$getTheme$1(this.this$0, continuation);
        fileChooserTheme$getTheme$1.L$0 = obj;
        return fileChooserTheme$getTheme$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FileChooserTheme$getTheme$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            final x6f0 x6f0Var = (x6f0) ((y6f0) this.L$0);
            x6f0Var.d(this.this$0.b());
            final dzq dzqVar = this.this$0;
            ComponentCallbacks componentCallbacks = new ComponentCallbacks() { // from class: com.yandex.quark.webchat.filechooser.FileChooserTheme$getTheme$1$callback$1
                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration newConfig) {
                    ((x6f0) y6f0.this).d(dzqVar.b());
                }

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                }
            };
            this.this$0.a.registerComponentCallbacks(componentCallbacks);
            bdp bdpVar = new bdp(6, this.this$0, componentCallbacks);
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(x6f0Var, bdpVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
