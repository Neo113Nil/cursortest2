package xsna;

import android.os.Bundle;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.group.CommunitiesCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.group.FriendCommunitiesCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.group.GroupsCollectionCatalogRootVh;
import com.vk.metrics.performance.scroll.ScrollScreenType;
import java.util.Set;
import xsna.ung;

/* compiled from: CommunitiesCatalogConfigurationFactory.kt */
/* loaded from: classes5.dex */
public final class vng implements y3a {
    public final zia a;
    public final Set<String> b = rl3.y0(new String[]{fpf0.a(CommunitiesCatalogRootVh.class).a().getCanonicalName(), fpf0.a(FriendCommunitiesCatalogRootVh.class).a().getCanonicalName(), fpf0.a(GroupsCollectionCatalogRootVh.class).a().getCanonicalName()});

    public vng(zia ziaVar) {
        this.a = ziaVar;
    }

    @Override // xsna.y3a
    public final CatalogConfiguration a(Bundle bundle) {
        return new ung(bundle, new ung.a(new pff(this, 4)));
    }

    @Override // xsna.y3a
    public final Set<String> b() {
        return this.b;
    }

    @Override // xsna.y3a
    public final ScrollScreenType c(String str) {
        return null;
    }
}
