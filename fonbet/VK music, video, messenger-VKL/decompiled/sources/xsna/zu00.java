package xsna;

import android.os.Bundle;
import com.vk.catalog2.common.dto.api.error.CatalogRestoreException;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.ecomm.catalog.impl.catalog.root.ClassifiedsCatalogRootVh;
import com.vk.ecomm.catalog.impl.catalog.simple.ClassifiedsCatalogSimpleRootVh;
import com.vk.metrics.performance.scroll.ScrollScreenType;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;

/* compiled from: MarketCatalogConfigurationFactory.kt */
/* loaded from: classes18.dex */
public final class zu00 implements y3a {
    public final dcy<? extends CatalogViewHolder> a;
    public final dcy<? extends CatalogViewHolder> b;
    public final maz c;
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new f5x(this, 3));

    public zu00(rfc rfcVar, rfc rfcVar2, maz mazVar) {
        this.a = rfcVar;
        this.b = rfcVar2;
        this.c = mazVar;
    }

    @Override // xsna.y3a
    public final CatalogConfiguration a(Bundle bundle) {
        String string = bundle.getString("___CTLG_KEY_CLASS__");
        boolean f = epx.f(string, fpf0.a(ClassifiedsCatalogRootVh.class).a().getCanonicalName());
        maz mazVar = this.c;
        if (f) {
            return new agc(bundle, mazVar);
        }
        if (epx.f(string, fpf0.a(ClassifiedsCatalogSimpleRootVh.class).a().getCanonicalName())) {
            return new agc(bundle, mazVar);
        }
        if (epx.f(string, ((pfc) this.a).a().getCanonicalName())) {
            return new afp();
        }
        if (epx.f(string, ((pfc) this.b).a().getCanonicalName())) {
            return new fwh0(new agc(bundle, mazVar));
        }
        throw new CatalogRestoreException("Can't restore configuration: " + bundle);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.y3a
    public final Set<String> b() {
        return (Set) this.d.getValue();
    }

    @Override // xsna.y3a
    public final ScrollScreenType c(String str) {
        if (str.equals(fpf0.a(ClassifiedsCatalogRootVh.class).a().getCanonicalName())) {
            return ScrollScreenType.MARKETPLACE_MAIN;
        }
        return null;
    }
}
