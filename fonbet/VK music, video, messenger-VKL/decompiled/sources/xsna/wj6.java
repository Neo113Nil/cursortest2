package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.lists.c;
import com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment;
import com.vk.newsfeed.posting.mediapicker.videovk.presentation.PickerRecyclerPaginatedView;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.ij6;

/* compiled from: BasePhotoListPresenter.kt */
/* loaded from: classes4.dex */
public abstract class wj6<V extends ij6<?>> extends ysi implements gj6 {
    public final BasePhotoListFragment c;
    public com.vk.lists.c e;
    public io.reactivex.rxjava3.disposables.c f;
    public PhotoAlbum h;
    public final Object j;
    public final Object k;
    public final nv9 d = new nv9();
    public UserId g = UserId.d;
    public final LinkedHashSet i = new LinkedHashSet();

    public wj6(BasePhotoListFragment basePhotoListFragment) {
        this.c = basePhotoListFragment;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j = msy.a(lazyThreadSafetyMode, new na(this, 11));
        this.k = msy.a(lazyThreadSafetyMode, new sa0(this, 12));
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    public void d() {
        io.reactivex.rxjava3.disposables.c cVar = this.f;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0.b.a;
        k73 k73Var = new k73(5);
        fVar.getClass();
        this.f = new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, k73Var).a0(asu0.a.d()).subscribe(new b60(this, 5));
        com.vk.lists.c cVar2 = this.e;
        if (cVar2 != null) {
            cVar2.v();
        }
        c.h w7 = w7();
        BasePhotoListFragment basePhotoListFragment = this.c;
        PickerRecyclerPaginatedView pickerRecyclerPaginatedView = basePhotoListFragment.a0;
        if (pickerRecyclerPaginatedView == null) {
            pickerRecyclerPaginatedView = null;
        }
        this.e = com.vk.lists.f.a(w7, pickerRecyclerPaginatedView);
        PickerRecyclerPaginatedView pickerRecyclerPaginatedView2 = basePhotoListFragment.a0;
        (pickerRecyclerPaginatedView2 != null ? pickerRecyclerPaginatedView2 : null).setOnRefreshListener(new com.vk.newsfeed.posting.mediapicker.photovk.base.a(this, 0));
    }

    public final void j7(List<? extends Photo> list) {
        g5g.y(list, this.i);
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
        dispose();
        io.reactivex.rxjava3.disposables.c cVar = this.f;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    public final PhotoAlbum u7() {
        return this.h;
    }

    public abstract String v7();

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    public c.h w7() {
        vqu0 vqu0Var = new vqu0(new j7(this, 4));
        c.h a = ze90.a(0, (uj6) this.k.getValue(), this.c.lo(), this.b);
        a.c = 20;
        a.i = 30;
        a.s = 16;
        a.t = new s0d0() { // from class: xsna.oj6
            @Override // xsna.s0d0
            public final u0d0 a(int i) {
                wj6 wj6Var = wj6.this;
                io.reactivex.rxjava3.disposables.c subscribe = mcr0.s(wj6Var.c.lo().B(i, 0)).subscribe();
                hg1.e(wj6Var.b, subscribe);
                return new v0d0(subscribe);
            }
        };
        a.o = vqu0Var;
        return a;
    }

    @Override // xsna.cc6
    public final void onDestroy() {
    }

    @Override // xsna.cc6
    public final void onPause() {
    }

    @Override // xsna.cc6
    public final void onResume() {
    }

    @Override // xsna.gm6
    public final void onStart() {
    }

    @Override // xsna.gm6
    public final void onStop() {
    }
}
