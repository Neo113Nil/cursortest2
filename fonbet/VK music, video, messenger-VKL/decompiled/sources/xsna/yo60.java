package xsna;

import android.content.Context;
import android.view.View;
import com.vk.dto.badges.Badgeable;
import com.vk.dto.common.Good;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.activities.Comment;
import com.vk.dto.newsfeed.entries.Digest;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.user.UserProfile;
import com.vk.fave.entities.FaveSource;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.newsfeed.presentation.model.ActionButtonType;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: NewsfeedListEvent.kt */
/* loaded from: classes4.dex */
public interface yo60 extends pk50 {

    /* compiled from: NewsfeedListEvent.kt */
    public interface a extends yo60 {

        /* compiled from: NewsfeedListEvent.kt */
        /* renamed from: xsna.yo60$a$a, reason: collision with other inner class name */
        public static final class C4113a implements a {
            public final View a;
            public final NewsEntry b;
            public final String c;
            public final MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint.EntryPoint d;

            public C4113a(View view, NewsEntry newsEntry, String str, MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint.EntryPoint entryPoint) {
                this.a = view;
                this.b = newsEntry;
                this.c = str;
                this.d = entryPoint;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C4113a)) {
                    return false;
                }
                C4113a c4113a = (C4113a) obj;
                return epx.f(this.a, c4113a.a) && epx.f(this.b, c4113a.b) && epx.f(this.c, c4113a.c) && this.d == c4113a.d;
            }

            public final int hashCode() {
                int b = e630.b(this.a.hashCode() * 31, 31, this.b);
                String str = this.c;
                return this.d.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                return "ToggleSubscription(anchor=" + this.a + ", entry=" + this.b + ", ref=" + this.c + ", followClickEntryPoint=" + this.d + ')';
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        public static final class b implements a {
            public final View a;
            public final Context b;
            public final NewsEntry c;
            public final String d;
            public final MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint.EntryPoint e;

            public b(View view, Context context, NewsEntry newsEntry, String str, MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint.EntryPoint entryPoint) {
                this.a = view;
                this.b = context;
                this.c = newsEntry;
                this.d = str;
                this.e = entryPoint;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && this.e == bVar.e;
            }

            public final int hashCode() {
                int b = e630.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
                String str = this.d;
                return this.e.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                return "ToggleSubscriptionWithConfirmation(anchor=" + this.a + ", context=" + this.b + ", entry=" + this.c + ", refer=" + this.d + ", followClickEntryPoint=" + this.e + ')';
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        public static final class c implements a {
            public final Context a;
            public final NewsEntry b;
            public final String c;
            public final MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint.EntryPoint d;
            public final ActionButtonType e;

            public c(Context context, NewsEntry newsEntry, String str, MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint.EntryPoint entryPoint, ActionButtonType actionButtonType) {
                this.a = context;
                this.b = newsEntry;
                this.c = str;
                this.d = entryPoint;
                this.e = actionButtonType;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && this.d == cVar.d && this.e == cVar.e;
            }

            public final int hashCode() {
                int b = e630.b(this.a.hashCode() * 31, 31, this.b);
                String str = this.c;
                return this.e.hashCode() + ((this.d.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31)) * 31);
            }

            public final String toString() {
                return "ToggleSubscriptionWithoutDialog(context=" + this.a + ", entry=" + this.b + ", ref=" + this.c + ", followClickEntryPoint=" + this.d + ", actionButtonType=" + this.e + ')';
            }
        }
    }

    /* compiled from: NewsfeedListEvent.kt */
    public static final class b implements yo60 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 2003853012;
        }

