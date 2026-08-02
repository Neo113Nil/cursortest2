package xsna;

import android.view.ViewGroup;
import com.vk.dto.group.Group;
import java.util.List;
import java.util.Optional;
import kotlin.Pair;

/* compiled from: ClipsCurrentAuthorPresenter.kt */
/* loaded from: classes14.dex */
public class vod extends ysi implements sod, w8i {
    public final ViewGroup c;
    public final bpn0 d = new bpn0(new mh(this, 26));
    public io.reactivex.rxjava3.disposables.c e;
    public io.reactivex.rxjava3.disposables.c f;
    public io.reactivex.rxjava3.disposables.c g;

    /* JADX WARN: Multi-variable type inference failed */
    public vod(tod todVar) {
        this.c = (ViewGroup) todVar;
    }

    @Override // xsna.sod
    public final void g0() {
        j7();
    }

    @Override // xsna.sod
    public final void h0() {
        this.b.e();
    }

    public final void j7() {
        hg1.f(this.e);
        io.reactivex.rxjava3.core.x<Optional<Pair<dhd, List<Group>>>> g = ((rhd) this.d.getValue()).g();
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        io.reactivex.rxjava3.disposables.c subscribe = g.q(asu0.r()).m(asu0Var.d()).subscribe(new bg1(new com.vk.movika.sdk.base.observable.e(this, 23), 14), new hz(new mb(this, 27), 17));
        this.b.b(subscribe);
        this.e = subscribe;
    }

    public void u7() {
    }
}
