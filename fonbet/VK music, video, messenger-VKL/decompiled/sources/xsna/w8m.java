package xsna;

import android.content.Context;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.HistoryAttachAction;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.ui.components.common.MemberAction;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.cwb0;
import xsna.u8m;

/* compiled from: DialogActionsHelper.kt */
/* loaded from: classes2.dex */
public final class w8m {
    public static final /* synthetic */ int a = 0;

    /* compiled from: DialogActionsHelper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MemberAction.values().length];
            try {
                iArr[MemberAction.KICK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MemberAction.OWNER_SET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MemberAction.ADMIN_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MemberAction.ADMIN_UNSET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MemberAction.WRITE_DISABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MemberAction.WRITE_ENABLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HistoryAttachAction.values().length];
            try {
                iArr2[HistoryAttachAction.GO_TO_MSG.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[HistoryAttachAction.SHARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[HistoryAttachAction.COPY_LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[HistoryAttachAction.SAVE_TO_GALLERY.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[HistoryAttachAction.ADD.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[HistoryAttachAction.ADD_TO_ALBUM.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[HistoryAttachAction.DELETE.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        new bpn0(new re0(10));
    }

    public static void a(ArrayList arrayList) {
        g2v.c().getClass();
        fhj0 fhj0Var = fhj0.a;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        if (fhj0Var.b(context)) {
            arrayList.add(u8m.p.b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x01dd, code lost:
    
        if (r2.e.contains(r19) == true) goto L122;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList b(com.vk.im.engine.models.c cVar, DialogExt dialogExt, Peer peer) {
        boolean z;
        boolean z2;
        boolean z3;
        Dialog Cb = dialogExt.Cb();
        if (Cb == null) {
            return new ArrayList();
        }
        xuo0.a.getClass();
        long a2 = xuo0.a();
        qtd0 Cb2 = dialogExt.b.Cb(Cb.Sb());
        Group group = Cb2 instanceof Group ? (Group) Cb2 : null;
        ChatSettings Hb = Cb.Hb();
        ArrayList arrayList = new ArrayList();
        Serializer.c<Peer> cVar2 = Peer.CREATOR;
        boolean f = epx.f(Cb.Zb(), new Peer.User(100L));
        if (Cb.xc()) {
            arrayList.add(u8m.d0.b);
        }
        if (Cb.yc()) {
            arrayList.add(u8m.e0.b);
        }
        boolean uc = Cb.uc();
        u8m.g0 g0Var = u8m.g0.b;
        u8m.f0 f0Var = u8m.f0.b;
        u8m.m mVar = u8m.m.b;
        u8m u8mVar = u8m.c.b;
        u8m u8mVar2 = u8m.t0.b;
        if (!uc) {
            a(arrayList);
            boolean Ab = peer.Ab(Peer.Type.GROUP);
            g2v.c().getClass();
            if (!Cb.Dc() && !Ab) {
                p4g.a(Cb.pc() ? u8mVar2 : u8mVar, arrayList, (Cb.Jc() || f || Cb.rc()) ? false : true);
            }
            p4g.a(mVar, arrayList, !Cb.Jc());
            boolean z4 = (Cb.Va() || Cb.Jc()) ? false : true;
            p4g.a(f0Var, arrayList, z4 && Cb.Ac(a2));
            p4g.a(g0Var, arrayList, z4 && !Cb.Ac(a2));
        }
        Peer.Type type = Peer.Type.GROUP;
        if ((Cb.bc() == type) && group != null) {
            boolean z5 = group.i;
            if (group.h) {
                p4g.a(u8m.w.b, arrayList, !Cb.Dc());
            } else {
                p4g.a(u8m.y.b, arrayList, z5);
                p4g.a(u8m.x.b, arrayList, !z5);
            }
        }
        boolean Ab2 = peer.Ab(type);
        if (Cb.uc() && Hb != null) {
            boolean z6 = Hb.R;
            boolean z7 = Hb.j;
            if (z7) {
                z3 = true;
            } else {
                a(arrayList);
                z3 = true;
                p4g.a(f0Var, arrayList, Cb.Ac(a2));
                p4g.a(g0Var, arrayList, !Cb.Ac(a2));
            }
            g2v.c().getClass();
            if (!Cb.Dc() && !Ab2) {
                if (Cb.pc()) {
                    u8mVar = u8mVar2;
                }
                p4g.a(u8mVar, arrayList, !Cb.rc());
            }
            p4g.a(mVar, arrayList, !z6);
            if (Hb.h) {
                p4g.a(u8m.c0.b, arrayList, z6);
                p4g.a(u8m.q0.b, arrayList, z7);
            } else {
                p4g.a(u8m.p0.b, arrayList, z7);
                p4g.a(u8m.b0.b, arrayList, (!z6 || Ab2) ? false : z3);
                ChatSettings Hb2 = Cb.Hb();
                p4g.a(u8m.t.b, arrayList, (Hb2 == null || epx.f(Hb2.d, peer) != z3 || z7) ? false : true);
                p4g.a(u8m.n.b, arrayList, z6 && !Ab2);
            }
        }
        boolean Ab3 = peer.Ab(type);
        if (!Cb.pc() && !Cb.rc()) {
            g2v.c().getClass();
            if (!Ab3) {
                arrayList.add(cVar.n() ? com.vk.im.engine.models.im_item.b.f(Cb.y9()) : Cb.Bc() ? u8m.u0.b : u8m.m0.b);
            }
        }
        if (cVar.g()) {
            ChatSettings Hb3 = Cb.Hb();
            if (Hb3 != null) {
                z = true;
            } else {
                z = true;
            }
            ChatSettings Hb4 = Cb.Hb();
            if (Hb4 == null || epx.f(Hb4.d, peer) != z) {
                z2 = false;
                if (z2) {
                    ChatSettings Hb5 = Cb.Hb();
                    if (Hb5 != null && Hb5.H == z) {
                        arrayList.add(u8m.l.b);
                        return arrayList;
                    }
                    arrayList.add(u8m.k.b);
                }
            }
            z2 = z;
            if (z2) {
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0367 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0035 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList c(cwb0.z zVar, boolean z) {
        r10 r10Var;
        r10 r10Var2;
        Iterable iterable = zVar.l;
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (j5g.P(zVar.m, ((jwb0) obj).f)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u8m u8mVar = (u8m) ((jwb0) it.next()).f;
            Integer valueOf = Integer.valueOf(R.attr.vk_ui_background_negative);
            r10 r10Var3 = null;
            Integer valueOf2 = z ? Integer.valueOf(R.attr.vk_ui_text_negative) : null;
            int i = z ? R.attr.vk_ui_icon_primary : R.attr.vk_ui_icon_accent;
            if (epx.f(u8mVar, u8m.p.b)) {
                r10Var2 = new r10(R.string.vkim_dialogs_list_option_create_shortcut, R.drawable.vk_icon_add_square_outline_28, 4, Integer.valueOf(i), 16);
            } else if (epx.f(u8mVar, u8m.v.b)) {
                r10Var2 = new r10(R.string.vkim_groups_receive_msg_disable, R.drawable.vk_icon_notification_disable_outline_28, 11, Integer.valueOf(i), 16);
            } else if (epx.f(u8mVar, u8m.x.b)) {
                r10Var2 = new r10(R.string.vkim_groups_receive_msg_enable, R.drawable.vk_icon_notifications_28, 10, Integer.valueOf(i), 16);
            } else if (epx.f(u8mVar, u8m.y.b)) {
                r10Var2 = new r10(R.string.vkim_groups_receive_notify_disable, R.drawable.vk_icon_notification_disable_outline_28, 12, Integer.valueOf(i), 16);
            } else if (epx.f(u8mVar, u8m.d0.b)) {
                r10Var2 = new r10(R.string.vkim_dialogs_list_option_mark_as_read, R.drawable.vk_icon_message_outline_28, 21, Integer.valueOf(i), 16);
            } else if (epx.f(u8mVar, u8m.e0.b)) {
                r10Var2 = new r10(R.string.vkim_dialogs_list_option_mark_as_unread, R.drawable.vk_icon_message_unread_top_28, 22, Integer.valueOf(i), 16);
            } else if (epx.f(u8mVar, u8m.f0.b)) {
                r10Var2 = new r10(R.string.vkim_dialogs_list_option_notifications_off, R.drawable.vk_icon_notification_disable_outline_28, 9, Integer.valueOf(i), 16);
            } else if (epx.f(u8mVar, u8m.g0.b)) {
                r10Var2 = new r10(R.string.vkim_dialogs_list_option_notifications_on, R.drawable.vk_icon_notifications_28, 8, Integer.valueOf(i), 16);
            } else if (epx.f(u8mVar, u8m.m0.b)) {
                r10Var2 = new r10(R.string.vkim_dialogs_list_option_pin, R.drawable.vk_icon_pin_outline_28, 28, Integer.valueOf(i), 16);
            } else if (epx.f(u8mVar, u8m.u0.b)) {
                r10Var2 = new r10(R.string.vkim_dialogs_list_option_unpin, R.drawable.vk_icon_unpin_outline_28, 29, Integer.valueOf(i), 16);
            } else if (epx.f(u8mVar, u8m.c.b)) {
                r10Var2 = new r10(R.string.vkim_dialog_archive, R.drawable.vk_icon_archive_outline_28, 34, Integer.valueOf(i), 16);
            } else if (epx.f(u8mVar, u8m.t0.b)) {
                r10Var2 = new r10(R.string.vkim_dialog_unarchive, R.drawable.vk_icon_unarchive_outline_28, 35, Integer.valueOf(i), 16);
            } else if (epx.f(u8mVar, u8m.b.b)) {
                r10Var2 = new r10(R.string.vkim_folder_dialog_option_add_to_folder, R.drawable.vk_icon_add_square_outline_28, 37, Integer.valueOf(i), 16);
            } else if (epx.f(u8mVar, u8m.n0.b)) {
                r10Var2 = new r10(R.string.vkim_folder_dialog_option_remove_from_folder, R.drawable.vk_icon_arrow_uturn_left_outline_28, 38, Integer.valueOf(i), 16);
            } else if (epx.f(u8mVar, u8m.k.b)) {
                r10Var2 = new r10(R.string.vkim_msg_ban_writing_to_chat, R.drawable.vk_icon_message_cross_outline_28, 41, Integer.valueOf(i), 16);
            } else if (epx.f(u8mVar, u8m.l.b)) {
                r10Var2 = new r10(R.string.vkim_msg_unban_writing_to_chat, R.drawable.vk_icon_message_check_outline_28, 42, Integer.valueOf(i), 16);
            } else {
                if (epx.f(u8mVar, u8m.m.b)) {
                    r10Var = new r10(R.string.vkim_clear_history, R.drawable.vk_icon_clear_data_outline_28, 14, valueOf, valueOf2);
                } else if (epx.f(u8mVar, u8m.n.b)) {
                    r10Var = new r10(R.string.vkim_clear_history_and_leave, R.drawable.vk_icon_clear_data_outline_28, 16, valueOf, valueOf2);
                } else if (epx.f(u8mVar, u8m.t.b)) {
                    r10Var = new r10(R.string.vkim_chat_delete_action, R.drawable.vk_icon_delete_outline_28, 39, valueOf, valueOf2);
                } else if (epx.f(u8mVar, u8m.s.b)) {
                    g2v.c().getClass();
                    r10Var = new r10(R.string.vkim_delete_channel_title, R.drawable.vk_icon_delete_outline_28, 40, valueOf, valueOf2);
                } else if (epx.f(u8mVar, u8m.w.b)) {
                    r10Var = new r10(R.string.vkim_groups_receive_msg_disable_and_clear_history, R.drawable.vk_icon_clear_data_outline_28, 15, valueOf, valueOf2);
                } else if (epx.f(u8mVar, u8m.p0.b)) {
                    r10Var2 = new r10(R.string.vkim_dialogs_list_option_return, R.drawable.vk_icon_door_arrow_left_outline_28, 19, Integer.valueOf(i), 16);
                } else if (epx.f(u8mVar, u8m.q0.b)) {
                    r10Var2 = new r10(R.string.vkim_msg_header_menu_return_to_channel, R.drawable.vk_icon_door_arrow_left_outline_28, 20, Integer.valueOf(i), 16);
                } else if (epx.f(u8mVar, u8m.o.b)) {
                    r10Var = new r10(R.string.vkim_complain_to_channel, R.drawable.vk_icon_report_outline_28, 43, valueOf, valueOf2);
                } else if (epx.f(u8mVar, u8m.c0.b)) {
                    g2v.c().getClass();
                    r10Var = new r10(R.string.vkim_channel_leave, R.drawable.vk_icon_door_arrow_right_outline_28, 18, valueOf, valueOf2);
                } else if (epx.f(u8mVar, u8m.s0.b)) {
                    r10Var2 = new r10(R.string.vkim_show_channel_in_all_folder, R.drawable.vk_icon_view_outline_28, 45, Integer.valueOf(i), 16);
                } else if (epx.f(u8mVar, u8m.z.b)) {
                    r10Var2 = new r10(R.string.vkim_hide_channel_in_all_folder, R.drawable.vk_icon_hide_outline_28, 44, Integer.valueOf(i), 16);
                } else {
                    if (epx.f(u8mVar, u8m.b0.b)) {
                        r10Var = new r10(R.string.vkim_msg_header_menu_leave_chat, R.drawable.vk_icon_door_arrow_right_outline_28, 17, valueOf, valueOf2);
                    }
                    if (r10Var3 != null) {
                        arrayList2.add(r10Var3);
                    }
                }
                r10Var3 = r10Var;
                if (r10Var3 != null) {
                }
            }
            r10Var3 = r10Var2;
            if (r10Var3 != null) {
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList d(cwb0.k0 k0Var) {
        Iterable iterable = k0Var.l;
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (j5g.P(k0Var.m, ((jwb0) obj).f)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jwb0 jwb0Var = (jwb0) it.next();
            Integer valueOf = Integer.valueOf(R.attr.vk_ui_background_negative);
            r10 r10Var = null;
            MemberAction memberAction = jwb0Var != null ? (MemberAction) jwb0Var.f : null;
            switch (memberAction == null ? -1 : a.$EnumSwitchMapping$0[memberAction.ordinal()]) {
                case -1:
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                case 2:
                    r10Var = new r10(jwb0Var.b, jwb0Var.e, ((MemberAction) jwb0Var.f).ordinal(), valueOf, (Integer) null);
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    r10Var = new r10(jwb0Var.b, jwb0Var.e, ((MemberAction) jwb0Var.f).ordinal(), (Integer) null, 24);
                    break;
            }
            if (r10Var != null) {
                arrayList2.add(r10Var);
            }
        }
        return arrayList2;
    }
}
