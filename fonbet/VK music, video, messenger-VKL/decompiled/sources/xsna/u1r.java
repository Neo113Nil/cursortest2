package xsna;

import com.vk.clips.sdk.shared.feed.controller.mvi.state.spinner.ClipSpinnerEntryPoint;
import kotlin.NoWhenBranchMatchedException;
import xsna.c2r;
import xsna.q4r;
import xsna.qvq;
import xsna.wk50;

/* compiled from: FeedLoadingDelegate.kt */
/* loaded from: classes17.dex */
public final class u1r implements oj50<q4r, qvq, c2r> {

    /* compiled from: FeedLoadingDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipSpinnerEntryPoint.values().length];
            try {
                iArr[ClipSpinnerEntryPoint.MenuActions.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipSpinnerEntryPoint.InlineNpsSendResult.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        q4r q4rVar = (q4r) km50Var;
        qvq qvqVar = (qvq) kj50Var;
        if ((qvqVar instanceof qvq.j) && (q4rVar instanceof q4r.a)) {
            qvq.j jVar = (qvq.j) qvqVar;
            if (jVar instanceof qvq.j.b) {
                qvq.j.b bVar = (qvq.j.b) qvqVar;
                if (epx.f(bVar, qvq.j.b.a.b)) {
                    aVar.b(c2r.g.a.C2635a.b);
                    return;
                } else {
                    if (!epx.f(bVar, qvq.j.b.C3577b.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.b(c2r.g.a.b.b);
                    return;
                }
            }
            if (jVar instanceof qvq.j.d) {
                aVar.b(new c2r.g.c(((qvq.j.d) qvqVar).b));
                return;
            }
            if (jVar instanceof qvq.j.c) {
                aVar.b(c2r.g.b.b);
                return;
            }
            if (!(jVar instanceof qvq.j.a)) {
                throw new NoWhenBranchMatchedException();
            }
            uch0 uch0Var = ((q4r.a) q4rVar).j;
            if (!(uch0Var instanceof vch0)) {
                aVar.a(qvq.l.a.b);
                aVar.a(qvq.g.a.b);
                return;
            }
            int i = a.$EnumSwitchMapping$0[((vch0) uch0Var).b.ordinal()];
            if (i == 1) {
                aVar.a(qvq.l.a.b);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.a(qvq.g.a.b);
            }
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
