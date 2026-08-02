package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yandex.plus.log.api.LogPriority;
import core.divkit.state.a;

/* loaded from: classes2.dex */
public final class fjh implements DefaultLifecycleObserver {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ fjh(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String a(fjh fjhVar, pey peyVar) {
        String shortClassName;
        if (peyVar instanceof Activity) {
            ComponentName component = ((Activity) peyVar).getIntent().getComponent();
            return (component == null || (shortClassName = component.getShortClassName()) == null) ? peyVar.getClass().getSimpleName() : shortClassName;
        }
        if (!(peyVar instanceof Fragment)) {
            return "unknown";
        }
        String tag = ((Fragment) peyVar).getTag();
        return tag == null ? peyVar.getClass().getSimpleName() : tag;
    }

    private final void b(pey peyVar) {
    }

    private final void c(pey peyVar) {
    }

    private final void d(pey peyVar) {
    }

    private final void f(pey peyVar) {
    }

    private final void g(pey peyVar) {
    }

    private final void h(pey peyVar) {
    }

    private final void i(pey peyVar) {
    }

    private final void j(pey peyVar) {
    }

    private final void k(pey peyVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(pey peyVar) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                mdd0 mdd0Var = (mdd0) this.b;
                LogPriority logPriority = LogPriority.INFO;
                mdd0Var.getClass();
                ((ndd0) mdd0Var).a(logPriority, "Tarifficator", a(this, peyVar).concat(" created (not visible)"));
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(pey peyVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((jhd) obj).invoke();
                peyVar.getLifecycle().d(this);
                break;
            case 1:
                break;
            default:
                mdd0 mdd0Var = (mdd0) obj;
                LogPriority logPriority = LogPriority.INFO;
                mdd0Var.getClass();
                ((ndd0) mdd0Var).a(logPriority, "Tarifficator", a(this, peyVar).concat(" destroyed"));
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(pey peyVar) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                mdd0 mdd0Var = (mdd0) this.b;
                LogPriority logPriority = LogPriority.INFO;
                mdd0Var.getClass();
                ((ndd0) mdd0Var).a(logPriority, "Tarifficator", a(this, peyVar).concat(" paused (visible, not interactive)"));
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(pey peyVar) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                mdd0 mdd0Var = (mdd0) this.b;
                LogPriority logPriority = LogPriority.INFO;
                mdd0Var.getClass();
                ((ndd0) mdd0Var).a(logPriority, "Tarifficator", a(this, peyVar).concat(" resumed (interactive)"));
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(pey peyVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                a aVar = (a) obj;
                aVar.b.post(new yvl(aVar, 1));
                break;
            default:
                mdd0 mdd0Var = (mdd0) obj;
                LogPriority logPriority = LogPriority.INFO;
                mdd0Var.getClass();
                ((ndd0) mdd0Var).a(logPriority, "Tarifficator", a(this, peyVar).concat(" started (visible, not interactive)"));
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(pey peyVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                a aVar = (a) obj;
                aVar.b.post(new yvl(aVar, 0));
                break;
            default:
                mdd0 mdd0Var = (mdd0) obj;
                LogPriority logPriority = LogPriority.INFO;
                mdd0Var.getClass();
                ((ndd0) mdd0Var).a(logPriority, "Tarifficator", a(this, peyVar).concat(" stopped (not visible)"));
                break;
        }
    }
}
