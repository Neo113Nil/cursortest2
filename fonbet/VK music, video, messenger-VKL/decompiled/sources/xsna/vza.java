package xsna;

import android.content.Context;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.ui.components.common.DndPeriod;
import com.vkontakte.android.R;
import xsna.uj70;

/* compiled from: ChannelHeaderMenuActionsHandler.kt */
/* loaded from: classes16.dex */
public final class vza implements rrb {
    public final long a;
    public final Context b;
    public final h9k0 c;
    public final a1w d;
    public final mxv e;
    public final feb f;

    public vza(long j, Context context, ucb ucbVar, a1w a1wVar, mxv mxvVar, feb febVar) {
        this.a = j;
        this.b = context;
        this.c = ucbVar;
        this.d = a1wVar;
        this.e = mxvVar;
        this.f = febVar;
    }

    @Override // xsna.rrb
    public final void a(int i) {
        mxv mxvVar = this.e;
        long j = this.a;
        Context context = this.b;
        if (i == R.id.channel_search_menu_action) {
            mxvVar.a().h(xa4.L(context), j);
            return;
        }
        feb febVar = this.f;
        h9k0 h9k0Var = this.c;
        a1w a1wVar = this.d;
        if (i == R.id.channel_notification_on_menu_action) {
            DndPeriod dndPeriod = DndPeriod.FOREVER;
            Serializer.c<Peer> cVar = Peer.CREATOR;
            a1wVar.D(this, new c7b(Peer.a.b(j), new uj70.a(dndPeriod.i())));
            h9k0Var.c(context.getString(R.string.vkim_channels_notifications_disabled), null);
            febVar.c(j);
            return;
        }
        if (i != R.id.channel_notification_off_menu_action) {
            if (i == R.id.channel_delayed_msg_list_menu_action) {
                mxvVar.a().j(xa4.L(context), j);
            }
        } else {
            Serializer.c<Peer> cVar2 = Peer.CREATOR;
            a1wVar.D(this, new c7b(Peer.a.b(j), uj70.b.a));
            h9k0Var.c(context.getString(R.string.vkim_channels_notifications_enabled), null);
            febVar.a(j);
        }
    }
}
