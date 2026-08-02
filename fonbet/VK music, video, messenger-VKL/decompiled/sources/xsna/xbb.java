package xsna;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.vk.channels.impl.channel_screen.send_msg.ChannelMsgSendState;
import com.vk.channels.impl.post_settings.PostSettingsFragment;
import com.vk.core.fragments.internal.transition.impl.TransitionAnimationSimple$Companion$Type;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.story.api.LoadContext;
import com.vk.story.viewer.api.StoryViewerRouter;
import kotlin.NoWhenBranchMatchedException;
import xsna.wbb;

/* compiled from: ChannelSendMsgRouter.kt */
/* loaded from: classes16.dex */
public final class xbb implements hm50<wbb> {
    public final jbs a;
    public final StoryViewerRouter b;

    public xbb(jbs jbsVar, StoryViewerRouter storyViewerRouter) {
        this.a = jbsVar;
        this.b = storyViewerRouter;
    }

    @Override // xsna.hm50
    public final void a(wbb wbbVar) {
        wbb wbbVar2 = wbbVar;
        boolean z = wbbVar2 instanceof wbb.a;
        jbs jbsVar = this.a;
        if (!z) {
            if (wbbVar2 instanceof wbb.b) {
                g2v.c().a().j(jbsVar, ((wbb.b) wbbVar2).a);
                return;
            }
            if (!(wbbVar2 instanceof wbb.c)) {
                throw new NoWhenBranchMatchedException();
            }
            FragmentActivity kn = jbsVar.a.kn();
            String str = ((wbb.c) wbbVar2).a;
            LoadContext.Owner owner = LoadContext.Owner.b;
            StoryViewerRouter.d(this.b, kn, null, str, MobileOfficialAppsConStoriesStat$ViewEntryPoint.REPOST_AUTO_TO_STORY_ACTIVITY, owner, "im_channel", null, null, null, 3906);
            return;
        }
        wbb.a aVar = (wbb.a) wbbVar2;
        long j = aVar.a;
        ChannelMsgSendConfig channelMsgSendConfig = aVar.b;
        ChannelMsgSendState channelMsgSendState = aVar.c;
        PostSettingsFragment.a aVar2 = new PostSettingsFragment.a(PostSettingsFragment.class, null, null);
        aVar2.u(TransitionAnimationSimple$Companion$Type.SLIDE_FROM_RIGHT.h());
        Bundle bundle = aVar2.j;
        bundle.putLong("channel_id", j);
        bundle.putParcelable("channel_post_config", channelMsgSendConfig);
        bundle.putParcelable("channel_post_state", channelMsgSendState);
        aVar2.i(jbsVar, 4);
    }
}
