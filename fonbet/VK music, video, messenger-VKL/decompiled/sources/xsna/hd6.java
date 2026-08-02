package xsna;

import com.vkontakte.android.fragments.friends.FriendsFragment;

/* compiled from: BaseFriendsFragmentPresenter.kt */
/* loaded from: classes7.dex */
public abstract class hd6 implements gm6 {
    public final FriendsFragment b;
    public final aus c = new aus();
    public final io.reactivex.rxjava3.disposables.b d = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: BaseFriendsFragmentPresenter.kt */
    /* loaded from: classes11.dex */
    public interface a extends im6<hd6> {
    }

    public hd6(FriendsFragment friendsFragment) {
        this.b = friendsFragment;
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    public final aus b() {
        return this.c;
    }

    @Override // xsna.gm6
    public final void d() {
        g();
    }

    public abstract void g();

    @Override // xsna.cc6
    public final void onDestroy() {
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
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
