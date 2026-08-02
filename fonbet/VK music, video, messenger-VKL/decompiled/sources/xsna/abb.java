package xsna;

import com.vk.im.engine.internal.storage.delegates.channel_messages.ChannelMessageColumn;
import com.vk.im.engine.internal.storage.delegates.channels.ChannelsDb;
import java.util.Collections;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class abb implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ abb(int i, long j, gkb gkbVar) {
        this.e = gkbVar;
        this.c = j;
        this.d = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0129  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        int intValue;
        boolean z2;
        switch (this.b) {
            case 0:
                cbb cbbVar = (cbb) this.e;
                xgl0 xgl0Var = (xgl0) obj;
                r3b y = xgl0Var.y();
                uib a = xgl0Var.a();
                long j = this.c;
                bdb bdbVar = a.d(Collections.singletonList(Long.valueOf(j))).get(Long.valueOf(j));
                if (bdbVar != null) {
                    xgl0 xgl0Var2 = (xgl0) cbbVar.c;
                    int r = ad0.B(xgl0Var2.a().B(j)) ? xgl0Var2.system().r(j) : xgl0Var2.system().j();
                    if (bdbVar.r == r) {
                        int i = bdbVar.d + 1;
                        g2b g2bVar = y.b;
                        int i2 = this.d;
                        if (i > i2) {
                            g2bVar.getClass();
                        } else {
                            StringBuilder sb = new StringBuilder("\n            SELECT COUNT(1)\n            FROM ");
                            sb.append(g2bVar.b.a);
                            sb.append("\n            WHERE ");
                            cr.a(ChannelMessageColumn.CHANNEL_ID, sb, " = ?\n            AND ");
                            cr.a(ChannelMessageColumn.CNV_MSG_ID, sb, " BETWEEN ? AND ?\n            AND (\n            ");
                            cr.a(ChannelMessageColumn.HAS_SPACE_BEFORE, sb, " = 1 \n            OR ");
                            cr.a(ChannelMessageColumn.HAS_SPACE_AFTER, sb, " = 1\n            OR ");
                            sb.append(ChannelMessageColumn.PHASE_ID.getKey());
                            sb.append(" != ?\n            )\n            ");
                            if (fl3.J(g2bVar.d.b().d(sb.toString(), new String[]{String.valueOf(j), String.valueOf(i), String.valueOf(i2), String.valueOf(r)})).intValue() > 0) {
                                z = true;
                                if (i2 != bdbVar.c) {
                                    a.K(i2, 0, j);
                                } else if (!z) {
                                    g2b g2bVar2 = y.b;
                                    if (i > i2) {
                                        g2bVar2.getClass();
                                        intValue = 0;
                                    } else {
                                        StringBuilder sb2 = new StringBuilder("\n            SELECT COUNT(1)\n            FROM ");
                                        sb2.append(g2bVar2.b.a);
                                        sb2.append("\n            WHERE ");
                                        cr.a(ChannelMessageColumn.CHANNEL_ID, sb2, " = ?\n            AND ");
                                        sb2.append(ChannelMessageColumn.CNV_MSG_ID.getKey());
                                        sb2.append(" BETWEEN ? AND ?\n            ");
                                        intValue = fl3.J(g2bVar2.d.b().d(sb2.toString(), new String[]{String.valueOf(j), String.valueOf(i), String.valueOf(i2)})).intValue();
                                    }
                                    a.K(i2, Math.max(0, bdbVar.f - intValue), j);
                                }
                                z2 = true;
                                return Boolean.valueOf(z2);
                            }
                        }
                        z = false;
                        if (i2 != bdbVar.c) {
                        }
                        z2 = true;
                        return Boolean.valueOf(z2);
                    }
                }
                z2 = false;
                return Boolean.valueOf(z2);
            default:
                ChannelsDb channelsDb = ((gkb) this.e).b;
                StringBuilder sb3 = new StringBuilder("\n            UPDATE ");
                sb3.append(channelsDb.a.a);
                sb3.append("\n            SET ");
                sr.c(ChannelsDb.Column.READ_TILL_IN_MSG_CNV_ID, sb3, " = ?\n            WHERE ");
                channelsDb.b.b().execSQL(bo.d(ChannelsDb.Column.ID, sb3, " = ?\n            "), new Object[]{Integer.valueOf(this.d), Long.valueOf(this.c)});
                return s3q0.a;
        }
    }

    public /* synthetic */ abb(long j, cbb cbbVar, int i) {
        this.c = j;
        this.e = cbbVar;
        this.d = i;
    }
}
