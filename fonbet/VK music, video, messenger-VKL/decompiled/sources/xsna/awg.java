package xsna;

import androidx.fragment.app.Fragment;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.ecomm.checklist.impl.presentation.CommunityCheckListFragment;
import xsna.lrv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class awg implements lrv0.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Fragment c;

    public /* synthetic */ awg(Fragment fragment, int i) {
        this.b = i;
        this.c = fragment;
    }

    @Override // xsna.lrv0.a
    public final void xb() {
        int i = this.b;
        Fragment fragment = this.c;
        switch (i) {
            case 0:
                VkPlaceholder vkPlaceholder = ((CommunityCheckListFragment) fragment).W;
                if (vkPlaceholder == null) {
                    vkPlaceholder = null;
                }
                CommunityCheckListFragment.fo(vkPlaceholder);
                break;
            case 1:
                int i2 = d2h.p1;
                ((d2h) fragment).tn();
                break;
            default:
                ((com.vk.superapp.browser.ui.a) fragment).xb();
                break;
        }
    }
}
