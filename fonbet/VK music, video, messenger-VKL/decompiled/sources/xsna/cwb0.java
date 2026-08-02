package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.vk.dto.messages.HistoryAttachAction;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.ui.components.account.main.vc.AccountAvatarAction;
import com.vk.im.ui.components.common.AvatarAction;
import com.vk.im.ui.components.common.BanDuration;
import com.vk.im.ui.components.common.DndPeriod;
import com.vk.im.ui.components.common.LinkAction;
import com.vk.im.ui.components.common.MemberAction;
import com.vk.im.ui.components.common.PromoLinkAction;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import xsna.u8m;
import xsna.ug30;

/* compiled from: Popup.kt */
@ozl
/* loaded from: classes2.dex */
public abstract class cwb0 {
    public static final int a = iah0.a(10);

    /* compiled from: Popup.kt */
    public static final class a extends m<AccountAvatarAction> {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(List<? extends AccountAvatarAction> list) {
            super(null, null, null, null, null, e43.l(new jwb0(null, R.string.vkim_profile_open_stories_avatar_option, r0.b(R.drawable.vk_icon_story_outline_28, R.attr.vk_ui_icon_accent), null, 0, AccountAvatarAction.OPEN_STORY, false, null, 985), new jwb0(null, R.string.vkim_profile_open_avatar_option, r0.b(R.drawable.vk_icon_deprecated_ic_goto_outline_28, R.attr.vk_ui_icon_accent), null, 0, AccountAvatarAction.OPEN, false, null, 985), new jwb0(null, R.string.vkim_profile_make_phto_option, r0.b(R.drawable.vk_icon_camera_outline_28, R.attr.vk_ui_icon_accent), null, 0, AccountAvatarAction.MAKE_PHOTO, false, null, 985), new jwb0(null, R.string.vkim_profile_select_from_gallery_option, r0.b(R.drawable.vk_icon_picture_outline_28, R.attr.vk_ui_icon_accent), null, 0, AccountAvatarAction.SELECT_FROM_GALLERY, false, null, 985), new jwb0(null, R.string.vkim_profile_delete_avatar_option, r0.b(R.drawable.vk_icon_delete_outline_28, R.attr.vk_ui_background_negative), null, 0, AccountAvatarAction.DELETE, false, null, 857)), list, null, 11263);
            dhr0.a.getClass();
            abg0 abg0Var = dhr0.t;
        }
    }

    /* compiled from: Popup.kt */
    public static final class a0 extends m<DndPeriod> {
        public static final a0 o = new a0(null, null, null, null, null, e43.l(new jwb0(null, R.string.vkim_popup_dialog_dnd_period_1hour, null, null, 0, DndPeriod.HOUR, false, null, 989), new jwb0(null, R.string.vkim_popup_dialog_dnd_period_8hour, null, null, 0, DndPeriod.HOURS_8, false, null, 989), new jwb0(null, R.string.vkim_popup_dialog_dnd_period_1day, null, null, 0, DndPeriod.DAY, false, null, 989), new jwb0(null, R.string.vkim_popup_dialog_dnd_period_1week, null, null, 0, DndPeriod.WEEK, false, null, 989), new jwb0(null, R.string.vkim_popup_dialog_dnd_period_forever, null, null, 0, DndPeriod.FOREVER, false, null, 989)), rl3.u0(DndPeriod.values()), null, 11263);
    }

    /* compiled from: Popup.kt */
    public static class a1 extends cwb0 {
        public final int b;
        public final CharSequence c;
        public final int d;
        public final CharSequence e;
        public final int f;
        public final CharSequence g;
        public final int h;
        public final CharSequence i;
        public final Drawable j;
        public final c1 k;

        public a1(int i, CharSequence charSequence, int i2, String str, int i3, SpannableStringBuilder spannableStringBuilder, int i4, SpannableStringBuilder spannableStringBuilder2, Drawable drawable, c1 c1Var, int i5) {
            i = (i5 & 1) != 0 ? 0 : i;
            charSequence = (i5 & 2) != 0 ? "" : charSequence;
            i2 = (i5 & 4) != 0 ? 0 : i2;
            str = (i5 & 8) != 0 ? "" : str;
            i3 = (i5 & 16) != 0 ? 0 : i3;
            String str2 = (i5 & 32) != 0 ? "" : spannableStringBuilder;
            i4 = (i5 & 64) != 0 ? 0 : i4;
            String str3 = (i5 & 128) != 0 ? "" : spannableStringBuilder2;
            drawable = (i5 & 256) != 0 ? null : drawable;
            c1Var = (i5 & 512) != 0 ? c1.c.a : c1Var;
            this.b = i;
            this.c = charSequence;
            this.d = i2;
            this.e = str;
            this.f = i3;
            this.g = str2;
            this.h = i4;
            this.i = str3;
            this.j = drawable;
            this.k = c1Var;
        }
    }

    /* compiled from: Popup.kt */
    public static final class b extends s0 {
        public static final b e = new b(null, R.string.vkim_popup_invite_to_chat_progress_desc, 5);
    }

