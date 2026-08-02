package xsna;

import com.huawei.hms.framework.common.BundleUtil;
import com.vk.dto.masks.Mask;
import java.util.List;
import ru.ok.gleffects.impl.EffectNativeSink;
import xsna.l5x0;

/* compiled from: VoipEffectStarterImpl.kt */
/* loaded from: classes7.dex */
public final class vnw0 implements wnw0 {
    public final l5x0.c a;
    public final qh10 b = new qh10();
    public final io.reactivex.rxjava3.disposables.b c = new io.reactivex.rxjava3.disposables.b();

    public vnw0(l5x0.c cVar) {
        this.a = cVar;
    }

    @Override // xsna.wnw0
    public final void a(String str) {
        c(str, new wlw0(this, 1));
        c(((unw0) l5x0.this.g.getValue()).c(), new xvl0(this, 22));
    }

    @Override // xsna.wnw0
    public final void b(Mask mask) {
        hmj0 hmj0Var = new hmj0(9, this, mask);
        qh10 qh10Var = this.b;
        qh10Var.b.b(qh10Var.a.g(mask).subscribe(new jz(new a5(13, mask, hmj0Var), 24)));
    }

    public final void c(String str, izs<? super Mask, s3q0> izsVar) {
        io.reactivex.rxjava3.internal.operators.observable.j1 U;
        if (str == null || str.length() == 0) {
            return;
        }
        int i = 0;
        List c0 = drm0.c0(str, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6);
        if (c0.size() > 1) {
            String str2 = (String) c0.get(1);
            bpn0 bpn0Var = cqm0.a;
            try {
                i = Integer.parseInt(str2);
            } catch (Throwable unused) {
            }
            if (i < 0) {
                U = rsg0.y0(new fym(EffectNativeSink.getLibVersionCode(), str), null, null, 3).U(new tuz(new weq0(6), 24));
                this.c.b(io.reactivex.rxjava3.kotlin.c.f(2, U, null, new qit0(5), new xv80(izsVar, 2)));
            }
        }
        U = rsg0.y0(new rh10(str, com.vk.media.ok.b.W0), null, null, 3).U(new he40(new lwp0(9), 24));
        this.c.b(io.reactivex.rxjava3.kotlin.c.f(2, U, null, new qit0(5), new xv80(izsVar, 2)));
    }
}
