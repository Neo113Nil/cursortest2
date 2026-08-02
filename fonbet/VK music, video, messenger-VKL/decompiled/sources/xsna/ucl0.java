package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: StickersSearchClickTracker.kt */
/* loaded from: classes6.dex */
public final class ucl0 {
    public final String a;
    public final long b;

    public ucl0(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final void a(long j, MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action) {
        if (j != this.b) {
            return;
        }
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.STICKERS, null, null, null, this.a, null, 46, null), new MobileOfficialAppsSearchStat$TypeSearchClickItem(action, null, null, null, null, 30, null), 2);
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }
}