    /* compiled from: Popup.kt */
    public static final class b0 extends m<HistoryAttachAction> {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b0(Context context, ArrayList arrayList, boolean z) {
            super(null, null, null, null, null, e43.l(r16, r17, r18, r12, r13, r14, new jwb0(null, R.string.vkim_history_attaches_video_menu_delete, dhr0.t.b(R.drawable.vk_icon_delete_outline_28, R.attr.vk_ui_background_negative), null, 0, HistoryAttachAction.DELETE, false, null, 985)), arrayList, r8, 3071);
            Drawable e;
            Drawable e2;
            Drawable e3;
            Drawable e4;
            Drawable e5;
            Drawable e6;
            c1.c cVar = c1.c.a;
            if (z) {
                dhr0.a.getClass();
                e = dhr0.t.b(R.drawable.vk_icon_deprecated_ic_goto_outline_28, R.attr.vk_ui_icon_accent);
            } else {
                e = enj.e(R.drawable.vk_icon_deprecated_ic_goto_outline_28, R.attr.vk_ui_icon_accent, context);
            }
            jwb0 jwb0Var = new jwb0(null, R.string.vkim_history_attach_open_msg, e, null, 0, HistoryAttachAction.GO_TO_MSG, false, null, 985);
            if (z) {
                dhr0.a.getClass();
                e2 = dhr0.t.b(R.drawable.vk_icon_share_outline_28, R.attr.vk_ui_icon_accent);
            } else {
                e2 = enj.e(R.drawable.vk_icon_share_outline_28, R.attr.vk_ui_icon_accent, context);
            }
            jwb0 jwb0Var2 = new jwb0(null, R.string.vkim_share, e2, null, 0, HistoryAttachAction.SHARE, false, null, 985);
            if (z) {
                dhr0.a.getClass();
                e3 = dhr0.t.b(R.drawable.vk_icon_copy_outline_28, R.attr.vk_ui_icon_accent);
            } else {
                e3 = enj.e(R.drawable.vk_icon_copy_outline_28, R.attr.vk_ui_icon_accent, context);
            }
            jwb0 jwb0Var3 = new jwb0(null, R.string.vkim_copy_link, e3, null, 0, HistoryAttachAction.COPY_LINK, false, null, 985);
            if (z) {
                dhr0.a.getClass();
                e4 = dhr0.t.b(R.drawable.vk_icon_add_outline_28, R.attr.vk_ui_icon_accent);
            } else {
                e4 = enj.e(R.drawable.vk_icon_add_outline_28, R.attr.vk_ui_icon_accent, context);
            }
            jwb0 jwb0Var4 = new jwb0(null, R.string.vkim_history_attaches_video_menu_add, e4, null, 0, HistoryAttachAction.ADD, false, null, 985);
            if (z) {
                dhr0.a.getClass();
                e5 = dhr0.t.b(R.drawable.vk_icon_add_square_outline_28, R.attr.vk_ui_icon_accent);
            } else {
                e5 = enj.e(R.drawable.vk_icon_add_square_outline_28, R.attr.vk_ui_icon_accent, context);
            }
            jwb0 jwb0Var5 = new jwb0(null, R.string.vkim_history_attaches_video_menu_add_to_playlist, e5, null, 0, HistoryAttachAction.ADD_TO_ALBUM, false, null, 985);
            if (z) {
                dhr0.a.getClass();
                e6 = dhr0.t.b(R.drawable.vk_icon_download_outline_28, R.attr.vk_ui_icon_accent);
            } else {
                e6 = enj.e(R.drawable.vk_icon_download_outline_28, R.attr.vk_ui_icon_accent, context);
            }
            jwb0 jwb0Var6 = new jwb0(null, R.string.vkim_download, e6, null, 0, HistoryAttachAction.SAVE_TO_GALLERY, false, null, 985);
            dhr0.a.getClass();
        }
    }

    /* compiled from: Popup.kt */
    public static class b1<T> {
        public final int a;
        public final CharSequence b;
        public final int c;
        public final String d;
        public final SpannableStringBuilder e;
        public final int f;
        public final String g;
        public final c1 h;
        public final List<jwb0<T>> i;
        public final List<T> j;

        public b1(int i, CharSequence charSequence, int i2, SpannableStringBuilder spannableStringBuilder, int i3, List list, List list2, int i4) {
            i = (i4 & 1) != 0 ? 0 : i;
            charSequence = (i4 & 2) != 0 ? "" : charSequence;
            c1.c cVar = c1.c.a;
            this.a = i;
            this.b = charSequence;
            this.c = i2;
            this.d = "";
            this.e = spannableStringBuilder;
            this.f = i3;
            this.g = "";
            this.h = cVar;
            this.i = list;
            this.j = list2;
        }
    }

    /* compiled from: Popup.kt */
    public static final class c extends s0 {
        public static final c e = new c(null, R.string.vkim_popup_unset_admin_progress_desc, 5);
    }

    /* compiled from: Popup.kt */
    public static final class c0 extends a1 {
        public static final c0 l = new c0(0, null, R.string.vkim_contacts_invite_confirm_title, null, R.string.vkim_invite, null, R.string.vkim_cancel, null, null, null, 939);
    }

    /* compiled from: Popup.kt */
    public static abstract class c1 {

        /* compiled from: Popup.kt */
        public static final class a extends c1 {
        }

        /* compiled from: Popup.kt */
        public static final class b extends c1 {
            public static final b a = new b();
        }

        /* compiled from: Popup.kt */
        public static final class c extends c1 {
            public static final c a = new c();
        }
    }

    /* compiled from: Popup.kt */
    public static final class d extends s0 {
        public static final d e = new d(null, R.string.vkim_popup_set_admin_progress_desc, 5);
    }

