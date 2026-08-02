package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.photos.ui.album_list.AlbumsListFragment;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;

/* compiled from: AlbumsListFragmentPresenter.kt */
/* loaded from: classes3.dex */
public final class qo1 implements gm6 {
    public final AlbumsListFragment b;
    public final io.reactivex.rxjava3.disposables.b c = new io.reactivex.rxjava3.disposables.b();
    public UserId d = UserId.d;
    public boolean e;
    public boolean f;

    public qo1(AlbumsListFragment albumsListFragment) {
        this.b = albumsListFragment;
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    public final void b(boolean z) {
        r6m.a.getClass();
        yea0 yea0Var = new yea0(R.string.user_photos_title, R.string.all_photos, r6m.k());
        LinkedHashMap linkedHashMap = qt1.a;
        qt1.a(this.d, yea0Var).subscribe(new v8(new tb(this, 7), 5), new defpackage.n(new no1(z, this), 2));
    }

    @Override // xsna.gm6
    public final void d() {
        io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0.b.a;
        br brVar = new br(2);
        fVar.getClass();
        this.c.b(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, brVar).a0(asu0.a.d()).subscribe(new sv(this, 3)));
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
        this.c.dispose();
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
