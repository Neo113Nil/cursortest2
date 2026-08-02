package xsna;

import android.text.TextUtils;
import com.my.tracker.MyTracker;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes.dex */
public final class dzy0 extends oi6 {

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    /* loaded from: classes14.dex */
    public static final class a {
        public static final String a;

        static {
            String str = null;
            try {
                String id = MyTracker.getTrackerConfig().getId();
                if (TextUtils.isEmpty(id)) {
                    gu8.c(null, "MyTrackerHelper: myTracker id is empty");
                } else {
                    str = id;
                }
            } catch (Throwable th) {
                eb3.a(null, new StringBuilder("MyTrackerHelper: Error occurred while working with myTracker, "), th);
            }
            a = str;
        }
    }
}
