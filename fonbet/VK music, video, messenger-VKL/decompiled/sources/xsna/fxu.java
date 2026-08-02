package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;
import com.vk.ecomm.onlinebooking.impl.calendar.BookingCalendarScreenState;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: BookingCalendarDayBlockView.kt */
/* loaded from: classes18.dex */
public final class fxu {
    public final Context a;
    public final xvy b;
    public final mtk0 c;
    public final f1m d = bbk0.b(new s1m(this, 15));
    public final f1m e = bbk0.b(new mxj(this, 22));
    public final f1m f = bbk0.b(new gbj(this, 19));
    public final f1m g = bbk0.b(new u3k(this, 19));
    public final q630 h;
    public final q630 i;
    public final q630 j;

    public fxu(Context context, mtk0<? extends List<BookingCalendarScreenState.DaySelector.a>> mtk0Var, xvy xvyVar) {
        this.a = context;
        this.b = xvyVar;
        this.c = mtk0Var;
        q630.a aVar = q630.a.a;
        this.h = txj0.f(aVar, 1.0f);
        this.i = s200.H(aVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, 6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 9);
        this.j = fto0.t(aVar, 180.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0192, code lost:
    
        if (r13 == r8) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        a.C0011a.C0012a c0012a;
        androidx.compose.runtime.a M = aVar.M(1780609115);
        int i2 = i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 17) != 16)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1780609115, i2, -1, "com.vk.ecomm.onlinebooking.impl.calendar.ui.HeaderImpl.Content (BookingCalendarDayBlockView.kt:162)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (x == c0012a2) {
                x = bap.j(EmptyCoroutineContext.b, M);
                M.R(x);
            }
            yvj yvjVar = (yvj) x;
            dt1.a.getClass();
            ty6.b bVar = dt1.a.l;
            a.l lVar = androidx.compose.foundation.layout.a.a;
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, bVar, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, this.h);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar2 = cri.a.g;
            k9q0.w(M, valueOf, bVar2);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            com.vk.core.compose.component.group.header.f a2 = f.a.a((String) this.d.getValue(), null, null, null, null, null, null, null, false, M, 805306368, 510);
            b.c cVar2 = b.c.a;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            com.vk.core.compose.component.group.header.g.b(a2, ahn.E(new xpy(1.0f, true), "calendar_period"), cVar2, null, null, null, false, M, 384, 120);
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, this.i);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar2, M, c2678a);
            k9q0.w(M, c2, dVar);
            float f = 4;
            q630.a aVar3 = q630.a.a;
            q630 H = s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
            ButtonSize buttonSize = ButtonSize.Medium;
            ButtonStyle buttonStyle = ButtonStyle.Tertiary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Neutral;
            boolean booleanValue = ((Boolean) this.e.getValue()).booleanValue();
            int i3 = i2 & 112;
            boolean y = M.y(yvjVar) | (i3 == 32);
            Object x2 = M.x();
            if (y) {
                c0012a = c0012a2;
            } else {
                c0012a = c0012a2;
            }
            x2 = new vf1(9, yvjVar, this);
            M.R(x2);
            a.C0011a.C0012a c0012a3 = c0012a;
            bhu0.c((gzs) x2, buttonSize, buttonStyle, buttonAppearance, H, null, null, booleanValue, null, null, null, false, kai.c(1197047470, new cxu(this, 0), M), M, 28080, 384, 3936);
            q630 H2 = s200.H(aVar3, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            boolean booleanValue2 = ((Boolean) this.f.getValue()).booleanValue();
            boolean y2 = M.y(yvjVar) | (i3 == 32);
            Object x3 = M.x();
            if (y2 || x3 == c0012a3) {
                x3 = new fy0(11, yvjVar, this);
                M.R(x3);
            }
            bhu0.c((gzs) x3, buttonSize, buttonStyle, buttonAppearance, H2, null, null, booleanValue2, null, null, null, false, kai.c(-1409082857, new gyn(this, 3), M), M, 28080, 384, 3936);
            M = M;
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qed(this, q630Var2, i, 7);
        }
    }
}
