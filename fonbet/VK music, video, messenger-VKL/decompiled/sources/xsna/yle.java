package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.sdk.shared.clips.SdkClipAudioTemplate;
import com.vk.core.view.components.banner.VkBanner;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.clips.ClipAudioTemplate;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vkontakte.android.R;
import kotlin.Lazy;
import xsna.a3p0;
import xsna.k1u0;
import xsna.ngv0;
import xsna.pjd;
import xsna.tlo0;

/* compiled from: ClipsMusicToolbar.kt */
/* loaded from: classes17.dex */
public final class yle extends pjd {
    public final c1u0<VkBanner> A;
    public a3p0.a B;
    public ClipGridParams.Data.Music C;
    public final boolean D;
    public final Object t;
    public final dg9 u;
    public final View v;
    public final View w;
    public final VkText x;
    public final VkButton y;
    public final VkButton z;

    public yle(fee feeVar, View view, ree reeVar, Lazy<? extends BridgeComponent> lazy) {
        super(feeVar, view, reeVar);
        this.t = lazy;
        this.u = new dg9(feeVar, this, view);
        this.v = view.findViewById(R.id.clips_grid_info_divider);
        this.w = view.findViewById(R.id.clips_grid_info_container);
        this.x = (VkText) view.findViewById(R.id.clips_grid_info);
        VkButton vkButton = (VkButton) view.findViewById(R.id.clips_grid_left_toolbar_button);
        VkButton.Mode mode = VkButton.Mode.Secondary;
        vkButton.setMode(mode);
        this.y = vkButton;
        VkButton vkButton2 = (VkButton) view.findViewById(R.id.clips_grid_right_toolbar_button);
        vkButton2.setMode(mode);
        this.z = vkButton2;
        this.A = new c1u0<>(R.id.clips_grid_trends_banner_stub, R.layout.clips_grid_trends_banner_layout, view, new com.vk.movika.sdk.base.observable.c(this, 28));
        this.D = true;
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.clips_grid_trends_banner_stub);
        dhr0 dhr0Var = dhr0.a;
        Context context = viewStub.getContext();
        dhr0Var.getClass();
        viewStub.setLayoutInflater(LayoutInflater.from(dhr0.t(context)));
    }

    @Override // xsna.pjd, xsna.d3p0
    public final void b(a3p0 a3p0Var) {
        ugv0 ugv0Var;
        if (a3p0Var instanceof a3p0.a) {
            a3p0.a aVar = (a3p0.a) a3p0Var;
            ClipGridParams.Data data = aVar.a;
            if (data instanceof ClipGridParams.Data.Music) {
                ClipGridParams.Data.Music music = (ClipGridParams.Data.Music) data;
                MusicTrack musicTrack = music.b;
                boolean z = music.i;
                ClipGridParams.Data.Music music2 = this.C;
                boolean f = epx.f(musicTrack, music2 != null ? music2.b : null);
                Context context = this.h;
                if (!f) {
                    View view = this.b;
                    Context context2 = view.getContext();
                    ucp ucpVar = ucp.a;
                    String str = musicTrack.d;
                    String str2 = musicTrack.K;
                    CharSequence p0 = drm0.p0(ucp.i(str));
                    StringBuilder sb = new StringBuilder();
                    String str3 = musicTrack.e;
                    if (str3 == null) {
                        str3 = "";
                    }
                    sb.append(str3);
                    sb.append(' ');
                    sb.append(s490.c(musicTrack.u));
                    CharSequence d = s490.d(context2, p0, drm0.p0(sb.toString()).toString(), R.attr.vk_ui_text_secondary);
                    if (z) {
                        String string = context.getResources().getString(R.string.clip_grid_toolbar_title_trend);
                        this.j = string;
                        this.i = string;
                    } else {
                        String string2 = context.getString(str2 != null ? R.string.clip_grid_track_toolbar_original_sound : R.string.clip_grid_track_toolbar_music);
                        this.i = d;
                        this.j = string2;
                    }
                    String a = ob50.a(musicTrack);
                    ngv0.a aVar2 = z ? new ngv0.a(new gko(R.drawable.vk_icon_flash_16), new x7g(R.attr.vk_ui_icon_primary), null, null, 12) : null;
                    tlo0.h f2 = u11.f(tlo0.Companion, d);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    vgv0 vgv0Var = new vgv0(f2, aVar2, (ngv0) null, 1, 4);
                    int length = a.length();
                    VkRichCell vkRichCell = this.r;
                    if (length > 0) {
                        ugv0Var = new ugv0(new tlo0.h(a), (ngv0.a) null, (ngv0.a) null, 1, str2 != null ? new fy0(4, vkRichCell, music) : null, 6);
                    } else {
                        ugv0Var = null;
                    }
                    vkRichCell.setMiddle(new pgv0(vgv0Var, ugv0Var, null, null, null, null, IronSourceError.ERROR_CODE_INIT_FAILED));
                    vkRichCell.setRight(str2 != null ? VkCell.Right.c.a(VkCell.Right.Companion, null, null, null, new VkCell.Right.b(new qb6(5, vkRichCell, music), (tlo0.f) null, new k1u0.a(new x7g(R.attr.vk_ui_icon_secondary)), 2), 23) : null);
                    n(new pjd.a(R.drawable.vk_icon_music_outline_32, musicTrack.Kb(e3m.a(R.dimen.clips_grid_header_icon_size, view.getContext()))));
                }
                boolean z2 = music.e;
                bwt0.p0(this.v, z2);
                View view2 = this.w;
                bwt0.p0(view2, z2);
                if (z2) {
                    Integer valueOf = Integer.valueOf(R.string.clip_grid_track_toolbar_privacy_info_group);
                    if (!fkq0.b(music.b.c)) {
                        valueOf = null;
                    }
                    String string3 = context.getString(valueOf != null ? valueOf.intValue() : R.string.clip_grid_track_toolbar_privacy_info);
                    this.x.setText(string3);
                    view2.setContentDescription(string3);
                }
                p(music);
                ClipAudioTemplate clipAudioTemplate = music.g;
                SdkClipAudioTemplate sdkClipAudioTemplate = clipAudioTemplate != null ? new SdkClipAudioTemplate(clipAudioTemplate.b) : null;
                VkButton vkButton = this.y;
                if (sdkClipAudioTemplate == null) {
                    bwt0.p0(vkButton, false);
                } else {
                    bwt0.p0(vkButton, true);
                    r();
                    jjc.g(vkButton, new nv2(9, this, sdkClipAudioTemplate));
                }
                o(music);
                q(aVar.e);
                this.B = aVar;
                this.C = music;
                super.b(a3p0Var);
            }
        }
    }

    @Override // xsna.pjd, xsna.d3p0
    public final dg9 c() {
        return this.u;
    }

    @Override // xsna.pjd, xsna.d3p0
    public final void g(ClipGridParams.Data data) {
        if (data instanceof ClipGridParams.Data.Music) {
            ClipGridParams.Data.Music music = (ClipGridParams.Data.Music) data;
            p(music);
            ClipAudioTemplate clipAudioTemplate = music.g;
            SdkClipAudioTemplate sdkClipAudioTemplate = clipAudioTemplate != null ? new SdkClipAudioTemplate(clipAudioTemplate.b) : null;
            VkButton vkButton = this.y;
            if (sdkClipAudioTemplate == null) {
                bwt0.p0(vkButton, false);
            } else {
                bwt0.p0(vkButton, true);
                r();
                jjc.g(vkButton, new nv2(9, this, sdkClipAudioTemplate));
            }
            q(null);
            this.C = music;
        }
    }

    @Override // xsna.sjd
    public final boolean j() {
        return this.D;
    }

    public final void p(ClipGridParams.Data.Music music) {
        ClipGridParams.Data.Music.b bVar = music.d;
        boolean z = bVar.b;
        VkButton vkButton = this.z;
        if (z) {
            a3p0.a aVar = this.B;
            if ((aVar != null ? aVar.e : null) == null) {
                bwt0.p0(vkButton, true);
                r();
                vkButton.a5(true, Integer.valueOf(bVar.a ? R.drawable.vk_icon_check_alt_20 : R.drawable.vk_icon_bookmark_outline_24));
                vkButton.setText(!bVar.a ? R.string.clip_sound_favorite : music.g != null ? R.string.clip_sound_favorite_added_short : R.string.clip_sound_favorite_added);
                bwt0.i0(vkButton, new isb0(8, vkButton, new gla(1, this, music)));
                return;
            }
        }
        bwt0.p0(vkButton, false);
        r();
    }

    public final void q(a3p0.a.C2519a c2519a) {
        ImageSize Cb;
        String str;
        vlw vlwVar = null;
        if (c2519a != null && (Cb = c2519a.f.Cb(iah0.z(this.h), true, false)) != null && (str = Cb.d.d) != null) {
            vlwVar = new vlw(str, null);
        }
        c1u0<VkBanner> c1u0Var = this.A;
        if (vlwVar == null) {
            if (c1u0Var.b()) {
                bwt0.p0(c1u0Var.a(), false);
            }
        } else {
            if (c1u0Var.b()) {
                bwt0.p0(c1u0Var.a(), true);
                return;
            }
            VkBanner vkBanner = (VkBanner) c1u0Var.a();
            bwt0.p0(vkBanner, true);
            vkBanner.setBackgroundImage(vlwVar);
            jjc.g(vkBanner, new gb(8, this, c2519a));
            vkBanner.setMiddle(new VkBanner.e(c2519a.b, c2519a.c, null, new VkBanner.c(c2519a.d, new j4(8, this, c2519a), VkButton.Mode.Primary, VkButton.Appearance.Overlay, VkButton.Size.Small, null, null, 992), null, null, 116));
        }
    }

    public final void r() {
        this.y.setText(bwt0.K(this.z) ? R.string.clips_template_by_music_button_short_text : R.string.clips_template_by_music_button_text);
    }
}
