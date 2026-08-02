package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.Poll;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.newsfeed.posting.api.model.PostingMediaEntryPoint;

/* compiled from: PostingOpenParams.kt */
/* loaded from: classes4.dex */
public interface vhc0 {

    /* compiled from: PostingOpenParams.kt */
    public static final class a implements vhc0 {
        public final UserId a;
        public final long b;
        public final PostingCreationEntryPoint c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final Integer g;

        public a(UserId userId, long j, PostingCreationEntryPoint postingCreationEntryPoint, boolean z, boolean z2, boolean z3, Integer num) {
            this.a = userId;
            this.b = j;
            this.c = postingCreationEntryPoint;
            this.d = z;
            this.e = z2;
            this.f = z3;
            this.g = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && epx.f(this.g, aVar.g);
        }

        public final int hashCode() {
            int b = qoy.b(qoy.b(qoy.b((this.c.hashCode() + bh10.a(Long.hashCode(this.a.b) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f);
            Integer num = this.g;
            return b + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EditDraft(ownerId=");
            sb.append(this.a);
            sb.append(", draftId=");
            sb.append(this.b);
            sb.append(", creationEntryPoint=");
            sb.append(this.c);
            sb.append(", isSignChangeAllowed=");
            sb.append(this.d);
            sb.append(", isSuggestPost=");
            sb.append(this.e);
            sb.append(", isStoryRepostSwitchedOn=");
            sb.append(this.f);
            sb.append(", publishSuggestId=");
            return uqi.b(sb, this.g, ')');
        }
    }

    /* compiled from: PostingOpenParams.kt */
    public static final class b implements vhc0 {
        public final Poll a;
        public final xhy b;

        public b(Poll poll, xhy xhyVar) {
            this.a = poll;
            this.b = xhyVar;
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
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "EditPoll(poll=" + this.a + ", onResult=" + this.b + ')';
        }
    }

    /* compiled from: PostingOpenParams.kt */
    public static final class c implements vhc0 {
        public final UserId a;
        public final NewsEntry b;
        public final PostingCreationEntryPoint c;
        public final boolean d;
        public final Integer e;
        public final boolean f;
        public final boolean g;
        public final boolean h;

        public c(UserId userId, NewsEntry newsEntry, PostingCreationEntryPoint postingCreationEntryPoint, boolean z, Integer num, boolean z2, boolean z3, boolean z4) {
            this.a = userId;
            this.b = newsEntry;
            this.c = postingCreationEntryPoint;
            this.d = z;
            this.e = num;
            this.f = z2;
            this.g = z3;
            this.h = z4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d && epx.f(this.e, cVar.e) && this.f == cVar.f && this.g == cVar.g && this.h == cVar.h;
        }

        public final int hashCode() {
            UserId userId = this.a;
            int b = qoy.b((this.c.hashCode() + e630.b((userId == null ? 0 : Long.hashCode(userId.b)) * 31, 31, this.b)) * 31, 31, this.d);
            Integer num = this.e;
            return Boolean.hashCode(this.h) + qoy.b(qoy.b((b + (num != null ? num.hashCode() : 0)) * 31, 31, this.f), 31, this.g);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EditPost(groupId=");
            sb.append(this.a);
            sb.append(", newsEntry=");
            sb.append(this.b);
            sb.append(", creationEntryPoint=");
            sb.append(this.c);
            sb.append(", isSignChangeAllowed=");
            sb.append(this.d);
            sb.append(", publishSuggestId=");
            sb.append(this.e);
            sb.append(", isStoryRepostSwitchedOn=");
            sb.append(this.f);
            sb.append(", isOpenedFromMiniApp=");
            sb.append(this.g);
            sb.append(", isOpenedFromArchive=");
            return defpackage.q0.a(sb, this.h, ')');
        }
    }

    /* compiled from: PostingOpenParams.kt */
    public static final class d implements vhc0 {
        public final UserId a;
        public final zwc0 b;
        public final PostingCreationEntryPoint c;
        public final boolean d;
        public final PostingMediaEntryPoint e;
        public final Integer f;
        public final boolean g;
        public final boolean h;
        public final String i;
        public final boolean j;
        public final boolean k;

        public d(UserId userId, zwc0 zwc0Var, PostingCreationEntryPoint postingCreationEntryPoint, boolean z, PostingMediaEntryPoint postingMediaEntryPoint, Integer num, boolean z2, boolean z3, String str, boolean z4, boolean z5) {
            this.a = userId;
            this.b = zwc0Var;
            this.c = postingCreationEntryPoint;
            this.d = z;
            this.e = postingMediaEntryPoint;
            this.f = num;
            this.g = z2;
            this.h = z3;
            this.i = str;
            this.j = z4;
            this.k = z5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && this.c == dVar.c && this.d == dVar.d && this.e == dVar.e && epx.f(this.f, dVar.f) && this.g == dVar.g && this.h == dVar.h && epx.f(this.i, dVar.i) && this.j == dVar.j && this.k == dVar.k;
        }

        public final int hashCode() {
            int hashCode = (this.e.hashCode() + qoy.b((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31)) * 31, 31, this.d)) * 31;
            Integer num = this.f;
            int b = qoy.b(qoy.b((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.g), 31, this.h);
            String str = this.i;
            return Boolean.hashCode(this.k) + qoy.b((b + (str != null ? str.hashCode() : 0)) * 31, 31, this.j);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewPost(ownerId=");
            sb.append(this.a);
            sb.append(", preFilledParams=");
            sb.append(this.b);
            sb.append(", creationEntryPoint=");
            sb.append(this.c);
            sb.append(", isSignChangeAllowed=");
            sb.append(this.d);
            sb.append(", postingMediaEntryPoint=");
            sb.append(this.e);
            sb.append(", publishSuggestId=");
            sb.append(this.f);
            sb.append(", isOpenedFromMiniApp=");
            sb.append(this.g);
            sb.append(", isPostingSuccessToastRequired=");
            sb.append(this.h);
            sb.append(", businessOnboardingTooltip=");
            sb.append(this.i);
            sb.append(", isStoryRepostSwitchedOn=");
            sb.append(this.j);
            sb.append(", allowedCoauthors=");
            return defpackage.q0.a(sb, this.k, ')');
        }
    }
}
