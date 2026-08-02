package xsna;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.tlo0;

/* compiled from: ClipsWrapperTabNameMapper.kt */
/* loaded from: classes17.dex */
public final class auf {
    public final boolean a;

    /* compiled from: ClipsWrapperTabNameMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipFeedTab.SingleClipFromBlock.SourceBlockType.values().length];
            try {
                iArr[ClipFeedTab.SingleClipFromBlock.SourceBlockType.RETENTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipFeedTab.SingleClipFromBlock.SourceBlockType.OZON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipFeedTab.SingleClipFromBlock.SourceBlockType.RECOMMENDATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ClipFeedTab.SingleClipFromBlock.SourceBlockType.SHOPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public auf(boolean z) {
        this.a = z;
    }

    public final tlo0.f a(ClipFeedTab.SingleClipFromBlock singleClipFromBlock) {
        int i = a.$EnumSwitchMapping$0[singleClipFromBlock.d.ordinal()];
        boolean z = this.a;
        if (i == 1) {
            return z ? tq.h(tlo0.Companion, R.string.clip_tab_trends) : tq.h(tlo0.Companion, R.string.clips_title);
        }
        if (i == 2) {
            return z ? tq.h(tlo0.Companion, R.string.clips_shops_title) : tq.h(tlo0.Companion, R.string.clips_title);
        }
        if (i == 3) {
            return z ? tq.h(tlo0.Companion, R.string.clip_feed_recommend_page) : tq.h(tlo0.Companion, R.string.clips_title);
        }
        if (i == 4) {
            return tq.h(tlo0.Companion, R.string.clips_shops_title);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final tlo0 b(ClipFeedTab clipFeedTab) {
        tlo0 h;
        if (clipFeedTab instanceof ClipFeedTab.Discover) {
            h = tq.h(tlo0.Companion, R.string.clip_tab_trends);
        } else if (clipFeedTab instanceof ClipFeedTab.MyClips) {
            h = tq.h(tlo0.Companion, R.string.clips_my_title);
        } else if (clipFeedTab instanceof ClipFeedTab.SingleClip) {
            String str = ((ClipFeedTab.SingleClip) clipFeedTab).c;
            if (str != null) {
                h = oq.d(tlo0.Companion, str);
            }
            h = null;
        } else if (clipFeedTab instanceof ClipFeedTab.SingleClipByVideoId) {
            String str2 = ((ClipFeedTab.SingleClipByVideoId) clipFeedTab).d;
            if (str2 != null) {
                h = oq.d(tlo0.Companion, str2);
            }
            h = null;
        } else if (clipFeedTab instanceof ClipFeedTab.SingleClipWithDecoration) {
            String str3 = ((ClipFeedTab.SingleClipWithDecoration) clipFeedTab).c;
            if (str3 != null) {
                h = oq.d(tlo0.Companion, str3);
            }
            h = null;
        } else if ((clipFeedTab instanceof ClipFeedTab.CatalogClip.TrendingMusicCatalogClip) || (clipFeedTab instanceof ClipFeedTab.CatalogClip.TrendingHashtagCatalogClip)) {
            h = tq.h(tlo0.Companion, R.string.clip_grid_toolbar_title_trend);
        } else if (clipFeedTab instanceof ClipFeedTab.CatalogClip) {
            h = b(((ClipFeedTab.CatalogClip) clipFeedTab).Fb());
        } else if (clipFeedTab instanceof ClipFeedTab.Hashtag) {
            h = oq.d(tlo0.Companion, ((ClipFeedTab.Hashtag) clipFeedTab).b);
        } else if (clipFeedTab instanceof ClipFeedTab.Compilation) {
            String str4 = ((ClipFeedTab.Compilation) clipFeedTab).d;
            h = str4 != null ? oq.d(tlo0.Companion, str4) : tq.h(tlo0.Companion, R.string.compilation_title);
        } else if (clipFeedTab instanceof ClipFeedTab.Mask) {
            String str5 = ((ClipFeedTab.Mask) clipFeedTab).b;
            if (str5 != null) {
                h = oq.d(tlo0.Companion, str5);
            }
            h = null;
        } else if (clipFeedTab instanceof ClipFeedTab.Place) {
            h = tq.h(tlo0.Companion, R.string.clip_tab_place);
        } else if (clipFeedTab instanceof ClipFeedTab.Music) {
            tlo0.a aVar = tlo0.Companion;
            ClipFeedTab.Music music = (ClipFeedTab.Music) clipFeedTab;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String str6 = music.b;
            if (str6 == null) {
                str6 = "";
            }
            spannableStringBuilder.append((CharSequence) str6);
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) " ");
            }
            int length = spannableStringBuilder.length();
            String str7 = music.c;
            if (str7 == null) {
                str7 = "";
            }
            spannableStringBuilder.append((CharSequence) str7);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(l8g.g(-1, 80)), length, spannableStringBuilder.length(), 0);
            aVar.getClass();
            h = new tlo0.h(spannableStringBuilder);
        } else if (clipFeedTab instanceof ClipFeedTab.LivesTop) {
            h = tq.h(tlo0.Companion, R.string.clip_feed_lives_tab);
        } else if (clipFeedTab instanceof ClipFeedTab.NewsfeedDiscoverMedia) {
            String str8 = ((ClipFeedTab.NewsfeedDiscoverMedia) clipFeedTab).c;
            if (str8 != null) {
                h = oq.d(tlo0.Companion, str8);
            }
            h = null;
        } else if (clipFeedTab instanceof ClipFeedTab.MusicTemplate) {
            h = tq.h(tlo0.Companion, R.string.clip_tab_music_templates);
        } else if (clipFeedTab instanceof ClipFeedTab.UserSubscriptions) {
            h = tq.h(tlo0.Companion, R.string.clip_feed_subscribtions);
        } else if (clipFeedTab instanceof ClipFeedTab.ClipsFromShopsSource) {
            h = tq.h(tlo0.Companion, R.string.clips_shops_title);
        } else if (clipFeedTab instanceof ClipFeedTab.ClipsFromTrendsSource) {
            h = tq.h(tlo0.Companion, R.string.clip_tab_trends);
        } else if ((clipFeedTab instanceof ClipFeedTab.TopVideo) || (clipFeedTab instanceof ClipFeedTab.CoauthorInvitations)) {
            h = this.a ? tq.h(tlo0.Companion, R.string.clip_feed_recommend_page) : tq.h(tlo0.Companion, R.string.clips_title);
        } else if (clipFeedTab instanceof ClipFeedTab.SingleClipFromBlock) {
            h = a((ClipFeedTab.SingleClipFromBlock) clipFeedTab);
        } else if (clipFeedTab instanceof ClipFeedTab.NewsMonotheme) {
            h = oq.d(tlo0.Companion, ((ClipFeedTab.NewsMonotheme) clipFeedTab).c);
        } else {
            if (!(clipFeedTab instanceof ClipFeedTab.ProfileLives) && !(clipFeedTab instanceof ClipFeedTab.Profile) && !(clipFeedTab instanceof ClipFeedTab.LikedClips) && !(clipFeedTab instanceof ClipFeedTab.SingleAdv) && !(clipFeedTab instanceof ClipFeedTab.Search) && !(clipFeedTab instanceof ClipFeedTab.FavoriteFolder) && !(clipFeedTab instanceof ClipFeedTab.Playlist)) {
                throw new NoWhenBranchMatchedException();
            }
            h = null;
        }
        return h == null ? oq.d(tlo0.Companion, "") : h;
    }
}
