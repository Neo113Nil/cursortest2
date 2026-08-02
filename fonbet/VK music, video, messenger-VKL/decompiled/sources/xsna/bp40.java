package xsna;

import com.vk.stat.scheme.CommonAudioStat$TypeAudioUiNavigationItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: MusicNavigationAnalyticPayloadBuilder.kt */
/* loaded from: classes.dex */
public interface bp40 {

    /* compiled from: MusicNavigationAnalyticPayloadBuilder.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public final CommonAudioStat$TypeAudioUiNavigationItem a;
        public final String b;
        public final MobileOfficialAppsCoreNavStat$EventScreen c;

        public a(CommonAudioStat$TypeAudioUiNavigationItem commonAudioStat$TypeAudioUiNavigationItem, String str, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
            this.a = commonAudioStat$TypeAudioUiNavigationItem;
            this.b = str;
            this.c = mobileOfficialAppsCoreNavStat$EventScreen;
        }

        public final String a() {
            return this.b;
        }

        public final MobileOfficialAppsCoreNavStat$EventScreen b() {
            return this.c;
        }

        public final CommonAudioStat$TypeAudioUiNavigationItem c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return "MusicNavigationPayload(statNavigationItem=" + this.a + ", fromBlockId=" + this.b + ", fromScreen=" + this.c + ')';
        }
    }

    void t(String str, CommonAudioStat$TypeAudioUiNavigationItem.EventType eventType);
}
