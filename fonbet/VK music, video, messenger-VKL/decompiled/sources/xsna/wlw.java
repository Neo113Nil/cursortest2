package xsna;

import android.content.Context;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.tags.Tag;
import com.vk.dto.video.VideoListWithTotalCount;
import com.vk.metrics.performance.thermal.DeviceThermalStatusChecker;
import xsna.r070;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class wlw implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wlw(int i, z8u0 z8u0Var) {
        this.b = 6;
        this.c = i;
        this.d = z8u0Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                break;
            case 1:
                ((dv60) this.d).a(new r070.j.b(this.c));
                break;
            case 2:
                String str = (String) obj;
                mma0 mma0Var = ((nma0) this.d).e;
                Context mo2getContext = mma0Var.mo2getContext();
                if (mo2getContext != null) {
                    TextView textView = mma0Var.p;
                    if (textView == null) {
                        textView = null;
                    }
                    f4m.j(textView);
                    TextView textView2 = mma0Var.o;
                    if (textView2 == null) {
                        textView2 = null;
                    }
                    textView2.setText(mo2getContext.getString(this.c, str));
                    TextView textView3 = mma0Var.o;
                    d3m.c(textView3 == null ? null : textView3, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                break;
            case 3:
                final DeviceThermalStatusChecker deviceThermalStatusChecker = (DeviceThermalStatusChecker) this.d;
                final int i = this.c;
                break;
            case 4:
                ram0 ram0Var = (ram0) this.d;
                ((ikv0) obj).a();
                ram0Var.a.a(this.c);
                break;
            case 5:
                VideoListWithTotalCount videoListWithTotalCount = (VideoListWithTotalCount) obj;
                ((n6) this.d).invoke(new rbt0(this.c, 50, videoListWithTotalCount.c, 48, com.vk.video.ui.discovery.minimizable.related_videos.d.b(videoListWithTotalCount.b)));
                break;
            default:
                z8u0 z8u0Var = (z8u0) this.d;
                Tag tag = (Tag) obj;
                d390 d390Var = z8u0Var.x;
                if (d390Var != null) {
                    int currentPosition = d390Var.getCurrentPosition();
                    int i2 = this.c;
                    if (i2 == currentPosition) {
                        z8u0Var.A.e(tag, z8u0Var.T(i2));
                    }
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ wlw(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    public /* synthetic */ wlw(n6 n6Var, com.vk.video.ui.discovery.minimizable.related_videos.d dVar, int i) {
        this.b = 5;
        this.d = n6Var;
        this.c = i;
    }
}
