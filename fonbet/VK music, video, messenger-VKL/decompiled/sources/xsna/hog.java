package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.profile.community.catalog.impl.communities.CommunitiesCatalogFragment;

/* compiled from: CommunitiesCatalogRouterImpl.kt */
/* loaded from: classes5.dex */
public final class hog implements gog {
    @Override // xsna.gog
    public final void a(Context context, String str, String str2, boolean z) {
        CommunitiesCatalogFragment.a aVar = new CommunitiesCatalogFragment.a();
        Bundle bundle = aVar.j;
        bundle.putString("key_url", str);
        if (str2 != null) {
            bundle.putString("ref", str2);
        }
        if (!z) {
            bundle.putBoolean("use_filters", false);
        }
        aVar.k(context);
    }

    @Override // xsna.gog
    public final void b(Context context, UserId userId, String str, boolean z) {
        CommunitiesCatalogFragment.a aVar = new CommunitiesCatalogFragment.a();
        Bundle bundle = aVar.j;
        bundle.putParcelable("owner_id", userId);
        if (str != null) {
            bundle.putString("ref", str);
        }
        if (!z) {
            bundle.putBoolean("use_filters", false);
        }
        aVar.k(context);
    }

    @Override // xsna.gog
    public final Class<? extends FragmentImpl> c() {
        return CommunitiesCatalogFragment.class;
    }
}
