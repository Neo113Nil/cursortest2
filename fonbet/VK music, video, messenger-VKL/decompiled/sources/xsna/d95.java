package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.ironsource.X2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.compose.blur.GradientDirection;
import com.vk.profile.design.compose.buttons.ProfileButtons;
import com.vk.profile.design.compose.header.AuthorHeaderConfig;
import com.vk.profile.design.compose.header.a;
import com.vk.profile.design.compose.header.b;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Pair;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.e95;
import xsna.iut0;
import xsna.q630;
import xsna.yqx0;

/* compiled from: AuthorHeaderHeaderContent.kt */
/* loaded from: classes5.dex */
public final class d95 {
    public static final float a = 16;
    public static final float b = 40;
    public static final float c;
    public static final long d;
    public static final float e;
    public static final float f;
    public static final float g;

    static {
        float f2 = kqu0.a;
        c = kqu0.v;
        d = l2l0.l(16);
        e = 8;
        f = 12;
        g = 15;
    }

    public static final void a(final m95 m95Var, final jai jaiVar, final jai jaiVar2, final jai jaiVar3, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(-2074235137);
        int i2 = i | (M.J(m95Var) ? 4 : 2) | (M.J(q630Var) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2074235137, i2, -1, "com.vk.profile.design.compose.header.content.AuthorHeaderInternalLayout (AuthorHeaderHeaderContent.kt:226)");
            }
            rv5 c2 = lv5.c(M);
            boolean J = M.J(c2) | ((i2 & 14) == 4);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                j85 j85Var = new j85(m95Var, jaiVar2, c2, jaiVar, jaiVar3);
                M.R(j85Var);
                x = j85Var;
            }
            xtm0.a(q630Var, (wzs) x, M, (i2 >> 12) & 14, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(jaiVar, jaiVar2, jaiVar3, q630Var, i) { // from class: xsna.k85
                public final /* synthetic */ jai c;
                public final /* synthetic */ jai d;
                public final /* synthetic */ jai e;
                public final /* synthetic */ q630 f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(3505);
                    d95.a(m95.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(rv5 rv5Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        rv5 rv5Var2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-782679342);
        int i2 = (M.J(rv5Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-782679342, i2, -1, "com.vk.profile.design.compose.header.content.AuthorHeaderPictureBlurStrip (AuthorHeaderHeaderContent.kt:474)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1896439565, 0, -1, "com.vk.profile.design.compose.header.content.rememberAuthorHeaderPictureBlurOverlay (AuthorHeaderHeaderContent.kt:488)");
            }
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            ue2 b2 = dxu0.b();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            rv5Var2 = rv5Var;
            q630Var2 = q630Var;
            ja8.a(lv5.a(q630Var2, rv5Var2, g, GradientDirection.TopBottom, b2, b2, 4), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            rv5Var2 = rv5Var;
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new r85(rv5Var2, q630Var2, i, 0);
        }
    }

    public static final void c(List list, q630 q630Var, rv5 rv5Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> y85Var;
        androidx.compose.runtime.a M = aVar.M(1565239505);
        if ((i & 6) == 0) {
            i2 = (M.J(list != null ? new wow(list) : null) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(rv5Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1565239505, i2, -1, "com.vk.profile.design.compose.header.content.BadgeContent (AuthorHeaderHeaderContent.kt:659)");
            }
            if (list == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    y85Var = new x85(list, q630Var, rv5Var, i);
                    s.d = y85Var;
                }
                return;
            }
            int i3 = (i2 & 14) | 384;
            int i4 = i2 >> 3;
            int i5 = i3 | (i4 & 112);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-134233534, i5, -1, "com.vk.profile.design.compose.header.header.AuthorHeaderImageSlot.BadgeSlot.Companion.invoke (AuthorHeaderImageSlot.kt:84)");
            }
            int i6 = i5 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(561522012, i6, -1, "com.vk.profile.design.compose.header.header.rememberBadgesSlot (BadgesSlotImpl.kt:114)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new sz5(list, rv5Var);
                M.R(x);
            }
            sz5 sz5Var = (sz5) x;
            ((zak0) sz5Var.a).setValue(new wow(list));
            ((zak0) sz5Var.b).setValue(rv5Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            sz5Var.a(q630Var, M, i4 & 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        s = M.s();
        if (s != null) {
            y85Var = new y85(i, 0, list, q630Var, rv5Var);
            s.d = y85Var;
        }
    }

    public static final void d(final AuthorHeaderConfig authorHeaderConfig, final ja5 ja5Var, final float f2, final boolean z, final boolean z2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        boolean z3;
        androidx.compose.runtime.a M = aVar.M(1825320117);
        if ((i & 6) == 0) {
            i2 = (M.J(authorHeaderConfig) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(ja5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.n(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z3 = z;
            i2 |= M.l(z3) ? 16384 : 8192;
        } else {
            z3 = z;
        }
        if ((196608 & i) == 0) {
            i2 |= M.l(z2) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1825320117, i2, -1, "com.vk.profile.design.compose.header.content.HeaderContent (AuthorHeaderHeaderContent.kt:64)");
            }
            final boolean z4 = z3;
            ua8.a(txj0.f(q630.a.a, 1.0f), null, false, kai.c(1612950667, new yzs() { // from class: xsna.i85
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:53:0x01f3  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x0247  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x029a  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x0196  */
                /* JADX WARN: Removed duplicated region for block: B:71:0x0199  */
                @Override // xsna.yzs
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    AuthorHeaderConfig authorHeaderConfig2;
                    q95 q95Var;
                    q95 q95Var2;
                    boolean o;
                    Object x;
                    int i3;
                    float j1;
                    h4x i4;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1612950667, intValue, -1, "com.vk.profile.design.compose.header.content.HeaderContent.<anonymous> (AuthorHeaderHeaderContent.kt:66)");
                        }
                        AuthorHeaderConfig authorHeaderConfig3 = AuthorHeaderConfig.this;
                        boolean z5 = authorHeaderConfig3.a.e;
                        float f3 = xtf0.a;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1596175702, 6, -1, "androidx.compose.foundation.layout.<get-navigationBars> (WindowInsets.android.kt:176)");
                        }
                        WeakHashMap<View, yqx0> weakHashMap = yqx0.w;
                        te2 te2Var = yqx0.a.c(aVar2).e;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        iyk0 iyk0Var = uvi.h;
                        int i5 = te2Var.e().d;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-2958486, 0, -1, "com.vk.profile.design.compose.header.rememberAuthorHeaderPicturePaneTargetHeightDp (rememberAuthorHeaderPicturePaneHeight.kt:29)");
                        }
                        Configuration configuration = (Configuration) aVar2.r(AndroidCompositionLocals_androidKt.a);
                        azl azlVar = (azl) aVar2.r(iyk0Var);
                        View view = (View) aVar2.r(AndroidCompositionLocals_androidKt.f);
                        long c2 = ((spx0) aVar2.r(uvi.u)).c();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(70814729, 0, -1, "com.vk.profile.design.compose.header.rememberHostViewAttached (rememberAuthorHeaderPicturePaneHeight.kt:80)");
                        }
                        boolean J = aVar2.J(view);
                        Object x2 = aVar2.x();
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (J || x2 == c0012a) {
                            x2 = androidx.compose.runtime.k.b(Boolean.valueOf(view.isAttachedToWindow()));
                            aVar2.R(x2);
                        }
                        wh50 wh50Var = (wh50) x2;
                        boolean J2 = aVar2.J(wh50Var) | aVar2.y(view);
                        Object x3 = aVar2.x();
                        if (J2 || x3 == c0012a) {
                            x3 = new sf4(19, view, wh50Var);
                            aVar2.R(x3);
                        }
                        bap.c(view, (izs) x3, aVar2, 0);
                        boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (booleanValue) {
                            WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                            bqx0 a2 = iut0.e.a(view);
                            if (a2 != null && (i4 = a2.a.i(2)) != null) {
                                i5 = i4.d;
                            }
                        }
                        boolean z6 = z5 || configuration.orientation == 2;
                        int i6 = configuration.orientation;
                        boolean z7 = i6 == 2;
                        boolean z8 = z2;
                        if (z8) {
                            q95Var2 = new q95(false, false);
                        } else if (z7) {
                            if (z5) {
                                authorHeaderConfig2 = authorHeaderConfig3;
                                q95Var = new q95(false, true);
                            } else {
                                authorHeaderConfig2 = authorHeaderConfig3;
                                q95Var = new q95(true, true);
                            }
                            q95Var2 = q95Var;
                            o = aVar2.o((int) (c2 >> 32)) | aVar2.o(i6) | aVar2.o((int) (4294967295L & c2)) | aVar2.l(z6) | aVar2.l(z5) | aVar2.l(z8) | aVar2.J(q95Var2) | aVar2.o(i5) | aVar2.l(booleanValue) | aVar2.J(azlVar);
                            x = aVar2.x();
                            if (!o || x == c0012a) {
                                if (z6) {
                                    j1 = xtf0.a;
                                } else {
                                    Context context = view.getContext();
                                    Point j = iah0.j(context);
                                    int min = context.getResources().getConfiguration().orientation == 2 ? Math.min(j.x, j.y) : Math.max(j.x, j.y);
                                    if (q95Var2.a) {
                                        i3 = min - context.getResources().getDimensionPixelSize(R.dimen.vk_bottom_navigation_height);
                                        if (i3 < 0) {
                                            i3 = 0;
                                        }
                                    } else {
                                        i3 = min;
                                    }
                                    if (q95Var2.b && (i3 = i3 - i5) < 0) {
                                        i3 = 0;
                                    }
                                    j1 = azlVar.j1(i3);
                                }
                                x = new pco(j1);
                                aVar2.R(x);
                            }
                            float f4 = ((pco) x).b;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            mtk0 a3 = hg2.a(f4, jq2.d(300, 0, null, 6), "authorHeaderPictureHeight", aVar2, Tensorflow.FRAME_WIDTH, 8);
                            q630 f5 = txj0.f(txj0.h(q630.a.a, ((pco) a3.getValue()).b), 1.0f);
                            dt1.a.getClass();
                            cp10 d2 = ja8.d(dt1.a.b, false);
                            int hashCode = Long.hashCode(n34.n(aVar2));
                            sy90 D = aVar2.D();
                            q630 c3 = qri.c(aVar2, f5);
                            cri.h7.getClass();
                            LayoutNode.a aVar3 = cri.a.b;
                            if (aVar2.N() != null) {
                                n34.r();
                                throw null;
                            }
                            aVar2.H();
                            if (aVar2.L()) {
                                aVar2.I(aVar3);
                            } else {
                                aVar2.f();
                            }
                            k9q0.w(aVar2, d2, cri.a.f);
                            k9q0.w(aVar2, D, cri.a.e);
                            k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                            k9q0.t(aVar2, cri.a.h);
                            k9q0.w(aVar2, c3, cri.a.d);
                            d95.e(authorHeaderConfig2, ja5Var, f2, ((pco) a3.getValue()).b, null, z4, z8, aVar2, 0);
                            aVar2.G();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            q95Var2 = new q95(false, z5);
                        }
                        authorHeaderConfig2 = authorHeaderConfig3;
                        o = aVar2.o((int) (c2 >> 32)) | aVar2.o(i6) | aVar2.o((int) (4294967295L & c2)) | aVar2.l(z6) | aVar2.l(z5) | aVar2.l(z8) | aVar2.J(q95Var2) | aVar2.o(i5) | aVar2.l(booleanValue) | aVar2.J(azlVar);
                        x = aVar2.x();
                        if (!o) {
                        }
                        if (z6) {
                        }
                        x = new pco(j1);
                        aVar2.R(x);
                        float f42 = ((pco) x).b;
                        if (androidx.compose.runtime.b.d()) {
                        }
                        mtk0 a32 = hg2.a(f42, jq2.d(300, 0, null, 6), "authorHeaderPictureHeight", aVar2, Tensorflow.FRAME_WIDTH, 8);
                        q630 f52 = txj0.f(txj0.h(q630.a.a, ((pco) a32.getValue()).b), 1.0f);
                        dt1.a.getClass();
                        cp10 d22 = ja8.d(dt1.a.b, false);
                        int hashCode2 = Long.hashCode(n34.n(aVar2));
                        sy90 D2 = aVar2.D();
                        q630 c32 = qri.c(aVar2, f52);
                        cri.h7.getClass();
                        LayoutNode.a aVar32 = cri.a.b;
                        if (aVar2.N() != null) {
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 3078, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.s85
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d95.d(AuthorHeaderConfig.this, ja5Var, f2, z, z2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void e(final AuthorHeaderConfig authorHeaderConfig, final ja5 ja5Var, final float f2, final float f3, q630 q630Var, final boolean z, final boolean z2, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        Pair pair;
        yf00 yf00Var;
        androidx.compose.runtime.a M = aVar.M(-123322621);
        int i2 = 0;
        int i3 = i | (M.J(authorHeaderConfig) ? 4 : 2) | (M.J(ja5Var) ? 32 : 16) | (M.n(f2) ? 256 : 128) | (M.n(f3) ? 2048 : 1024) | 24576 | (M.l(false) ? 131072 : 65536) | (M.l(z) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.l(z2) ? 8388608 : 4194304);
        if (M.t(i3 & 1, (4793491 & i3) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-123322621, i3, -1, "com.vk.profile.design.compose.header.content.InternalHeaderContent (AuthorHeaderHeaderContent.kt:105)");
            }
            AuthorHeaderConfig.Viewer viewer = authorHeaderConfig.c;
            AuthorHeaderConfig.Header header = authorHeaderConfig.a;
            final boolean h = viewer.a.h();
            AuthorHeaderConfig.Viewer.RelationToAuthor relationToAuthor = AuthorHeaderConfig.Viewer.RelationToAuthor.None;
            boolean z3 = ((Configuration) M.r(AndroidCompositionLocals_androidKt.a)).orientation == 2;
            boolean z4 = header.e || z3;
            View view = (View) M.r(AndroidCompositionLocals_androidKt.f);
            LayoutDirection layoutDirection = (LayoutDirection) M.r(uvi.n);
            boolean z5 = z2 && z4;
            h4x h4xVar = null;
            if (z5) {
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                bqx0 a2 = iut0.e.a(view);
                if (a2 != null) {
                    h4xVar = a2.a.i(2);
                }
            }
            h4x h4xVar2 = h4xVar;
            if (z5) {
                int i4 = (z3 || h4xVar2 == null) ? 0 : h4xVar2.d;
                if (z3) {
                    pair = k9q0.y(h4xVar2 != null ? h4xVar2.a : 0, h4xVar2 != null ? h4xVar2.c : 0, layoutDirection == LayoutDirection.Rtl);
                } else {
                    pair = new Pair(0, 0);
                }
                yf00Var = new yf00(i4, ((Number) pair.d()).intValue(), ((Number) pair.g()).intValue());
            } else {
                yf00Var = new yf00(0, 0, 0);
            }
            m95 m95Var = new m95(com.vk.profile.design.compose.header.c.b(header, authorHeaderConfig.d.a == AuthorHeaderConfig.Author.AuthorType.Community) != null, header.c.c != null, f2, z4, z, yf00Var.a, yf00Var.b, yf00Var.c);
            q630Var2 = q630.a.a;
            a(m95Var, kai.c(-1978682548, new zzs() { // from class: xsna.t85
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i5;
                    lja0 lja0Var = (lja0) obj;
                    q630 q630Var3 = (q630) obj2;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 6) == 0) {
                        i5 = (aVar2.J(lja0Var) ? 4 : 2) | intValue;
                    } else {
                        i5 = intValue;
                    }
                    if ((intValue & 48) == 0) {
                        i5 |= aVar2.J(q630Var3) ? 32 : 16;
                    }
                    if (aVar2.t(i5 & 1, (i5 & 147) != 146)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1978682548, i5, -1, "com.vk.profile.design.compose.header.content.InternalHeaderContent.<anonymous> (AuthorHeaderHeaderContent.kt:143)");
                        }
                        AuthorHeaderConfig authorHeaderConfig2 = AuthorHeaderConfig.this;
                        AuthorHeaderConfig.Header header2 = authorHeaderConfig2.a;
                        d95.h(new qja0(header2.a, header2.b, header2.e, authorHeaderConfig2.d.a, h, ja5Var, lja0Var, f3), ahn.E(q630Var3, "author_header_picture"), aVar2, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), kai.c(1646569643, new zzs() { // from class: xsna.u85
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i5;
                    q630 q630Var3 = (q630) obj;
                    rv5 rv5Var = (rv5) obj2;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 6) == 0) {
                        i5 = (aVar2.J(q630Var3) ? 4 : 2) | intValue;
                    } else {
                        i5 = intValue;
                    }
                    if ((intValue & 48) == 0) {
                        i5 |= aVar2.J(rv5Var) ? 32 : 16;
                    }
                    if (aVar2.t(i5 & 1, (i5 & 147) != 146)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1646569643, i5, -1, "com.vk.profile.design.compose.header.content.InternalHeaderContent.<anonymous> (AuthorHeaderHeaderContent.kt:158)");
                        }
                        AuthorHeaderConfig authorHeaderConfig2 = AuthorHeaderConfig.this;
                        AuthorHeaderConfig.Header header2 = authorHeaderConfig2.a;
                        AuthorHeaderConfig.Author author = authorHeaderConfig2.d;
                        d95.f(header2, author.c, h, author.a == AuthorHeaderConfig.Author.AuthorType.Community, rv5Var, q630Var3, aVar2, ((i5 << 9) & 57344) | ((i5 << 15) & 458752));
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), kai.c(1815821228, new v85(authorHeaderConfig, i2), M), txj0.d(q630Var2, 1.0f), M, X2.b.f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(ja5Var, f2, f3, q630Var2, z, z2, i) { // from class: xsna.w85
                public final /* synthetic */ ja5 c;
                public final /* synthetic */ float d;
                public final /* synthetic */ float e;
                public final /* synthetic */ q630 f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ boolean h;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    d95.e(AuthorHeaderConfig.this, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void f(final AuthorHeaderConfig.Header header, final AuthorHeaderConfig.Author.AuthorSex authorSex, final boolean z, final boolean z2, final rv5 rv5Var, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-777773947);
        if ((i & 6) == 0) {
            i2 = (M.J(header) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.o(authorSex.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(rv5Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(q630Var) ? 131072 : 65536;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-777773947, i3, -1, "com.vk.profile.design.compose.header.content.MainContent (AuthorHeaderHeaderContent.kt:598)");
            }
            AuthorHeaderConfig.Header.Main main = header.c;
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, q630Var);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            int i4 = i3 >> 3;
            g(main.a, main.c, z2, com.vk.profile.design.compose.header.c.b(header, z2), M, i4 & 896);
            AuthorHeaderConfig.Header.Main.Subtitle subtitle = main.b;
            q630.a aVar3 = q630.a.a;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (subtitle == null) {
                M.K(-370290501);
            } else {
                M.K(-370290500);
                int i5 = (i3 & 112) | 384;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1631713879, i5, -1, "com.vk.profile.design.compose.header.header.AuthorHeaderImageSlot.SubtitleSlot.Companion.invoke (AuthorHeaderImageSlot.kt:118)");
                }
                int i6 = i5 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1276232346, i6, -1, "com.vk.profile.design.compose.header.header.rememberSubtitleSlot (SubtitleSlotImpl.kt:72)");
                }
                Object x = M.x();
                if (x == c0012a) {
                    x = new b1n0(subtitle, authorSex);
                    M.R(x);
                }
                b1n0 b1n0Var = (b1n0) x;
                ((zak0) b1n0Var.a).setValue(subtitle);
                ((zak0) b1n0Var.b).setValue(authorSex);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                b1n0Var.a(s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.s, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), M, 0);
            }
            M.j();
            ProfileButtons profileButtons = main.d;
            if (profileButtons == null) {
                M.K(-370000093);
            } else {
                M.K(-370000092);
                int i7 = (i4 & 112) | 3072 | ((i3 >> 6) & 896);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(205190294, i7, -1, "com.vk.profile.design.compose.header.header.AuthorHeaderImageSlot.ButtonsSlot.Companion.invoke (AuthorHeaderImageSlot.kt:129)");
                }
                int i8 = i7 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1181581158, i8, -1, "com.vk.profile.design.compose.header.header.rememberButtonsSlot (ButtonsSlotImpl.kt:45)");
                }
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new ks8(profileButtons, z, rv5Var);
                    M.R(x2);
                }
                ks8 ks8Var = (ks8) x2;
                ((zak0) ks8Var.a).setValue(profileButtons);
                ((zak0) ks8Var.b).setValue(Boolean.valueOf(z));
                ((zak0) ks8Var.c).setValue(rv5Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                ks8Var.a(s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.v, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), M, 0);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.a95
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d95.f(AuthorHeaderConfig.Header.this, authorSex, z, z2, rv5Var, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(final AuthorHeaderConfig.Header.Main.Name name, final AuthorHeaderConfig.Header.Main.a aVar, final boolean z, final String str, androidx.compose.runtime.a aVar2, final int i) {
        int i2;
        yfd0 yfd0Var;
        androidx.compose.runtime.a M = aVar2.M(2113372785);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(name) : M.y(name) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(str) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2113372785, i2, -1, "com.vk.profile.design.compose.header.content.NameContent (AuthorHeaderHeaderContent.kt:637)");
            }
            boolean z2 = name instanceof AuthorHeaderConfig.Header.Main.Name.Default;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2) {
                M.K(-568274350);
                AuthorHeaderConfig.Header.Main.Name.Default r0 = (AuthorHeaderConfig.Header.Main.Name.Default) name;
                int i3 = ((i2 << 3) & 7168) | (i2 & 112) | 24576 | ((i2 >> 3) & 896);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-122977382, i3, -1, "com.vk.profile.design.compose.header.header.AuthorHeaderImageSlot.NameSlot.NameWithStatusSlot.Companion.invoke (AuthorHeaderImageSlot.kt:100)");
                }
                int i4 = i3 & 8190;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-577854886, i4, -1, "com.vk.profile.design.compose.header.header.rememberNameWithStatusSlot (DefaultNameSlotImpl.kt:418)");
                }
                Object x = M.x();
                if (x == c0012a) {
                    x = new njl(r0, aVar, z, str);
                    M.R(x);
                }
                njl njlVar = (njl) x;
                ((zak0) njlVar.a).setValue(r0);
                ((zak0) njlVar.b).setValue(aVar);
                ((zak0) njlVar.c).setValue(str);
                ((zak0) njlVar.d).setValue(Boolean.valueOf(z));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                yfd0Var = njlVar;
            } else {
                if (!(name instanceof AuthorHeaderConfig.Header.Main.Name.a)) {
                    throw alb0.c(-568277419, M);
                }
                M.K(-568266141);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1248448103, 6, -1, "com.vk.profile.design.compose.header.header.AuthorHeaderImageSlot.NameSlot.PrivateCommunity.Companion.invoke (AuthorHeaderImageSlot.kt:107)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-877331415, 0, -1, "com.vk.profile.design.compose.header.header.rememberPrivateCommunityNameSlot (PrivateCommunityNameSlotImpl.kt:29)");
                }
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new yfd0();
                    M.R(x2);
                }
                yfd0 yfd0Var2 = (yfd0) x2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                yfd0Var = yfd0Var2;
            }
            yfd0Var.a(q630.a.a, M, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.l85
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    d95.g(AuthorHeaderConfig.Header.Main.Name.this, aVar, z, str, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Finally extract failed */
    public static final void h(qja0 qja0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        com.vk.profile.design.compose.header.a aVar2;
        boolean z;
        boolean z2;
        e95.a aVar3;
        int i2;
        uh50 C;
        e95 e95Var;
        androidx.compose.runtime.a M = aVar.M(-510413218);
        int i3 = (M.J(qja0Var) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-510413218, i3, -1, "com.vk.profile.design.compose.header.content.PictureContent (AuthorHeaderHeaderContent.kt:507)");
            }
            com.vk.profile.design.compose.header.a aVar4 = qja0Var.a;
            com.vk.profile.design.compose.header.b bVar = qja0Var.b;
            boolean z3 = qja0Var.c;
            AuthorHeaderConfig.Author.AuthorType authorType = qja0Var.d;
            boolean z4 = qja0Var.e;
            ja5 ja5Var = qja0Var.f;
            lja0 lja0Var = qja0Var.g;
            float f2 = qja0Var.h;
            boolean J = M.J(ja5Var);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (J || x == obj) {
                aVar2 = aVar4;
                z = z4;
                z2 = z3;
                x = new ka5(new b95(ja5Var, 0), new c95(ja5Var, 0), new com.vk.repository.internal.repos.stickers.suggests.a(ja5Var, 1));
                M.R(x);
            } else {
                aVar2 = aVar4;
                z = z4;
                z2 = z3;
            }
            ka5 ka5Var = (ka5) x;
            if (authorType == AuthorHeaderConfig.Author.AuthorType.Profile) {
                M.K(-1535081937);
                e95.a i4 = i(aVar2, z, ja5Var.a(), ka5Var, lja0Var, f2, M);
                M.j();
                e95Var = i4;
            } else {
                com.vk.profile.design.compose.header.a aVar5 = aVar2;
                boolean z5 = z;
                M.K(-1534814841);
                if (bVar instanceof b.C1661b) {
                    M.K(-880790550);
                    b.C1661b c1661b = (b.C1661b) bVar;
                    la5 a2 = ja5Var.a();
                    if (androidx.compose.runtime.b.d()) {
                        i2 = -1;
                        androidx.compose.runtime.b.f(-1779248317, 1572864, -1, "com.vk.profile.design.compose.header.header.AuthorHeaderImageSlot.PictureSlot.LiveCover.Companion.invoke (AuthorHeaderImageSlot.kt:66)");
                    } else {
                        i2 = -1;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1571629983, 0, i2, "com.vk.profile.design.compose.header.header.rememberLiveCoverAvatar (LiveCoverAvatarSlotImpl.kt:91)");
                    }
                    Object x2 = M.x();
                    if (x2 == obj) {
                        riz rizVar = new riz(c1661b, a2, ka5Var, lja0Var, f2, z2);
                        M.R(rizVar);
                        x2 = rizVar;
                    }
                    riz rizVar2 = (riz) x2;
                    dak0 j = qak0.j();
                    uh50 uh50Var = j instanceof uh50 ? (uh50) j : null;
                    if (uh50Var == null || (C = uh50Var.C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        dak0 j2 = C.j();
                        try {
                            ((zak0) rizVar2.a).setValue(c1661b);
                            ((zak0) rizVar2.b).setValue(a2);
                            ((zak0) rizVar2.c).setValue(ka5Var);
                            ((zak0) rizVar2.d).setValue(lja0Var);
                            ((zak0) rizVar2.e).setValue(new pco(f2));
                            ((zak0) rizVar2.f).setValue(Boolean.valueOf(z2));
                            s3q0 s3q0Var = s3q0.a;
                            C.w().a();
                            C.c();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            M.j();
                            aVar3 = rizVar2;
                        } finally {
                            dak0.q(j2);
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            C.c();
                            throw th2;
                        }
                    }
                } else {
                    if (!(bVar instanceof b.a)) {
                        throw alb0.c(-880793845, M);
                    }
                    M.K(-880776929);
                    e95.a i5 = i(aVar5, z5, ja5Var.a(), ka5Var, lja0Var, f2, M);
                    M.j();
                    aVar3 = i5;
                }
                M.j();
                e95Var = aVar3;
            }
            e95Var.a(q630Var, M, (i3 >> 3) & 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new z85(qja0Var, q630Var, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final e95.a i(com.vk.profile.design.compose.header.a aVar, boolean z, la5 la5Var, ka5 ka5Var, lja0 lja0Var, float f2, androidx.compose.runtime.a aVar2) {
        qep qepVar;
        a.C1660a c1660a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1170008594, 0, -1, "com.vk.profile.design.compose.header.content.getHeaderPictureAvatarSlot (AuthorHeaderHeaderContent.kt:569)");
        }
        boolean z2 = aVar instanceof a.C1660a;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (z2) {
            aVar2.K(2066833952);
            a.C1660a c1660a2 = (a.C1660a) aVar;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1335191781, 196608, -1, "com.vk.profile.design.compose.header.header.AuthorHeaderImageSlot.PictureSlot.DefaultAvatar.Companion.invoke (AuthorHeaderImageSlot.kt:46)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1894234134, 0, -1, "com.vk.profile.design.compose.header.header.rememberDefaultAvatar (DefaultAvatarSlotImpl.kt:72)");
            }
            Object x = aVar2.x();
            if (x == c0012a) {
                x = new nbl(c1660a2, la5Var, ka5Var, lja0Var, f2);
                c1660a = c1660a2;
                aVar2.R(x);
            } else {
                c1660a = c1660a2;
            }
            nbl nblVar = (nbl) x;
            ((zak0) nblVar.a).setValue(c1660a);
            ((zak0) nblVar.b).setValue(la5Var);
            ((zak0) nblVar.c).setValue(ka5Var);
            ((zak0) nblVar.d).setValue(lja0Var);
            ((zak0) nblVar.e).setValue(new pco(f2));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2.j();
            qepVar = nblVar;
        } else {
            if (!(aVar instanceof a.b)) {
                throw alb0.c(-903161457, aVar2);
            }
            aVar2.K(2067223281);
            a.b bVar = (a.b) aVar;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(729920582, 24576, -1, "com.vk.profile.design.compose.header.header.AuthorHeaderImageSlot.PictureSlot.Empty.Companion.invoke (AuthorHeaderImageSlot.kt:28)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1256505817, 0, -1, "com.vk.profile.design.compose.header.header.rememberEmptySlot (EmptyAvatarSlotImpl.kt:101)");
            }
            Object x2 = aVar2.x();
            if (x2 == c0012a) {
                x2 = new qep(bVar, z, lja0Var, f2);
                aVar2.R(x2);
            }
            qep qepVar2 = (qep) x2;
            ((zak0) qepVar2.a).setValue(bVar);
            ((zak0) qepVar2.b).setValue(Boolean.valueOf(z));
            ((zak0) qepVar2.c).setValue(lja0Var);
            ((zak0) qepVar2.d).setValue(new pco(f2));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2.j();
            qepVar = qepVar2;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return qepVar;
    }
}
