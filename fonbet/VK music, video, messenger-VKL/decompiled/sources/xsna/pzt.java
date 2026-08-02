package xsna;

import com.vk.toggle.b;
import com.vk.toggle.features.SaFeatures;
import com.vk.toggle.features.VasFeatures;

/* compiled from: GiftsCatalogFragment.kt */
/* loaded from: classes7.dex */
public final class pzt {
    public static final boolean a() {
        SaFeatures saFeatures = SaFeatures.SA_FIX_BLINKING_AFTER_EXIT_APP;
        saFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        if (bVar.a(saFeatures)) {
            return false;
        }
        VasFeatures vasFeatures = VasFeatures.VAS_GIFT_MINIAPP_DISKOTEKA_FIX;
        b.d i = bVar.i(vasFeatures);
        Integer b = i != null ? i.b() : null;
        return ((b != null && b.intValue() == 1) || (b != null && b.intValue() == 3)) && bVar.a(vasFeatures);
    }
}
