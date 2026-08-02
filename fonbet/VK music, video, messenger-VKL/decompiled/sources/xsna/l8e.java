package xsna;

import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.feed.recycler.adapter.ClipFeedAdapter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;

/* compiled from: ClipsFeedPrecacheDefaultParams.kt */
/* loaded from: classes17.dex */
public final class l8e {
    public final v6e a;
    public final yof b;
    public final Object c = msy.a(LazyThreadSafetyMode.NONE, new qc(this, 17));

    public l8e(v6e v6eVar, zof zofVar) {
        this.a = v6eVar;
        this.b = zofVar;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    public final Map<Integer, Integer> a() {
        int i = 1;
        v6e v6eVar = this.a;
        ClipFeedTab clipFeedTab = v6eVar.b;
        int i2 = 6;
        if ((clipFeedTab instanceof ClipFeedTab.ProfileLives) || (clipFeedTab instanceof ClipFeedTab.LivesTop)) {
            return on00.f(new Pair(Integer.valueOf(ClipFeedAdapter.ViewType.LIVE.ordinal()), 6));
        }
        boolean z = clipFeedTab instanceof ClipFeedTab.LikedClips;
        ?? r6 = this.c;
        yof yofVar = this.b;
        if (!z && !(clipFeedTab instanceof ClipFeedTab.MyClips) && !(clipFeedTab instanceof ClipFeedTab.TopVideo) && !(clipFeedTab instanceof ClipFeedTab.UserSubscriptions) && !(clipFeedTab instanceof ClipFeedTab.Music) && !(clipFeedTab instanceof ClipFeedTab.Mask) && !(clipFeedTab instanceof ClipFeedTab.Compilation) && !(clipFeedTab instanceof ClipFeedTab.Hashtag) && !(clipFeedTab instanceof ClipFeedTab.Place) && !(clipFeedTab instanceof ClipFeedTab.SingleClip) && !(clipFeedTab instanceof ClipFeedTab.SingleClipByVideoId) && !(clipFeedTab instanceof ClipFeedTab.SingleClipWithDecoration) && !(clipFeedTab instanceof ClipFeedTab.SingleClipFromBlock) && !(clipFeedTab instanceof ClipFeedTab.ClipsFromShopsSource) && !(clipFeedTab instanceof ClipFeedTab.ClipsFromTrendsSource) && !(clipFeedTab instanceof ClipFeedTab.Profile) && !(clipFeedTab instanceof ClipFeedTab.CatalogClip) && !(clipFeedTab instanceof ClipFeedTab.MusicTemplate) && !(clipFeedTab instanceof ClipFeedTab.Search) && !(clipFeedTab instanceof ClipFeedTab.NewsfeedDiscoverMedia) && !(clipFeedTab instanceof ClipFeedTab.FavoriteFolder) && !(clipFeedTab instanceof ClipFeedTab.Playlist) && !(clipFeedTab instanceof ClipFeedTab.NewsMonotheme) && !(clipFeedTab instanceof ClipFeedTab.CoauthorInvitations)) {
            if (clipFeedTab instanceof ClipFeedTab.SingleAdv) {
                if (yofVar.e0().a && ((Boolean) r6.getValue()).booleanValue()) {
                    i = yofVar.e0().c;
                }
                if (i > 0) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put(Integer.valueOf(ClipFeedAdapter.ViewType.ADS.ordinal()), 1);
                    linkedHashMap.put(Integer.valueOf(ClipFeedAdapter.ViewType.ADS_CONTROLS.ordinal()), 1);
                    return linkedHashMap;
                }
            } else if (!(clipFeedTab instanceof ClipFeedTab.Discover)) {
                throw new NoWhenBranchMatchedException();
            }
            return jgp.b;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(Integer.valueOf(ClipFeedAdapter.ViewType.CLIP_CONTROLS.ordinal()), 1);
        Integer valueOf = Integer.valueOf(ClipFeedAdapter.ViewType.CLIP.ordinal());
        if (yofVar.e0().a && ((Boolean) r6.getValue()).booleanValue()) {
            i2 = yofVar.e0().b;
        }
        linkedHashMap2.put(valueOf, Integer.valueOf(i2));
        ClipFeedTab clipFeedTab2 = v6eVar.b;
        if ((clipFeedTab2 instanceof ClipFeedTab.TopVideo) || (clipFeedTab2 instanceof ClipFeedTab.SingleClip) || (clipFeedTab2 instanceof ClipFeedTab.SingleClipFromBlock) || (clipFeedTab2 instanceof ClipFeedTab.NewsfeedDiscoverMedia)) {
            linkedHashMap2.put(Integer.valueOf(ClipFeedAdapter.ViewType.ADS.ordinal()), Integer.valueOf((yofVar.e0().a && ((Boolean) r6.getValue()).booleanValue()) ? yofVar.e0().c : 1));
        }
        if (yofVar.e0().a && ((Boolean) r6.getValue()).booleanValue()) {
            i = yofVar.e0().d;
        }
        if (i > 0) {
            linkedHashMap2.put(Integer.valueOf(ClipFeedAdapter.ViewType.PAGINATION_LOADING.ordinal()), Integer.valueOf(i));
        }
        return linkedHashMap2;
    }
}
