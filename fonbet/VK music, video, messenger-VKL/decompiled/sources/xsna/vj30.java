package xsna;

import com.vk.dto.common.Direction;
import com.vk.dto.messages.MsgIdType;
import xsna.zir0;

/* compiled from: MsgHistoryLoadMode.kt */
/* loaded from: classes2.dex */
public final class vj30 extends de {
    public final MsgIdType b;
    public final int c;
    public final Direction d;

    public vj30(MsgIdType msgIdType, int i, Direction direction) {
        this.b = msgIdType;
        this.c = i;
        this.d = direction;
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
        return "MsgHistoryLoadSinceMsgMode(msgIdType=" + this.b + ", msgId=" + this.c + ", direction=" + this.d + ')';
    }
}
