package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.libvideo.live.api.broadcast_settings.models.BroadcastAuthor;
import com.vk.libvideo.live.api.broadcast_settings.models.BroadcastStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.a7f0;
import xsna.ki8;
import xsna.wi8;

/* compiled from: BroadcastSettingsFeature.kt */
/* loaded from: classes3.dex */
public final class pi8 extends wk50<oj8, fj8, ki8, wi8> {
    public final ui8 f;
    public final vi8 g;
    public final kj8 h;
    public io.reactivex.rxjava3.disposables.c i;

    public pi8(ej8 ej8Var, ui8 ui8Var, vi8 vi8Var, kj8 kj8Var) {
        super(ki8.f.b, ej8Var);
        this.f = ui8Var;
        this.g = vi8Var;
        this.h = kj8Var;
    }

    @Override // xsna.wk50
    public final void N(fj8 fj8Var, ki8 ki8Var) {
        fj8 fj8Var2 = fj8Var;
        ki8 ki8Var2 = ki8Var;
        if (ki8Var2 instanceof ki8.f) {
            U(fj8Var2, false);
            return;
        }
        if (ki8Var2 instanceof ki8.c) {
            U(fj8Var2, false);
            return;
        }
        if (ki8Var2 instanceof ki8.g) {
            U(fj8Var2, true);
            return;
        }
        boolean z = ki8Var2 instanceof ki8.b;
        vi8 vi8Var = this.g;
        if (z) {
            vi8Var.close();
            return;
        }
        if (ki8Var2 instanceof ki8.d) {
            BroadcastAuthor broadcastAuthor = fj8Var2.d;
            BroadcastStream broadcastStream = fj8Var2.e;
            if (broadcastAuthor == null || broadcastStream == null) {
                return;
            }
            vi8Var.a(broadcastAuthor, broadcastStream);
            return;
        }
        if (ki8Var2 instanceof ki8.a) {
            T(new wi8.e(((ki8.a) ki8Var2).b));
        } else {
            if (!(ki8Var2 instanceof ki8.e)) {
                throw new NoWhenBranchMatchedException();
            }
            T(new wi8.f(((ki8.e) ki8Var2).b));
        }
    }

    public final void U(fj8 fj8Var, boolean z) {
        Pair pair;
        io.reactivex.rxjava3.disposables.c cVar = this.i;
        if (cVar != null) {
            cVar.dispose();
        }
        if (z) {
            T(wi8.d.b);
        } else {
            T(wi8.a.b);
        }
        BroadcastAuthor broadcastAuthor = fj8Var.d;
        if (broadcastAuthor != null) {
            UserId a = kd8.a(broadcastAuthor);
            BroadcastStream broadcastStream = fj8Var.e;
            pair = new Pair(a, broadcastStream != null ? yj8.a(broadcastStream) : null);
        } else {
            pair = new Pair(fj8Var.b, fj8Var.c);
        }
        UserId userId = (UserId) pair.d();
        Integer num = (Integer) pair.g();
        ui8 ui8Var = this.f;
        ui8Var.getClass();
        io.reactivex.rxjava3.internal.operators.single.r rVar = new io.reactivex.rxjava3.internal.operators.single.r(rsg0.w0(new mns0()), new c7(new am0(15), 10));
        asu0.a.getClass();
        this.i = a7f0.a.f(this, rVar.m(asu0.i()).l(new e7(new ma(ui8Var, userId, num, 1), 5)), new ka(this, 10), new com.vk.voip.ui.menu.feature.a(this, 11), 1);
    }
}
