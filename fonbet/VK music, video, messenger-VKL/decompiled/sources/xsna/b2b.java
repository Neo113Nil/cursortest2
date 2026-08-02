package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.im.engine.models.messages.MsgFromChannel;
import xsna.mwv;

/* compiled from: ChannelMessagesActionHandler.kt */
/* loaded from: classes16.dex */
public final class b2b {
    public final a1w a;
    public final FragmentActivity b;
    public final a3b c;
    public final com.vk.im.popup.a d;
    public final h9k0 e;
    public final io.reactivex.rxjava3.disposables.b f;
    public final r1b g;
    public final ixa h;
    public final gzs<s3q0> i;
    public final mwv<mwv.a> j;
    public final pib k;
    public final obw l;
    public final mxv m;

    /* compiled from: ChannelMessagesActionHandler.kt */
    public static final class a {
        public final pib a;
        public final obw b;
        public final mxv c;

        public a(pib pibVar, obw obwVar, mxv mxvVar) {
            this.a = pibVar;
            this.b = obwVar;
            this.c = mxvVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Bridges(sharingBridge=" + this.a + ", reportBridge=" + this.b + ", imBridge=" + this.c + ')';
        }
    }

    public b2b(a1w a1wVar, FragmentActivity fragmentActivity, a3b a3bVar, com.vk.im.popup.a aVar, ucb ucbVar, a aVar2, io.reactivex.rxjava3.disposables.b bVar, r1b r1bVar, lxa lxaVar, ChannelFragment.d dVar, mwv mwvVar) {
        this.a = a1wVar;
        this.b = fragmentActivity;
        this.c = a3bVar;
        this.d = aVar;
        this.e = ucbVar;
        this.f = bVar;
        this.g = r1bVar;
        this.h = lxaVar;
        this.i = dVar;
        this.j = mwvVar;
        this.k = aVar2.a;
        this.l = aVar2.b;
        this.m = aVar2.c;
    }

    public final boolean a(MsgFromChannel msgFromChannel) {
        PostDonut.Paywall paywall;
        PostDonut.Snippet snippet;
        LinkButton linkButton;
        PostDonut postDonut = msgFromChannel.I.g;
        if (postDonut == null || (paywall = postDonut.g) == null || (snippet = paywall.d) == null || (linkButton = snippet.e) == null) {
            return false;
        }
        Action action = linkButton.c;
        ActionOpenUrl actionOpenUrl = action instanceof ActionOpenUrl ? (ActionOpenUrl) action : null;
        if (actionOpenUrl == null) {
            return false;
        }
        this.m.k().b(this.b, actionOpenUrl.c);
        return true;
    }
}
