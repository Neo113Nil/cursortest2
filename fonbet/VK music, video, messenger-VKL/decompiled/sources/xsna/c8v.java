package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.HistoryAttachAction;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.models.attaches.HistoryAttach;
import com.vk.im.engine.models.attaches.MediaType;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.ui.components.msg_list.MsgListOpenAtMsgMode;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.ikv0;
import xsna.tlo0;

/* compiled from: HistoryAttachesComponent.kt */
/* loaded from: classes2.dex */
public abstract class c8v extends txb {
    public static final /* synthetic */ qcy<Object>[] s;
    public final a1w j;
    public final mxv k;
    public final Context l;
    public final MediaType m;
    public final Peer n;
    public final kkm o;
    public final ChatSettings p;
    public final g9e0 q;
    public String r;

    /* compiled from: HistoryAttachesComponent.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HistoryAttachAction.values().length];
            try {
                iArr[HistoryAttachAction.GO_TO_MSG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HistoryAttachAction.SHARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HistoryAttachAction.COPY_LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: HistoryAttachesComponent.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Boolean, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Boolean bool) {
            ((f8v) this.receiver).b(bool.booleanValue());
            return s3q0.a;
        }
    }

    /* compiled from: HistoryAttachesComponent.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Boolean, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Boolean bool) {
            ((f8v) this.receiver).p(bool.booleanValue());
            return s3q0.a;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(c8v.class, "vc", "getVc()Lcom/vk/im/ui/components/attaches_history/attaches/vc/HistoryAttachesVC;", 0);
        fpf0.a.getClass();
        s = new qcy[]{propertyReference1Impl};
    }

    public c8v(Context context, Peer peer, MediaType mediaType, ChatSettings chatSettings, kkm kkmVar, mxv mxvVar, a1w a1wVar) {
        super(kkmVar);
        this.j = a1wVar;
        this.k = mxvVar;
        this.l = context;
        this.m = mediaType;
        this.n = peer;
        this.o = kkmVar;
        this.p = chatSettings;
        this.q = new g9e0(new g4g(this, 24));
    }

    @Override // xsna.j8i
    public View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        this.q.d();
        View c2 = f1().c(layoutInflater.getContext(), viewGroup);
        l56<?> d1 = d1();
        I0(d1.a().U(new e7(new d7(d1, 7), 3)).b(2, 1).U(new g7(new rf(3), 4)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new n3t(new u6k(this, 11), 3)));
        I0(d1().c().U(new c7(new am0(6), 7)).subscribe(new wf1(new b(1, f1(), f8v.class, "showLoading", "showLoading(Z)V", 0), 26)));
        I0(d1().c().U(new e10(new lt0(5), 7)).subscribe(new fu0(new c(1, f1(), f8v.class, "showPullToRefreshLoading", "showPullToRefreshLoading(Z)V", 0), 25)));
        if (bundle != null && !d1().getState().Bb().isEmpty()) {
            return c2;
        }
        this.r = null;
        I0(new io.reactivex.rxjava3.internal.operators.single.n(i1(this.n, null), new ov2(new ugm(this, 10), 23)).subscribe(new pv2(new m4g(this, 28), 20), new tf(new r9k(this, 17), 28)));
        return c2;
    }

    @Override // xsna.txb, xsna.j8i
    public void N0() {
        b1();
        f1().L();
        this.q.d();
    }

    @Override // xsna.txb
    public final void X0() {
        kkm kkmVar = this.i;
        if (kkmVar != null) {
            f1().n(kkmVar);
        }
    }

    @Override // xsna.txb
    public final String Y0() {
        return f1().getTitle();
    }

    @Override // xsna.txb
    public final void Z0(int i) {
        if (this.q.c()) {
            f1().j(i);
        }
    }

    @Override // xsna.txb
    public final void a1(int i, int[] iArr) {
        if (this.q.c()) {
            f1().q(i, iArr);
        }
    }

    @Override // xsna.txb
    public final void b1() {
        kkm kkmVar = this.i;
        if (kkmVar != null) {
            f1().o(kkmVar);
        }
    }

    public abstract List<HistoryAttachAction> c1(HistoryAttach historyAttach);

    public abstract l56<?> d1();

    public String e1() {
        return null;
    }

    public final f8v f1() {
        qcy<Object> qcyVar = s[0];
        return (f8v) this.q.b();
    }

    public final void g1(HistoryAttach historyAttach) {
        MsgListOpenAtMsgMode msgListOpenAtMsgMode = new MsgListOpenAtMsgMode(MsgIdType.CNV_ID, historyAttach.b);
        o0w.x(this.k.b(), this.l, null, this.n.b, null, null, msgListOpenAtMsgMode, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 1073741786);
        com.vk.metrics.eventtracking.b.a.m(qjg.a(historyAttach.d), "IM.HISTORY_ATTACH.GO_TO_MSG", "type");
    }

    public final boolean h1() {
        ChatSettings chatSettings = this.p;
        return (chatSettings == null || chatSettings.N) ? false : true;
    }

    public final io.reactivex.rxjava3.internal.operators.single.d0 i1(Peer peer, String str) {
        return new io.reactivex.rxjava3.internal.operators.single.d0(new io.reactivex.rxjava3.internal.operators.single.o(this.j.F(this, new ydm(peer, this.m, str, e1())), new afs(new u3u(this, 3), 2)).l(new k7(d8v.b, 19)), new gp(18), null);
    }

    public void j1(HistoryAttachAction historyAttachAction, HistoryAttach historyAttach) {
        int i = a.$EnumSwitchMapping$0[historyAttachAction.ordinal()];
        if (i == 1) {
            g1(historyAttach);
            return;
        }
        if (i == 2) {
            l1(historyAttach);
            return;
        }
        if (i != 3) {
            return;
        }
        Context context = this.l;
        fvr.l(context, historyAttach.d.N4(a0a.d));
        tlo0.f h = tq.h(tlo0.Companion, R.string.vkim_link_copied);
        if (Build.VERSION.SDK_INT <= 32) {
            ikv0.a aVar = new ikv0.a(context);
            aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_positive), (Size) null, 12);
            aVar.u = new ikv0.d(new ikv0.d.c(tlo0.b.a(h, context).toString()), (ikv0.d.b) null, (ikv0.d.a) null, 6);
            aVar.n();
        }
    }

    public abstract f8v k1();

    public final void l1(HistoryAttach historyAttach) {
        this.k.getClass();
        Attach attach = historyAttach.d;
        Peer q = this.j.q();
        kbj0.e(nr4.b(), this.l, wdw.b(attach, null, false, 6), false, null, false, q, 28);
        com.vk.metrics.eventtracking.b.a.m(qjg.a(attach), "IM.HISTORY_ATTACH.SHARE", "type");
    }
}
