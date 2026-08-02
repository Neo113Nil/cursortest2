package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.ReactionUserProfile;

/* compiled from: ModalPostReactionsTabAction.kt */
/* loaded from: classes4.dex */
public abstract class t130 implements kj50 {

    /* compiled from: ModalPostReactionsTabAction.kt */
    public static final class a extends t130 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1062776844;
        }

        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: ModalPostReactionsTabAction.kt */
    public static final class b extends t130 {
        public final UserId b;
        public final long c;
        public final String d;

        public b(long j, UserId userId, String str) {
            this.b = userId;
            this.c = j;
            this.d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && this.c == bVar.c && epx.f(this.d, bVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + bh10.a(Long.hashCode(this.b.b) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InitAnalytics(ownerId=");
            sb.append(this.b);
            sb.append(", itemId=");
            sb.append(this.c);
            sb.append(", trackCode=");
            return ho8.a(sb, this.d, ')');
        }
    }

    /* compiled from: ModalPostReactionsTabAction.kt */
    public static final class c extends t130 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 941968960;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: ModalPostReactionsTabAction.kt */
    public static final class d extends t130 {
        public final VKList<ReactionUserProfile> b;
        public final boolean c;

        public d(VKList<ReactionUserProfile> vKList, boolean z) {
            this.b = vKList;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && this.c == dVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ReactionsLoaded(reactions=");
            sb.append(this.b);
            sb.append(", isFirstPage=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }
}
