package xsna;

import com.vk.core.store.entity.models.NotificationMentions;
import java.util.List;

/* compiled from: MentionNotificationCache.kt */
/* loaded from: classes5.dex */
public final class y320 implements w8i {
    public static final y320 b = new y320();
    public static final bpn0 c = new bpn0(new com.vk.movika.sdk.android.defaultplayer.interactive.b(19));

    /* compiled from: MentionNotificationCache.kt */
    public static final class a {
        public final int a;
        public final String b;

        public a(int i, String str) {
            this.a = i;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.a) * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationInfo(notificationId=");
            sb.append(this.a);
            sb.append(", notificationTagId=");
            return ho8.a(sb, this.b, ')');
        }
    }

    public static io.reactivex.rxjava3.internal.operators.single.t a(int i, long j) {
        return new io.reactivex.rxjava3.internal.operators.single.t(b(j), new qj4(new u320(i, j), 20));
    }

    public static io.reactivex.rxjava3.internal.operators.maybe.l0 b(long j) {
        return new io.reactivex.rxjava3.internal.operators.maybe.l0(((qug0) c.getValue()).a(defpackage.k0.a(j, "push_mention_"), io.reactivex.rxjava3.schedulers.a.b()), new NotificationMentions((List) null, 3));
    }

    public static io.reactivex.rxjava3.core.a c(long j, NotificationMentions notificationMentions) {
        return ((qug0) c.getValue()).b(defpackage.k0.a(j, "push_mention_"), notificationMentions, io.reactivex.rxjava3.schedulers.a.b());
    }
}
