package xsna;

import android.view.View;
import com.vk.catalog2.video.VideoCatalogId;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.h7v;

/* compiled from: WarmupSearchTooltipManager.kt */
/* loaded from: classes16.dex */
public final class fbx0 {
    public static final /* synthetic */ qcy<Object>[] e;
    public final VideoCatalogId a;
    public final h7v b;
    public boolean c;
    public final pgn d;

    /* compiled from: WarmupSearchTooltipManager.kt */
    public static final class a implements h7v.b {
        public final /* synthetic */ io.reactivex.rxjava3.core.r<Boolean> a;

        public a(io.reactivex.rxjava3.core.r<Boolean> rVar) {
            this.a = rVar;
        }

        @Override // xsna.h7v.b
        public final void a(boolean z) {
            if (z) {
                Boolean bool = Boolean.TRUE;
                io.reactivex.rxjava3.core.r<Boolean> rVar = this.a;
                rVar.onNext(bool);
                rVar.onComplete();
            }
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(fbx0.class, "disposable", "getDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        e = new qcy[]{mutablePropertyReference1Impl};
    }

    public fbx0(VideoCatalogId videoCatalogId) {
        this.a = videoCatalogId;
        bpn0 bpn0Var = pla.a;
        this.b = ((wvw) (bpn0Var == null ? null : bpn0Var).getValue()).b();
        this.d = new pgn();
    }

    public final void a(View view) {
        Hint p;
        if (view != null && this.a == VideoCatalogId.HOME) {
            HintId hintId = HintId.WARMUP_ONBOARDING_TOOLTIP;
            String id = hintId.getId();
            h7v h7vVar = this.b;
            if (h7vVar.a(id) && (p = h7vVar.p(hintId.getId())) != null) {
                b(io.reactivex.rxjava3.core.q.m(new io.reactivex.rxjava3.internal.operators.observable.q(new o860(this, 17)), new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.q(new qw80(view, 20)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a), new gs00(new oq0(this, view, p, 10), 24)).subscribe());
            }
        }
    }

    public final void b(io.reactivex.rxjava3.disposables.c cVar) {
        qcy<Object> qcyVar = e[0];
        this.d.b(cVar);
    }
}
