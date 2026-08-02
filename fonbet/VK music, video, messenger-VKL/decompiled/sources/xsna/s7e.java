package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.q7e;
import xsna.v7e;

/* compiled from: ClipsFeedListView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes17.dex */
public final class s7e extends SwipeRefreshLayout implements v7e {
    public static final Object S = new Object();
    public final q7e P;
    public final mbs Q;
    public final d8e R;

    /* compiled from: ClipsFeedListView.kt */
    public final class a {
        public a() {
        }
    }

    public s7e(Context context, p7e p7eVar, q7e q7eVar, mbs mbsVar, r8e r8eVar) {
        super(context, null);
        boolean z;
        this.P = q7eVar;
        this.Q = mbsVar;
        d8e d8eVar = new d8e(context, p7eVar, q7eVar, mbsVar, new a(), r8eVar);
        this.R = d8eVar;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (!p7eVar.b) {
            ClipFeedTab clipFeedTab = p7eVar.a.b;
            if ((clipFeedTab instanceof ClipFeedTab.Discover) || (clipFeedTab instanceof ClipFeedTab.SingleAdv) || (clipFeedTab instanceof ClipFeedTab.TopVideo) || (clipFeedTab instanceof ClipFeedTab.Mask) || (clipFeedTab instanceof ClipFeedTab.Compilation) || (clipFeedTab instanceof ClipFeedTab.Music) || (clipFeedTab instanceof ClipFeedTab.Profile) || (clipFeedTab instanceof ClipFeedTab.MyClips) || (clipFeedTab instanceof ClipFeedTab.Hashtag) || (clipFeedTab instanceof ClipFeedTab.Place) || (clipFeedTab instanceof ClipFeedTab.UserSubscriptions) || (clipFeedTab instanceof ClipFeedTab.SingleClip) || (clipFeedTab instanceof ClipFeedTab.SingleClipByVideoId) || (clipFeedTab instanceof ClipFeedTab.SingleClipFromBlock) || (clipFeedTab instanceof ClipFeedTab.ClipsFromShopsSource) || (clipFeedTab instanceof ClipFeedTab.ClipsFromTrendsSource) || (clipFeedTab instanceof ClipFeedTab.CatalogClip) || (clipFeedTab instanceof ClipFeedTab.LikedClips) || (clipFeedTab instanceof ClipFeedTab.ProfileLives) || (clipFeedTab instanceof ClipFeedTab.LivesTop) || (clipFeedTab instanceof ClipFeedTab.Search) || (clipFeedTab instanceof ClipFeedTab.NewsfeedDiscoverMedia) || (clipFeedTab instanceof ClipFeedTab.MusicTemplate) || (clipFeedTab instanceof ClipFeedTab.FavoriteFolder) || (clipFeedTab instanceof ClipFeedTab.CoauthorInvitations) || (clipFeedTab instanceof ClipFeedTab.NewsMonotheme)) {
                z = true;
                setEnabled(z);
                setProgressBackgroundColorSchemeResource(R.color.vk_gray_750);
                setColorSchemeResources(R.color.vk_sky_300);
                setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: xsna.r7e
                    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
                    public final void h() {
                        s7e.this.a();
                    }
                });
                addView(d8eVar);
                mbsVar.a(new t7e(this));
            }
            if (!(clipFeedTab instanceof ClipFeedTab.SingleClipWithDecoration) && !(clipFeedTab instanceof ClipFeedTab.Playlist)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        z = false;
        setEnabled(z);
        setProgressBackgroundColorSchemeResource(R.color.vk_gray_750);
        setColorSchemeResources(R.color.vk_sky_300);
        setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: xsna.r7e
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
            public final void h() {
                s7e.this.a();
            }
        });
        addView(d8eVar);
        mbsVar.a(new t7e(this));
    }

    @Override // xsna.v7e
    public final void a() {
        owi.a(S, 300L, new s4(this, 23));
    }

    @Override // xsna.v7e
    public final s7e b() {
        if (!i0q0.b()) {
            q7e.e eVar = this.P.s;
            com.vk.metrics.eventtracking.b.a.q(new IllegalStateException("address clips feed view from background thread"));
        }
        return this;
    }

    @Override // xsna.v7e
    public v7e.a getFeature() {
        return this.R;
    }

    @Override // xsna.v7e
    public v7e.b getFeedContainer() {
        return this.R;
    }
}
