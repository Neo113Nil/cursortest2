package xsna;

import com.vk.core.store.entity.models.NotificationMention;
import com.vk.core.store.entity.models.NotificationMentions;
import java.util.Iterator;
import java.util.concurrent.Callable;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class u320 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ u320(int i, long j) {
        this.b = i;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        final NotificationMentions notificationMentions = (NotificationMentions) obj;
        final int i = this.b;
        return new io.reactivex.rxjava3.internal.operators.maybe.o(new io.reactivex.rxjava3.internal.operators.maybe.p(new Callable() { // from class: xsna.w320
            @Override // java.util.concurrent.Callable
            public final Object call() {
                NotificationMentions notificationMentions2 = NotificationMentions.this;
                Iterator<NotificationMention> it = notificationMentions2.d().iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    if (it.next().d() == i) {
                        break;
                    }
                    i2++;
                }
                if (i2 == -1) {
                    return null;
                }
                return new Pair(Integer.valueOf(i2), notificationMentions2.d().get(i2));
            }
        }), new vj0(new ddm(this.c, notificationMentions), 26));
    }
}
