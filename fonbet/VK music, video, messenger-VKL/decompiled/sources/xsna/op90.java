package xsna;

import com.vk.api.generated.users.dto.UsersOnlineInfoDto;
import com.vk.dto.common.im.ImageList;
import com.vk.im.ui.views.avatars.a;
import com.vk.voip.userid.CallsUserId;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.a59;

/* compiled from: PastCallViewItem.kt */
/* loaded from: classes7.dex */
public abstract class op90 implements l59 {

    /* compiled from: PastCallViewItem.kt */
    public static abstract class a extends op90 {

        /* compiled from: PastCallViewItem.kt */
        /* renamed from: xsna.op90$a$a, reason: collision with other inner class name */
        public static final class C3461a extends a {
            public final a.b b;
            public final ImageList c;
            public final String d;
            public final UsersOnlineInfoDto e;
            public final a59.f f;
            public final a59.c g;
            public final int h;
            public final kr5 i;

            public C3461a(a.b bVar, ImageList imageList, String str, UsersOnlineInfoDto usersOnlineInfoDto, a59.f fVar, a59.c cVar, int i, kr5 kr5Var) {
                this.b = bVar;
                this.c = imageList;
                this.d = str;
                this.e = usersOnlineInfoDto;
                this.f = fVar;
                this.g = cVar;
                this.h = i;
                this.i = kr5Var;
            }

            @Override // xsna.op90.a
            public final kr5 a() {
                return this.i;
            }

            @Override // xsna.op90.a
            public final UsersOnlineInfoDto b() {
                return this.e;
            }

            @Override // xsna.op90.a
            public final a59 c() {
                return this.g;
            }

            @Override // xsna.op90.a
            public final a59.f d() {
                return this.f;
            }

            @Override // xsna.op90.a
            public final String e() {
                return this.d;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3461a)) {
                    return false;
                }
                C3461a c3461a = (C3461a) obj;
                return epx.f(this.b, c3461a.b) && epx.f(this.c, c3461a.c) && epx.f(this.d, c3461a.d) && epx.f(this.e, c3461a.e) && epx.f(this.f, c3461a.f) && epx.f(this.g, c3461a.g) && this.h == c3461a.h && epx.f(this.i, c3461a.i);
            }

            @Override // xsna.op90, xsna.hfz
            public final Number getItemId() {
                ArrayList arrayList = this.g.c;
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(((a59.e) it.next()).c));
                }
                return Integer.valueOf(arrayList2.hashCode());
            }

            public final int hashCode() {
                a.b bVar = this.b;
                return this.i.hashCode() + shy.a(this.h, (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + urd0.a(fw3.a((bVar == null ? 0 : bVar.hashCode()) * 31, 31, this.c.b), 31, this.d)) * 31)) * 31)) * 31, 31);
            }

            public final String toString() {
                return "Merged(placeholderSource=" + this.b + ", image=" + this.c + ", title=" + this.d + ", onlineInfo=" + this.e + ", state=" + this.f + ", payload=" + this.g + ", count=" + this.h + ", avatar=" + this.i + ')';
            }
        }

        /* compiled from: PastCallViewItem.kt */
        public static final class b extends a {
            public final a.b b;
            public final ImageList c;
            public final String d;
            public final UsersOnlineInfoDto e;
            public final a59.f f;
            public final a59.e g;
            public final kr5 h;

            public b(a.b bVar, ImageList imageList, String str, UsersOnlineInfoDto usersOnlineInfoDto, a59.f fVar, a59.e eVar, kr5 kr5Var) {
                this.b = bVar;
                this.c = imageList;
                this.d = str;
                this.e = usersOnlineInfoDto;
                this.f = fVar;
                this.g = eVar;
                this.h = kr5Var;
            }

            @Override // xsna.op90.a
            public final kr5 a() {
                return this.h;
            }

            @Override // xsna.op90.a
            public final UsersOnlineInfoDto b() {
                return this.e;
            }

            @Override // xsna.op90.a
            public final a59 c() {
                return this.g;
            }

            @Override // xsna.op90.a
            public final a59.f d() {
                return this.f;
            }

            @Override // xsna.op90.a
            public final String e() {
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
                return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g) && epx.f(this.h, bVar.h);
            }

            @Override // xsna.op90, xsna.hfz
            public final Number getItemId() {
                return Integer.valueOf(Long.hashCode(this.g.c));
            }

            public final int hashCode() {
                a.b bVar = this.b;
                return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + urd0.a(fw3.a((bVar == null ? 0 : bVar.hashCode()) * 31, 31, this.c.b), 31, this.d)) * 31)) * 31)) * 31);
            }

            public final String toString() {
                return "Single(placeholderSource=" + this.b + ", image=" + this.c + ", title=" + this.d + ", onlineInfo=" + this.e + ", state=" + this.f + ", payload=" + this.g + ", avatar=" + this.h + ')';
            }
        }

        public abstract kr5 a();

        public abstract UsersOnlineInfoDto b();

        public abstract a59 c();

        public abstract a59.f d();

        public abstract String e();
    }

    /* compiled from: PastCallViewItem.kt */
    public static final class b extends op90 {
        public final a b;
        public final boolean c;

        /* compiled from: PastCallViewItem.kt */
        public static final class a {
            public final boolean a;
            public final AbstractC3462a b;

            /* compiled from: PastCallViewItem.kt */
            /* renamed from: xsna.op90$b$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC3462a {

                /* compiled from: PastCallViewItem.kt */
                /* renamed from: xsna.op90$b$a$a$a, reason: collision with other inner class name */
                public static final class C3463a extends AbstractC3462a {
                    public static final C3463a a = new C3463a();
                }

                /* compiled from: PastCallViewItem.kt */
                /* renamed from: xsna.op90$b$a$a$b, reason: collision with other inner class name */
                public static final class C3464b extends AbstractC3462a {
                    public final CallsUserId.VkUserId a;
                    public final String b;

                    public C3464b(CallsUserId.VkUserId vkUserId, String str) {
                        this.a = vkUserId;
                        this.b = str;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C3464b)) {
                            return false;
                        }
                        C3464b c3464b = (C3464b) obj;
                        return epx.f(this.a, c3464b.a) && epx.f(this.b, c3464b.b);
                    }

                    public final int hashCode() {
                        return this.b.hashCode() + (this.a.hashCode() * 31);
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("FromGroup(id=");
                        sb.append(this.a);
                        sb.append(", title=");
                        return ho8.a(sb, this.b, ')');
                    }
                }

                /* compiled from: PastCallViewItem.kt */
                /* renamed from: xsna.op90$b$a$a$c */
                public static final class c extends AbstractC3462a {
                    public static final c a = new c();
                }

                /* compiled from: PastCallViewItem.kt */
                /* renamed from: xsna.op90$b$a$a$d */
                public static final class d extends AbstractC3462a {
                    public static final d a = new d();
                }
            }

            public a(boolean z, AbstractC3462a abstractC3462a) {
                this.a = z;
                this.b = abstractC3462a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && epx.f(this.b, aVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
            }

            public final String toString() {
                return "FilterState(hasGroups=" + this.a + ", selectedItem=" + this.b + ')';
            }
        }

        public b(a aVar, boolean z) {
            this.b = aVar;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PastCallsHeader(filterState=");
            sb.append(this.b);
            sb.append(", isPastCallsEmpty=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: PastCallViewItem.kt */
    public static final class c extends op90 {
        public static final c b = new c();
    }

    @Override // xsna.hfz
    public Number getItemId() {
        return 0;
    }
}
