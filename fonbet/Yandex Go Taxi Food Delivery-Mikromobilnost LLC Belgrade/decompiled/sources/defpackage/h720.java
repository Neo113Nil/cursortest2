package defpackage;

import android.os.Handler;
import com.yandex.messaging.analytics.fps.a;

/* loaded from: classes15.dex */
public final class h720 {
    public final a a;
    public boolean b;
    public final Handler c = new Handler();

    public h720(a aVar) {
        this.a = aVar;
    }

    public final void a() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.c.removeCallbacksAndMessages(null);
        this.a.b();
    }
}
