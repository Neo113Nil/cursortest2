package xsna;

import com.ironsource.X3;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.channels.dto.ChannelsSetNotificationModeModeDto;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.channels.ChannelNotificationsSettings;
import kotlin.time.DurationUnit;
import xsna.zno;

/* compiled from: ChannelSetNotificationsModeApiCmd.kt */
/* loaded from: classes2.dex */
public final class dcb extends nx2<Boolean> {
    public final Peer b;
    public final ChannelNotificationsSettings c;
    public final boolean d = true;

    public dcb(Peer peer, ChannelNotificationsSettings channelNotificationsSettings) {
        this.b = peer;
        this.c = channelNotificationsSettings;
    }

    @Override // xsna.nx2
    public final Boolean f(l7r0 l7r0Var) {
        ChannelNotificationsSettings channelNotificationsSettings = this.c;
        ChannelsSetNotificationModeModeDto channelsSetNotificationModeModeDto = channelNotificationsSettings.b ? ChannelsSetNotificationModeModeDto.ENABLED : ChannelsSetNotificationModeModeDto.DISABLED;
        Long valueOf = Long.valueOf(channelNotificationsSettings.c);
        Integer num = null;
        if (!channelNotificationsSettings.b) {
            valueOf = null;
        }
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            if (longValue > 0) {
                long f = eoo.f(longValue, DurationUnit.MILLISECONDS);
                zno.a aVar = zno.c;
                num = Integer.valueOf((int) zno.l(f, DurationUnit.SECONDS));
            }
        }
        UserId b = com.vk.dto.common.a.b(this.b);
        tfx tfxVar = new tfx("channels.setNotificationMode", new j8(7), new jh(7));
        tfx.n(tfxVar, "channel_id", b, 0L, -1L, 4);
        tfx.o(tfxVar, X3.a.t, channelsSetNotificationModeModeDto.i(), 0, 0, 12);
        if (num != null) {
            tfx.l(tfxVar, "duration", num.intValue(), 0, 0, 8);
        }
        return Boolean.valueOf(((az2) bz2.n(tfxVar, new op1(this, 17)).c).invoke(l7r0Var) == BaseBoolIntDto.YES);
    }
}
