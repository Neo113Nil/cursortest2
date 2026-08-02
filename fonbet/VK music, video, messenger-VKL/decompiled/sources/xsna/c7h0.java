package xsna;

import android.content.Context;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.voip.api.id.CallId;
import com.vk.voip.userid.CallsUserId;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.a7f0;
import xsna.a990;
import xsna.b6h0;
import xsna.f6h0;
import xsna.i7h0;
import xsna.k7h0;
import xsna.l7h0;
import xsna.m7h0;
import xsna.r7h0;
import xsna.t6h0;
import xsna.to90;
import xsna.vhg;
import xsna.whg;
import xsna.y5h0;

/* compiled from: ScheduledCallsFeature.kt */
/* loaded from: classes7.dex */
public final class c7h0 extends wk50<v7h0, r7h0, r49, b59> {
    public final emu f;
    public final q7h0 g;
    public final b25 h;
    public final fhw0 i;
    public final cd9 j;
    public boolean k;
    public final v6h0 l;
    public final xhg m;
    public final vp90 n;
    public final f4z o;
    public final f4z p;
    public final f4z q;
    public final f7h0 r;

    /* compiled from: ScheduledCallsFeature.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<b59, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b59 b59Var) {
            ((c7h0) this.receiver).T(b59Var);
            return s3q0.a;
        }
    }

    public c7h0(o7h0 o7h0Var, emu emuVar, rte0 rte0Var, q7h0 q7h0Var, b25 b25Var, fhw0 fhw0Var, cd9 cd9Var) {
        super(null, o7h0Var);
        this.f = emuVar;
        this.g = q7h0Var;
        this.h = b25Var;
        this.i = fhw0Var;
        this.j = cd9Var;
        this.l = new v6h0();
        b7h0 b7h0Var = new b7h0(this);
        f4z f4zVar = new f4z();
        this.o = f4zVar;
        f4z f4zVar2 = new f4z();
        this.p = f4zVar2;
        f4z f4zVar3 = new f4z();
        this.q = f4zVar3;
        Context context = e43.a;
        qz8 qz8Var = new qz8((context == null ? null : context).getContentResolver());
        Context context2 = e43.a;
        this.r = new f7h0(q7h0Var, new vul(qz8Var, new bsb0(context2 != null ? context2 : null)), b7h0Var, new d7h0(this), new g6h0(f4zVar3, f4zVar2, f4zVar));
        this.m = new xhg(f4zVar2, f4zVar, rte0Var, b7h0Var);
        this.n = new vp90(f4zVar2, f4zVar3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v3, types: [com.vk.voip.userid.CallsUserId$VkUserId] */
    /* JADX WARN: Type inference failed for: r12v4, types: [com.vk.voip.userid.CallsUserId] */
    /* JADX WARN: Type inference failed for: r12v5, types: [com.vk.voip.userid.CallsUserId$VkUserId] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, xsna.a7f0, xsna.c7h0, xsna.wk50] */
    @Override // xsna.wk50
    public final void N(r7h0 r7h0Var, r49 r49Var) {
        boolean z;
        a990<String> a990Var;
        ?? r2 = this;
        r7h0 r7h0Var2 = r7h0Var;
        r49 r49Var2 = r49Var;
        boolean z2 = r49Var2 instanceof vhg.a;
        int i = 3;
        int i2 = 8;
        int i3 = 26;
        q7h0 q7h0Var = r2.g;
        b25 b25Var = r2.h;
        int i4 = 1;
        ?? r12 = 0;
        r12 = 0;
        if (z2) {
            fhw0 fhw0Var = r2.i;
            if (fhw0Var.isInitialized()) {
                boolean z3 = r2.k;
                if (!z3 || !(r7h0Var2 instanceof r7h0.c)) {
                    int i5 = 25;
                    c7h0 c7h0Var = r2;
                    if (!z3) {
                        r2.k = true;
                        a7f0.a.e(this, new io.reactivex.rxjava3.internal.operators.observable.i0(r2.j.d(b25Var.c()).k0(), new qu50(new f1s(i3), i2)).w0(3L, TimeUnit.SECONDS), null, new lxz(r2, i5), new wug0(r2, i4), null, 9);
                        c7h0 c7h0Var2 = this;
                        c7h0Var2.T(k7h0.c.b);
                        c7h0Var = c7h0Var2;
                    }
                    CallsUserId callsUserId = r7h0Var2 instanceof r7h0.a ? ((r7h0.a) r7h0Var2).b : null;
                    a7f0.a.f(c7h0Var, io.reactivex.rxjava3.core.x.B(rsg0.w0(yfb.x(c7h0Var.f.a.c())), q7h0.b(q7h0Var, null, callsUserId, 5), new did0(new ed4(7, callsUserId, c7h0Var), i)), new bw6(1, c7h0Var, c7h0.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0, 11), new p010(c7h0Var, i5), 1);
                }
            } else {
                io.reactivex.rxjava3.kotlin.c.d(fhw0Var.a(), new x750(r2, 16), new y6h0(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0));
            }
        } else {
            int i6 = 6;
            int i7 = 0;
            if (!(r49Var2 instanceof vhg.d)) {
                int i8 = 11;
                if (r49Var2 instanceof vhg.b) {
                    vhg.b bVar = (vhg.b) r49Var2;
                    boolean z4 = r7h0Var2 instanceof r7h0.a;
                    if (z4) {
                        r7h0.a aVar = (r7h0.a) r7h0Var2;
                        a990<String> a990Var2 = aVar.e;
                        if (a990Var2.b && (a990Var2.d instanceof a990.b.a) && (!(bVar instanceof vhg.b.C3891b) || (a990Var2.c instanceof a990.a.b))) {
                            if (!z4) {
                                aVar = null;
                            }
                            if (aVar != null && (a990Var = aVar.e) != null) {
                                r2.T(l7h0.c.b);
                                a7f0.a.f(r2, q7h0.b(q7h0Var, a990Var.a, null, 6).l(new x6h0(new hb40((Object) r2, 15), i7)), new z6h0(1, r2, c7h0.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0), new ie90(r2, i8), 1);
                            }
                        }
                    }
                } else if (r49Var2 instanceof vhg.c) {
                    r2.m.a((vhg.c) r49Var2);
                } else if (r49Var2 instanceof to90.b) {
                    to90.b bVar2 = (to90.b) r49Var2;
                    if (r7h0Var2 instanceof r7h0.a) {
                        r2.n.b.b(new fp90(bVar2.b));
                    }
                } else if (r49Var2 instanceof y5h0.e) {
                    y5h0.e eVar = (y5h0.e) r49Var2;
                    if (r7h0Var2 instanceof r7h0.a) {
                        CallsUserId callsUserId2 = eVar.b;
                        if (callsUserId2 == null) {
                            Serializer.c<? extends Serializer.StreamParcelable> cVar = CallsUserId.CREATOR;
                            r12 = new CallsUserId.VkUserId(b25Var.c());
                        } else {
                            boolean z5 = callsUserId2 instanceof CallsUserId.VkUserId;
                            if (z5) {
                                z = epx.f(((CallsUserId.VkUserId) callsUserId2).b, UserId.d);
                            } else {
                                if (!(callsUserId2 instanceof CallsUserId.ContactId)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                z = false;
                            }
                            if (!z) {
                                if (z5) {
                                    Serializer.c<? extends Serializer.StreamParcelable> cVar2 = CallsUserId.CREATOR;
                                    r12 = new CallsUserId.VkUserId(fkq0.e(((CallsUserId.VkUserId) callsUserId2).b));
                                } else if (!(callsUserId2 instanceof CallsUserId.ContactId)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                        }
                        r2.U(r12, false);
                    } else {
                        r2.C(vhg.a.b);
                    }
                } else if (r49Var2 instanceof y5h0.g) {
                    if (r7h0Var2 instanceof r7h0.a) {
                        r2.U(((r7h0.a) r7h0Var2).b, true);
                    } else {
                        r2.C(vhg.a.b);
                    }
                } else if (r49Var2 instanceof y5h0) {
                    y5h0 y5h0Var = (y5h0) r49Var2;
                    if (r7h0Var2 instanceof r7h0.a) {
                        f7h0 f7h0Var = r2.r;
                        q7h0 q7h0Var2 = f7h0Var.a;
                        b7h0 b7h0Var = f7h0Var.c;
                        g6h0 g6h0Var = f7h0Var.e;
                        f4z f4zVar = g6h0Var.a;
                        f4z f4zVar2 = g6h0Var.b;
                        if (y5h0Var instanceof y5h0.b) {
                            y5h0.b bVar3 = (y5h0.b) y5h0Var;
                            f4zVar.b(new b6h0.c(bVar3.b, bVar3.c));
                        } else {
                            int i9 = 17;
                            if (y5h0Var instanceof y5h0.d) {
                                y5h0.d dVar = (y5h0.d) y5h0Var;
                                if (dVar instanceof y5h0.d.a) {
                                    ((y5h0.d.a) dVar).getClass();
                                    f4zVar2.b(new whg.o(r12));
                                } else if (dVar instanceof y5h0.d.c) {
                                    x5h0 x5h0Var = ((y5h0.d.c) dVar).b;
                                    io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new x2l(q7h0Var2));
                                    asu0.a.getClass();
                                    b7h0Var.a(vVar.q(asu0.k()).l(new zj0(new rj60(x5h0Var, i9), i3)), new d2y(f7h0Var, 27), new kf8(g6h0Var, 8));
                                } else if (dVar instanceof y5h0.d.C4077d) {
                                    f4zVar2.b(new f6h0.b(((y5h0.d.C4077d) dVar).b));
                                } else {
                                    if (!(dVar instanceof y5h0.d.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    f4zVar.b(new b6h0.b(((y5h0.d.b) dVar).b));
                                }
                            } else if (y5h0Var instanceof y5h0.c) {
                                y5h0.c cVar3 = (y5h0.c) y5h0Var;
                                if (cVar3 instanceof y5h0.c.a) {
                                    x5h0 x5h0Var2 = ((y5h0.c.a) cVar3).b;
                                    CallId callId = x5h0Var2.a;
                                    vg20 vg20Var = q7h0Var2.a;
                                    String str = callId.b;
                                    vg20Var.getClass();
                                    tfx tfxVar = new tfx("messages.deleteScheduledCall", new uf3(17), new up(21));
                                    tfx.o(tfxVar, "call_id", str, 0, 0, 12);
                                    io.reactivex.rxjava3.internal.operators.observable.b1 Z = rsg0.Z(yfb.x(tfxVar));
                                    vul vulVar = f7h0Var.b;
                                    b7h0Var.a(Z.c(new io.reactivex.rxjava3.internal.operators.completable.v((!((bsb0) vulVar.c).a() ? io.reactivex.rxjava3.core.a.k(new IllegalAccessException()) : io.reactivex.rxjava3.core.a.l(new isa(i, vulVar, x5h0Var2.i)).q(io.reactivex.rxjava3.schedulers.a.b())).i(new xk30(new mf8(com.vk.metrics.eventtracking.b.a, 11), i9)), io.reactivex.rxjava3.internal.functions.a.g)).e(new io.reactivex.rxjava3.internal.operators.single.v(new e7h0(x5h0Var2, 0))), new pf8(1, f7h0Var.d, c59.class, "updateState", "updateState(Lcom/vk/voip/ui/call_list/common/feature/patch/CallListPatch;)V", 0, 12), new b95(g6h0Var, 10));
                                } else {
                                    if (!(cVar3 instanceof y5h0.c.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    f4zVar2.b(new f6h0.c(((y5h0.c.b) cVar3).b));
                                }
                                s3q0 s3q0Var = s3q0.a;
                            } else if (y5h0Var instanceof y5h0.a) {
                                f4zVar.b(new b6h0.a(((y5h0.a) y5h0Var).b));
                            } else if (y5h0Var instanceof y5h0.f) {
                                f4zVar2.b(f6h0.d.a);
                            } else {
                                L.G("Unhandled action " + y5h0Var);
                            }
                        }
                    }
                } else if (r49Var2 instanceof t6h0.a) {
                    r2.p.b(i7h0.a.a);
                } else {
                    L.G("Unhandled action " + r49Var2);
                }
            } else if (r7h0Var2 instanceof r7h0.a) {
                r7h0.a aVar2 = (r7h0.a) r7h0Var2;
                if (aVar2.e.d instanceof a990.b.a) {
                    r2.T(m7h0.c.b);
                    a7f0.a.f(r2, q7h0.b(q7h0Var, null, aVar2.b, 5).l(new mvc0(new c230((Object) r2, 24), 1)), new a7h0(1, r2, c7h0.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0), new j5b0(r2, i6), 1);
                }
            } else {
                r2.C(vhg.a.b);
            }
        }
        s3q0 s3q0Var2 = s3q0.a;
    }

    public final void U(CallsUserId callsUserId, boolean z) {
        T(new j7h0(callsUserId, z));
        a7f0.a.f(this, q7h0.b(this.g, null, callsUserId, 5).l(new u9c0(new e810(this, 24), 4)), new a(1, this, c7h0.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0), new f410(this, 28), 1);
    }
}
