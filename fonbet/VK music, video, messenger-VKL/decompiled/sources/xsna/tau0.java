package xsna;

import android.net.Uri;
import com.my.tracker.miniapps.MiniAppEventBuilder;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.CommonStat$TypeTrackCodeItem;
import com.vk.stat.scheme.MobileOfficialAppsMiniappsStat$AppIdItem;
import com.vk.stat.scheme.MobileOfficialAppsMiniappsStat$SessionUuidItem;
import com.vk.stat.scheme.MobileOfficialAppsMiniappsStat$TypeMiniAppOpenItem;
import com.vk.stat.scheme.MobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem;
import com.vk.stat.scheme.MobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem;
import com.vk.stat.scheme.MobileOfficialAppsMiniappsStat$TypeMiniAppSessionItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.superapp.bridges.dto.analytics.MiniAppPolicyScreenEventType;
import com.vk.superapp.bridges.dto.analytics.MiniAppSessionType;
import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxAction;
import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.pgn0;
import xsna.udx0;

/* compiled from: VkAppsAnalytics.kt */
/* loaded from: classes6.dex */
public final class tau0 implements k1w0, s13 {
    public final long a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public boolean g;
    public final bpn0 h = new bpn0(new zo80(12));
    public final bpn0 i = new bpn0(new hvr0(this, 13));
    public final bpn0 j = new bpn0(new akd0(this, 24));
    public final ConcurrentLinkedQueue<c> k = new ConcurrentLinkedQueue<>();

    /* compiled from: VkAppsAnalytics.kt */
    public static class a extends c {
        public a(long j, String str, String str2) {
            super(j, str);
            this.b.put("action", str2);
        }
    }

    /* compiled from: VkAppsAnalytics.kt */
    public static final class b extends c {
    }

    /* compiled from: VkAppsAnalytics.kt */
    public static abstract class c {
        public final String a;
        public final LinkedHashMap b;

        public c(long j, String str) {
            this.a = str;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.b = linkedHashMap;
            linkedHashMap.put("app_id", String.valueOf(j));
        }
    }

    /* compiled from: VkAppsAnalytics.kt */
    public static final class d extends a {
    }

