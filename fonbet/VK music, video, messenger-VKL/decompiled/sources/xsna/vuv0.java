package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.feature.music.dto.ui.UiBlockInteractiveVkMix;
import com.vk.catalog2.feature.music.holders.vkmix.viewholders.MusicBaseVkMixInteractiveVh;
import com.vk.core.view.components.button.VkButton;
import com.vk.music.mixsettings.MixOptionEntity;
import com.vk.music.mixsettings.MixSettingsEntity;
import com.vk.music.view.MusicRoundPlayView;
import com.vkontakte.android.R;

/* compiled from: VkTwoMixesInflater.kt */
/* loaded from: classes16.dex */
public final class vuv0 implements j4v0 {
    public final wln0 a;
    public final l4v0 b;
    public final aud c;
    public final k4v0 d;
    public wnn0 e;
    public wnn0 f;
    public VkButton g;
    public VkButton h;
    public MusicRoundPlayView i;
    public ViewGroup j;
    public wnn0 k;
    public yiq<MusicRoundPlayView> l;
    public final bpn0 m;
    public final bpn0 n;

    public vuv0(wln0 wln0Var, l4v0 l4v0Var, aud audVar) {
        k4v0 k4v0Var = new k4v0(l4v0Var, audVar);
        this.a = wln0Var;
        this.b = l4v0Var;
        this.c = audVar;
        this.d = k4v0Var;
        this.m = new bpn0(new chr0(7));
        this.n = new bpn0(new bem0(7));
    }

    @Override // xsna.j4v0
    public final void a(String str) {
        wnn0 wnn0Var = this.e;
        if (wnn0Var == null) {
            wnn0Var = null;
        }
        wnn0Var.b(str, false);
    }

    @Override // xsna.j4v0
    public final void b() {
        MusicRoundPlayView musicRoundPlayView = this.i;
        if (musicRoundPlayView == null) {
            musicRoundPlayView = null;
        }
        this.d.j(musicRoundPlayView, (zs20) this.m.getValue(), (zs20) this.n.getValue(), new ujm0(this, 16));
    }

    @Override // xsna.j4v0
    public final void c(MixSettingsEntity mixSettingsEntity) {
        String string;
        MixOptionEntity e = mixSettingsEntity != null ? mixSettingsEntity.e() : null;
        boolean z = (e != null ? e.c : null) != null;
        if (e != null) {
            string = e.c;
        } else {
            VkButton vkButton = this.g;
            if (vkButton == null) {
                vkButton = null;
            }
            string = vkButton.getContext().getString(R.string.music_vkmix_settings);
        }
        VkButton vkButton2 = this.g;
        if (vkButton2 == null) {
            vkButton2 = null;
        }
        vkButton2.setText(string);
        VkButton vkButton3 = this.h;
        if (vkButton3 == null) {
            vkButton3 = null;
        }
        vkButton3.setText(string);
        VkButton vkButton4 = this.h;
        if (vkButton4 == null) {
            vkButton4 = null;
        }
        g(vkButton4, z);
        VkButton vkButton5 = this.g;
        g(vkButton5 != null ? vkButton5 : null, z);
    }

    @Override // xsna.j4v0
    public final void d(MusicBaseVkMixInteractiveVh.a aVar, MusicBaseVkMixInteractiveVh.b bVar, p01 p01Var) {
        VkButton vkButton = this.g;
        if (vkButton == null) {
            vkButton = null;
        }
        jjc.g(vkButton, new gsq0(aVar, 9));
        VkButton vkButton2 = this.h;
        if (vkButton2 == null) {
            vkButton2 = null;
        }
        jjc.g(vkButton2, new skj0(aVar, 21));
        VkButton vkButton3 = this.g;
        if (vkButton3 == null) {
            vkButton3 = null;
        }
        k4v0 k4v0Var = this.d;
        k4v0Var.f(vkButton3, p01Var);
        VkButton vkButton4 = this.h;
        k4v0Var.f(vkButton4 != null ? vkButton4 : null, p01Var);
        k4v0Var.b(bVar);
    }

    @Override // xsna.j4v0
    public final MusicRoundPlayView e() {
        MusicRoundPlayView musicRoundPlayView = this.i;
        if (musicRoundPlayView != null) {
            return musicRoundPlayView;
        }
        return null;
    }

    @Override // xsna.j4v0
    public final void f(boolean z, UiBlockInteractiveVkMix uiBlockInteractiveVkMix, String str) {
        r80 a;
        wnn0 wnn0Var = this.e;
        if (wnn0Var == null) {
            wnn0Var = null;
        }
        wnn0Var.b(str, z);
        String c = this.d.c();
        wnn0 wnn0Var2 = this.f;
        if (wnn0Var2 == null) {
            wnn0Var2 = null;
        }
        if (c == null) {
            c = "";
        }
        wnn0Var2.b(c, z);
        aud audVar = this.c;
        boolean z2 = !audVar.d() && uiBlockInteractiveVkMix.B;
        VkButton vkButton = this.g;
        if (vkButton == null) {
            vkButton = null;
        }
        bwt0.p0(vkButton, z2);
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        vkButton.setAlpha(z2 ? 1.0f : 0.0f);
        MusicRoundPlayView musicRoundPlayView = this.i;
        if (musicRoundPlayView == null) {
            musicRoundPlayView = null;
        }
        bwt0.p0(musicRoundPlayView, !audVar.d());
        if (!audVar.d()) {
            f = 1.0f;
        }
        musicRoundPlayView.setAlpha(f);
        this.d.h(audVar.d());
        l4v0 l4v0Var = this.b;
        int i = epx.f((l4v0Var == null || (a = l4v0Var.a()) == null) ? null : (String) a.a, "common") ? R.string.music_vkmix_swipe_action_common : R.string.music_vkmix_swipe_action_my_music;
        wnn0 wnn0Var3 = this.k;
        if (wnn0Var3 == null) {
            wnn0Var3 = null;
        }
        ViewGroup viewGroup = this.j;
        if (viewGroup == null) {
            viewGroup = null;
        }
        Context context = viewGroup.getContext();
        wnn0Var3.b(context != null ? context.getString(i) : null, false);
    }

    public final void g(VkButton vkButton, boolean z) {
        this.d.i(vkButton, z);
    }
}
