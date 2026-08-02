package xsna;

import com.vk.core.store.entity.models.NotificationMention;
import com.vk.core.store.entity.models.NotificationMentions;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class v320 implements izs {
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;

    public /* synthetic */ v320(int i, long j, int i2, String str) {
        this.b = j;
        this.c = i;
        this.d = str;
        this.e = i2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        NotificationMentions notificationMentions = (NotificationMentions) obj;
        y320 y320Var = y320.b;
        return y320.c(this.b, NotificationMentions.a(notificationMentions, j5g.v0(new NotificationMention(this.c, this.d, this.e, 8), notificationMentions.d())));
    }
}
