package xsna;

import android.os.Bundle;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoUploadVh;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.search.communities.map.catalog.root.SearchCommunitiesOnMapListRootVh;
import com.vk.video.ui.albums.fragments.VideoAlbumsFragment;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.videos.UploadedVideosFragment;
import com.vkontakte.android.fragments.videos.VideosFragment;
import java.util.Objects;
import me.grishka.appkit.fragments.TabbedLoaderFragment;
import xsna.odg0;
import xsna.qfx0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class pw40 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pw40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((ap30) obj2).invoke(obj);
                break;
            case 1:
                ((e750) obj2).invoke(obj);
                break;
            case 2:
                ((ap30) obj2).invoke(obj);
                break;
            case 3:
                ((ap30) obj2).invoke(obj);
                break;
            case 4:
                ((ap30) obj2).invoke(obj);
                break;
            case 5:
                ((e750) obj2).invoke(obj);
                break;
            case 6:
                ((ap30) obj2).invoke(obj);
                break;
            case 7:
                ((odg0.b) obj2).invoke(obj);
                break;
            case 8:
                ((SearchCommunitiesOnMapListRootVh.a) obj2).invoke(obj);
                break;
            case 9:
                ((js00) obj2).invoke(obj);
                break;
            case 10:
                ((e750) obj2).invoke(obj);
                break;
            case 11:
                ((js00) obj2).invoke(obj);
                break;
            case 12:
                ((e750) obj2).invoke(obj);
                break;
            case 13:
                ((ap30) obj2).invoke(obj);
                break;
            case 14:
                ((e750) obj2).invoke(obj);
                break;
            case 15:
                ((vs6) obj2).invoke(obj);
                break;
            case 16:
                int i2 = VideoMinimizableDiscoveryFragment.p1;
                ((vhs0) obj2).invoke(obj);
                break;
            case 17:
                qcy<Object>[] qcyVarArr = VideoUploadVh.w;
                ((vhs0) obj2).invoke(obj);
                break;
            case 18:
                VideosFragment videosFragment = (VideosFragment) obj2;
                VideosFragment.f fVar = (VideosFragment.f) obj;
                int i3 = VideosFragment.z0;
                int i4 = fVar.a;
                int i5 = fVar.b;
                TabbedLoaderFragment.a aVar = videosFragment.l0;
                if (i5 > 0) {
                    UserId userId = videosFragment.m0;
                    boolean z = videosFragment.p0;
                    Bundle bundle = new Bundle();
                    bundle.putInt("album_id", -1);
                    bundle.putParcelable("uid", userId);
                    bundle.putBoolean("select", z);
                    UploadedVideosFragment uploadedVideosFragment = new UploadedVideosFragment();
                    uploadedVideosFragment.setArguments(bundle);
                    videosFragment.v0 = uploadedVideosFragment;
                    videosFragment.l0.a(aVar.d.size(), videosFragment.v0, videosFragment.getString(R.string.video_album_uploaded));
                } else {
                    UploadedVideosFragment uploadedVideosFragment2 = videosFragment.v0;
                    if (uploadedVideosFragment2 != null) {
                        aVar.m(uploadedVideosFragment2);
                        videosFragment.v0 = null;
                    }
                }
                boolean z2 = false;
                if (videosFragment.m0.b < 0) {
                    t6g0 t6g0Var = t6g0.b;
                    Group C0 = t6g0.b().C0(fkq0.e(videosFragment.m0));
                    if (C0 != null && C0.f()) {
                        z2 = true;
                    }
                }
                if (i4 <= 0) {
                    if (!Objects.equals(q6r0.f().y(), videosFragment.m0) && !z2) {
                        VideoAlbumsFragment videoAlbumsFragment = videosFragment.w0;
                        if (videoAlbumsFragment != null) {
                            videosFragment.l0.m(videoAlbumsFragment);
                            videosFragment.w0 = null;
                        }
                        videosFragment.vo();
                        videosFragment.oo();
                        break;
                    }
                }
                UserId userId2 = videosFragment.m0;
                boolean z3 = videosFragment.p0;
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("owner_id", userId2);
                bundle2.putBoolean("select", z3);
                VideoAlbumsFragment videoAlbumsFragment2 = new VideoAlbumsFragment();
                videoAlbumsFragment2.setArguments(bundle2);
                videosFragment.w0 = videoAlbumsFragment2;
                videosFragment.l0.a(aVar.d.size(), videosFragment.w0, videosFragment.getString(R.string.video_albums));
                videosFragment.vo();
                videosFragment.oo();
                break;
            case 19:
                ((pm90) obj2).invoke(obj);
                break;
            case 20:
                ((vhs0) obj2).invoke(obj);
                break;
            case 21:
                ((vhs0) obj2).invoke(obj);
                break;
            case 22:
                ((vhs0) obj2).invoke(obj);
                break;
            case 23:
                ((kp1) obj2).invoke(obj);
                break;
            case 24:
                ((vhs0) obj2).invoke(obj);
                break;
            default:
                ((qfx0.d) obj2).invoke(obj);
                break;
        }
    }
}
