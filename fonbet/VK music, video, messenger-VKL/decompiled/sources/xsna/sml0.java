package xsna;

import android.content.Context;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.storefront.impl.albums.presentation.fragment.StorefrontAlbumsArgs;
import com.vk.ecomm.storefront.impl.albums.presentation.fragment.StorefrontAlbumsFragment;
import com.vk.ecomm.storefront.impl.community.presentation.fragment.StorefrontFragment;
import defpackage.StorefrontArgs;

/* compiled from: StorefrontRouterImpl.kt */
/* loaded from: classes.dex */
public final class sml0 implements rml0 {
    @Override // xsna.rml0
    public final void b(Context context, UserId userId) {
        new StorefrontAlbumsFragment.a(new StorefrontAlbumsArgs(userId)).k(context);
    }

    @Override // xsna.rml0
    public final void c(Context context, UserId userId, MarketAnalyticsParams marketAnalyticsParams, Class<? extends FragmentImpl> cls, boolean z) {
        StorefrontFragment.a aVar = new StorefrontFragment.a(new StorefrontArgs(userId, marketAnalyticsParams, z));
        aVar.v(cls);
        aVar.k(context);
    }
}
