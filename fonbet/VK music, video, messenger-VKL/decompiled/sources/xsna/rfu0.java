package xsna;

import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeMiniAppItem;

/* compiled from: VkBrowserAnalyticsImpl.kt */
/* loaded from: classes6.dex */
public final class rfu0 implements qfu0 {
    public final long a;
    public final boolean b;
    public final String c;
    public final Long d;

    public rfu0(boolean z, String str, Long l, long j) {
        this.a = j;
        this.b = z;
        this.c = str;
        this.d = l;
    }

    @Override // xsna.qfu0
    public final void a() {
        c(SchemeStat$TypeMiniAppItem.Type.AUTO_ADD_TO_HOME_SCREEN_CLICK);
    }

    @Override // xsna.qfu0
    public final void b(boolean z) {
        c(z ? SchemeStat$TypeMiniAppItem.Type.AUTO_ADD_TO_HOME_SCREEN : SchemeStat$TypeMiniAppItem.Type.ADD_TO_HOME_SCREEN);
    }

    public final void c(SchemeStat$TypeMiniAppItem.Type type) {
        boolean z = this.b;
        new bjc(z ? MobileOfficialAppsCoreNavStat$EventScreen.GAME : MobileOfficialAppsCoreNavStat$EventScreen.MINI_APP, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(z ? SchemeStat$EventItem.Type.GAME : SchemeStat$EventItem.Type.MINI_APP, Long.valueOf(this.a), this.d, null, this.c, null, 40, null), new SchemeStat$TypeMiniAppItem(type, null, null, 6, null), 2)).q();
    }
}
