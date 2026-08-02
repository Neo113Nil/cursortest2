package xsna;

import android.os.SystemClock;
import com.vk.stat.scheme.CommonOnboardingStat$TypeUiHintItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: HintEventsBuilder.kt */
/* loaded from: classes5.dex */
public final class u6v {
    public final String a;
    public long b;
    public MobileOfficialAppsCoreNavStat$EventScreen c = MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE;

    public u6v(String str) {
        this.a = str;
    }

    public final void a(CommonOnboardingStat$TypeUiHintItem.Action action) {
        new bjc(this.c, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.HINT, null, null, null, null, null, 62, null), new CommonOnboardingStat$TypeUiHintItem(this.a, action, (int) (SystemClock.elapsedRealtime() - this.b)), 2)).q();
    }
}
