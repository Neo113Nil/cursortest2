package defpackage;

import com.ybsdk.feature.push.impl.a;
import com.ybsdk.rconfig.NotificationChannels;
import com.ybsdk.rconfig.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class ajg implements clg {
    public final /* synthetic */ wt51 a;
    public final /* synthetic */ b b;
    public final /* synthetic */ ut51 c;

    public ajg(wt51 wt51Var, b bVar, ut51 ut51Var) {
        this.a = wt51Var;
        this.b = bVar;
        this.c = ut51Var;
    }

    public final void a() {
        b bVar = this.b;
        List<NotificationChannels.YbNotificationChannel> channels = ((NotificationChannels) bVar.d(bVar.i.m).getData()).getChannels();
        ArrayList arrayList = new ArrayList(tcc.n(channels, 10));
        Iterator<T> it = channels.iterator();
        while (it.hasNext()) {
            arrayList.add(((NotificationChannels.YbNotificationChannel) it.next()).toFeatureNotificationChanel());
        }
        u0a1.c(((x8g) ((a) this.a).a).a, arrayList);
    }
}
