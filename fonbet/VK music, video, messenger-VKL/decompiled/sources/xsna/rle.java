package xsna;

import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipsMusicSelectorCatalogPromoBannerContainerVh;
import com.vk.core.view.infiniteviewpager.ViewPagerInfinite;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.e;
import com.vk.music.player.error.VkPlayerException;
import java.util.List;

/* compiled from: ClipsMusicSelectorCatalogPromoBannerContainerVh.kt */
/* loaded from: classes16.dex */
public final class rle implements com.vk.music.player.e {
    public final /* synthetic */ e.a b = new e.a();
    public final /* synthetic */ ClipsMusicSelectorCatalogPromoBannerContainerVh c;

    public rle(ClipsMusicSelectorCatalogPromoBannerContainerVh clipsMusicSelectorCatalogPromoBannerContainerVh) {
        this.c = clipsMusicSelectorCatalogPromoBannerContainerVh;
    }

    @Override // com.vk.music.player.e
    public final void B1() {
        this.b.getClass();
    }

    @Override // com.vk.music.player.e
    public final void K1() {
        this.b.getClass();
    }

    @Override // com.vk.music.player.e
    public final void N3(PlayState playState, com.vk.music.player.f fVar) {
        ViewPagerInfinite viewPagerInfinite = this.c.c;
        if (viewPagerInfinite == null) {
            viewPagerInfinite = null;
        }
        PagerAdapter adapter = viewPagerInfinite.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // com.vk.music.player.e
    public final void W3(com.vk.music.player.f fVar) {
        this.b.getClass();
    }

    @Override // com.vk.music.player.e
    public final void n3() {
        this.b.getClass();
    }

    @Override // com.vk.music.player.e
    public final void o2(com.vk.music.player.f fVar) {
        this.b.getClass();
    }

    @Override // com.vk.music.player.e
    public final void onError(@Nullable String str) {
        this.b.getClass();
    }

    @Override // com.vk.music.player.e
    public final boolean t3(VkPlayerException vkPlayerException) {
        this.b.getClass();
        return false;
    }

    @Override // com.vk.music.player.e
    public final void x0() {
        this.b.getClass();
    }

    @Override // com.vk.music.player.e
    public final void y4(List<PlayerTrack> list) {
        this.b.getClass();
    }

    @Override // com.vk.music.player.e
    public final void z3() {
        this.b.getClass();
    }
}
