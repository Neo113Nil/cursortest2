package xsna;

import android.os.Bundle;
import android.os.Parcelable;
import com.vk.comments.core.BoardComment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.Poster;
import com.vk.dto.posting.DonutPostingSettings;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.impl.posting.dto.BoardCommentNewsEntry;
import com.vk.newsfeed.impl.posting.dto.MarketCommentNewsEntry;
import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: PostingArgumentsHelper.kt */
/* loaded from: classes4.dex */
public final class sbc0 {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final int I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final DonutPostingSettings N;
    public final String O;
    public final UserId P;
    public final boolean Q;
    public final int R;
    public final PostingVisibilityMode S;
    public final String T;
    public final boolean U;
    public final boolean V;
    public final boolean W;
    public final boolean X;
    public final boolean Y;
    public final boolean Z;
    public final jko0 a;
    public final boolean a0;
    public final ikc0 b;
    public final boolean b0;
    public final sxu c;
    public final boolean c0;
    public final scc0 d;
    public final boolean d0;
    public final UserId e;
    public final boolean e0;
    public final UserId f;
    public final boolean f0;
    public final boolean g;
    public final boolean g0;
    public final Group h;
    public final boolean h0;
    public final boolean i;
    public final boolean i0;
    public final boolean j;
    public final long j0;
    public final boolean k;
    public final d02 k0;
    public final String l;
    public final Parcelable[] m;
    public final String n;
    public final ArrayList<String> o;
    public final Long p;
    public final NewsEntry q;
    public final BoardComment r;
    public final Poster s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final Integer z;

