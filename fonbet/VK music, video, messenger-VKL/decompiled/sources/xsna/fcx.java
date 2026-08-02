package xsna;

import android.content.Context;
import xsna.tcx;

/* compiled from: InteractiveVideoFactoryImpl.kt */
/* loaded from: classes3.dex */
public final class fcx implements ecx {
    public final com.vk.video.kidsprofile.restricteduseractions.a a;

    public fcx(com.vk.video.kidsprofile.restricteduseractions.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.ecx
    public final rcx a(Context context, tcx tcxVar) {
        if (tcxVar instanceof tcx.a) {
            tcx.a aVar = (tcx.a) tcxVar;
            boolean z = aVar.a;
            boolean z2 = aVar.b;
            return (z || z2) ? new fvs(context, aVar.a, z2, aVar.c) : new evs(context);
        }
        boolean z3 = tcxVar instanceof tcx.b;
        com.vk.video.kidsprofile.restricteduseractions.a aVar2 = this.a;
        if (z3) {
            aVar2.getClass();
            tcx.b bVar = (tcx.b) tcxVar;
            return new whz(context, bVar.a, bVar.b);
        }
        if (!(tcxVar instanceof tcx.c)) {
            return new csm0(context);
        }
        aVar2.getClass();
        return new yr20(context, null);
    }
}
