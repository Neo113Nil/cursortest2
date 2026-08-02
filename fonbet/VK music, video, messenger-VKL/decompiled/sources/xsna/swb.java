package xsna;

import android.content.Context;
import com.vk.donut.design.view.reaction.DonutReactionButtonView;
import com.vkontakte.android.R;
import xsna.vwb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class swb implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ swb(uwb uwbVar, boolean z) {
        this.b = 0;
        this.c = z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        hfz bVar;
        switch (this.b) {
            case 0:
                ph90 ph90Var = (ph90) obj;
                switch (ph90Var.a) {
                    case 0:
                        bVar = new vwb.b(0, R.drawable.vk_icon_add_circle_fill_blue_28, R.string.vkim_add_new_members, R.string.vkim_all_members);
                        break;
                    case 1:
                        bVar = new vwb.b(1, R.drawable.vk_icon_edit_circle_fill_blue_28, R.string.vkim_change_info, R.string.vkim_all_members);
                        break;
                    case 2:
                        if (this.c) {
                            bVar = new vwb.b(2, R.drawable.vk_icon_palette_fill_blue_28, R.string.vkim_change_theme, R.string.vkim_all_members);
                            break;
                        }
                        bVar = null;
                        break;
                    case 3:
                        bVar = new vwb.b(3, R.drawable.vk_icon_pin_circle_fill_blue_28, R.string.vkim_change_pin, R.string.vkim_all_members);
                        break;
                    case 4:
                        bVar = new vwb.b(4, R.drawable.vk_icon_mention_circle_fill_blue_28, R.string.vkim_use_mass_mention, R.string.vkim_all_members);
                        break;
                    case 5:
                        bVar = new vwb.b(5, R.drawable.vk_icon_user_circle_fill_blue_28, R.string.vkim_change_admins, R.string.vkim_owner);
                        break;
                    case 6:
                        bVar = new vwb.b(6, R.drawable.vk_icon_chain_circle_fill_blue_28, R.string.vkim_see_invite_link, R.string.vkim_owner);
                        break;
                    case 7:
                        bVar = new vwb.b(7, R.drawable.vk_icon_phone_circle_fill_green_28, R.string.vkim_group_call, R.string.vkim_owner);
                        break;
                    case 8:
                        bVar = new vwb.b(8, R.drawable.vk_icon_gear_circle_fill_gray_28, R.string.vkim_dialog_type, R.string.vkim_dialog_ordinary_type);
                        break;
                    case 9:
                        bVar = new vwb.b(9, R.drawable.vk_icon_pop_up_sticker_circle_fill_red_28, R.string.vkim_popup_stickers_autoplay, R.string.vkim_popup_stickers_enabled);
                        break;
                    case 10:
                        bVar = new vwb.c(10, R.drawable.vk_icon_messages_circle_fill_gray_28, R.string.vkim_popup_show_system_messages, R.string.vkim_popup_show_system_messages_description, false);
                        break;
                    case 11:
                        bVar = new vwb.c(11, R.drawable.vk_icon_message_request_circle_fill_blue_28, R.string.vkim_popup_forwarding_disable, R.string.vkim_popup_forwarding_disable_description, false);
                        break;
                    default:
                        bVar = null;
                        break;
                }
                if (bVar == null) {
                    return null;
                }
                if (!(bVar instanceof vwb.b)) {
                    if (!(bVar instanceof vwb.c)) {
                        return null;
                    }
                    vwb.c cVar = (vwb.c) bVar;
                    return new vwb.c(cVar.b, cVar.c, cVar.d, cVar.e, epx.f(ph90Var.b, "enabled"));
                }
                Integer num = (Integer) uwb.x.get(ph90Var.b);
                if (num == null) {
                    return null;
                }
                vwb.b bVar2 = (vwb.b) bVar;
                return new vwb.b(bVar2.b, bVar2.c, bVar2.d, num.intValue());
            case 1:
                DonutReactionButtonView donutReactionButtonView = new DonutReactionButtonView((Context) obj, null, 6);
                donutReactionButtonView.setCount(null);
                donutReactionButtonView.setOnClickListener(this.c ? new cj4(18) : null);
                return donutReactionButtonView;
            default:
                ((Boolean) obj).booleanValue();
                return Integer.valueOf(this.c ? R.string.music_talkback_player_pause : R.string.music_talkback_player_play);
        }
    }

    public /* synthetic */ swb(boolean z, int i) {
        this.b = i;
        this.c = z;
    }
}
