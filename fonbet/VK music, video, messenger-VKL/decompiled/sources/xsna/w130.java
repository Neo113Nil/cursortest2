package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.user.ReactionUserProfile;

/* compiled from: ModalPostReactionsTabPatch.kt */
/* loaded from: classes4.dex */
public abstract class w130 implements xl50 {

    /* compiled from: ModalPostReactionsTabPatch.kt */
    public static final class a extends w130 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -255243930;
        }

        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: ModalPostReactionsTabPatch.kt */
    public static final class b extends w130 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1339357466;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: ModalPostReactionsTabPatch.kt */
    public static final class c extends w130 {
        public final q030 b;

        public c(q030 q030Var) {
            this.b = q030Var;
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
            return "UpdateAnalyticsInfo(analyticsInfo=" + this.b + ')';
        }
    }

    /* compiled from: ModalPostReactionsTabPatch.kt */
    public static final class d extends w130 {
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
            StringBuilder sb = new StringBuilder("UpdateInfo(info=");
            sb.append(this.b);
            sb.append(", isFirstPage=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }
}
