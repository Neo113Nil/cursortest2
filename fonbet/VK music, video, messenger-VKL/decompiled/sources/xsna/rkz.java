package xsna;

import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.vk.attachpicker.fragment.gallery.PostingAttachGalleryFragment;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.k;
import com.vk.music.player.presentation.widgets.AudioPlayerWidget;
import com.vk.music.player.presentation.widgets.PlayerBigWidget;
import com.vk.voip.ui.broadcast.fragments.info.StreamInfoFragment;
import com.vkontakte.android.R;
import xsna.h2g0;
import xsna.i340;
import xsna.kg10;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class rkz implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rkz(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                com.vk.libvideo.live.impl.views.live.b bVar = (com.vk.libvideo.live.impl.views.live.b) obj2;
                bVar.J = false;
                bVar.B0();
                bVar.start();
                break;
            case 1:
                ((b1a) obj2).invoke(obj);
                break;
            case 2:
                com.vk.ecomm.reviews.impl.marketitem.replies.presentation.o oVar = (com.vk.ecomm.reviews.impl.marketitem.replies.presentation.o) obj2;
                oVar.e(new k.j(false));
                oVar.c(new h2g0.f(zwp.a((Throwable) obj)));
                break;
            case 3:
                ((kg10.a) obj2).invoke(obj);
                break;
            case 4:
                int i2 = MasksWrap.e0;
                ((gmj) obj2).invoke(obj);
                break;
            case 5:
                ((gmj) obj2).invoke(obj);
                break;
            case 6:
                ((i340.d.a) obj2).invoke(obj);
                break;
            case 7:
                ((os40) obj2).invoke(obj);
                break;
            case 8:
                ((gmj) obj2).invoke(obj);
                break;
            case 9:
                ((ept) obj2).invoke(obj);
                break;
            case 10:
                ((zw) obj2).invoke(obj);
                break;
            case 11:
                ((aj50) obj2).invoke(obj);
                break;
            case 12:
                ((jp5) obj2).invoke(obj);
                break;
            case 13:
                ((it8) obj2).invoke(obj);
                break;
            case 14:
                ((b1a) obj2).invoke(obj);
                break;
            case 15:
                RemoteViews remoteViews = (RemoteViews) obj2;
                remoteViews.setImageViewBitmap(R.id.w_player_cover, AudioPlayerWidget.g(PlayerBigWidget.c, PlayerBigWidget.d, (Bitmap) obj));
                remoteViews.setViewVisibility(R.id.w_player_cover, 0);
                remoteViews.setViewVisibility(R.id.w_player_placeholder, 8);
                break;
            case 16:
                ((yo20) obj2).invoke(obj);
                break;
            case 17:
                ((b1a) obj2).invoke(obj);
                break;
            case 18:
                int i3 = PostingAttachGalleryFragment.p0;
                ((aj50) obj2).invoke(obj);
                break;
            case 19:
                ((isc0) obj2).e((lsc0) obj);
                break;
            case 20:
                ((b1a) obj2).invoke(obj);
                break;
            case 21:
                ((it8) obj2).invoke(obj);
                break;
            case 22:
                ((aj50) obj2).invoke(obj);
                break;
            case 23:
                ((os40) obj2).invoke(obj);
                break;
            case 24:
                ((aj50) obj2).invoke(obj);
                break;
            case 25:
                ((d0w) obj2).invoke(obj);
                break;
            case 26:
                ((ept) obj2).invoke(obj);
                break;
            case 27:
                ((aj50) obj2).invoke(obj);
                break;
            case 28:
                int i4 = StreamInfoFragment.S;
                ((ujm0) obj2).invoke(obj);
                break;
            default:
                ((os40) obj2).invoke(obj);
                break;
        }
    }
}
