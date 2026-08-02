package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.NonBouncedAppBarLayout;
import com.google.android.material.appbar.NonBouncedAppBarShadowView;
import com.google.android.material.appbar.NonBouncedCollapsingToolbarLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.podcast.PodcastInfo;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.WeakHashMap;
import kotlin.collections.EmptyList;
import xsna.iut0;

/* compiled from: PhonePodcastPageToolbarViewController.kt */
/* loaded from: classes3.dex */
public final class m3a0 extends fib0 {
    public final RecyclerView b;
    public final NonBouncedAppBarLayout c;
    public final Toolbar d;
    public final TextView e;
    public final MenuItem f;
    public final NonBouncedAppBarShadowView g;
    public final View h;
    public final ThumbsImageView i;
    public final ThumbsImageView j;
    public int k;
    public final hib0 l;
    public final q13 m;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x00c2, code lost:
    
        if (r0.orientation == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m3a0(View view, final gjb0 gjb0Var) {
        this.b = (RecyclerView) view.findViewById(R.id.music_playlist_content_list);
        NonBouncedAppBarLayout nonBouncedAppBarLayout = (NonBouncedAppBarLayout) view.findViewById(R.id.music_playlist_non_bounced_app_bar_layout);
        this.c = nonBouncedAppBarLayout;
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        this.d = toolbar;
        TextView textView = (TextView) view.findViewById(R.id.playlist_collapsed_title);
        this.e = textView;
        MenuItem add = toolbar.getMenu().add(0, R.id.playlist_menu, 0, "");
        this.f = add;
        this.g = (NonBouncedAppBarShadowView) view.findViewById(R.id.appbar_shadow_view);
        this.h = view.findViewById(R.id.muisc_playlist_layout_blue_foreground);
        this.i = (ThumbsImageView) view.findViewById(R.id.music_playlist_background_image);
        this.j = (ThumbsImageView) view.findViewById(R.id.playlist_foreground_image);
        this.l = new hib0(view, gjb0Var, false);
        q13 q13Var = new q13(e3m.a(R.dimen.music_playlist_logo_height, view.getContext()), view.getContext(), EmptyList.b);
        this.m = q13Var;
        textView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ((NonBouncedCollapsingToolbarLayout) view.findViewById(R.id.collapsing_layout)).setContentScrim(null);
        nonBouncedAppBarLayout.setBackgroundColor(0);
        nonBouncedAppBarLayout.a(new NonBouncedAppBarLayout.d() { // from class: xsna.j3a0
            @Override // com.google.android.material.appbar.NonBouncedAppBarLayout.d
            public final void a(NonBouncedAppBarLayout nonBouncedAppBarLayout2, int i) {
                int totalScrollRange = nonBouncedAppBarLayout2.getTotalScrollRange();
                m3a0 m3a0Var = m3a0.this;
                q13 q13Var2 = m3a0Var.m;
                q13Var2.h = m3a0Var.d.getHeight() + nonBouncedAppBarLayout2.getTotalScrollRange() + m3a0Var.k;
                q13Var2.a(q13Var2.a);
                m3a0Var.h.setAlpha((-i) / (totalScrollRange - r3.getHeight()));
                boolean z = Math.abs(i) >= totalScrollRange - m3a0Var.k;
                float f = z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                long j = z ? 100L : 0L;
                NonBouncedAppBarShadowView nonBouncedAppBarShadowView = m3a0Var.g;
                nonBouncedAppBarShadowView.animate().alpha(f).setDuration(120L).setListener(new l3a0(nonBouncedAppBarShadowView, f)).setDuration(j).start();
                TextView textView2 = m3a0Var.e;
                textView2.animate().alpha(f).setDuration(120L).setListener(new l3a0(textView2, f)).setDuration(j).start();
            }
        });
        Context context = nonBouncedAppBarLayout.getContext();
        HashSet hashSet = iah0.a;
        q13Var.b(nonBouncedAppBarLayout, fnj.d(context));
        Configuration configuration = nonBouncedAppBarLayout.getContext().getResources().getConfiguration();
        boolean z = configuration != null ? true : z;
        z = false;
        c(z);
        ocb ocbVar = new ocb(this, 2);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(view, ocbVar);
        abg0 abg0Var = dhr0.t;
        add.setIcon(abg0Var.b(R.drawable.vk_icon_more_vertical_24, R.attr.vk_ui_icon_accent_themed));
        add.setShowAsAction(2);
        add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: xsna.k3a0
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                gjb0 gjb0Var2 = gjb0.this;
                if (gjb0Var2 == null) {
                    return true;
                }
                gjb0Var2.E0();
                return true;
            }
        });
        n720.a(add, view.getContext().getString(R.string.accessibility_actions));
        add.setEnabled(false);
        toolbar.setNavigationContentDescription(toolbar.getContext().getString(R.string.music_talkback_go_back));
        toolbar.setNavigationIcon(abg0Var.b(R.drawable.vk_icon_arrow_left_outline_28, R.attr.vk_ui_icon_accent_themed));
        toolbar.setNavigationOnClickListener(new q3(gjb0Var, 9));
    }

    @Override // xsna.too0
    public final void Ng() {
        abg0 abg0Var = dhr0.t;
        this.f.setIcon(abg0Var.b(R.drawable.vk_icon_more_vertical_24, R.attr.vk_ui_icon_accent_themed));
        this.d.setNavigationIcon(abg0Var.b(R.drawable.vk_icon_arrow_left_outline_28, R.attr.vk_ui_icon_accent_themed));
        this.l.Ng();
    }

    @Override // xsna.fib0
    public final void a(PodcastInfo podcastInfo) {
        this.e.setText(podcastInfo.b);
        this.f.setEnabled(true);
        this.l.a(podcastInfo);
    }

    @Override // xsna.fib0
    public final void b() {
        this.l.b();
    }

    public final void c(boolean z) {
        NonBouncedAppBarLayout nonBouncedAppBarLayout = this.c;
        nonBouncedAppBarLayout.h(z, false, true);
        nonBouncedAppBarLayout.setExpandingBlocked(!z);
        this.e.setAlpha(z ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f);
        RecyclerView recyclerView = this.b;
        recyclerView.stopScroll();
        recyclerView.stopNestedScroll();
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.scrollToPosition(0);
        }
    }

    @Override // xsna.fib0, xsna.f380
    public final void onConfigurationChanged(Configuration configuration) {
        c(configuration.orientation == 1);
        this.l.getClass();
    }
}
