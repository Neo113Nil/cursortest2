package xsna;

import com.vk.stat.scheme.CommonAudioStat$TypeAudioUiNavigationItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: PlayerNavigationAnalyticsTracker.kt */
/* loaded from: classes3.dex */
public interface x2b0 {

    /* compiled from: PlayerNavigationAnalyticsTracker.kt */
    public static final class b {
        public final CommonAudioStat$TypeAudioUiNavigationItem a;
        public final MobileOfficialAppsCoreNavStat$EventScreen b;
        public final boolean c;

        public b(CommonAudioStat$TypeAudioUiNavigationItem commonAudioStat$TypeAudioUiNavigationItem, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, boolean z) {
            this.a = commonAudioStat$TypeAudioUiNavigationItem;
            this.b = mobileOfficialAppsCoreNavStat$EventScreen;
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
            return this.a.equals(bVar.a) && this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 961)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PlayerNavigationPayload(statNavigationItem=");
            sb.append(this.a);
            sb.append(", fromBlockId=null, fromScreen=");
            sb.append(this.b);
            sb.append(", isTransitionForSwipe=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    static /* synthetic */ void c(x2b0 x2b0Var, String str, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            mobileOfficialAppsCoreNavStat$EventScreen = null;
        }
        x2b0Var.d(str, mobileOfficialAppsCoreNavStat$EventScreen, (i & 8) == 0);
    }

    void a(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, CommonAudioStat$TypeAudioUiNavigationItem.EventType eventType, boolean z);

    void d(String str, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, boolean z);

    /* compiled from: PlayerNavigationAnalyticsTracker.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final x2b0 STUB = new C3970a();

        public final x2b0 getSTUB() {
            return STUB;
        }

        /* compiled from: PlayerNavigationAnalyticsTracker.kt */
        /* renamed from: xsna.x2b0$a$a, reason: collision with other inner class name */
        public static final class C3970a implements x2b0 {
            @Override // xsna.x2b0
            public final void a(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, CommonAudioStat$TypeAudioUiNavigationItem.EventType eventType, boolean z) {
            }

            @Override // xsna.x2b0
            public final void d(String str, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, boolean z) {
            }
        }
    }
}
