package xsna;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.dto.common.id.UserId;
import com.vk.voip.ui.watchmovie.selectsource.dialog.ui.VoipSelectMovieViewTabs;
import com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.VoipAddedVideosFragment;
import com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.VoipRecommendedVideosFragment;
import com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.VoipSelectVideoPlaylistsFragment;
import com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.VoipUploadedVideosFragment;

/* compiled from: VoipSelectMoviePageAdapter.kt */
/* loaded from: classes7.dex */
public final class jzw0 extends scs {
    public final UserId l;

    public jzw0(FragmentManager fragmentManager, Lifecycle lifecycle, UserId userId) {
        super(fragmentManager, lifecycle);
        this.l = userId;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return VoipSelectMovieViewTabs.h().size();
    }

    @Override // xsna.scs
    public final Fragment z0(int i) {
        UserId userId = this.l;
        if (i == 1) {
            VoipSelectVideoPlaylistsFragment.a aVar = new VoipSelectVideoPlaylistsFragment.a(VoipSelectVideoPlaylistsFragment.class, null, null);
            aVar.j.putParcelable(CommonConstant.RETKEY.USERID, userId);
            return aVar.f();
        }
        oz50 aVar2 = i != 0 ? i != 2 ? i != 3 ? new VoipUploadedVideosFragment.a() : new VoipUploadedVideosFragment.a() : new VoipAddedVideosFragment.a(VoipAddedVideosFragment.class, null, null) : new VoipRecommendedVideosFragment.a(VoipRecommendedVideosFragment.class, null, null);
        aVar2.j.putParcelable(CommonConstant.RETKEY.USERID, userId);
        return aVar2.f();
    }
}
