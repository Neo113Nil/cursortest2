package xsna;

import android.content.Context;
import com.vk.libvideo.models.history.ForceLogReason;
import xsna.fbr0;

/* compiled from: VKCastManager.kt */
/* loaded from: classes2.dex */
public final class gbr0 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ fbr0 b;

    public gbr0(Context context, fbr0 fbr0Var) {
        this.a = context;
        this.b = fbr0Var;
    }

    public final void a() {
        fbr0 fbr0Var = this.b;
        fbr0.a aVar = fbr0Var.e;
        if (aVar != null) {
            yg5 yg5Var = aVar.a;
            Long l = aVar.c;
            if (l != null) {
                yg5Var.seek(l.longValue());
            }
            yg5Var.x0(ForceLogReason.SEEK);
            xbc xbcVar = fbr0Var.c;
            if (xbcVar != null) {
                xbcVar.i.remove(aVar);
            }
        }
        fbr0Var.e = null;
    }
}
