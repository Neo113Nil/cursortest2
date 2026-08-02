package xsna;

import android.content.Context;
import com.vk.core.ui.themes.VKTheme;
import com.vk.im.engine.models.dialogs.DialogTheme;
import java.util.List;
import kotlin.Lazy;

/* compiled from: DialogThemesProvidersContainerImpl.kt */
/* loaded from: classes.dex */
public final class ulm implements qlm {
    public final List<VKTheme> a;
    public final bpn0 b;
    public final fqy<plm> c;

    public ulm(final Context context, final dhr0 dhr0Var) {
        dhr0Var.getClass();
        VKTheme z = dhr0.z();
        VKTheme u = dhr0.u();
        ehr0 ehr0Var = dhr0.e;
        this.a = e43.l(z, u, ehr0Var.a, ehr0Var.b);
        bpn0 bpn0Var = new bpn0(new gzs() { // from class: xsna.rlm
            @Override // xsna.gzs
            public final Object invoke() {
                return new yol(dhr0.this, this.a);
            }
        });
        this.b = bpn0Var;
        this.c = new fqy<>(rl3.u0(new Lazy[]{new bpn0(new gzs() { // from class: xsna.slm
            @Override // xsna.gzs
            public final Object invoke() {
                return new jpk0(dhr0.this, this.a);
            }
        }), bpn0Var, new bpn0(new gzs() { // from class: xsna.tlm
            @Override // xsna.gzs
            public final Object invoke() {
                return new bz9(context, this.a);
            }
        }), new bpn0(new b67(this, 3))}));
    }

    @Override // xsna.qlm
    public final fqy a() {
        return this.c;
    }

    @Override // xsna.qlm
    public final DialogTheme b() {
        return (DialogTheme) ((yol) this.b.getValue()).b.getValue();
    }
}
