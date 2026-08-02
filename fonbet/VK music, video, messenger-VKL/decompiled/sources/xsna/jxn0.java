package xsna;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.tabbar.core.api.domain.TabbarSuggestState;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import java.util.List;
import xsna.air;
import xsna.axn0;
import xsna.bap;
import xsna.bhu0;
import xsna.bxn0;
import xsna.c6j;
import xsna.cri;
import xsna.cxn0;
import xsna.d370;
import xsna.dp10;
import xsna.drm0;
import xsna.dt1;
import xsna.dxn0;
import xsna.e4p0;
import xsna.ep10;
import xsna.exn0;
import xsna.frv0;
import xsna.fxn0;
import xsna.gxn0;
import xsna.gzs;
import xsna.hik0;
import xsna.hxn0;
import xsna.ixn0;
import xsna.izs;
import xsna.jgp;
import xsna.jxn0;
import xsna.op10;
import xsna.or;
import xsna.q630;
import xsna.s200;
import xsna.s3q0;
import xsna.s5j;
import xsna.tgi0;
import xsna.tra0;
import xsna.txj0;
import xsna.us2;
import xsna.vqv;
import xsna.wh50;
import xsna.wlb0;
import xsna.xga0;
import xsna.yqv0;
import xsna.zo10;
import xsna.zq;

