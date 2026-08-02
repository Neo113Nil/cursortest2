package com.vkontakte.android.fragments.videos;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import androidx.annotation.NonNull;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.libvideo.api.di.VideoApiHelperComponent;
import com.vk.libvideo.repositories.VideoApiHelperRepository;
import com.vk.video.ui.albums.fragments.VideoAlbumFragment;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.subjects.f;
import xsna.asu0;
import xsna.b8v;
import xsna.j2r0;
import xsna.j6i;
import xsna.m7m;
import xsna.qw80;
import xsna.u1r0;
import xsna.ysg0;

/* loaded from: classes7.dex */
public class UploadedVideosFragment extends VideoAlbumFragment {
    public static final /* synthetic */ int n1 = 0;
    public final b j1 = new b();
    public final u1r0 k1 = new u1r0();
    public final j2r0 l1 = new j2r0();
    public final VideoApiHelperRepository m1 = ((VideoApiHelperComponent) j6i.b(m7m.d(this), VideoApiHelperComponent.class)).N4();

    @Override // com.vk.video.ui.albums.fragments.VideoAlbumFragment, com.vk.video.ui.albums.fragments.AbsVideoListFragment
    @NonNull
    public final q<VKList<VideoFile>> No(int i, int i2) {
        return this.m1.g(this.O0, Integer.valueOf(i), Integer.valueOf(i2), -1);
    }

    @Override // com.vk.video.ui.albums.fragments.VideoAlbumFragment, me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.fragments.LoaderFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.j1.e();
        super.onDestroyView();
    }

    @Override // com.vk.video.ui.albums.fragments.VideoAlbumFragment, com.vkontakte.android.fragments.base.GridFragment, com.vkontakte.android.fragments.VKRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        f<Object> fVar = ysg0.b.a;
        qw80 qw80Var = new qw80(this, 10);
        fVar.getClass();
        this.j1.b(new i0(fVar, qw80Var).a0(asu0.a.d()).subscribe(new b8v(this, 28)));
    }

    @Override // com.vk.video.ui.albums.fragments.VideoAlbumFragment, androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }
}
