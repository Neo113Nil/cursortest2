package xsna;

import android.view.ViewGroup;
import com.vk.toggle.features.VideoFeatures;

/* compiled from: BaseKeyboardHolder.kt */
/* loaded from: classes6.dex */
public abstract class qf6 extends vfz {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf6(ViewGroup viewGroup, int i, egs0 egs0Var) {
        super(bwt0.I(i, viewGroup, false));
        if (egs0Var != null) {
            VideoFeatures videoFeatures = VideoFeatures.DISCOVERY_ITEMS_PREINFLATE;
            videoFeatures.getClass();
            if ((com.vk.toggle.b.A.a(videoFeatures) ? egs0Var : null) != null) {
                viewGroup.getContext();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf6(ViewGroup viewGroup, int i, int i2) {
        super(tf3.b(viewGroup, i, viewGroup, false));
        switch (i2) {
            case 1:
                super(tf3.b(viewGroup, i, viewGroup, false));
                break;
            default:
                break;
        }
    }
}
