package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupSuggestion;
import com.vkontakte.android.R;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import xsna.gd60;

/* compiled from: SuggestedGroupHolderActionsDelegate.kt */
/* loaded from: classes4.dex */
public final class q3n0 {
    public final vif0<?> a;
    public final zqu b;
    public final String c;
    public final String d;

    public q3n0(vif0 vif0Var, String str, String str2, int i) {
        zqu zquVar = new zqu();
        str = (i & 4) != 0 ? null : str;
        this.a = vif0Var;
        this.b = zquVar;
        this.c = str;
        this.d = str2;
    }

    public static void f(Group group, int i) {
        group.C = i;
        boolean z = true;
        if (i != 1 && i != 4) {
            z = false;
        }
        group.j = z;
    }

    public final void a(GroupSuggestion groupSuggestion, Group group, AdminLeaveAction adminLeaveAction, io.reactivex.rxjava3.disposables.g gVar) {
        int i = group.C;
        f(group, 0);
        this.a.o6();
        gVar.b(o0r0.e(xwk.e(), fkq0.e(group.c), groupSuggestion != null ? groupSuggestion.e : null, null, adminLeaveAction, 4).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new pbp(new gxj0(4), 1), new zk30(new fs5(this, group, i, 3), 20)));
    }

    public final void b(GroupSuggestion groupSuggestion, Group group, String str, View view, FullSourceJoinApi fullSourceJoinApi) {
        if (group == null) {
            return;
        }
        if (group.p != 1) {
            c(groupSuggestion, group, str, true, fullSourceJoinApi);
            return;
        }
        int l = krv0.l(R.attr.vk_ui_icon_accent);
        view.getContext();
        e.b bVar = new e.b(view, null, null, l, 6);
        bVar.w = R.layout.ds_internal_context_menu_item;
        VkContextMenu.c.c(bVar, R.string.group_event_join, null, false, null, new rc60(this, groupSuggestion, group, str, 1), 30);
        VkContextMenu.c.c(bVar, R.string.group_event_join_unsure, null, false, null, new lh40(this, groupSuggestion, group, str, 2), 30);
        bVar.a().j(false);
    }

    @SuppressLint({"CheckResult"})
    public final void c(GroupSuggestion groupSuggestion, Group group, String str, boolean z, FullSourceJoinApi fullSourceJoinApi) {
        int i = group.C;
        int s = hd60.a().s(group, z);
        f(group, s);
        this.a.o6();
        com.vkontakte.android.data.b.d().L(new wii0(new pcg(rsg0.y0(new j0y(group.c, !z, str, groupSuggestion != null ? groupSuggestion.e : null, fullSourceJoinApi, 8), null, null, 3), 29), 5), false).subscribe(new qw40(new xid0(this, group, s, 1), 20), new rkz(new os40(this, group, i), 29));
    }

    public final void d(GroupSuggestion groupSuggestion, Group group, io.reactivex.rxjava3.disposables.g gVar) {
        boolean z = group.C == 4;
        int i = group.p;
        vif0<?> vif0Var = this.a;
        if (((i == 0 && group.m == 2) || (i == 0 && group.m == 1)) && fkq0.c(group.L) && !z) {
            xwk.e().h0().b(vif0Var.itemView.getContext(), group, new nuf(this, groupSuggestion, group, gVar, 1));
        } else {
            e4h.l(xwk.e().h0(), vif0Var.itemView.getContext(), fkq0.e(group.c), new wyh(this, groupSuggestion, group, gVar, 4), group, 16);
        }
    }

    public final void e(GroupSuggestion groupSuggestion, String str) {
        gd60 a = hd60.a();
        Context context = this.a.itemView.getContext();
        UserId e = fkq0.e(groupSuggestion.b.c);
        String str2 = groupSuggestion.e;
        String str3 = this.c;
        if (str3 == null) {
            str3 = FullSourceJoinApi.SourceType.COMMUNITY_BLOCK_RECOM.h();
        }
        a.L(context, e, str, str2, new gd60.b(null, null, false, false, this.d, str3, 15));
    }
}
