package xsna;

import android.os.Bundle;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.lists.c;
import com.vk.photos.ui.base.BasePhotoListFragment;
import kotlin.LazyThreadSafetyMode;
import xsna.hj6;

/* compiled from: BasePhotoListPresenter.kt */
/* loaded from: classes3.dex */
public abstract class vj6<V extends hj6<?>> extends ysi implements fj6 {
    public final BasePhotoListFragment c;
    public com.vk.lists.c d;
    public io.reactivex.rxjava3.disposables.c e;
    public PhotoAlbum g;
    public boolean h;
    public final Object j;
    public final Object k;
    public UserId f = UserId.d;
    public final boolean i = true;

    public vj6(BasePhotoListFragment basePhotoListFragment) {
        this.c = basePhotoListFragment;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j = msy.a(lazyThreadSafetyMode, new vf0(this, 9));
        this.k = msy.a(lazyThreadSafetyMode, new b3(this, 10));
    }

    public boolean Q6() {
        return this.h;
    }

    public boolean X6() {
        return this.i;
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    public void d() {
        io.reactivex.rxjava3.disposables.c cVar = this.e;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0.b.a;
        et etVar = new et(5);
        fVar.getClass();
        this.e = new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, etVar).a0(asu0.a.d()).subscribe(new y50(this, 4));
        com.vk.lists.c cVar2 = this.d;
        if (cVar2 != null) {
            cVar2.v();
        }
        aq2 aq2Var = this.c.Y;
        if (aq2Var == null) {
            aq2Var = null;
        }
        this.d = com.vk.lists.f.a(u7(), aq2Var);
        aq2Var.setOnRefreshListener(new ra0(this, 11));
    }

    public void h() {
        com.vk.lists.c cVar = this.d;
        if (cVar == null) {
            cVar = null;
        }
        cVar.p(true);
    }

    public int j7() {
        return 0;
    }

    public void onCreate(Bundle bundle) {
        UserId userId = (UserId) bundle.getParcelable("uid");
        if (userId == null) {
            userId = o25.a().c();
        }
        this.f = userId;
        this.h = bundle.getBoolean("select", false);
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
        dispose();
        io.reactivex.rxjava3.disposables.c cVar = this.e;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public c.h u7() {
        c.h a = ze90.a(j7(), (tj6) this.k.getValue(), this.c.po(), this.b);
        a.c = 20;
        a.i = 30;
        a.s = 16;
        a.t = new s0d0() { // from class: xsna.nj6
            @Override // xsna.s0d0
            public final u0d0 a(int i) {
                vj6 vj6Var = vj6.this;
                io.reactivex.rxjava3.disposables.c subscribe = mcr0.s(vj6Var.c.po().B(i, 0)).subscribe();
                hg1.e(vj6Var.b, subscribe);
                return new v0d0(subscribe);
            }
        };
        return a;
    }

    @Override // xsna.cc6
    public final void onDestroy() {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    @Override // xsna.gm6
    public final void onStart() {
    }

    @Override // xsna.gm6
    public final void onStop() {
    }
}
