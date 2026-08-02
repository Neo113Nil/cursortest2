package xsna;

import android.os.Bundle;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.metrics.performance.scroll.ScrollScreenType;
import com.vk.video.profile.presentation.catalog.holders.VideoProfileCatalogContentVh;
import java.util.Collections;
import java.util.Set;
import xsna.b9s0;

/* compiled from: VkVideoCatalogConfigurationFactory.kt */
/* loaded from: classes6.dex */
public final class pzv0 implements y3a {
    public final zia a;

    public pzv0(zia ziaVar) {
        this.a = ziaVar;
    }

    @Override // xsna.y3a
    public final CatalogConfiguration a(Bundle bundle) {
        return new y6t0(bundle, new b9s0.a(new d8t0(this, 9), null, null, 510));
    }

    @Override // xsna.y3a
    public final Set<String> b() {
        return Collections.singleton(fpf0.a(VideoProfileCatalogContentVh.class).a().getCanonicalName());
    }

    @Override // xsna.y3a
    public final ScrollScreenType c(String str) {
        return null;
    }
}
