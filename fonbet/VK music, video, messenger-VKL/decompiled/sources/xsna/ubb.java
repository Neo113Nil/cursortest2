package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.channels.api.Channel;
import com.vk.channels.impl.channel_screen.send_msg.ChannelMsgSendState;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.im.engine.exceptions.ImTaskExecutionException;
import com.vk.im.engine.exceptions.NoNetworkConnectionException;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.stability.ImMsgSendDisabledByUnstableConnection;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.Date;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import xsna.bcb;
import xsna.wbb;
import xsna.ybb;

/* compiled from: ChannelSendMsgFeature.kt */
/* loaded from: classes16.dex */
public final class ubb extends di6<ccb, ybb, bcb, wbb> {
    public final ixa h;
    public final of20 i;
    public final com.vk.im.popup.a j;
    public final h9k0 k;
    public final io.reactivex.rxjava3.disposables.b l;
    public final ChannelMsgSendState m;
    public final gzs<s3q0> n;
    public final q8b o;
    public final io.reactivex.rxjava3.subjects.d<Channel> p;
    public final dh5 q;
    public final LinkedHashMap r;

    public ubb(ixa ixaVar, of20 of20Var, com.vk.im.popup.a aVar, h9k0 h9k0Var, io.reactivex.rxjava3.disposables.b bVar, ChannelMsgSendState channelMsgSendState, gzs<s3q0> gzsVar, q8b q8bVar, r920 r920Var) {
        super(new ccb(false, false));
        this.h = ixaVar;
        this.i = of20Var;
        this.j = aVar;
        this.k = h9k0Var;
        this.l = bVar;
        this.m = channelMsgSendState;
        this.n = gzsVar;
        this.o = q8bVar;
        io.reactivex.rxjava3.subjects.d<Channel> N0 = io.reactivex.rxjava3.subjects.d.N0();
        io.reactivex.rxjava3.internal.operators.observable.y a = ixaVar.a();
        j41 j41Var = new j41(N0, 6);
        a.n nVar = io.reactivex.rxjava3.internal.functions.a.e;
        i(a, nVar, j41Var);
        this.p = N0;
        this.q = new dh5(4);
        this.r = new LinkedHashMap();
        i(new io.reactivex.rxjava3.internal.operators.observable.y(N0, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a), nVar, new cp0(this, 8));
        bVar.b(r920Var.a().a0(asu0.a.d()).subscribe(new is1(new s9(this, 14), 7)));
    }

