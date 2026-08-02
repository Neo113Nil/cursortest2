package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.channels.api.ChannelEntryPoint;
import com.vk.channels.api.ChannelHistoryOpenMode;
import com.vk.core.fragments.FragmentImpl;
import com.vk.im.engine.models.messages.Msg;

/* compiled from: ImChannelsBridge.kt */
/* loaded from: classes2.dex */
public interface xyv {
    static /* synthetic */ void i(xyv xyvVar, Context context, long j, ChannelHistoryOpenMode channelHistoryOpenMode, ChannelEntryPoint channelEntryPoint, int i) {
        if ((i & 4) != 0) {
            channelHistoryOpenMode = ChannelHistoryOpenMode.OpenAtUnread.b;
        }
        ChannelHistoryOpenMode channelHistoryOpenMode2 = channelHistoryOpenMode;
        if ((i & 8) != 0) {
            channelEntryPoint = null;
        }
        xyvVar.c(context, j, channelHistoryOpenMode2, channelEntryPoint);
    }

    Intent a(Context context, long j, ChannelHistoryOpenMode channelHistoryOpenMode, Long l, Class<? extends FragmentImpl> cls);

    void b(Context context, long j, int i, ChannelHistoryOpenMode channelHistoryOpenMode);

    void c(Context context, long j, ChannelHistoryOpenMode channelHistoryOpenMode, ChannelEntryPoint channelEntryPoint);

    io.reactivex.rxjava3.core.a f(jbs jbsVar, long j, int i);

    void g(Context context);

    void k(jbs jbsVar);

    default io.reactivex.rxjava3.core.a l(bc6 bc6Var, Msg msg) {
        return io.reactivex.rxjava3.internal.operators.completable.i.b;
    }

    default io.reactivex.rxjava3.core.a m(long j, jbs jbsVar) {
        return io.reactivex.rxjava3.internal.operators.completable.i.b;
    }

    default void h(bc6 bc6Var, long j) {
    }

    default void j(u90 u90Var, long j) {
    }

    default void d(Context context, long j, int i, Integer num) {
    }
}
