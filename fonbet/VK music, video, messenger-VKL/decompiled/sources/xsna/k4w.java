package xsna;

import android.os.Parcelable;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.music.Playlist;
import com.vk.im.ui.views.BlurredFrameLayout;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class k4w implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Parcelable d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializer.StreamParcelableAdapter f;

    public /* synthetic */ k4w(Object obj, Parcelable parcelable, Object obj2, Serializer.StreamParcelableAdapter streamParcelableAdapter, int i) {
        this.b = i;
        this.c = obj;
        this.d = parcelable;
        this.e = obj2;
        this.f = streamParcelableAdapter;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                l4w l4wVar = (l4w) this.c;
                ImageList imageList = (ImageList) this.d;
                ImageList imageList2 = (ImageList) this.e;
                ImageList imageList3 = (ImageList) this.f;
                VKEnhancedImageView vKEnhancedImageView = l4wVar.s;
                if (vKEnhancedImageView == null) {
                    vKEnhancedImageView = null;
                }
                vKEnhancedImageView.setLocalImage(imageList);
                VKEnhancedImageView vKEnhancedImageView2 = l4wVar.s;
                if (vKEnhancedImageView2 == null) {
                    vKEnhancedImageView2 = null;
                }
                vKEnhancedImageView2.setRemoteImage(imageList2);
                VKEnhancedImageView vKEnhancedImageView3 = l4wVar.s;
                if (vKEnhancedImageView3 == null) {
                    vKEnhancedImageView3 = null;
                }
                ek30 ek30Var = l4wVar.z;
                if (ek30Var == null) {
                    ek30Var = null;
                }
                vKEnhancedImageView3.setPlaceholder(ek30Var);
                BlurredFrameLayout blurredFrameLayout = l4wVar.v;
                BlurredFrameLayout blurredFrameLayout2 = blurredFrameLayout != null ? blurredFrameLayout : null;
                String Fb = imageList3.Fb();
                if (!epx.f(blurredFrameLayout2.g, Fb)) {
                    blurredFrameLayout2.g = Fb;
                    blurredFrameLayout2.h = true;
                }
                return s3q0.a;
            default:
                ubb0 ubb0Var = (ubb0) this.c;
                UserId userId = (UserId) this.d;
                String str = (String) this.e;
                Playlist playlist = (Playlist) this.f;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "uid=" + userId.b + " query pid=" + playlist.Ib()});
                }
                return ubb0Var.c.f(String.valueOf(userId.b), str);
        }
    }
}
