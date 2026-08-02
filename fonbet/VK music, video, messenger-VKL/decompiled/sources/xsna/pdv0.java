package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.NewsfeedData;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoTag;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.reactions.ReactionSet;
import com.vk.dto.user.UserProfile;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.newsfeed.api.stats.NewsEntryEventItem;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;
import com.vk.newsfeed.impl.postmodal.ModalPostCommonFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.MainActivity;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;

/* compiled from: VkPostsBridge.kt */
/* loaded from: classes7.dex */
public final class pdv0 implements rtc0 {
    public static final pdv0 a = new pdv0();

    /* compiled from: VkPostsBridge.kt */
    public static final class a extends k1e {
        public NewsEntry m;
        public String n;

        public a(int i) {
            super(PostFragment.class, null, null);
            o25.a().N();
        }

        @Override // xsna.k1e
        public final k1e A(int i) {
            this.j.putInt("tag_id", i);
            return this;
        }

        @Override // xsna.k1e
        public final k1e B(String str) {
            this.j.putString("track_code", str);
            return this;
        }

        public final k1e C() {
            NewsEntryEventItem a;
            this.g = ModalPostCommonFragment.class;
            Bundle bundle = this.j;
            bundle.putBoolean("is_time_spent_tracker_enabled", false);
            NewsEntry newsEntry = this.m;
            if (newsEntry != null && (a = ma60.a(newsEntry)) != null) {
                bundle.putParcelable("news_entry_event_item", a);
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void D(NewsEntry newsEntry, boolean z) {
            Owner s;
            this.m = newsEntry;
            Bundle bundle = this.j;
            if (z) {
                bundle.putParcelable("entry", newsEntry);
            } else {
                Serializer.c<NewsfeedData> cVar = NewsfeedData.CREATOR;
                bundle.putLong("entry_key", NewsfeedData.a.d(newsEntry));
            }
            UserId userId = null;
            l490 l490Var = newsEntry instanceof l490 ? (l490) newsEntry : null;
            if (l490Var != null && (s = l490Var.s()) != null) {
                userId = s.b;
            }
            int n = di60.n(newsEntry);
            if (userId != null && n != 0) {
                bundle.putString("entry_content_id", newsEntry.Bb());
            }
            if (newsEntry instanceof Videos) {
                bundle.putBoolean("load_as_videos", true);
            } else if (newsEntry instanceof Photos) {
                bundle.putBoolean("load_as_photos", true);
            } else if (newsEntry instanceof Post) {
                bundle.putSerializable("post_from", ((Post) newsEntry).Y);
            }
            bundle.putInt("entry_type", newsEntry.zb());
            if ((newsEntry instanceof Post) && ((Post) newsEntry).Y == Post.SourceFrom.Discover) {
                bundle.putBoolean("no_bottom_navigation", true);
            }
        }

        public final k1e E() {
            this.j.putBoolean("scroll_to_comments", true);
            return this;
        }

        public final k1e F(int i) {
            this.j.putInt("arg_start_comment_id", i);
            return this;
        }

        public final k1e G(int i) {
            this.j.putInt("ModalPostCommonFragment.destination", i);
            return this;
        }

        public final k1e H() {
            this.j.putBoolean("ModalPostCommonFragment.isModalReactionsForceDarkTheme", true);
            return this;
        }

        public final k1e I(UserProfile userProfile) {
            this.j.putParcelable("placer_profile", userProfile);
            return this;
        }

        public final k1e J(String str) {
            this.n = str;
            this.j.putString("referrer", str);
            return this;
        }

        public final k1e K(boolean z) {
            this.j.putBoolean("BottomSheetCommentsFragment.show_close_icon", z);
            return this;
        }

        public final k1e L(boolean z) {
            this.j.putBoolean("show_likes_info", z);
            return this;
        }

        public final void M(VideoFile videoFile, boolean z) {
            Serializer.c<Videos> cVar = Videos.CREATOR;
            Videos a = Videos.a.a(videoFile);
            VideoAttachment Nb = a.Nb();
            VideoFile videoFile2 = Nb != null ? Nb.k : null;
            String C1 = videoFile2 != null ? videoFile2.C1() : null;
            Bundle bundle = this.j;
            bundle.putString("access_key", C1);
            D(a, z);
            bundle.putBoolean("arg_show_only_comments", z);
            boolean z2 = false;
            if (videoFile2 != null && videoFile2.C2()) {
                z2 = true;
            }
            bundle.putBoolean("load_as_short_videos", z2);
        }

        @Override // xsna.oz50
        public final boolean p() {
            Bundle bundle = this.j;
            return bundle.containsKey("entry_key") || bundle.getParcelable("entry") != null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
        
            if (r1.longValue() != r6) goto L40;
         */
        @Override // xsna.oz50
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void r(Intent intent) {
            SchemeStat$EventItem schemeStat$EventItem;
            NewsEntry newsEntry = this.m;
            Post post = newsEntry instanceof Post ? (Post) newsEntry : null;
            if (post == null) {
                return;
            }
            UserId userId = post.m;
            String str = this.n;
            boolean z = true;
            boolean z2 = epx.f(str, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.FEED_TOP)) || epx.f(str, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.FEED_RECENT));
            boolean z3 = str == null || str.length() == 0;
            UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
            if ((uiTrackingScreen != null ? uiTrackingScreen.a : null) == MobileOfficialAppsCoreNavStat$EventScreen.GROUP) {
                SchemeStat$EventItem schemeStat$EventItem2 = uiTrackingScreen.f;
                if ((schemeStat$EventItem2 != null ? schemeStat$EventItem2.d() : null) == SchemeStat$EventItem.Type.GROUP && (schemeStat$EventItem = uiTrackingScreen.f) != null) {
                    Long b = schemeStat$EventItem.b();
                    long j = userId.b;
                    if (b != null) {
                    }
                }
            }
            z = false;
            if (post.dc() || !fkq0.b(userId)) {
                return;
            }
            if (z2 || (z3 && !z)) {
                this.j.putBoolean("has_similar_posts_action_bar_button", false);
            }
        }

        @Override // xsna.k1e
        public final k1e y() {
            this.j.putString("access_key", null);
            return this;
        }

        @Override // xsna.k1e
        public final k1e z(PhotoTag photoTag) {
            this.j.putParcelableArrayList("friends_tags", e43.a(photoTag));
            return this;
        }
    }

