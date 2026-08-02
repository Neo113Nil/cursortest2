package xsna;

import android.os.Bundle;
import com.vk.core.fragments.FragmentImpl;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import com.vk.ecomm.cart.impl.search_address.ui.fragment.SearchAddressFragment;

/* compiled from: SearchAddressRouter.kt */
/* loaded from: classes18.dex */
public final class nmh0 {
    public static void a(FragmentImpl fragmentImpl, int i, String str, Coordinates coordinates, boolean z) {
        SearchAddressFragment.a aVar = new SearchAddressFragment.a(SearchAddressFragment.class, null, null);
        Bundle bundle = aVar.j;
        bundle.putString("QUERY_KEY_ARG", str);
        bundle.putBoolean("IS_CUSTOM_ADDRESS_ENABLED", z);
        if (coordinates != null) {
            bundle.putParcelable("COORDINATES_KEY_ARG", coordinates);
        }
        aVar.g(i, fragmentImpl);
    }
}
