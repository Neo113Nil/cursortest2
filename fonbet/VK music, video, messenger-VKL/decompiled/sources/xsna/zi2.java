package xsna;

import android.app.Activity;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.CommonUploadParams;

/* compiled from: AnimatedDrawable2.kt */
/* loaded from: classes12.dex */
public final class zi2 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zi2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                aj2 aj2Var = (aj2) this.c;
                aj2Var.unscheduleSelf(this);
                aj2Var.invalidateSelf();
                break;
            case 1:
                u440 u440Var = (u440) this.c;
                m5p m5pVar = u440Var.D;
                CommonUploadParams commonUploadParams = u440Var.d;
                boolean f = epx.f(commonUploadParams.e, UserId.d);
                boolean z = u440Var.v.size() > 1;
                boolean j7 = k86.j7(u440Var, commonUploadParams.e);
                boolean d = u440Var.o.r.b.d();
                Activity h = e3m.h(m5pVar.b.getRequireContext());
                if (h != null && !m5pVar.c(f, z, d) && !m5pVar.d(h, j7)) {
                    m5pVar.e();
                    break;
                }
                break;
            default:
                yh01 yh01Var = ((xh01) this.c).d;
                yh01Var.g = null;
                yh01Var.u();
                break;
        }
    }
}
