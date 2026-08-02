package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.stories.entities.StorySharingInfo;
import com.vk.dto.user.UserProfile;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.log.L;
import com.vk.sharing.api.dto.RepostAttachmentInfo;
import com.vk.sharing.api.dto.WallRepostSettings;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vk.toggle.features.FeedFeatures;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.fax0;
import xsna.l7v;
import xsna.nax0;
import xsna.ozv;
import xsna.ukg;

/* compiled from: CommonShareBridge.kt */
/* loaded from: classes7.dex */
public final class jmg implements g7j0 {
    public static final jmg a = new jmg();

    /* compiled from: CommonShareBridge.kt */
    public static final class a implements hx2<fax0.a> {
        public final /* synthetic */ RepostAttachmentInfo b;
        public final /* synthetic */ Ref$ObjectRef<nax0> c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ boolean e;

        public a(RepostAttachmentInfo repostAttachmentInfo, Ref$ObjectRef<nax0> ref$ObjectRef, boolean z, boolean z2) {
            this.b = repostAttachmentInfo;
            this.c = ref$ObjectRef;
            this.d = z;
            this.e = z2;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [T, xsna.nax0$b] */
        @Override // xsna.hx2
        public final void b(fax0.a aVar) {
            UserId userId;
            fax0.a aVar2 = aVar;
            RepostAttachmentInfo repostAttachmentInfo = this.b;
            int i = repostAttachmentInfo != null ? (int) repostAttachmentInfo.d : 0;
            if (repostAttachmentInfo != null) {
                long j = repostAttachmentInfo.c;
                gzs<s3q0> gzsVar = fkq0.a;
                userId = new UserId(j);
            } else {
                userId = UserId.d;
            }
            UserId userId2 = userId;
            this.c.element = new nax0.b(aVar2.a, userId2);
            ce60.b.getClass();
            p870.f().e(ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, new u0q(i, userId2, aVar2.b, aVar2.c, aVar2.d, this.d, this.e));
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, xsna.nax0$a] */
        @Override // xsna.hx2
        public final void e(VKApiExecutionException vKApiExecutionException) {
            this.c.element = new nax0.a(vKApiExecutionException);
            L.G("SharingBridge.WallRepost", vKApiExecutionException.toString());
        }
    }

    @Override // xsna.g7j0
    public final com.vk.im.ui.views.avatars.a a(Context context, String str) {
        com.vk.im.ui.views.avatars.a aVar = new com.vk.im.ui.views.avatars.a(context, null, 6);
        aVar.c(str, Peer.Type.CONTACT);
        return aVar;
    }

    @Override // xsna.g7j0
    public final com.vk.im.ui.views.avatars.a b(Context context, long j, String str) {
        com.vk.im.ui.views.avatars.a aVar = new com.vk.im.ui.views.avatars.a(context, null, 6);
        aVar.b(j, str, null);
        return aVar;
    }

    @Override // xsna.g7j0
    public final ozv.a c(Group group) {
        ozv.a.getClass();
        return new ozv.a(group);
    }

