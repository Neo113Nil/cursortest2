package xsna;

import android.view.View;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.im.itemlist.impl.presentation.fragment.ImItemListFragment;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.lang.ref.WeakReference;
import xsna.i6w;

/* compiled from: ChannelsAdapterListener.kt */
/* loaded from: classes2.dex */
public final class heb implements lgb {
    public final ImItemListFragment.f a;

    public heb(ImItemListFragment.f fVar) {
        this.a = fVar;
    }

    @Override // xsna.lgb
    public final void r(j0b j0bVar) {
        this.a.invoke(new i6w.d(j0bVar.b));
    }

    @Override // xsna.lgb
    public final void w(long j, ImStoryState imStoryState, WeakReference<View> weakReference) {
        this.a.invoke(new i6w.e(j, imStoryState, weakReference));
    }

    @Override // xsna.lgb
    public final void x(j0b j0bVar) {
        long j = j0bVar.b;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{defpackage.k0.a(j, "ImItemList.Debug onChannelClick: channelId=")});
        }
        this.a.invoke(new i6w.c(j));
    }

    @Override // xsna.lgb
    public final void i() {
    }

    @Override // xsna.lgb
    public final void k() {
    }

    @Override // xsna.lgb
    public final void o() {
    }

    @Override // xsna.lgb
    public final void t() {
    }

    @Override // xsna.lgb
    public final void B(long j) {
    }

    @Override // xsna.lgb
    public final void J(f3n0 f3n0Var) {
    }

    @Override // xsna.lgb
    public final void N(String str) {
    }

    @Override // xsna.lgb
    public final void G(long j, CharSequence charSequence) {
    }

    @Override // xsna.lgb
    public final void L(long j, String str) {
    }

    @Override // xsna.lgb
    public final void p(long j, CharSequence charSequence) {
    }
}
