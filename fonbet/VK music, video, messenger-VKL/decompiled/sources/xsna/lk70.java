package xsna;

import com.vk.notifications.core.item.NotificationImage;
import com.vk.notifications.core.item.a;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.random.Random;
import xsna.ha70;
import xsna.tlo0;
import xsna.w770;

/* compiled from: NotificationsWarmupContent.kt */
/* loaded from: classes4.dex */
public final class lk70 {
    public static final Object a = msy.a(LazyThreadSafetyMode.NONE, new y84(15));
    public static final List<w770> b;
    public static final List<com.vk.notifications.core.item.a> c;
    public static final ArrayList d;

    /* compiled from: NotificationsWarmupContent.kt */
    public static final class a implements w8i {
    }

    static {
        String a2 = a();
        tlo0.Companion.getClass();
        tlo0.c cVar = tlo0.c.a;
        b = e43.l(w770.b.a, new w770.c(a2, null, cVar), new w770.d(a(), null, cVar), new w770.a(a(), a(), cVar));
        Random.b.getClass();
        int k = Random.c.k(5);
        ArrayList arrayList = new ArrayList(k);
        for (int i = 0; i < k; i++) {
            arrayList.add(new NotificationImage(a(), null, null, 14));
        }
        c = e43.l(null, new a.c(arrayList, (NotificationImage.Shape) j5g.w0(NotificationImage.Shape.h(), Random.b)), new a.C1441a(7), new a.C1441a(4), new a.b(e43.l(a(), a()), "abc"));
        ArrayList arrayList2 = new ArrayList(3);
        for (int i2 = 0; i2 < 3; i2++) {
            arrayList2.add(new de70(oq.d(tlo0.Companion, String.valueOf(i2)), R.drawable.vk_icon_settings_outline_28, false, ha70.y.a));
        }
        d = arrayList2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public static final String a() {
        return (String) a.getValue();
    }
}
