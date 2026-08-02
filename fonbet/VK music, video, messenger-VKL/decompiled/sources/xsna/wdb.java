package xsna;

import com.vk.dto.common.Source;
import com.vk.pushes.msg.ChannelMsgPushInfoLoader;

/* compiled from: ChannelUpdateMessagesNotificationsHandler.kt */
/* loaded from: classes.dex */
public final class wdb {
    public final j7b a;
    public final b25 b;
    public final azp0 c;
    public final jp9 d;
    public final io.reactivex.rxjava3.disposables.b e = new io.reactivex.rxjava3.disposables.b();
    public final ChannelMsgPushInfoLoader f;

    public wdb(a1w a1wVar, j7b j7bVar, b25 b25Var, azp0 azp0Var, jp9 jp9Var) {
        this.a = j7bVar;
        this.b = b25Var;
        this.c = azp0Var;
        this.d = jp9Var;
        this.f = new ChannelMsgPushInfoLoader(Source.ACTUAL, a1wVar);
    }
}
