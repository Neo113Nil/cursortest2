package xsna;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import xsna.aqx0;

/* compiled from: KeyboardBackgroundAnimationCallback.kt */
/* loaded from: classes2.dex */
public final class zey extends aqx0.b {
    public final View d;
    public final float e;

    public zey(View view, float f) {
        super(0);
        this.d = view;
        this.e = f;
    }

    @Override // xsna.aqx0.b
    public final void a(aqx0 aqx0Var) {
        this.d.setTranslationY(ify.d(3, null));
    }

    @Override // xsna.aqx0.b
    public final bqx0 d(bqx0 bqx0Var, List<aqx0> list) {
        Object obj;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if ((((aqx0) obj).a.d() & 8) != 0) {
                break;
            }
        }
        if (((aqx0) obj) == null) {
            return bqx0Var;
        }
        this.d.setTranslationY(Math.abs(Math.abs(mdq.a(bqx0Var)) - ify.d(3, null)) + this.e);
        return bqx0Var;
    }
}
