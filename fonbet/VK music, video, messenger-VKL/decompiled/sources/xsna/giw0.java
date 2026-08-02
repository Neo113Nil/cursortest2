package xsna;

import com.vk.voip.ui.calls.presentation.feature.handler.VoipCallServiceBannerHandler;
import java.util.ArrayList;

/* compiled from: VoipCallServicePatch.kt */
/* loaded from: classes7.dex */
public interface giw0 extends xl50 {

    /* compiled from: VoipCallServicePatch.kt */
    public static final class a implements giw0 {
        public final boolean b;

        public a(boolean z) {
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
            aVar.getClass();
            return this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(false) * 31);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("Empty(isFromSearch=false, isContactsSyncShowEnabled="), this.b, ')');
        }
    }

    /* compiled from: VoipCallServicePatch.kt */
    public static final class b implements giw0 {
        public final Throwable b;

        public b(Throwable th) {
            this.b = th;
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
            return oq.c(new StringBuilder("GlobalError(throwable="), this.b, ')');
        }
    }

    /* compiled from: VoipCallServicePatch.kt */
    public static abstract class c implements giw0 {

        /* compiled from: VoipCallServicePatch.kt */
        public static final class a extends c {
            public final VoipCallServiceBannerHandler.a b;
            public final ArrayList c;
            public final ArrayList d;
            public final int e;

            public a(VoipCallServiceBannerHandler.a aVar, ArrayList arrayList, ArrayList arrayList2, int i) {
                this.b = aVar;
                this.c = arrayList;
                this.d = arrayList2;
                this.e = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.b, aVar.b) && this.c.equals(aVar.c) && this.d.equals(aVar.d) && this.e == aVar.e;
            }

            public final int hashCode() {
                return Integer.hashCode(this.e) + qr.a(this.d, qr.a(this.c, this.b.hashCode() * 31, 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Result(banner=");
                sb.append(this.b);
                sb.append(", importantFriends=");
                sb.append(this.c);
                sb.append(", allFriends=");
                sb.append(this.d);
                sb.append(", allFriendsCount=");
                return vu5.b(sb, this.e, ')');
            }
        }
    }

    /* compiled from: VoipCallServicePatch.kt */
    public static final class d implements giw0 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -551669692;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: VoipCallServicePatch.kt */
    public static final class e implements giw0 {
        public final VoipCallServiceBannerHandler.a b;

        public e(VoipCallServiceBannerHandler.a aVar) {
            this.b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateBanners(banner=" + this.b + ')';
        }
    }

    /* compiled from: VoipCallServicePatch.kt */
    public static final class f implements giw0 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            ((f) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        public final String toString() {
            return "UpdateContactsSync(isContactsSyncShowEnabled=false)";
        }
    }
}
