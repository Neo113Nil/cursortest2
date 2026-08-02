package xsna;

import android.widget.RemoteViews;
import com.vk.catalog2.feature.music.holders.MusicTrackCellVh;
import com.vk.music.player.presentation.widgets.PlayerBigWidget;
import com.vkontakte.android.R;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class cl30 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cl30(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((cvg) obj2).invoke(obj);
                break;
            case 1:
                ((he3) obj2).invoke(obj);
                break;
            case 2:
                Set<String> set = MusicTrackCellVh.A;
                ((yd6) obj2).invoke(obj);
                break;
            case 3:
                ((hxl) obj2).invoke(obj);
                break;
            case 4:
                ((cvg) obj2).invoke(obj);
                break;
            case 5:
                ((aj50) obj2).invoke(obj);
                break;
            case 6:
                RemoteViews remoteViews = (RemoteViews) obj2;
                io.reactivex.rxjava3.disposables.c cVar = PlayerBigWidget.b;
                remoteViews.setViewVisibility(R.id.w_player_cover, 8);
                remoteViews.setViewVisibility(R.id.w_player_placeholder, 0);
                break;
            case 7:
                ((hxl) obj2).invoke(obj);
                break;
            case 8:
                ((arb0) obj2).invoke(obj);
                break;
            case 9:
                ((guc0) obj2).invoke(obj);
                break;
            case 10:
                ((arb0) obj2).invoke(obj);
                break;
            case 11:
                ((arb0) obj2).invoke(obj);
                break;
            case 12:
                ((arb0) obj2).invoke(obj);
                break;
            case 13:
                ((arb0) obj2).invoke(obj);
                break;
            case 14:
                ((arb0) obj2).invoke(obj);
                break;
            case 15:
                ((arb0) obj2).invoke(obj);
                break;
            case 16:
                ((arb0) obj2).invoke(obj);
                break;
            case 17:
                ((arb0) obj2).invoke(obj);
                break;
            case 18:
                ((rtq0) obj2).invoke(obj);
                break;
            case 19:
                ((gsq0) obj2).invoke(obj);
                break;
            case 20:
                ((wmc) obj2).invoke(obj);
                break;
            case 21:
                ((qit0) obj2).invoke(obj);
                break;
            case 22:
                ((ujm0) obj2).invoke(obj);
                break;
            default:
                ((qit0) obj2).invoke(obj);
                break;
        }
    }
}
