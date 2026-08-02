package xsna;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.List;
import xsna.aqx0;

/* compiled from: TranslateViewAnimationCallback.kt */
/* loaded from: classes2.dex */
public final class eop0 extends aqx0.b {
    public final View d;
    public final float e;

    public eop0(View view, float f) {
        super(0);
        this.d = view;
        this.e = f;
    }

    @Override // xsna.aqx0.b
    public final void a(aqx0 aqx0Var) {
        this.d.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
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
        float a = mdq.a(bqx0Var);
        float abs = Math.abs(a);
        float f = this.e;
        this.d.setTranslationY(abs >= f ? a + f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        return bqx0Var;
    }
}
