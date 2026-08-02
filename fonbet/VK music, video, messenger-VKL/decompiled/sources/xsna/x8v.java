package xsna;

import com.vk.dto.common.Direction;

/* compiled from: MsgHistoryExt.kt */
/* loaded from: classes13.dex */
public final class x8v {
    public final gkx0 a;
    public final Direction b;
    public final int c;
    public final int d;

    public x8v(gkx0 gkx0Var, Direction direction, int i, int i2) {
        this.a = gkx0Var;
        this.b = direction;
        this.c = i;
        this.d = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HistoryUpdateArgs(sinceWeight=");
        sb.append(this.a);
        sb.append(", direction=");
        sb.append(this.b);
        sb.append(", limit=");
        sb.append(this.c);
        sb.append(", localId=");
        return vu5.b(sb, this.d, ')');
    }
}
