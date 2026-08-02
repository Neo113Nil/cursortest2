package defpackage;

import com.ybsdk.rconfig.NotificationChannels;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class f2g0 {
    public final /* synthetic */ b a;

    public f2g0(b bVar) {
        this.a = bVar;
    }

    public final ArrayList a() {
        b bVar = this.a;
        List<NotificationChannels.YbNotificationChannel> channels = ((NotificationChannels) bVar.d(bVar.i.m).getData()).getChannels();
        ArrayList arrayList = new ArrayList(tcc.n(channels, 10));
        Iterator<T> it = channels.iterator();
        while (it.hasNext()) {
            arrayList.add(((NotificationChannels.YbNotificationChannel) it.next()).toFeatureNotificationChanel());
        }
        return arrayList;
    }

    public final boolean b() {
        return ((CommonFeatureFlag) this.a.d(wlp.T).getData()).isEnabled();
    }
}
