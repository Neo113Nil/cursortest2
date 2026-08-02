package xsna;

import android.os.Build;
import com.vk.dto.common.VideoFile;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.el50;
import xsna.ln50;
import xsna.nps0;
import xsna.rps0;
import xsna.t3s0;

/* compiled from: VideoHolderActor.kt */
/* loaded from: classes7.dex */
public final class qps0 extends bl50<ups0, nps0, on50, bwj, dwj, rps0> {
    public final t3s0.a c;
    public final sj50<ups0, on50, ll50<on50, bwj, dwj>, jl50<ups0>, rps0> d;
    public final Object e;
    public VideoFile f;

    public qps0(t3s0.a aVar, sj50 sj50Var) {
        super(sj50Var);
        this.c = aVar;
        this.d = sj50Var;
        this.e = msy.a(LazyThreadSafetyMode.NONE, new sqf0(11));
    }

    @Override // xsna.bl50, xsna.qj50
    public final sj50<ups0, on50, ll50<on50, bwj, dwj>, jl50<ups0>, rps0> W() {
        return this.d;
    }

    public final void m(boolean z) {
        VideoFile videoFile = this.f;
        if (videoFile != null) {
            el50.a.a(this, new rn50("subscribe_on_live_" + videoFile.o0()), ln50.a.c, new am6(videoFile, this, z));
        }
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        Boolean P8;
        nps0 nps0Var = (nps0) lj50Var;
        if (nps0Var instanceof nps0.b) {
            if (!o25.a().b()) {
                o25.a().getClass();
                return;
            }
            VideoFile videoFile = this.f;
            if ((videoFile == null || (P8 = videoFile.P8()) == null) ? false : P8.booleanValue()) {
                m(true);
                return;
            } else if (Build.VERSION.SDK_INT >= 33) {
                c(rps0.a.a);
                return;
            } else {
                m(true);
                return;
            }
        }
        if (nps0Var instanceof nps0.c) {
            m(((nps0.c) nps0Var).b);
            return;
        }
        if (!(nps0Var instanceof nps0.a)) {
            throw new NoWhenBranchMatchedException();
        }
        final VideoFile videoFile2 = ((nps0.a) nps0Var).b;
        this.f = videoFile2;
        final boolean x0 = videoFile2.x0();
        final boolean z0 = videoFile2.z0();
        String str = null;
        final Integer valueOf = x0 ? Integer.valueOf(R.drawable.bg_video_live_rounded) : z0 ? Integer.valueOf(R.drawable.video_zoom_info_old) : null;
        if (z0) {
            long Na = videoFile2.Na();
            int i = (int) Na;
            str = Na < ((long) pvo0.a()) ? this.c.a.getString(R.string.video_live_upcoming) : pvo0.g(i) ? pvo0.l(i) : pvo0.h(i, StringUtils.COMMA, true, true, false, true, true, true, false);
        }
        final String str2 = str;
        rdi.y(this, new izs() { // from class: xsna.ops0
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                VideoFile videoFile3 = VideoFile.this;
                int o0 = videoFile3.o0();
                qps0 qps0Var = this;
                xjz q = qps0Var.q(videoFile3);
                boolean booleanValue = ((Boolean) qps0Var.e.getValue()).booleanValue();
                boolean z = z0;
                return new ups0(Integer.valueOf(o0), q, z, booleanValue && z, x0, valueOf, str2, Integer.valueOf(videoFile3.getDuration() * 1000));
            }
        });
    }

    public final xjz q(VideoFile videoFile) {
        Pair pair = videoFile.z0() ? epx.f(videoFile.P8(), Boolean.TRUE) ? new Pair(Integer.valueOf(R.string.video_will_notify_about_start), Integer.valueOf(R.drawable.vk_icon_done_28)) : new Pair(Integer.valueOf(R.string.video_notify_about_start), Integer.valueOf(R.drawable.vk_icon_notification_28)) : new Pair(null, null);
        Integer num = (Integer) pair.d();
        return new xjz(num != null ? this.c.a.getString(num.intValue()) : null, (Integer) pair.g(), epx.f(videoFile.P8(), Boolean.TRUE));
    }
}
