package xsna;

import com.vk.dto.newsfeed.TrackableOwner;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import java.util.Comparator;
import xsna.dqk;

/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class hj30 implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ hj30(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                Msg msg = (Msg) obj;
                MsgFromChannel msgFromChannel = msg instanceof MsgFromChannel ? (MsgFromChannel) msg : null;
                Long valueOf = Long.valueOf(msgFromChannel != null ? msgFromChannel.I.s : msg.g);
                Msg msg2 = (Msg) obj2;
                MsgFromChannel msgFromChannel2 = msg2 instanceof MsgFromChannel ? (MsgFromChannel) msg2 : null;
                return jw5.b(valueOf, Long.valueOf(msgFromChannel2 != null ? msgFromChannel2.I.s : msg2.g));
            case 1:
                return jw5.b(((dqk.a) obj).a, ((dqk.a) obj2).a);
            default:
                return jw5.b(Boolean.valueOf(((TrackableOwner) obj2).b.i(512)), Boolean.valueOf(((TrackableOwner) obj).b.i(512)));
        }
    }
}
