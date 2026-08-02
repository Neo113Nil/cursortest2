package com.yandex.messaging.activity;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.WindowMetrics;
import defpackage.fbb;
import defpackage.fcg;
import defpackage.kjs0;
import defpackage.lt11;
import defpackage.mt11;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.tse;
import defpackage.wls;
import defpackage.z8g;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.activity.UiSdkComponentHolder$init$1$1", f = "UiSdkComponentHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class UiSdkComponentHolder$init$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ lt11 $this_apply;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiSdkComponentHolder$init$1$1(lt11 lt11Var, Continuation continuation) {
        super(2, continuation);
        this.$this_apply = lt11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UiSdkComponentHolder$init$1$1(this.$this_apply, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        UiSdkComponentHolder$init$1$1 uiSdkComponentHolder$init$1$1 = (UiSdkComponentHolder$init$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        uiSdkComponentHolder$init$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        WindowMetrics maximumWindowMetrics;
        Rect bounds;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        fbb fbbVar = (fbb) ((z8g) ((fcg) this.$this_apply).a.b).h0.get();
        q5z.h(fbbVar);
        Context context = mt11.a;
        WindowManager windowManager = (WindowManager) (context != null ? context : null).getSystemService("window");
        if (Build.VERSION.SDK_INT >= 30) {
            maximumWindowMetrics = windowManager.getMaximumWindowMetrics();
            bounds = maximumWindowMetrics.getBounds();
            i = bounds.height();
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            i = displayMetrics.heightPixels;
        }
        fbbVar.a = Math.max(25, (int) Math.ceil(i / kjs0.b(28)));
        Context context2 = mt11.a;
        fcg fcgVar = (fcg) this.$this_apply;
        fcgVar.a();
        fcgVar.a();
        return zy11.a;
    }
}
