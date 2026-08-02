package xsna;

import android.app.Activity;
import android.os.SystemClock;
import android.util.LruCache;
import android.view.View;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vkontakte.android.data.b;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;

/* compiled from: NewsfeedTechStatsPlugin.kt */
/* loaded from: classes4.dex */
public final class f170 {
    public final Lazy a;
    public long b;
    public UUID c;
    public boolean d;
    public boolean e;

    public f170(Lazy<? extends NewsFeedBridgeComponent> lazy) {
        this.a = lazy;
    }

    public final mzp0 a() {
        UUID uuid = this.c;
        if (uuid == null) {
            return null;
        }
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        return rzp0.e(uuid);
    }

    public final void b() {
        ce60.b.getClass();
        if (ce60.e) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.b;
        dx90 dx90Var = ow90.e;
        dx90Var.getClass();
        dx90Var.k = System.currentTimeMillis();
        dx90Var.r();
        ce60.e = true;
        ((NewsFeedBridgeComponent) this.a.getValue()).Ad().x();
        b.d dVar = new b.d("screen_loading_time");
        dVar.b("news", "screen");
        dVar.b(Long.valueOf(uptimeMillis), "time");
        dVar.e();
        ysg0.b.a(new cw60());
    }

    public final void c(List<? extends ol60> list, View view, yw90 yw90Var) {
        Object obj;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ol60 ol60Var = (ol60) obj;
            if ((ol60Var instanceof z1c0) || (ol60Var instanceof o070)) {
                break;
            }
        }
        if (obj == null || this.e) {
            return;
        }
        this.e = true;
        mzp0 a = a();
        if (a != null) {
            a.d(view);
        }
        if (yw90Var != null) {
            yw90Var.a();
        }
        if (((Boolean) com.vk.core.apps.a.m.getValue()).booleanValue()) {
            c63 c63Var = c63.a;
            Activity b = c63.b();
            if (b != null) {
                b.reportFullyDrawn();
            }
        }
    }
}
