package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsTabbarStat$TabbarItemName;
import com.vk.stat.scheme.MobileOfficialAppsTabbarStat$TypeTabbarItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.tabbar.core.api.domain.TabbarItem;
import com.vk.tabbar.core.api.domain.TabbarSuggestState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: TabbarSettingsAnalyticsImpl.kt */
/* loaded from: classes11.dex */
public final class nun0 implements mun0 {
    public static void d(int i, String str, MobileOfficialAppsTabbarStat$TypeTabbarItem.Event event, List list) {
        int i2;
        MobileOfficialAppsTabbarStat$TabbarItemName mobileOfficialAppsTabbarStat$TabbarItemName;
        int i3 = i + 1;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            MobileOfficialAppsTabbarStat$TabbarItemName mobileOfficialAppsTabbarStat$TabbarItemName2 = null;
            i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            TabbarItem tabbarItem = (TabbarItem) it.next();
            MobileOfficialAppsTabbarStat$TabbarItemName[] values = MobileOfficialAppsTabbarStat$TabbarItemName.values();
            int length = values.length;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                MobileOfficialAppsTabbarStat$TabbarItemName mobileOfficialAppsTabbarStat$TabbarItemName3 = values[i2];
                if (brm0.w(mobileOfficialAppsTabbarStat$TabbarItemName3.name(), tabbarItem.d(), true)) {
                    mobileOfficialAppsTabbarStat$TabbarItemName2 = mobileOfficialAppsTabbarStat$TabbarItemName3;
                    break;
                }
                i2++;
            }
            if (mobileOfficialAppsTabbarStat$TabbarItemName2 != null) {
                arrayList.add(mobileOfficialAppsTabbarStat$TabbarItemName2);
            }
        }
        MobileOfficialAppsTabbarStat$TabbarItemName[] values2 = MobileOfficialAppsTabbarStat$TabbarItemName.values();
        int length2 = values2.length;
        while (true) {
            if (i2 >= length2) {
                mobileOfficialAppsTabbarStat$TabbarItemName = null;
                break;
            }
            mobileOfficialAppsTabbarStat$TabbarItemName = values2[i2];
            if (brm0.w(mobileOfficialAppsTabbarStat$TabbarItemName.name(), str, true)) {
                break;
            } else {
                i2++;
            }
        }
        MobileOfficialAppsTabbarStat$TypeTabbarItem mobileOfficialAppsTabbarStat$TypeTabbarItem = new MobileOfficialAppsTabbarStat$TypeTabbarItem(event, arrayList, mobileOfficialAppsTabbarStat$TabbarItemName, Integer.valueOf(i3));
        UiTracker uiTracker = UiTracker.a;
        new iid0(UiTracker.c(), SchemeStat$TypeAction.a.b(null, null, mobileOfficialAppsTabbarStat$TypeTabbarItem, 3)).q();
    }

    @Override // xsna.mun0
    public final void a(int i, TabbarSuggestState tabbarSuggestState, String str, ArrayList arrayList) {
        d(i, str, tabbarSuggestState == TabbarSuggestState.ADD ? MobileOfficialAppsTabbarStat$TypeTabbarItem.Event.SUGGEST_PIN_ACCEPT : MobileOfficialAppsTabbarStat$TypeTabbarItem.Event.SUGGEST_UNPIN_ACCEPT, arrayList);
    }

    @Override // xsna.mun0
    public final void b(int i, TabbarSuggestState tabbarSuggestState, List<TabbarItem> list, String str) {
        d(i, str, tabbarSuggestState == TabbarSuggestState.ADD ? MobileOfficialAppsTabbarStat$TypeTabbarItem.Event.SUGGEST_PIN_SHOW : MobileOfficialAppsTabbarStat$TypeTabbarItem.Event.SUGGEST_UNPIN_SHOW, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        if (r0 != (-1)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        r11 = com.vk.stat.scheme.MobileOfficialAppsTabbarStat$TypeTabbarItem.Event.SETTINGS_OPEN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        if (r10 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
    
        r0 = xsna.v11.b(1, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0083, code lost:
    
        if (r10 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0085, code lost:
    
        r10 = (com.vk.stat.scheme.MobileOfficialAppsTabbarStat$TabbarItemName) r1.get(r10.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
    
        r2 = new com.vk.stat.scheme.MobileOfficialAppsTabbarStat$TypeTabbarItem(r11, r1, r10, r0);
        r11 = com.vk.core.ui.tracking.UiTracker.a;
        new xsna.iid0(com.vk.core.ui.tracking.UiTracker.c(), com.vk.stat.scheme.SchemeStat$TypeAction.a.b(null, null, r2, 3)).q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0090, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0082, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0075, code lost:
    
        r10 = java.lang.Integer.valueOf(r0);
     */
    @Override // xsna.mun0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(String str, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            TabbarItem tabbarItem = (TabbarItem) it.next();
            Iterator<E> it2 = MobileOfficialAppsTabbarStat$TabbarItemName.h().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (brm0.w(((MobileOfficialAppsTabbarStat$TabbarItemName) next).name(), tabbarItem.d(), true)) {
                    obj = next;
                    break;
                }
            }
            MobileOfficialAppsTabbarStat$TabbarItemName mobileOfficialAppsTabbarStat$TabbarItemName = (MobileOfficialAppsTabbarStat$TabbarItemName) obj;
            if (mobileOfficialAppsTabbarStat$TabbarItemName != null) {
                arrayList.add(mobileOfficialAppsTabbarStat$TabbarItemName);
            }
        }
        Iterator it3 = list.iterator();
        int i = 0;
        while (true) {
            if (!it3.hasNext()) {
                i = -1;
                break;
            }
            Object next2 = it3.next();
            if (i < 0) {
                e43.t();
                throw null;
            }
            if (brm0.w(((TabbarItem) next2).d(), str, true)) {
                break;
            } else {
                i++;
            }
        }
    }
}
