package xsna;

import android.content.Context;
import com.vk.profile.community.catalog.impl.communities.CommunitiesCatalogFragment;
import java.util.HashSet;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class wng implements gzs {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ CommunitiesCatalogFragment c;

    public /* synthetic */ wng(boolean z, CommunitiesCatalogFragment communitiesCatalogFragment) {
        this.b = z;
        this.c = communitiesCatalogFragment;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        boolean z;
        int i = CommunitiesCatalogFragment.T;
        if (!this.b) {
            Context requireContext = this.c.requireContext();
            HashSet hashSet = iah0.a;
            if (!fnj.d(requireContext)) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
