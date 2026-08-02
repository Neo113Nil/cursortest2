package xsna;

import com.vk.clips.sdk.models.SdkVideoRestriction;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.item.clip.ClipItemAction;
import com.vk.clips.sdk.shared.item.clip.ClipItemPatch;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.a7f0;
import xsna.m0d;
import xsna.sws;
import xsna.t0d;
import xsna.t1d;
import xsna.wk50;
import xsna.z2d;

/* compiled from: FullVideoActionApplier.kt */
/* loaded from: classes17.dex */
public final class rws implements oj50<z2d, ClipItemAction, ClipItemPatch> {
    public static final /* synthetic */ qcy<Object>[] f = {new MutablePropertyReference1Impl(rws.class, "fullVideoLoadDisposable", "getFullVideoLoadDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0), p5j.a(0, rws.class, "loadingSubjectDisposable", "getLoadingSubjectDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", fpf0.a)};
    public final f4z a;
    public final f4z b;
    public final plh0 c;
    public final d80 d = new d80();
    public final d80 e = new d80();

    public rws(f4z f4zVar, f4z f4zVar2, plh0 plh0Var) {
        this.a = f4zVar;
        this.b = f4zVar2;
        this.c = plh0Var;
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        z2d z2dVar = (z2d) km50Var;
        ClipItemAction clipItemAction = (ClipItemAction) kj50Var;
        if ((z2dVar instanceof z2d.a) && (clipItemAction instanceof ClipItemAction.h)) {
            ClipItemAction.h hVar = (ClipItemAction.h) clipItemAction;
            if (hVar.equals(ClipItemAction.h.c.b)) {
                sws swsVar = ((z2d.a) z2dVar).u.a;
                if (!(swsVar instanceof sws.a)) {
                    aVar.a(ClipItemAction.h.b.b);
                    return;
                }
                SdkVideoFile sdkVideoFile = ((sws.a) swsVar).a;
                SdkVideoRestriction O = sdkVideoFile.O();
                f4z f4zVar = this.b;
                if (O == null || O.h) {
                    f4zVar.b(new t1d.z(sdkVideoFile));
                    return;
                } else {
                    f4zVar.b(new t1d.c0(O));
                    return;
                }
            }
            boolean equals = hVar.equals(ClipItemAction.h.b.b);
            d80 d80Var = this.e;
            qcy<Object>[] qcyVarArr = f;
            d80 d80Var2 = this.d;
            if (!equals) {
                if (!hVar.equals(ClipItemAction.h.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                qcy<Object> qcyVar = qcyVarArr[0];
                d80Var2.g(null);
                qcy<Object> qcyVar2 = qcyVarArr[1];
                d80Var.g(null);
                return;
            }
            m0d.a aVar2 = ((z2d.a) z2dVar).b.i;
            if (!(aVar2 instanceof m0d.a.C3314a)) {
                this.a.b(t0d.k.c.a);
                return;
            }
            qcy<Object> qcyVar3 = qcyVarArr[0];
            io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) d80Var2.b;
            if (cVar == null || cVar.h()) {
                io.reactivex.rxjava3.subjects.f fVar = new io.reactivex.rxjava3.subjects.f();
                io.reactivex.rxjava3.disposables.c e = a7f0.a.e(aVar, new io.reactivex.rxjava3.internal.operators.observable.q2(new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.mixed.o(fVar, new j7(new oa(28), 24)), io.reactivex.rxjava3.internal.functions.a.d, new dh1(aVar, 3)), new rt0(new x50(18), 14)), null, new i4h(aVar, 24), null, null, 13);
                qcy<Object> qcyVar4 = qcyVarArr[1];
                d80Var.g(e);
                m0d.a.C3314a c3314a = (m0d.a.C3314a) aVar2;
                io.reactivex.rxjava3.disposables.c f2 = a7f0.a.f(aVar, new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(this.c.a(c3314a.a, Collections.singletonList(r11.b(new StringBuilder(), c3314a.a.b, '_', c3314a.b))), new b60(new n3i(fVar, 22), 27)), new jad(fVar, 2)), new ng3(20, this, aVar), new nvg(this, 25), 1);
                qcy<Object> qcyVar5 = qcyVarArr[0];
                d80Var2.g(f2);
            }
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
