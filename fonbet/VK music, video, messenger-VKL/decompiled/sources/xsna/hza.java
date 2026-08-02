package xsna;

import android.content.Context;
import com.vk.channels.api.Channel;
import com.vk.im.engine.models.channels.ChannelBanInfo;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.groups.AdminLevel;
import com.vk.im.ui.components.viewcontrollers.msg_list_empty.MsgListEmptyViewState;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ChannelFragmentBackgroundDelegate.kt */
/* loaded from: classes16.dex */
public final class hza implements eam {
    public final sf20 b;
    public final ixa c;
    public final Context d;
    public final boolean e;
    public final boolean f;

    public hza(sf20 sf20Var, lxa lxaVar, Context context, boolean z, boolean z2) {
        this.b = sf20Var;
        this.c = lxaVar;
        this.d = context;
        this.e = z;
        this.f = z2;
    }

    @Override // xsna.eam
    public final void Dd(boolean z) {
        vm30 vm30Var = this.b.o;
        if (vm30Var != null) {
            vm30Var.p(z);
        }
        a(this.c.b(), z);
    }

    public final void a(Channel channel, boolean z) {
        MsgListEmptyViewState.DrawStyle drawStyle;
        MsgListEmptyViewState bVar;
        if (channel == null) {
            return;
        }
        if (z) {
            drawStyle = MsgListEmptyViewState.DrawStyle.CONTRAST;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            drawStyle = MsgListEmptyViewState.DrawStyle.NORMAL;
        }
        MsgListEmptyViewState.DrawStyle drawStyle2 = drawStyle;
        ChannelBanInfo channelBanInfo = channel.C;
        ChannelType channelType = channel.z;
        AdminLevel adminLevel = channel.u;
        Context context = this.d;
        if (channelBanInfo == null || !channelBanInfo.f) {
            AdminLevel adminLevel2 = AdminLevel.ADMIN;
            if (adminLevel != adminLevel2 || !ad0.B(channelType)) {
                bVar = adminLevel == adminLevel2 ? MsgListEmptyViewState.a.a : new MsgListEmptyViewState.b(null, context.getString(R.string.vkim_channels_empty_state_title), null, drawStyle2, 13);
            } else if (this.f) {
                bVar = MsgListEmptyViewState.e.a;
            } else {
                boolean z2 = channelType == ChannelType.COMMUNITY_CHANNEL;
                ImFeatures imFeatures = ImFeatures.DONUTS_EASY_FLOW_IN_CHANNEL_EMPTY_STATE;
                imFeatures.getClass();
                com.vk.toggle.b bVar2 = com.vk.toggle.b.A;
                boolean a = bVar2.a(imFeatures);
                ImFeatures imFeatures2 = ImFeatures.IM_IMPORT_FROM_TG;
                imFeatures2.getClass();
                bVar = new MsgListEmptyViewState.d(z2, bVar2.a(imFeatures2), z2 && !channel.E && a && channel.M);
            }
        } else {
            bVar = new MsgListEmptyViewState.b(null, this.e ? context.getString(R.string.vkim_channel_msgs_not_available_community) : context.getString(R.string.vkim_channel_msgs_not_available), null, drawStyle2, 13);
        }
        vm30 vm30Var = this.b.o;
        if (vm30Var != null) {
            vm30Var.v(bVar);
        }
    }
}