    @Override // xsna.g7j0
    public final void d(Activity activity, View view, StorySharingInfo storySharingInfo) {
        Hint c;
        com.vk.dto.hints.a a2;
        String id = HintId.INFO_BUBBLE_STORIES_SHARING.getId();
        Hint p = pla.e().b().p(id);
        if (p == null) {
            p = new Hint(id, null, null, null, 8, null);
        }
        String str = p.d;
        if (str == null || str.length() == 0) {
            Hint hint = new Hint(id, null, storySharingInfo.i, null, 8, null);
            ukg.a aVar = pla.e().b().a;
            com.vk.dto.hints.a a3 = aVar.a();
            if (a3 != null && (c = a3.c(id)) != null && (a2 = aVar.a()) != null) {
                com.vk.dto.hints.a a4 = a2.a(c);
                a4.b.add(hint);
                aVar.b(a4);
            }
            p = hint;
        }
        Rect d = w11.d(view);
        l7v b = pla.e().b();
        b.getClass();
        l7v.b bVar = new l7v.b(id, b, d);
        bVar.i = true;
        bVar.n(activity, p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, xsna.nax0$a] */
    /* JADX WARN: Type inference failed for: r4v6, types: [xsna.v9x0] */
    /* JADX WARN: Type inference failed for: r4v8, types: [xsna.rsg0] */
    /* JADX WARN: Type inference failed for: r4v9, types: [xsna.i860, xsna.j960, xsna.rsg0] */
    @Override // xsna.g7j0
    public final nax0 e(UserId userId, RepostAttachmentInfo repostAttachmentInfo, WallRepostSettings wallRepostSettings, String str, String str2, String str3, boolean z, boolean z2) {
        boolean z3;
        ?? v9x0Var;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        UiTrackingScreen b = UiTracker.j.b();
        String a2 = (b == null || (mobileOfficialAppsCoreNavStat$EventScreen = b.a) == null) ? null : com.vk.stat.scheme.t0.a(mobileOfficialAppsCoreNavStat$EventScreen);
        FeedFeatures feedFeatures = FeedFeatures.WALL_POST_ROLLBACK;
        feedFeatures.getClass();
        if (com.vk.toggle.b.A.a(feedFeatures)) {
            v9x0Var = new j960();
            v9x0Var.K0(a2);
            if (fkq0.c(userId)) {
                v9x0Var.F(userId, "owner_id");
            }
            v9x0Var.K("message", str);
            v9x0Var.C(1, "from_group");
            v9x0Var.K("signed", "1");
            String d = repostAttachmentInfo != null ? repostAttachmentInfo.d() : null;
            if (d == null) {
                d = "";
            }
            v9x0Var.K("attachments", d);
            if (str2 != null) {
                String str4 = str2.length() > 0 ? str2 : null;
                if (str4 != null && str4.length() > 0) {
                    v9x0Var.K("track_code", str4);
                }
            }
            if (str3 != null) {
                v9x0Var.K("ref", str3);
            }
            if (wallRepostSettings != null && wallRepostSettings.b) {
                v9x0Var.C(1, "friends_only");
            }
            if (wallRepostSettings != null && wallRepostSettings.f) {
                v9x0Var.K("mute_notifications", "1");
            }
            if (wallRepostSettings != null && wallRepostSettings.e) {
                i860.H0(v9x0Var);
            }
        } else {
            List N = nr2.N(repostAttachmentInfo != null ? repostAttachmentInfo.d() : null);
            Boolean bool = Boolean.TRUE;
            boolean z4 = false;
            boolean z5 = wallRepostSettings != null && wallRepostSettings.b;
            if (wallRepostSettings == null || !wallRepostSettings.e) {
                z3 = false;
            } else {
                z3 = false;
                z4 = true;
            }
            if (wallRepostSettings != null && wallRepostSettings.f) {
                z3 = true;
            }
            v9x0Var = new v9x0(new bax0(userId, str, N, bool, bool, false, z5, false, z4, z3, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, a2, str3, (str2 == null || str2.length() <= 0) ? null : str2, null, null, null, null, null, false, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, -939524960, 524287));
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = new nax0.a(null);
        new jx2(v9x0Var, new img(ref$ObjectRef, z2, z)).b();
        return (nax0) ref$ObjectRef.element;
    }

    @Override // xsna.g7j0
    public final UserProfile f(qtd0 qtd0Var) {
        return ozv.d(qtd0Var, false);
    }

    @Override // xsna.g7j0
    public final boolean g(String str) {
        return naz.A(str);
    }

    @Override // xsna.g7j0
    public final void h(FragmentActivity fragmentActivity, MusicTrack musicTrack) {
        com.vk.storycamera.builder.a aVar = new com.vk.storycamera.builder.a("STORY_VIEWER", MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.MUSIC_COVER_SHARING.toString().toLowerCase(Locale.ROOT));
        aVar.W = false;
        aVar.k0 = musicTrack;
        aVar.C(fragmentActivity);
    }

    @Override // xsna.g7j0
    public final String i(Dialog dialog, ProfilesSimpleInfo profilesSimpleInfo) {
        ozv.a.getClass();
        wqo0 wqo0Var = ozv.d;
        qcy<Object> qcyVar = ozv.b[0];
        wqo0Var.getClass();
        return ((DisplayNameFormatter) wqo0Var.get()).d(dialog, profilesSimpleInfo);
    }

    @Override // xsna.g7j0
    public final void j(Activity activity, Playlist playlist, NewsEntry newsEntry) {
        s21.A("ads/music_playlist_share_to_story", newsEntry);
        StorySharingInfo B = f370.B(playlist);
        com.vk.storycamera.builder.a aVar = new com.vk.storycamera.builder.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER, MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.MUSIC_COVER_SHARING);
        aVar.W = false;
        aVar.i = B;
        aVar.q0 = playlist;
        aVar.C(activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [T, xsna.nax0$a] */
    @Override // xsna.g7j0
    public final nax0 k(UserId userId, RepostAttachmentInfo repostAttachmentInfo, WallRepostSettings wallRepostSettings, String str, String str2, String str3, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        String d = repostAttachmentInfo != null ? repostAttachmentInfo.d() : null;
        if (d == null) {
            d = "";
        }
        UserId.b bVar = UserId.c;
        UiTrackingScreen b = UiTracker.j.b();
        String a2 = (b == null || (mobileOfficialAppsCoreNavStat$EventScreen = b.a) == null) ? null : com.vk.stat.scheme.t0.a(mobileOfficialAppsCoreNavStat$EventScreen);
        boolean z5 = false;
        if (wallRepostSettings != null) {
            boolean z6 = wallRepostSettings.b;
            z4 = wallRepostSettings.e;
            z3 = wallRepostSettings.f;
            z5 = z6;
        } else {
            z3 = false;
            z4 = false;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = new nax0.a(null);
        fax0 fax0Var = new fax0("wall.repost");
        fax0Var.K("object", d);
        fax0Var.K("message", str);
        if (userId.b != 0) {
            fax0Var.F(fkq0.e(userId), "group_id");
        }
        if (!TextUtils.isEmpty(str2)) {
            fax0Var.K("ref", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            fax0Var.K("track_code", str3);
        }
        TextUtils.isEmpty(null);
        if (z5) {
            fax0Var.C(1, "friends_only");
        }
        if (z4) {
            fax0Var.C(1, "close_comments");
        }
        if (z3) {
            fax0Var.C(1, "mute_notifications");
        }
        if (TextUtils.isEmpty(a2) || a2.equals(com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE))) {
            com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException("Posting entryPoint screen is not set for UiTracker"));
        } else {
            fax0Var.K("entry_point", a2);
        }
        new jx2(fax0Var, new a(repostAttachmentInfo, ref$ObjectRef, z, z2)).b();
        return (nax0) ref$ObjectRef.element;
    }

    @Override // xsna.g7j0
    public final ozv.b l(UserProfile userProfile) {
        ozv.a.getClass();
        return new ozv.b(userProfile, Peer.Type.USER);
    }

    @Override // xsna.g7j0
    public final String m(Dialog dialog, ProfilesSimpleInfo profilesSimpleInfo) {
        return ozv.b(dialog, profilesSimpleInfo);
    }
}
