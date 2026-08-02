package xsna;

import androidx.core.app.NotificationCompat;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import java.util.List;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ImPushHelper.kt */
/* loaded from: classes7.dex */
public final class oaw {
    public final a a;
    public final Object b;

    /* compiled from: ImPushHelper.kt */
    public static final class a {
        public final boolean a() {
            return epx.f(j6i.a().e(), j6i.a().g());
        }
    }

    public oaw() {
        this(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
    
        if (xsna.c63.f != false) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0132 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(UserId userId, String str) {
        SchemeStat$EventItem schemeStat$EventItem;
        a aVar = this.a;
        if (!fkq0.c(userId)) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.w, new Object[]{"[Push][ImPushHelper]: checking push without owner, which is impossible"});
                return false;
            }
        } else if (!ule0.b.contains(str) && !ule0.i.contains(str)) {
            if (str.equals("unifylovina_notifications")) {
                List l2 = e43.l(Long.valueOf(InternalVkMiniApps.DATING.h().a), Long.valueOf(InternalVkMiniApps.VK_DATING_DEV.h().a));
                UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
                if (j5g.P(l2, (uiTrackingScreen == null || (schemeStat$EventItem = uiTrackingScreen.f) == null) ? null : schemeStat$EventItem.b())) {
                    c63 c63Var = c63.a;
                }
            }
            boolean z = rli0.q((uki0) this.b.getValue(), str) >= 0;
            if (aVar.a() && !z) {
                boolean c = j6i.a().i().c(true);
                boolean f = j6i.a().i().f(userId);
                L l3 = L.a;
                l3.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l3, L.LogType.d, new Object[]{zy60.c("[Push][ImPushHelper] shouldIgnorePushInMe: canShowNotificationsInVkApp=", ", isAuthorizedInVkApp=", c, f)});
                }
                if (!c || !f) {
                }
            } else if (!aVar.a() && z) {
                final boolean c2 = j6i.a().g().c(true);
                final boolean g = str.equals(NotificationCompat.CATEGORY_MESSAGE) ? j6i.a().g().g(userId) : str.equals("chat") ? j6i.a().g().h(userId) : true;
                final boolean f2 = j6i.a().g().f(userId);
                final boolean z2 = c2 && g && f2;
                L.d(new gzs() { // from class: xsna.naw
                    @Override // xsna.gzs
                    public final Object invoke() {
                        StringBuilder c3 = gp.c("[Push][ImPushHelper] shouldShowPushInMe(", "): isGlobalNotificationsEnabledInMe=", " isInAppNotificationsEnabledInMe=", z2, c2);
                        c3.append(g);
                        c3.append(" isAuthorizedInMe=");
                        c3.append(f2);
                        return c3.toString();
                    }
                });
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public oaw(int i) {
        a1w a1wVar = q1w.a;
        cau0 cau0Var = (a1wVar == null ? null : a1wVar).r().h;
        this.a = new a();
        this.b = msy.a(LazyThreadSafetyMode.NONE, new iy2(22));
    }
}
