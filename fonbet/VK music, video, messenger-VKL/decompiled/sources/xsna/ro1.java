package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.mediapicker.photovk.albums_list.VkAlbumsFragment;
import com.vk.newsfeed.posting.mediapicker.videovk.presentation.PickerRecyclerPaginatedView;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: AlbumsListFragmentPresenter.kt */
/* loaded from: classes4.dex */
public final class ro1 implements gm6 {
    public final VkAlbumsFragment b;
    public final io.reactivex.rxjava3.disposables.b c = new io.reactivex.rxjava3.disposables.b();
    public UserId d = UserId.d;
    public final List<Integer> e = e43.l(-6, -7, -9000);

    public ro1(VkAlbumsFragment vkAlbumsFragment) {
        this.b = vkAlbumsFragment;
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    public final void b(boolean z) {
        r6m.a.getClass();
        yea0 yea0Var = new yea0(R.string.media_picker_user_photos_title, R.string.media_picker_all_photos, r6m.k());
        if (!z) {
            PickerRecyclerPaginatedView pickerRecyclerPaginatedView = this.b.T;
            if (pickerRecyclerPaginatedView == null) {
                pickerRecyclerPaginatedView = null;
            }
            pickerRecyclerPaginatedView.e0();
        }
        LinkedHashMap linkedHashMap = pt1.a;
        int i = 1;
        this.c.b(pt1.a(this.d, yea0Var).U(new nz(new u8(this, 4), i)).subscribe(new qz(new com.vk.movika.sdk.base.observable.w(this, 3), i), new tz(new oo1(z, this), i)));
    }

    @Override // xsna.gm6
    public final void d() {
        io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0.b.a;
        com.vk.movika.sdk.android.defaultplayer.view.a aVar = new com.vk.movika.sdk.android.defaultplayer.view.a(2);
        fVar.getClass();
        this.c.b(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, aVar).a0(asu0.a.d()).subscribe(new c40(this, 2)));
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
