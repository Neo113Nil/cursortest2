package xsna;

import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.search.integration.api.SearchTab;
import xsna.mzh0;

/* compiled from: SearchDelegateFactory.kt */
/* loaded from: classes5.dex */
public abstract class iqh0 {
    public final mzh0 a;
    public final boolean b;

    /* compiled from: SearchDelegateFactory.kt */
    public static final class a extends iqh0 {
        public final FragmentImpl c;
        public final String d;

        public a(FragmentImpl fragmentImpl, String str) {
            super(fragmentImpl, null, 6);
            this.c = fragmentImpl;
            this.d = str;
        }

        @Override // xsna.iqh0
        public final FragmentImpl a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + (this.c.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GamesSearchDelegateCreateParams(ownerFragment=");
            sb.append(this.c);
            sb.append(", queryViewHint=");
            return ho8.a(sb, this.d, ')');
        }
    }

    /* compiled from: SearchDelegateFactory.kt */
    public static final class b extends iqh0 {
        public final FragmentImpl c;
        public final mzh0.a d;
        public final UserId e;
        public final xsh0 f;

        public b(FragmentImpl fragmentImpl, mzh0.a aVar, UserId userId, xsh0 xsh0Var) {
            super(fragmentImpl, aVar, 4);
            this.c = fragmentImpl;
            this.d = aVar;
            this.e = userId;
            this.f = xsh0Var;
        }

        @Override // xsna.iqh0
        public final FragmentImpl a() {
            return this.c;
        }

        @Override // xsna.iqh0
        public final mzh0 b() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + bh10.a((this.d.hashCode() + (this.c.hashCode() * 31)) * 31, 31, this.e.b);
        }

        public final String toString() {
            return "GroupMembersSearchDelegateCreateParams(ownerFragment=" + this.c + ", searchType=" + this.d + ", groupId=" + this.e + ", searchFilterInteractor=" + this.f + ')';
        }
    }

    /* compiled from: SearchDelegateFactory.kt */
    public static final class c extends iqh0 {
        public final FragmentImpl c;
        public final String d;

        public c(FragmentImpl fragmentImpl, String str) {
            super(fragmentImpl, null, 6);
            this.c = fragmentImpl;
            this.d = str;
        }

        @Override // xsna.iqh0
        public final FragmentImpl a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + (this.c.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MiniAppsSearchDelegateCreateParams(ownerFragment=");
            sb.append(this.c);
            sb.append(", queryViewHint=");
            return ho8.a(sb, this.d, ')');
        }
    }

    /* compiled from: SearchDelegateFactory.kt */
    public static final class d extends iqh0 {
        public final FragmentImpl c;
        public final long d;
        public final String e;

        public d(FragmentImpl fragmentImpl, long j, String str) {
            super(fragmentImpl, null, 6);
            this.c = fragmentImpl;
            this.d = j;
            this.e = str;
        }

        @Override // xsna.iqh0
        public final FragmentImpl a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.c, dVar.c) && this.d == dVar.d && epx.f(this.e, dVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + bh10.a(this.c.hashCode() * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OwnerVideosSearchDelegateCreateParams(ownerFragment=");
            sb.append(this.c);
            sb.append(", ownerId=");
            sb.append(this.d);
            sb.append(", queryViewHint=");
            return ho8.a(sb, this.e, ')');
        }
    }

    /* compiled from: SearchDelegateFactory.kt */
    public static final class e extends iqh0 {
        public final FragmentImpl c;
        public final UserId d;
        public final SearchTab e;
        public final String f;

        public e(FragmentImpl fragmentImpl, UserId userId, SearchTab searchTab, String str) {
            super(fragmentImpl, null, 6);
            this.c = fragmentImpl;
            this.d = userId;
            this.e = searchTab;
            this.f = str;
        }

        @Override // xsna.iqh0
        public final FragmentImpl a() {
            return this.c;
        }

        @Override // xsna.iqh0
        public final boolean c() {
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.c, eVar.c) && epx.f(this.d, eVar.d) && this.e == eVar.e && epx.f(this.f, eVar.f);
        }

        public final int hashCode() {
            int hashCode = (this.e.hashCode() + bh10.a(qoy.b(this.c.hashCode() * 31, 31, false), 31, this.d.b)) * 31;
            String str = this.f;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SearchInCommunityDelegateCreateParams(ownerFragment=");
            sb.append(this.c);
            sb.append(", isEmptyQueryAllowed=false, communityId=");
            sb.append(this.d);
            sb.append(", startTab=");
            sb.append(this.e);
            sb.append(", queryViewHint=");
            return ho8.a(sb, this.f, ')');
        }
    }

    public iqh0(FragmentImpl fragmentImpl, mzh0.a aVar, int i) {
        this.a = (i & 2) != 0 ? mzh0.b.a : aVar;
        this.b = true;
    }

    public abstract FragmentImpl a();

    public mzh0 b() {
        return this.a;
    }

    public boolean c() {
        return this.b;
    }
}