    public tau0(long j, boolean z, String str, String str2, String str3, String str4) {
        this.a = j;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public static String h(String str, String str2) {
        List c0 = drm0.c0(drm0.g0(str, str2, str), new String[]{"&"}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : c0) {
            String str3 = (String) j5g.a0(drm0.c0((String) obj, new String[]{"="}, 0, 6));
            if (str3 == null) {
                str3 = "";
            }
            if (!str3.equals("sign")) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = v1v.a('&', (String) next, (String) it.next());
        }
        return (String) next;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cf, code lost:
    
        if (r11 < r7) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d1, code lost:
    
        r7 = "#";
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00d3, code lost:
    
        r7 = "?";
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00dc, code lost:
    
        if (r11 != (-1)) goto L55;
     */
    @Override // xsna.k1w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j) {
        String str;
        String str2;
        String h;
        Uri parse;
        Set<String> queryParameterNames;
        if (this.a != j) {
            return;
        }
        String str3 = this.e;
        boolean z = this.b;
        if (!z) {
            udx0 udx0Var = e370.i;
            if (udx0Var == null) {
                udx0Var = null;
            }
            udx0Var.getClass();
            MobileOfficialAppsMiniappsStat$AppIdItem mobileOfficialAppsMiniappsStat$AppIdItem = new MobileOfficialAppsMiniappsStat$AppIdItem(Long.valueOf(j));
            String str4 = this.d;
            MobileOfficialAppsMiniappsStat$TypeMiniAppOpenItem mobileOfficialAppsMiniappsStat$TypeMiniAppOpenItem = new MobileOfficialAppsMiniappsStat$TypeMiniAppOpenItem(mobileOfficialAppsMiniappsStat$AppIdItem, str4 != null ? new CommonStat$TypeTrackCodeItem(str4) : null);
            String str5 = this.c;
            new iid0(udx0.a(str5), SchemeStat$TypeAction.a.b(null, null, mobileOfficialAppsMiniappsStat$TypeMiniAppOpenItem, 3)).q();
            d dVar = new d(j, "vk_apps_action", "open_app");
            LinkedHashMap linkedHashMap = dVar.b;
            if (str5 != null) {
                linkedHashMap.put("source", str5);
            }
            if (str4 != null) {
                linkedHashMap.put("track_code", str4);
            }
            if (str3 != null && (queryParameterNames = (parse = Uri.parse(str3)).getQueryParameterNames()) != null) {
                for (String str6 : queryParameterNames) {
                    String queryParameter = parse.getQueryParameter(str6);
                    if (queryParameter != null) {
                        linkedHashMap.put(str6, queryParameter);
                    }
                }
            }
            this.k.add(dVar);
        }
        if (this.g) {
            d(j);
        }
        udx0 udx0Var2 = e370.i;
        if (udx0Var2 == null) {
            udx0Var2 = null;
        }
        wdx0 wdx0Var = e370.f;
        wdx0 wdx0Var2 = wdx0Var != null ? wdx0Var : null;
        new pgn0.b();
        UserId userId = wdx0Var2.c().b;
        String str7 = "";
        String str8 = this.f;
        if (str8 == null || (str = h(str8, "?")) == null) {
            str = "";
        }
        int K = str3 != null ? drm0.K(0, 6, str3, "#", false) : -1;
        int K2 = str3 != null ? drm0.K(0, 6, str3, "?", false) : -1;
        if (K == -1 || K2 == -1) {
            if (K == -1 && K2 == -1) {
                str2 = "";
            }
        }
        if (str2.length() > 0 && str3 != null && (h = h(brm0.y(str3, "?amp;", "?"), str2)) != null) {
            str7 = h;
        }
        if (str7.length() > 0 && !drm0.D(str, str7, false)) {
            str = v1v.a(str2.equals("#") ? '#' : '&', str, str7);
        }
        udx0Var2.getClass();
        uc00 uc00Var = uc00.a;
        uc00.n(new tc00(MiniAppEventBuilder.newEventBuilder(String.valueOf(j), String.valueOf(userId.b)).openEvent(str).build()));
        this.g = true;
        if (z) {
            f();
        }
    }

    @Override // xsna.k1w0
    public final void d(long j) {
        if (this.a != j) {
            return;
        }
        boolean z = this.g;
        bpn0 bpn0Var = this.h;
        if (z) {
            long convert = TimeUnit.SECONDS.convert(((hgl0) bpn0Var.getValue()).a(), TimeUnit.MILLISECONDS);
            udx0 udx0Var = e370.i;
            if (udx0Var == null) {
                udx0Var = null;
            }
            wdx0 wdx0Var = e370.f;
            if (wdx0Var == null) {
                wdx0Var = null;
            }
            new pgn0.b();
            UserId userId = wdx0Var.c().b;
            udx0Var.getClass();
            uc00 uc00Var = uc00.a;
            uc00.n(new tc00(MiniAppEventBuilder.newEventBuilder(String.valueOf(j), String.valueOf(userId.b)).closeEvent().build()));
            udx0 udx0Var2 = e370.i;
            if (udx0Var2 == null) {
                udx0Var2 = null;
            }
            MiniAppSessionType miniAppSessionType = MiniAppSessionType.SESSION;
            bpn0 bpn0Var2 = this.i;
            String str = (String) bpn0Var2.getValue();
            udx0Var2.getClass();
            MobileOfficialAppsMiniappsStat$AppIdItem mobileOfficialAppsMiniappsStat$AppIdItem = new MobileOfficialAppsMiniappsStat$AppIdItem(Long.valueOf(j));
            Integer valueOf = Integer.valueOf((int) convert);
            MobileOfficialAppsMiniappsStat$SessionUuidItem mobileOfficialAppsMiniappsStat$SessionUuidItem = new MobileOfficialAppsMiniappsStat$SessionUuidItem(str);
            String str2 = this.d;
            new iid0(udx0.a(this.c), SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsMiniappsStat$TypeMiniAppSessionItem(null, mobileOfficialAppsMiniappsStat$AppIdItem, valueOf, mobileOfficialAppsMiniappsStat$SessionUuidItem, str2 != null ? new CommonStat$TypeTrackCodeItem(str2) : null, 1, null), 3)).q();
            String str3 = (String) bpn0Var2.getValue();
            b bVar = new b(j, this.b ? "games_session" : "vk_apps_session");
            String valueOf2 = String.valueOf(convert);
            LinkedHashMap linkedHashMap = bVar.b;
            linkedHashMap.put("duration", valueOf2);
            linkedHashMap.put("session_uuid", str3);
            if (str2 != null) {
                linkedHashMap.put("track_code", str2);
            }
            this.k.add(bVar);
            this.g = false;
            f();
        }
        hgl0 hgl0Var = (hgl0) bpn0Var.getValue();
        if (hgl0Var.a) {
            hgl0Var.a = false;
            hgl0Var.b = 0L;
            hgl0Var.c = 0L;
        }
    }

