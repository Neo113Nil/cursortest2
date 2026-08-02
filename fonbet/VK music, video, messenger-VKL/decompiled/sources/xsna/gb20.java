package xsna;

import com.vk.dto.messages.MsgIdType;

/* compiled from: ScrollParams.kt */
/* loaded from: classes2.dex */
public final class gb20 implements zfh0 {
    public final MsgIdType a;
    public final int b;
    public final int c;

    public gb20(MsgIdType msgIdType, int i, int i2) {
        this.a = msgIdType;
        this.b = i;
        this.c = i2;
    }

    @Override // xsna.zfh0
    public final boolean a() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb20)) {
            return false;
        }
        gb20 gb20Var = (gb20) obj;
        return this.a == gb20Var.a && this.b == gb20Var.b && this.c == gb20Var.c;
    }

    public final int hashCode() {
        return ((Boolean.hashCode(true) + shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31)) * 31) + 1042949547;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageScrollParams(msgIdType=");
        sb.append(this.a);
        sb.append(", msgId=");
        sb.append(this.b);
        sb.append(", offsetY=");
        return h5s.c(this.c, ", smoothScroll=true, tag=smoothScrollToMsg)", sb);
    }
}
