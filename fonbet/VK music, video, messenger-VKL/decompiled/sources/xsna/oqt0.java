package xsna;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class oqt0 implements izs {
    public final /* synthetic */ int b;

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                View view = (View) obj;
                return Boolean.valueOf(view.getVisibility() != 0 || view.getAlpha() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            case 2:
                qgi0.r((tgi0) obj, "topBarRightSecondExtraIcon");
                return s3q0.a;
            default:
                return new ArrayList();
        }
    }
}
