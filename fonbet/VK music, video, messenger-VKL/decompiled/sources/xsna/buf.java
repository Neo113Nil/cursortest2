package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.impl.utils.performance.ClipsScreenPerformanceReporter;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.tlo0;
import xsna.vpf;
import xsna.wrf;

/* compiled from: ClipsWrapperTabsMviStateMapper.kt */
/* loaded from: classes17.dex */
public final class buf {
    public final xrf a;
    public final xtf b;
    public final rpf c;
    public final ClipsScreenPerformanceReporter d;

    public buf(xrf xrfVar, xtf xtfVar, rpf rpfVar, fuf fufVar, ClipsScreenPerformanceReporter clipsScreenPerformanceReporter) {
        this.a = xrfVar;
        this.b = xtfVar;
        this.c = rpfVar;
        this.d = clipsScreenPerformanceReporter;
    }

    public final isf a(isf isfVar, List<? extends ClipFeedTab> list, int i, int i2) {
        zrf zrfVar = isfVar.b;
        zrf c = zrf.c(zrfVar, b(zrfVar.e, i2, list, null), i2, i, 24);
        euf eufVar = isfVar.f;
        return isf.a(isfVar, c, null, null, null, euf.o(!(isfVar.l instanceof vpf.a) ? fuf.a(eufVar) : fuf.b(eufVar, c), null, null, false, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, false, ApiInvocationException.ErrorCodes.IDS_BLOCKED), null, null, null, this.b.b(isfVar.j, c), null, null, 1774);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList b(kwc kwcVar, int i, List list, a7j a7jVar) {
        wrf bVar;
        tlo0.a aVar;
        tlo0.a aVar2;
        tlo0.a aVar3;
        tlo0.a aVar4;
        int i2;
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        int i3 = 0;
        for (Object obj : list2) {
            int i4 = i3 + 1;
            tlo0 tlo0Var = null;
            if (i3 < 0) {
                e43.t();
                throw null;
            }
            ClipFeedTab clipFeedTab = (ClipFeedTab) obj;
            boolean z = list.size() > 1;
            kwc kwcVar2 = i3 == i ? kwcVar : null;
            ClipsScreenPerformanceReporter clipsScreenPerformanceReporter = i3 == i ? this.d : null;
            xrf xrfVar = this.a;
            auf aufVar = xrfVar.d;
            if (z) {
                boolean z2 = aufVar.a;
                if (clipFeedTab instanceof ClipFeedTab.Discover) {
                    aVar3 = tlo0.Companion;
                } else {
                    if (clipFeedTab instanceof ClipFeedTab.MyClips) {
                        aVar4 = tlo0.Companion;
                        i2 = R.string.clips_my_title;
                    } else {
                        if (clipFeedTab instanceof ClipFeedTab.CatalogClip) {
                            tlo0Var = aufVar.b(((ClipFeedTab.CatalogClip) clipFeedTab).Fb());
                        } else if (clipFeedTab instanceof ClipFeedTab.LivesTop) {
                            aVar4 = tlo0.Companion;
                            i2 = R.string.clip_feed_lives_tab;
                        } else if (clipFeedTab instanceof ClipFeedTab.MusicTemplate) {
                            aVar4 = tlo0.Companion;
                            i2 = R.string.clip_tab_music_templates;
                        } else if (clipFeedTab instanceof ClipFeedTab.UserSubscriptions) {
                            aVar4 = tlo0.Companion;
                            i2 = R.string.clip_feed_subscribtions;
                        } else if (clipFeedTab instanceof ClipFeedTab.ClipsFromShopsSource) {
                            aVar4 = tlo0.Companion;
                            i2 = R.string.clips_shops_title;
                        } else if (clipFeedTab instanceof ClipFeedTab.ClipsFromTrendsSource) {
                            aVar3 = tlo0.Companion;
                        } else if (clipFeedTab instanceof ClipFeedTab.NewsMonotheme) {
                            tlo0Var = oq.d(tlo0.Companion, ((ClipFeedTab.NewsMonotheme) clipFeedTab).c);
                        } else if ((clipFeedTab instanceof ClipFeedTab.ProfileLives) || (clipFeedTab instanceof ClipFeedTab.Profile) || (clipFeedTab instanceof ClipFeedTab.LikedClips) || (clipFeedTab instanceof ClipFeedTab.FavoriteFolder) || (clipFeedTab instanceof ClipFeedTab.Playlist) || (clipFeedTab instanceof ClipFeedTab.Search) || (clipFeedTab instanceof ClipFeedTab.NewsfeedDiscoverMedia) || (clipFeedTab instanceof ClipFeedTab.SingleClip) || (clipFeedTab instanceof ClipFeedTab.SingleClipByVideoId) || (clipFeedTab instanceof ClipFeedTab.SingleClipWithDecoration) || (clipFeedTab instanceof ClipFeedTab.Hashtag) || (clipFeedTab instanceof ClipFeedTab.Compilation) || (clipFeedTab instanceof ClipFeedTab.Mask) || (clipFeedTab instanceof ClipFeedTab.Place) || (clipFeedTab instanceof ClipFeedTab.Music) || (clipFeedTab instanceof ClipFeedTab.CoauthorInvitations)) {
                            if (z2) {
                                aVar2 = tlo0.Companion;
                                tlo0Var = tq.h(aVar2, R.string.clip_feed_recommend_page);
                            } else {
                                aVar = tlo0.Companion;
                                tlo0Var = tq.h(aVar, R.string.clips_title);
                            }
                        } else if (clipFeedTab instanceof ClipFeedTab.SingleClipFromBlock) {
                            tlo0Var = aufVar.a((ClipFeedTab.SingleClipFromBlock) clipFeedTab);
                        } else if (clipFeedTab instanceof ClipFeedTab.TopVideo) {
                            if (z2) {
                                aVar2 = tlo0.Companion;
                            } else if (fxc0.B().J().o1()) {
                                aVar2 = tlo0.Companion;
                            } else {
                                aVar = tlo0.Companion;
                                tlo0Var = tq.h(aVar, R.string.clips_title);
                            }
                            tlo0Var = tq.h(aVar2, R.string.clip_feed_recommend_page);
                        } else if (!(clipFeedTab instanceof ClipFeedTab.SingleAdv)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (tlo0Var == null) {
                            tlo0Var = oq.d(tlo0.Companion, "");
                        }
                    }
                    tlo0Var = tq.h(aVar4, i2);
                    if (tlo0Var == null) {
                    }
                }
                tlo0Var = tq.h(aVar3, R.string.clip_tab_trends);
                if (tlo0Var == null) {
                }
            } else {
                tlo0Var = aufVar.b(clipFeedTab);
            }
            Integer valueOf = Integer.valueOf(R.drawable.vk_icon_logo_clips_outline_20);
            boolean z3 = clipFeedTab instanceof ClipFeedTab.MyClips;
            if (z3) {
                valueOf = Integer.valueOf(R.drawable.vk_icon_play_rectangle_stack_outline_20);
            } else if (clipFeedTab instanceof ClipFeedTab.UserSubscriptions) {
                valueOf = Integer.valueOf(R.drawable.vk_icon_add_square_outline_20);
            } else if (!(clipFeedTab instanceof ClipFeedTab.TopVideo)) {
                boolean z4 = clipFeedTab instanceof ClipFeedTab.SingleClipFromBlock;
            }
            Integer num = valueOf;
            if (clipFeedTab instanceof ClipFeedTab.TopVideo) {
                bVar = new wrf.b((ClipFeedTab.TopVideo) clipFeedTab, tlo0Var, i3, xrfVar.e, new wrf.b.a(kwcVar2, a7jVar, clipsScreenPerformanceReporter, xrfVar.b, xrfVar.a, xrfVar.c), num);
            } else if ((clipFeedTab instanceof ClipFeedTab.Music) || (clipFeedTab instanceof ClipFeedTab.Mask) || (clipFeedTab instanceof ClipFeedTab.Compilation) || (clipFeedTab instanceof ClipFeedTab.Hashtag) || (clipFeedTab instanceof ClipFeedTab.Place) || (clipFeedTab instanceof ClipFeedTab.SingleClip) || (clipFeedTab instanceof ClipFeedTab.SingleClipByVideoId) || (clipFeedTab instanceof ClipFeedTab.SingleClipWithDecoration) || (clipFeedTab instanceof ClipFeedTab.SingleClipFromBlock) || (clipFeedTab instanceof ClipFeedTab.ClipsFromShopsSource) || (clipFeedTab instanceof ClipFeedTab.ClipsFromTrendsSource) || (clipFeedTab instanceof ClipFeedTab.SingleAdv) || (clipFeedTab instanceof ClipFeedTab.CatalogClip) || (clipFeedTab instanceof ClipFeedTab.MusicTemplate) || (clipFeedTab instanceof ClipFeedTab.Profile) || (clipFeedTab instanceof ClipFeedTab.Search) || (clipFeedTab instanceof ClipFeedTab.LivesTop) || (clipFeedTab instanceof ClipFeedTab.ProfileLives) || (clipFeedTab instanceof ClipFeedTab.NewsfeedDiscoverMedia) || (clipFeedTab instanceof ClipFeedTab.FavoriteFolder) || (clipFeedTab instanceof ClipFeedTab.Playlist) || (clipFeedTab instanceof ClipFeedTab.NewsMonotheme) || (clipFeedTab instanceof ClipFeedTab.CoauthorInvitations)) {
                bVar = new wrf.b(clipFeedTab, tlo0Var, i3, xrfVar.e, new wrf.b.a(kwcVar2, clipsScreenPerformanceReporter, xrfVar.b, xrfVar.c, 18), num);
            } else if (clipFeedTab instanceof ClipFeedTab.Discover) {
                bVar = new wrf.a((ClipFeedTab.Discover) clipFeedTab, tlo0Var, i3, xrfVar.e, num);
            } else if ((clipFeedTab instanceof ClipFeedTab.LikedClips) || (clipFeedTab instanceof ClipFeedTab.UserSubscriptions)) {
                bVar = new wrf.b(clipFeedTab, tlo0Var, i3, xrfVar.e, new wrf.b.a(kwcVar2, clipsScreenPerformanceReporter, xrfVar.b, null, 50), num);
            } else {
                if (!z3) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = new wrf.c((ClipFeedTab.MyClips) clipFeedTab, tlo0Var, i3, xrfVar.e, num);
            }
            arrayList.add(bVar);
            i3 = i4;
        }
        return arrayList;
    }
}
