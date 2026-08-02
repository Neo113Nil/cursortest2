package xsna;

import xsna.tvw0;

/* compiled from: VoipPushStatisticsImpl.kt */
/* loaded from: classes7.dex */
public final class uvw0 implements tvw0 {

    /* compiled from: VoipPushStatisticsImpl.kt */
    public static final class a {
        public final boolean a;
        public final String b;
        public final String c;
        public final Long d;
        public final Integer e;

        public a() {
            this(false, "", "", null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            int a = urd0.a(urd0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
            Long l = this.d;
            int hashCode = (a + (l == null ? 0 : l.hashCode())) * 31;
            Integer num = this.e;
            return hashCode + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PushCallInfo(isGroupCall=");
            sb.append(this.a);
            sb.append(", callId=");
            sb.append(this.b);
            sb.append(", fromId=");
            sb.append(this.c);
            sb.append(", notificationId=");
            sb.append(this.d);
            sb.append(", notificationTryId=");
            return uqi.b(sb, this.e, ')');
        }

        public a(boolean z, String str, String str2, Long l, Integer num) {
            this.a = z;
            this.b = str;
            this.c = str2;
            this.d = l;
            this.e = num;
        }
    }

    @Override // xsna.tvw0
    public final void a(tvw0.a aVar) {
        asu0.a.getClass();
        asu0.x().execute(new wq8(8, this, aVar));
    }
}
