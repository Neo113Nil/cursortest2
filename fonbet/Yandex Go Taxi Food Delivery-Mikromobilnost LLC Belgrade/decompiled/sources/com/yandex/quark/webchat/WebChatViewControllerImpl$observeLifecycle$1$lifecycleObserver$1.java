package com.yandex.quark.webchat;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.ComponentActivity;
import defpackage.pey;
import defpackage.se41;
import defpackage.tls;
import defpackage.w900;
import defpackage.y3x0;
import defpackage.z83;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public /* synthetic */ class WebChatViewControllerImpl$observeLifecycle$1$lifecycleObserver$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Activity activity;
        pey peyVar = (pey) obj;
        se41 se41Var = (se41) this.receiver;
        w900 w900Var = se41Var.E;
        Context context = ((View) se41Var.D.getValue()).getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            }
            if (context instanceof ComponentActivity) {
                activity = (Activity) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        ComponentActivity componentActivity = (ComponentActivity) activity;
        if (componentActivity == null) {
            z83.i();
        } else {
            componentActivity.getOnBackPressedDispatcher().a(peyVar, w900Var);
            w900Var.h(se41Var.w.isInitialized() && ((y3x0) se41Var.a()).e.canGoBack());
        }
        return zy11.a;
    }
}
