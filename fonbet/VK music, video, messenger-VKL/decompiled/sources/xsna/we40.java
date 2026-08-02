package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.dto.common.Image;
import com.vk.dto.music.Thumb;
import com.vk.music.view.MusicCoverStackedView;
import com.vkontakte.android.R;
import java.util.List;
import java.util.concurrent.TimeUnit;
import xsna.k840;

/* compiled from: MusicCategoryOfflineItemVh.kt */
/* loaded from: classes16.dex */
public final class we40 extends fe40 {
    public final x76 s;
    public final oc40 t;
    public final te40 u;
    public final io.reactivex.rxjava3.disposables.g v;
    public final VkContentBadge w;

    public we40(View view, x76 x76Var) {
        super(view, x76Var);
        this.s = x76Var;
        r5v0 r5v0Var = k840.a.h;
        this.t = r5v0Var == null ? null : r5v0Var;
        this.u = new te40(k840.a.d(), (df5) k840.a.q.getValue(), k840.a.i);
        this.v = new io.reactivex.rxjava3.disposables.g();
        VkContentBadge vkContentBadge = (VkContentBadge) view.findViewById(R.id.music_badge_new);
        vkContentBadge.setAppearance(new VkContentBadge.Appearance.a(new x7g(R.attr.vk_ui_text_contrast), new x7g(R.attr.vk_ui_accent_raspberry_pink), null, 12));
        this.w = vkContentBadge;
    }

    @Override // xsna.fe40
    public final void V5(UIBlockLink uIBlockLink) {
        super.V5(uIBlockLink);
        this.r = uIBlockLink;
        View view = this.itemView;
        view.setOnClickListener((View.OnClickListener) this.s.invoke(view, uIBlockLink));
        CatalogLink catalogLink = uIBlockLink.y;
        this.p.setText(catalogLink.c);
        String str = catalogLink.d;
        boolean f = myc0.f(str);
        if (f) {
            TextView textView = this.q;
            textView.setVisibility(0);
            textView.setText(str);
        }
        boolean f2 = myc0.f(catalogLink.d);
        te40 te40Var = this.u;
        this.v.b(io.reactivex.rxjava3.core.q.X((f2 ? te40Var.c(uIBlockLink) : te40Var.a(uIBlockLink)).w(), new io.reactivex.rxjava3.internal.operators.observable.i0(this.t.a(), new mm6(new ll1(15, this, uIBlockLink), 28)).y(2L, TimeUnit.SECONDS).L(new gs00(new ue40(0, this, uIBlockLink), 2), false)).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new ff3(new ve40(this, f, 0), 20), new cc20(new weg(this, f, 2), 3)));
    }

    public final void a6(Long l) {
        TextView textView = this.q;
        if (l == null || l.longValue() <= 0) {
            f4m.j(textView);
            return;
        }
        textView.setVisibility(0);
        textView.setText(f870.t(l.longValue(), textView.getContext()));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public final void b6(List<Thumb> list) {
        CatalogLink catalogLink;
        CatalogLink catalogLink2;
        List<Thumb> list2 = list;
        String str = null;
        MusicCoverStackedView musicCoverStackedView = this.m;
        if (list2 != null && !list2.isEmpty()) {
            if (list.size() <= 1) {
                Thumb thumb = (Thumb) j5g.Y(list);
                int i = MusicCoverStackedView.y;
                musicCoverStackedView.T4(thumb, null, false);
                return;
            } else {
                Thumb thumb2 = (Thumb) j5g.Y(list);
                Thumb thumb3 = (Thumb) j5g.i0(list);
                int i2 = MusicCoverStackedView.y;
                musicCoverStackedView.T4(thumb2, thumb3, false);
            }
        }
        UIBlockLink uIBlockLink = this.r;
        Image image = (uIBlockLink == null || (catalogLink2 = uIBlockLink.y) == null) ? null : catalogLink2.f;
        if (image != null && !image.b.isEmpty()) {
            musicCoverStackedView.setPlaceholder(image);
            return;
        }
        UIBlockLink uIBlockLink2 = this.r;
        if (uIBlockLink2 != null && (catalogLink = uIBlockLink2.y) != null) {
            str = catalogLink.b;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -1903268188:
                    if (str.equals("synthetic_offline_music_playlist_all")) {
                        musicCoverStackedView.setPlaceholderByResId(R.drawable.vk_icon_playlist_outline_28);
                        break;
                    }
                    break;
                case -1048034935:
                    if (str.equals("synthetic_offline_music_autodownload_all")) {
                        musicCoverStackedView.setImageRes(R.drawable.vk_music_offline_playlist_72);
                        break;
                    }
                    break;
                case 320065073:
                    if (str.equals("synthetic_offline_music_audiobook_all")) {
                        musicCoverStackedView.setPlaceholderByResId(R.drawable.vk_icon_audiobook_outline_28);
                        break;
                    }
                    break;
                case 1238991073:
                    if (str.equals("synthetic_offline_music_album_all")) {
                        musicCoverStackedView.setPlaceholderByResId(R.drawable.vk_icon_vinyl_outline_28);
                        break;
                    }
                    break;
                case 1389309686:
                    if (str.equals("synthetic_offline_music_podcast_all")) {
                        musicCoverStackedView.setPlaceholderByResId(R.drawable.vk_icon_podcast_outline_28);
                        break;
                    }
                    break;
            }
        }
    }

    @Override // xsna.fe40
    public final void c() {
        this.v.b(null);
    }
}
