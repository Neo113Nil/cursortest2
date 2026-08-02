package androidx.core.app;

import android.content.ComponentName;
import android.support.v4.app.INotificationSideChannel;
import java.util.ArrayDeque;

/* loaded from: classes10.dex */
public final class q0 {
    public final ComponentName a;
    public INotificationSideChannel c;
    public boolean b = false;
    public final ArrayDeque d = new ArrayDeque();
    public int e = 0;

    public q0(ComponentName componentName) {
        this.a = componentName;
    }
}
