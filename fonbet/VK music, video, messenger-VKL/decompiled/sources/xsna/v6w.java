package xsna;

import com.vk.dto.common.Peer;
import java.util.Set;
import xsna.ln50;
import xsna.on50;

/* compiled from: ImItemListMviTask.kt */
/* loaded from: classes2.dex */
public interface v6w extends hn50 {

    /* compiled from: ImItemListMviTask.kt */
    public interface a extends v6w {

        /* compiled from: ImItemListMviTask.kt */
        /* renamed from: xsna.v6w$a$a, reason: collision with other inner class name */
        public static final class C3870a implements a {
            public final long b;

            public C3870a(long j) {
                this.b = j;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3870a) && this.b == ((C3870a) obj).b;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }

            public final int hashCode() {
                return Long.hashCode(this.b);
            }

            public final String toString() {
                return vu5.a(')', this.b, new StringBuilder("Archive(channelId="));
            }
        }

        /* compiled from: ImItemListMviTask.kt */
        public static final class b implements a {
            public final long b;

            public b(long j) {
                this.b = j;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.b == ((b) obj).b;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }

            public final int hashCode() {
                return Long.hashCode(this.b);
            }

            public final String toString() {
                return vu5.a(')', this.b, new StringBuilder("Delete(channelId="));
            }
        }

        /* compiled from: ImItemListMviTask.kt */
        public static final class c implements a {
            public final long b;

            public c(long j) {
                this.b = j;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.b == ((c) obj).b;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }

            public final int hashCode() {
                return Long.hashCode(this.b);
            }

            public final String toString() {
                return vu5.a(')', this.b, new StringBuilder("HideInAllFolder(channelId="));
            }
        }

        /* compiled from: ImItemListMviTask.kt */
        public static final class d implements a {
            public final long b;

            public d(long j) {
                this.b = j;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.b == ((d) obj).b;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }

            public final int hashCode() {
                return Long.hashCode(this.b);
            }

            public final String toString() {
                return vu5.a(')', this.b, new StringBuilder("Leave(channelId="));
            }
        }

        /* compiled from: ImItemListMviTask.kt */
        public static final class e implements a {
            public final long b;

            public e(long j) {
                this.b = j;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.b == ((e) obj).b;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }

            public final int hashCode() {
                return Long.hashCode(this.b);
            }

            public final String toString() {
                return vu5.a(')', this.b, new StringBuilder("MarkAsRead(channelId="));
            }
        }

        /* compiled from: ImItemListMviTask.kt */
        public static final class f implements a {
            public final long b;

            public f(long j) {
                this.b = j;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.b == ((f) obj).b;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }

            public final int hashCode() {
                return Long.hashCode(this.b);
            }

            public final String toString() {
                return vu5.a(')', this.b, new StringBuilder("NotificationOff(channelId="));
            }
        }

        /* compiled from: ImItemListMviTask.kt */
        public static final class g implements a {
            public final long b;

            public g(long j) {
                this.b = j;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && this.b == ((g) obj).b;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }

            public final int hashCode() {
                return Long.hashCode(this.b);
            }

            public final String toString() {
                return vu5.a(')', this.b, new StringBuilder("NotificationOn(channelId="));
            }
        }

        /* compiled from: ImItemListMviTask.kt */
        public static final class h implements a {
            public final long b;

            public h(long j) {
                this.b = j;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && this.b == ((h) obj).b;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }

            public final int hashCode() {
                return Long.hashCode(this.b);
            }

            public final String toString() {
                return vu5.a(')', this.b, new StringBuilder("Pin(channelId="));
            }
        }

        /* compiled from: ImItemListMviTask.kt */
        public static final class i implements a {
            public final long b;

            public i(long j) {
                this.b = j;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && this.b == ((i) obj).b;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }

            public final int hashCode() {
                return Long.hashCode(this.b);
            }

