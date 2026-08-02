package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ChannelPayoutAction.kt */
/* loaded from: classes16.dex */
public interface n7b extends kj50 {

    /* compiled from: ChannelPayoutAction.kt */
    public static final class a implements n7b {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 2085508447;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: ChannelPayoutAction.kt */
    public static final class b implements n7b {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1068620429;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: ChannelPayoutAction.kt */
    public static final class c implements n7b {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -728874060;
        }

        public final String toString() {
            return "OnClickAcceptButton";
        }
    }

    /* compiled from: ChannelPayoutAction.kt */
    public static final class d implements n7b {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1889680080;
        }

        public final String toString() {
            return "OnClickChangePayout";
        }
    }

    /* compiled from: ChannelPayoutAction.kt */
    public static final class e implements n7b {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 546041310;
        }

        public final String toString() {
            return "OnClickClose";
        }
    }

    /* compiled from: ChannelPayoutAction.kt */
    public static final class f implements n7b {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1939025501;
        }

        public final String toString() {
            return "OnClickMeWithoutVkPay";
        }
    }

    /* compiled from: ChannelPayoutAction.kt */
    public static final class g implements n7b {
        public final UserId b;

        public g(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OnClickVkReceiver(id="), this.b, ')');
        }
    }

    /* compiled from: ChannelPayoutAction.kt */
    public static final class h implements n7b {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1817414700;
        }

        public final String toString() {
            return "Refresh";
        }
    }
}
