package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.data.VideoStatistic;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;

/* compiled from: ToxicPaginationDelegate.kt */
/* loaded from: classes4.dex */
public final class mdp0 implements sd90 {
    public final com.vk.lists.c a;
    public final td90 b;
    public boolean c;
    public volatile int d;

    public mdp0(com.vk.lists.c cVar, td90 td90Var) {
        this.a = cVar;
        this.b = td90Var;
        akl aklVar = td90Var instanceof akl ? (akl) td90Var : null;
        if (aklVar != null) {
            aklVar.p = new z6u(25);
        }
    }

    @Override // xsna.sd90
    public final void E(String str) {
        this.b.c = str;
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q<vqt> Q1(String str) {
        return this.b.Q1(str);
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q<vqt> a(boolean z, boolean z2) {
        this.c = false;
        return (z && z2) ? l() : e();
    }

    @Override // xsna.sd90
    public final int b() {
        return this.b.b();
    }

    @Override // xsna.sd90
    public final void c(UserId userId) {
        this.b.a = userId;
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q<vqt> d() {
        return this.c ? q(((ldp0) this.b).q(this.d)) : q(this.b.d());
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q<vqt> e() {
        this.b.f = 0;
        com.vk.lists.c cVar = this.a;
        cVar.r(true);
        cVar.q(0);
        return d();
    }

    @Override // xsna.sd90
    public final void f(boolean z) {
        this.b.h = z;
    }

    @Override // xsna.sd90
    public final void g() {
        this.b.g();
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.internal.operators.observable.b0 h(int i) {
        this.c = false;
        return q(this.b.h(i));
    }

    @Override // xsna.sd90
    public final void i() {
        this.b.i();
    }

    @Override // xsna.sd90
    public final void j(int i) {
        this.b.e = i;
    }

    @Override // xsna.sd90
    public final void k(int i) {
        this.b.b = i;
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q<vqt> l() {
        this.c = false;
        return q(this.b.l());
    }

    @Override // xsna.sd90
    public final void m(VideoStatistic videoStatistic) {
        this.b.g = videoStatistic;
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q n(io.reactivex.rxjava3.core.q qVar) {
        return this.b.n(qVar);
    }

    @Override // xsna.sd90
    public final void o(int i) {
        this.b.o(i);
    }

    @Override // xsna.sd90
    public final boolean p() {
        return this.b.p();
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q<vqt> p0() {
        return q(this.b.p0());
    }

    public final io.reactivex.rxjava3.internal.operators.observable.b0 q(io.reactivex.rxjava3.core.q qVar) {
        xk30 xk30Var = new xk30(new q8i0(this, 13), 29);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return qVar.E(xk30Var, lVar, kVar, kVar);
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q r(int i, ArrayList arrayList) {
        return h(i);
    }

    @Override // xsna.sd90
    public final void setTrackCode(String str) {
        this.b.d = str;
    }
}
