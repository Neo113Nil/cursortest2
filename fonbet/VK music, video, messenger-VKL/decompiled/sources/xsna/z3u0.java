package xsna;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.dto.common.VerifyInfo;
import com.vk.stories.design.view.stats.tabs.viewers.model.StoryUserViewer;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.kpv;
import xsna.phw;
import xsna.q630;

/* compiled from: ViewersUserViewHolder.kt */
/* loaded from: classes6.dex */
public final class z3u0 extends vfz<StoryUserViewer> {
    public final ComposeView l;
    public final boolean m;
    public final izs<StoryUserViewer, s3q0> n;
    public final wzs<StoryUserViewer, Integer, s3q0> o;
    public final Object p;
    public List<zam0> q;

    public z3u0(ComposeView composeView, boolean z, cim0 cim0Var, p00 p00Var) {
        super(composeView);
        this.l = composeView;
        this.m = z;
        this.n = cim0Var;
        this.o = p00Var;
        this.p = msy.a(LazyThreadSafetyMode.NONE, new h13(29));
        this.q = EmptyList.b;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vfz
    /* renamed from: h6, reason: merged with bridge method [inline-methods] */
    public final void i6(final StoryUserViewer storyUserViewer) {
        Object obj;
        final float f = storyUserViewer.j0 ? 1.0f : 0.64f;
        VerifyInfo verifyInfo = storyUserViewer.B;
        boolean z = verifyInfo.b;
        ComposeView composeView = this.l;
        final Drawable drawable = null;
        final Drawable h = z ? VerifyInfoHelper.h(VerifyInfoHelper.a, verifyInfo, composeView.getContext(), null, 28) : null;
        if (storyUserViewer.h0 && ((Boolean) this.p.getValue()).booleanValue()) {
            Iterator<T> it = this.q.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                int i = ((zam0) obj).a;
                Integer num = storyUserViewer.i0;
                if (num != null && i == num.intValue()) {
                    break;
                }
            }
            zam0 zam0Var = (zam0) obj;
            if (zam0Var != null) {
                drawable = zam0Var.b;
            }
        }
        composeView.setContent(new jai(-54234686, new wzs() { // from class: xsna.x3u0
            @Override // xsna.wzs
            public final Object invoke(Object obj2, Object obj3) {
                lg90 lg90Var;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-54234686, intValue, -1, "com.vk.stories.design.view.stats.tabs.viewers.adapter.ViewersUserViewHolder.bind.<anonymous> (ViewersUserViewHolder.kt:59)");
                    }
                    Drawable drawable2 = drawable;
                    final StoryUserViewer storyUserViewer2 = storyUserViewer;
                    if (drawable2 != null) {
                        aVar.K(-797767529);
                        lg90Var = w65.p(drawable2, aVar, 0);
                        aVar.j();
                    } else if (storyUserViewer2.h0) {
                        lg90Var = or.b(aVar, -797669383, R.drawable.vk_icon_like_circle_fill_red_20, aVar, 0);
                    } else {
                        aVar.K(-797564325);
                        aVar.j();
                        lg90Var = null;
                    }
                    final lg90 lg90Var2 = lg90Var;
                    final z3u0 z3u0Var = this;
                    final float f2 = f;
                    final Drawable drawable3 = h;
                    rrv0.e(true, null, null, null, null, null, kai.c(559705381, new wzs() { // from class: xsna.y3u0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // xsna.wzs
                        public final Object invoke(Object obj4, Object obj5) {
                            a.C0011a.C0012a c0012a;
                            z3u0 z3u0Var2;
                            wh50 wh50Var;
                            iy5 iy5Var;
                            a.C0011a.C0012a c0012a2;
                            com.vk.core.compose.component.cell.content.x xVar;
                            androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj4;
                            int intValue2 = ((Integer) obj5).intValue();
                            if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(559705381, intValue2, -1, "com.vk.stories.design.view.stats.tabs.viewers.adapter.ViewersUserViewHolder.bind.<anonymous>.<anonymous> (ViewersUserViewHolder.kt:65)");
                                }
                                wh50 c = androidx.compose.runtime.k.c(StoryUserViewer.this, aVar2, 0);
                                z3u0 z3u0Var3 = z3u0Var;
                                wh50 c2 = androidx.compose.runtime.k.c(Integer.valueOf(z3u0Var3.getAbsoluteAdapterPosition()), aVar2, 0);
                                q630 E = ahn.E(o19.a(txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 54, 1, q630.a.a), f2), "viewer_" + ((StoryUserViewer) c.getValue()).c);
                                Cell$Left.Main.Size size = Cell$Left.Main.Size.Small;
                                phw a = phw.a.a(tlw.a(new vlw(((StoryUserViewer) c.getValue()).o(40), null), aVar2, 0), null, null, null, null, aVar2, 196616, 30);
                                lg90 lg90Var3 = lg90Var2;
                                a.C0011a.C0012a c0012a3 = a.C0011a.a;
                                if (lg90Var3 != null) {
                                    aVar2.K(1120701837);
                                    float f3 = 20;
                                    long b = byc0.b(f3, f3);
                                    long j = l5g.k;
                                    boolean J = aVar2.J(c);
                                    Object x = aVar2.x();
                                    if (J || x == c0012a3) {
                                        x = new tc8(3, c);
                                        aVar2.R(x);
                                    }
                                    com.vk.core.compose.component.semantics.a a2 = com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3);
                                    wh50Var = c2;
                                    c0012a = c0012a3;
                                    z3u0Var2 = z3u0Var3;
                                    iy5Var = kpv.a.a(lg90Var3, j, b, null, false, a2, null, aVar2, 100663736, 184);
                                    aVar2 = aVar2;
                                    aVar2.j();
                                } else {
                                    c0012a = c0012a3;
                                    z3u0Var2 = z3u0Var3;
                                    wh50Var = c2;
                                    aVar2.K(1005995599);
                                    aVar2.j();
                                    iy5Var = rep.a;
                                }
                                androidx.compose.runtime.a aVar3 = aVar2;
                                com.vk.core.compose.component.cell.content.t a3 = com.vk.core.compose.component.cell.content.e.a(a, size, iy5Var, null, null, null, null, aVar3, 100663344, 248);
                                com.vk.core.compose.component.cell.content.k0 a4 = Cell$Middle.a.a(Cell$Middle.d.b.a(((StoryUserViewer) c.getValue()).e, null, Cell$Middle.d.a.InterfaceC0732a.C0733a.a(w65.p(drawable3, aVar3, 0), 0L, null, null, aVar3, 24584, 14), 1, null, null, aVar3, 12610560, 98), null, null, null, aVar3, 196608, 30);
                                androidx.compose.runtime.a aVar4 = aVar3;
                                if (z3u0Var2.m) {
                                    aVar4.K(1121677345);
                                    lg90 a5 = pg90.a(R.drawable.vk_icon_more_vertical_16, 0, aVar4);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                    }
                                    ylu0 ylu0Var = (ylu0) aVar4.r(rrv0.a);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    long j2 = ylu0Var.getIcon().l;
                                    String N = d370.N(R.string.more, 0, aVar4);
                                    boolean J2 = aVar4.J(c);
                                    Object x2 = aVar4.x();
                                    c0012a2 = c0012a;
                                    if (J2 || x2 == c0012a2) {
                                        x2 = new uc8(6, c);
                                        aVar4.R(x2);
                                    }
                                    com.vk.core.compose.component.semantics.a a6 = com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3);
                                    wh50 wh50Var2 = wh50Var;
                                    boolean y = aVar4.y(z3u0Var2) | aVar4.J(c) | aVar4.J(wh50Var2);
                                    Object x3 = aVar4.x();
                                    if (y || x3 == c0012a2) {
                                        x3 = new defpackage.t(z3u0Var2, c, wh50Var2, 4);
                                        aVar4.R(x3);
                                    }
                                    com.vk.core.compose.component.cell.content.x a7 = com.vk.core.compose.component.cell.content.p.a(a5, j2, 0L, N, (gzs) x3, a6, aVar4, 1572872, 4);
                                    aVar4 = aVar4;
                                    aVar4.j();
                                    xVar = a7;
                                } else {
                                    c0012a2 = c0012a;
                                    xVar = null;
                                    aVar4.K(1122356120);
                                    aVar4.j();
                                }
                                boolean y2 = aVar4.y(z3u0Var2) | aVar4.J(c);
                                Object x4 = aVar4.x();
                                if (y2 || x4 == c0012a2) {
                                    x4 = new qsd0(7, z3u0Var2, c);
                                    aVar4.R(x4);
                                }
                                wiu0.b(E, false, a3, a4, xVar, (gzs) x4, null, aVar4, 0, 66);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar2.h();
                            }
                            return s3q0.a;
                        }
                    }, aVar), aVar, 1572870, 62);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            }
        }, true));
    }
}
