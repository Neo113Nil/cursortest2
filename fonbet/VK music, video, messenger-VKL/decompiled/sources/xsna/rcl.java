package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.video.profile.presentation.f;
import xsna.amw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class rcl implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rcl(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((scl) this.c).k = false;
                break;
            case 1:
                apq apqVar = (apq) this.c;
                if (((kpq) apqVar.b.getCurrentState()).b == null) {
                    apqVar.s().w().g(apqVar.k);
                }
                apqVar.s().w().g(apqVar.j);
                break;
            case 2:
                u440 u440Var = (u440) this.c;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"MultiStory", "doShare completed"});
                }
                ((g440) u440Var.s).getAnimationStickerManager().a(true);
                u440Var.A = false;
                break;
            case 3:
                ((h9t0) this.c).e.invoke(f.h.C1962h.b);
                break;
            default:
                ((vlw0) this.c).T(new amw0.b.C2554b(false));
                break;
        }
    }
}
