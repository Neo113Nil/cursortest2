package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.ui.components.chat_invite.InviteEntity;
import com.vk.im.ui.components.common.NotifyId;
import com.vk.im.ui.fragments.ChatMakeLinkFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ChatMakeLinkComponent.kt */
/* loaded from: classes2.dex */
public final class qsb extends j8i {
    public final Context i;
    public final f1w j;
    public final lzv k;
    public final InviteEntity l;
    public final boolean m;
    public msx n;
    public io.reactivex.rxjava3.disposables.c o;
    public boolean p = true;
    public tsb q;
    public ChatMakeLinkFragment.b r;

    /* compiled from: ChatMakeLinkComponent.kt */
    public final class a {
        public a() {
        }

        public final void a() {
            qsb qsbVar = qsb.this;
            msx msxVar = qsbVar.n;
            if (msxVar != null) {
                fvr.l(qsbVar.i, msxVar.b);
                tsb tsbVar = qsbVar.q;
                if (tsbVar != null) {
                    tsbVar.b(NotifyId.COPY_TO_CLIPBOARD_DONE);
                }
            }
        }

        public final void b() {
            qsb qsbVar = qsb.this;
            tsb tsbVar = qsbVar.q;
            if (tsbVar != null) {
                tsbVar.f(new z4(qsbVar, 20));
            }
        }

        public final void c() {
            ChatMakeLinkFragment.b bVar;
            qsb qsbVar = qsb.this;
            msx msxVar = qsbVar.n;
            if (msxVar == null || (bVar = qsbVar.r) == null) {
                return;
            }
            g2v.c().getClass();
            nr4.b().k(ChatMakeLinkFragment.this.getActivity(), bVar.a(msxVar));
        }

        public final void d() {
            ChatMakeLinkFragment.b bVar;
            Uri c;
            qsb qsbVar = qsb.this;
            msx msxVar = qsbVar.n;
            if (msxVar == null || (bVar = qsbVar.r) == null) {
                return;
            }
            FragmentActivity kn = ChatMakeLinkFragment.this.kn();
            g2v.c().getClass();
            String a = bVar.a(msxVar);
            if (o25.b(o25.a()) && (c = meq0.c(R.drawable.vk_icon_logo_sferum_color_16)) != null) {
                c.toString();
            }
            boolean z = msxVar.c;
            com.vk.qrcode.d dVar = com.vk.qrcode.d.b;
            com.vk.qrcode.d.l(kn, a, kn.getString(z ? R.string.qr_channel : R.string.qr_chat), null, com.vk.stat.scheme.t0.a(z ? MobileOfficialAppsCoreNavStat$EventScreen.COMMUNITY_CHANNEL : MobileOfficialAppsCoreNavStat$EventScreen.IM_CHAT));
        }

        public final void e(boolean z) {
            qsb qsbVar = qsb.this;
            qsbVar.p = z;
            qsbVar.X0(z, false);
        }
    }

    public qsb(Context context, f1w f1wVar, lzv lzvVar, InviteEntity inviteEntity, boolean z) {
        this.i = context;
        this.j = f1wVar;
        this.k = lzvVar;
        this.l = inviteEntity;
        this.m = z;
        X0(true, false);
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        ssb ssbVar = new ssb(this.m, this.j.c().i(), 7);
        ImFeatures imFeatures = ImFeatures.IM_CHAT_MAKE_LINK_REDESIGN;
        imFeatures.getClass();
        this.q = com.vk.toggle.b.A.a(imFeatures) ? new vsb(layoutInflater, viewGroup, new a(), ssbVar) : new usb(layoutInflater, viewGroup, new a(), ssbVar);
        msx msxVar = this.n;
        ChatMakeLinkFragment.b bVar = this.r;
        if (bVar != null) {
            InviteEntity inviteEntity = this.l;
            inviteEntity.getClass();
            bVar.b((inviteEntity instanceof InviteEntity.Channel) || ((InviteEntity.Chat) inviteEntity).d);
        }
        if (msxVar == null) {
            tsb tsbVar = this.q;
            if (tsbVar != null) {
                tsbVar.e();
            }
        } else {
            tsb tsbVar2 = this.q;
            if (tsbVar2 != null) {
                tsbVar2.d(msxVar);
            }
        }
        return this.q.getView();
    }

    @Override // xsna.j8i
    public final void M0() {
        io.reactivex.rxjava3.disposables.c cVar = this.o;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // xsna.j8i
    public final void N0() {
        tsb tsbVar = this.q;
        if (tsbVar != null) {
            tsbVar.destroy();
        }
        this.q = null;
    }

    public final void X0(boolean z, boolean z2) {
        io.reactivex.rxjava3.disposables.c cVar = this.o;
        if (cVar != null) {
            cVar.dispose();
        }
        InviteEntity inviteEntity = this.l;
        int i = 1;
        int i2 = 0;
        if (inviteEntity instanceof InviteEntity.Chat) {
            Serializer.c<Peer> cVar2 = Peer.CREATOR;
            int i3 = 5;
            this.o = new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(this.k.b(this, new osb(Peer.a.b(((InviteEntity.Chat) inviteEntity).b), z, z2)).m(io.reactivex.rxjava3.android.schedulers.a.b()), new ez(new com.vk.movika.sdk.base.observable.g(this, 16), i3)), new psb(this, i2)).subscribe(new bg1(new f58(this, z2, i), 12), new qs2(new rsb(1, this, qsb.class, "onLoadLinkError", "onLoadLinkError(Ljava/lang/Throwable;)V", 0), i3));
            return;
        }
        if (!(inviteEntity instanceof InviteEntity.Channel)) {
            throw new NoWhenBranchMatchedException();
        }
        InviteEntity.Channel channel = (InviteEntity.Channel) inviteEntity;
        Y0(new msx(channel.b, channel.c, true), false);
    }

    public final void Y0(msx msxVar, boolean z) {
        tsb tsbVar;
        this.n = msxVar;
        tsb tsbVar2 = this.q;
        if (tsbVar2 != null) {
            tsbVar2.d(msxVar);
        }
        if (z && (tsbVar = this.q) != null) {
            tsbVar.c();
        }
        ChatMakeLinkFragment.b bVar = this.r;
        if (bVar != null) {
            bVar.b(msxVar.c);
        }
    }
}
