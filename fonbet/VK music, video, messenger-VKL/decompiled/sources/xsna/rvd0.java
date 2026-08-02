package xsna;

import com.vk.clips.viewer.impl.grid.toolbar.profile.swap.models.CounterType;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.shortvideo.ClipsAuthor;
import com.vk.dto.user.ImageStatus;
import java.util.ArrayList;

/* compiled from: ProfileData.kt */
/* loaded from: classes17.dex */
public final class rvd0 {
    public final Object a;
    public final int b;
    public final a c;
    public final mvd0 d;
    public final boolean e;
    public final boolean f;

    /* compiled from: ProfileData.kt */
    public static final class a {
        public final s8u0 a;
        public final String b;
        public final String c;
        public final UserId d;
        public final long e;
        public final boolean f;
        public final qow<VerifyInfo> g;
        public final qow<ImageStatus> h;

        public a() {
            throw null;
        }

        public a(s8u0 s8u0Var, String str, String str2, UserId userId, long j, boolean z, qow qowVar, qow qowVar2) {
            this.a = s8u0Var;
            this.b = str;
            this.c = str2;
            this.d = userId;
            this.e = j;
            this.f = z;
            this.g = qowVar;
            this.h = qowVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e && this.f == aVar.f && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h);
        }

        public final int hashCode() {
            int b = qoy.b(bh10.a(bh10.a(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d.b), 31, this.e), 31, this.f);
            qow<VerifyInfo> qowVar = this.g;
            int a = (b + (qowVar == null ? 0 : qow.a(qowVar.a))) * 31;
            qow<ImageStatus> qowVar2 = this.h;
            return a + (qowVar2 != null ? qow.a(qowVar2.a) : 0);
        }

        public final String toString() {
            return "CardState(parsedDescription=" + this.a + ", avatar=" + this.b + ", name=" + this.c + ", id=" + this.d + ", clipsCount=" + this.e + ", isNft=" + this.f + ", verifyInfo=" + this.g + ", imageStatus=" + this.h + ')';
        }
    }

    /* compiled from: ProfileData.kt */
    public static final class b {
        public final ClipsAuthor a;
        public final ArrayList b = new ArrayList();

        public b(ClipsAuthor clipsAuthor) {
            this.a = clipsAuthor;
        }

        public final void a() {
            Long k = this.a.k();
            this.b.add(new lvd0(k != null ? k.longValue() : 0L, CounterType.Followers, true));
        }

        public final void b(boolean z) {
            this.b.add(new lvd0(this.a.f(), CounterType.Reacts, z));
        }

        public final void c() {
            ClipsAuthor clipsAuthor = this.a;
            if (clipsAuthor.g() > 0) {
                this.b.add(new lvd0(clipsAuthor.g(), CounterType.Following, true));
            }
        }

        public final void d(boolean z) {
            this.b.add(new lvd0(this.a.i(), CounterType.Views, z));
        }
    }

    public rvd0(Object obj, int i, a aVar, mvd0 mvd0Var, boolean z, boolean z2) {
        this.a = obj;
        this.b = i;
        this.c = aVar;
        this.d = mvd0Var;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvd0)) {
            return false;
        }
        rvd0 rvd0Var = (rvd0) obj;
        return epx.f(this.a, rvd0Var.a) && this.b == rvd0Var.b && epx.f(this.c, rvd0Var.c) && epx.f(this.d, rvd0Var.d) && this.e == rvd0Var.e && this.f == rvd0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + qoy.b((this.d.hashCode() + ((this.c.hashCode() + shy.a(this.b, qow.a(this.a) * 31, 31)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileData(clipsAuthor=");
        sb.append((Object) qow.b(this.a));
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", cardState=");
        sb.append(this.c);
        sb.append(", countersState=");
        sb.append(this.d);
        sb.append(", canWriteMessage=");
        sb.append(this.e);
        sb.append(", canEditProfileDescription=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
