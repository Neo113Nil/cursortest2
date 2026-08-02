package xsna;

import com.vk.clips.coauthors.list.pendings.mvi.entity.state.ClipCoauthorsDecisionLaunchType;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;

/* compiled from: ClipCoauthorDecisionVS.kt */
/* loaded from: classes16.dex */
public final class znc implements lm50 {
    public final ArrayList b;
    public final ClipCoauthorsDecisionLaunchType c;
    public final boolean d;
    public final boolean e;

    /* compiled from: ClipCoauthorDecisionVS.kt */
    public static final class a {
        public final UserId a;
        public final String b;
        public final String c;
        public final boolean d;
        public final InterfaceC4185a e;

        /* compiled from: ClipCoauthorDecisionVS.kt */
        /* renamed from: xsna.znc$a$a, reason: collision with other inner class name */
        public interface InterfaceC4185a {

            /* compiled from: ClipCoauthorDecisionVS.kt */
            /* renamed from: xsna.znc$a$a$a, reason: collision with other inner class name */
            public static final class C4186a implements InterfaceC4185a {
                public static final C4186a a = new C4186a();
            }

            /* compiled from: ClipCoauthorDecisionVS.kt */
            /* renamed from: xsna.znc$a$a$b */
            public static final class b implements InterfaceC4185a {
                public static final b a = new b();
            }

            /* compiled from: ClipCoauthorDecisionVS.kt */
            /* renamed from: xsna.znc$a$a$c */
            public static final class c implements InterfaceC4185a {
                public static final c a = new c();
            }
        }

        public a(UserId userId, String str, String str2, boolean z, InterfaceC4185a interfaceC4185a) {
            this.a = userId;
            this.b = str;
            this.c = str2;
            this.d = z;
            this.e = interfaceC4185a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + qoy.b(urd0.a(urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            return "Owner(id=" + this.a + ", name=" + this.b + ", avatar=" + this.c + ", isSelected=" + this.d + ", type=" + this.e + ')';
        }
    }

    public znc(ArrayList arrayList, ClipCoauthorsDecisionLaunchType clipCoauthorsDecisionLaunchType, boolean z, boolean z2) {
        this.b = arrayList;
        this.c = clipCoauthorsDecisionLaunchType;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof znc)) {
            return false;
        }
        znc zncVar = (znc) obj;
        return this.b.equals(zncVar.b) && this.c.equals(zncVar.c) && this.d == zncVar.d && this.e == zncVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipCoauthorDecisionVS(owners=");
        kr.d(this.b, sb, ", launchType=");
        sb.append(this.c);
        sb.append(", isChannelsOnly=");
        sb.append(this.d);
        sb.append(", isCoauthorsRedesign=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
