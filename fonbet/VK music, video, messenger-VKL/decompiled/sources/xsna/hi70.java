package xsna;

import android.location.Location;
import android.view.View;
import com.vk.common.links.AwayLink;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.notifications.NotificationItem;
import com.vk.video.ui.discovery.catalog.b;
import com.vk.vmoji.character.model.RecommendationsBlockModel;
import com.vk.voip.ui.picture_in_picture.overlay.PictureInPictureOverlayService;
import com.vk.voip.ui.sessionrooms.dialog.model.a;
import java.lang.ref.WeakReference;
import java.util.List;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.d9l0;
import xsna.kzw0;
import xsna.qjc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class hi70 implements qjc.a, io.reactivex.rxjava3.functions.l, m6o, i0u0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hi70(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.qjc.a
    public void I(AwayLink awayLink) {
        c970 c970Var = ((li70) this.c).N;
        if (c970Var != null) {
            c970Var.e();
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                return (List) ((u9e) obj2).invoke(obj);
            case 2:
                int i2 = PictureInPictureOverlayService.g;
                return (Boolean) ((qi00) obj2).invoke(obj);
            case 3:
            case 9:
            default:
                return (jlx0) ((ixu0) obj2).invoke(obj);
            case 4:
                return (a.b) ((uw9) obj2).invoke(obj);
            case 5:
                return (io.reactivex.rxjava3.core.t) ((acc0) obj2).invoke(obj);
            case 6:
                return (hda) ((d9l0.a) obj2).invoke(obj);
            case 7:
                return (io.reactivex.rxjava3.core.b0) ((t810) obj2).invoke(obj);
            case 8:
                return (io.reactivex.rxjava3.core.b0) ((gqe0) obj2).invoke(obj);
            case 10:
                return (Location) ((wql0) obj2).invoke(obj);
            case 11:
                return (b.a) ((rfs0) obj2).invoke(obj);
            case 12:
                return (Boolean) ((t810) obj2).invoke(obj);
            case 13:
                return (String) ((t810) obj2).invoke(obj);
            case 14:
                return (io.reactivex.rxjava3.core.t) ((g5h) obj2).invoke(obj);
            case 15:
                return (RecommendationsBlockModel) ((t810) obj2).invoke(obj);
            case 16:
                return (kzw0.c.b) ((qvm0) obj2).invoke(obj);
            case 17:
                return (Boolean) ((ixu0) obj2).invoke(obj);
            case 18:
                return (SessionRoomId) ((wvw0) obj2).invoke(obj);
            case 19:
                return (Post) ((ixu0) obj2).invoke(obj);
            case 20:
                return (ygn0) ((qvm0) obj2).invoke(obj);
        }
    }

    @Override // xsna.m6o
    public double b(double d) {
        pjp0 pjp0Var = (pjp0) this.c;
        float[] fArr = h8g.a;
        return h8g.a(pjp0Var, d);
    }

    @Override // xsna.i0u0
    public View get() {
        return (View) ((WeakReference) this.c).get();
    }

    public /* synthetic */ hi70(li70 li70Var, NotificationItem notificationItem) {
        this.b = 0;
        this.c = li70Var;
    }
}
