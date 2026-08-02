package xsna;

import android.os.SystemClock;
import com.vk.stat.scheme.MobileOfficialAppsCoreEncodingStat$EventTimeItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem;

/* compiled from: VerticalizationPerfTracker.kt */
/* loaded from: classes16.dex */
public final class zpr0 {
    public final jcf0 a;
    public final long b = SystemClock.elapsedRealtime();

    public zpr0(jcf0 jcf0Var) {
        this.a = jcf0Var;
    }

    public final void a(Throwable th) {
        MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem = new MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem(((Number) this.a.invoke()).longValue(), MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.ContentType.STORY, x260.b(com.vk.core.utils.newtork.b.c()), null, null, null, e43.l(new MobileOfficialAppsCoreEncodingStat$EventTimeItem(MobileOfficialAppsCoreEncodingStat$EventTimeItem.EventType.START, this.b), new MobileOfficialAppsCoreEncodingStat$EventTimeItem(MobileOfficialAppsCoreEncodingStat$EventTimeItem.EventType.FINISH, SystemClock.elapsedRealtime())), null, null, null, null, th != null ? MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.ErrorType.VERTICALIZATION : null, th != null ? String.valueOf(th) : null, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventType.VERTICALIZATION, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147469240, null);
        kx6 kx6Var = new kx6();
        kx6Var.f = mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem;
        kx6Var.q();
    }
}
