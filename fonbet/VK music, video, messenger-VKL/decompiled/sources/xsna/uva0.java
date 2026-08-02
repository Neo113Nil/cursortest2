package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.music.AudioStream;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* compiled from: PlaybackAnalyticsSnapshotBuilder.kt */
/* loaded from: classes3.dex */
public final class uva0 {
    public final ex40 a;
    public final com.vk.music.audioeffect.a b;
    public final Object c;

    public uva0(com.vk.music.pref.a aVar, ex40 ex40Var, com.vk.music.audioeffect.a aVar2) {
        this.a = ex40Var;
        this.b = aVar2;
        this.c = msy.a(LazyThreadSafetyMode.NONE, new fqd(11, this, aVar));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    public final iwa0 a(kw40 kw40Var, p4b0 p4b0Var) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        List list;
        UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
        if (uiTrackingScreen == null || (mobileOfficialAppsCoreNavStat$EventScreen = uiTrackingScreen.a) == null) {
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE;
        }
        if (uiTrackingScreen == null || (list = j5g.O0(uiTrackingScreen.e)) == null) {
            list = EmptyList.b;
        }
        ak40 ak40Var = new ak40(mobileOfficialAppsCoreNavStat$EventScreen, list, uiTrackingScreen != null ? uiTrackingScreen.f : null);
        ex40 ex40Var = this.a;
        float b = ex40Var.b();
        ?? r2 = this.c;
        return new iwa0(kw40Var, p4b0Var, ak40Var, ex40Var.h(), ex40Var.C(), ex40Var.getConfig().b(), new a3b0(b, ((vv40) r2.getValue()).c(), ((vv40) r2.getValue()).a()), ex40Var.x(), ex40Var.g(), new AudioStream(ex40Var.H().a, ex40Var.H().b, null));
    }
}
