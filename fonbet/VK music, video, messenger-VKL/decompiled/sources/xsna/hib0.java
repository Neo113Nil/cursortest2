package xsna;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.PhotoStripView;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.music.Thumb;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.podcast.PodcastInfo;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: PodcastPageToolbarViewControllerDelegate.kt */
/* loaded from: classes3.dex */
public final class hib0 extends fib0 {
    public final View b;
    public final gjb0 c;
    public final boolean d;
    public final TextView e;
    public final TextView f;
    public final ViewGroup g;
    public final VkButton h;
    public final VkButton i;
    public final ViewGroup j;
    public final TextView k;
    public final PhotoStripView l;
    public final View m;
    public final ThumbsImageView n;
    public final ThumbsImageView o;
    public final bpn0 p;
    public final yz40 q;
    public final LayoutTransition r;

    public hib0(View view, gjb0 gjb0Var, boolean z) {
        this.b = view;
        this.c = gjb0Var;
        this.d = z;
        this.e = (TextView) view.findViewById(R.id.playlist_title);
        this.f = (TextView) view.findViewById(R.id.playlist_owner_text);
        this.g = (ViewGroup) view.findViewById(R.id.buttons_container);
        VkButton vkButton = (VkButton) view.findViewById(R.id.subscribe_button);
        this.h = vkButton;
        VkButton vkButton2 = (VkButton) view.findViewById(R.id.notifications_button);
        this.i = vkButton2;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.friends);
        this.j = viewGroup;
        this.k = (TextView) viewGroup.findViewById(R.id.friends_text);
        PhotoStripView photoStripView = (PhotoStripView) viewGroup.findViewById(R.id.friends_photos);
        this.l = photoStripView;
        this.m = view.findViewById(R.id.separator);
        ThumbsImageView thumbsImageView = (ThumbsImageView) view.findViewById(R.id.playlist_foreground_image);
        this.n = thumbsImageView;
        ThumbsImageView thumbsImageView2 = (ThumbsImageView) view.findViewById(R.id.music_playlist_background_image);
        this.o = thumbsImageView2;
        this.p = new bpn0(new e550(this, 10));
        abg0 abg0Var = dhr0.t;
        yz40 yz40Var = new yz40(abg0Var.c(R.attr.vk_ui_background_content), abg0Var.c(R.attr.vk_ui_background_secondary));
        this.q = yz40Var;
        this.r = new LayoutTransition();
        bwt0.i0(vkButton, new gib0(this, 0));
        bwt0.i0(vkButton2, new yhu(this, 21));
        photoStripView.setPadding(cn70.b(2));
        photoStripView.setOverlapOffset(0.75f);
        thumbsImageView.g(cn70.a() * 8.0f, cn70.a() * 8.0f, cn70.a() * 8.0f, cn70.a() * 8.0f);
        thumbsImageView.setOutlineProvider(cn70.a() * 8.0f);
        thumbsImageView.getHierarchy().q(150);
        if (thumbsImageView2 != null) {
            thumbsImageView2.setPostProcessorForSingle(yz40Var);
            thumbsImageView2.setEmptyColor(abg0Var.c(R.attr.vk_ui_background_secondary));
            thumbsImageView2.setBackground(abg0Var.c(R.attr.vk_ui_background_content));
            ((njt) thumbsImageView2.getHierarchy()).q(0);
            thumbsImageView2.setDependsOn(thumbsImageView);
        }
    }

    @Override // xsna.too0
    public final void Ng() {
        abg0 abg0Var = dhr0.t;
        int c = abg0Var.c(R.attr.vk_ui_background_content);
        yz40 yz40Var = this.q;
        yz40Var.d = c;
        yz40Var.e = abg0Var.c(R.attr.vk_ui_background_secondary);
        ThumbsImageView thumbsImageView = this.o;
        if (thumbsImageView != null) {
            thumbsImageView.setEmptyColor(abg0Var.c(R.attr.vk_ui_background_secondary));
            thumbsImageView.setBackground(abg0Var.c(R.attr.vk_ui_background_content));
        }
        this.n.setBackgroundImageAttr(R.attr.vk_ui_background_content);
    }

    @Override // xsna.fib0
    public final void a(PodcastInfo podcastInfo) {
        String str = podcastInfo.f;
        Thumb thumb = podcastInfo.h;
        this.e.setText(podcastInfo.b);
        String str2 = podcastInfo.c;
        TextView textView = this.f;
        textView.setText(str2);
        textView.setContentDescription(str2);
        bwt0.p0(textView, !(str2 == null || str2.length() == 0));
        this.g.setLayoutTransition(null);
        this.h.setEnabled(true);
        gjb0 gjb0Var = this.c;
        d(gjb0Var != null && gjb0Var.U());
        this.i.setEnabled(true);
        c(gjb0Var != null && gjb0Var.r7());
        ThumbsImageView thumbsImageView = this.o;
        if (thumbsImageView != null) {
            thumbsImageView.setThumb(thumb);
        }
        String string = this.b.getResources().getString(R.string.accessibility_podcast_cover);
        ThumbsImageView thumbsImageView2 = this.n;
        thumbsImageView2.setContentDescription(string);
        thumbsImageView2.setThumb(thumb);
        thumbsImageView2.setElevation(this.d ? cn70.a() * 5.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ViewGroup viewGroup = this.j;
        if (str == null || str.length() == 0) {
            bwt0.p0(viewGroup, false);
        } else {
            this.k.setText(str);
            List<Owner> list = podcastInfo.e;
            List<Owner> list2 = list;
            PhotoStripView photoStripView = this.l;
            if (list2 == null || list2.isEmpty()) {
                bwt0.p0(photoStripView, false);
            } else {
                int min = Math.min(list.size(), 3);
                photoStripView.setCount(min);
                for (int i = 0; i < min; i++) {
                    photoStripView.h(i, list.get(i).f(cn70.b(32)));
                }
                bwt0.p0(photoStripView, true);
            }
            bwt0.p0(viewGroup, !(gjb0Var != null && gjb0Var.U()));
        }
        String str3 = podcastInfo.g;
        bwt0.p0(this.m, !(str3 == null || str3.length() == 0));
    }

    @Override // xsna.fib0
    public final void b() {
        gjb0 gjb0Var = this.c;
        if (gjb0Var == null || !gjb0Var.U()) {
            this.h.setEnabled(false);
        }
        if (gjb0Var != null) {
            gjb0Var.K1(new b140(this, 10), new fa00(this, 17));
        }
    }

    public final void c(boolean z) {
        Integer valueOf = Integer.valueOf(z ? R.drawable.vk_icon_deprecated_ic_notifications_active_outline_24 : R.drawable.vk_icon_deprecated_ic_notifications_outline_24);
        int[] iArr = VkButton.W;
        VkButton vkButton = this.i;
        boolean z2 = true;
        vkButton.a5(true, valueOf);
        gjb0 gjb0Var = this.c;
        if ((gjb0Var == null || !gjb0Var.U() || gjb0Var == null || !gjb0Var.I6()) && !z) {
            z2 = false;
        }
        bwt0.p0(vkButton, z2);
        vkButton.setContentDescription(this.b.getResources().getString(z ? R.string.podcasts_talkback_unsubscribe : R.string.podcasts_talkback_subscribe));
    }

    public final void d(boolean z) {
        View view = this.b;
        gjb0 gjb0Var = this.c;
        VkButton vkButton = this.h;
        if (z) {
            vkButton.setMode(VkButton.Mode.Secondary);
            vkButton.a5(true, Integer.valueOf((gjb0Var == null || !gjb0Var.r6()) ? R.drawable.vk_icon_deprecated_ic_done_24 : R.drawable.vk_icon_like_24));
            vkButton.setText(view.getResources().getString(R.string.podcast_subscribed));
        } else {
            vkButton.setMode(VkButton.Mode.Primary);
            vkButton.a5(true, Integer.valueOf((gjb0Var == null || !gjb0Var.r6()) ? R.drawable.vk_icon_deprecated_ic_add_24 : R.drawable.vk_icon_like_outline_24));
            vkButton.setText(view.getResources().getString(R.string.podcast_subscribe));
        }
    }
}
