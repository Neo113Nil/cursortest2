package xsna;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.vk.channels.api.ChannelEntryPoint;
import com.vk.channels.api.ChannelHistoryOpenMode;

/* compiled from: ChannelsRouter.kt */
/* loaded from: classes.dex */
public interface fib {
    Intent a(Context context, long j, ChannelHistoryOpenMode channelHistoryOpenMode, Long l, Class<?> cls);

    void b(Context context, long j, int i, ChannelHistoryOpenMode channelHistoryOpenMode);

    void c(Context context, long j, ChannelHistoryOpenMode channelHistoryOpenMode, ChannelEntryPoint channelEntryPoint);

    void d(Context context, long j, int i, Integer num);

    void e(long j, Context context);

    void f(Context context, long j, String str);

    void g(Context context);

    Fragment h();
}
