package xsna;

import xsna.mwv;

/* compiled from: ImChannelNavGoAnalyticsItem.kt */
/* loaded from: classes2.dex */
public interface tyv extends mwv.a {

    /* compiled from: ImChannelNavGoAnalyticsItem.kt */
    public static final class a implements tyv {
        public final long a;

        public a(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("OpenRegularSupport(communityId="));
        }
    }
}
