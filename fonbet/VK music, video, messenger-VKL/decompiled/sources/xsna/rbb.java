package xsna;

import android.os.Bundle;
import com.vk.channels.impl.channel_screen.AppChannelFragment;
import com.vk.channels.impl.channel_screen.send_msg.ChannelMsgSendState;
import com.vk.gallerypicker.di.PhotoEditorComponent;
import com.vk.im.mvicomponent.MviComponentFragment;
import com.vk.story.viewer.api.StoryViewerRouter;

/* compiled from: ChannelSendMsgComponent.kt */
/* loaded from: classes16.dex */
public final class rbb extends yj50<ubb, ccb, ybb, zbb, bcb, wbb, xbb> {
    public final gzs<s3q0> A;
    public final q8b B;
    public final StoryViewerRouter C;
    public final r920 D;
    public final fts0 E;
    public final mg8 n;
    public final MviComponentFragment o;
    public final of20 p;
    public final ixa q;
    public final com.vk.im.popup.a r;
    public final h9k0 s;
    public final io.reactivex.rxjava3.disposables.b t;
    public final kkm u;
    public final q7v0 v;
    public final PhotoEditorComponent w;
    public final vbb x;
    public final long y;
    public final ChannelMsgSendState z;

    public rbb(mg8 mg8Var, MviComponentFragment mviComponentFragment, a3b a3bVar, lxa lxaVar, com.vk.im.popup.a aVar, ucb ucbVar, io.reactivex.rxjava3.disposables.b bVar, kkm kkmVar, q7v0 q7v0Var, PhotoEditorComponent photoEditorComponent, vbb vbbVar, long j, ChannelMsgSendState channelMsgSendState, AppChannelFragment.b bVar2, q8b q8bVar, StoryViewerRouter storyViewerRouter, r920 r920Var, fts0 fts0Var) {
        super(mviComponentFragment, mg8Var, ybb.class, false);
        this.n = mg8Var;
        this.o = mviComponentFragment;
        this.p = a3bVar;
        this.q = lxaVar;
        this.r = aVar;
        this.s = ucbVar;
        this.t = bVar;
        this.u = kkmVar;
        this.v = q7v0Var;
        this.w = photoEditorComponent;
        this.x = vbbVar;
        this.y = j;
        this.z = channelMsgSendState;
        this.A = bVar2;
        this.B = q8bVar;
        this.C = storyViewerRouter;
        this.D = r920Var;
        this.E = fts0Var;
    }

    @Override // xsna.yj50
    public final ubb a(Bundle bundle) {
        return new ubb(this.q, this.p, this.r, this.s, this.t, this.z, this.A, this.B, this.D);
    }

    @Override // xsna.yj50
    public final xbb b() {
        return new xbb(new jbs(this.o), this.C);
    }

    @Override // xsna.yj50
    public final zbb d() {
        return new zbb(this.o, this.y, this.q, this.z, this.u, this.v, this.w, this.x, this.A, this.E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbb)) {
            return false;
        }
        rbb rbbVar = (rbb) obj;
        return epx.f(this.n, rbbVar.n) && epx.f(this.o, rbbVar.o) && epx.f(this.p, rbbVar.p) && epx.f(this.q, rbbVar.q) && epx.f(this.r, rbbVar.r) && epx.f(this.s, rbbVar.s) && epx.f(this.t, rbbVar.t) && epx.f(this.u, rbbVar.u) && epx.f(this.v, rbbVar.v) && epx.f(this.w, rbbVar.w) && epx.f(this.x, rbbVar.x) && this.y == rbbVar.y && epx.f(this.z, rbbVar.z) && epx.f(this.A, rbbVar.A) && epx.f(this.B, rbbVar.B) && epx.f(this.C, rbbVar.C) && epx.f(this.D, rbbVar.D) && epx.f(this.E, rbbVar.E);
    }

    public final int hashCode() {
        int hashCode = (this.z.hashCode() + bh10.a((this.x.hashCode() + ((this.w.hashCode() + ((this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + ((this.s.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + (this.n.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.y)) * 31;
        gzs<s3q0> gzsVar = this.A;
        return this.E.hashCode() + ((this.D.hashCode() + ((this.C.hashCode() + ((this.B.hashCode() + ((hashCode + (gzsVar == null ? 0 : gzsVar.hashCode())) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChannelSendMsgComponent(broadcastHub=" + this.n + ", parent=" + this.o + ", messagesInteractor=" + this.p + ", channelDataSource=" + this.q + ", popupVc=" + this.r + ", snackbarViewer=" + this.s + ", lifecycleDisposable=" + this.t + ", themeBinder=" + this.u + ", onboardingClient=" + this.v + ", photoEditorComponent=" + this.w + ", fullscreenCallback=" + this.x + ", channelId=" + this.y + ", state=" + this.z + ", reloadMessages=" + this.A + ", channelPostToStoryPublisher=" + this.B + ", storiesRouter=" + this.C + ", historyLoader=" + this.D + ", videoMessageControllerDelegate=" + this.E + ')';
    }
}