/* compiled from: TabbarSuggestTopPanel.kt */
/* loaded from: classes6.dex */
public final class jxn0 {
    public static final void a(final TabbarSuggestState tabbarSuggestState, final float f, final String str, final String str2, final pwn0 pwn0Var, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(-486962992);
        int i2 = i | (M.o(tabbarSuggestState.ordinal()) ? 4 : 2) | (M.n(f) ? 32 : 16) | (M.J(str) ? 256 : 128) | (M.J(str2) ? 2048 : 1024) | (M.J(pwn0Var) ? 16384 : 8192) | (M.J(q630Var) ? 131072 : 65536);
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-486962992, i2, -1, "com.vk.tabbar.settings.impl.suggests.TabbarSuggestTopPanel (TabbarSuggestTopPanel.kt:43)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            int i3 = i2 & 14;
            int i4 = i2 >> 3;
            b(tabbarSuggestState, str, str2, pwn0Var, M, i3 | (i4 & 112) | (i4 & 896) | (i4 & 7168));
            M.G();
            ttn0.a(txj0.s(kci.m(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a), 20, 8), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(f, str, str2, pwn0Var, q630Var, i) { // from class: xsna.ywn0
                public final /* synthetic */ float c;
                public final /* synthetic */ String d;
                public final /* synthetic */ String e;
                public final /* synthetic */ pwn0 f;
                public final /* synthetic */ q630 g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    jxn0.a(TabbarSuggestState.this, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final TabbarSuggestState tabbarSuggestState, final String str, final String str2, final pwn0 pwn0Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1466625086);
        if ((i & 6) == 0) {
            i2 = (M.o(tabbarSuggestState.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(pwn0Var) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1466625086, i2, -1, "com.vk.tabbar.settings.impl.suggests.TabbarSuggestTopPanelContent (TabbarSuggestTopPanel.kt:68)");
            }
            q630 C = txj0.C(q630.a.a, null, 3);
            M.K(-1003410150);
            M.K(212064437);
            M.j();
            azl azlVar = (azl) M.r(uvi.h);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = new op10(azlVar);
                M.R(x);
            }
            final op10 op10Var = (op10) x;
            Object x2 = M.x();
            if (x2 == obj) {
                x2 = new c6j();
                M.R(x2);
            }
            final c6j c6jVar = (c6j) x2;
            Object x3 = M.x();
            if (x3 == obj) {
                x3 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x3);
            }
            final wh50 wh50Var = (wh50) x3;
            Object x4 = M.x();
            if (x4 == obj) {
                x4 = new h6j(c6jVar);
                M.R(x4);
            }
            final h6j h6jVar = (h6j) x4;
            Object x5 = M.x();
            if (x5 == obj) {
                x5 = androidx.compose.runtime.k.a(s3q0.a, w65.e);
                M.R(x5);
            }
            final wh50 wh50Var2 = (wh50) x5;
            boolean y = M.y(op10Var) | M.o(257);
            Object x6 = M.x();
            if (y || x6 == obj) {
                x6 = new cp10() { // from class: com.vk.tabbar.settings.impl.suggests.TabbarSuggestTopPanelKt$TabbarSuggestTopPanelContent$$inlined$ConstraintLayout$2
                    @Override // xsna.cp10
                    public final dp10 b(ep10 ep10Var, final List<? extends zo10> list, long j) {
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        wh50.this.getValue();
                        long f = op10Var.f(j, ep10Var.getLayoutDirection(), h6jVar, list, linkedHashMap);
                        wh50Var.getValue();
                        final op10 op10Var2 = op10Var;
                        return ep10Var.Q((int) (f >> 32), (int) (f & 4294967295L), jgp.b, new izs<tra0.a, s3q0>() { // from class: com.vk.tabbar.settings.impl.suggests.TabbarSuggestTopPanelKt$TabbarSuggestTopPanelContent$$inlined$ConstraintLayout$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // xsna.izs
                            public final s3q0 invoke(tra0.a aVar2) {
                                op10.this.e(aVar2, list, linkedHashMap);
                                return s3q0.a;
                            }
                        });
                    }
                };
                M.R(x6);
            }
            cp10 cp10Var = (cp10) x6;
            Object x7 = M.x();
            if (x7 == obj) {
                x7 = new gzs<s3q0>() { // from class: com.vk.tabbar.settings.impl.suggests.TabbarSuggestTopPanelKt$TabbarSuggestTopPanelContent$$inlined$ConstraintLayout$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.gzs
                    public final s3q0 invoke() {
                        wh50.this.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                        h6jVar.e = true;
                        return s3q0.a;
                    }
                };
                M.R(x7);
            }
            final gzs gzsVar = (gzs) x7;
            boolean y2 = M.y(op10Var);
            Object x8 = M.x();
            if (y2 || x8 == obj) {
                x8 = new izs<tgi0, s3q0>() { // from class: com.vk.tabbar.settings.impl.suggests.TabbarSuggestTopPanelKt$TabbarSuggestTopPanelContent$$inlined$ConstraintLayout$4
                    {
                        super(1);
                    }

                    @Override // xsna.izs
                    public final s3q0 invoke(tgi0 tgi0Var) {
                        e4p0.a(tgi0Var, op10.this);
                        return s3q0.a;
                    }
                };
                M.R(x8);
            }
            joy.a(egi0.b(C, false, (izs) x8), kai.c(1200550679, new wzs<androidx.compose.runtime.a, Integer, s3q0>() { // from class: com.vk.tabbar.settings.impl.suggests.TabbarSuggestTopPanelKt$TabbarSuggestTopPanelContent$$inlined$ConstraintLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // xsna.wzs
                public final s3q0 invoke(a aVar2, Integer num) {
                    int i3;
                    int i4;
                    q630 q630Var;
                    float f;
                    int i5;
                    int i6;
                    a aVar3 = aVar2;
                    int intValue = num.intValue();
                    if ((intValue & 3) == 2 && aVar3.e()) {
                        aVar3.h();
                    } else {
                        if (b.d()) {
                            b.f(1200550679, intValue, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                        }
                        wh50.this.setValue(s3q0.a);
                        c6j c6jVar2 = c6jVar;
                        int i7 = c6jVar2.b;
                        c6jVar2.l();
                        c6j c6jVar3 = c6jVar;
                        aVar3.K(-1715730873);
                        c6j c6jVar4 = c6j.this;
                        s5j j = c6jVar4.j();
                        s5j j2 = c6jVar4.j();
                        s5j j3 = c6jVar4.j();
                        s5j j4 = c6jVar4.j();
                        s5j j5 = c6jVar4.j();
                        s5j j6 = c6jVar4.j();
                        Object x9 = aVar3.x();
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (x9 == c0012a) {
                            x9 = axn0.b;
                            aVar3.R(x9);
                        }
                        q630.a aVar4 = q630.a.a;
                        q630 i8 = c6j.i(aVar4, j6, (izs) x9);
                        TabbarSuggestState tabbarSuggestState2 = tabbarSuggestState;
                        TabbarSuggestState tabbarSuggestState3 = TabbarSuggestState.ADD;
                        if (tabbarSuggestState2 == tabbarSuggestState3) {
                            i3 = 1330138866;
                            i4 = R.drawable.vk_icon_pin_outline_28;
                        } else {
                            i3 = 1330140914;
                            i4 = R.drawable.vk_icon_unpin_outline_28;
                        }
                        vqv.a(or.b(aVar3, i3, i4, aVar3, 0), null, i8, wlb0.h(aVar3).getIcon().a, aVar3, 56, 0);
                        boolean J = aVar3.J(j6);
                        Object x10 = aVar3.x();
                        if (J || x10 == c0012a) {
                            x10 = new bxn0(j6);
                            aVar3.R(x10);
                        }
                        float f2 = 12;
                        q630 C2 = txj0.C(s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, c6j.i(aVar4, j, (izs) x10)), null, 3);
                        frv0 frv0Var = wlb0.l(aVar3).h0;
                        long j7 = wlb0.h(aVar3).getText().m;
                        String str3 = str;
                        TabbarSuggestState tabbarSuggestState4 = tabbarSuggestState;
                        if (b.d()) {
                            q630Var = C2;
                            f = f2;
                            b.f(953635242, 0, -1, "com.vk.tabbar.settings.impl.suggests.toSubtitleSuggestString (TabbarSuggestTopPanel.kt:175)");
                        } else {
                            q630Var = C2;
                            f = f2;
                        }
                        us2.b b = xga0.b(1615438205, aVar3);
                        String b2 = air.b((char) 187, "«", str3);
                        String O = d370.O(tabbarSuggestState4 == tabbarSuggestState3 ? R.string.superapp_tabbar_suggest_into_fast_access : R.string.superapp_tabbar_suggest_from_fast_access, new Object[]{b2}, aVar3);
                        int K = drm0.K(0, 6, O, b2, false);
                        int length = b2.length() + K;
                        int m = b.m(new hik0(wlb0.h(aVar3).getText().m, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                        try {
                            b.g(O.substring(0, K));
                            b.k(m);
                            m = b.m(new hik0(wlb0.h(aVar3).getText().a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                            try {
                                b.g(O.substring(K, length));
                                b.k(m);
                                m = b.m(new hik0(wlb0.h(aVar3).getText().m, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                                try {
                                    b.g(O.substring(length, O.length()));
                                    b.k(m);
                                    us2 n = b.n();
                                    aVar3.j();
                                    if (b.d()) {
                                        b.e();
                                    }
                                    float f3 = f;
                                    yqv0.d(n, q630Var, j7, 3, null, 0, false, 0, null, null, frv0Var, aVar3, 0, 0, 8120);
                                    boolean J2 = aVar3.J(j);
                                    Object x11 = aVar3.x();
                                    if (J2 || x11 == c0012a) {
                                        x11 = new cxn0(j);
                                        aVar3.R(x11);
                                    }
                                    yqv0.c(str2, txj0.C(s200.F(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, c6j.i(aVar4, j2, (izs) x11)), null, 3), wlb0.h(aVar3).getText().p, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(aVar3).m0, aVar3, 0, 0, 8120);
                                    Object x12 = aVar3.x();
                                    if (x12 == c0012a) {
                                        x12 = dxn0.b;
                                        aVar3.R(x12);
                                    }
                                    q630 i9 = c6j.i(aVar4, j3, (izs) x12);
                                    boolean J3 = aVar3.J(pwn0Var);
                                    Object x13 = aVar3.x();
                                    if (J3 || x13 == c0012a) {
                                        x13 = new exn0(pwn0Var);
                                        aVar3.R(x13);
                                    }
                                    jxn0.c(0, aVar3, (gzs) x13, i9);
                                    boolean J4 = aVar3.J(j2);
                                    Object x14 = aVar3.x();
                                    if (J4 || x14 == c0012a) {
                                        x14 = new fxn0(j2);
                                        aVar3.R(x14);
                                    }
                                    q630 i10 = c6j.i(aVar4, j4, (izs) x14);
                                    if (tabbarSuggestState == tabbarSuggestState3) {
                                        i5 = 1330206477;
                                        i6 = R.string.superapp_tabbar_suggest_add;
                                    } else {
                                        i5 = 1330208366;
                                        i6 = R.string.superapp_tabbar_suggest_remove;
                                    }
                                    String a = zq.a(aVar3, i5, i6, aVar3, 0);
                                    ButtonSize buttonSize = ButtonSize.Small;
                                    ButtonStyle buttonStyle = ButtonStyle.Primary;
                                    ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                                    boolean J5 = aVar3.J(pwn0Var);
                                    Object x15 = aVar3.x();
                                    if (J5 || x15 == c0012a) {
                                        x15 = new gxn0(pwn0Var);
                                        aVar3.R(x15);
                                    }
                                    bhu0.e((gzs) x15, buttonSize, buttonStyle, buttonAppearance, i10, null, false, false, null, null, null, a, null, null, null, null, false, null, null, null, aVar3, X2.b.f, 0, 0, 4190176);
                                    boolean J6 = aVar3.J(j4);
                                    Object x16 = aVar3.x();
                                    if (J6 || x16 == c0012a) {
                                        x16 = new hxn0(j4);
                                        aVar3.R(x16);
                                    }
                                    q630 H = s200.H(txj0.C(c6j.i(aVar4, j5, (izs) x16), null, 3), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, 7);
                                    String N = d370.N(R.string.superapp_tabbar_suggest_settings, 0, aVar3);
                                    ButtonStyle buttonStyle2 = ButtonStyle.Tertiary;
                                    boolean J7 = aVar3.J(pwn0Var);
                                    Object x17 = aVar3.x();
                                    if (J7 || x17 == c0012a) {
                                        x17 = new ixn0(pwn0Var);
                                        aVar3.R(x17);
                                    }
                                    bhu0.e((gzs) x17, buttonSize, buttonStyle2, buttonAppearance, H, null, false, false, null, null, null, N, null, null, null, null, false, null, null, null, aVar3, X2.b.f, 0, 0, 4190176);
                                    aVar3.j();
                                    if (c6jVar.b != i7) {
                                        bap.i(gzsVar, aVar3, 6);
                                    }
                                    if (b.d()) {
                                        b.e();
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        } finally {
                        }
                    }
                    return s3q0.a;
                }
            }, M), cp10Var, M, 48, 0);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.zwn0
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    jxn0.b(TabbarSuggestState.this, str, str2, pwn0Var, (androidx.compose.runtime.a) obj2, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(int i, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var) {
        gzs gzsVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(475581570);
        int i2 = (M.y(gzsVar) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(475581570, i2, -1, "com.vk.tabbar.settings.impl.suggests.VkIconCloseButton (TabbarSuggestTopPanel.kt:159)");
            }
            gzsVar2 = gzsVar;
            q630Var2 = q630Var;
            nzu0.e(gzsVar2, q630Var2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, null, null, qli.a, M, (i2 & 14) | 100663296 | (i2 & 112), 252);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            gzsVar2 = gzsVar;
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jkd(gzsVar2, q630Var2, i, 8);
        }
    }
}
