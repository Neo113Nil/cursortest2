package xsna;

import android.app.Activity;
import android.os.Handler;
import kotlin.jvm.internal.Ref$ObjectRef;
import one.video.player.BaseVideoPlayer;
import xsna.f520;
import xsna.hzf0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class fzf0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ fzf0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                hzf0 hzf0Var = (hzf0) obj5;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj4;
                Handler handler = (Handler) obj3;
                hzf0.a aVar = (hzf0.a) obj2;
                BaseVideoPlayer baseVideoPlayer = (BaseVideoPlayer) obj;
                m0g0 m0g0Var = hzf0Var.f;
                m0g0 m0g0Var2 = m0g0Var == null ? null : m0g0Var;
                p1t p1tVar = hzf0Var.g;
                dzf0 dzf0Var = new dzf0(m0g0Var2, p1tVar == null ? null : p1tVar, hzf0Var.getLooper(), new uzc0(ref$ObjectRef, 1), new com.vk.catalog2.common.ui.holders.a(25, handler, aVar), new k22(19, handler, aVar));
                hzf0Var.h.put(baseVideoPlayer, dzf0Var);
                hzf0Var.i.add(dzf0Var.h);
                dzf0Var.h.b();
                handler.post(new w3t(2, aVar, ref$ObjectRef));
                break;
            default:
                w6s0 w6s0Var = (w6s0) obj5;
                e520 e520Var = (e520) obj4;
                Activity activity = (Activity) obj3;
                gzs<s3q0> gzsVar = (gzs) obj2;
                wh50 wh50Var = (wh50) obj;
                boolean z = e520Var.n instanceof f520.a;
                boolean R0 = fxc0.B().J().R0();
                if (z && R0) {
                    wh50Var.setValue(Boolean.TRUE);
                    s3q0 s3q0Var = s3q0.a;
                }
                h6s0 U = w6s0.e.U(e520Var);
                boolean z2 = (U == null || U.d(e520Var)) ? false : true;
                boolean z3 = e520Var.n instanceof f520.a;
                boolean R02 = fxc0.B().J().R0();
                if (z3 && R02) {
                    wh50Var.setValue(Boolean.TRUE);
                    s3q0 s3q0Var2 = s3q0.a;
                    w6s0Var.d(e520Var, activity, gzsVar);
                } else if (z2) {
                    w6s0Var.d(e520Var, activity, null);
                } else {
                    w6s0Var.d(e520Var, activity, null);
                    gzsVar.invoke();
                }
                break;
        }
        return s3q0.a;
    }
}
