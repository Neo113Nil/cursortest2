package xsna;

import com.vk.im.engine.models.messages.Msg;
import java.util.List;

/* compiled from: OnMsgSendEvent.kt */
/* loaded from: classes2.dex */
public final class l980 extends sxp {
    public final Object b;
    public final long c;
    public final List<Msg> d;

    public l980(String str, long j, List list) {
        this.b = str;
        this.c = j;
        this.d = list;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnMsgSendEvent{changerTag=");
        sb.append(this.b);
        sb.append(", dialogId=");
        sb.append(this.c);
        sb.append(", msgList=");
        return ms9.a('}', sb, this.d);
    }
}
