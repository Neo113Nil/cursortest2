package xsna;

import android.view.ViewGroup;
import com.facebook.soloader.MinElf;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.MsgRequestStatus;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.ui.fragments.chat.ChatFragment;
import kotlin.collections.EmptyList;
import xsna.o0r0;
import xsna.ttb;

/* compiled from: ChatMessageRequestComponent.kt */
/* loaded from: classes2.dex */
public final class rtb extends j8i {
    public final a1w i;
    public final mxv j;
    public final ChatFragment.c k;
    public ttb m;
    public long n;
    public final a l = new a();
    public final ProfilesInfo o = new ProfilesInfo();
    public final bpn0 p = new bpn0(new com.vk.movika.sdk.base.presenter.b(this, 7));

    /* compiled from: ChatMessageRequestComponent.kt */
    public final class a implements ttb.a {
        public a() {
        }

        @Override // xsna.ttb.a
        public final void a(Peer peer) {
            rtb rtbVar = rtb.this;
            o0r0 d = rtbVar.j.d();
            ttb ttbVar = rtbVar.m;
            if (ttbVar == null) {
                ttbVar = null;
            }
            d.m(ttbVar.b.getContext(), com.vk.dto.common.a.b(peer), new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
        }

        @Override // xsna.ttb.a
        public final void b() {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            rtb rtbVar = rtb.this;
            rtbVar.I0(rtbVar.i.E("ChatMessageRequestComponent", new yv30(Peer.a.b(rtbVar.n), MsgRequestStatus.REJECTED, false)).subscribe(new bf2(new k9(rtbVar, 24), 8), new tz(new vd1(6), 11)));
        }

        @Override // xsna.ttb.a
        public final void onAccept() {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            rtb rtbVar = rtb.this;
            rtbVar.I0(rtbVar.i.E("ChatMessageRequestComponent", new yv30(Peer.a.b(rtbVar.n), MsgRequestStatus.ACCEPTED, false)).subscribe(new xz(new j9(rtbVar, 22), 13), new k41(new sc(6), 10)));
        }

        @Override // xsna.ttb.a
        public final void onClose() {
            rtb.this.k.a();
        }
    }

    public rtb(a1w a1wVar, mxv mxvVar, ChatFragment.c cVar) {
        this.i = a1wVar;
        this.j = mxvVar;
        this.k = cVar;
    }

    public final void X0(ViewGroup viewGroup, DialogExt dialogExt) {
        this.n = dialogExt.e;
        this.o.Hb(dialogExt.b);
        if (!dialogExt.j) {
            ttb ttbVar = this.m;
            if (ttbVar != null) {
                ttbVar.c();
                return;
            }
            return;
        }
        Dialog Cb = dialogExt.Cb();
        if (this.m == null) {
            if ((Cb != null ? Cb.Xb() : null) == MsgRequestStatus.PENDING) {
                this.m = new ttb(this.l, viewGroup);
                stb stbVar = new stb(Cb, EmptyList.b, 0, this.o, (Peer) this.p.getValue(), Cb.Wb());
                ttb ttbVar2 = this.m;
                if (ttbVar2 == null) {
                    ttbVar2 = null;
                }
                ttbVar2.d(stbVar);
                I0(this.i.C("ChatMessageRequestComponent", new wzb(null, true, Cb.Zb())).subscribe(new k5(new yu1(2, this, Cb), 7), new m5(new com.vk.movika.sdk.base.observable.e0(9), 12)));
                return;
            }
        }
        if (this.m != null) {
            if ((Cb != null ? Cb.Xb() : null) != MsgRequestStatus.PENDING) {
                ttb ttbVar3 = this.m;
                (ttbVar3 != null ? ttbVar3 : null).c();
            }
        }
    }
}
