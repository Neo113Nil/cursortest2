package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.channels.api.ChannelHistoryOpenMode;
import com.vk.dto.messages.MsgIdType;
import com.vk.eduauth.RequireSwitchAccountDialogContent;
import com.vkontakte.android.R;
import kotlin.Lazy;

/* compiled from: ChannelFragmentLinkCallback.kt */
/* loaded from: classes16.dex */
public final class iza implements e1b {
    public final long a;
    public final fib b;
    public final defpackage.i c;
    public final jbs d;
    public final ucb e;
    public final io.reactivex.rxjava3.disposables.b f;
    public final Lazy g;
    public final Lazy h;

    public iza(long j, Lazy lazy, Lazy lazy2, fib fibVar, defpackage.i iVar, jbs jbsVar, ucb ucbVar, io.reactivex.rxjava3.disposables.b bVar) {
        this.a = j;
        this.b = fibVar;
        this.c = iVar;
        this.d = jbsVar;
        this.e = ucbVar;
        this.f = bVar;
        this.g = lazy;
        this.h = lazy2;
    }

    @Override // xsna.e1b
    public final void c(int i, long j) {
        if (this.a == j) {
            sf20 sf20Var = (sf20) this.g.getValue();
            sf20Var.k.f(MsgIdType.CNV_ID, i, true, "scrollToMsg");
        } else {
            this.b.c((Context) this.c.invoke(), j, new ChannelHistoryOpenMode.OpenAtMsgByCnvId(i), null);
        }
    }

    @Override // xsna.e1b
    public final void d(Throwable th) {
        com.vk.metrics.eventtracking.b.a.a(th);
    }

    @Override // xsna.e1b
    public final void e(long j) {
        this.b.c((Context) this.c.invoke(), j, ChannelHistoryOpenMode.OpenAtUnread.b, null);
    }

    @Override // xsna.e1b
    public final void f(int i, long j) {
        j(i, j);
    }

    @Override // xsna.e1b
    public final void h(Uri uri) {
        x0w x0wVar = (x0w) this.h.getValue();
        this.c.invoke();
        RequireSwitchAccountDialogContent requireSwitchAccountDialogContent = RequireSwitchAccountDialogContent.SFERUM_CHAT;
        x0wVar.getClass();
    }

    @Override // xsna.e1b
    public final void i(long j) {
        this.e.d(R.string.vkim_channels_channel_not_found);
    }

    public final void j(int i, long j) {
        if (this.a == j) {
            this.f.b(itg0.l(g2v.c().a().f(this.d, j, i).i(new k41(new com.vk.newsfeed.posting.impl.presentation.base.fragment.a(this, 12), 6))));
        } else {
            this.b.b((Context) this.c.invoke(), j, i, ChannelHistoryOpenMode.OpenAtUnread.b);
        }
    }

    @Override // xsna.e1b
    public final void g() {
    }

    @Override // xsna.e1b
    public final void a(Throwable th) {
    }

    @Override // xsna.e1b
    public final void b(int i, int i2, long j) {
    }
}
