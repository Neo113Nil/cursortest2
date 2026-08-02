package xsna;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: ViewExt.kt */
/* loaded from: classes6.dex */
public final class qwt0 implements ViewTreeObserver.OnWindowAttachListener {
    public final /* synthetic */ hpj a;
    public final /* synthetic */ Object b;

    public qwt0(hpj hpjVar, View view) {
        this.a = hpjVar;
        this.b = view;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, java.lang.Object] */
    @Override // android.view.ViewTreeObserver.OnWindowAttachListener
    public final void onWindowDetached() {
        zvj.c(this.a, null);
        this.b.getViewTreeObserver().removeOnWindowAttachListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnWindowAttachListener
    public final void onWindowAttached() {
    }
}
