package xsna;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.vkontakte.android.R;
import xsna.c63;
import xsna.k5x;

/* compiled from: InspectorImpl.kt */
/* loaded from: classes18.dex */
public final class u5x extends c63.b {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ q5x c;

    public u5x(boolean z, q5x q5xVar) {
        this.b = z;
        this.c = q5xVar;
    }

    @Override // xsna.c63.b
    public final void p(Activity activity) {
        c63 c63Var = c63.a;
        c63.c(this);
        if (this.b) {
            int i = k5x.b;
            k5x.a.a(activity, new t5x(this.c));
            return;
        }
        int i2 = k5x.b;
        k5x k5xVar = (k5x) activity.findViewById(R.id.fab_id);
        if (k5xVar != null) {
            ViewParent parent = k5xVar.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(k5xVar);
            }
        }
    }
}