    public sbc0(Bundle bundle, jko0 jko0Var, ikc0 ikc0Var, sxu sxuVar, scc0 scc0Var) {
        Group group;
        Poster poster;
        this.a = jko0Var;
        this.b = ikc0Var;
        this.c = sxuVar;
        this.d = scc0Var;
        UserId userId = (UserId) bundle.getParcelable("uid");
        this.e = userId == null ? UserId.d : userId;
        UserId userId2 = (UserId) bundle.getParcelable("additionalAuthorGroupId");
        userId2 = userId2 == null ? UserId.d : userId2;
        this.f = userId2;
        boolean z = bundle.getBoolean("group_is_admin", false);
        this.g = z;
        PostingVisibilityMode postingVisibilityMode = null;
        if (fkq0.c(userId2)) {
            group = new Group();
            group.c = userId2;
            group.d = bundle.getString("group_title", "");
            group.e = bundle.getString("group_photo", "");
            group.i = z;
            group.s = bundle.getInt("admin_level", 0);
            group.P = bundle.getBoolean("can_post_donut", false);
            group.n0 = bundle.getBoolean("group_photo_is_nft", false);
        } else {
            group = null;
        }
        this.h = group;
        this.i = bundle.getBoolean("suggest", false);
        this.j = bundle.getBoolean("activeSign", false);
        this.k = bundle.getBoolean("shareSuggestedPhoto", false);
        this.l = bundle.getString("text", "");
        this.m = bundle.containsKey("attachments") ? bundle.getParcelableArray("attachments") : new Parcelable[0];
        this.n = bundle.getString("photoURI", "");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("photos");
        this.o = stringArrayList == null ? new ArrayList<>() : stringArrayList;
        this.p = bundle.containsKey("draft") ? Long.valueOf(bundle.getLong("draft")) : null;
        NewsEntry newsEntry = (NewsEntry) bundle.getParcelable("newsEntry");
        this.q = newsEntry;
        this.r = newsEntry instanceof BoardCommentNewsEntry ? ((BoardCommentNewsEntry) newsEntry).n : newsEntry instanceof MarketCommentNewsEntry ? ((MarketCommentNewsEntry) newsEntry).m : null;
        boolean z2 = newsEntry instanceof Post;
        Post post = z2 ? (Post) newsEntry : null;
        this.s = (post == null || (poster = post.M) == null) ? (Poster) bundle.getParcelable("poster") : poster;
        this.t = bundle.getBoolean("authorOnlyGroup", false);
        this.u = bundle.getBoolean("initialAuthorGroup", false);
        this.v = bundle.getBoolean("withoutAuthorChange", false);
        this.w = bundle.getBoolean("withoutVisibilityChange", false);
        this.x = bundle.getBoolean("withoutPostpone", false);
        this.y = bundle.getBoolean("withoutSign", false);
        this.z = bundle.containsKey("attachmentsCount") ? Integer.valueOf(bundle.getInt("attachmentsCount", 0)) : null;
        this.A = bundle.getBoolean("commentsClosed", false);
        this.B = bundle.getBoolean("canCloseComments", false);
        this.C = bundle.getBoolean(SignalingProtocol.KEY_CAMERA, false);
        this.D = bundle.getBoolean("imPhoto", false);
        this.E = bundle.getBoolean("imVideo", false);
        this.F = bundle.getBoolean("imAudio", false);
        this.G = bundle.getBoolean("imPlace", false);
        this.H = bundle.getBoolean("imPoster", false);
        this.I = bundle.getInt("fromSituationalSuggest", -1);
        this.J = bundle.getBoolean("alertIfOriginalPost", false);
        this.K = bundle.getBoolean("posterAllowed", false);
        this.L = bundle.getBoolean("copyrightAllowed", false);
        Post post2 = z2 ? (Post) newsEntry : null;
        if (post2 != null) {
            Flags flags = post2.l;
        }
        this.M = bundle.getBoolean("paywallDisabled", true);
        this.N = (DonutPostingSettings) bundle.getParcelable("donutEditingSettings");
        this.O = bundle.getString("donutEditMode");
        bundle.getInt("requestId");
        UserId userId3 = (UserId) bundle.getParcelable("authorId");
        this.P = userId3 == null ? UserId.d : userId3;
        this.Q = bundle.getBoolean("draftAllowed", true);
        this.R = bundle.getInt("characterLimit");
        int i = bundle.getInt("visibilityMode", -1);
        if (i >= 0) {
            PostingVisibilityMode.Companion.getClass();
            postingVisibilityMode = PostingVisibilityMode.a.a(i);
        }
        this.S = postingVisibilityMode;
        this.T = bundle.getString("ref", "");
        this.U = bundle.getBoolean("fromPlusNavigate", false);
        this.V = bundle.getBoolean("withoutPhoto", false);
        this.W = bundle.getBoolean("withoutVideo", false);
        this.X = bundle.getBoolean("withoutAudio", false);
        this.Y = bundle.getBoolean("withoutDocument", false);
        this.Z = bundle.getBoolean("withoutLocation", false);
        this.a0 = bundle.getBoolean("withoutPoll", false);
        this.b0 = bundle.getBoolean("withoutGood", false);
        this.c0 = bundle.getBoolean("withoutService", false);
        this.d0 = bundle.getBoolean("withoutArticle", false);
        this.e0 = bundle.getBoolean("withoutAlbum", false);
        this.f0 = bundle.getBoolean("withoutSettings", false);
        this.g0 = bundle.getBoolean("open_from_group");
        this.h0 = bundle.getBoolean(BuildConfig.SDK_BUILD_FLAVOR);
        this.i0 = bundle.getBoolean("postingSuccessToastRequired", true);
        this.j0 = bundle.getLong("post_at_time", 0L);
        this.k0 = new d02();
    }

    public final boolean a() {
        NewsEntry newsEntry;
        if (this.l.length() != 0 || this.m.length != 0 || this.n.length() != 0 || !this.o.isEmpty() || this.r != null || (newsEntry = this.q) != null) {
            return false;
        }
        Post post = newsEntry instanceof Post ? (Post) newsEntry : null;
        return (post != null ? post.M : null) == null;
    }
}
