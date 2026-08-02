package xsna;

import android.graphics.Bitmap;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.libvideo.upload.api.VideoUploadEvent;
import com.vk.log.L;
import kotlin.NoWhenBranchMatchedException;
import xsna.it80;
import xsna.y4x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class s56 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s56(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                bpn0 bpn0Var = t65.a;
                mhy.b(((View) obj).getContext());
                FragmentActivity activity = ((a66) obj2).getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                return s3q0.a;
            case 1:
                return (String) obj2;
            case 2:
                com.vk.libvideo.upload.impl.b bVar = (com.vk.libvideo.upload.impl.b) obj2;
                wxr0 wxr0Var = (wxr0) obj;
                bVar.i.add(wxr0Var.a.r1());
                bVar.g.a(new VideoUploadEvent.Removed(wxr0Var.a));
                return s3q0.a;
            default:
                y4x0 y4x0Var = (y4x0) obj2;
                y4x0.a aVar = (y4x0.a) obj;
                int i2 = 4;
                int i3 = 10;
                int i4 = 5;
                if (aVar instanceof y4x0.a.c) {
                    String a = ((y4x0.a.c) aVar).a();
                    int i5 = 25;
                    io.reactivex.rxjava3.internal.operators.observable.j1 U = mcr0.l(-1L, a).U(new ac20(new hcs0(i4), i5));
                    asu0 asu0Var = asu0.a;
                    return new io.reactivex.rxjava3.internal.operators.observable.p1(U.r0(asu0Var.c()).a0(asu0Var.d()).U(new uf20(new ulq0(2, a, y4x0Var), i5)).F(new v5u0(new h9i0(i3, a, y4x0Var), i4)), new lft0(new p9w0(i2)));
                }
                if (!(aVar instanceof y4x0.a.C4076a)) {
                    if (!(aVar instanceof y4x0.a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    L.e("VVMOpponentAvatarDelegate", "Peer icon updated with empty icon (as requested)");
                    y4x0Var.g = null;
                    return io.reactivex.rxjava3.core.q.T(Boolean.FALSE);
                }
                final long a2 = ((y4x0.a.C4076a) aVar).a();
                io.reactivex.rxjava3.internal.operators.observable.j1 U2 = new io.reactivex.rxjava3.internal.operators.observable.q(new io.reactivex.rxjava3.core.s() { // from class: xsna.v4x0
                    @Override // io.reactivex.rxjava3.core.s
                    public final void subscribe(io.reactivex.rxjava3.core.r rVar) {
                        it80.a aVar2 = it80.b;
                        Bitmap B = z4g.d().B(o25.a().c().b, a2);
                        aVar2.getClass();
                        rVar.onNext(new it80(B));
                    }
                }).U(new cxd0(new wep0(i3), 17));
                asu0 asu0Var2 = asu0.a;
                return new io.reactivex.rxjava3.internal.operators.observable.p1(U2.r0(asu0Var2.c()).a0(asu0Var2.d()).U(new o8c0(new m2l0(y4x0Var, 28), 16)).F(new j5v0(new v8w0(a2, y4x0Var), i4)), new igj0(12, new p9w0(i2)));
        }
    }
}
