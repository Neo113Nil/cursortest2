package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.vk.dto.common.Peer;
import com.vk.im.edu.common.api.di.EduCommonComponent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* compiled from: DialogMentionComponent.kt */
/* loaded from: classes2.dex */
public final class shm extends j8i implements w8i {
    public static final f9w s = e9w.a(shm.class);
    public final a1w i;
    public final b25 j;
    public atk0 k;
    public thm m;
    public final boolean q;
    public g2z r;
    public final io.reactivex.rxjava3.disposables.b l = new io.reactivex.rxjava3.disposables.b();
    public final io.reactivex.rxjava3.subjects.f<h6n0> n = new io.reactivex.rxjava3.subjects.f<>();
    public final io.reactivex.rxjava3.disposables.b o = new io.reactivex.rxjava3.disposables.b();
    public final bpn0 p = new bpn0(new myh(this, 6));

    /* compiled from: DialogMentionComponent.kt */
    public final class a {
        public a() {
        }
    }

    public shm(a1w a1wVar, b25 b25Var, long j) {
        this.i = a1wVar;
        this.j = b25Var;
        this.k = new atk0(j);
        cau0 cau0Var = a1wVar.r().h;
        this.q = false;
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        thm thmVar = new thm(layoutInflater, viewGroup);
        this.m = thmVar;
        thmVar.c = new a();
        io.reactivex.rxjava3.subjects.f<h6n0> fVar = this.n;
        fVar.getClass();
        int i = 13;
        this.o.b(hg1.h(new io.reactivex.rxjava3.internal.operators.observable.i0(io.reactivex.rxjava3.core.q.s(io.reactivex.rxjava3.core.q.T(new h6n0((m420) null, 3)), new io.reactivex.rxjava3.internal.operators.observable.y(fVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a)).s0(new z8(new n82(18), i)).b(2, 1), new b9(new qm(16), i)).U(new d9(new sm(20), 10)).a0(io.reactivex.rxjava3.android.schedulers.a.b()), new wcg(this, 8)));
        fVar.onNext(this.k.c);
        return this.m.a;
    }

    @Override // xsna.j8i
    public final void M0() {
        X0();
    }

    @Override // xsna.j8i
    public final void N0() {
        this.o.e();
        thm thmVar = this.m;
        if (thmVar != null) {
            thmVar.c = null;
        }
        this.m = null;
    }

    public final void X0() {
        this.l.e();
        this.k = new atk0(this.k.a);
        this.n.onNext(new h6n0((m420) null, 3));
    }

    public final io.reactivex.rxjava3.core.x<h6n0> Y0(m420 m420Var) {
        Collection<k320> collection = m420Var.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (obj instanceof x120) {
                arrayList.add(obj);
            }
        }
        if (!this.q || arrayList.isEmpty()) {
            return io.reactivex.rxjava3.core.x.k(new h6n0(m420Var, 2));
        }
        Peer q = this.i.q();
        u6p ue = ((EduCommonComponent) this.p.getValue()).ue();
        Collections.singletonList(q);
        return new io.reactivex.rxjava3.internal.operators.single.r(ue.a(), new pi0(new rhm(q, m420Var, this, arrayList), 18)).m(io.reactivex.rxjava3.android.schedulers.a.b()).q(asu0.a.c());
    }
}
