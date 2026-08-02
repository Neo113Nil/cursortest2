package xsna;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.photos.root.albums.presentation.AlbumsFragment;
import com.vk.photos.root.photoflow.presentation.PhotoFlowFragment;
import com.vk.photos.root.presentation.PhotosRootFragment;
import com.vk.photos.root.tabs.PhotosRootTab;

/* compiled from: PhotosRootTabAdapter.kt */
/* loaded from: classes4.dex */
public final class jga0 extends k1q0 {
    public final UserId s;
    public final int t;
    public final int u;
    public final String v;

    public jga0(PhotosRootFragment photosRootFragment, ViewPager2 viewPager2, mbs mbsVar, FragmentManager fragmentManager, UserId userId, int i, int i2, String str) {
        super(photosRootFragment, viewPager2, mbsVar, fragmentManager);
        this.s = userId;
        this.t = i;
        this.u = i2;
        this.v = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return PhotosRootTab.values().length;
    }

    @Override // xsna.scs
    public final Fragment z0(int i) {
        FragmentImpl f;
        int h = PhotosRootTab.PHOTO_FLOW.h();
        UserId userId = this.s;
        if (i == h) {
            s7a0 s7a0Var = new s7a0(PhotoFlowFragment.class, null, null);
            Bundle bundle = s7a0Var.j;
            bundle.putParcelable("uid", userId);
            bundle.putInt("PHOTO_TAGS_COUNT", this.t);
            bundle.putInt("RECOGNITION_TAGS_COUNT", this.u);
            f = s7a0Var.f();
        } else {
            AlbumsFragment.a aVar = new AlbumsFragment.a(AlbumsFragment.class, null, null);
            Bundle bundle2 = aVar.j;
            bundle2.putParcelable("uid", userId);
            bundle2.putString("USER_NAME_GEN", this.v);
            f = aVar.f();
        }
        G0(f, i);
        return f;
    }
}
