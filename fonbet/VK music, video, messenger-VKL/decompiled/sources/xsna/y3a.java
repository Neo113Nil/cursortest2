package xsna;

import android.os.Bundle;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.metrics.performance.scroll.ScrollScreenType;
import java.util.Set;

/* compiled from: CatalogConfigurationFactory.kt */
/* loaded from: classes16.dex */
public interface y3a {
    CatalogConfiguration a(Bundle bundle);

    Set<String> b();

    default ScrollScreenType c(String str) {
        return null;
    }
}
