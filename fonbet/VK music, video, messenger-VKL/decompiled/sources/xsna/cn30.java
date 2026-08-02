package xsna;

import com.vk.dto.messages.MsgSyncState;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.models.messages.MsgFromUser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: MsgMatcher.kt */
@ozl
/* loaded from: classes2.dex */
public final class cn30 {
    public static final ArrayList c;
    public static final wqo0 d;
    public static final wqo0 e;
    public static final /* synthetic */ qcy<Object>[] b = {new PropertyReference1Impl(cn30.class, "cnvIdsToRequest", "getCnvIdsToRequest()Ljava/util/Collection;", 0), b09.a(0, cn30.class, "randomIdsToRequest", "getRandomIdsToRequest()Ljava/util/Collection;", fpf0.a)};
    public static final cn30 a = new cn30();

    static {
        List asList = Arrays.asList(MsgSyncState.values());
        ArrayList arrayList = new ArrayList();
        for (Object obj : asList) {
            if (((MsgSyncState) obj) != MsgSyncState.DONE) {
                arrayList.add(obj);
            }
        }
        c = arrayList;
        d = new wqo0(new f20(22));
        e = new wqo0(new wb1(24));
    }

    public static void a(w2w w2wVar, Msg msg) {
        msg.b = w2wVar.d1();
        if (msg instanceof MsgFromUser) {
            MsgFromUser msgFromUser = (MsgFromUser) msg;
            hpt0.g(msgFromUser.H, w2wVar);
            hpt0.h(msgFromUser.I, w2wVar);
        }
        if (msg instanceof MsgFromChannel) {
            MsgFromChannel msgFromChannel = (MsgFromChannel) msg;
            hpt0.g(msgFromChannel.E, w2wVar);
            hpt0.h(msgFromChannel.F, w2wVar);
        }
    }

    public static Collection b() {
        qcy<Object> qcyVar = b[0];
        wqo0 wqo0Var = d;
        wqo0Var.getClass();
        return (Collection) wqo0Var.get();
    }

    public static Collection c() {
        qcy<Object> qcyVar = b[1];
        wqo0 wqo0Var = e;
        wqo0Var.getClass();
        return (Collection) wqo0Var.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(w2w w2wVar, Msg msg, Msg msg2, boolean z) {
        msg.b = msg2.b;
        if (z) {
            msg.q = msg2.q;
            msg.r = msg2.r;
        }
        gkx0 gkx0Var = msg.s;
        gkx0 gkx0Var2 = gkx0.c;
        if (epx.f(gkx0Var, gkx0Var2)) {
            msg.s = msg2.s;
        }
        if (epx.f(msg.t, gkx0Var2)) {
            msg.t = msg2.t;
        }
        if ((msg instanceof MsgFromUser) && (msg2 instanceof MsgFromUser)) {
            MsgFromUser msgFromUser = (MsgFromUser) msg;
            MsgFromUser msgFromUser2 = (MsgFromUser) msg2;
            msgFromUser.M = msgFromUser2.M;
            msgFromUser.Q = msgFromUser2.Q;
        }
        if ((msg instanceof MsgFromChannel) && (msg2 instanceof MsgFromChannel)) {
            MsgFromChannel msgFromChannel = (MsgFromChannel) msg;
            MsgFromChannel msgFromChannel2 = (MsgFromChannel) msg2;
            msgFromChannel.J = msgFromChannel2.J;
            msgFromChannel.I = MsgFromChannel.b.a(msgFromChannel.I, null, 0, null, null, null, null, false, null, null, 0, 0, 0L, msgFromChannel2.I.w, 62914559);
            msgFromChannel.lc(msgFromChannel2.I.o);
        }
        if ((msg instanceof com.vk.im.engine.models.messages.a) && (msg2 instanceof com.vk.im.engine.models.messages.a)) {
            com.vk.im.engine.models.messages.a aVar = (com.vk.im.engine.models.messages.a) msg;
            hpt0.g(aVar.K0(), w2wVar);
            hpt0.h(aVar.q7(), w2wVar);
            hpt0.p(aVar, (com.vk.im.engine.models.messages.a) msg2);
        }
    }
}
