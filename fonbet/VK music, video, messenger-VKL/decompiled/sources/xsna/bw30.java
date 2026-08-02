package xsna;

import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import java.util.Calendar;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: MsgScopeBuilder.kt */
/* loaded from: classes2.dex */
public final class bw30 {
    public static final bw30 a;
    public static final /* synthetic */ qcy<Object>[] b;
    public static final wqo0 c;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(bw30.class, "calendar", "getCalendar()Ljava/util/Calendar;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
        a = new bw30();
        c = new wqo0(new gc(18));
    }

    public static long a(long j) {
        c().setTimeInMillis(j);
        c().set(11, 0);
        c().set(12, 0);
        c().set(13, 0);
        c().set(14, 0);
        return c().getTimeInMillis();
    }

    public static long b(Msg msg) {
        long j;
        Calendar c2 = c();
        if (msg instanceof MsgFromChannel) {
            MsgFromChannel msgFromChannel = (MsgFromChannel) msg;
            if (msgFromChannel.L) {
                j = msgFromChannel.I.s;
                c2.setTimeInMillis(j);
                c().set(11, 0);
                c().set(12, 0);
                c().set(13, 0);
                c().set(14, 0);
                return c().getTimeInMillis();
            }
        }
        j = msg.g;
        c2.setTimeInMillis(j);
        c().set(11, 0);
        c().set(12, 0);
        c().set(13, 0);
        c().set(14, 0);
        return c().getTimeInMillis();
    }

    public static Calendar c() {
        qcy<Object> qcyVar = b[0];
        wqo0 wqo0Var = c;
        wqo0Var.getClass();
        return (Calendar) wqo0Var.get();
    }
}
