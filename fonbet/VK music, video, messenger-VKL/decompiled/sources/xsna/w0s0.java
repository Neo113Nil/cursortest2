package xsna;

import android.app.Activity;
import android.content.Context;
import android.util.Size;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.video.VideoAlbum;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashSet;
import xsna.ikv0;

/* compiled from: VideoAlbumCreatedSnackBar.kt */
/* loaded from: classes7.dex */
public final class w0s0 {
    public final Context a;

    /* compiled from: VideoAlbumCreatedSnackBar.kt */
    public static final class a implements dcn {
        public final /* synthetic */ ikv0 b;

        public a(ikv0 ikv0Var) {
            this.b = ikv0Var;
        }

        @Override // xsna.dcn
        public final void dismiss() {
            this.b.a();
        }
    }

    public w0s0(FragmentActivity fragmentActivity) {
        this.a = fragmentActivity;
    }

    public final void a(VideoAlbum videoAlbum) {
        Context context = this.a;
        Activity h = e3m.h(context);
        if (h == null) {
            return;
        }
        ikv0.a aVar = new ikv0.a(context);
        aVar.h = new l850(videoAlbum, 29);
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_on_24, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) null, 12);
        aVar.u = new ikv0.d(context.getString(R.string.video_playlist_created), (String) null, (ikv0.d.a) null);
        aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(R.string.video_go_to_created_playlist), new v0s0(0, h, videoAlbum));
        HashSet hashSet = iah0.a;
        if (fnj.d(context)) {
            aVar.k = 1;
            aVar.g(1);
        }
        ikv0 b = aVar.b();
        b.c();
        fxc0.B().G(videoAlbum.zb(), new a(b));
    }
}
