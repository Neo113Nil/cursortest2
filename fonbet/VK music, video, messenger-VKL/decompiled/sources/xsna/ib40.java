package xsna;

import android.view.ViewGroup;
import com.vk.catalog2.feature.music.holders.vkmix.viewholders.MusicBaseVkMixInteractiveVh;
import com.vk.music.player.e;
import com.vk.music.player.error.VkPlayerException;
import com.vkontakte.android.R;
import xsna.ikv0;

/* compiled from: MusicBaseVkMixInteractiveVh.kt */
/* loaded from: classes16.dex */
public final class ib40 extends e.a {
    public final /* synthetic */ MusicBaseVkMixInteractiveVh b;
    public final /* synthetic */ u2b0 c;

    public ib40(MusicBaseVkMixInteractiveVh musicBaseVkMixInteractiveVh, u2b0 u2b0Var) {
        this.b = musicBaseVkMixInteractiveVh;
        this.c = u2b0Var;
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final boolean t3(VkPlayerException vkPlayerException) {
        ViewGroup viewGroup = this.b.e;
        if (viewGroup != null) {
            ikv0.a aVar = new ikv0.a(viewGroup.getContext());
            aVar.u = new ikv0.d(viewGroup.getContext().getString(R.string.failed_apply_mix_settings), (String) null, (ikv0.d.a) null, 6);
            aVar.n();
        }
        this.c.n0(this);
        return true;
    }
}