            public final String toString() {
                return vu5.a(')', this.b, new StringBuilder("ShowInAllFolder(channelId="));
            }
        }

        /* compiled from: ImItemListMviTask.kt */
        public static final class j implements a {
            public final long b;

            public j(long j) {
                this.b = j;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && this.b == ((j) obj).b;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }

            public final int hashCode() {
                return Long.hashCode(this.b);
            }

            public final String toString() {
                return vu5.a(')', this.b, new StringBuilder("Unarchive(channelId="));
            }
        }

        /* compiled from: ImItemListMviTask.kt */
        public static final class k implements a {
            public final long b;

            public k(long j) {
                this.b = j;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k) && this.b == ((k) obj).b;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }

            public final int hashCode() {
                return Long.hashCode(this.b);
            }

            public final String toString() {
                return vu5.a(')', this.b, new StringBuilder("Unpin(channelId="));
            }
        }
    }

    /* compiled from: ImItemListMviTask.kt */
    public interface b extends v6w {

        /* compiled from: ImItemListMviTask.kt */
        public static final class a implements b {
            public final com.vk.im.engine.models.dialogs.c b;

            public a(com.vk.im.engine.models.dialogs.c cVar) {
                this.b = cVar;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }

            public final int hashCode() {
                return this.b.a.hashCode();
            }

            public final String toString() {
                return "PrefetchTheme(themeId=" + this.b + ')';
            }
        }
    }

    /* compiled from: ImItemListMviTask.kt */
    public interface c extends v6w {

        /* compiled from: ImItemListMviTask.kt */
        public static final class a implements c {
            public final String b;
            public final String c;
            public final boolean d;

            public a(String str, String str2, boolean z) {
                this.b = str;
                this.c = str2;
                this.d = z;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + urd0.a(this.b.hashCode() * 31, 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Click(name=");
                sb.append(this.b);
                sb.append(", callback=");
                sb.append(this.c);
                sb.append(", hideOnComplete=");
                return defpackage.q0.a(sb, this.d, ')');
            }
        }

        /* compiled from: ImItemListMviTask.kt */
        public static final class b implements c {
            public final String b;

            public b(String str) {
                this.b = str;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Close(name="), this.b, ')');
            }
        }

        /* compiled from: ImItemListMviTask.kt */
        /* renamed from: xsna.v6w$c$c, reason: collision with other inner class name */
        public static final class C3871c implements c {
            public final String b;

            public C3871c(String str) {
                this.b = str;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3871c) && epx.f(this.b, ((C3871c) obj).b);
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Hide(name="), this.b, ')');
            }
        }
    }

    /* compiled from: ImItemListMviTask.kt */
    public static final class d implements v6w {
        public static final d b = new d();

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return 175608523;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: ImItemListMviTask.kt */
    public static final class e implements v6w {
        public static final e b = new e();
        public static final rn50 c = new rn50("LoadMore");
        public static final ln50.a.C3276a d = ln50.a.b;

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return d;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return c;
        }

        public final int hashCode() {
            return 1773234582;
        }

        public final String toString() {
            return "LoadMore";
        }
    }

    /* compiled from: ImItemListMviTask.kt */
    public static final class f implements v6w {
        public static final f b = new f();

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return 46083503;
        }

        public final String toString() {
            return "ObserveContactsSync";
        }
    }

    /* compiled from: ImItemListMviTask.kt */
    public static final class g implements v6w {
        public static final g b = new g();

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return -2097044536;
        }

        public final String toString() {
            return "ObserveReplyButtonChanges";
        }
    }

    /* compiled from: ImItemListMviTask.kt */
    public static final class h implements v6w {
        public final Set<Peer> b;

        /* JADX WARN: Multi-variable type inference failed */
        public h(Set<? extends Peer> set) {
            this.b = set;
        }

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ur.c(new StringBuilder("UpdateStories(peers="), this.b, ')');
        }
    }
}
