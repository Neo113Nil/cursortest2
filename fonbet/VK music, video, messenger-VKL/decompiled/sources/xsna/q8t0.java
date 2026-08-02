package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.vk.dto.common.id.UserId;
import com.vk.video.channel.channelscreen.ChannelScreenArgs;
import com.vk.video.channel.common.di.VideoChannelComponent;
import com.vk.video.profile.presentation.VideoProfileWrapperFragment;

/* compiled from: VideoProfileNavigatorImpl.kt */
/* loaded from: classes6.dex */
public final class q8t0 implements p8t0 {
    public final bpn0 a;
    public final bpn0 b;
    public final fuc0 c;

    public q8t0(bpn0 bpn0Var, bpn0 bpn0Var2, bpn0 bpn0Var3, fuc0 fuc0Var) {
        this.a = bpn0Var2;
        this.b = bpn0Var3;
        this.c = fuc0Var;
    }

    @Override // xsna.p8t0
    public final void a(Context context, UserId userId) {
        UserId userId2;
        l7m a;
        VideoChannelComponent videoChannelComponent;
        b25 b25Var = (b25) this.a.getValue();
        ww50 v = s200.v(context);
        if (v != null) {
            v.u();
        }
        UserId c = b25Var.c();
        if (fkq0.b(userId)) {
            userId2 = userId;
        } else {
            userId2 = userId;
            if (!epx.f(b25Var.L(), userId2)) {
                ((zvr0) this.b.getValue()).getClass();
                ((k8t0) this.c.invoke(c)).a(null);
            }
        }
        Activity h = e3m.h(context);
        ComponentActivity componentActivity = h instanceof ComponentActivity ? (ComponentActivity) h : null;
        if (componentActivity == null || (a = m7m.a(componentActivity)) == null || (videoChannelComponent = (VideoChannelComponent) a.mo408a(fpf0.a(VideoChannelComponent.class))) == null || videoChannelComponent.h4() == null) {
            return;
        }
        new ChannelScreenArgs(userId2, true, null, null, null, false, false, false, null, 100, null);
    }

    @Override // xsna.p8t0
    public final VideoProfileWrapperFragment.a b(UserId userId) {
        VideoProfileWrapperFragment.a aVar = new VideoProfileWrapperFragment.a(VideoProfileWrapperFragment.class, null, null);
        Bundle bundle = aVar.j;
        bundle.putParcelable("user_id_key", userId);
        bundle.putBoolean("open_clips_key", true);
        return aVar;
    }
}
