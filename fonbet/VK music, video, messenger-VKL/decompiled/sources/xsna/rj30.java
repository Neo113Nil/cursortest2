package xsna;

import com.vk.dto.messages.MsgIdType;
import xsna.zir0;

/* compiled from: MsgHistoryLoadMode.kt */
/* loaded from: classes2.dex */
public final class rj30 extends de {
    public final MsgIdType b;
    public final int c;

    public rj30(MsgIdType msgIdType, int i) {
        this.b = msgIdType;
        this.c = i;
        int i2 = zir0.a.a[msgIdType.ordinal()];
        if (i2 != 1) {
            if (i2 == 2 && i >= 0) {
                return;
            }
        } else if (i > 0) {
            return;
        }
        throw new IllegalArgumentException(lhg.a(i, "Illegal msgId value: "));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgHistoryLoadAroundMsgMode(msgIdType=");
        sb.append(this.b);
        sb.append(", msgId=");
        return vu5.b(sb, this.c, ')');
    }
}
