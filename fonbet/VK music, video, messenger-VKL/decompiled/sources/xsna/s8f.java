package xsna;

import com.vk.clips.editor.templates.impl.player.VideoSourceType;
import com.vk.clips.editor.templates.impl.player.a;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.inf;

/* compiled from: ClipsTemplateVideoViewImpl.kt */
/* loaded from: classes16.dex */
public final class s8f implements r8f {
    public final inf a;
    public boolean b;

    public s8f(lpj lpjVar, nbl0 nbl0Var) {
        this.a = new inf(lpjVar, EmptyList.b, nbl0Var, Integer.MAX_VALUE, null, 4080);
    }

    @Override // xsna.r8f
    public final long a() {
        com.vk.clips.editor.templates.impl.player.a videoView = this.a.getVideoView();
        if (videoView != null) {
            return videoView.getStartTimeMs();
        }
        return 0L;
    }

    @Override // xsna.r8f
    public final void b(long j, List list) {
        this.a.k(Long.valueOf(j), list);
        this.b = true;
    }

    @Override // xsna.r8f
    public final void c(long j) {
        com.vk.clips.editor.templates.impl.player.a videoView = this.a.getVideoView();
        if (videoView != null) {
            videoView.J = j;
        }
    }

    @Override // xsna.r8f
    public final void d(long j) {
        com.vk.clips.editor.templates.impl.player.a videoView = this.a.getVideoView();
        if (videoView != null) {
            videoView.K = j;
            videoView.v(new tw3(videoView, 2));
        }
    }

    @Override // xsna.r8f
    public final long e() {
        com.vk.clips.editor.templates.impl.player.a videoView = this.a.getVideoView();
        if (videoView != null) {
            return videoView.getEndOnTimeMs();
        }
        return 0L;
    }

    public final long f() {
        com.vk.clips.editor.templates.impl.player.a videoView = this.a.getVideoView();
        if (videoView != null) {
            return videoView.getCurrentPosition();
        }
        return 0L;
    }

    public final int g() {
        com.vk.clips.editor.templates.impl.player.a videoView = this.a.getVideoView();
        if (videoView != null) {
            return videoView.getCurrentState();
        }
        return 0;
    }

    @Override // xsna.r8f
    public final long getDuration() {
        com.vk.clips.editor.templates.impl.player.a videoView = this.a.getVideoView();
        if (videoView != null) {
            return videoView.getDuration();
        }
        return 0L;
    }

    public final boolean h() {
        com.vk.clips.editor.templates.impl.player.a aVar = this.a.k;
        if (aVar != null) {
            return aVar.H;
        }
        return false;
    }

    public final void i(a.k kVar) {
        this.a.r.remove(kVar);
    }

    public final void j(inf.a aVar) {
        this.a.q.remove(aVar);
    }

    public final void k(long j) {
        com.vk.clips.editor.templates.impl.player.a videoView = this.a.getVideoView();
        if (videoView != null) {
            videoView.v(new q7f(1, j, videoView));
        }
    }

    public final void l(boolean z) {
        com.vk.clips.editor.templates.impl.player.a videoView = this.a.getVideoView();
        if (videoView != null) {
            videoView.setLoop(z);
        }
    }

    public final void m(boolean z) {
        com.vk.clips.editor.templates.impl.player.a videoView = this.a.getVideoView();
        if (videoView != null) {
            videoView.setMute(z);
        }
    }

    public final void n(a.g gVar) {
        com.vk.clips.editor.templates.impl.player.a videoView = this.a.getVideoView();
        if (videoView != null) {
            videoView.setOnEndListener(gVar);
        }
    }

    public final void o(a.h hVar) {
        com.vk.clips.editor.templates.impl.player.a videoView = this.a.getVideoView();
        if (videoView != null) {
            videoView.setOnErrorListener(hVar);
        }
    }

    public final void p(boolean z) {
        com.vk.clips.editor.templates.impl.player.a videoView = this.a.getVideoView();
        if (videoView != null) {
            videoView.setPlayWhenReady(z);
        }
    }

    public final void q(Long l, List list) {
        this.a.k(l, list);
        this.b = false;
    }

    public final void r(VideoSourceType videoSourceType) {
        com.vk.clips.editor.templates.impl.player.a videoView = this.a.getVideoView();
        if (videoView != null) {
            videoView.setVideoSourceType(videoSourceType);
        }
    }
}
