package xsna;

import android.content.Context;
import com.vk.dto.common.VideoFile;
import kotlin.LazyThreadSafetyMode;

/* compiled from: BaseVideoBridge.kt */
/* loaded from: classes.dex */
public abstract class mq6 implements g7s0 {
    public final gek b;
    public final bpn0 c;
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new lq6(0));
    public final bti e = new bti();

    public mq6(gek gekVar, bpn0 bpn0Var) {
        this.b = gekVar;
        this.c = bpn0Var;
        aq0 aq0Var = new aq0(10);
        final Context context = e43.a;
        context = context == null ? null : context;
        final bpn0 bpn0Var2 = new bpn0(new qy8(context, 17));
        bpn0 bpn0Var3 = new bpn0(new gzs() { // from class: xsna.aps0
            @Override // xsna.gzs
            public final Object invoke() {
                int i;
                if (com.vk.toggle.d.v.b() != null) {
                    Context context2 = context;
                    i = Math.max(iah0.p(context2), context2.getResources().getDisplayMetrics().widthPixels);
                } else {
                    i = Integer.MAX_VALUE;
                }
                return new efr(i, new afl0(bpn0Var2, 14));
            }
        });
        bpn0 bpn0Var4 = new bpn0(new eu2(15, aq0Var));
        bpn0 bpn0Var5 = new bpn0(new fu2(context, 9));
        qb60 qb60Var = new qb60(bpn0Var3, 1);
        nxv nxvVar = new nxv(bpn0Var2, 6);
        oxv oxvVar = new oxv(bpn0Var5, 10);
        pxv pxvVar = new pxv(bpn0Var4, 10);
        m63.b = qb60Var;
        m63.c = nxvVar;
        m63.d = oxvVar;
        m63.e = pxvVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.g7s0
    public final oet0 N() {
        return (oet0) this.d.getValue();
    }

    @Override // xsna.g7s0
    public final void b(VideoFile videoFile) {
        ((hdt0) this.c.getValue()).b(videoFile);
    }

    @Override // xsna.g7s0
    public final zxf0 b0() {
        return this.e;
    }

    @Override // xsna.g7s0
    public final boolean c(VideoFile videoFile) {
        return ((hdt0) this.c.getValue()).c(videoFile);
    }

    @Override // xsna.g7s0
    public final void d(VideoFile videoFile) {
        ((hdt0) this.c.getValue()).d(videoFile);
    }

    @Override // xsna.g7s0
    public final bes0 i() {
        return this.b;
    }
}
