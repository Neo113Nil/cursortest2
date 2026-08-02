package xsna;

import android.content.Context;
import android.view.View;
import com.vk.dto.common.VideoFile;
import com.vkontakte.android.R;
import xsna.av20;
import xsna.ro90;

/* compiled from: PastBroadcastsBottomSheet.kt */
/* loaded from: classes7.dex */
public final class vn90 implements av20.b<e520> {
    public final /* synthetic */ wn90 a;
    public final /* synthetic */ Context b;

    public vn90(wn90 wn90Var, Context context) {
        this.a = wn90Var;
        this.b = context;
    }

    @Override // xsna.av20.b
    public final void a(View view, Object obj, int i, wmg wmgVar) {
        wn90 wn90Var = this.a;
        VideoFile videoFile = wn90Var.d;
        int i2 = ((e520) obj).a;
        Context context = this.b;
        if (i2 == R.id.action_edit) {
            fxc0.B().S(context, videoFile);
        } else if (i2 == R.id.action_remove) {
            wn90Var.e.a(new ro90.d(videoFile));
        } else if (i2 == R.id.action_share) {
            kbj0.u(nr4.b(), context, wn90Var.d, false, false, null, null, 60);
        }
        wn90Var.b(view);
    }
}
