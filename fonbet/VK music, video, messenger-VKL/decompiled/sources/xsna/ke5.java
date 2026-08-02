package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.video.impl.channel.AuthorsChannelSliderView$AuthorsChannelState;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ke5 implements s2a {
    @Override // xsna.s2a
    public final r2a a(CatalogBlockState catalogBlockState) {
        String i;
        AuthorsChannelSliderView$AuthorsChannelState authorsChannelSliderView$AuthorsChannelState = (AuthorsChannelSliderView$AuthorsChannelState) catalogBlockState;
        BlockId.CompositeId compositeId = authorsChannelSliderView$AuthorsChannelState.b;
        String str = authorsChannelSliderView$AuthorsChannelState.e;
        boolean z = authorsChannelSliderView$AuthorsChannelState.f;
        String str2 = authorsChannelSliderView$AuthorsChannelState.g;
        i = uqm0.i(authorsChannelSliderView$AuthorsChannelState.h, R.plurals.community_subscribers, R.string.community_subscribers_formatted, true);
        return new ne5(compositeId, str, z, str2, i, authorsChannelSliderView$AuthorsChannelState.i);
    }
}
