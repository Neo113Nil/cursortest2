package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ChannelPayoutItem.kt */
/* loaded from: classes16.dex */
public interface u7b extends hfz {

    /* compiled from: ChannelPayoutItem.kt */
    public static final class a implements u7b {
        public final String b;

        public a(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        @Override // xsna.hfz
        public final Number getItemId() {
            return 0;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Bankcard(maskedPan="), this.b, ')');
        }
    }

    /* compiled from: ChannelPayoutItem.kt */
    public static final class b implements u7b {
        public final String b;

        public b(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        @Override // xsna.hfz
        public final Number getItemId() {
            return 0;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("MeWithoutVkPay(name="), this.b, ')');
        }
    }

    /* compiled from: ChannelPayoutItem.kt */
    public static final class c implements u7b {
        public final UserId b;
        public final String c;
        public final boolean d;

        public c(UserId userId, String str, boolean z) {
            this.b = userId;
            this.c = str;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && this.d == cVar.d;
        }

        @Override // xsna.hfz
        public final Number getItemId() {
            return 0;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VkPayReceiver(id=");
            sb.append(this.b);
            sb.append(", name=");
            sb.append(this.c);
            sb.append(", isRecipient=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }
}
