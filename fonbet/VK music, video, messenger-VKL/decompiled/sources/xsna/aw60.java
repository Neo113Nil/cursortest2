package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.feed.core.models.news.UxPollsEntry;
import com.vk.uxpolls.presentation.js.model.UxPollsTheme;
import com.vk.uxpolls.presentation.view.PollsWebView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: NewsfeedPreloadController.kt */
/* loaded from: classes4.dex */
public final class aw60 {
    public static final xv60 e = new xv60();
    public final x0d0 a;
    public ef90 b;
    public k5r0 c;
    public s0d0 d;

    public aw60(x0d0 x0d0Var, final bin0 bin0Var, mbs mbsVar, final ap30 ap30Var) {
        this.a = x0d0Var;
        this.d = new s0d0() { // from class: xsna.yv60
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v10, types: [xsna.ky3] */
            @Override // xsna.s0d0
            public final u0d0 a(int i) {
                final u1c0 u1c0Var;
                Context context;
                Object invoke = ap30.this.invoke(Integer.valueOf(i));
                z1c0 z1c0Var = invoke instanceof z1c0 ? (z1c0) invoke : null;
                t0d0 t0d0Var = u0d0.a;
                if (z1c0Var != null && (u1c0Var = z1c0Var.h) != null) {
                    de deVar = u1c0Var.p;
                    x0d0 x0d0Var2 = this.a;
                    final ly3 ly3Var = x0d0Var2.b;
                    final int b0 = deVar.b0(u1c0Var);
                    if (b0 > 0) {
                        final int i2 = ly3Var.c;
                        ly3Var.c = i2 + 1;
                        com.vk.mvi.core.internal.executors.a.c(new gzs() { // from class: xsna.jy3
                            @Override // xsna.gzs
                            public final Object invoke() {
                                String d0;
                                int i3 = b0;
                                ly3 ly3Var2 = ly3Var;
                                int i4 = i2;
                                u1c0 u1c0Var2 = u1c0Var;
                                io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
                                for (int i5 = 0; i5 < i3; i5++) {
                                    WeakReference<io.reactivex.rxjava3.disposables.b> weakReference = ly3Var2.b.get(Integer.valueOf(i4));
                                    io.reactivex.rxjava3.disposables.b bVar2 = weakReference != null ? weakReference.get() : null;
                                    if ((bVar2 == null || bVar2.c) && (d0 = u1c0Var2.p.d0(u1c0Var2, i5)) != null && d0.length() != 0 && !mcr0.p(d0)) {
                                        hg1.e(bVar, mcr0.r(Uri.parse(d0), null, u1c0Var2.p.c0(u1c0Var2, i5)).subscribe());
                                    }
                                }
                                hg1.e(ly3Var2.a, bVar);
                                ly3Var2.b.put(Integer.valueOf(i4), new WeakReference<>(bVar));
                                return s3q0.a;
                            }
                        });
                        t0d0Var = new u0d0() { // from class: xsna.ky3
                            @Override // xsna.u0d0
                            public final void cancel() {
                                ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
                                com.vk.mvi.core.internal.executors.a.c(new qn1(ly3.this, i2, 1));
                            }
                        };
                    }
                    x0d0Var2.d.getValue().a();
                    UxPollsEntry k0 = deVar.k0(u1c0Var);
                    if (k0 != null && (context = (Context) bin0Var.get()) != null) {
                        w5r0 w5r0Var = x0d0Var2.e;
                        String str = k0.i;
                        w5r0Var.b(context, str);
                        w5r0Var.b.add(str);
                    }
                    Html5Entry Z = deVar.Z(u1c0Var);
                    if (Z != null) {
                        x0d0Var2.f.a(Z);
                    }
                    if (u1c0Var.g()) {
                        x0d0Var2.h.b(u1c0Var.b);
                    }
                    int h0 = deVar.h0(u1c0Var);
                    for (int i3 = 0; i3 < h0; i3++) {
                        String g0 = deVar.g0(u1c0Var, i3);
                        if (g0 != null) {
                            x0d0Var2.c.a(g0);
                        }
                    }
                }
                return t0d0Var;
            }
        };
        mbsVar.a(new zv60(this, mbsVar));
    }

    public final void a() {
        x0d0 x0d0Var = this.a;
        ef90 ef90Var = new ef90(new v1d0(x0d0Var.a, this.d));
        x0d0Var.g.l(ef90Var);
        this.b = ef90Var;
        k5r0 k5r0Var = new k5r0(x0d0Var.e);
        x0d0Var.g.l(k5r0Var);
        this.c = k5r0Var;
    }

    public final void b() {
        x0d0 x0d0Var = this.a;
        Iterator<T> it = x0d0Var.e.a.entrySet().iterator();
        while (it.hasNext()) {
            ((PollsWebView) ((Map.Entry) it.next()).getValue()).f(dhr0.M() ? UxPollsTheme.DARK : UxPollsTheme.LIGHT);
        }
        Iterator<T> it2 = x0d0Var.f.a.entrySet().iterator();
        while (it2.hasNext()) {
            ((ihv) ((Map.Entry) it2.next()).getValue()).Ng();
        }
    }
}
