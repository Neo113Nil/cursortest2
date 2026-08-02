package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vkontakte.android.R;
import xsna.mov0;
import xsna.tra0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class um implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ um(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((tra0.a) obj).q((tra0) this.d, -this.c, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            case 1:
                View inflate = ((LayoutInflater) this.d).inflate(R.layout.appkit_empty, (ViewGroup) obj, false);
                ((TextView) inflate.findViewById(R.id.empty_text)).setText(this.c);
                return inflate;
            default:
                WebApiApplication webApiApplication = (WebApiApplication) this.d;
                Integer num = (Integer) obj;
                vdx0 vdx0Var = e370.e;
                if (vdx0Var == null) {
                    vdx0Var = null;
                }
                return vdx0Var.d().O(webApiApplication.b, this.c, num).U(new he40(mov0.f.b, 21));
        }
    }
}
