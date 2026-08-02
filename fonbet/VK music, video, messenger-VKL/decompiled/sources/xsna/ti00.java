package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.groups.ManagedGroup;
import java.util.List;

/* compiled from: ManagedGroupsLoaderImpl.kt */
/* loaded from: classes3.dex */
public final class ti00 implements g4z {
    public final a1w b;
    public final ji00 c;
    public final io.reactivex.rxjava3.subjects.d<List<ManagedGroup>> d = io.reactivex.rxjava3.subjects.d.N0();
    public final io.reactivex.rxjava3.disposables.b e = new io.reactivex.rxjava3.disposables.b();

    public ti00(a1w a1wVar, ji00 ji00Var) {
        this.b = a1wVar;
        this.c = ji00Var;
    }

    public final void a() {
        this.e.b(hg1.i(this.b.C(this, new oi00(6, Source.CACHE)).q(asu0.a.c()), new x2y(this, 7)));
    }

    public final void d() {
        this.e.b(hg1.i(this.b.C(this, new oi00(4, Source.NETWORK)).q(asu0.a.c()), new c2u(this, 6)));
    }

    @Override // xsna.g4z
    public final void onDestroy() {
        this.e.dispose();
    }
}
