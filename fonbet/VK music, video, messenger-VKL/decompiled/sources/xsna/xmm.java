package xsna;

import android.view.MotionEvent;
import android.view.View;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.im.itemlist.impl.presentation.fragment.ImItemListFragment;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.lang.ref.WeakReference;
import xsna.gm20;
import xsna.i6w;
import xsna.jmm;
import xsna.wls;

/* compiled from: DialogsAdapterListener.kt */
/* loaded from: classes2.dex */
public final class xmm implements jmm.a, pvw, wls.a, gm20.a {
    public final ImItemListFragment.f a;
    public final io.reactivex.rxjava3.disposables.b b = new io.reactivex.rxjava3.disposables.b();

    public xmm(ImItemListFragment.f fVar) {
        this.a = fVar;
    }

    @Override // xsna.gm20.a
    public final void C() {
        this.a.invoke(i6w.y.b);
    }

    @Override // xsna.pvw
    public final void F(String str) {
        this.a.invoke(new i6w.n(str));
    }

    @Override // xsna.jmm.a
    public final void K(Peer peer, ImStoryState imStoryState, WeakReference<View> weakReference) {
        this.a.invoke(new i6w.x(peer, imStoryState, weakReference));
    }

    @Override // xsna.pvw, xsna.wls.a
    public final void a(InfoBar infoBar) {
        this.a.invoke(new i6w.q(infoBar));
    }

    @Override // xsna.pvw
    public final void d(InfoBar infoBar, InfoBar.Button button) {
        this.a.invoke(new i6w.o(infoBar, button));
    }

    @Override // xsna.gm20.a
    public final void e() {
        this.a.invoke(i6w.g.b);
    }

    @Override // xsna.pvw, xsna.wls.a
    public final void f(InfoBar infoBar) {
        this.a.invoke(new i6w.p(infoBar));
    }

    @Override // xsna.gm20.a
    public final void m() {
        this.a.invoke(i6w.z.b);
    }

    @Override // xsna.jmm.a
    public final void n(jmm.a.C3126a c3126a) {
        Peer peer = c3126a.a;
        io.reactivex.rxjava3.core.q<MotionEvent> qVar = c3126a.b;
        this.a.invoke(new i6w.l(peer, qVar));
        this.b.b(new io.reactivex.rxjava3.internal.operators.observable.a0(qVar, new rz(this, 1)).subscribe());
    }

    @Override // xsna.jmm.a
    public final void s(Peer peer) {
        this.a.invoke(new i6w.j(peer));
    }

    @Override // xsna.jmm.a
    public final void v(Peer peer) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{yq.b(peer, "ImItemList.Debug onDialogClick: peer=")});
        }
        this.a.invoke(new i6w.i(peer));
    }

    @Override // xsna.pvw
    public final void y(UserId userId) {
        this.a.invoke(new i6w.r(userId));
    }
}