        public final String toString() {
            return "ActivateRecyclerAnimation";
        }
    }

    /* compiled from: NewsfeedListEvent.kt */
    public interface c extends yo60 {

        /* compiled from: NewsfeedListEvent.kt */
        public static abstract class a implements c {

            /* compiled from: NewsfeedListEvent.kt */
            /* renamed from: xsna.yo60$c$a$a, reason: collision with other inner class name */
            public static final class C4114a extends a {
                public final NewsEntry a;
                public final Integer b;

                public C4114a(NewsEntry newsEntry, Integer num) {
                    this.a = newsEntry;
                    this.b = num;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C4114a)) {
                        return false;
                    }
                    C4114a c4114a = (C4114a) obj;
                    return epx.f(this.a, c4114a.a) && epx.f(this.b, c4114a.b);
                }

                public final int hashCode() {
                    int hashCode = this.a.hashCode() * 31;
                    Integer num = this.b;
                    return hashCode + (num == null ? 0 : num.hashCode());
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("CopyAdMarker(ad=");
                    sb.append(this.a);
                    sb.append(", listItemPosition=");
                    return uqi.b(sb, this.b, ')');
                }
            }

            /* compiled from: NewsfeedListEvent.kt */
            public static final class b extends a {
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    ((b) obj).getClass();
                    throw null;
                }

                public final int hashCode() {
                    throw null;
                }

                public final String toString() {
                    throw null;
                }
            }

            /* compiled from: NewsfeedListEvent.kt */
            /* renamed from: xsna.yo60$c$a$c, reason: collision with other inner class name */
            public static final class C4115c extends a {
                public final NewsEntry a;
                public final Integer b;

                public C4115c(NewsEntry newsEntry, Integer num) {
                    this.a = newsEntry;
                    this.b = num;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C4115c)) {
                        return false;
                    }
                    C4115c c4115c = (C4115c) obj;
                    return epx.f(this.a, c4115c.a) && epx.f(this.b, c4115c.b);
                }

                public final int hashCode() {
                    int hashCode = this.a.hashCode() * 31;
                    Integer num = this.b;
                    return hashCode + (num == null ? 0 : num.hashCode());
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("ShowAdvertiserInfo(ad=");
                    sb.append(this.a);
                    sb.append(", listItemPosition=");
                    return uqi.b(sb, this.b, ')');
                }
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        public static abstract class b implements c {

            /* compiled from: NewsfeedListEvent.kt */
            public static final class a extends b {
                public final Digest a;

                public a(Digest digest) {
                    this.a = digest;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "Hide(digest=" + this.a + ')';
                }
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        /* renamed from: xsna.yo60$c$c, reason: collision with other inner class name */
        public static abstract class AbstractC4116c implements c {

            /* compiled from: NewsfeedListEvent.kt */
            /* renamed from: xsna.yo60$c$c$a */
            public static final class a extends AbstractC4116c {
                public final NewsEntry a;
                public final int b;

                public a(int i, NewsEntry newsEntry) {
                    this.a = newsEntry;
                    this.b = i;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return epx.f(this.a, aVar.a) && this.b == aVar.b;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Hide(entry=");
                    sb.append(this.a);
                    sb.append(", listItemPosition=");
                    return vu5.b(sb, this.b, ')');
                }
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        public static abstract class d implements c {

            /* compiled from: NewsfeedListEvent.kt */
            public static final class a extends d {
                public static final a a = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return -1504134381;
                }

                public final String toString() {
                    return "EditBestFriendsList";
                }
            }
        }
    }

    /* compiled from: NewsfeedListEvent.kt */
    public static abstract class d implements yo60 {

        /* compiled from: NewsfeedListEvent.kt */
        public static final class a extends d {
            public final UserId a;
            public final boolean b = true;

            public a(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && this.b == aVar.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ReloadProfile(ownerId=");
                sb.append(this.a);
                sb.append(", pinnedToggled=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }
    }

    /* compiled from: NewsfeedListEvent.kt */
    public static abstract class e implements yo60 {

        /* compiled from: NewsfeedListEvent.kt */
        public static final class a extends e {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1815940639;
            }

            public final String toString() {
                return "HideLoadingDialog";
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        public static final class b extends e {
            public final String a;

            public b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("ShowAdsDebugInfo(debugData="), this.a, ')');
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        public static final class c extends e {
        }

        /* compiled from: NewsfeedListEvent.kt */
        public static final class d extends e {
            public final Post a;

            public d(Post post) {
                this.a = post;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "ShowDonutFreeCopyWarning(post=" + this.a + ')';
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        /* renamed from: xsna.yo60$e$e, reason: collision with other inner class name */
        public static final class C4117e extends e {
            public final View a;
            public final NewsEntry b;
            public final NewsEntry c;
            public final int d;
            public final s1c0 e;

            public C4117e(View view, NewsEntry newsEntry, NewsEntry newsEntry2, int i, s1c0 s1c0Var) {
                this.a = view;
                this.b = newsEntry;
                this.c = newsEntry2;
                this.d = i;
                this.e = s1c0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C4117e)) {
                    return false;
                }
                C4117e c4117e = (C4117e) obj;
                return epx.f(this.a, c4117e.a) && epx.f(this.b, c4117e.b) && epx.f(this.c, c4117e.c) && this.d == c4117e.d && epx.f(this.e, c4117e.e);
            }

            public final int hashCode() {
                int b = e630.b(this.a.hashCode() * 31, 31, this.b);
                NewsEntry newsEntry = this.c;
                return this.e.hashCode() + shy.a(this.d, (b + (newsEntry == null ? 0 : newsEntry.hashCode())) * 31, 31);
            }

            public final String toString() {
                return "ShowItemMenu(view=" + this.a + ", item=" + this.b + ", root=" + this.c + ", listItemPosition=" + this.d + ", displayContext=" + this.e + ')';
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        public static final class f extends e {
            public final long a = 300;
            public final io.reactivex.rxjava3.disposables.c b;

            public f(io.reactivex.rxjava3.disposables.c cVar) {
                this.b = cVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return this.a == fVar.a && epx.f(this.b, fVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (Long.hashCode(this.a) * 31);
            }

            public final String toString() {
                return "ShowLoadingDialog(delay=" + this.a + ", disposable=" + this.b + ')';
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        public static final class g extends e {
            public static final g a = new g();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return -74615420;
            }

            public final String toString() {
                return "ShowNotLoggedInDialog";
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        public static final class h extends e {
            public final Post a;
            public final LinkedHashMap b;

            public h(Post post, LinkedHashMap linkedHashMap) {
                this.a = post;
                this.b = linkedHashMap;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return epx.f(this.a, hVar.a) && epx.f(this.b, hVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "ShowPostBanSourcesSelectionDialog(post=" + this.a + ", sources=" + this.b + ')';
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        public static final class i extends e {
            public final NewsEntry a;

            public i(NewsEntry newsEntry) {
                this.a = newsEntry;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && epx.f(this.a, ((i) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ck70.a(new StringBuilder("ShowRemovalDialog(entry="), this.a, ')');
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        public static final class j extends e {
            public final Post a;
            public final CharSequence b;

            public j(Post post, CharSequence charSequence) {
                this.a = post;
                this.b = charSequence;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return epx.f(this.a, jVar.a) && epx.f(this.b, jVar.b);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                CharSequence charSequence = this.b;
                return hashCode + (charSequence == null ? 0 : charSequence.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ShowRepostEditorDialog(post=");
                sb.append(this.a);
                sb.append(", text=");
                return thl0.a(sb, this.b, ')');
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        public static final class k extends e {
            public final NewsEntry a;

            public k(NewsEntry newsEntry) {
                this.a = newsEntry;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k) && epx.f(this.a, ((k) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ck70.a(new StringBuilder("ShowSubscriptionSuggestionSnackbar(entry="), this.a, ')');
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        public static final class l extends e {
            public final f.s a;

            public l(f.s sVar) {
                this.a = sVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof l) && epx.f(this.a, ((l) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "ShowTrendingPostWarning(sideEffect=" + this.a + ')';
            }
        }
    }

    /* compiled from: NewsfeedListEvent.kt */
    public interface f extends yo60 {

        /* compiled from: NewsfeedListEvent.kt */
        public interface a extends f {

            /* compiled from: NewsfeedListEvent.kt */
            /* renamed from: xsna.yo60$f$a$a, reason: collision with other inner class name */
            public static final class C4118a implements a {
                public final NewsEntry a;
                public final Comment b;
                public final String c;
                public final int d;
                public final qr80 e;

                public C4118a(NewsEntry newsEntry, Comment comment, String str, int i, qr80 qr80Var) {
                    this.a = newsEntry;
                    this.b = comment;
                    this.c = str;
                    this.d = i;
                    this.e = qr80Var;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C4118a)) {
                        return false;
                    }
                    C4118a c4118a = (C4118a) obj;
                    return epx.f(this.a, c4118a.a) && epx.f(this.b, c4118a.b) && epx.f(this.c, c4118a.c) && this.d == c4118a.d && epx.f(this.e, c4118a.e);
                }

                public final int hashCode() {
                    int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
                    String str = this.c;
                    int a = shy.a(this.d, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
                    qr80 qr80Var = this.e;
                    return a + (qr80Var != null ? qr80Var.hashCode() : 0);
                }

                public final String toString() {
                    return "OpenComment(entry=" + this.a + ", comment=" + this.b + ", refer=" + this.c + ", commentId=" + this.d + ", entryPoint=" + this.e + ')';
                }
            }

            /* compiled from: NewsfeedListEvent.kt */
            public static final class b implements a {
                public final UserId a;
                public final int b;
                public final NewsfeedRouter.a c;

                public b(UserId userId, int i, NewsfeedRouter.a aVar) {
                    this.a = userId;
                    this.b = i;
                    this.c = aVar;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return epx.f(this.a, bVar.a) && this.b == bVar.b && this.c.equals(bVar.c);
                }

                public final int hashCode() {
                    return this.c.hashCode() + shy.a(0, shy.a(this.b, Long.hashCode(this.a.b) * 31, 31), 31);
                }

                public final String toString() {
                    return "OpenCommentThread(ownerId=" + this.a + ", itemId=" + this.b + ", type=0, options=" + this.c + ')';
                }
            }

            /* compiled from: NewsfeedListEvent.kt */
            public static final class c implements a {
                public final o3y0 a;

                public c(o3y0 o3y0Var) {
                    this.a = o3y0Var;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "OpenWritebarOverlay(options=" + this.a + ')';
                }
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        public static final class b implements f {
            public final NewsfeedExternalAction.Navigation a;

            public b(NewsfeedExternalAction.Navigation navigation) {
                this.a = navigation;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "External(effect=" + this.a + ')';
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        public interface c extends f {

            /* compiled from: NewsfeedListEvent.kt */
            public static final class a implements c {
                public final Good a;
                public final NewsEntry b;

                public a(Good good, NewsEntry newsEntry) {
                    this.a = good;
                    this.b = newsEntry;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("AddToCart(good=");
                    sb.append(this.a);
                    sb.append(", entry=");
                    return ck70.a(sb, this.b, ')');
                }
            }

            /* compiled from: NewsfeedListEvent.kt */
            public static final class b implements c {
                public final Good a;
                public final CallProducerButton b;

                public b(Good good, CallProducerButton callProducerButton) {
                    this.a = good;
                    this.b = callProducerButton;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
                }

                public final int hashCode() {
                    int hashCode = this.a.hashCode() * 31;
                    CallProducerButton callProducerButton = this.b;
                    return hashCode + (callProducerButton == null ? 0 : callProducerButton.hashCode());
                }

                public final String toString() {
                    return "CallToOwner(good=" + this.a + ", button=" + this.b + ')';
                }
            }

            /* compiled from: NewsfeedListEvent.kt */
            /* renamed from: xsna.yo60$f$c$c, reason: collision with other inner class name */
            public static final class C4119c implements c {
                public final Good a;

                public C4119c(Good good) {
                    this.a = good;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C4119c) && epx.f(this.a, ((C4119c) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "OpenCart(good=" + this.a + ')';
                }
            }

            /* compiled from: NewsfeedListEvent.kt */
            public static final class d implements c {
                public final Good a;

                public d(Good good) {
                    this.a = good;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "OpenChatWithOwner(good=" + this.a + ')';
                }
            }

            /* compiled from: NewsfeedListEvent.kt */
            public static final class e implements c {
                public final Good a;
                public final String b;

                public e(Good good, String str) {
                    this.a = good;
                    this.b = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof e)) {
                        return false;
                    }
                    e eVar = (e) obj;
                    return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b);
                }

                public final int hashCode() {
                    int hashCode = this.a.hashCode() * 31;
                    String str = this.b;
                    return hashCode + (str == null ? 0 : str.hashCode());
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("OpenLink(good=");
                    sb.append(this.a);
                    sb.append(", href=");
                    return ho8.a(sb, this.b, ')');
                }
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        public static final class d implements f {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                ((d) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "OpenArticle(articleAttachment=null, trackCode=null, startTtsPlaying=false)";
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        public static final class e implements f {
            public final Badgeable a;

            public e(Badgeable badgeable) {
                this.a = badgeable;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "OpenBadges(badgeable=" + this.a + ')';
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        /* renamed from: xsna.yo60$f$f, reason: collision with other inner class name */
        public static final class C4120f implements f {
            public final UserId a;
            public final UserProfile b;

            public C4120f(UserId userId, UserProfile userProfile) {
                this.a = userId;
                this.b = userProfile;
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        public static final class g implements f {
            public final NewsEntry a;

            public g(NewsEntry newsEntry) {
                this.a = newsEntry;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ck70.a(new StringBuilder("OpenChatWithEntryAuthor(entry="), this.a, ')');
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        public static final class h implements f {
            public final VideoAttachment a;

            public h(VideoAttachment videoAttachment) {
                this.a = videoAttachment;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "OpenClipStats(clip=" + this.a + ')';
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        public static final class i implements f {
            public final NewsEntry a;
            public final String b;
            public final FaveSource c;

            public i(NewsEntry newsEntry, String str, FaveSource faveSource) {
                this.a = newsEntry;
                this.b = str;
                this.c = faveSource;
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        public static final class j implements f {
            public final NewsEntry a;
            public final NewsEntry b;
            public final int c;
            public final MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint d;

            public j(NewsEntry newsEntry, NewsEntry newsEntry2, int i, MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint entryPoint) {
                this.a = newsEntry;
                this.b = newsEntry2;
                this.c = i;
                this.d = entryPoint;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return epx.f(this.a, jVar.a) && epx.f(this.b, jVar.b) && this.c == jVar.c && this.d == jVar.d;
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                NewsEntry newsEntry = this.b;
                return this.d.hashCode() + shy.a(this.c, (hashCode + (newsEntry == null ? 0 : newsEntry.hashCode())) * 31, 31);
            }

            public final String toString() {
                return "OpenEntryProfile(entry=" + this.a + ", rootEntry=" + this.b + ", listItemPosition=" + this.c + ", feedOpenUserEntryPoint=" + this.d + ')';
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        public static final class k implements f {
            public final Post a;

            public k(Post post) {
                this.a = post;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k) && epx.f(this.a, ((k) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "OpenLegacyPostStats(post=" + this.a + ')';
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        public static final class l implements f {
            public final Post a;

            public l(Post post) {
                this.a = post;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof l) && epx.f(this.a, ((l) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "OpenPost(post=" + this.a + ')';
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        public static final class m implements f {
            public final Post a;

            public m(Post post) {
                this.a = post;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof m) && epx.f(this.a, ((m) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "OpenPostStats(post=" + this.a + ')';
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        public static final class n implements f {
            public final NewsEntry a;
            public final String b;
            public final String c;
            public final MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint d;
            public final NewsEntry e;

            public n(NewsEntry newsEntry, String str, String str2, MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint entryPoint, NewsEntry newsEntry2) {
                this.a = newsEntry;
                this.b = str;
                this.c = str2;
                this.d = entryPoint;
                this.e = newsEntry2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof n)) {
                    return false;
                }
                n nVar = (n) obj;
                return epx.f(this.a, nVar.a) && epx.f(this.b, nVar.b) && epx.f(this.c, nVar.c) && this.d == nVar.d && epx.f(this.e, nVar.e);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                String str = this.b;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.c;
                int hashCode3 = (this.d.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
                NewsEntry newsEntry = this.e;
                return hashCode3 + (newsEntry != null ? newsEntry.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenProfile(item=");
                sb.append(this.a);
                sb.append(", refer=");
                sb.append(this.b);
                sb.append(", trackCode=");
                sb.append(this.c);
                sb.append(", feedOpenUserEntryPoint=");
                sb.append(this.d);
                sb.append(", repostRootEntry=");
                return ck70.a(sb, this.e, ')');
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        public static final class o implements f {
            public final NewsEntry a;
            public final String b;

            public o(String str, NewsEntry newsEntry) {
                this.a = newsEntry;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof o)) {
                    return false;
                }
                o oVar = (o) obj;
                return epx.f(this.a, oVar.a) && epx.f(this.b, oVar.b);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                String str = this.b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenReportEntry(entry=");
                sb.append(this.a);
                sb.append(", ref=");
                return ho8.a(sb, this.b, ')');
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        public static final class p implements f {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof p)) {
                    return false;
                }
                ((p) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "OpenReportVideo(video=null, ref=null)";
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        public static final class q implements f {
            public final NewsEntry a;
            public final NewsEntry b;

            public q(NewsEntry newsEntry, NewsEntry newsEntry2) {
                this.a = newsEntry;
                this.b = newsEntry2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof q)) {
                    return false;
                }
                q qVar = (q) obj;
                return epx.f(this.a, qVar.a) && epx.f(this.b, qVar.b);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                NewsEntry newsEntry = this.b;
                return hashCode + (newsEntry == null ? 0 : newsEntry.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenSharing(entry=");
                sb.append(this.a);
                sb.append(", rootEntry=");
                return ck70.a(sb, this.b, ')');
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        public static final class r implements f {
            public final String a;

            public r(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof r) && epx.f(this.a, ((r) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("OpenUrl(url="), this.a, ')');
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        public interface s extends f {

            /* compiled from: NewsfeedListEvent.kt */
            public static final class a implements s {
                public static final a a = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return 1369727965;
                }

                public final String toString() {
                    return "EditBestFriendsList";
                }
            }

            /* compiled from: NewsfeedListEvent.kt */
            public static final class b implements s {
                public final Post a;
                public final PostingCreationEntryPoint b;

                public b(Post post, PostingCreationEntryPoint postingCreationEntryPoint) {
                    this.a = post;
                    this.b = postingCreationEntryPoint;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return epx.f(this.a, bVar.a) && this.b == bVar.b;
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    return "EditComment(reply=" + this.a + ", entryPoint=" + this.b + ')';
                }
            }

            /* compiled from: NewsfeedListEvent.kt */
            public static final class c implements s {
                public final Post a;
                public final PostingCreationEntryPoint b;

                public c(Post post, PostingCreationEntryPoint postingCreationEntryPoint) {
                    this.a = post;
                    this.b = postingCreationEntryPoint;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return epx.f(this.a, cVar.a) && this.b == cVar.b;
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    return "EditPost(post=" + this.a + ", creationEntryPoint=" + this.b + ')';
                }
            }

            /* compiled from: NewsfeedListEvent.kt */
            public static final class d implements s {
                public final Post a;
                public final Group b;
                public final PostingCreationEntryPoint c;

                public d(Post post, Group group, PostingCreationEntryPoint postingCreationEntryPoint) {
                    this.a = post;
                    this.b = group;
                    this.c = postingCreationEntryPoint;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof d)) {
                        return false;
                    }
                    d dVar = (d) obj;
                    return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && this.c == dVar.c;
                }

                public final int hashCode() {
                    return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
                }

                public final String toString() {
                    return "EditSuggestedPost(suggested=" + this.a + ", group=" + this.b + ", entryPoint=" + this.c + ')';
                }
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        public static final class t implements f {
            public final String a;

            public t(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof t) && epx.f(this.a, ((t) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("ShowDiscoverTabById(id="), this.a, ')');
            }
        }
    }

    /* compiled from: NewsfeedListEvent.kt */
    public static abstract class g implements yo60 {

        /* compiled from: NewsfeedListEvent.kt */
        public static final class a extends g {
            public final Throwable a;

            public a(Throwable th) {
                this.a = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("ErrorMessage(throwable="), this.a, ')');
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        public static abstract class b extends g {
            public final int a;

            /* compiled from: NewsfeedListEvent.kt */
            public static final class a extends b {
            }

            /* compiled from: NewsfeedListEvent.kt */
            /* renamed from: xsna.yo60$g$b$b, reason: collision with other inner class name */
            public static final class C4121b extends b {
            }

            /* compiled from: NewsfeedListEvent.kt */
            public static final class c extends b {
            }

            public b(int i) {
                this.a = i;
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        public static final class c extends g {
            public final int a;

            public c(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a == ((c) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Toast(resId="), this.a, ')');
            }
        }
    }

    /* compiled from: NewsfeedListEvent.kt */
    public static final class h implements yo60 {
        public final NewsfeedExternalAction a;

        public h(NewsfeedExternalAction newsfeedExternalAction) {
            this.a = newsfeedExternalAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "NotificationCenterEvent(action=" + this.a + ')';
        }
    }

    /* compiled from: NewsfeedListEvent.kt */
    public static abstract class i implements yo60 {

        /* compiled from: NewsfeedListEvent.kt */
        public static final class a extends i {
            public final ArrayList a;

            public a(ArrayList arrayList) {
                this.a = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a.equals(((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("Destroy(ads="), this.a);
            }
        }
    }

    /* compiled from: NewsfeedListEvent.kt */
    public interface j extends yo60 {

        /* compiled from: NewsfeedListEvent.kt */
        public static final class a implements j {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1069622029;
            }

            public final String toString() {
                return "BeforeReloaded";
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        public static final class b implements j {
            public final String a;

            public b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("PageLoaded(nextFrom="), this.a, ')');
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        public static final class c implements j {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1223233677;
            }

            public final String toString() {
                return "Reloading";
            }
        }

        /* compiled from: NewsfeedListEvent.kt */
        public static final class d implements j {
            public final ListLoadingState a;

            public d(ListLoadingState listLoadingState) {
                this.a = listLoadingState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.a == ((d) obj).a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "StateChanged(loadingState=" + this.a + ')';
            }
        }
    }

    /* compiled from: NewsfeedListEvent.kt */
    public static final class k implements yo60 {
        public final Object a;

        public k(Object obj) {
            this.a = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && epx.f(this.a, ((k) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return k73.c(new StringBuilder("RxBusEvent(event="), this.a, ')');
        }
    }
}