    @Override // xsna.s13
    public final void e(MiniAppSettingsBoxType miniAppSettingsBoxType, MiniAppSettingsBoxAction miniAppSettingsBoxAction) {
        MobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem.Action action;
        MobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem.Name name;
        if (this.b) {
            return;
        }
        udx0 udx0Var = e370.i;
        if (udx0Var == null) {
            udx0Var = null;
        }
        udx0Var.getClass();
        MobileOfficialAppsMiniappsStat$AppIdItem mobileOfficialAppsMiniappsStat$AppIdItem = new MobileOfficialAppsMiniappsStat$AppIdItem(Long.valueOf(this.a));
        int i = udx0.a.$EnumSwitchMapping$5[miniAppSettingsBoxAction.ordinal()];
        if (i == 1) {
            action = MobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem.Action.SHOW;
        } else if (i == 2) {
            action = MobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem.Action.ALLOW;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            action = MobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem.Action.DENY;
        }
        switch (udx0.a.$EnumSwitchMapping$6[miniAppSettingsBoxType.ordinal()]) {
            case 1:
                name = MobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem.Name.JOIN_GROUP;
                break;
            case 2:
                name = MobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem.Name.GET_GEODATA;
                break;
            case 3:
                name = MobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem.Name.ALLOW_NOTIFICATIONS;
                break;
            case 4:
                name = MobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem.Name.ALLOW_GLOBAL_NOTIFICATIONS;
                break;
            case 5:
                name = MobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem.Name.GET_EMAIL;
                break;
            case 6:
                name = MobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem.Name.GET_PHONE_NUMBER;
                break;
            case 7:
                name = MobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem.Name.ALLOW_MESSAGES_FROM_GROUP;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        MobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem mobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem = new MobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem(name, action, mobileOfficialAppsMiniappsStat$AppIdItem);
        new und0(udx0.a(this.c), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, 0L, null, this.d, null, 42, null), mobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem, 2)).q();
    }

    public final void f() {
        ConcurrentLinkedQueue<c> concurrentLinkedQueue = this.k;
        Iterator<c> it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            c next = it.next();
            udx0 udx0Var = e370.i;
            if (udx0Var == null) {
                udx0Var = null;
            }
            udx0Var.c(next.a, next.b);
        }
        concurrentLinkedQueue.clear();
    }

    public final void g(String str, MiniAppPolicyScreenEventType miniAppPolicyScreenEventType) {
        MobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem.Action action;
        udx0 udx0Var = e370.i;
        if (udx0Var == null) {
            udx0Var = null;
        }
        udx0Var.getClass();
        long j = this.a;
        MobileOfficialAppsMiniappsStat$AppIdItem mobileOfficialAppsMiniappsStat$AppIdItem = new MobileOfficialAppsMiniappsStat$AppIdItem(Long.valueOf(j));
        switch (udx0.a.$EnumSwitchMapping$4[miniAppPolicyScreenEventType.ordinal()]) {
            case 1:
                action = MobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem.Action.MINI_APP_VK_CONNECT_START_SCREEN_APP_CLOSE;
                break;
            case 2:
                action = MobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem.Action.MINI_APP_VK_CONNECT_LAUNCH_SCREEN_VIEW_PERMISSIONS;
                break;
            case 3:
                action = MobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem.Action.MINI_APP_VK_CONNECT_LAUNCH_SCREEN_VIEW_CONNECT_POLICY;
                break;
            case 4:
                action = MobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem.Action.MINI_APP_VK_CONNECT_LAUNCH_SCREEN_VIEW_CONNECT_TERMS;
                break;
            case 5:
                action = MobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem.Action.MINI_APP_VK_CONNECT_LAUNCH_SCREEN_VIEW_SERVICE_POLICY;
                break;
            case 6:
                action = MobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem.Action.MINI_APP_VK_CONNECT_LAUNCH_SCREEN_VIEW_SERVICE_TERMS;
                break;
            case 7:
                action = MobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem.Action.MINI_APP_VK_CONNECT_LAUNCH_SCREEN_ENTER;
                break;
            case 8:
                action = MobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem.Action.MINI_APP_VK_CONNECT_LAUNCH_SCREEN_PERMISSIONS_ACCEPTED;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String str2 = this.d;
        new und0(udx0.a(this.c), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, 0L, null, str2, null, 42, null), new MobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem(action, mobileOfficialAppsMiniappsStat$AppIdItem, str2 != null ? new CommonStat$TypeTrackCodeItem(str2) : null), 2)).q();
        this.k.add(new a(j, this.b ? "games_action" : "vk_apps_action", str));
    }
}
