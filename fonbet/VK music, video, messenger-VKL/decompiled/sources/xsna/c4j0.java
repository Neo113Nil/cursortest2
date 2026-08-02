package xsna;

import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.bridges.di.ImBridgeComponent;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.log.L;
import com.vk.toggle.b;
import com.vk.toggle.features.CoreFeatures;
import com.vkontakte.android.VKApplication;
import kotlin.LazyThreadSafetyMode;
import org.json.JSONObject;
import xsna.b25;
import xsna.lrv0;

/* compiled from: SetupOverlayMenuTaskLogic.kt */
/* loaded from: classes11.dex */
public final class c4j0 extends ParallelTaskRunner.a {
    public final Object d;
    public final Object e;

    public c4j0(VKApplication vKApplication, jbw jbwVar) {
        super(vKApplication, jbwVar);
        b67 b67Var = new b67(this, 8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d = msy.a(lazyThreadSafetyMode, b67Var);
        this.e = msy.a(lazyThreadSafetyMode, new jhg(this, 7));
    }

    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "SetupOverlayMenuTaskLogic";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final w290 d() {
        return (w290) this.e.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean e() {
        if (!((b25) this.d.getValue()).b() || !q6r0.f().B()) {
            return false;
        }
        o2l.a.getClass();
        return o2l.e();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final s3q0 invoke() {
        JSONObject g;
        String optString;
        if (e()) {
            com.vk.toggle.b bVar = com.vk.toggle.b.A;
            CoreFeatures coreFeatures = CoreFeatures.OVERLAY_MENU;
            if (bVar.i(coreFeatures) == null || !p1p0.a(bVar.i(coreFeatures))) {
                L.e("SetupOverlayMenuTaskLogic", "Toggle disabled.");
            } else {
                if (d().getConfig().c()) {
                    d().getConfig().b(false);
                    d().getConfig().setEnabled(true);
                }
                if (d().getConfig().getEnabled()) {
                    b.d i = bVar.i(coreFeatures);
                    if (i == null || (g = i.g()) == null || (optString = g.optString("invite_url")) == null) {
                        L.l("SetupOverlayMenuTaskLogic", "Unable to extract invite link.");
                    } else {
                        w290 d = d();
                        b4j0 b4j0Var = new b4j0(this);
                        y290 y290Var = new y290(new tj8(this.b, (ImBridgeComponent) c().a(fpf0.a(ImBridgeComponent.class)), (AuthBridgeComponent) c().a(fpf0.a(AuthBridgeComponent.class))), optString);
                        l370 l370Var = new l370();
                        c63 c63Var = c63.a;
                        d.a(this.b, b4j0Var, y290Var, l370Var, c63.b());
                        ((b25) this.d.getValue()).b0(new b25.a() { // from class: xsna.z3j0
                            @Override // xsna.b25.a
                            public final void d(tbu0 tbu0Var) {
                                c4j0.this.d().reset();
                            }
                        });
                        dhr0.a.a(new lrv0.a() { // from class: xsna.a4j0
                            @Override // xsna.lrv0.a
                            public final void xb() {
                                c4j0.this.d().update(true);
                            }
                        });
                    }
                } else {
                    L.e("SetupOverlayMenuTaskLogic", "Overlay disabled.");
                }
            }
        } else {
            L.c("SetupOverlayMenuTaskLogic", new np(this, 9));
        }
        return s3q0.a;
    }
}
