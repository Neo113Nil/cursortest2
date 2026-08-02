package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.log.L;
import com.vk.toggle.features.ComFeatures;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Future;
import xsna.epu;
import xsna.gxh;
import xsna.xqu;

/* compiled from: CommunityRepositoryImpl.kt */
/* loaded from: classes11.dex */
public final class hxh implements gxh {
    public final uou a = new uou();

    @Override // xsna.gxh
    public final void C(UserId userId) {
        uou uouVar = this.a;
        if (uouVar.b(userId) != null) {
            uouVar.d.submit(new u69(2, uouVar, userId));
        }
    }

    @Override // xsna.gxh
    public final Group C0(UserId userId) {
        return this.a.b(userId);
    }

    @Override // xsna.gxh
    public final void G0(UserId userId) {
        uou uouVar = this.a;
        uouVar.d.submit(new u69(2, uouVar, userId));
    }

    @Override // xsna.gxh
    public final ArrayList M() {
        return this.a.c(2);
    }

    @Override // xsna.gxh
    public final io.reactivex.rxjava3.core.q<Group> N0(UserId userId) {
        Group b = this.a.b(userId);
        if (b != null) {
            io.reactivex.rxjava3.internal.operators.observable.g1 T = io.reactivex.rxjava3.core.q.T(b);
            asu0.a.getClass();
            return T.r0(asu0.r()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
        }
        ComFeatures comFeatures = ComFeatures.COM_GROUPS_GETBYID_CODEGEN;
        comFeatures.getClass();
        boolean a = com.vk.toggle.b.A.a(comFeatures);
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        if (!a) {
            return rsg0.l0(new rpu(userId), null, 3).E(new trq(), lVar, kVar, kVar).a0(io.reactivex.rxjava3.android.schedulers.a.b());
        }
        fz2 y = yfb.y(xqu.a.a(null, Collections.singletonList(fkq0.a(userId)), uou.g), new g54(27));
        ahn.D(y);
        return rsg0.l0(y, null, 3).E(new z67(3), lVar, kVar, kVar).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    @Override // xsna.gxh
    public final void S(final int i, final gxh.a aVar) {
        final uou uouVar = this.a;
        uouVar.getClass();
        final boolean z = egi.m() == 0;
        if (uouVar.e.isEmpty() || z) {
            uouVar.d.submit(new Runnable() { // from class: xsna.rou
                @Override // java.lang.Runnable
                public final void run() {
                    uou uouVar2 = uou.this;
                    uouVar2.f.getClass();
                    ArrayList c = epu.c();
                    if (uouVar2.e.isEmpty() && !c.isEmpty()) {
                        uouVar2.f(c);
                    }
                    boolean isEmpty = c.isEmpty();
                    gxh.a aVar2 = aVar;
                    if ((isEmpty || z) && !uouVar2.a()) {
                        aVar2.onError();
                    }
                    aVar2.a(uouVar2.c(i));
                }
            });
        } else {
            aVar.a(uouVar.c(i));
        }
    }

    @Override // xsna.gxh
    public final void a() {
        this.a.e(true);
    }

    @Override // xsna.xic
    public final void clear() {
        uou uouVar = this.a;
        synchronized (uouVar.a) {
            uouVar.e.clear();
            tvh0<Group> tvh0Var = uouVar.b;
            Future<?> future = tvh0Var.a;
            if (future != null) {
                future.cancel(true);
            }
            synchronized (tvh0Var.b) {
                tvh0Var.d.clear();
                tvh0Var.c.clear();
            }
            uouVar.f.getClass();
            e43.a.deleteDatabase("groups.db");
            epu.a.m();
            egi.g();
        }
    }

    @Override // xsna.gxh
    public final boolean g0(UserId userId) {
        if (fkq0.b(userId)) {
            Group b = this.a.b(fkq0.e(userId));
            if (b != null ? b.e() : false) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.gxh
    public final void h0(Group group) {
        uou uouVar = this.a;
        uouVar.d.submit(new tou(0, uouVar, group));
    }

    @Override // xsna.gxh
    public final void load() {
        this.a.e(false);
    }

    @Override // xsna.gxh
    public final boolean m(UserId userId) {
        if (fkq0.b(userId)) {
            Group b = this.a.b(fkq0.e(userId));
            if (b != null ? b.f() : false) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.gxh
    public final void r0(String str, nlf0 nlf0Var) {
        uou uouVar = this.a;
        uouVar.d.submit(new xj3(uouVar, str, nlf0Var, 3));
    }

    @Override // xsna.gxh
    public final void t0(Group group) {
        uou uouVar = this.a;
        synchronized (uouVar.a) {
            uouVar.e.add(group);
            uouVar.b.b(uouVar.e);
        }
        epu epuVar = uouVar.f;
        Context context = e43.a;
        epuVar.getClass();
        try {
            epu.a.n(context).getWritableDatabase().insert("groups", null, epu.a(group));
        } catch (Exception e) {
            L.f("vk", "Error writing groups cache DB!", e);
        }
    }

    @Override // xsna.xic
    public final long u() {
        this.a.f.getClass();
        return com.vk.core.files.a.I(e43.a.getDatabasePath("groups.db"));
    }
}
