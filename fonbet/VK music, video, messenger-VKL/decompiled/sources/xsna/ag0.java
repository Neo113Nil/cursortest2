package xsna;

import com.vk.im.engine.internal.storage.delegates.channels.ChannelsDb;
import com.vk.im.engine.models.channels.ChannelNotificationsSettings;
import one.video.ad.ux.AdRedirectView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ag0 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ag0(long j, wh50 wh50Var, dg0 dg0Var) {
        this.c = j;
        this.d = wh50Var;
        this.e = dg0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                wh50 wh50Var = (wh50) this.d;
                dg0 dg0Var = (dg0) this.e;
                AdRedirectView adRedirectView = (AdRedirectView) obj;
                adRedirectView.setTextColor(f870.H(this.c));
                sh0 sh0Var = (sh0) wh50Var.getValue();
                if (sh0Var != null) {
                    adRedirectView.a(sh0Var, AdRedirectView.Type.CATALOG);
                    adRedirectView.setBtnClickListener(new bg0(dg0Var, 0));
                }
                break;
            default:
                gkb gkbVar = (gkb) this.d;
                ChannelNotificationsSettings channelNotificationsSettings = (ChannelNotificationsSettings) this.e;
                ChannelsDb channelsDb = gkbVar.b;
                StringBuilder sb = new StringBuilder("\n            UPDATE ");
                sb.append(channelsDb.a.a);
                sb.append("\n            SET ");
                sr.c(ChannelsDb.Column.NOTIFICATIONS_IS_ENABLED, sb, " = ?,\n                ");
                sr.c(ChannelsDb.Column.NOTIFICATIONS_DISABLED_UNTIL, sb, " = ?\n            WHERE ");
                channelsDb.b.b().execSQL(bo.d(ChannelsDb.Column.ID, sb, " = ?\n            "), new Object[]{Boolean.valueOf(channelNotificationsSettings.b), Long.valueOf(channelNotificationsSettings.c), Long.valueOf(this.c)});
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ag0(gkb gkbVar, long j, ChannelNotificationsSettings channelNotificationsSettings) {
        this.d = gkbVar;
        this.c = j;
        this.e = channelNotificationsSettings;
    }
}
