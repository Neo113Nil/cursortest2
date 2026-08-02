package xsna;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.vk.community.design.compose.topbar.PassthroughThemedComposeView;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;

/* compiled from: CommunityProfileTopBarDelegates.kt */
/* loaded from: classes5.dex */
public final class o0z extends fuh {
    public final Object c;

    public o0z(guh guhVar) {
        super(guhVar);
        this.c = msy.a(LazyThreadSafetyMode.NONE, new ie3(14, guhVar, this));
    }

    @Override // xsna.fuh, xsna.euh
    public final void j(Rect rect) {
        super.j(rect);
        ViewGroup.LayoutParams layoutParams = this.a.a.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        int i = rect.top;
        if (i != 0 || marginLayoutParams.topMargin <= 0) {
            marginLayoutParams.topMargin = i;
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.fuh
    public final void n(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> z77Var;
        List<CommunityProfileViewState.Data.d> list;
        androidx.compose.runtime.a M = aVar.M(1700992803);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1700992803, i2, -1, "com.vk.profile.community.impl.ui.profile.viewdelegates.LegacyCommunityProfileTopBarDelegate.TopBarComposeContent (CommunityProfileTopBarDelegates.kt:123)");
            }
            CommunityProfileViewState.Data.e eVar = (CommunityProfileViewState.Data.e) ((zak0) this.b.b).getValue();
            if (eVar == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    z77Var = new qw6(this, i, 7);
                    s.d = z77Var;
                }
                return;
            }
            xph xphVar = (xph) this.c.getValue();
            if (eVar instanceof CommunityProfileViewState.Data.e.a) {
                list = ((CommunityProfileViewState.Data.e.a) eVar).a;
            } else {
                if (!(eVar instanceof CommunityProfileViewState.Data.e.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                list = ((CommunityProfileViewState.Data.e.b) eVar).b;
            }
            xphVar.a(list, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        s = M.s();
        if (s != null) {
            z77Var = new z77(this, i, 6);
            s.d = z77Var;
        }
    }

    @Override // xsna.fuh
    public final void o(final iuh iuhVar) {
        final boolean z = false;
        iuhVar.a.setShouldHandleTouchByComposeView(new izs() { // from class: xsna.huh
            /* JADX WARN: Code restructure failed: missing block: B:37:0x00f1, code lost:
            
                if (r5 != null) goto L53;
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x0116, code lost:
            
                if (r15.getY() > r2.getHeight()) goto L66;
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x00fb, code lost:
            
                if (r0.a() == null) goto L63;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x0105, code lost:
            
                if (r0.b() == null) goto L63;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x0109, code lost:
            
                if (r6.d != false) goto L63;
             */
            @Override // xsna.izs
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                zhf0 zhf0Var;
                ListBuilder.a aVar;
                zhf0 invoke;
                MotionEvent motionEvent = (MotionEvent) obj;
                iuh iuhVar2 = iuh.this;
                kg50 kg50Var = iuhVar2.c;
                PassthroughThemedComposeView passthroughThemedComposeView = iuhVar2.a;
                boolean z2 = true;
                if (((vak0) kg50Var).getFloatValue() < 0.1f && motionEvent.getAction() == 0) {
                    Object value = ((zak0) iuhVar2.b).getValue();
                    zhf0 zhf0Var2 = null;
                    CommunityProfileViewState.Data.e.b bVar = value instanceof CommunityProfileViewState.Data.e.b ? (CommunityProfileViewState.Data.e.b) value : null;
                    boolean z3 = bVar != null && bVar.g;
                    passthroughThemedComposeView.getLocationInWindow(new int[2]);
                    long j = (r6[0] << 32) | (r6[1] & 4294967295L);
                    long floatToRawIntBits = (Float.floatToRawIntBits(motionEvent.getX() + ((int) (j >> 32))) << 32) | (Float.floatToRawIntBits(motionEvent.getY() + ((int) (j & 4294967295L))) & 4294967295L);
                    gzs<zhf0> gzsVar = iuhVar2.l;
                    if (gzsVar == null || (zhf0Var = gzsVar.invoke()) == null || !s200.B(zhf0Var)) {
                        zhf0Var = null;
                    }
                    List I = rl3.I(new zhf0[]{zhf0Var, iuhVar2.b(), iuhVar2.a()});
                    ListBuilder e = e43.e();
                    e.addAll(I);
                    ListBuilder g = e.g();
                    if (!z3 || motionEvent.getY() > passthroughThemedComposeView.getHeight()) {
                        if (g == null || !g.isEmpty()) {
                            ListIterator listIterator = g.listIterator(0);
                            do {
                                aVar = (ListBuilder.a) listIterator;
                                if (aVar.hasNext()) {
                                }
                            } while (!((zhf0) aVar.next()).a(floatToRawIntBits));
                        }
                        boolean z4 = z;
                        if (z4) {
                            xax xaxVar = iuhVar2.o;
                            if (xaxVar.a) {
                                gzs<zhf0> gzsVar2 = iuhVar2.l;
                                if (gzsVar2 != null && (invoke = gzsVar2.invoke()) != null && s200.B(invoke)) {
                                    zhf0Var2 = invoke;
                                }
                            }
                            if (xaxVar.b) {
                            }
                            if (xaxVar.c) {
                            }
                        }
                        if (!z4 || !((ArrayList) I).isEmpty() || motionEvent.getY() > passthroughThemedComposeView.getHeight()) {
                            z2 = false;
                        }
                    }
                }
                return Boolean.valueOf(z2);
            }
        });
    }
}
