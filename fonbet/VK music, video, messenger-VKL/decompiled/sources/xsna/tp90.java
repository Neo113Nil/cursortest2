package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.voip.userid.CallsUserId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a59;
import xsna.rp90;

/* compiled from: PastCallsFeatureHelper.kt */
/* loaded from: classes7.dex */
public final class tp90 {
    public final xp90 a;
    public final qp90 b;
    public final nuw0 c;
    public final ouw0 d;

    /* compiled from: PastCallsFeatureHelper.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<b59, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b59 b59Var) {
            ((c59) this.receiver).a(b59Var);
            return s3q0.a;
        }
    }

    public tp90(xp90 xp90Var, qp90 qp90Var, xx1 xx1Var, nuw0 nuw0Var, ouw0 ouw0Var) {
        this.a = xp90Var;
        this.b = qp90Var;
        this.c = nuw0Var;
        this.d = ouw0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    public final void a(final rp90 rp90Var, final a59 a59Var, gzs<s3q0> gzsVar) {
        ?? singletonList;
        io.reactivex.rxjava3.core.a k;
        rp90.b bVar = rp90Var.f;
        rp90.b.C3620b c3620b = bVar instanceof rp90.b.C3620b ? (rp90.b.C3620b) bVar : null;
        CallsUserId callsUserId = c3620b != null ? c3620b.a : null;
        rd9 rd9Var = this.a.a;
        if (a59Var instanceof a59.c) {
            ArrayList arrayList = ((a59.c) a59Var).c;
            singletonList = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                singletonList.add(Long.valueOf(((a59.e) it.next()).c));
            }
        } else {
            if (!(a59Var instanceof a59.e)) {
                throw new NoWhenBranchMatchedException();
            }
            singletonList = Collections.singletonList(Long.valueOf(((a59.e) a59Var).c));
        }
        if (callsUserId == null) {
            rd9Var.getClass();
            tfx tfxVar = new tfx("calls.deleteHistoryRecords", new er(7), new fr(5));
            tfxVar.i("record_ids", (Iterable) singletonList);
            k = rsg0.Z(yfb.x(tfxVar));
        } else {
            UserId b = com.vk.voip.userid.a.b(callsUserId);
            if (b != null) {
                rd9Var.getClass();
                tfx tfxVar2 = new tfx("calls.deleteGroupHistoryRecords", new dr(7), new com.vk.movika.sdk.android.defaultplayer.view.a(9));
                tfxVar2.i("record_ids", (Iterable) singletonList);
                tfx.n(tfxVar2, "group_id", b, 0L, 0L, 12);
                k = rsg0.Z(yfb.x(tfxVar2));
            } else {
                k = io.reactivex.rxjava3.core.a.k(new IllegalStateException("group id is null"));
            }
        }
        this.d.a(new io.reactivex.rxjava3.internal.operators.completable.c0(new io.reactivex.rxjava3.internal.operators.completable.v(k, io.reactivex.rxjava3.internal.functions.a.g).g(new oua(gzsVar, 4)), new io.reactivex.rxjava3.functions.n() { // from class: xsna.sp90
            @Override // io.reactivex.rxjava3.functions.n
            public final Object get() {
                return new x8q0(j5g.s0(rp90.this.a, a59Var));
            }
        }, null), new a(1, this.c, c59.class, "updateState", "updateState(Lcom/vk/voip/ui/call_list/common/feature/patch/CallListPatch;)V", 0), null);
    }
}
