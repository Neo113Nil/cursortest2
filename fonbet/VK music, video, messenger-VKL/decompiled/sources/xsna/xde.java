package xsna;

import com.vk.api.clips.ClipsProfileList;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.clips.uploader.api.model.ClipUploadJob;
import com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridListFragment;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.log.L;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Ref$IntRef;
import ru.ok.android.utils.Logger;

/* compiled from: ClipsGridOwnerClipsDelegate.kt */
/* loaded from: classes17.dex */
public final class xde implements sde {
    public static final /* synthetic */ qcy<Object>[] l = {new MutablePropertyReference1Impl(xde.class, "uploadings", "getUploadings()Lio/reactivex/rxjava3/disposables/Disposable;", 0), p5j.a(0, xde.class, "currentPageState", "getCurrentPageState()Lio/reactivex/rxjava3/disposables/Disposable;", fpf0.a), new MutablePropertyReference1Impl(xde.class, "paginationDisposable", "getPaginationDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0)};
    public ClipGridParams.OnlyId.Profile a;
    public final boolean b;
    public final jof c;
    public final sdq0 d;
    public AbstractClipsGridListFragment e;
    public eoe g;
    public Object f = jgp.b;
    public final io.reactivex.rxjava3.disposables.b h = new io.reactivex.rxjava3.disposables.b();
    public final pgn i = new pgn();
    public final pgn j = new pgn();
    public final pgn k = new pgn();

    /* compiled from: ClipsGridOwnerClipsDelegate.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            xde xdeVar = (xde) this.receiver;
            qcy<Object>[] qcyVarArr = xde.l;
            xdeVar.getClass();
            L.i(th);
            AbstractClipsGridListFragment abstractClipsGridListFragment = xdeVar.e;
            if (abstractClipsGridListFragment != null) {
                abstractClipsGridListFragment.g0();
            }
            return s3q0.a;
        }
    }

    /* compiled from: ClipsGridOwnerClipsDelegate.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public xde(ClipGridParams.OnlyId.Profile profile, boolean z, jof jofVar, sdq0 sdq0Var) {
        this.a = profile;
        this.b = z;
        this.c = jofVar;
        this.d = sdq0Var;
    }

    @Override // xsna.sde
    public final void a() {
        d();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public final void b(ClipGridParams.OnlyId.Profile profile, List<ClipVideoFile> list, PaginationKey paginationKey) {
        AbstractClipsGridListFragment abstractClipsGridListFragment;
        boolean f = epx.f(this.a.b, profile.b);
        this.a = profile;
        if (!f && (abstractClipsGridListFragment = this.e) != null) {
            abstractClipsGridListFragment.po(EmptyList.b, false);
        }
        eoe eoeVar = (eoe) this.f.get(this.a.b);
        if (eoeVar != null) {
            eoeVar.a(list, paginationKey, true);
            if (this.e == null || f) {
                return;
            }
            k(eoeVar);
        }
    }

    @Override // xsna.sde
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.sde
    public final void d() {
        eoe eoeVar = (eoe) this.f.get(this.a.b);
        if (eoeVar == null) {
            AbstractClipsGridListFragment abstractClipsGridListFragment = this.e;
            if (abstractClipsGridListFragment != null) {
                abstractClipsGridListFragment.g0();
                return;
            }
            return;
        }
        biu biuVar = eoeVar.e;
        qcy<Object>[] qcyVarArr = l;
        qcy<Object> qcyVar = qcyVarArr[2];
        pgn pgnVar = this.k;
        io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) pgnVar.b;
        if (cVar == null || !hg1.d(cVar)) {
            qcy<Object>[] qcyVarArr2 = eoe.j;
            if (((PaginationKey) biuVar.getValue(eoeVar, qcyVarArr2[0])) instanceof PaginationKey.Next) {
                io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.single.n(rsg0.w0(new ClipsProfileList(eoeVar.a, (PaginationKey) biuVar.getValue(eoeVar, qcyVarArr2[0]), 12, this.b ? ClipsProfileList.OwnerListFilter.SCHEDULED : ClipsProfileList.OwnerListFilter.PUBLISHED)).m(asu0.a.d()), new om1(new on(this, 21), 7)).subscribe(new ph3(new mz(eoeVar, 29), 14), new x8(new a(1, this, xde.class, "processError", "processError(Ljava/lang/Throwable;)V", 0), 12));
                qcy<Object> qcyVar2 = qcyVarArr[2];
                pgnVar.b(subscribe);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.sde
    public final void e(AbstractClipsGridListFragment abstractClipsGridListFragment) {
        this.e = abstractClipsGridListFragment;
        eoe eoeVar = (eoe) this.f.get(this.a.b);
        if (eoeVar != null) {
            k(eoeVar);
            return;
        }
        qcy<Object> qcyVar = l[2];
        if (hg1.d((io.reactivex.rxjava3.disposables.c) this.k.b)) {
            abstractClipsGridListFragment.lb();
        } else {
            abstractClipsGridListFragment.po(EmptyList.b, true);
        }
    }

    @Override // xsna.sde
    public final ClipGridParams f() {
        return this.a;
    }

    @Override // xsna.sde
    public final void g() {
        this.e = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.sde
    public final PaginationKey h() {
        PaginationKey paginationKey;
        eoe eoeVar = (eoe) this.f.get(this.a.b);
        return (eoeVar == null || (paginationKey = (PaginationKey) eoeVar.e.getValue(eoeVar, eoe.j[0])) == null) ? PaginationKey.Initial.b : paginationKey;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final void i(ClipGridParams.OnlyId.Profile profile, LinkedHashMap linkedHashMap) {
        eoe eoeVar;
        this.g = (eoe) this.f.get(this.a.b);
        this.f = linkedHashMap;
        this.a = profile;
        if (this.e != null && (eoeVar = (eoe) linkedHashMap.get(profile.b)) != null) {
            k(eoeVar);
        }
        io.reactivex.rxjava3.subjects.f<bwr0> fVar = wjs0.b;
        asu0.a.getClass();
        hg1.e(this.h, new io.reactivex.rxjava3.internal.operators.observable.z(fVar.a0(asu0.i()), new k41(new com.vk.newsfeed.posting.impl.presentation.base.fragment.a(this, 21), 13)).subscribe(new b00(new k9(this, 29), 13), new bw(new c95(L.a, 3), 15)));
        j();
    }

    public final void j() {
        sdq0 sdq0Var = this.d;
        boolean k = sdq0Var.a.getValue().k();
        qcy<Object>[] qcyVarArr = l;
        pgn pgnVar = this.i;
        if (k) {
            io.reactivex.rxjava3.core.q<List<Pair<ClipUploadJob, ded>>> b2 = sdq0Var.b.getValue().b();
            asu0.a.getClass();
            io.reactivex.rxjava3.disposables.c subscribe = b2.a0(asu0.i()).subscribe(new c40(new j5(this, 26), 12), new m5(new b95(L.a, 2), 18));
            qcy<Object> qcyVar = qcyVarArr[0];
            pgnVar.b(subscribe);
            return;
        }
        io.reactivex.rxjava3.core.q<List<Pair<ClipVideoFile, eed>>> b3 = sdq0Var.c.getValue().b();
        asu0.a.getClass();
        io.reactivex.rxjava3.disposables.c subscribe2 = b3.a0(asu0.i()).subscribe(new k5(new u8(this, 27), 14), new xz(new b(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 18));
        qcy<Object> qcyVar2 = qcyVarArr[0];
        pgnVar.b(subscribe2);
    }

    public final void k(eoe eoeVar) {
        boolean f = epx.f(this.g, eoeVar);
        qcy<Object>[] qcyVarArr = l;
        pgn pgnVar = this.j;
        if (f) {
            qcy<Object> qcyVar = qcyVarArr[1];
            if (hg1.d((io.reactivex.rxjava3.disposables.c) pgnVar.b)) {
                return;
            }
        }
        io.reactivex.rxjava3.subjects.d<List<uee>> dVar = eoeVar.g;
        dVar.getClass();
        io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.observable.y(dVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).U(new e40(new ix2(new Ref$IntRef(), 25), 5)).U(new z8(new defpackage.m(6, eoeVar, this), 5)).a0(asu0.a.d()).subscribe(new defpackage.p(new u4e(this, 2), 14), new wde(new sm(10), 0));
        qcy<Object> qcyVar2 = qcyVarArr[1];
        pgnVar.b(subscribe);
    }
}
