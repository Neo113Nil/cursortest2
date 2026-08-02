package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;
import defpackage.duj0;
import defpackage.jxi;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"androidx/compose/ui/platform/ComposeViewContext$callback$1", "Landroid/content/ComponentCallbacks2;", "Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;", "Landroid/content/res/Configuration;", "configuration", "Lzy11;", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "()V", "", "level", "onTrimMemory", "(I)V", "", "hasFocus", "onWindowFocusChanged", "(Z)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposeViewContext$callback$1 implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {
    final /* synthetic */ i this$0;

    public ComposeViewContext$callback$1(i iVar) {
        this.this$0 = iVar;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.this$0.d(configuration);
    }

    @Override // android.content.ComponentCallbacks
    @jxi
    public void onLowMemory() {
        this.this$0.f.a.clear();
        duj0 duj0Var = this.this$0.g;
        synchronized (duj0Var) {
            duj0Var.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        this.this$0.f.a.clear();
        duj0 duj0Var = this.this$0.g;
        synchronized (duj0Var) {
            duj0Var.a.c();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public void onWindowFocusChanged(boolean hasFocus) {
        this.this$0.s.c.setValue(Boolean.valueOf(hasFocus));
    }
}
