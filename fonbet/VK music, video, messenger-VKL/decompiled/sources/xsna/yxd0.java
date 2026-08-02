package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.messages.WritePermission;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.dialogs.TransitionData;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.im.ui.components.chat_profile.ChatProfileActionItem$Notifications;
import com.vk.im.ui.components.chat_profile.ChatProfileListItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.nwb;
import xsna.xxd0;

/* compiled from: ProfileInfoStateBuilder.kt */
/* loaded from: classes2.dex */
public final class yxd0 {
    public final Context a;
    public final DialogExt b;
    public final a1w c;
    public final sj90 d;
    public final g3a0 e;
    public ImageList k;
    public Drawable l;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public CharSequence f = "";
    public String g = "";
    public String h = "";
    public CharSequence i = "";
    public VerifyInfo j = new VerifyInfo(false, false, false, false, false, false, 63, null);
    public AvatarBorderType m = AvatarBorderType.CIRCLE;
    public ImStoryState r = ImStoryState.NONE;
    public final ArrayList s = new ArrayList();
    public final ArrayList t = new ArrayList();
    public final ArrayList u = new ArrayList();

    public yxd0(Context context, DialogExt dialogExt, a1w a1wVar, sj90 sj90Var, g3a0 g3a0Var) {
        this.a = context;
        this.b = dialogExt;
        this.c = a1wVar;
        this.d = sj90Var;
        this.e = g3a0Var;
    }

    public final void a(xub xubVar) {
        this.s.add(xubVar);
    }

    public final void b() {
        DialogExt dialogExt = this.b;
        if (him.a(this.c, dialogExt.Cb(), dialogExt.b)) {
            a(new fvb(R.drawable.vk_icon_phone_outline_28, 4, this.a.getText(R.string.vkim_chat_profile_action_call), Integer.valueOf(R.attr.im_icon_green)));
        }
    }

    public final void c() {
        ArrayList arrayList = this.u;
        if (arrayList.isEmpty() || (j5g.k0(arrayList) instanceof nwb.c)) {
            return;
        }
        e(nwb.c.b);
    }

    public final void d(ChatProfileListItem chatProfileListItem) {
        e(new nwb.k(chatProfileListItem, false, false));
    }

    public final void e(nwb nwbVar) {
        this.u.add(nwbVar);
    }

    public final void f() {
        DialogExt dialogExt = this.b;
        qtd0 Bb = dialogExt.b.Bb(dialogExt.f);
        if (Bb == null) {
            return;
        }
        String c5 = Bb.c5();
        if (this.d.a(c5)) {
            d(new ChatProfileListItem.k(0, this.e.a(c5), R.drawable.vk_icon_phone_outline_28, null, false, false, true, 56));
        }
    }

    public final void g() {
        ChatSettings Hb;
        Dialog Cb = this.b.Cb();
        if (Cb == null || (Hb = Cb.Hb()) == null || !Hb.S) {
            return;
        }
        boolean vc = Cb.vc();
        Context context = this.a;
        d(vc ? new ChatProfileListItem.n(10, context.getText(R.string.vkim_chat_profile_action_return_to_chat), R.drawable.vk_icon_door_arrow_right_outline_28, null, false, false, false, 120) : new ChatProfileListItem.m(9, context.getText(R.string.vkim_chat_profile_action_return_to_channel), R.drawable.vk_icon_door_arrow_right_outline_28, null, false, false, false, 120));
    }

    public final void h(List list, yzn0 yzn0Var, boolean z) {
        if (list.isEmpty()) {
            return;
        }
        if (z) {
            c();
        } else {
            e(nwb.c.b);
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(yzn0Var.a(((sxb) it.next()).a));
        }
        e(new nwb.l(arrayList, list));
    }

    public final void i() {
        Dialog Cb = this.b.Cb();
        if (Cb != null && u(Cb)) {
            d(new ChatProfileListItem.b(2, this.a.getString(R.string.vkim_chat_theme), R.drawable.vk_icon_palette_outline_28, null, false, false, false, 120));
        }
    }

    public final void j() {
        Dialog Cb = this.b.Cb();
        if (Cb == null) {
            return;
        }
        ChatSettings Hb = Cb.Hb();
        if (Hb == null || Hb.Q || Cb.rc()) {
            xuo0.a.getClass();
            boolean Ac = Cb.Ac(xuo0.a());
            boolean z = Cb.notificationsIsUseSound;
            a(new ChatProfileActionItem$Notifications(this.a, (Ac && z) ? ChatProfileActionItem$Notifications.State.ENABLED : (!Ac || z) ? ChatProfileActionItem$Notifications.State.DISABLED : ChatProfileActionItem$Notifications.State.NO_SOUND));
        }
    }

    public final void k(xub xubVar) {
        this.t.add(xubVar);
    }

    public final void l() {
        Dialog Cb = this.b.Cb();
        if (Cb == null || Cb.Dc()) {
            return;
        }
        boolean pc = Cb.pc();
        Context context = this.a;
        if (pc) {
            k(new fwb(R.drawable.vk_icon_unarchive_outline_28, 12, context.getText(R.string.vkim_chat_profile_action_unarchive), null));
        } else {
            k(new dvb(R.drawable.vk_icon_archive_outline_28, 12, context.getText(R.string.vkim_chat_profile_action_archive), null));
        }
    }

    public final void m() {
        k(new lvb(R.drawable.vk_icon_clear_data_outline_28, 8, this.a.getText(R.string.vkim_chat_profile_action_delete_history), null));
    }

