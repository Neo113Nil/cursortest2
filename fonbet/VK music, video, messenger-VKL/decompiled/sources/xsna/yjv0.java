package xsna;

import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.feature.music.dto.ui.UiBlockInteractiveVkMix;
import com.vk.catalog2.feature.music.holders.vkmix.viewholders.MusicBaseVkMixInteractiveVh;
import com.vk.core.view.components.button.VkButton;
import com.vk.music.mixsettings.MixOptionEntity;
import com.vk.music.mixsettings.MixSettingsEntity;
import com.vk.music.view.MusicRoundPlayView;
import com.vkontakte.android.R;

/* compiled from: VkSingleMixInflater.kt */
/* loaded from: classes16.dex */
public final class yjv0 implements j4v0 {
    public final aud a;
    public final k4v0 b;
    public TextView c;
    public TextView d;
    public VkButton e;
    public MusicRoundPlayView f;

    public yjv0(l4v0 l4v0Var, aud audVar) {
        k4v0 k4v0Var = new k4v0(l4v0Var, audVar);
        this.a = audVar;
        this.b = k4v0Var;
    }

    @Override // xsna.j4v0
    public final void a(String str) {
        TextView textView = this.c;
        if (textView == null) {
            textView = null;
        }
        textView.setText(str);
    }

    @Override // xsna.j4v0
    public final void b() {
        zs20 zs20Var = new zs20(R.dimen.music_vk_mix_interactive_height_small, R.dimen.music_vk_mix_interactive_play_margin_small, R.dimen.music_vk_mix_interactive_title_margin_small, R.dimen.music_vk_mix_interactive_title_margin_placeholder_small);
        zs20 zs20Var2 = new zs20(R.dimen.music_vk_mix_interactive_static_height, R.dimen.music_vk_mix_interactive_play_static_margin, R.dimen.music_vk_mix_interactive_title_static_margin, R.dimen.music_vk_mix_interactive_title_static_margin_placeholder);
        MusicRoundPlayView musicRoundPlayView = this.f;
        if (musicRoundPlayView == null) {
            musicRoundPlayView = null;
        }
        this.b.j(musicRoundPlayView, zs20Var, zs20Var2, new emh0(this, 22));
    }

    @Override // xsna.j4v0
    public final void c(MixSettingsEntity mixSettingsEntity) {
        String string;
        MixOptionEntity e = mixSettingsEntity != null ? mixSettingsEntity.e() : null;
        boolean z = (e != null ? e.c : null) != null;
        if (e != null) {
            string = e.c;
        } else {
            VkButton vkButton = this.e;
            if (vkButton == null) {
                vkButton = null;
            }
            string = vkButton.getContext().getString(R.string.music_vkmix_settings);
        }
        VkButton vkButton2 = this.e;
        if (vkButton2 == null) {
            vkButton2 = null;
        }
        vkButton2.setText(string);
        VkButton vkButton3 = this.e;
        this.b.i(vkButton3 != null ? vkButton3 : null, z);
    }

    @Override // xsna.j4v0
    public final void d(MusicBaseVkMixInteractiveVh.a aVar, MusicBaseVkMixInteractiveVh.b bVar, p01 p01Var) {
        VkButton vkButton = this.e;
        if (vkButton == null) {
            vkButton = null;
        }
        jjc.g(vkButton, new z8l0(aVar, 15));
        VkButton vkButton2 = this.e;
        VkButton vkButton3 = vkButton2 != null ? vkButton2 : null;
        k4v0 k4v0Var = this.b;
        k4v0Var.f(vkButton3, p01Var);
        k4v0Var.b(bVar);
    }

    @Override // xsna.j4v0
    public final MusicRoundPlayView e() {
        MusicRoundPlayView musicRoundPlayView = this.f;
        if (musicRoundPlayView != null) {
            return musicRoundPlayView;
        }
        return null;
    }

    @Override // xsna.j4v0
    public final void f(boolean z, UiBlockInteractiveVkMix uiBlockInteractiveVkMix, String str) {
        TextView textView = this.c;
        if (textView == null) {
            textView = null;
        }
        textView.setText(str);
        String c = this.b.c();
        TextView textView2 = this.d;
        if (textView2 == null) {
            textView2 = null;
        }
        if (c == null) {
            c = "";
        }
        textView2.setText(c);
        aud audVar = this.a;
        boolean z2 = !audVar.d() && uiBlockInteractiveVkMix.B;
        VkButton vkButton = this.e;
        if (vkButton == null) {
            vkButton = null;
        }
        bwt0.p0(vkButton, z2);
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        vkButton.setAlpha(z2 ? 1.0f : 0.0f);
        MusicRoundPlayView musicRoundPlayView = this.f;
        MusicRoundPlayView musicRoundPlayView2 = musicRoundPlayView != null ? musicRoundPlayView : null;
        bwt0.p0(musicRoundPlayView2, !audVar.d());
        if (!audVar.d()) {
            f = 1.0f;
        }
        musicRoundPlayView2.setAlpha(f);
        this.b.h(audVar.d());
    }
}
