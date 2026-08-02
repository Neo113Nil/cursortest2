package com.vkontakte.android.fragments;

import android.content.res.Resources;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.vk.auth.logout_menu.LogoutItem;
import com.vk.auth.logout_menu.b;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkConnectNavigationItem;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsListFragment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.av20;
import xsna.c4l;
import xsna.c5g;
import xsna.cpo;
import xsna.dez;
import xsna.dun;
import xsna.dw20;
import xsna.e3m;
import xsna.gpu0;
import xsna.hlu0;
import xsna.ho8;
import xsna.hxi;
import xsna.iah0;
import xsna.irg0;
import xsna.lh10;
import xsna.mbi;
import xsna.v200;
import xsna.vmu0;
import xsna.w200;
import xsna.x200;

/* compiled from: SettingsListFragment.kt */
/* loaded from: classes7.dex */
public final class a extends dez {
    public final /* synthetic */ SettingsListFragment o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ViewGroup viewGroup, SettingsListFragment settingsListFragment) {
        super(viewGroup);
        this.o = settingsListFragment;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // me.grishka.appkit.views.UsableRecyclerView.e
    public final void onClick() {
        int i = SettingsListFragment.X0;
        SettingsListFragment settingsListFragment = this.o;
        FragmentActivity activity = settingsListFragment.getActivity();
        if (activity == null) {
            return;
        }
        Resources resources = activity.getResources();
        ArrayList arrayList = new ArrayList(4);
        ArrayList arrayList2 = new ArrayList(4);
        Long l = settingsListFragment.L0;
        if (l == null || l.longValue() < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            l = null;
        }
        if (((hlu0) settingsListFragment.Q0.getValue()).a()) {
            int i2 = SettingsListFragment.g.$EnumSwitchMapping$0[settingsListFragment.No().d(MultiAccountEntryPoint.SettingsLogout.d).ordinal()];
            if (i2 == 1) {
                arrayList2.add(v200.a);
                arrayList.add(new LogoutItem(LogoutItem.Type.ADD_ACCOUNT, R.drawable.vk_icon_user_add_outline_28, resources.getString(R.string.vk_logout_item_add_account_title), resources.getString(R.string.vk_logout_item_add_account_description), new hxi(arrayList2, settingsListFragment)));
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList2.add(w200.a);
                arrayList.add(new LogoutItem(LogoutItem.Type.SWITCH_ACCOUNT, R.drawable.vk_icon_sync_outline_28, resources.getString(R.string.vk_logout_item_switch_account_title), resources.getString(R.string.vk_logout_item_switch_account_description), new c4l(arrayList2, settingsListFragment)));
            }
        }
        irg0 irg0Var = new irg0(arrayList2, settingsListFragment);
        String string = resources.getString(R.string.vk_logout_item_clear_cache_title);
        if (l != null) {
            StringBuilder b = ho8.b(string, " (");
            b.append(dun.s6(l.longValue(), resources));
            b.append(')');
            string = b.toString();
        }
        arrayList.add(new LogoutItem(LogoutItem.Type.DEFAULT, R.drawable.vk_icon_delete_clock_outline_28, string, resources.getString(R.string.vk_logout_item_clear_cache_description), irg0Var));
        arrayList.add(new LogoutItem(LogoutItem.Type.LOGOUT, R.drawable.vk_icon_door_arrow_right_outline_28, resources.getString(R.string.vk_logout_item_logout_title), resources.getString(R.string.vk_logout_item_logout_description), new lh10(arrayList2, settingsListFragment)));
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.SETTINGS;
        SchemeStatSak$TypeVkConnectNavigationItem.EventType eventType = SchemeStatSak$TypeVkConnectNavigationItem.EventType.GO;
        SchemeStatSak$EventScreen schemeStatSak$EventScreen2 = SchemeStatSak$EventScreen.SETTINGS_LOGOUT;
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((x200) it.next()).a());
        }
        new vmu0(schemeStatSak$EventScreen, eventType, schemeStatSak$EventScreen2, arrayList3).q();
        b.a aVar = new b.a(activity, null);
        av20.a aVar2 = new av20.a();
        aVar2.f = arrayList;
        aVar2.d(R.layout.vk_item_logout, LayoutInflater.from(activity));
        aVar2.d = new com.vk.auth.logout_menu.c();
        aVar2.c(new mbi(6));
        av20 b2 = aVar2.b();
        aVar.J();
        aVar.v0(R.string.vk_logout_exit_title);
        aVar.z0(8388611);
        aVar.A0(Integer.valueOf(R.style.VkUiTypography_DisplayTitle2));
        aVar.v(0);
        dw20.a.k(aVar, b2, 6);
        gpu0 gpu0Var = new gpu0(aVar.c);
        gpu0Var.c = R.attr.vk_ui_separator_primary;
        gpu0Var.Ng();
        gpu0Var.e = iah0.a(12);
        gpu0Var.j = new com.vk.auth.logout_menu.a(arrayList);
        aVar.l0(gpu0Var);
        aVar.c(new cpo(false, 0, 7));
        aVar.l(e3m.f(R.attr.vk_ui_background_content, activity));
        aVar.S(e3m.f(R.attr.vk_ui_background_content, activity));
        aVar.H0(settingsListFragment.getParentFragmentManager(), "LogoutBottomSheetTag");
    }
}
