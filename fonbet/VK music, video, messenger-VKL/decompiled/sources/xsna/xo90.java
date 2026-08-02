package xsna;

import com.vk.api.generated.users.dto.UsersOnlineInfoDto;
import com.vk.dto.common.im.ImageList;
import com.vk.im.ui.views.avatars.a;
import com.vk.voip.userid.CallsUserId;
import java.util.ArrayList;
import xsna.a59;

/* compiled from: PastCallDetailsDialogViewState.kt */
/* loaded from: classes7.dex */
public abstract class xo90 {

    /* compiled from: PastCallDetailsDialogViewState.kt */
    public static abstract class a {

        /* compiled from: PastCallDetailsDialogViewState.kt */
        /* renamed from: xsna.xo90$a$a, reason: collision with other inner class name */
        public static final class C4027a extends a {
            public static final C4027a a = new C4027a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C4027a);
            }

            public final int hashCode() {
                return 316211061;
            }

            public final String toString() {
                return "CallInMax";
            }
        }

        /* compiled from: PastCallDetailsDialogViewState.kt */
        public static final class b extends a {
            public final a59 a;

            public b(a59 a59Var) {
                this.a = a59Var;
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
                return "DeleteCall(call=" + this.a + ')';
            }
        }

        /* compiled from: PastCallDetailsDialogViewState.kt */
        public static final class c extends a {
            public final y49 a;

            public c(y49 y49Var) {
                this.a = y49Var;
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
                return "JoinWithAudio(call=" + this.a + ')';
            }
        }

        /* compiled from: PastCallDetailsDialogViewState.kt */
        public static final class d extends a {
            public final y49 a;

            public d(y49 y49Var) {
                this.a = y49Var;
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
                return "JoinWithVideo(call=" + this.a + ')';
            }
        }

        /* compiled from: PastCallDetailsDialogViewState.kt */
        public static final class e extends a {
            public final a59 a;
            public final t49 b;

            public e(a59 a59Var, t49 t49Var) {
                this.a = a59Var;
                this.b = t49Var;
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
                t49 t49Var = this.b;
                return hashCode + (t49Var == null ? 0 : t49Var.hashCode());
            }

            public final String toString() {
                return "MakeCallAudio(call=" + this.a + ", contact=" + this.b + ')';
            }
        }

        /* compiled from: PastCallDetailsDialogViewState.kt */
        public static final class f extends a {
            public final a59 a;
            public final t49 b;

            public f(a59 a59Var, t49 t49Var) {
                this.a = a59Var;
                this.b = t49Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                t49 t49Var = this.b;
                return hashCode + (t49Var == null ? 0 : t49Var.hashCode());
            }

            public final String toString() {
                return "MakeCallVideo(call=" + this.a + ", contact=" + this.b + ')';
            }
        }

        /* compiled from: PastCallDetailsDialogViewState.kt */
        public static final class g extends a {
            public final a59 a;

            public g(a59 a59Var) {
                this.a = a59Var;
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
                return "ReportCall(call=" + this.a + ')';
            }
        }

        /* compiled from: PastCallDetailsDialogViewState.kt */
        public static final class h extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                ((h) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "ShareJoinLink(call=null)";
            }
        }

        /* compiled from: PastCallDetailsDialogViewState.kt */
        public static final class i extends a {
            public final a59 a;

            public i(a59 a59Var) {
                this.a = a59Var;
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
                return "WriteMessage(call=" + this.a + ')';
            }
        }
    }

    /* compiled from: PastCallDetailsDialogViewState.kt */
    public static abstract class b implements hfz {

        /* compiled from: PastCallDetailsDialogViewState.kt */
        public static final class a extends b {
            public final long b;

            public a(long j) {
                this.b = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.b == ((a) obj).b;
            }

            @Override // xsna.hfz
            public final Number getItemId() {
                return Integer.valueOf(Long.hashCode(this.b));
            }

            public final int hashCode() {
                return Long.hashCode(this.b);
            }

            public final String toString() {
                return vu5.a(')', this.b, new StringBuilder("DateHeader(timestampMs="));
            }
        }

        /* compiled from: PastCallDetailsDialogViewState.kt */
        /* renamed from: xsna.xo90$b$b, reason: collision with other inner class name */
        public static final class C4028b extends b {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C4028b)) {
                    return false;
                }
                ((C4028b) obj).getClass();
                return true;
            }

            @Override // xsna.hfz
            public final Number getItemId() {
                throw null;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "OngoingCall(call=null, isCurrentCall=false)";
            }
        }

        /* compiled from: PastCallDetailsDialogViewState.kt */
        public static final class c extends b {
            public final a59.e b;

            public c(a59.e eVar) {
                this.b = eVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            @Override // xsna.hfz
            public final Number getItemId() {
                return Integer.valueOf(Long.hashCode(this.b.c));
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "PastCall(call=" + this.b + ')';
            }
        }
    }

    /* compiled from: PastCallDetailsDialogViewState.kt */
    public static final class c extends xo90 {
        public static final c a = new c();
    }

    /* compiled from: PastCallDetailsDialogViewState.kt */
    public static final class d {
        public final a.b a;
        public final ImageList b;
        public final String c;
        public final UsersOnlineInfoDto d;
        public final kr5 e;

        public d(a.b bVar, ImageList imageList, String str, UsersOnlineInfoDto usersOnlineInfoDto, kr5 kr5Var) {
            this.a = bVar;
            this.b = imageList;
            this.c = str;
            this.d = usersOnlineInfoDto;
            this.e = kr5Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d) && epx.f(this.e, dVar.e);
        }

        public final int hashCode() {
            a.b bVar = this.a;
            return this.e.hashCode() + ((this.d.hashCode() + urd0.a(fw3.a((bVar == null ? 0 : bVar.hashCode()) * 31, 31, this.b.b), 31, this.c)) * 31);
        }

        public final String toString() {
            return "Header(placeholderSource=" + this.a + ", image=" + this.b + ", title=" + this.c + ", onlineInfo=" + this.d + ", avatar=" + this.e + ')';
        }
    }

    /* compiled from: PastCallDetailsDialogViewState.kt */
    public static final class e extends xo90 {
        public final d a;
        public final CallsUserId b;
        public final ArrayList c;
        public final ArrayList d;
        public final boolean e;

        public e(d dVar, CallsUserId callsUserId, ArrayList arrayList, ArrayList arrayList2, boolean z) {
            this.a = dVar;
            this.b = callsUserId;
            this.c = arrayList;
            this.d = arrayList2;
            this.e = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c) && epx.f(this.d, eVar.d) && this.e == eVar.e;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            CallsUserId callsUserId = this.b;
            return Boolean.hashCode(this.e) + qr.a(this.d, qr.a(this.c, (hashCode + (callsUserId == null ? 0 : callsUserId.hashCode())) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Visible(header=");
            sb.append(this.a);
            sb.append(", associatedUserId=");
            sb.append(this.b);
            sb.append(", callsBlockItems=");
            sb.append(this.c);
            sb.append(", actions=");
            sb.append(this.d);
            sb.append(", isDirectIntent=");
            return defpackage.q0.a(sb, this.e, ')');
        }
    }
}
