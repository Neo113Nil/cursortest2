package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Set;
import kotlin.collections.EmptySet;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: InspectorControlsView.kt */
/* loaded from: classes17.dex */
public final class h5x extends rpo0 {
    public final wh50 m;
    public final wh50 n;
    public final wh50 o;
    public final wh50 p;
    public final wh50 q;
    public final wh50 r;
    public final wh50 s;
    public final wh50 t;
    public final wh50 u;
    public final wh50 v;
    public final wh50 w;
    public final wh50 x;
    public final wh50 y;

    /* compiled from: InspectorControlsView.kt */
    public static final class a implements znj {
        public final /* synthetic */ atm0 b;
        public final /* synthetic */ h5x c;

        public a(atm0 atm0Var, h5x h5xVar) {
            this.b = atm0Var;
            this.c = h5xVar;
        }

        @Override // xsna.znj
        public final void g(znj znjVar, androidx.compose.runtime.a aVar, int i) {
            znj znjVar2;
            lg90 o;
            androidx.compose.runtime.a M = aVar.M(-1600681967);
            int i2 = (M.J(znjVar) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1600681967, i2, -1, "com.vk.core.tool.view.InspectorControlsView.SelectHighlightStyleContent.<anonymous>.<anonymous>.<no name provided>.Content (InspectorControlsView.kt:163)");
                }
                atm0 atm0Var = this.b;
                lzo0 d = nzo.d(3072, 6, M, atm0Var.b, false);
                h5x h5xVar = this.c;
                if (epx.f(h5xVar.getCurrentStyleConfig(), atm0Var)) {
                    M.K(1105871733);
                    qzu0.a.getClass();
                    o = qzu0.p(M);
                    M.j();
                } else {
                    M.K(1105968980);
                    qzu0.a.getClass();
                    o = qzu0.o(M);
                    M.j();
                }
                lqv B = znk0.B(o, 0L, 0L, M, 196616, 30);
                boolean y = M.y(h5xVar) | M.y(atm0Var);
                Object x = M.x();
                if (y || x == a.C0011a.a) {
                    x = new nh3(15, h5xVar, atm0Var);
                    M.R(x);
                }
                znjVar2 = znjVar;
                aou0.d(znjVar2, (gzs) x, null, null, false, B, d, null, M, i2 & 14, 78);
                M = M;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                znjVar2 = znjVar;
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new yku(this, znjVar2, i, 1);
            }
        }
    }

    public h5x(Context context) {
        super(context, null, 0);
        Boolean bool = Boolean.FALSE;
        this.m = androidx.compose.runtime.k.b(bool);
        this.n = androidx.compose.runtime.k.b(bool);
        this.o = androidx.compose.runtime.k.b(Boolean.TRUE);
        this.p = androidx.compose.runtime.k.b(EmptySet.b);
        this.q = androidx.compose.runtime.k.b(null);
        this.r = androidx.compose.runtime.k.b(null);
        this.s = androidx.compose.runtime.k.b(null);
        this.t = androidx.compose.runtime.k.b(null);
        this.u = androidx.compose.runtime.k.b(null);
        this.v = androidx.compose.runtime.k.b(bool);
        this.w = androidx.compose.runtime.k.b(null);
        this.x = androidx.compose.runtime.k.b(null);
        this.y = androidx.compose.runtime.k.b(null);
    }

    @Override // xsna.rpo0
    public final void A(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-69796782);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-69796782, i2, -1, "com.vk.core.tool.view.InspectorControlsView.ThemedContent (InspectorControlsView.kt:62)");
            }
            rrv0.d(null, null, null, null, kai.c(443053111, new com.vk.movika.tools.controls.seekbar.r(this, 6), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.v(this, i, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(final int i, final int i2, androidx.compose.runtime.a aVar, final String str, String str2, final gzs gzsVar, final boolean z) {
        final String str3;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(-1722651556);
        int i3 = (M.l(z) ? 32 : 16) | i | (M.y(gzsVar) ? 256 : 128);
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            str3 = str2;
            i3 |= M.J(str3) ? 2048 : 1024;
            if (M.t(i3 & 1, (i3 & 1171) == 1170)) {
                aVar2 = M;
                aVar2.h();
            } else {
                com.vk.core.compose.component.cell.content.h1 h1Var = null;
                if (i4 != 0) {
                    str3 = null;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1722651556, i3, -1, "com.vk.core.tool.view.InspectorControlsView.CheckboxSettingItem (InspectorControlsView.kt:122)");
                }
                com.vk.core.compose.component.cell.content.h1 a2 = Cell$Middle.d.b.a(str, null, null, 0, null, null, M, 12582918, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                if (str3 == null) {
                    M.K(1052019653);
                } else {
                    M.K(1052019654);
                    h1Var = Cell$Middle.c.b.b(str3, 0, null, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                }
                M.j();
                int i5 = i3 >> 3;
                wiu0.b(null, false, null, Cell$Middle.a.a(a2, h1Var, null, null, M, 196608, 28), o.c.a(com.vk.core.compose.component.cell.content.n.a(z, gzsVar, false, null, M, (i5 & 112) | (i5 & 14) | 24576, 12), null, null, null, null, M, 62), null, null, M, 0, 103);
                aVar2 = M;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.g5x
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int I = ne7.I(i | 1);
                        h5x.this.B(I, i2, (androidx.compose.runtime.a) obj, str, str3, gzsVar, z);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        str3 = str2;
        if (M.t(i3 & 1, (i3 & 1171) == 1170)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    public final void C(int i, androidx.compose.runtime.a aVar) {
        Object obj;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1032949755);
        int i2 = i | (M.y(this) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1032949755, i2, -1, "com.vk.core.tool.view.InspectorControlsView.LogContent (InspectorControlsView.kt:184)");
            }
            q630.a aVar3 = q630.a.a;
            q630 f = txj0.f(aVar3, 1.0f);
            float f2 = kqu0.v;
            q630 F = s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            yqv0.c("Логирование файлов", null, wlb0.h(M).getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).E, M, 6, 0, 8186);
            f9t.e(txj0.h(aVar3, kqu0.r), M, 0);
            yqv0.c("Позволяет собрать лог используемых XML и классов с момента нажатия на \"Start Log\" и до \"Dump Log\". Инструкцию по использованию см. в Confluence", null, wlb0.h(M).getText().q, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).d0, M, 6, 0, 8186);
            M.G();
            f9t.e(txj0.h(aVar3, f2), M, 0);
            q630 F2 = s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar3, 1.0f));
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.k, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, F2);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            ButtonSize buttonSize = ButtonSize.Small;
            ButtonStyle buttonStyle = ButtonStyle.Outline;
            ButtonAppearance buttonAppearance = ButtonAppearance.Neutral;
            int i3 = i2 & 14;
            boolean z = i3 == 4 || M.y(this);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new xis(this, 10);
                M.R(x);
            }
            obj = this;
            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, xpyVar, null, false, false, null, null, null, "Start log", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190176);
            f9t.e(txj0.v(aVar3, kqu0.t), M, 0);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            boolean z2 = true;
            xpy xpyVar2 = new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            if (i3 != 4 && !M.y(obj)) {
                z2 = false;
            }
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new cwg(obj, 28);
                M.R(x2);
            }
            bhu0.e((gzs) x2, buttonSize, buttonStyle, buttonAppearance, xpyVar2, null, false, false, null, null, null, "Dump log", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190176);
            aVar2 = M;
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            obj = this;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new dd4(obj, i, 4);
        }
    }

    public final void D(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-308007212);
        int i2 = i | (M.y(this) ? 4 : 2);
        boolean z = true;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-308007212, i2, -1, "com.vk.core.tool.view.InspectorControlsView.SelectHighlightStyleContent (InspectorControlsView.kt:138)");
            }
            com.vk.core.compose.component.cell.content.k0 a2 = Cell$Middle.a.a(Cell$Middle.d.b.a("Режим подсветки", null, null, 0, null, null, M, 12582918, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, M, 196608, 30);
            atm0 currentStyleConfig = getCurrentStyleConfig();
            String str = currentStyleConfig != null ? currentStyleConfig.b : "Choose config";
            int i3 = i2 & 14;
            boolean z2 = i3 == 4 || M.y(this);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new tju(this, 3);
                M.R(x);
            }
            wiu0.b(null, false, null, a2, o.c.a(null, null, com.vk.core.compose.component.cell.content.q.a(str, (gzs) x, M, 24576), null, null, M, 59), null, null, M, 0, 103);
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.f;
            boolean styleChooserExpanded = getStyleChooserExpanded();
            boolean z3 = i3 == 4 || M.y(this);
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new b1h(this, 22);
                M.R(x2);
            }
            gzs gzsVar = (gzs) x2;
            if (i3 != 4 && !M.y(this)) {
                z = false;
            }
            Object x3 = M.x();
            if (z || x3 == c0012a) {
                x3 = new m1k(this, 17);
                M.R(x3);
            }
            aou0.g(styleChooserExpanded, gzsVar, q630.a.a, ty6Var, 0L, null, null, (izs) x3, M, 3456, PsExtractor.VIDEO_STREAM_MASK);
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.u(this, i, 7);
        }
    }

    public final Set<atm0> getAllStyles() {
        return (Set) ((zak0) this.p).getValue();
    }

    public final boolean getAreViewsClickable() {
        return ((Boolean) ((zak0) this.n).getValue()).booleanValue();
    }

    public final atm0 getCurrentStyleConfig() {
        return (atm0) ((zak0) this.w).getValue();
    }

    public final izs<Boolean, s3q0> getOnChangeFABVisible() {
        return (izs) ((zak0) this.s).getValue();
    }

    public final izs<Boolean, s3q0> getOnChangeHighlight() {
        return (izs) ((zak0) this.q).getValue();
    }

    public final izs<atm0, s3q0> getOnChangeStyleConfig() {
        return (izs) ((zak0) this.u).getValue();
    }

    public final izs<Boolean, s3q0> getOnChangeViewsAreClickable() {
        return (izs) ((zak0) this.r).getValue();
    }

    public final gzs<s3q0> getOnClickClose() {
        return (gzs) ((zak0) this.t).getValue();
    }

    public final gzs<s3q0> getOnLogDump() {
        return (gzs) ((zak0) this.y).getValue();
    }

    public final gzs<s3q0> getOnLogStart() {
        return (gzs) ((zak0) this.x).getValue();
    }

    public final boolean getStyleChooserExpanded() {
        return ((Boolean) ((zak0) this.v).getValue()).booleanValue();
    }

    public final void setAllStyles(Set<atm0> set) {
        ((zak0) this.p).setValue(set);
    }

    public final void setAreViewsClickable(boolean z) {
        ((zak0) this.n).setValue(Boolean.valueOf(z));
    }

    public final void setCurrentStyleConfig(atm0 atm0Var) {
        ((zak0) this.w).setValue(atm0Var);
    }

    public final void setFABVisible(boolean z) {
        ((zak0) this.o).setValue(Boolean.valueOf(z));
    }

    public final void setInspectorEnabled(boolean z) {
        ((zak0) this.m).setValue(Boolean.valueOf(z));
    }

    public final void setOnChangeFABVisible(izs<? super Boolean, s3q0> izsVar) {
        ((zak0) this.s).setValue(izsVar);
    }

    public final void setOnChangeHighlight(izs<? super Boolean, s3q0> izsVar) {
        ((zak0) this.q).setValue(izsVar);
    }

    public final void setOnChangeStyleConfig(izs<? super atm0, s3q0> izsVar) {
        ((zak0) this.u).setValue(izsVar);
    }

    public final void setOnChangeViewsAreClickable(izs<? super Boolean, s3q0> izsVar) {
        ((zak0) this.r).setValue(izsVar);
    }

    public final void setOnClickClose(gzs<s3q0> gzsVar) {
        ((zak0) this.t).setValue(gzsVar);
    }

    public final void setOnLogDump(gzs<s3q0> gzsVar) {
        ((zak0) this.y).setValue(gzsVar);
    }

    public final void setOnLogStart(gzs<s3q0> gzsVar) {
        ((zak0) this.x).setValue(gzsVar);
    }

    public final void setStyleChooserExpanded(boolean z) {
        ((zak0) this.v).setValue(Boolean.valueOf(z));
    }
}
