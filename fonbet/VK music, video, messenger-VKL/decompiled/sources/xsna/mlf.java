package xsna;

import com.vk.toggle.features.ClipsFeatures;
import java.util.concurrent.ExecutorService;

/* compiled from: ClipsUploaderDepsVK.kt */
/* loaded from: classes17.dex */
public final class mlf implements nlf, w8i {
    public final bpn0 b = new bpn0(new pff(this, 1));
    public final bpn0 c = new bpn0(new qo0(7));
    public final bpn0 d = new bpn0(new f1(this, 26));
    public final bpn0 e = new bpn0(new ng1(this, 25));
    public final bpn0 f = new bpn0(new yc(this, 29));
    public final bpn0 g = new bpn0(new q5f(this, 2));
    public final bpn0 h = new bpn0(new hd(this, 24));

    /* compiled from: ClipsUploaderDepsVK.kt */
    public static final class a implements llf {
        @Override // xsna.llf
        public final boolean a() {
            return !com.vk.toggle.b.A.a(ClipsFeatures.CLIP_CREATE_SESSION_DATA_COLLECTOR);
        }
    }

    @Override // xsna.nlf
    public final ExecutorService a() {
        asu0.a.getClass();
        return asu0.h();
    }

    @Override // xsna.nlf
    public final io.reactivex.rxjava3.core.w b() {
        asu0.a.getClass();
        return asu0.i();
    }

    @Override // xsna.nlf
    public final <T> io.reactivex.rxjava3.core.q<T> c(xy2<T> xy2Var) {
        return rsg0.a0(yfb.x(xy2Var));
    }

    @Override // xsna.nlf
    public final rlf d() {
        return (rlf) this.h.getValue();
    }

    @Override // xsna.nlf
    public final io.reactivex.rxjava3.core.w e() {
        return asu0.a.c();
    }

    @Override // xsna.nlf
    public final rgf f() {
        return (rgf) this.d.getValue();
    }

    @Override // xsna.nlf
    public final llf getConfig() {
        return (llf) this.c.getValue();
    }

    @Override // xsna.nlf
    public final xke getLogger() {
        return (xke) this.b.getValue();
    }
}
