package xsna;

import com.vk.im.engine.models.ProfilesInfo;

/* compiled from: VoiceMessageViewAction.kt */
/* loaded from: classes18.dex */
public abstract class wbw0 implements kj50 {

    /* compiled from: VoiceMessageViewAction.kt */
    public static final class a extends wbw0 {
        public final long b;
        public final ProfilesInfo c;
        public final Integer d;

        public a(long j, ProfilesInfo profilesInfo, Integer num) {
            this.b = j;
            this.c = profilesInfo;
            this.d = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            int b = ur.b(this.c, Long.hashCode(this.b) * 31, 31);
            Integer num = this.d;
            return b + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenDialog(dialogId=");
            sb.append(this.b);
            sb.append(", profiles=");
            sb.append(this.c);
            sb.append(", msgLocalId=");
            return uqi.b(sb, this.d, ')');
        }
    }
}
