package xsna;

import com.vk.dto.stickers.VmojiAvatarModel;
import com.vk.log.L;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ClipsSuggestionsProviderVK.kt */
/* loaded from: classes17.dex */
public final class u5f {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;

    public u5f(p9l0 p9l0Var, m9l0 m9l0Var, Object obj, io.reactivex.rxjava3.disposables.b bVar, kbl0 kbl0Var) {
        this.a = p9l0Var;
        this.b = m9l0Var;
        this.c = obj;
        this.d = bVar;
        this.e = kbl0Var;
        this.f = new AtomicBoolean(false);
    }

    public void a() {
        m9l0 m9l0Var = (m9l0) this.b;
        p9l0 p9l0Var = (p9l0) this.a;
        List O0 = j5g.O0(zik0.g(p9l0Var.h));
        boolean z = ((kbl0) this.e).d() == O0.size();
        L.c("[VkStickersStorage]", new p9s(O0, z, this));
        if (!z) {
            io.reactivex.rxjava3.internal.operators.observable.s0 s0Var = new io.reactivex.rxjava3.internal.operators.observable.s0(new l9l0());
            asu0 asu0Var = asu0.a;
            ((io.reactivex.rxjava3.disposables.b) this.d).b(s0Var.r0(asu0Var.c()).r0(asu0Var.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new pw40(new e750(12), 10)));
        }
        m9l0Var.a(new re40(O0, m9l0Var));
        VmojiAvatarModel vmojiAvatarModel = p9l0Var.b;
        if (vmojiAvatarModel != null) {
            m9l0Var.a(new kr50(m9l0Var, vmojiAvatarModel));
        }
    }

    public u5f(l3n0 l3n0Var, mhd mhdVar, qdz qdzVar, y34 y34Var, h7v h7vVar) {
        this.a = l3n0Var;
        this.b = mhdVar;
        this.c = qdzVar;
        this.d = y34Var;
        this.e = h7vVar;
    }
}
