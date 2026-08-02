package defpackage;

import android.app.Notification;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lab50;", "Ll050;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ab50 extends l050 {
    void startForeground(int i, Notification notification);

    void startForeground(ld50 ld50Var, boolean z);

    void stopForeground(int i);

    void stopSelf();
}