    /* compiled from: Popup.kt */
    public static final class d0 extends a1 {
        public d0(Context context, int i) {
            super(R.string.vkim_invite_share_msgs_title, null, 0, context.getString(R.string.vkim_invite_share_msgs_description, Integer.valueOf(i)), R.string.vkim_invite_share_msgs_yes, null, R.string.vkim_invite_share_msgs_no, null, null, null, 934);
        }
    }

    /* compiled from: Popup.kt */
    public static final class d1 extends a1 {
        public static final d1 l = new d1(R.string.vkim_video_delete_alert_title, null, R.string.vkim_video_delete_alert_message, null, R.string.delete, null, R.string.vkim_cancel, null, null, null, 938);
    }

    /* compiled from: Popup.kt */
    public static final class e0 extends s0 {
        public static final e0 e = new e0(null, R.string.vkim_popup_kick_from_chat_progress_desc, 5);
    }

    /* compiled from: Popup.kt */
    public static final class f extends s0 {
        public static final f e = new f(null, R.string.vkim_popup_avatar_change_progress_desc, 5);
    }

    /* compiled from: Popup.kt */
    public static final class f0 extends a1 {
        public static final f0 l = new f0(0, null, R.string.vkim_kick_submit_description, null, R.string.vkim_kick_submit_yes, null, R.string.vkim_kick_submit_no, null, null, null, 939);
    }

    /* compiled from: Popup.kt */
    public static final class g extends s0 {
        public static final g e = new g(null, R.string.vkim_popup_avatar_remove_progress_desc, 5);
    }

    /* compiled from: Popup.kt */
    public static final class g0 extends s0 {
        public g0(DialogExt dialogExt) {
            super(null, dialogExt.i ? R.string.vkim_msg_header_leave_channel_progress_desc : R.string.vkim_msg_header_leave_chat_progress_desc, 5);
        }
    }

    /* compiled from: Popup.kt */
    public static final class h extends a1 {
        public static final h l = new h(R.string.vkim_confirm, null, R.string.vkim_popup_avatar_remove_submit_desc, null, R.string.vkim_popup_avatar_remove_submit_yes, null, R.string.vkim_no, null, null, null, 938);
    }

    /* compiled from: Popup.kt */
    public static final class i extends m<BanDuration> {
        public final int o;

        public i() {
            this(0);
        }

        @Override // xsna.cwb0.m
        public final int a() {
            return this.o;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.o == ((i) obj).o;
        }

        public final int hashCode() {
            return Integer.hashCode(this.o);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("BanDurationChooser(titleRes="), this.o, ')');
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public i(int i) {
            super(null, 8388611, Integer.valueOf(r0), Integer.valueOf(r1), null, r8, BanDuration.i(), r10, 3011);
            int c = dhr0.t.c(R.attr.vk_ui_text_secondary);
            int b = cn70.b(16);
            c1.b bVar = c1.b.a;
            zrp<BanDuration> i2 = BanDuration.i();
            ArrayList arrayList = new ArrayList(c5g.u(i2, 10));
            for (BanDuration banDuration : i2) {
                arrayList.add(new jwb0(null, banDuration.j(), null, null, 0, banDuration, false, null, 989));
            }
            this.o = R.string.vkim_msg_ban_user_period_title;
        }
    }

    /* compiled from: Popup.kt */
    public static final class i0 extends m<LinkAction> {
        public i0(List<? extends LinkAction> list) {
            super(null, null, null, null, null, e43.l(new jwb0(null, R.string.vkim_msg_list_link_option_open, null, null, 0, LinkAction.OPEN, false, null, 989), new jwb0(null, R.string.vkim_msg_list_link_option_write, null, null, 0, LinkAction.EMAIL, false, null, 989), new jwb0(null, R.string.vkim_msg_list_link_option_call, null, null, 0, LinkAction.CALL, false, null, 989), new jwb0(null, R.string.vkim_msg_list_link_option_copy, null, null, 0, LinkAction.COPY, false, null, 989)), list, null, 11263);
        }
    }

    /* compiled from: Popup.kt */
    public static final class j extends s0 {
        public static final j e = new j(null, R.string.vkim_msg_header_chat_controls_progress_desc, 5);
    }

    /* compiled from: Popup.kt */
    public static final class j0 extends s0 {
        public static final j0 e = new j0(null, R.string.vkim_loading, 5);
    }

    /* compiled from: Popup.kt */
    public static final class k extends s0 {
        public static final k e = new k(null, R.string.vkim_popup_title_change_progress_desc, 5);
    }

    /* compiled from: Popup.kt */
    public static final class k0 extends m<MemberAction> {
        public k0(List<? extends MemberAction> list, boolean z, boolean z2) {
            super(null, null, null, null, null, e43.l(new jwb0(null, R.string.vkim_chat_settings_ban_user, null, null, z ? R.drawable.vk_icon_message_cross_outline_28 : 0, MemberAction.WRITE_DISABLE, false, null, 973), new jwb0(null, R.string.vkim_chat_settings_unban_user, null, null, z ? R.drawable.vk_icon_message_check_outline_28 : 0, MemberAction.WRITE_ENABLE, false, null, 973), new jwb0(null, R.string.vkim_chat_settings_set_admin, null, null, z ? R.drawable.vk_icon_favorite_outline_28 : 0, MemberAction.ADMIN_SET, false, null, 973), new jwb0(null, R.string.vkim_chat_settings_unset_admin, null, null, z ? R.drawable.vk_icon_unfavorite_outline_28 : 0, MemberAction.ADMIN_UNSET, false, null, 973), new jwb0(null, R.string.vkim_chat_settings_kick_user, null, null, z ? R.drawable.vk_icon_block_outline_28 : 0, MemberAction.KICK, false, null, 845), new jwb0(null, z2 ? R.string.vkim_chat_settings_set_self_owner : R.string.vkim_chat_settings_set_owner, null, null, z ? R.drawable.vk_icon_favorite_outline_28 : 0, MemberAction.OWNER_SET, false, null, 845)), list, c1.b.a, 3071);
        }
    }

