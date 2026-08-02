package xsna;

import android.view.View;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.dto.common.id.UserId;
import com.vk.menu.presentation.entity.TabMenuItemUiData;
import com.vk.stat.scheme.MobileOfficialAppsTabbarStat$TabbarItemName;
import com.vk.tabbar.core.api.domain.TabbarItem;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: BottomActionPopupDelegate.kt */
/* loaded from: classes3.dex */
public final class s38 {
    public final com.vk.superapp.multiaccount.api.d a;
    public final hlu0 b;
    public final jlu0 c;
    public final jwn0 d;
    public final kun0 e;
    public final rvn0 f;
    public final com.vk.core.fragments.a g;
    public final g9g0 h;

    public s38(com.vk.superapp.multiaccount.api.d dVar, hlu0 hlu0Var, jlu0 jlu0Var, jwn0 jwn0Var, kun0 kun0Var, rvn0 rvn0Var, com.vk.core.fragments.a aVar, g9g0 g9g0Var) {
        this.a = dVar;
        this.b = hlu0Var;
        this.c = jlu0Var;
        this.d = jwn0Var;
        this.e = kun0Var;
        this.f = rvn0Var;
        this.g = aVar;
        this.h = g9g0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        if (r5 != (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        r3 = com.vk.stat.scheme.MobileOfficialAppsTabbarStat$TypeTabbarItem.Event.CONTEXT_MENU_OPEN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        if (r2 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
    
        r5 = xsna.v11.b(1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        if (r2 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:
    
        r2 = (com.vk.stat.scheme.MobileOfficialAppsTabbarStat$TabbarItemName) r4.get(r2.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
    
        r8 = new com.vk.stat.scheme.MobileOfficialAppsTabbarStat$TypeTabbarItem(r3, r4, r2, r5);
        r3 = com.vk.core.ui.tracking.UiTracker.a;
        new xsna.iid0(com.vk.core.ui.tracking.UiTracker.c(), com.vk.stat.scheme.SchemeStat$TypeAction.a.b(null, null, r8, 3)).q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
    
        if (r16.a != com.vk.menu.presentation.entity.TabMenuItemUiData.MANAGED_GROUP.h()) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:
    
        r2 = new xsna.d920();
        r3 = b(r15, r16, r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ba, code lost:
    
        if (r3 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bc, code lost:
    
        r2.x0(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bf, code lost:
    
        r0 = r16.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c5, code lost:
    
        if (r0.isEmpty() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c7, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00df, code lost:
    
        if (r3 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e1, code lost:
    
        r2.x0(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e4, code lost:
    
        r0 = r2.c.size();
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ea, code lost:
    
        if (r0 != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f4, code lost:
    
        r7 = xsna.krv0.l(com.vkontakte.android.R.attr.vk_ui_icon_accent);
        r15.getContext();
        r3 = new com.vk.core.view.components.context.menu.e.b(r15, null, null, r7, 6);
        r3.w = com.vkontakte.android.R.layout.ds_internal_context_menu_item;
        r3.l = r2;
        r3.n = xsna.iah0.a(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011b, code lost:
    
        return r3.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f3, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c9, code lost:
    
        r3 = r14.e.b(r18);
        r3.d = java.util.Collections.singletonList(new xsna.q38(r0, new xsna.r38(r18, 0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ed, code lost:
    
        r2 = b(r15, r16, r17);
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f1, code lost:
    
        if (r2 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x008e, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0080, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0073, code lost:
    
        r2 = java.lang.Integer.valueOf(r5);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final VkContextMenu a(View view, o720 o720Var, gzs<s3q0> gzsVar, izs<? super UserId, s3q0> izsVar) {
        String str = o720Var.b;
        List<TabbarItem> h = this.f.h();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = h.iterator();
        while (true) {
            int i = 0;
            MobileOfficialAppsTabbarStat$TabbarItemName mobileOfficialAppsTabbarStat$TabbarItemName = null;
            if (!it.hasNext()) {
                break;
            }
            TabbarItem tabbarItem = (TabbarItem) it.next();
            MobileOfficialAppsTabbarStat$TabbarItemName[] values = MobileOfficialAppsTabbarStat$TabbarItemName.values();
            int length = values.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                MobileOfficialAppsTabbarStat$TabbarItemName mobileOfficialAppsTabbarStat$TabbarItemName2 = values[i];
                if (brm0.w(mobileOfficialAppsTabbarStat$TabbarItemName2.name(), tabbarItem.d(), true)) {
                    mobileOfficialAppsTabbarStat$TabbarItemName = mobileOfficialAppsTabbarStat$TabbarItemName2;
                    break;
                }
                i++;
            }
            if (mobileOfficialAppsTabbarStat$TabbarItemName != null) {
                arrayList.add(mobileOfficialAppsTabbarStat$TabbarItemName);
            }
        }
        Iterator it2 = arrayList.iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i2 = -1;
                break;
            }
            Object next = it2.next();
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            if (brm0.w(((MobileOfficialAppsTabbarStat$TabbarItemName) next).name(), str, true)) {
                break;
            }
            i2++;
        }
    }

    public final k38 b(View view, o720 o720Var, gzs gzsVar) {
        Integer num;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = o720Var.a;
        if (i == TabMenuItemUiData.PROFILE.h()) {
            FragmentImpl m = this.g.m();
            if (this.b.a() && m != null) {
                ge0 ge0Var = new ge0(2, this, m);
                if (this.a.d().size() > 1) {
                    arrayList2.add(new p38(new bqv(2, Integer.valueOf(R.drawable.vk_icon_switch_outline_28), null), view.getContext().getString(R.string.change_account), null, ge0Var));
                } else {
                    arrayList2.add(new p38(new bqv(2, Integer.valueOf(R.drawable.vk_icon_add_outline_28), null), view.getContext().getString(R.string.add_account), null, ge0Var));
                }
            }
        } else if (i == TabMenuItemUiData.IM.h() && com.vk.toggle.b.A.a(ImFeatures.READ_ALL_IN_ALL) && (num = o720Var.d) != null && num.intValue() > 0) {
            arrayList2.add(new p38(new bqv(2, Integer.valueOf(R.drawable.vk_icon_message_check_outline_28), null), view.getContext().getString(R.string.bottom_action_mark_all_as_read), null, new com.vk.newsfeed.posting.mediapicker.photovk.base.a(this, 12)));
        }
        arrayList.addAll(arrayList2);
        arrayList.addAll(Collections.singletonList(new p38(new bqv(2, Integer.valueOf(R.drawable.vk_icon_settings_outline_28), null), view.getContext().getString(R.string.bottom_action_open_settings), null, new vq6(1, this, o720Var.b))));
        if (arrayList.isEmpty()) {
            return null;
        }
        m38 a = this.e.a(gzsVar);
        a.d = arrayList;
        return a;
    }
}
