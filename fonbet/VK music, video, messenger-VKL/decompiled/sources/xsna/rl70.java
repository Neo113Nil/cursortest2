package xsna;

import com.vk.clips.sdk.shared.api.analytics.SdkClipViewerClick;
import com.vk.clips.sdk.shared.item.clip.ClipItemAction;
import com.vk.clips.sdk.shared.item.clip.ClipItemPatch;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.a7f0;
import xsna.m0x;
import xsna.n0x;
import xsna.qvq;
import xsna.wk50;
import xsna.z2d;

/* compiled from: NpsActionApplier.kt */
/* loaded from: classes17.dex */
public final class rl70 implements oj50<z2d, ClipItemAction, ClipItemPatch> {
    public static final /* synthetic */ qcy<Object>[] e;
    public final izs<qvq, s3q0> a;
    public final pih0 b;
    public final m0x c;
    public final d80 d = new d80();

    /* compiled from: NpsActionApplier.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipItemAction.Nps.Close.values().length];
            try {
                iArr[ClipItemAction.Nps.Close.Immediately.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipItemAction.Nps.Close.Delayed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(rl70.class, "closeDisposable", "getCloseDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        e = new qcy[]{mutablePropertyReference1Impl};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rl70(izs<? super qvq, s3q0> izsVar, pih0 pih0Var, m0x m0xVar) {
        this.a = izsVar;
        this.b = pih0Var;
        this.c = m0xVar;
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        n0x.b bVar;
        z2d z2dVar = (z2d) km50Var;
        ClipItemAction clipItemAction = (ClipItemAction) kj50Var;
        if ((z2dVar instanceof z2d.a) && (clipItemAction instanceof ClipItemAction.Nps)) {
            ClipItemAction.Nps nps = (ClipItemAction.Nps) clipItemAction;
            if (nps instanceof ClipItemAction.Nps.b) {
                z2d.a aVar2 = (z2d.a) z2dVar;
                ClipItemAction.Nps.b bVar2 = (ClipItemAction.Nps.b) clipItemAction;
                n0x n0xVar = aVar2.v;
                bVar = n0xVar instanceof n0x.b ? (n0x.b) n0xVar : null;
                if (bVar == null) {
                    return;
                }
                this.a.invoke(new qvq.g.b.a(aVar2.b.b, bVar.b.e.get(bVar2.b).b));
                return;
            }
            boolean z = nps instanceof ClipItemAction.Nps.c;
            pih0 pih0Var = this.b;
            if (z) {
                z2d.a aVar3 = (z2d.a) z2dVar;
                n0x n0xVar2 = aVar3.v;
                bVar = n0xVar2 instanceof n0x.b ? (n0x.b) n0xVar2 : null;
                if (bVar == null) {
                    return;
                }
                pih0Var.o2(new SdkClipViewerClick.InlineNps(aVar3.b.b(), bVar.a.b, bVar.b.c, SdkClipViewerClick.InlineNps.ClickEvent.SKIP));
                aVar.a(ClipItemAction.Nps.Close.Immediately);
                return;
            }
            if (nps instanceof ClipItemAction.Nps.e) {
                z2d.a aVar4 = (z2d.a) z2dVar;
                n0x n0xVar3 = aVar4.v;
                bVar = n0xVar3 instanceof n0x.b ? (n0x.b) n0xVar3 : null;
                if (bVar == null) {
                    return;
                }
                pih0Var.ai(new lfd(aVar4.b.a, bVar.a.b, bVar.b.c));
                return;
            }
            boolean z2 = nps instanceof ClipItemAction.Nps.d;
            m0x m0xVar = this.c;
            if (z2) {
                String str = ((z2d.a) z2dVar).b.b;
                io.reactivex.rxjava3.subjects.f<m0x.a> fVar = m0xVar.a;
                ju1 ju1Var = new ju1(new l9n(str, 2), 29);
                fVar.getClass();
                a7f0.a.e(aVar, new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, ju1Var).U(new tq(new n82(24), 15)), null, new nt10(aVar, 10), null, null, 13);
                return;
            }
            boolean z3 = nps instanceof ClipItemAction.Nps.Close;
            qcy<Object>[] qcyVarArr = e;
            d80 d80Var = this.d;
            if (!z3) {
                if (!(nps instanceof ClipItemAction.Nps.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                qcy<Object> qcyVar = qcyVarArr[0];
                d80Var.g(null);
                return;
            }
            z2d.a aVar5 = (z2d.a) z2dVar;
            int i = a.$EnumSwitchMapping$0[((ClipItemAction.Nps.Close) clipItemAction).ordinal()];
            if (i == 1) {
                m0xVar.a(aVar5.b.b, n0x.a.a);
                return;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            qcy<Object> qcyVar2 = qcyVarArr[0];
            io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) d80Var.b;
            if (cVar == null || cVar.h()) {
                io.reactivex.rxjava3.disposables.c d = a7f0.a.d(aVar, new io.reactivex.rxjava3.internal.operators.completable.h(io.reactivex.rxjava3.core.a.r(1300L, TimeUnit.MILLISECONDS), new cwc(1, this, aVar5)), null, null, null, 7);
                qcy<Object> qcyVar3 = qcyVarArr[0];
                d80Var.g(d);
            }
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
