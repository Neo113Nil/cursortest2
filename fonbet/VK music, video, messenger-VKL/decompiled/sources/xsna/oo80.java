package xsna;

import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: OngoingCallNavigationEvent.kt */
/* loaded from: classes7.dex */
public abstract class oo80 implements x49 {

    /* compiled from: OngoingCallNavigationEvent.kt */
    public static final class a extends oo80 {
        public final MobileOfficialAppsCoreNavStat$EventScreen a;

        public a(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
            this.a = mobileOfficialAppsCoreNavStat$EventScreen;
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
            return this.a == aVar.a;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "JoinCall(call=null, eventScreen=" + this.a + ')';
        }
    }

    /* compiled from: OngoingCallNavigationEvent.kt */
    public static final class b extends oo80 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "OpenMenu(call=null)";
        }
    }
}
