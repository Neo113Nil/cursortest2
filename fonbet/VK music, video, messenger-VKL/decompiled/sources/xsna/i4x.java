package xsna;

import android.view.View;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.List;
import xsna.aqx0;

/* compiled from: InsetsAnimationCallback.java */
/* loaded from: classes13.dex */
public final class i4x extends aqx0.b {
    public final View d;
    public int e;
    public int f;
    public final int[] g;

    public i4x(View view) {
        super(0);
        this.g = new int[2];
        this.d = view;
    }

    @Override // xsna.aqx0.b
    public final void a(@NonNull aqx0 aqx0Var) {
        this.d.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // xsna.aqx0.b
    public final void c(@NonNull aqx0 aqx0Var) {
        View view = this.d;
        int[] iArr = this.g;
        view.getLocationOnScreen(iArr);
        this.e = iArr[1];
    }

    @Override // xsna.aqx0.b
    @NonNull
    public final bqx0 d(@NonNull bqx0 bqx0Var, @NonNull List<aqx0> list) {
        Iterator<aqx0> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((it.next().a.d() & 8) != 0) {
                this.d.setTranslationY(rq2.c(this.f, 0, r0.a.c()));
                break;
            }
        }
        return bqx0Var;
    }

    @Override // xsna.aqx0.b
    @NonNull
    public final aqx0.a e(@NonNull aqx0 aqx0Var, @NonNull aqx0.a aVar) {
        View view = this.d;
        int[] iArr = this.g;
        view.getLocationOnScreen(iArr);
        int i = this.e - iArr[1];
        this.f = i;
        view.setTranslationY(i);
        return aVar;
    }
}