    @Override // xsna.di6
    public final void d(ybb ybbVar) {
        Boolean bool;
        ybb ybbVar2 = ybbVar;
        if (ybbVar2 instanceof ybb.a) {
            ybb.a aVar = (ybb.a) ybbVar2;
            n(new bcb.a(aVar.b, aVar.c, aVar.d));
            return;
        }
        if (ybbVar2 instanceof ybb.d) {
            n(new bcb.c(((ybb.d) ybbVar2).b));
            return;
        }
        if (ybbVar2 instanceof ybb.e) {
            n(new bcb.d(((ybb.e) ybbVar2).b));
            return;
        }
        if (ybbVar2 instanceof ybb.c) {
            ybb.c cVar = (ybb.c) ybbVar2;
            com.vk.im.popup.a.d(this.j, new t1b(), new tbb(this, cVar.b, cVar.c, 0), null, null, 12);
            return;
        }
        if (ybbVar2 instanceof ybb.f) {
            s((ybb.f) ybbVar2);
            return;
        }
        if (ybbVar2 instanceof ybb.k) {
            ybb.k kVar = (ybb.k) ybbVar2;
            ChannelMsgSendConfig channelMsgSendConfig = kVar.c;
            MsgFromChannel msgFromChannel = kVar.b;
            Date l = channelMsgSendConfig.l();
            if (l == null || ((Boolean) this.q.invoke(l)).booleanValue()) {
                s(new ybb.f(msgFromChannel, channelMsgSendConfig, false));
                return;
            } else {
                n(new bcb.k(msgFromChannel, channelMsgSendConfig));
                return;
            }
        }
        boolean z = ybbVar2 instanceof ybb.g;
        ixa ixaVar = this.h;
        if (z) {
            MsgFromChannel msgFromChannel2 = ((ybb.g) ybbVar2).b;
            Channel b = ixaVar.b();
            io.reactivex.rxjava3.internal.operators.completable.u o = this.i.e(msgFromChannel2, b != null ? b.z : null).o(asu0.a.d());
            ImFeatures imFeatures = ImFeatures.IM_CHAT_MODALS_REDESIGN;
            imFeatures.getClass();
            this.l.b(com.vk.im.popup.e.a(o, this.j, new ehd0(com.vk.toggle.b.A.a(imFeatures))).subscribe(new sbb(this, 0), new t00(new t40(this, 11), 9)));
            return;
        }
        if (ybbVar2 instanceof ybb.h) {
            ybb.h hVar = (ybb.h) ybbVar2;
            long j = hVar.b;
            ChannelMsgSendConfig channelMsgSendConfig2 = hVar.c;
            boolean z2 = hVar.d;
            Channel b2 = ixaVar.b();
            boolean z3 = b2 != null ? b2.E : false;
            ImFeatures imFeatures2 = ImFeatures.BLUR_POST;
            imFeatures2.getClass();
            boolean a = com.vk.toggle.b.A.a(imFeatures2);
            Channel b3 = ixaVar.b();
            boolean booleanValue = (b3 == null || (bool = b3.H) == null) ? true : bool.booleanValue();
            boolean z4 = hVar.e;
            Channel b4 = ixaVar.b();
            m(new wbb.a(j, channelMsgSendConfig2, ChannelMsgSendState.a(this.m, z2, a, z3, false, booleanValue, z4, b4 != null ? b4.z : null, 17)));
            return;
        }
        if (ybbVar2 instanceof ybb.j) {
            q(new d05(8, ybbVar2, this));
            ybb.j jVar = (ybb.j) ybbVar2;
            n(new bcb.f(jVar.b, jVar.c));
            return;
        }
        if (ybbVar2 instanceof ybb.m) {
            n(bcb.h.a);
            return;
        }
        if (ybbVar2 instanceof ybb.i) {
            n(bcb.e.a);
            return;
        }
        if (ybbVar2 instanceof ybb.b) {
            n(new bcb.b(((ybb.b) ybbVar2).b));
        } else if (ybbVar2 instanceof ybb.n) {
            n(new bcb.i(((ybb.n) ybbVar2).b));
        } else {
            if (!(ybbVar2 instanceof ybb.l)) {
                throw new NoWhenBranchMatchedException();
            }
            n(new bcb.g(((ybb.l) ybbVar2).b));
        }
    }

    public final void s(ybb.f fVar) {
        Date l = fVar.c.l();
        if (l != null && !((Boolean) this.q.invoke(l)).booleanValue()) {
            this.k.d(R.string.vkim_post_invalid_date);
            return;
        }
        n(bcb.l.a);
        io.reactivex.rxjava3.internal.operators.single.b0 m = this.i.a(fVar.b, fVar.c).m(asu0.a.d());
        ImFeatures imFeatures = ImFeatures.IM_CHAT_MODALS_REDESIGN;
        imFeatures.getClass();
        ehd0 ehd0Var = new ehd0(com.vk.toggle.b.A.a(imFeatures));
        com.vk.im.popup.a aVar = this.j;
        this.l.b(new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(m, new g600(new g22(26, aVar, ehd0Var), 15)), new ueb(aVar, 4)).subscribe(new xz(new s53(5, fVar, this), 10), new k41(new bv1(3, this, fVar), 7)));
    }

    public final void u(Throwable th, boolean z) {
        boolean z2 = th instanceof NoNetworkConnectionException;
        h9k0 h9k0Var = this.k;
        if (z2) {
            h9k0Var.d(z ? R.string.vkim_channels_post_edit_error_network : R.string.vkim_channels_post_send_error_network);
            return;
        }
        if (th instanceof VKApiExecutionException) {
            VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
            if (vKApiExecutionException.s() == 9) {
                h9k0Var.f(vKApiExecutionException.t());
                return;
            }
        }
        if ((th instanceof ImTaskExecutionException) && (((ImTaskExecutionException) th).getCause() instanceof ImMsgSendDisabledByUnstableConnection)) {
            cvk.t();
        } else {
            h9k0Var.d(z ? R.string.vkim_channels_post_edit_error : R.string.vkim_channels_post_send_error);
        }
    }
}
