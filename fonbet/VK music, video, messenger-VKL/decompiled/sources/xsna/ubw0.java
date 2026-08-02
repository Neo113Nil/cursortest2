package xsna;

import com.vk.im.engine.models.ProfilesInfo;

/* compiled from: VoiceMessageNavigationEvent.kt */
/* loaded from: classes18.dex */
public abstract class ubw0 implements vl50 {

    /* compiled from: VoiceMessageNavigationEvent.kt */
    public static final class a extends ubw0 {
        public final long a;
        public final ProfilesInfo b;
        public final Integer c;

        public a(long j, ProfilesInfo profilesInfo, Integer num) {
            this.a = j;
            this.b = profilesInfo;
            this.c = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int b = ur.b(this.b, Long.hashCode(this.a) * 31, 31);
            Integer num = this.c;
            return b + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenDialog(dialogId=");
            sb.append(this.a);
            sb.append(", profiles=");
            sb.append(this.b);
            sb.append(", msgLocalId=");
            return uqi.b(sb, this.c, ')');
        }
    }
}
