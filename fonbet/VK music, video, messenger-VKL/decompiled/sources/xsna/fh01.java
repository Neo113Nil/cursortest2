package xsna;

import android.os.Looper;
import com.google.android.gms.cast.framework.media.widget.ExpandedControllerActivity;
import com.google.android.gms.internal.cast.zzfk;
import java.util.TimerTask;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class fh01 extends TimerTask {
    public final /* synthetic */ lvf0 b;
    public final /* synthetic */ ExpandedControllerActivity c;

    public fh01(ExpandedControllerActivity expandedControllerActivity, lvf0 lvf0Var) {
        this.b = lvf0Var;
        this.c = expandedControllerActivity;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        new zzfk(Looper.getMainLooper()).post(new ma01(1, this, this.b));
    }
}
