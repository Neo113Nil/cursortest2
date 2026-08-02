package defpackage;

import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.yandex.plus.home.plaque.plugin.internal.defaults.DefaultLifecycleVisibilityDetector;
import com.ybsdk.feature.divkit.internal.extensions.a;

/* loaded from: classes2.dex */
public final /* synthetic */ class p6 implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((a) obj).invoke();
                break;
            case 1:
                pjb pjbVar = (pjb) obj;
                if (gi91.c(pjbVar.b()) >= 1.0f) {
                    pjbVar.b.invoke();
                    break;
                }
                break;
            case 2:
                DefaultLifecycleVisibilityDetector.onScrollChangedListener$lambda$1((DefaultLifecycleVisibilityDetector) obj);
                break;
            case 3:
                ee21 ee21Var = (ee21) obj;
                if (gi91.c((TextView) ee21Var.m.a(ee21.w[9])) >= 1.0f) {
                    ee21Var.e.invoke();
                    break;
                }
                break;
            default:
                ((pr31) obj).a();
                break;
        }
    }
}
