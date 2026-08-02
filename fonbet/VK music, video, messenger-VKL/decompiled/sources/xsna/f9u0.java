package xsna;

import android.content.Context;
import com.vk.channels.api.Channel;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.groups.AdminLevel;
import com.vk.im.engine.models.groups.GroupPrivacy;
import com.vk.im.engine.models.groups.MemberStatus;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.t8b;

/* compiled from: VkAppChannelHeaderActionDelegate.kt */
/* loaded from: classes16.dex */
public final class f9u0 implements qza {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        if (com.vk.toggle.b.A.a(r15) != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    @Override // xsna.qza
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<xub> a(Channel channel, Context context, boolean z, boolean z2) {
        xub wVar;
        xub xubVar;
        Integer valueOf = Integer.valueOf(R.attr.im_icon_blue);
        boolean z3 = channel.K;
        ChannelType channelType = channel.z;
        AdminLevel adminLevel = channel.u;
        boolean z4 = channel.n;
        boolean z5 = channel.o;
        if (!z5) {
            return EmptyList.b;
        }
        t8b.t tVar = new t8b.t(R.drawable.vk_icon_comment_outline_28, 8, context.getString(R.string.vkim_channel_profile_setup_comments), valueOf);
        if (adminLevel != AdminLevel.ADMIN || channelType != ChannelType.COMMUNITY_CHANNEL) {
            tVar = null;
        }
        if (!z2) {
            if (!z4) {
                wVar = pli.j(channel.s) ? new t8b.w(context) : new t8b.q(context);
                Integer valueOf2 = Integer.valueOf(R.attr.im_icon_yellow);
                if (z5) {
                }
                if (!z4) {
                }
                xubVar = null;
                t8b.d dVar = new t8b.d(context, R.string.vkim_channels_profile_complain);
                if (adminLevel == AdminLevel.NONE) {
                }
                dVar = null;
                return rl3.I(new xub[]{tVar, wVar, r9, xubVar, dVar, channel.p ? null : new t8b.i(R.drawable.vk_icon_door_arrow_right_outline_28, context.getString(R.string.vkim_channels_profile_leave_vkapp), true, Integer.valueOf(R.attr.im_icon_red))});
            }
            wVar = null;
            Integer valueOf22 = Integer.valueOf(R.attr.im_icon_yellow);
            if (z5) {
            }
            if (!z4) {
            }
            xubVar = null;
            t8b.d dVar2 = new t8b.d(context, R.string.vkim_channels_profile_complain);
            if (adminLevel == AdminLevel.NONE) {
            }
            dVar2 = null;
            return rl3.I(new xub[]{tVar, wVar, r9, xubVar, dVar2, channel.p ? null : new t8b.i(R.drawable.vk_icon_door_arrow_right_outline_28, context.getString(R.string.vkim_channels_profile_leave_vkapp), true, Integer.valueOf(R.attr.im_icon_red))});
        }
        if (z3) {
            ImFeatures imFeatures = ImFeatures.ALL_FOLDER_HIDE_CHANNELS;
            imFeatures.getClass();
        }
        if (!z4) {
            wVar = com.vk.im.engine.models.im_item.b.f(channel.P) ? new t8b.w(context) : new t8b.q(context);
            Integer valueOf222 = Integer.valueOf(R.attr.im_icon_yellow);
            xub vVar = z5 ? null : z4 ? new t8b.v(R.drawable.vk_icon_archive_outline_28, 8, context.getString(R.string.vkim_community_channels_profile_action_unarchive), valueOf222) : new t8b.b(R.drawable.vk_icon_archive_outline_28, 8, context.getString(R.string.vkim_community_channels_profile_action_archive), valueOf222);
            if (!z4) {
                ImFeatures imFeatures2 = ImFeatures.ALL_FOLDER_HIDE_CHANNELS;
                imFeatures2.getClass();
                com.vk.toggle.b bVar = com.vk.toggle.b.A;
                if (bVar.a(imFeatures2)) {
                    ImFeatures imFeatures3 = ImFeatures.CHANNELS_IN_ALL_FOLDER;
                    imFeatures3.getClass();
                    if (bVar.a(imFeatures3)) {
                        xubVar = z3 ? new t8b.s(R.drawable.vk_icon_view_outline_28, 8, context.getString(R.string.vkim_channel_profile_action_show_channel_in_all_folder), valueOf) : new t8b.e(R.drawable.vk_icon_hide_outline_28, 8, context.getString(R.string.vkim_channel_profile_action_hide_channel_in_all_folder), valueOf);
                        t8b.d dVar22 = new t8b.d(context, R.string.vkim_channels_profile_complain);
                        if (adminLevel == AdminLevel.NONE || channelType != ChannelType.COMMUNITY_CHANNEL) {
                            dVar22 = null;
                        }
                        return rl3.I(new xub[]{tVar, wVar, vVar, xubVar, dVar22, channel.p ? null : new t8b.i(R.drawable.vk_icon_door_arrow_right_outline_28, context.getString(R.string.vkim_channels_profile_leave_vkapp), true, Integer.valueOf(R.attr.im_icon_red))});
                    }
                }
            }
            xubVar = null;
            t8b.d dVar222 = new t8b.d(context, R.string.vkim_channels_profile_complain);
            if (adminLevel == AdminLevel.NONE) {
            }
            dVar222 = null;
            return rl3.I(new xub[]{tVar, wVar, vVar, xubVar, dVar222, channel.p ? null : new t8b.i(R.drawable.vk_icon_door_arrow_right_outline_28, context.getString(R.string.vkim_channels_profile_leave_vkapp), true, Integer.valueOf(R.attr.im_icon_red))});
        }
        wVar = null;
        Integer valueOf2222 = Integer.valueOf(R.attr.im_icon_yellow);
        if (z5) {
        }
        if (!z4) {
        }
        xubVar = null;
        t8b.d dVar2222 = new t8b.d(context, R.string.vkim_channels_profile_complain);
        if (adminLevel == AdminLevel.NONE) {
        }
        dVar2222 = null;
        return rl3.I(new xub[]{tVar, wVar, vVar, xubVar, dVar2222, channel.p ? null : new t8b.i(R.drawable.vk_icon_door_arrow_right_outline_28, context.getString(R.string.vkim_channels_profile_leave_vkapp), true, Integer.valueOf(R.attr.im_icon_red))});
    }

    @Override // xsna.qza
    public final List<xub> b(Context context, Channel channel, boolean z) {
        boolean z2;
        xub xubVar;
        Integer valueOf = Integer.valueOf(R.attr.im_icon_green);
        GroupPrivacy groupPrivacy = channel.B;
        boolean z3 = channel.o;
        MemberStatus memberStatus = channel.D;
        ChannelType channelType = channel.z;
        ChannelType channelType2 = ChannelType.COMMUNITY_CHANNEL;
        boolean z4 = channelType == channelType2;
        boolean z5 = channelType == ChannelType.PERSONAL_CHANNEL;
        int i = (z4 && groupPrivacy == GroupPrivacy.CLOSED && memberStatus != MemberStatus.MEMBER) ? R.string.vkim_channels_profile_action_send_request_vkapp : R.string.vkim_channels_profile_action_join_vkapp;
        boolean contains = e43.l(MemberStatus.DECLINED_INVITATION, MemberStatus.INVITED, MemberStatus.INTERESTED, MemberStatus.UNKNOWN).contains(memberStatus);
        boolean z6 = z4 && (groupPrivacy != GroupPrivacy.PRIVATE || memberStatus == MemberStatus.MEMBER);
        t8b.o oVar = new t8b.o(R.drawable.vk_icon_users_3_outline_28, 12, context.getString(R.string.vkim_channels_profile_action_community), null);
        if (!z4 || (!z6 && !contains)) {
            oVar = null;
        }
        t8b.p pVar = new t8b.p(R.drawable.vk_icon_user_outline_28, 12, context.getString(R.string.vkim_channels_profile_action_profile), null);
        if (!z5) {
            pVar = null;
        }
        t8b.x xVar = new t8b.x(R.drawable.vk_icon_message_outline_28, 8, context.getString(R.string.vkim_chat_profile_action_write), Integer.valueOf(R.attr.im_icon_blue));
        if (!z) {
            xVar = null;
        }
        Integer valueOf2 = Integer.valueOf(R.attr.im_icon_red);
        if (channel.n || !z3) {
            z2 = z3;
            xubVar = null;
        } else {
            xuo0.a.getClass();
            if (channel.Db(xuo0.a())) {
                z2 = z3;
                xubVar = new t8b.n(R.drawable.vk_icon_notification_disable_outline_28, 8, context.getString(R.string.vkim_channels_profile_action_notifications), valueOf2);
            } else {
                z2 = z3;
                xubVar = new t8b.l(R.drawable.vk_icon_notifications_28, 8, context.getString(R.string.vkim_channels_profile_action_notifications), valueOf2);
            }
        }
        if (!z2) {
            xubVar = null;
        }
        t8b.g gVar = new t8b.g(R.drawable.vk_icon_add_square_outline_28, 8, context.getString(i), valueOf);
        if (z2 || (!z5 && (!z6 || !e43.l(MemberStatus.NO, MemberStatus.MEMBER).contains(memberStatus)))) {
            gVar = null;
        }
        t8b.d dVar = new t8b.d(context, R.string.vkim_channels_profile_complaint);
        if (channel.S || channelType != channelType2 || z2) {
            dVar = null;
        }
        return rl3.I(new xub[]{oVar, pVar, xVar, xubVar, gVar, dVar, memberStatus == MemberStatus.REQUEST_SENT ? new t8b.c(R.drawable.vk_icon_minus_square_outline_28, 8, context.getString(R.string.vkim_channel_cancel_member_request), valueOf) : null});
    }
}
