package xsna;

import android.content.Context;
import android.util.Size;
import android.view.View;
import com.vk.catalog2.common.ui.mvp.video.VideoCatalogAlbumBottomSheet;
import com.vk.dto.photo.Photo;
import com.vk.dto.video.VideoAlbum;
import com.vk.im.mediascope.MediaScopeCommand;
import com.vk.libvideo.api.onboarding.Onboarding;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import xsna.ikv0;
import xsna.v6w;
import xsna.vx10;
import xsna.z8u0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b7w implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b7w(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                d7w d7wVar = (d7w) obj;
                v6w.c.a aVar = (v6w.c.a) ((v6w.c) obj2);
                if (aVar.d) {
                    d7wVar.l.c().b(aVar.b);
                    return;
                }
                return;
            case 1:
                zx10 zx10Var = (zx10) obj2;
                wy2 wy2Var = zx10Var.a;
                vx10 vx10Var = zx10Var.b;
                StringBuilder sb = new StringBuilder("https://");
                sb.append(vx10Var.a.h());
                int i2 = vx10.a.$EnumSwitchMapping$0[((MediaScopeCommand) obj).ordinal()];
                int i3 = 3;
                if (i2 != 1) {
                    if (i2 == 2) {
                        i3 = 4;
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i3 = 5;
                    }
                }
                sb.append(i3);
                sb.append(vx10Var.b);
                wy2Var.p(new tkv(h5s.c(vx10Var.c, "1.ms.vk.com", sb), false, 4));
                return;
            case 2:
                Photo photo = (Photo) obj2;
                x0o0 x0o0Var = (x0o0) obj;
                photo.r = !photo.x.isEmpty();
                photo.l = false;
                x0o0Var.b.invoke(photo);
                Photo photo2 = x0o0Var.l;
                if (photo2 == null || photo2.c != photo.c) {
                    return;
                }
                z8u0.d dVar = x0o0Var.j;
                if (dVar != null) {
                    dVar.a(new PhotoAttachment(photo));
                }
                d390 d390Var = x0o0Var.k;
                if (d390Var != null) {
                    d390Var.k(photo.x, false);
                    return;
                }
                return;
            default:
                View view = (View) obj2;
                VideoAlbum videoAlbum = (VideoAlbum) obj;
                view.getContext();
                boolean z = videoAlbum.l;
                videoAlbum.l = !z;
                if (z) {
                    wjs0.a(new jwr0(videoAlbum, "albums_unsubscribe"));
                } else {
                    wjs0.a(new jwr0(videoAlbum, "albums_subscribe"));
                    if (VideoCatalogAlbumBottomSheet.a.i != null) {
                        Onboarding onboarding = Onboarding.TwoStep;
                    }
                }
                Context context = view.getContext();
                ikv0.a aVar2 = new ikv0.a(context);
                float f = 28;
                aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_minus_square_outline_28, Integer.valueOf(R.attr.vk_ui_icon_accent_themed), new Size(iah0.a(f), iah0.a(f)), 8);
                aVar2.u = new ikv0.d(context.getString(R.string.community_unsubscribed), (String) null, (ikv0.d.a) null, 6);
                aVar2.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(R.string.cancel), new c1o0(6, context, videoAlbum));
                aVar2.o = Integer.valueOf(iah0.a(8));
                pkv0.f(aVar2);
                return;
        }
    }
}
