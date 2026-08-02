package xsna;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.vkontakte.android.R;
import xsna.k5x;

/* compiled from: InspectorImpl.kt */
/* loaded from: classes18.dex */
public final class v5x implements izs<Boolean, s3q0> {
    public final /* synthetic */ q5x b;

    public v5x(q5x q5xVar) {
        this.b = q5xVar;
    }

    @Override // xsna.izs
    public final s3q0 invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        q5x q5xVar = this.b;
        q5xVar.c = booleanValue;
        c63 c63Var = c63.a;
        Activity b = c63.b();
        if (b == null) {
            c63.a(new u5x(booleanValue, q5xVar));
        } else if (booleanValue) {
            int i = k5x.b;
            k5x.a.a(b, new t5x(q5xVar));
        } else {
            int i2 = k5x.b;
            k5x k5xVar = (k5x) b.findViewById(R.id.fab_id);
            if (k5xVar != null) {
                ViewParent parent = k5xVar.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(k5xVar);
                }
            }
        }
        return s3q0.a;
    }
}
