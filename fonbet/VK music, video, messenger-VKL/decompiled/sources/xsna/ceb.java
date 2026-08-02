package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImCounterSettingsClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.fragments.UnreadCounterSettingsFragment;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ceb implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ceb(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Map<Long, bdb> map;
        int i;
        int i2;
        Map<Long, lj30> map2;
        long j;
        switch (this.b) {
            case 0:
                Collection<Long> collection = (Collection) this.d;
                boolean z = this.c;
                xgl0 xgl0Var = (xgl0) obj;
                r3b y = xgl0Var.y();
                Map<Long, bdb> d = xgl0Var.a().d(collection);
                Map<Long, lj30> r = y.r(collection);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (bdb bdbVar : d.values()) {
                    long j2 = bdbVar.b;
                    Long valueOf = Long.valueOf(j2);
                    lj30 lj30Var = (lj30) ((HashMap) r).get(Long.valueOf(j2));
                    vcb vcbVar = bdbVar.j;
                    if (vcbVar == null) {
                        vcbVar = bdbVar.i;
                    }
                    lj30 lj30Var2 = (lj30Var == null || !lj30Var.m || lj30Var.j) ? null : lj30Var;
                    int i3 = z ? vcbVar.b.j(0).b : vcbVar.b.b;
                    boolean c = lj30Var != null ? lj30Var.c() : false;
                    if (lj30Var2 != null) {
                        map = d;
                        i = i3;
                        i2 = (int) (lj30Var2.n / 1000);
                    } else {
                        map = d;
                        i = i3;
                        i2 = vcbVar.b.c;
                    }
                    int i4 = lj30Var2 != null ? lj30Var2.c : 0;
                    Pair pair = d370.d;
                    if (c) {
                        map2 = r;
                        j = 1;
                    } else {
                        map2 = r;
                        j = 0;
                    }
                    linkedHashMap.put(valueOf, new aeb(new gkx0(xo9.x(xo9.x(xo9.x(xo9.x(0L, pair, j), d370.c, i), d370.e, i2), d370.f, i4)), j2));
                    d = map;
                    r = map2;
                }
                break;
            case 1:
                com.vk.im.notification.settings.impl.a aVar = (com.vk.im.notification.settings.impl.a) this.d;
                boolean z2 = this.c;
                ((a1w) aVar.a.invoke()).x(new OnCacheInvalidateEvent("NotificationSettingsInteractorImpl", OnCacheInvalidateEvent.Reason.COMPLICATED_DB_CHANGE));
                hf8.b("com.vkontakte.android.COUNTERS_UPDATED");
                SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new MobileOfficialAppsImStat$TypeImCounterSettingsClick(MobileOfficialAppsImStat$TypeImCounterSettingsClick.Event.ENABLED, MobileOfficialAppsImStat$TypeImCounterSettingsClick.Label.CHATS_COUNTER, z2 ? MobileOfficialAppsImStat$TypeImCounterSettingsClick.LabelType.ALL : MobileOfficialAppsImStat$TypeImCounterSettingsClick.LabelType.WITH_PUSH), 2);
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
                uzp0 uzp0Var = UiTracker.h;
                uzp0Var.getClass();
                new bjc(c2, b, uzp0Var.a).q();
                break;
            default:
                UnreadCounterSettingsFragment unreadCounterSettingsFragment = (UnreadCounterSettingsFragment) this.d;
                boolean z3 = this.c;
                int i5 = UnreadCounterSettingsFragment.n0;
                ((b25) unreadCounterSettingsFragment.l0.getValue()).l(z3);
                a1w a1wVar = q1w.a;
                (a1wVar != null ? a1wVar : null).x(new OnCacheInvalidateEvent("UnreadCounterSettingsFragment", OnCacheInvalidateEvent.Reason.COMPLICATED_DB_CHANGE));
                hf8.b("com.vkontakte.android.COUNTERS_UPDATED");
                unreadCounterSettingsFragment.io();
                break;
        }
        return s3q0.a;
    }
}
