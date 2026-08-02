package defpackage;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat$SubscriptionCallback;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public class ab10 {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();

    public final MediaBrowserCompat$SubscriptionCallback a(Bundle bundle) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return null;
            }
            if (yjb1.b((Bundle) arrayList.get(i), bundle)) {
                return (MediaBrowserCompat$SubscriptionCallback) this.a.get(i);
            }
            i++;
        }
    }

    public final void b(Bundle bundle, MediaBrowserCompat$SubscriptionCallback mediaBrowserCompat$SubscriptionCallback) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            ArrayList arrayList2 = this.a;
            if (i >= size) {
                arrayList2.add(mediaBrowserCompat$SubscriptionCallback);
                arrayList.add(bundle);
                return;
            } else {
                if (yjb1.b((Bundle) arrayList.get(i), bundle)) {
                    arrayList2.set(i, mediaBrowserCompat$SubscriptionCallback);
                    return;
                }
                i++;
            }
        }
    }
}
