package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;

/* compiled from: VoipCallServiceAction.kt */
/* loaded from: classes7.dex */
public interface rhw0 extends kj50 {

    /* compiled from: VoipCallServiceAction.kt */
    public static final class a implements rhw0 {
        public final UserId b;

        public a(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("AddFriend(userId="), this.b, ')');
        }
    }

    /* compiled from: VoipCallServiceAction.kt */
    public static final class a0 implements rhw0 {
        public static final a0 b = new a0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a0);
        }

        public final int hashCode() {
            return -86777512;
        }

        public final String toString() {
            return "UpdateBanners";
        }
    }

    /* compiled from: VoipCallServiceAction.kt */
    public static final class b implements rhw0 {
        public final vhw0 b;

        public b(vhw0 vhw0Var) {
            this.b = vhw0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "BannerButtonClicked(item=" + this.b + ')';
        }
    }

    /* compiled from: VoipCallServiceAction.kt */
    public static final class b0 implements rhw0 {
        public static final b0 b = new b0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b0);
        }

        public final int hashCode() {
            return -353938828;
        }

        public final String toString() {
            return "UpdateSyncContactsState";
        }
    }

    /* compiled from: VoipCallServiceAction.kt */
    public static final class c implements rhw0 {
        public final vhw0 b;

        public c(vhw0 vhw0Var) {
            this.b = vhw0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "BannerCloseClicked(item=" + this.b + ')';
        }
    }

    /* compiled from: VoipCallServiceAction.kt */
    public static final class d implements rhw0 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1385450189;
        }

        public final String toString() {
            return "CallByPhone";
        }
    }

    /* compiled from: VoipCallServiceAction.kt */
    public static final class e implements rhw0 {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1989569979;
        }

        public final String toString() {
            return "CallMenuClick";
        }
    }

    /* compiled from: VoipCallServiceAction.kt */
    public static final class f implements rhw0 {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1710593216;
        }

        public final String toString() {
            return "CloseSyncContacts";
        }
    }

    /* compiled from: VoipCallServiceAction.kt */
    public static final class g implements rhw0 {
        public final shw0 b;

        public g(shw0 shw0Var) {
            this.b = shw0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ContactsSyncDenied(from=" + this.b + ')';
        }
    }

    /* compiled from: VoipCallServiceAction.kt */
    public static final class h implements rhw0 {
        public final shw0 b;

        public h(shw0 shw0Var) {
            this.b = shw0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ContactsSyncGranted(from=" + this.b + ')';
        }
    }

    /* compiled from: VoipCallServiceAction.kt */
    public static final class i implements rhw0 {
        public final shw0 b;

        public i(shw0 shw0Var) {
            this.b = shw0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "CreateCall(from=" + this.b + ')';
        }
    }

    /* compiled from: VoipCallServiceAction.kt */
    public static final class j implements rhw0 {
        public static final j b = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 1627959350;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: VoipCallServiceAction.kt */
    public static final class k implements rhw0 {
        public final Peer.Member b;

        public k(Peer.Member member) {
            this.b = member;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.b.equals(((k) obj).b);
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + (Long.hashCode(this.b.b) * 31);
        }

        public final String toString() {
            return "MakeCall(peer=" + this.b + ", isVideo=false)";
        }
    }

    /* compiled from: VoipCallServiceAction.kt */
    public static final class l implements rhw0 {
        public static final l b = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 362346286;
        }

        public final String toString() {
            return "MoreMenuClick";
        }
    }

    /* compiled from: VoipCallServiceAction.kt */
    public static final class m implements rhw0 {
        public final Peer.Member b;

        public m(Peer.Member member) {
            this.b = member;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.b.equals(((m) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return "OpenChat(peer=" + this.b + ')';
        }
    }

    /* compiled from: VoipCallServiceAction.kt */
    public static final class n implements rhw0 {
        public final UserId b;

        public n(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && epx.f(this.b, ((n) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OpenProfile(userId="), this.b, ')');
        }
    }

    /* compiled from: VoipCallServiceAction.kt */
    public static final class o implements rhw0 {
        public static final o b = new o();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return -1820855624;
        }

        public final String toString() {
            return "PageLoadingOffsetReached";
        }
    }

    /* compiled from: VoipCallServiceAction.kt */
    public static final class p implements rhw0 {
        public final UserId b;

        public p(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && epx.f(this.b, ((p) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("RemoveFriend(userId="), this.b, ')');
        }
    }

    /* compiled from: VoipCallServiceAction.kt */
    public static final class q implements rhw0 {
        public static final q b = new q();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return -1064813502;
        }

        public final String toString() {
            return "Retry";
        }
    }

    /* compiled from: VoipCallServiceAction.kt */
    public interface r extends rhw0 {

        /* compiled from: VoipCallServiceAction.kt */
        public static final class a implements r {
            public final String b;

            public a(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Query(query="), this.b, ')');
            }
        }
    }

    /* compiled from: VoipCallServiceAction.kt */
    public static final class s implements rhw0 {
        public static final s b = new s();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof s);
        }

        public final int hashCode() {
            return -1447203971;
        }

        public final String toString() {
            return "SearchPeople";
        }
    }

    /* compiled from: VoipCallServiceAction.kt */
    public static final class t implements rhw0 {
        public final Peer.Member b;

        public t(Peer.Member member) {
            this.b = member;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.b.equals(((t) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return "ShareLink(peer=" + this.b + ')';
        }
    }

    /* compiled from: VoipCallServiceAction.kt */
    public static final class u implements rhw0 {
        public static final u b = new u();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof u);
        }

        public final int hashCode() {
            return -1612565605;
        }

        public final String toString() {
            return "ShowAsrList";
        }
    }

    /* compiled from: VoipCallServiceAction.kt */
    public static final class v implements rhw0 {
        public static final v b = new v();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof v);
        }

        public final int hashCode() {
            return 20822257;
        }

        public final String toString() {
            return "ShowHistory";
        }
    }

    /* compiled from: VoipCallServiceAction.kt */
    public static final class w implements rhw0 {
        public final Peer.Member b;

        public w(Peer.Member member) {
            this.b = member;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && this.b.equals(((w) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return "ShowMore(peer=" + this.b + ')';
        }
    }

    /* compiled from: VoipCallServiceAction.kt */
    public static final class x implements rhw0 {
        public static final x b = new x();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof x);
        }

        public final int hashCode() {
            return 176485023;
        }

        public final String toString() {
            return "ShowRecords";
        }
    }

    /* compiled from: VoipCallServiceAction.kt */
    public static final class y implements rhw0 {
        public static final y b = new y();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof y);
        }

        public final int hashCode() {
            return -1820935336;
        }

        public final String toString() {
            return "ShowScheduleCall";
        }
    }

    /* compiled from: VoipCallServiceAction.kt */
    public static final class z implements rhw0 {
        public final shw0 b;

        public z(shw0 shw0Var) {
            this.b = shw0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof z) && epx.f(this.b, ((z) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SyncContacts(from=" + this.b + ')';
        }
    }
}
