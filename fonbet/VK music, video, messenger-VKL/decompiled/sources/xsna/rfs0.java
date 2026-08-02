package xsna;

import com.vk.video.ui.discovery.catalog.VideoDiscoveryCatalogSourceArgs;
import com.vk.video.ui.discovery.catalog.b;
import com.vkontakte.android.fragments.WebViewFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class rfs0 implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rfs0(e9z e9zVar, boolean z) {
        this.d = e9zVar;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        boolean z = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                return new b.a.C1967a(((tfs0) obj).a, z, (VideoDiscoveryCatalogSourceArgs.Catalog) obj2);
            default:
                int i2 = WebViewFragment.O0;
                ((e9z) obj2).s0(z);
                return null;
        }
    }

    public /* synthetic */ rfs0(boolean z, VideoDiscoveryCatalogSourceArgs.Catalog catalog) {
        this.c = z;
        this.d = catalog;
    }
}
