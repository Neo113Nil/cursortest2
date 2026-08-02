package xsna;

import android.widget.RemoteViews;
import com.vk.attachpicker.stickers.post.attach.StoryAttachImageView;
import com.vk.catalog2.feature.music.holders.MusicTrackCellVh;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.im.ui.fragments.ImCreateChatFastFragment;
import com.vk.music.player.presentation.widgets.PlayerSmallWidget;
import com.vkontakte.android.R;
import java.util.List;
import java.util.Set;
import xsna.oml0;
import xsna.qb20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class fsq implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fsq(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((y90) obj2).invoke(obj);
                break;
            case 1:
                ((udo) obj2).invoke(obj);
                break;
            case 2:
                ((udo) obj2).invoke(obj);
                break;
            case 3:
                ((udo) obj2).invoke(obj);
                break;
            case 4:
                qcy<Object>[] qcyVarArr = GoodFragment.U0;
                ((udo) obj2).invoke(obj);
                break;
            case 5:
                int i2 = ImCreateChatFastFragment.y0;
                ((udo) obj2).invoke(obj);
                break;
            case 6:
                ((com.vk.libvideo.live.impl.views.live.b) obj2).a();
                break;
            case 7:
                ((qb20.c) obj2).invoke(obj);
                break;
            case 8:
                ((udo) obj2).invoke(obj);
                break;
            case 9:
                ((ba40) obj2).invoke(obj);
                break;
            case 10:
                ((ba40) obj2).invoke(obj);
                break;
            case 11:
                Set<String> set = MusicTrackCellVh.A;
                ((ra50) obj2).invoke(obj);
                break;
            case 12:
                ((dmf) obj2).invoke(obj);
                break;
            case 13:
                ((ba40) obj2).invoke(obj);
                break;
            case 14:
                ((rh4) obj2).invoke(obj);
                break;
            case 15:
                ((x6a0) obj2).y0();
                break;
            case 16:
                ((jjx) obj2).invoke(obj);
                break;
            case 17:
                ((d4r) obj2).invoke(obj);
                break;
            case 18:
                ((ba40) obj2).invoke(obj);
                break;
            case 19:
                RemoteViews remoteViews = (RemoteViews) obj2;
                io.reactivex.rxjava3.disposables.c cVar = PlayerSmallWidget.b;
                remoteViews.setViewVisibility(R.id.w_player_cover, 8);
                remoteViews.setViewVisibility(R.id.w_player_cover_placeholder, 0);
                break;
            case 20:
                ((ba40) obj2).invoke(obj);
                break;
            case 21:
                ((d4r) obj2).invoke(obj);
                break;
            case 22:
                ((dxd0) obj2).invoke(obj);
                break;
            case 23:
                ((rh4) obj2).invoke(obj);
                break;
            case 24:
                ((ba40) obj2).invoke(obj);
                break;
            case 25:
                ((pf0) obj2).invoke(obj);
                break;
            case 26:
                ((l14) obj2).invoke(obj);
                break;
            case 27:
                ((fpl0) obj2).e(new oml0.b((List) obj));
                break;
            case 28:
                ((ee8) obj2).invoke(obj);
                break;
            default:
                int i3 = StoryAttachImageView.t;
                ((ptl0) obj2).invoke(obj);
                break;
        }
    }
}
