package xsna;

import com.vk.log.L;
import com.vk.voip.ui.groupcalls.ControlsBoundsProvider;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.vk.voip.ui.groupcalls.list.ListGroupCallView;
import xsna.qiu;
import xsna.zrw;

/* compiled from: DesignControlBoundsImpl.kt */
/* loaded from: classes7.dex */
public final class g3m implements f3m {
    public static final int j = cn70.b(8);
    public static final int k = cn70.b(12);
    public final zzz a;
    public final zrw b;
    public final qiu c;
    public final ze00 d;
    public final ListGroupCallView e;
    public final io.reactivex.rxjava3.disposables.b f = new io.reactivex.rxjava3.disposables.b();
    public final io.reactivex.rxjava3.subjects.d<s3q0> g = io.reactivex.rxjava3.subjects.d.O0(s3q0.a);
    public final a h = new a();
    public final b i = new b();

    /* compiled from: DesignControlBoundsImpl.kt */
    public static final class a implements ControlsBoundsProvider {
        public a() {
        }

        @Override // com.vk.voip.ui.groupcalls.ControlsBoundsProvider
        public final int getBottomOffset() {
            GroupCallViewModel.b.getClass();
            GroupCallViewModel.GroupCallViewMode groupCallViewMode = GroupCallViewModel.e;
            GroupCallViewModel.GroupCallViewMode groupCallViewMode2 = GroupCallViewModel.GroupCallViewMode.GridViewMode;
            g3m g3mVar = g3m.this;
            if (groupCallViewMode == groupCallViewMode2) {
                return g3mVar.d.b().getControlsHeight();
            }
            L.e("BOUNDS_UPDATE: bounds request " + g3mVar.e.getBottomOffset());
            return g3mVar.e.getBottomOffset();
        }

        @Override // com.vk.voip.ui.groupcalls.ControlsBoundsProvider
        public final int getTopOffset() {
            g3m g3mVar = g3m.this;
            return awt0.n(g3mVar.b.c) + g3mVar.c.a();
        }
    }

    /* compiled from: DesignControlBoundsImpl.kt */
    public static final class b implements zrw.a, zpj, qiu.a, j6m {
        public b() {
        }

        @Override // xsna.zrw.a
        public final void a() {
            g3m.this.d();
        }

        @Override // xsna.zpj
        public final void b() {
            g3m.this.d();
        }

        @Override // xsna.qiu.a
        public final void c() {
            g3m.this.d();
        }

        @Override // xsna.j6m
        public final void v0(float f) {
            g3m.this.d();
        }
    }

    public g3m(zzz zzzVar, zrw zrwVar, qiu qiuVar, ze00 ze00Var, ListGroupCallView listGroupCallView) {
        this.a = zzzVar;
        this.b = zrwVar;
        this.c = qiuVar;
        this.d = ze00Var;
        this.e = listGroupCallView;
    }

    @Override // xsna.f3m
    public final io.reactivex.rxjava3.internal.operators.observable.z0 a() {
        return new io.reactivex.rxjava3.internal.operators.observable.z0(this.g.a0(asu0.a.d()).U(new vj0(new wcg(this, 7), 15)));
    }

    public final int b() {
        return this.h.getBottomOffset() + j;
    }

    public final int c() {
        return this.h.getTopOffset() + j;
    }

    public final void d() {
        this.g.onNext(s3q0.a);
    }
}
