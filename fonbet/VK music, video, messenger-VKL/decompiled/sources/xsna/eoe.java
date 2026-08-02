package xsna;

import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: ClipsOwnerListCache.kt */
/* loaded from: classes17.dex */
public final class eoe {
    public static final /* synthetic */ qcy<Object>[] j = {new MutablePropertyReference1Impl(eoe.class, "key", "getKey()Lcom/vk/clips/sdk/shared/paging/PaginationKey;", 0), p5j.a(0, eoe.class, "disposable", "getDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", fpf0.a)};
    public final UserId a;
    public volatile long b;
    public volatile long c;
    public final ibr0 d;
    public final biu e = new biu(PaginationKey.Initial.b);
    public final pgn f;
    public final io.reactivex.rxjava3.subjects.d<List<uee>> g;
    public final io.reactivex.rxjava3.subjects.d<List<uee>> h;
    public final io.reactivex.rxjava3.subjects.d<List<ClipVideoFile>> i;

    public eoe(UserId userId, long j2, long j3, ibr0 ibr0Var) {
        this.a = userId;
        this.b = j2;
        this.c = j3;
        this.d = ibr0Var;
        pgn pgnVar = new pgn();
        this.f = pgnVar;
        this.g = io.reactivex.rxjava3.subjects.d.N0();
        io.reactivex.rxjava3.subjects.d<List<uee>> N0 = io.reactivex.rxjava3.subjects.d.N0();
        this.h = N0;
        io.reactivex.rxjava3.subjects.d<List<ClipVideoFile>> N02 = io.reactivex.rxjava3.subjects.d.N0();
        this.i = N02;
        io.reactivex.rxjava3.core.q m = io.reactivex.rxjava3.core.q.m(N0.U(new np1(new t6(userId, 21), 10)), N02, new rx0(this, 9));
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        io.reactivex.rxjava3.disposables.c subscribe = m.r0(asu0.i()).a0(asu0Var.d()).subscribe(new gf0(new ns1(this, 23), 12), new y00(new pj1(L.a, 1), 12));
        qcy<Object> qcyVar = j[1];
        pgnVar.b(subscribe);
    }

    public final void a(List<ClipVideoFile> list, PaginationKey paginationKey, boolean z) {
        io.reactivex.rxjava3.subjects.d<List<ClipVideoFile>> dVar = this.i;
        dVar.onNext(j5g.u0(list, (z || dVar.P0() == null) ? EmptyList.b : dVar.P0()));
        this.e.setValue(this, j[0], paginationKey);
    }

    public final void b(ClipVideoFile clipVideoFile, boolean z) {
        ArrayList I;
        List<ClipVideoFile> P0 = this.i.P0();
        if (P0 == null) {
            P0 = EmptyList.b;
        }
        Iterator<ClipVideoFile> it = P0.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (epx.f(it.next().a1(), clipVideoFile.a1())) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1) {
            io.reactivex.rxjava3.subjects.d<List<ClipVideoFile>> dVar = this.i;
            if (z) {
                I = rdi.A(i2, P0);
                this.b--;
            } else {
                I = rdi.I(i2, clipVideoFile, P0);
            }
            dVar.onNext(I);
        }
        List<uee> P02 = this.h.P0();
        if (P02 == null) {
            P02 = EmptyList.b;
        }
        Iterator<uee> it2 = P02.iterator();
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            } else if (epx.f(it2.next().a.a1(), clipVideoFile.a1())) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            this.h.onNext(z ? rdi.A(i, P02) : rdi.I(i, uee.b(P02.get(i), clipVideoFile, null, 6), P02));
        }
    }
}
