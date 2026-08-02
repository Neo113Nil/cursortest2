package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.dto.common.Source;

/* compiled from: TaskLoadMoreViaNetwork.java */
/* loaded from: classes2.dex */
public final class n6o0 extends zzp0<Void> {
    public static final f9w h = e9w.a(n6o0.class);

    @NonNull
    public final com.vk.im.ui.components.dialogs_list.c d;

    @NonNull
    public final gkx0 e;
    public final int f = 30;

    @Nullable
    public io.reactivex.rxjava3.disposables.c g;

    public n6o0(@NonNull com.vk.im.ui.components.dialogs_list.c cVar, @NonNull gkx0 gkx0Var) {
        this.d = cVar;
        this.e = gkx0Var;
    }

    @Override // xsna.zzp0
    public final void a() {
        io.reactivex.rxjava3.disposables.c cVar = this.g;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // xsna.zzp0
    public final void c(Throwable th) {
        h.a(th);
        if (this.d.f() != null) {
            zk70.e(th);
        }
    }

    @Override // xsna.zzp0
    public final void d() {
        com.vk.im.ui.components.dialogs_list.c cVar = this.d;
        this.g = cVar.d.C(this, new lrm(new drm(this.e, cVar.i, this.f, Source.NETWORK, true, (Object) this, toString() + " DialogsListPresenter"))).q(asu0.a.c()).subscribe(new m6o0(this));
    }

    @Override // xsna.zzp0
    public final void e(Void r3) {
        com.vk.im.ui.components.dialogs_list.c cVar = this.d;
        com.vk.im.ui.components.dialogs_list.e eVar = cVar.h;
        eVar.A = false;
        eVar.B = false;
        eVar.A = true;
        cVar.F(this, new l6o0(cVar, this.e));
    }

    public final String toString() {
        return "TaskLoadMoreViaNetwork{mSince=" + this.e + ", mLimit=" + this.f + "} " + super.toString();
    }
}
