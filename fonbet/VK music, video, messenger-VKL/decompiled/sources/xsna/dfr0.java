package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.video.ui.albums.fragments.VideoAlbumFragment;
import java.util.List;
import xsna.s2x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class dfr0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dfr0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((gxj0) obj2).invoke(obj);
                break;
            case 1:
                VideoAlbumFragment videoAlbumFragment = (VideoAlbumFragment) obj2;
                int i2 = VideoAlbumFragment.i1;
                if (!(obj instanceof wxr0)) {
                    if (obj instanceof mxr0) {
                        mxr0 mxr0Var = (mxr0) obj;
                        VideoFile videoFile = mxr0Var.a;
                        UserId userId = mxr0Var.b;
                        List<Integer> list = mxr0Var.c;
                        List<Integer> list2 = mxr0Var.d;
                        if (userId.equals(videoAlbumFragment.O0)) {
                            if (list2.contains(Integer.valueOf(videoAlbumFragment.Z0))) {
                                videoAlbumFragment.Po(videoFile.o0(), videoFile.I0());
                            }
                            if (list.contains(Integer.valueOf(videoAlbumFragment.Z0))) {
                                videoAlbumFragment.Oo(videoFile);
                                break;
                            }
                        }
                    }
                } else {
                    VideoFile videoFile2 = ((wxr0) obj).a;
                    videoAlbumFragment.Po(videoFile2.o0(), videoFile2.I0());
                    break;
                }
                break;
            case 2:
                ((m4t0) obj2).invoke(obj);
                break;
            case 3:
                ((sxl0) obj2).invoke(obj);
                break;
            case 4:
                ((m4t0) obj2).invoke(obj);
                break;
            case 5:
                ((skj0) obj2).invoke(obj);
                break;
            case 6:
                ((skj0) obj2).invoke(obj);
                break;
            case 7:
                ((l6w0) obj2).invoke(obj);
                break;
            case 8:
                ((sxl0) obj2).invoke(obj);
                break;
            default:
                ((s2x0.a) obj2).invoke(obj);
                break;
        }
    }
}