    /* compiled from: Popup.kt */
    public static final class l extends a1 {
        public static final l l = new l(R.string.vkim_dialogs_list_confirm_title, null, R.string.vkim_chat_make_link_invalidate_confrm, null, R.string.vkim_chat_make_link_invalidate_confirm_ok, null, R.string.vkim_cancel, null, null, null, 938);
    }

    /* compiled from: Popup.kt */
    public static final class l0 extends m<ug30> {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public l0(Context context, List list, Map map, String str, int i) {
            super(r5, 3, Integer.valueOf(r2), null, Integer.valueOf(cwb0.a), e43.l(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, new jwb0(r39, 0, null, null, R.drawable.vk_icon_copy_outline_28, r3 == null ? new ug30.d(0) : r3, false, null, 966)), list, r12, 2850);
            Object obj;
            Object obj2;
            Object obj3;
            Object obj4;
            Object obj5;
            Object obj6;
            String str2;
            Map map2 = (i & 8) != 0 ? jgp.b : map;
            String str3 = (i & 16) != 0 ? null : str;
            int f = e3m.f(R.attr.vk_ui_text_subhead, context);
            c1.b bVar = c1.b.a;
            ug30.n nVar = ug30.n.a;
            jwb0 jwb0Var = new jwb0(null, 0, null, null, 0, nVar, false, (cpj0) map2.get(nVar), 735);
            jwb0 jwb0Var2 = new jwb0(null, R.string.vkim_msg_action_retry, null, null, R.drawable.vk_icon_send_outline_28, ug30.t.a, false, null, 965);
            jwb0 jwb0Var3 = new jwb0(null, R.string.vkim_msg_action_send_now, null, null, R.drawable.vk_icon_send_outline_28, ug30.v.a, false, null, 965);
            jwb0 jwb0Var4 = new jwb0(null, R.string.vkim_delay_msg_send, null, null, R.drawable.vk_icon_send_clock_outline_28, ug30.u.a, false, null, 965);
            jwb0 jwb0Var5 = new jwb0(null, R.string.vkim_msg_action_edit_publish_date, null, null, R.drawable.vk_icon_clock_outline_28, ug30.k.a, false, null, 965);
            jwb0 jwb0Var6 = new jwb0(null, R.string.vkim_msg_action_reply, null, null, R.drawable.vk_icon_reply_outline_28, ug30.q.a, false, null, 965);
            jwb0 jwb0Var7 = new jwb0(null, R.string.vkim_msg_action_reply_personally, null, null, R.drawable.vk_icon_message_outline_28, ug30.r.a, false, null, 965);
            jwb0 jwb0Var8 = new jwb0(null, R.string.vkim_msg_action_forward, null, null, R.drawable.vk_icon_share_outline_28, ug30.m.a, false, null, 965);
            ug30.y yVar = ug30.y.a;
            jwb0 jwb0Var9 = new jwb0(null, R.string.vkim_msg_action_share_to_story, null, null, R.drawable.vk_icon_story_outline_28, yVar, false, (cpj0) map2.get(yVar), 709);
            jwb0 jwb0Var10 = new jwb0(null, R.string.vkim_msg_action_pin, null, null, R.drawable.vk_icon_pin_outline_28, ug30.p.a, false, null, 965);
            jwb0 jwb0Var11 = new jwb0(null, R.string.vkim_msg_action_unpin, null, null, R.drawable.vk_icon_unpin_outline_28, ug30.b0.a, false, null, 965);
            jwb0 jwb0Var12 = new jwb0(null, R.string.vkim_download, null, null, R.drawable.vk_icon_download_outline_28, ug30.i.a, false, null, 965);
            List list2 = list;
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (obj instanceof ug30.w) {
                        break;
                    }
                }
            }
            ug30.w wVar = (ug30.w) (obj instanceof ug30.w ? obj : null);
            ug30.w wVar2 = wVar == null ? new ug30.w(true) : wVar;
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it2.next();
                    if (obj2 instanceof ug30.w) {
                        break;
                    }
                }
            }
            ug30.w wVar3 = (ug30.w) (obj2 instanceof ug30.w ? obj2 : null);
            jwb0 jwb0Var13 = new jwb0(null, R.string.vkim_msg_action_share_file, null, null, R.drawable.vk_icon_share_external_outline_28, wVar2, wVar3 != null ? wVar3.a : true, null, 901);
            Iterator it3 = list2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj3 = null;
                    break;
                } else {
                    obj3 = it3.next();
                    if (obj3 instanceof ug30.x) {
                        break;
                    }
                }
            }
            ug30.x xVar = (ug30.x) (obj3 instanceof ug30.x ? obj3 : null);
            ug30.x xVar2 = xVar == null ? new ug30.x(true) : xVar;
            Iterator it4 = list2.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    obj4 = null;
                    break;
                } else {
                    obj4 = it4.next();
                    if (obj4 instanceof ug30.x) {
                        break;
                    }
                }
            }
            ug30.x xVar3 = (ug30.x) (obj4 instanceof ug30.x ? obj4 : null);
            jwb0 jwb0Var14 = new jwb0(null, R.string.vkim_msg_action_share_files, null, null, R.drawable.vk_icon_share_external_outline_28, xVar2, xVar3 != null ? xVar3.a : true, null, 901);
            jwb0 jwb0Var15 = new jwb0(null, R.string.vkim_msg_action_copy, null, null, R.drawable.vk_icon_copy_outline_28, ug30.c.a, false, null, 965);
            jwb0 jwb0Var16 = new jwb0(null, R.string.vkim_msg_action_edit, null, null, R.drawable.vk_icon_edit_outline_28, ug30.j.a, false, null, 965);
            jwb0 jwb0Var17 = new jwb0(null, R.string.vkim_msg_action_copy_transcription, null, null, R.drawable.vk_icon_copy_outline_28, ug30.f.a, false, null, 965);
            jwb0 jwb0Var18 = new jwb0(null, R.string.vkim_msg_action_edit_transcription, null, null, R.drawable.vk_icon_edit_outline_28, ug30.l.a, false, null, 965);
            jwb0 jwb0Var19 = new jwb0(null, R.string.vkim_msg_action_translate, null, null, R.drawable.vk_icon_globe_outline_28, ug30.a0.a, false, null, 965);
            ug30.e0 e0Var = ug30.e0.a;
            jwb0 jwb0Var20 = new jwb0(null, 0, null, null, 0, e0Var, false, (cpj0) map2.get(e0Var), 735);
            jwb0 jwb0Var21 = new jwb0(null, R.string.vkim_msg_action_copy_message_link, null, null, R.drawable.vk_icon_chain_outline_28, ug30.e.a, false, null, 965);
            jwb0 jwb0Var22 = new jwb0(null, R.string.vkim_msg_action_report, null, null, R.drawable.vk_icon_report_outline_28, ug30.s.a, false, null, 845);
            jwb0 jwb0Var23 = new jwb0(null, R.string.vkim_msg_action_delete, null, null, R.drawable.vk_icon_delete_outline_28, ug30.g.a, false, null, 845);
            jwb0 jwb0Var24 = new jwb0(null, R.string.vkim_msg_action_back_to_msg_actions, null, null, R.drawable.vk_icon_arrow_left_outline_28, ug30.b.a, false, null, 461);
            jwb0 jwb0Var25 = new jwb0(null, R.string.vkim_msg_action_abount_advertiser, null, null, R.drawable.vk_icon_advertising_outline_28, ug30.a.a, false, null, 965);
            Iterator it5 = list2.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    obj5 = null;
                    break;
                } else {
                    obj5 = it5.next();
                    if (obj5 instanceof ug30.d) {
                        break;
                    }
                }
            }
            ug30.d dVar = (ug30.d) (obj5 instanceof ug30.d ? obj5 : null);
            String string = context.getString(R.string.vkim_msg_action_erid, (dVar == null || (str2 = dVar.a) == null) ? "" : str2);
            Iterator it6 = list2.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj6 = null;
                    break;
                } else {
                    obj6 = it6.next();
                    if (obj6 instanceof ug30.d) {
                        break;
                    }
                }
            }
            ug30.d dVar2 = (ug30.d) (obj6 instanceof ug30.d ? obj6 : null);
        }
    }

    /* compiled from: Popup.kt */
    public static class m<T> extends cwb0 {
        public final CharSequence b;
        public final int c;
        public final Integer d;
        public final Integer e;
        public final Integer f;
        public final Integer g;
        public final Integer h;
        public final Integer i;
        public final int j;
        public final int k;
        public final List<jwb0<T>> l;
        public final List<T> m;
        public final c1 n;

        public m(CharSequence charSequence, Integer num, Integer num2, Integer num3, Integer num4, List list, List list2, c1 c1Var, int i) {
            Integer valueOf = Integer.valueOf(R.style.VkUiTypography_FootnoteMedium);
            charSequence = (i & 1) != 0 ? null : charSequence;
            num = (i & 4) != 0 ? null : num;
            valueOf = (i & 8) != 0 ? null : valueOf;
            num2 = (i & 16) != 0 ? null : num2;
            num3 = (i & 32) != 0 ? null : num3;
            Integer num5 = (i & 64) != 0 ? null : 0;
            num4 = (i & 128) != 0 ? null : num4;
            c1Var = (i & 8192) != 0 ? c1.c.a : c1Var;
            this.b = charSequence;
            this.c = 0;
            this.d = num;
            this.e = valueOf;
            this.f = num2;
            this.g = num3;
            this.h = num5;
            this.i = num4;
            this.j = -1;
            this.k = -1;
            this.l = list;
            this.m = list2;
            this.n = c1Var;
        }

        public int a() {
            return this.c;
        }
    }

    /* compiled from: Popup.kt */
    public static final class m0 extends m<ug30> {
    }

    /* compiled from: Popup.kt */
    public static class n<T extends Enum<T>> extends m<T> {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public n(T[] tArr) {
            super("", null, null, null, null, r6, rl3.u0(tArr), r8, 3068);
            c1.b bVar = c1.b.a;
            ArrayList arrayList = new ArrayList(tArr.length);
            for (T t : tArr) {
                arrayList.add(new jwb0(t.name(), 0, null, null, 0, t, false, null, 990));
            }
        }
    }

    /* compiled from: Popup.kt */
    public static final class n0 extends s0 {
        public static final n0 e = new n0(null, R.string.vkim_popup_msg_request_decline_all_progress_desc, 5);
    }

    /* compiled from: Popup.kt */
    public static final class o extends a1 {
        public o(String str) {
            super((str == null || str.length() == 0) ? R.string.vk_confirm : 0, str == null ? "" : str, R.string.vkim_msg_header_clear_submit_desc, null, R.string.vkim_clear_history, null, R.string.vkim_no, null, null, null, 936);
        }
    }

    /* compiled from: Popup.kt */
    public static final class o0 extends a1 {
        public static final o0 l = new o0(0, null, R.string.vkim_popup_msg_request_decline_all_submit_desc, null, R.string.vkim_popup_msg_request_decline_submit_yes, null, R.string.vkim_cancel, null, null, null, 939);
    }

    /* compiled from: Popup.kt */
    public static final class p extends s0 {
        public p(String str) {
            super(str == null ? "" : str, R.string.vkim_msg_header_clear_progress_desc, 4);
        }
    }

    /* compiled from: Popup.kt */
    public static final class p0 extends a1 {
    }

    /* compiled from: Popup.kt */
    public static final class q extends b1<u8m> {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public q(Context context, Dialog dialog, CharSequence charSequence) {
            super(0, r4, R.string.vkim_msg_header_clear_submit_desc, r6, R.string.vkim_cancel, r8, r9, 921);
            CharSequence string = (charSequence == null || charSequence.length() == 0) ? context.getString(R.string.vk_confirm) : charSequence;
            SpannableStringBuilder c = cqm0.c(e3m.f(R.attr.vk_ui_background_negative, context), context.getString(R.string.vkim_clear_history));
            u8m.o0 o0Var = u8m.o0.b;
            List singletonList = Collections.singletonList(new jwb0(null, R.string.vkim_chat_actions_delete_spam, null, null, 0, o0Var, false, null, 989));
            ArrayList arrayList = new ArrayList();
            p4g.a(o0Var, arrayList, dialog.t1() && dialog.Cb());
            s3q0 s3q0Var = s3q0.a;
        }
    }

    /* compiled from: Popup.kt */
    public static final class q0 extends a1 {
        public q0(Context context, int i, com.vk.im.engine.models.c cVar) {
            super(0, null, 0, cVar.n() ? enj.f(R.plurals.vkim_pin_im_item_limit_exceded_msg, i, context) : enj.f(R.plurals.vkim_pin_dialog_limit_exceded_msg, i, context), 0, null, R.string.close, null, null, null, 951);
        }
    }

    /* compiled from: Popup.kt */
    public static final class r extends a1 {
    }

    /* compiled from: Popup.kt */
    public static final class r0 extends s0 {
        public static final r0 e = new r0(null, R.string.vkim_popup_cnv_bar_cb_progress_desc, 5);
    }

    /* compiled from: Popup.kt */
    public static final class s extends a1 {
        public s(Context context) {
            super(R.string.vkim_dialog_title_create_casper_chat, null, R.string.vkim_dialog_message_create_casper_chat, null, R.string.vkim_dialog_btn_create_casper_chat, null, R.string.vkim_cancel, null, enj.e(R.drawable.vk_icon_ghost_outline_56, R.attr.vk_ui_icon_accent, context), c1.b.a, 170);
        }
    }

    /* compiled from: Popup.kt */
    public static class s0 extends cwb0 {
        public final CharSequence b;
        public final int c;
        public final String d;

        public s0(CharSequence charSequence, int i, int i2) {
            charSequence = (i2 & 1) != 0 ? "" : charSequence;
            i = (i2 & 2) != 0 ? 0 : i;
            this.b = charSequence;
            this.c = i;
            this.d = "";
        }
    }

    /* compiled from: Popup.kt */
    public static final class t extends s0 {
        public static final t e = new t(null, R.string.vkim_create_casper_chat_progress, 5);
    }

    /* compiled from: Popup.kt */
    public static final class t0 extends m<PromoLinkAction> {
        public t0() {
            super(null, null, null, null, null, e43.o(new jwb0(null, R.string.vkim_promo_link_action_hide, null, null, R.drawable.vk_icon_block_outline_28, PromoLinkAction.HIDE_PROMO_LINK, false, null, 845)), rl3.u0(PromoLinkAction.values()), c1.b.a, 3071);
        }
    }

    /* compiled from: Popup.kt */
    public static final class u extends a1 {
    }

    /* compiled from: Popup.kt */
    public static final class u0 extends a1 {
        public static final u0 l = new u0(0, null, R.string.vkim_contacts_reset_confirm_title, null, R.string.vkim_yes, null, R.string.vkim_cancel, null, null, null, 939);
    }

    /* compiled from: Popup.kt */
    public static final class v extends a1 {
        public v(Context context) {
            super(0, context.getString(R.string.vkim_chat_delete_confirm_title), R.string.vkim_chat_delete_confirm_desc, null, 0, cqm0.c(e3m.f(R.attr.vk_ui_background_negative, context), context.getString(R.string.vkim_chat_delete_confirm_positive)), R.string.vkim_cancel, null, null, null, 921);
        }
    }

    /* compiled from: Popup.kt */
    public static final class v0 extends s0 {
        public v0(DialogExt dialogExt) {
            super(null, dialogExt.i ? R.string.vkim_msg_header_return_to_channel_progress_desc : R.string.vkim_msg_header_return_to_chat_progress_desc, 5);
        }
    }

    /* compiled from: Popup.kt */
    public static final class w extends s0 {
        public w(String str) {
            super(str == null ? "" : str, R.string.vkim_chat_delete_progress_desc, 4);
        }
    }

    /* compiled from: Popup.kt */
    public static final class w0 extends a1 {
        public static final w0 l = new w0(R.string.vkim_popup_search_clear_recent_submit_title, null, R.string.vkim_popup_search_clear_recent_submit_desc, null, R.string.accessibility_clear, null, R.string.vkim_cancel, null, null, null, 938);
    }

    /* compiled from: Popup.kt */
    public static final class x extends s0 {
        public x() {
            super(null, R.string.vkim_msg_header_delete_spam_chat_progress_desc, 5);
        }
    }

    /* compiled from: Popup.kt */
    public static final class x0 extends a1 {
        public static final x0 l = new x0(0, null, R.string.vkim_popup_share_confirm_desc, null, R.string.vkim_send, null, R.string.vkim_cancel, null, null, null, 939);
    }

    /* compiled from: Popup.kt */
    public static final class y extends a1 {
    }

    /* compiled from: Popup.kt */
    public static final class y0 extends s0 {
        public static final y0 e = new y0(null, R.string.vkim_popup_set_owner_progress_desc, 5);
    }

    /* compiled from: Popup.kt */
    public static final class z extends m<u8m> {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public z(List list) {
            super(null, null, null, null, null, e43.l(r9, r19, r19, r19, r19, r14, r15, r16, r17, r18, r19, r19, r19, r19, r19, r19, r24, r24, r24, r30, r31, r32, r19, r33, r34, r35, new jwb0(null, R.string.vkim_channel_leave, null, null, R.drawable.vk_icon_door_arrow_right_outline_28, u8m.c0.b, false, null, 845), new jwb0(null, R.string.vkim_msg_header_menu_leave_chat, null, null, R.drawable.vk_icon_door_arrow_right_outline_28, u8m.b0.b, false, null, 845)), list, r8, 3071);
            c1.b bVar = c1.b.a;
            jwb0 jwb0Var = new jwb0(null, R.string.vkim_dialogs_list_option_mark_as_read, null, null, R.drawable.vk_icon_message_outline_28, u8m.d0.b, false, null, 965);
            jwb0 jwb0Var2 = new jwb0(null, R.string.vkim_dialogs_list_option_mark_as_unread, null, null, R.drawable.vk_icon_message_unread_top_28, u8m.e0.b, false, null, 965);
            jwb0 jwb0Var3 = new jwb0(null, R.string.vkim_dialogs_list_option_create_shortcut, null, null, R.drawable.vk_icon_add_square_outline_28, u8m.p.b, false, null, 965);
            jwb0 jwb0Var4 = new jwb0(null, R.string.vkim_dialogs_list_option_notifications_on, null, null, R.drawable.vk_icon_notifications_28, u8m.g0.b, false, null, 965);
            jwb0 jwb0Var5 = new jwb0(null, R.string.vkim_dialogs_list_option_notifications_off, null, null, R.drawable.vk_icon_notification_disable_outline_28, u8m.f0.b, false, null, 965);
            jwb0 jwb0Var6 = new jwb0(null, R.string.vkim_groups_receive_msg_enable, null, null, R.drawable.vk_icon_notifications_28, u8m.x.b, false, null, 965);
            jwb0 jwb0Var7 = new jwb0(null, R.string.vkim_groups_receive_msg_disable, null, null, R.drawable.vk_icon_notification_disable_outline_28, u8m.v.b, false, null, 965);
            jwb0 jwb0Var8 = new jwb0(null, R.string.vkim_groups_receive_notify_disable, null, null, R.drawable.vk_icon_notification_disable_outline_28, u8m.y.b, false, null, 965);
            jwb0 jwb0Var9 = new jwb0(null, R.string.vkim_dialogs_list_option_pin, null, null, R.drawable.vk_icon_pin_outline_28, u8m.m0.b, false, null, 965);
            jwb0 jwb0Var10 = new jwb0(null, R.string.vkim_dialogs_list_option_unpin, null, null, R.drawable.vk_icon_unpin_outline_28, u8m.u0.b, false, null, 965);
            jwb0 jwb0Var11 = new jwb0(null, R.string.vkim_dialog_archive, null, null, R.drawable.vk_icon_archive_outline_28, u8m.c.b, false, null, 965);
            jwb0 jwb0Var12 = new jwb0(null, R.string.vkim_dialog_unarchive, null, null, R.drawable.vk_icon_unarchive_outline_28, u8m.t0.b, false, null, 965);
            jwb0 jwb0Var13 = new jwb0(null, R.string.vkim_folder_dialog_option_add_to_folder, null, null, R.drawable.vk_icon_add_square_outline_28, u8m.b.b, false, null, 965);
            jwb0 jwb0Var14 = new jwb0(null, R.string.vkim_folder_dialog_option_remove_from_folder, null, null, R.drawable.vk_icon_arrow_uturn_left_outline_28, u8m.n0.b, false, null, 965);
            jwb0 jwb0Var15 = new jwb0(null, R.string.vkim_msg_ban_writing_to_chat, null, null, R.drawable.vk_icon_message_cross_outline_28, u8m.k.b, false, null, 965);
            jwb0 jwb0Var16 = new jwb0(null, R.string.vkim_msg_unban_writing_to_chat, null, null, R.drawable.vk_icon_message_check_outline_28, u8m.l.b, false, null, 965);
            jwb0 jwb0Var17 = new jwb0(null, R.string.vkim_clear_history, null, null, R.drawable.vk_icon_clear_data_outline_28, u8m.m.b, false, null, 845);
            jwb0 jwb0Var18 = new jwb0(null, R.string.vkim_clear_history_and_leave, null, null, R.drawable.vk_icon_clear_data_outline_28, u8m.n.b, false, null, 845);
            jwb0 jwb0Var19 = new jwb0(null, R.string.vkim_chat_delete_action, null, null, R.drawable.vk_icon_delete_outline_28, u8m.t.b, false, null, 845);
            g2v.c().getClass();
            jwb0 jwb0Var20 = new jwb0(null, R.string.vkim_delete_channel_title, null, null, R.drawable.vk_icon_delete_outline_28, u8m.s.b, false, null, 845);
            jwb0 jwb0Var21 = new jwb0(null, R.string.vkim_groups_receive_msg_disable_and_clear_history, null, null, R.drawable.vk_icon_clear_data_outline_28, u8m.w.b, false, null, 845);
            jwb0 jwb0Var22 = new jwb0(null, R.string.vkim_dialogs_list_option_return, null, null, R.drawable.vk_icon_door_arrow_left_outline_28, u8m.p0.b, false, null, 973);
            jwb0 jwb0Var23 = new jwb0(null, R.string.vkim_msg_header_menu_return_to_channel, null, null, R.drawable.vk_icon_door_arrow_left_outline_28, u8m.q0.b, false, null, 965);
            jwb0 jwb0Var24 = new jwb0(null, R.string.vkim_show_channel_in_all_folder, null, null, R.drawable.vk_icon_view_outline_28, u8m.s0.b, false, null, 973);
            jwb0 jwb0Var25 = new jwb0(null, R.string.vkim_hide_channel_in_all_folder, null, null, R.drawable.vk_icon_hide_outline_28, u8m.z.b, false, null, 973);
            jwb0 jwb0Var26 = new jwb0(null, R.string.vkim_complain_to_channel, null, null, R.drawable.vk_icon_report_outline_28, u8m.o.b, false, null, 845);
            g2v.c().getClass();
        }
    }

    /* compiled from: Popup.kt */
    public static final class z0 extends a1 {
        public static final z0 l = new z0(R.string.vkim_setowner_submit_title, null, R.string.vkim_setowner_submit_description, null, R.string.vkim_setowner_submit_yes, null, R.string.vkim_setowner_submit_no, null, null, null, 938);
    }

    /* compiled from: Popup.kt */
    public static final class e extends m<AvatarAction> {
        public /* synthetic */ e(ArrayList arrayList) {
            this(arrayList, c1.c.a);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public e(ArrayList arrayList, c1 c1Var) {
            super(null, null, null, null, null, e43.o(new jwb0(null, R.string.vkim_take_photo_from_gallery, null, Integer.valueOf(r10.c(R.attr.vk_ui_icon_accent)), R.drawable.vk_icon_picture_outline_28, r6, false, null, 965), new jwb0(null, R.string.vkim_chat_settings_avatar_generate, r10.b(R.drawable.vk_icon_stars_outline_28, R.attr.vk_ui_icon_accent), Integer.valueOf(r10.c(R.attr.vk_ui_icon_accent)), 0, AvatarAction.CHANGE_BY_MINI_APP, false, null, 977), new jwb0(null, R.string.vkim_take_photo_from_camera, null, Integer.valueOf(r10.c(R.attr.vk_ui_icon_accent)), R.drawable.vk_icon_camera_outline_28, AvatarAction.CHANGE_BY_CAMERA, false, null, 965), new jwb0(null, R.string.vkim_chat_settings_avatar_remove, null, null, R.drawable.vk_icon_delete_outline_28, AvatarAction.REMOVE, false, null, 845)), arrayList, c1Var, 3071);
            AvatarAction avatarAction = AvatarAction.CHANGE_BY_GALLERY;
            abg0 abg0Var = dhr0.t;
        }
    }

    /* compiled from: Popup.kt */
    public static final class h0 extends b1<u8m> {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public h0(Context context, DialogExt dialogExt, boolean z, List<? extends u8m> list) {
            super(r1 ? R.string.vk_confirm : R.string.vkim_msg_header_leave_chat_submit_title, null, r1 ? R.string.vkim_msg_header_leave_channel_submit_desc : z ? R.string.vkim_dialogs_list_clear_and_leave_submit_desc : R.string.vkim_msg_header_leave_chat_submit_desc, cqm0.c(e3m.f(R.attr.vk_ui_background_negative, context), context.getString(R.string.vkim_exit)), R.string.vkim_kick_submit_no, Collections.singletonList(new jwb0(null, R.string.vkim_chat_actions_delete_spam, null, null, 0, u8m.o0.b, false, null, 989)), list, 922);
            boolean z2 = dialogExt.i;
        }

        public h0(Context context, DialogExt dialogExt) {
            this(context, dialogExt, false, EmptyList.b);
        }
    }
}
