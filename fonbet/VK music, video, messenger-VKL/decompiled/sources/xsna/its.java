package xsna;

import android.content.Context;
import android.view.View;
import com.vk.catalog2.common.ui.mvp.video.VideoPlaylistPlaceHolder;
import com.vk.dto.video.VideoAlbum;
import com.vk.friends.impl.friends.presentation.fragment.FriendsSelectionFragment;
import com.vk.libvideo.bottomsheet.VideoPlaylistBottomSheet;
import com.vk.libvideo.bottomsheet.videoplaylist.VideoPlaylistBottomSheetRedesign;
import com.vk.video.ui.share.api.VideoShareComponent;
import kotlin.Lazy;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.u4a;

/* compiled from: FriendsSelectionFragment.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class its extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ its(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Context context;
        VideoShareComponent value;
        VideoShareComponent value2;
        switch (this.b) {
            case 0:
                FriendsSelectionFragment friendsSelectionFragment = (FriendsSelectionFragment) this.receiver;
                int i = FriendsSelectionFragment.w0;
                friendsSelectionFragment.to();
                break;
            case 1:
                ((hpb0) this.receiver).t();
                break;
            case 2:
                VideoPlaylistPlaceHolder videoPlaylistPlaceHolder = (VideoPlaylistPlaceHolder) this.receiver;
                u4a.a aVar = videoPlaylistPlaceHolder.v;
                View view = videoPlaylistPlaceHolder.y;
                if (view != null && (context = view.getContext()) != null) {
                    com.vk.video.ui.share.api.b bVar = null;
                    if (((Boolean) videoPlaylistPlaceHolder.w.getValue()).booleanValue()) {
                        VideoAlbum videoAlbum = videoPlaylistPlaceHolder.t;
                        b8j0 b8j0Var = new b8j0(videoPlaylistPlaceHolder, 17);
                        aVar.getClass();
                        Lazy<VideoShareComponent> lazy = aVar.S;
                        if (lazy != null && (value2 = lazy.getValue()) != null) {
                            bVar = value2.S();
                        }
                        new VideoPlaylistBottomSheetRedesign(new VideoPlaylistBottomSheetRedesign.a(videoAlbum, b8j0Var, (fh1) null, bVar, 4)).c(e3m.h(context));
                    } else {
                        VideoAlbum videoAlbum2 = videoPlaylistPlaceHolder.t;
                        e9i0 e9i0Var = new e9i0(videoPlaylistPlaceHolder, 23);
                        aVar.getClass();
                        Lazy<VideoShareComponent> lazy2 = aVar.S;
                        new VideoPlaylistBottomSheet(context, videoAlbum2, e9i0Var, (du0) null, (lazy2 == null || (value = lazy2.getValue()) == null) ? null : value.S(), 8).c();
                    }
                }
                break;
            default:
                e5w0 e5w0Var = (e5w0) this.receiver;
                ((nhe0) e5w0Var.h.getValue()).e();
                ((ip9) e5w0Var.i.getValue()).a();
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public its(e5w0 e5w0Var) {
        super(0, e5w0Var, e5w0.class, "onStopPushService", "onStopPushService()V", 0);
        this.b = 3;
    }
}
