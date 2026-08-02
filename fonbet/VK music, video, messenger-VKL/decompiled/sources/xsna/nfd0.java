package xsna;

import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.donut.DonutLevel;
import com.vk.dto.privacy.ListFriends;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: PrivacyState.kt */
/* loaded from: classes17.dex */
public final class nfd0 {
    public List<ProfileFriendItem> a;
    public List<ListFriends> b;
    public List<ProfileFriendItem> c;
    public List<ListFriends> d;
    public b e;
    public b f;
    public DonutLevel g;
    public List<b> h;
    public List<b> i;
    public boolean j;

    /* compiled from: PrivacyState.kt */
    public static final class a {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static b a(String str, boolean z, DonutLevel donutLevel) {
            switch (str.hashCode()) {
                case -1942494185:
                    if (str.equals("friends_of_friends")) {
                        return new b(str, PrivacyRules.j, R.string.privacy_friends_of_friends);
                    }
                    return null;
                case -1887957850:
                    if (str.equals("editors")) {
                        return new b(str, PrivacyRules.g, R.string.privacy_for_editors);
                    }
                    return null;
                case -1313660149:
                    if (str.equals("only_me")) {
                        return new b(str, PrivacyRules.b, R.string.privacy_only_me);
                    }
                    return null;
                case -1040220445:
                    if (str.equals("nobody")) {
                        return new b(str, PrivacyRules.c, R.string.privacy_nobody);
                    }
                    return null;
                case -600094315:
                    if (str.equals("friends")) {
                        return new b(str, PrivacyRules.h, R.string.privacy_friends);
                    }
                    return null;
                case 96673:
                    if (str.equals("all")) {
                        return new b(str, PrivacyRules.a, R.string.privacy_all);
                    }
                    return null;
                case 3536116:
                    if (str.equals("some")) {
                        return new b(str, true, new PrivacyRules.Include(), R.string.privacy_add_friends_or_lists, new c.b());
                    }
                    return null;
                case 95768354:
                    if (str.equals("donut") && z) {
                        return new b(str, true, PrivacyRules.f, R.string.privacy_donut_of_community, donutLevel != null ? new c.a(donutLevel.c, donutLevel.e) : null);
                    }
                    return null;
                case 336231138:
                    if (str.equals("by_link")) {
                        return new b(str, PrivacyRules.e, R.string.privacy_has_link);
                    }
                    return null;
                case 948881689:
                    if (str.equals("members")) {
                        return new b(str, PrivacyRules.d, R.string.privacy_member_of_community);
                    }
                    return null;
                default:
                    return null;
            }
        }
    }

    /* compiled from: PrivacyState.kt */
    public static final class b {
        public final String a;
        public final boolean b;
        public final PrivacySetting.PrivacyRule c;
        public final int d;
        public final c e;

        public /* synthetic */ b(String str, PrivacySetting.PrivacyRule privacyRule, int i) {
            this(str, true, privacyRule, i, null);
        }

        public final boolean a() {
            return this.e != null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && epx.f(this.c, bVar.c) && this.d == bVar.d && epx.f(this.e, bVar.e);
        }

        public final int hashCode() {
            int a = shy.a(this.d, (this.c.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31);
            c cVar = this.e;
            return a + (cVar == null ? 0 : cVar.hashCode());
        }

        public final String toString() {
            return "PrivacyOption(key=" + this.a + ", isAllowedRule=" + this.b + ", rule=" + this.c + ", titleRes=" + this.d + ", selectionInfo=" + this.e + ')';
        }

        public b(String str, boolean z, PrivacySetting.PrivacyRule privacyRule, int i, c cVar) {
            this.a = str;
            this.b = z;
            this.c = privacyRule;
            this.d = i;
            this.e = cVar;
        }
    }

    /* compiled from: PrivacyState.kt */
    public interface c {

        /* compiled from: PrivacyState.kt */
        public static final class a implements c {
            public final String a;
            public final boolean b;

            public a(String str, boolean z) {
                this.a = str;
                this.b = z;
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
                return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("DonutSelectionInfo(selectedLevelName=");
                sb.append(this.a);
                sb.append(", isHighestLevel=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }

        /* compiled from: PrivacyState.kt */
        public static final class b implements c {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                ((b) obj).getClass();
                return true;
            }

            public final int hashCode() {
                return Integer.hashCode(R.string.privacy_selection_friends_and_lists) + shy.a(R.string.privacy_selection_friends, Integer.hashCode(R.string.privacy_selection_lists) * 31, 31);
            }

            public final String toString() {
                return "FriendsAndListsSelectionInfo(onlyListsTitleRes=2131962067, onlyFriendsTitleRes=2131962064, friendsAndListsTitleRes=2131962065)";
            }
        }
    }

    public nfd0() {
        EmptyList emptyList = EmptyList.b;
        this.a = emptyList;
        this.b = emptyList;
        this.c = emptyList;
        this.d = emptyList;
        this.h = emptyList;
        this.i = emptyList;
    }

    public final boolean a() {
        return (this.c.isEmpty() && this.d.isEmpty()) ? false : true;
    }

    public final boolean b() {
        return (this.a.isEmpty() && this.b.isEmpty()) ? false : true;
    }

    public final PrivacySetting c() {
        PrivacySetting privacySetting = new PrivacySetting();
        b bVar = this.e;
        if (bVar != null) {
            privacySetting.e.add(d(bVar));
        }
        b bVar2 = this.f;
        if (bVar2 != null) {
            privacySetting.e.add(d(bVar2));
        }
        return privacySetting;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.vk.dto.common.data.PrivacySetting$PrivacyRule] */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.vk.dto.common.data.PrivacySetting$PrivacyRule] */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.vk.dto.common.data.PrivacyRules$Include] */
    public final PrivacySetting.PrivacyRule d(b bVar) {
        ?? r8 = bVar.c;
        if (r8 instanceof PrivacyRules.Exclude) {
            PrivacyRules.Exclude exclude = new PrivacyRules.Exclude();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                exclude.Fb(((ProfileFriendItem) it.next()).b);
            }
            Iterator it2 = this.b.iterator();
            while (it2.hasNext()) {
                exclude.Fb(new UserId(((ListFriends) it2.next()).b + 2000000000));
            }
            return exclude;
        }
        if (r8 instanceof PrivacyRules.Include) {
            r8 = new PrivacyRules.Include();
            Iterator it3 = this.c.iterator();
            while (it3.hasNext()) {
                r8.Fb(((ProfileFriendItem) it3.next()).b);
            }
            Iterator it4 = this.d.iterator();
            while (it4.hasNext()) {
                r8.Fb(new UserId(((ListFriends) it4.next()).b + 2000000000));
            }
        }
        return r8;
    }
}
