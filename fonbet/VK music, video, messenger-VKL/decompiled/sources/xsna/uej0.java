package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vkontakte.android.R;
import xsna.gfj0;
import xsna.tlo0;

/* compiled from: ShopsClipsGridBlockAccessibilityProvider.kt */
/* loaded from: classes17.dex */
public final class uej0 implements kae {
    public final ebe a;

    public uej0(ebe ebeVar) {
        this.a = ebeVar;
    }

    @Override // xsna.kae
    public final tlo0.g a(int i, int i2, SdkClipVideoFile sdkClipVideoFile) {
        gfj0.a a = gfj0.a(sdkClipVideoFile);
        if (!this.a.a || a == null) {
            tlo0.a aVar = tlo0.Companion;
            Object[] objArr = {Integer.valueOf(i + 1), Integer.valueOf(i2)};
            aVar.getClass();
            return tlo0.a.c(R.string.shops_clips_grid_block_a11y_item_template, objArr);
        }
        tlo0.a aVar2 = tlo0.Companion;
        Integer valueOf = Integer.valueOf(i + 1);
        Integer valueOf2 = Integer.valueOf(i2);
        String str = a.a;
        String str2 = a.b;
        if (str2 == null) {
            str2 = "";
        }
        aVar2.getClass();
        return tlo0.a.c(R.string.shops_clips_grid_block_a11y_item_product_template, valueOf, valueOf2, str, str2);
    }

    @Override // xsna.kae
    public final tlo0.f b() {
        return tq.h(tlo0.Companion, R.string.shops_clips_grid_block_a11y_block);
    }
}