    @Override // xsna.rtc0
    public final a a(VideoFile videoFile) {
        a aVar = new a(0);
        aVar.M(videoFile, false);
        return aVar;
    }

    @Override // xsna.rtc0
    public final a b(Photo photo) {
        Photo photo2;
        a aVar = new a(0);
        Serializer.c<Photos> cVar = Photos.CREATOR;
        Photos a2 = Photos.a.a(photo);
        PhotoAttachment Mb = a2.Mb();
        aVar.j.putString("access_key", (Mb == null || (photo2 = Mb.l) == null) ? null : photo2.v);
        aVar.D(a2, false);
        return aVar;
    }

    @Override // xsna.rtc0
    public final a c(NewsEntry newsEntry) {
        a aVar = new a(0);
        aVar.D(newsEntry, false);
        Bundle bundle = aVar.j;
        bundle.putBoolean("is_suggest_subscribe_allowed", true);
        if ((newsEntry instanceof Post) && ((Post) newsEntry).Y == Post.SourceFrom.Newsfeed) {
            bundle.putBoolean("is_time_spent_tracker_enabled", true);
        }
        return aVar;
    }

    @Override // xsna.rtc0
    public final a d(VideoFile videoFile) {
        a aVar = new a(0);
        aVar.M(videoFile, true);
        return aVar;
    }

    @Override // xsna.rtc0
    public final void e(c6z c6zVar, ReactionMeta reactionMeta, FragmentActivity fragmentActivity, String str) {
        boolean z = reactionMeta != null;
        if (c6zVar instanceof bss0) {
            Serializer.c<Videos> cVar = Videos.CREATOR;
            c6zVar = Videos.a.a(((bss0) c6zVar).t());
        }
        iuc0.b.f(fragmentActivity, new l6z(c6zVar, z, reactionMeta, str, null, "reactions_modal"), new av70(27), null);
    }

    @Override // xsna.rtc0
    public final void f(bss0 bss0Var, Context context, String str, String str2, l1k0 l1k0Var, udl udlVar) {
        ReactionSet s4;
        ReactionMeta reactionMeta = null;
        o2f0 o2f0Var = bss0Var instanceof o2f0 ? (o2f0) bss0Var : null;
        if (o2f0Var != null && (s4 = o2f0Var.s4()) != null) {
            reactionMeta = c2f0.d(s4, 0);
        }
        boolean z = !bss0Var.J();
        Serializer.c<Videos> cVar = Videos.CREATOR;
        iuc0.b.f(context, new l6z(Videos.a.a(bss0Var.t()), z, reactionMeta, str, str2, null), new u2k0(l1k0Var, 29), udlVar);
    }

    @Override // xsna.rtc0
    public final boolean g(FragmentActivity fragmentActivity) {
        Activity h = e3m.h(fragmentActivity);
        boolean z = (h == null || !h.isTaskRoot() || (h instanceof MainActivity)) ? false : true;
        NavigationDelegateActivity navigationDelegateActivity = h instanceof NavigationDelegateActivity ? (NavigationDelegateActivity) h : null;
        Integer valueOf = navigationDelegateActivity != null ? Integer.valueOf(navigationDelegateActivity.Y().b.n().p()) : null;
        return z && valueOf != null && valueOf.intValue() == 1;
    }
}
