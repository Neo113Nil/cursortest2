package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.vk.channels.api.ChannelEntryPoint;
import com.vk.channels.api.ChannelHistoryOpenMode;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.channels.impl.channel_screen.search.ChannelMsgSearchFragment;
import com.vk.channels.impl.comments.ChannelCommentsFragment;
import com.vk.channels.impl.comments.ChannelCommentsParams;
import com.vk.channels.impl.list.ChannelsListFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.api.dto.auth.ReloginParams;
import com.vk.toggle.features.ImFeatures;
import xsna.oz50;

/* compiled from: ImChannelsRouter.kt */
/* loaded from: classes.dex */
public final class zyv implements fib {
    public final mju0 a;

    public zyv(mju0 mju0Var) {
        this.a = mju0Var;
    }

    public static boolean i() {
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        cau0 cau0Var = a1wVar.r().h;
        return false;
    }

    @Override // xsna.fib
    public final Intent a(Context context, long j, ChannelHistoryOpenMode channelHistoryOpenMode, Long l, Class<?> cls) {
        mju0 mju0Var = this.a;
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        cau0 cau0Var = a1wVar.r().h;
        ChannelFragment.a aVar = new ChannelFragment.a(false);
        aVar.y(j);
        aVar.B(channelHistoryOpenMode);
        aVar.v(cls);
        if (l != null) {
            if (l.longValue() != mju0Var.a.c().b) {
                rsr rsrVar = oz50.k;
                Class<? extends FragmentImpl> cls2 = aVar.g;
                Bundle bundle = new Bundle();
                Bundle bundle2 = aVar.j;
                bundle.putAll(bundle2);
                s3q0 s3q0Var = s3q0.a;
                bundle2.putParcelable("post_auth_fragment_entry", oz50.b.c(oz50.b.a(cls2, bundle)));
                long longValue = l.longValue();
                gzs<s3q0> gzsVar = fkq0.a;
                aVar.j.putParcelable("auto_login_params", new ReloginParams(new UserId(longValue), null, 2, null));
                aVar.j.putBoolean("need_relogin", true);
            }
        }
        return aVar.n(context);
    }

    @Override // xsna.fib
    public final void b(Context context, long j, int i, ChannelHistoryOpenMode channelHistoryOpenMode) {
        i();
        ChannelFragment.a aVar = new ChannelFragment.a(false);
        aVar.y(j);
        aVar.B(channelHistoryOpenMode);
        aVar.A(i);
        aVar.k(context);
    }

    @Override // xsna.fib
    public final void c(Context context, long j, ChannelHistoryOpenMode channelHistoryOpenMode, ChannelEntryPoint channelEntryPoint) {
        i();
        ChannelFragment.a aVar = new ChannelFragment.a(false);
        aVar.y(j);
        aVar.B(channelHistoryOpenMode);
        aVar.z(channelEntryPoint);
        aVar.k(context);
    }

    @Override // xsna.fib
    public final void d(Context context, long j, int i, Integer num) {
        ChannelCommentsParams channelCommentsParams = new ChannelCommentsParams(j, i, num);
        i();
        new ChannelCommentsFragment.a(channelCommentsParams, false).k(context);
    }

    @Override // xsna.fib
    public final void e(long j, Context context) {
        i();
        ChannelFragment.a aVar = new ChannelFragment.a(false);
        aVar.y(j);
        aVar.C();
        aVar.k(context);
    }

    @Override // xsna.fib
    public final void f(Context context, long j, String str) {
        ImFeatures imFeatures = ImFeatures.CHANNEL_MSG_SEARCH;
        imFeatures.getClass();
        if (com.vk.toggle.b.A.a(imFeatures)) {
            new ChannelMsgSearchFragment.a(j, str).k(context);
        }
    }

    @Override // xsna.fib
    public final void g(Context context) {
        i();
        new ChannelsListFragment.a(false).k(context);
    }

    @Override // xsna.fib
    public final Fragment h() {
        ChannelsListFragment.a aVar = new ChannelsListFragment.a(false);
        aVar.y();
        return aVar.f();
    }
}
