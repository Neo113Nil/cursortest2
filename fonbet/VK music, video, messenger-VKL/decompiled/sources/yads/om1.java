package yads;

import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* loaded from: classes10.dex */
public final class om1 {
    public final mm1 a;
    public final jq b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ om1(Context context) {
        this(r2, new jq(r2));
        mm1 a = new on2(context).a();
    }

    public final lm1 a(List list) {
        Iterator it = list.iterator();
        double d = -1.0d;
        lm1 lm1Var = null;
        while (it.hasNext()) {
            lm1 lm1Var2 = (lm1) it.next();
            double d2 = MimeTypes.VIDEO_MP4.equals(lm1Var2.d) ? 1.5d : 1.0d;
            jq jqVar = this.b;
            jqVar.getClass();
            int i = lm1Var2.i;
            if (i == 0) {
                int i2 = lm1Var2.h * lm1Var2.g;
                mm1 mm1Var = jqVar.a;
                i = (int) ((i2 / (mm1Var.a * mm1Var.b)) * mm1Var.c);
            }
            int i3 = this.a.c;
            double abs = d2 / ((((int) Math.max(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, i)) < 100 ? 10.0d : ((int) Math.abs(i3 - r9)) / i3) + 1.0d);
            if (abs > d) {
                lm1Var = lm1Var2;
                d = abs;
            }
        }
        return lm1Var;
    }

    public om1(mm1 mm1Var, jq jqVar) {
        this.a = mm1Var;
        this.b = jqVar;
    }
}
