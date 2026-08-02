package xsna;

import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.music.player.presentation.widgets.AudioPlayerWidget;
import com.vk.music.player.presentation.widgets.PlayerSmallWidget;
import com.vk.voip.ui.broadcast.fragments.info.StreamInfoFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import java.util.List;
import kotlin.Pair;
import ru.ok.android.webrtc.media_settings.MediaSettingsSender;
import ru.ok.android.webrtc.signaling.media_settings.SignalingMediaSettings;
import xsna.dra0;
import xsna.oml0;
import xsna.qb20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class bdz implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bdz(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((wzf) obj2).invoke(obj);
                break;
            case 1:
                ((td5) obj2).invoke(obj);
                break;
            case 2:
                int i2 = MasksWrap.e0;
                ((wzf) obj2).invoke(obj);
                break;
            case 3:
                ((nz10) obj2).invoke(obj);
                break;
            case 4:
                ((d220) obj2).invoke(obj);
                break;
            case 5:
                ((qb20.b) obj2).invoke(obj);
                break;
            case 6:
                ((kp5) obj2).invoke(obj);
                break;
            case 7:
                ((h630) obj2).invoke(obj);
                break;
            case 8:
                ((h630) obj2).invoke(obj);
                break;
            case 9:
                ((kp5) obj2).invoke(obj);
                break;
            case 10:
                ((h630) obj2).invoke(obj);
                break;
            case 11:
                ((h630) obj2).invoke(obj);
                break;
            case 12:
                ((evg) obj2).invoke(obj);
                break;
            case 13:
                ((h630) obj2).invoke(obj);
                break;
            case 14:
                ((h630) obj2).invoke(obj);
                break;
            case 15:
                ((dra0.e) obj2).invoke(obj);
                break;
            case 16:
                RemoteViews remoteViews = (RemoteViews) obj2;
                Bitmap bitmap = (Bitmap) obj;
                io.reactivex.rxjava3.disposables.c cVar = PlayerSmallWidget.b;
                remoteViews.setImageViewBitmap(R.id.w_player_cover, AudioPlayerWidget.g(bitmap.getWidth(), bitmap.getHeight(), bitmap));
                remoteViews.setViewVisibility(R.id.w_player_cover, 0);
                remoteViews.setViewVisibility(R.id.w_player_cover_placeholder, 8);
                break;
            case 17:
                ((kp5) obj2).invoke(obj);
                break;
            case 18:
                ((izs) obj2).invoke(obj);
                break;
            case 19:
                ((h630) obj2).invoke(obj);
                break;
            case 20:
                int i3 = SettingsGeneralFragment.z0;
                u1u0.b((com.vk.core.view.components.spinner.c) obj2);
                break;
            case 21:
                ((mga0) obj2).invoke(obj);
                break;
            case 22:
                Pair pair = (Pair) obj;
                ((fpl0) obj2).e(new oml0.p((List) pair.d(), (w4p0) pair.g()));
                break;
            case 23:
                ((jbo) obj2).invoke(obj);
                break;
            case 24:
                int i4 = StreamInfoFragment.S;
                ((svk0) obj2).invoke(obj);
                break;
            case 25:
                ((MediaSettingsSender) obj2).send((SignalingMediaSettings) obj);
                break;
            case 26:
                ((svk0) obj2).invoke(obj);
                break;
            case 27:
                ((svk0) obj2).invoke(obj);
                break;
            case 28:
                ((svk0) obj2).invoke(obj);
                break;
            default:
                ((pba) obj2).invoke(obj);
                break;
        }
    }
}
