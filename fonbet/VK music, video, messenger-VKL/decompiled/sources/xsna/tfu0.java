package xsna;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.voip.ui.VoipViewBehaviour;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import xsna.mjw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class tfu0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tfu0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                com.vk.superapp.browser.ui.a aVar = (com.vk.superapp.browser.ui.a) obj;
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                int i2 = VoipCallServiceFragment.Y;
                ((RecyclerView) obj).scrollToPosition(0);
                break;
            case 5:
                mjw0 mjw0Var = (mjw0) obj;
                mjw0.a aVar2 = mjw0Var.c;
                VoipViewBehaviour voipViewBehaviour = mjw0Var.x;
                aVar2.a = 16.0f / voipViewBehaviour.g();
                float g = 1.0f / voipViewBehaviour.g();
                ViewGroup viewGroup = mjw0Var.n0;
                viewGroup.setScaleX(g);
                viewGroup.setScaleY(g);
                FrameLayout frameLayout = mjw0Var.r;
                frameLayout.setOutlineProvider(aVar2);
                frameLayout.setElevation(iah0.b(4.0f));
                FrameLayout frameLayout2 = mjw0Var.o;
                frameLayout2.setOutlineProvider(null);
                frameLayout2.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                mjw0.u(mjw0Var, viewGroup, true, false, 12);
                mjw0Var.u.c(false);
                break;
            default:
                ((kbx0) obj).a.finish();
                break;
        }
        return s3q0.a;
    }
}
