package xsna;

import androidx.core.app.NotificationCompat;
import com.vk.instantjobs.InstantJob;
import java.util.Map;
import xsna.u6x;

/* compiled from: BaseInstantJob.kt */
/* loaded from: classes11.dex */
public abstract class ye6 extends InstantJob {
    @Override // com.vk.instantjobs.InstantJob
    public final void C(Object obj, Map<InstantJob, ? extends InstantJob.a> map, NotificationCompat.h hVar) {
        K(map, hVar);
    }

    public String F() {
        return null;
    }

    public int G() {
        return 1;
    }

    public abstract void J(u6x.a aVar);

    @Override // com.vk.instantjobs.InstantJob
    public void h(Object obj) {
        E();
    }

    @Override // com.vk.instantjobs.InstantJob
    public String k(Object obj) {
        return F();
    }

    @Override // com.vk.instantjobs.InstantJob
    public final int l(Object obj) {
        return G();
    }

    @Override // com.vk.instantjobs.InstantJob
    public void u(Object obj) {
        H();
    }

    @Override // com.vk.instantjobs.InstantJob
    public void v(Object obj, Throwable th) {
        I((zyx) obj, th);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final void w(Object obj, u6x.a aVar) {
        J(aVar);
    }

    public void E() {
    }

    public void H() {
    }

    public void I(zyx zyxVar, Throwable th) {
    }

    public void K(Map map, NotificationCompat.h hVar) {
    }
}