    public final void n() {
        ChatSettings Hb;
        Dialog Cb = this.b.Cb();
        if (Cb == null || (Hb = Cb.Hb()) == null || !Hb.R) {
            return;
        }
        boolean vc = Cb.vc();
        Context context = this.a;
        k(vc ? new rvb(R.drawable.vk_icon_door_arrow_right_outline_28, 8, context.getText(R.string.vkim_chat_profile_action_leave_chat), null) : new qvb(R.drawable.vk_icon_door_arrow_right_outline_28, 8, context.getText(R.string.vkim_chat_profile_action_leave_channel), null));
    }

    public final void o() {
        Dialog Cb = this.b.Cb();
        if (Cb != null && u(Cb)) {
            k(new gvb(R.drawable.vk_icon_palette_outline_28, 12, this.a.getString(R.string.vkim_chat_theme), null));
        }
    }

    public final void p() {
        Dialog Cb = this.b.Cb();
        if (Cb == null || !Cb.yc()) {
            return;
        }
        k(new tvb(R.drawable.vk_icon_message_unread_top_28, 12, this.a.getText(R.string.vkim_chat_profile_action_mark_as_unread), null));
    }

    public final void q() {
        Dialog Cb = this.b.Cb();
        if (Cb == null || Cb.dc() == null) {
            return;
        }
        k(new zvb(R.drawable.vk_icon_message_pin_outline_28, 12, this.a.getText(R.string.vkim_chat_profile_action_pinned_message), null));
    }

    public final void r(boolean z) {
        xub yvbVar;
        Dialog Cb = this.b.Cb();
        if (Cb == null || Cb.pc()) {
            return;
        }
        boolean Bc = Cb.Bc();
        Context context = this.a;
        if (Bc) {
            yvbVar = new hwb(R.drawable.vk_icon_unpin_outline_28, 12, !z ? context.getText(R.string.vkim_chat_profile_action_unpin_chat_short) : context.getText(R.string.vkim_chat_profile_action_unpin_chat), null);
        } else {
            yvbVar = new yvb(R.drawable.vk_icon_pin_outline_28, 4, !z ? context.getText(R.string.vkim_chat_profile_action_pin_chat_short) : context.getText(R.string.vkim_chat_profile_action_pin_chat), Integer.valueOf(R.attr.im_icon_blue));
        }
        if (z) {
            k(yvbVar);
        } else {
            a(yvbVar);
        }
    }

    public final void s() {
        a(new cwb(R.drawable.vk_icon_search_outline_28, 4, this.a.getText(R.string.vkim_chat_profile_action_search), Integer.valueOf(R.attr.im_icon_yellow)));
    }

    public final xxd0.b t() {
        boolean z;
        ArrayList arrayList;
        ChatSettings Hb;
        String str;
        CharSequence charSequence;
        CharSequence charSequence2 = this.f;
        String str2 = this.g;
        String str3 = this.h;
        CharSequence charSequence3 = this.i;
        VerifyInfo verifyInfo = this.j;
        ImageList imageList = this.k;
        Drawable drawable = this.l;
        boolean z2 = this.p;
        boolean z3 = this.q;
        boolean z4 = this.n;
        boolean z5 = this.o;
        boolean t = BuildInfo.t();
        ArrayList arrayList2 = this.u;
        if (t) {
            z = true;
            ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                CharSequence charSequence4 = charSequence2;
                nwb nwbVar = (nwb) next;
                String str4 = str2;
                if (nwbVar instanceof nwb.k) {
                    str = str3;
                    charSequence = charSequence3;
                    nwbVar = new nwb.k(((nwb.k) nwbVar).b, !(j5g.b0(i - 1, arrayList2) instanceof nwb.k), !(j5g.b0(i2, arrayList2) instanceof nwb.k));
                } else {
                    str = str3;
                    charSequence = charSequence3;
                }
                arrayList3.add(nwbVar);
                i = i2;
                str2 = str4;
                charSequence2 = charSequence4;
                charSequence3 = charSequence;
                str3 = str;
            }
            arrayList = arrayList3;
        } else {
            z = true;
            arrayList = arrayList2;
        }
        CharSequence charSequence5 = charSequence2;
        String str5 = str2;
        String str6 = str3;
        CharSequence charSequence6 = charSequence3;
        AvatarBorderType avatarBorderType = this.m;
        ImStoryState imStoryState = this.r;
        DialogExt dialogExt = this.b;
        Dialog Cb = dialogExt.Cb();
        WritePermission oc = Cb != null ? Cb.oc() : null;
        Dialog Cb2 = dialogExt.Cb();
        TransitionData jc = Cb2 != null ? Cb2.jc() : null;
        Dialog Cb3 = dialogExt.Cb();
        return new xxd0.b(charSequence5, str5, str6, charSequence6, verifyInfo, z2, z3, z4, false, z5, imageList, drawable, avatarBorderType, (List) this.s, (List) this.t, (List) arrayList, false, imStoryState, oc, jc, (Cb3 == null || (Hb = Cb3.Hb()) == null) ? z : Hb.N, 65536);
    }

    public final boolean u(Dialog dialog) {
        ChatSettings Hb;
        this.c.r().getClass();
        if (dialog.Zb().equals(com.vk.dto.common.a.a)) {
            return false;
        }
        if (dialog.t1()) {
            return dialog.Gb() && dialog.Pb();
        }
        if (dialog.sc() || (Hb = dialog.Hb()) == null) {
            return false;
        }
        return Hb.T;
    }
}
