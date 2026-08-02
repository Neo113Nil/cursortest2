package xsna;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: ActionLinkOffsetCalculator.kt */
/* loaded from: classes2.dex */
public final class c20 {
    public final gzs<View> a;
    public final gzs<View> b;
    public final gzs<View> c;
    public final gzs<Boolean> d;

    /* JADX WARN: Multi-variable type inference failed */
    public c20(gzs<? extends View> gzsVar, gzs<? extends View> gzsVar2, gzs<? extends View> gzsVar3, gzs<Boolean> gzsVar4) {
        this.a = gzsVar;
        this.b = gzsVar2;
        this.c = gzsVar3;
        this.d = gzsVar4;
    }

    public final int a() {
        Resources resources;
        int i = 0;
        if (!this.d.invoke().booleanValue()) {
            return 0;
        }
        View invoke = this.a.invoke();
        DisplayMetrics displayMetrics = (invoke == null || (resources = invoke.getResources()) == null) ? null : resources.getDisplayMetrics();
        boolean z = (displayMetrics != null ? displayMetrics.widthPixels : 0) > (displayMetrics != null ? displayMetrics.heightPixels : 0);
        if (invoke != null && bwt0.K(invoke) && z) {
            i = invoke.getMeasuredHeight();
        }
        View invoke2 = this.b.invoke();
        if (invoke2 != null && bwt0.K(invoke2)) {
            i += invoke2.getMeasuredHeight();
        }
        View invoke3 = this.c.invoke();
        if (invoke3 != null && bwt0.K(invoke3)) {
            i += iah0.a(6) + invoke3.getMeasuredHeight();
        }
        return iah0.a(8) + i;
    }
}
