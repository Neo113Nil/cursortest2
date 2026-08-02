package defpackage;

import android.content.Context;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.FlexModule;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDrawable;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDrawableProvider;

/* loaded from: classes10.dex */
public final /* synthetic */ class gkr implements ShimmerDrawableProvider {
    @Override // com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDrawableProvider
    public final ShimmerDrawable get(Context context) {
        ShimmerDrawable provideShimmerDrawableProvider$lambda$4;
        provideShimmerDrawableProvider$lambda$4 = FlexModule.provideShimmerDrawableProvider$lambda$4(context);
        return provideShimmerDrawableProvider$lambda$4;
    }
}
