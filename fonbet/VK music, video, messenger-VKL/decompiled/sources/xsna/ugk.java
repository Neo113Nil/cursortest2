package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.component.topbar.k;
import com.vk.newsfeed.posting.crop_editor.domain.model.ImageLink;
import com.vk.newsfeed.posting.impl.domain.model.CropFitContainerMode;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.newsfeed.posting.impl.domain.model.PostingPreviewRatio;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.Pair;
import xsna.cp8;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: CropEditorScreen.kt */
/* loaded from: classes4.dex */
public final class ugk {
    public static final void a(final boolean z, final boolean z2, final boolean z3, final izs izsVar, final izs izsVar2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        boolean z4;
        androidx.compose.runtime.a M = aVar.M(1060919614);
        int i3 = i & 6;
        r9g r9gVar = r9g.a;
        if (i3 == 0) {
            i2 = (M.J(r9gVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z4 = z;
            i2 |= M.l(z4) ? 32 : 16;
        } else {
            z4 = z;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(izsVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.y(izsVar2) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1060919614, i2, -1, "com.vk.newsfeed.posting.crop_editor.presentation.base.view.ButtonsGroup (CropEditorScreen.kt:339)");
            }
            mm2.b(r9gVar, z4, null, null, null, null, kai.c(-2137918954, new yzs() { // from class: xsna.mgk
                /* JADX WARN: Code restructure failed: missing block: B:35:0x01e0, code lost:
                
                    if (r7 == r5) goto L45;
                 */
                @Override // xsna.yzs
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z5;
                    izs izsVar3;
                    String str;
                    a.C0011a.C0012a c0012a;
                    int i4;
                    a.C0011a.C0012a c0012a2;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2137918954, intValue, -1, "com.vk.newsfeed.posting.crop_editor.presentation.base.view.ButtonsGroup.<anonymous> (CropEditorScreen.kt:341)");
                    }
                    izs izsVar4 = izs.this;
                    boolean J = aVar2.J(izsVar4);
                    Object x = aVar2.x();
                    a.C0011a.C0012a c0012a3 = a.C0011a.a;
                    if (J || x == c0012a3) {
                        x = new azd(izsVar4, 1);
                        aVar2.R(x);
                    }
                    q630.a aVar3 = q630.a.a;
                    q630 o = egi.o(aVar3, (izs) x);
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D = aVar2.D();
                    q630 c = qri.c(aVar2, o);
                    cri.h7.getClass();
                    LayoutNode.a aVar4 = cri.a.b;
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar4);
                    } else {
                        aVar2.f();
                    }
                    cri.a.c cVar = cri.a.f;
                    k9q0.w(aVar2, d, cVar);
                    cri.a.e eVar = cri.a.e;
                    k9q0.w(aVar2, D, eVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar = cri.a.g;
                    k9q0.w(aVar2, valueOf, bVar);
                    cri.a.C2678a c2678a = cri.a.h;
                    k9q0.t(aVar2, c2678a);
                    cri.a.d dVar = cri.a.d;
                    k9q0.w(aVar2, c, dVar);
                    a.c cVar2 = androidx.compose.foundation.layout.a.e;
                    float f = 12;
                    q630 E = s200.E(aVar3, f, f);
                    androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(cVar2, dt1.a.k, aVar2, 6);
                    int hashCode2 = Long.hashCode(n34.n(aVar2));
                    sy90 D2 = aVar2.D();
                    q630 c2 = qri.c(aVar2, E);
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar4);
                    } else {
                        aVar2.f();
                    }
                    k9q0.w(aVar2, a, cVar);
                    k9q0.w(aVar2, D2, eVar);
                    ur.d(hashCode2, aVar2, bVar, aVar2, c2678a);
                    k9q0.w(aVar2, c2, dVar);
                    String N = d370.N(R.string.accesibility_photo_editor_edit_button, 0, aVar2);
                    String N2 = d370.N(R.string.photo_editor_done, 0, aVar2);
                    boolean z6 = z2;
                    boolean z7 = z3;
                    izs izsVar5 = izsVar;
                    if (z6) {
                        aVar2.K(-809156012);
                        ButtonSize buttonSize = ButtonSize.Large;
                        ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                        ButtonStyle buttonStyle = ButtonStyle.Primary;
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(796908386, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-SlidersOutline28> (VkIcons.kt:9994)");
                        }
                        lg90 b = or.b(aVar2, -1881310399, R.drawable.vk_icon_sliders_outline_28, aVar2, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        z5 = z7;
                        pqv a2 = cp8.b.a.a(b, null, null, null, null, aVar2, 196616, 30);
                        boolean z8 = !z5;
                        SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.ClearAndSet;
                        boolean J2 = aVar2.J(N);
                        Object x2 = aVar2.x();
                        if (J2 || x2 == c0012a3) {
                            x2 = new nf5(N, 1);
                            aVar2.R(x2);
                        }
                        q630 b2 = com.vk.core.compose.component.semantics.b.b(aVar3, com.vk.core.compose.component.semantics.b.a(mode, (izs) x2, 2));
                        boolean J3 = aVar2.J(izsVar5);
                        Object x3 = aVar2.x();
                        if (J3 || x3 == c0012a3) {
                            x3 = new gc0(izsVar5, 2);
                            aVar2.R(x3);
                        }
                        aVar2 = aVar2;
                        str = N2;
                        c0012a = c0012a3;
                        izsVar3 = izsVar5;
                        i4 = 6;
                        bhu0.d((gzs) x3, buttonStyle, buttonAppearance, b2, buttonSize, null, a2, null, z8, null, aVar2, 25008, 3488);
                        mq.d(aVar3, f, aVar2, 6);
                    } else {
                        z5 = z7;
                        izsVar3 = izsVar5;
                        str = N2;
                        c0012a = c0012a3;
                        i4 = 6;
                        aVar2.K(-821949278);
                        aVar2.j();
                    }
                    ButtonSize buttonSize2 = ButtonSize.Large;
                    ButtonAppearance buttonAppearance2 = ButtonAppearance.Accent;
                    ButtonStyle buttonStyle2 = ButtonStyle.Primary;
                    gio0 a3 = cp8.d.a.a(d370.N(R.string.photo_editor_done, 0, aVar2), null, aVar2, 3072, i4);
                    boolean z9 = !z5;
                    q630 f2 = txj0.f(aVar3, 1.0f);
                    SemanticsConfiguration.Mode mode2 = SemanticsConfiguration.Mode.ClearAndSet;
                    String str2 = str;
                    boolean J4 = aVar2.J(str2);
                    Object x4 = aVar2.x();
                    if (J4) {
                        c0012a2 = c0012a;
                    } else {
                        c0012a2 = c0012a;
                    }
                    x4 = new tf4(str2, 2);
                    aVar2.R(x4);
                    q630 b3 = com.vk.core.compose.component.semantics.b.b(f2, com.vk.core.compose.component.semantics.b.a(mode2, (izs) x4, 2));
                    izs izsVar6 = izsVar3;
                    boolean J5 = aVar2.J(izsVar6);
                    Object x5 = aVar2.x();
                    if (J5 || x5 == c0012a2) {
                        x5 = new z87(izsVar6, 2);
                        aVar2.R(x5);
                    }
                    bhu0.d((gzs) x5, buttonStyle2, buttonAppearance2, b3, buttonSize2, null, null, a3, z9, null, aVar2, 25008, 3424);
                    if (kr.f(aVar2)) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
            }, M), M, (i2 & 14) | 1572864 | (i2 & 112), 30);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.yfk
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ugk.a(z, z2, z3, izsVar, izsVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x036d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final ImageLink imageLink, final ImageCropArea imageCropArea, final PostingPreviewRatio postingPreviewRatio, final boolean z, final boolean z2, final boolean z3, final CropFitContainerMode cropFitContainerMode, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        ImageLink imageLink2;
        float f;
        Throwable th;
        iq2 aak0Var;
        zhf0 zhf0Var;
        float f2;
        ygk ygkVar;
        q630 q630Var;
        Object x;
        ygk ygkVar2;
        Object x2;
        Object x3;
        Object x4;
        ygk ygkVar3;
        androidx.compose.runtime.a M = aVar.M(-1458846259);
        int i2 = i | (M.J(imageLink) ? 4 : 2) | (M.J(imageCropArea) ? 32 : 16) | (M.J(postingPreviewRatio) ? 256 : 128) | (M.l(z) ? 2048 : 1024) | (M.l(z2) ? 16384 : 8192) | (M.o(cropFitContainerMode == null ? -1 : cropFitContainerMode.ordinal()) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.y(izsVar) ? 8388608 : 4194304);
        if (M.t(i2 & 1, (4793491 & i2) != 4793490)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1458846259, i2, -1, "com.vk.newsfeed.posting.crop_editor.presentation.base.view.CropEditorScreen (CropEditorScreen.kt:105)");
            }
            Object x5 = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x5 == c0012a) {
                ygk ygkVar4 = new ygk(cropFitContainerMode, postingPreviewRatio, imageCropArea, imageLink, izsVar, z3);
                imageLink2 = imageLink;
                M.R(ygkVar4);
                x5 = ygkVar4;
            } else {
                imageLink2 = imageLink;
            }
            ygk ygkVar5 = (ygk) x5;
            int i3 = i2 >> 6;
            ygkVar5.a(postingPreviewRatio, M, (i3 & 14) | 48);
            wh50 wh50Var = ygkVar5.g;
            wh50 wh50Var2 = ygkVar5.n;
            wh50 wh50Var3 = ygkVar5.o;
            wh50 wh50Var4 = ygkVar5.i;
            wh50 wh50Var5 = ygkVar5.v;
            wh50 wh50Var6 = ygkVar5.m;
            zhf0 zhf0Var2 = (zhf0) ((zak0) wh50Var6).getValue();
            Object x6 = M.x();
            if (x6 == c0012a) {
                x6 = new ngk(ygkVar5, null);
                M.R(x6);
            }
            int i4 = i2 & 14;
            bap.f(imageLink2, zhf0Var2, (wzs) x6, M, i4);
            Boolean bool = (Boolean) ((zak0) ygkVar5.j).getValue();
            bool.getClass();
            Object x7 = M.x();
            if (x7 == c0012a) {
                x7 = new ogk(ygkVar5, null);
                M.R(x7);
            }
            bap.g(bool, (wzs) x7, M, 0);
            Float valueOf = Float.valueOf(ygkVar5.d());
            ov70 ov70Var = new ov70(((ov70) ((zak0) wh50Var5).getValue()).a);
            Object x8 = M.x();
            if (x8 == c0012a) {
                x8 = new pgk(ygkVar5, null);
                M.R(x8);
            }
            bap.f(valueOf, ov70Var, (wzs) x8, M, 0);
            Long valueOf2 = Long.valueOf(((Number) ((zak0) ygkVar5.k).getValue()).longValue());
            Object x9 = M.x();
            if (x9 == c0012a) {
                x9 = new qgk(ygkVar5, null);
                M.R(x9);
            }
            bap.g(valueOf2, (wzs) x9, M, 0);
            float d = ygkVar5.d();
            if (((Boolean) ((zak0) wh50Var4).getValue()).booleanValue()) {
                f = d;
                th = null;
                aak0Var = jq2.c(0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 6);
            } else {
                f = d;
                th = null;
                aak0Var = new aak0();
            }
            Throwable th2 = th;
            mtk0 b = hg2.b(f, aak0Var, null, null, M, 0, 28);
            s3q0 s3q0Var = s3q0.a;
            Object x10 = M.x();
            if (x10 == c0012a) {
                x10 = new sgk(ygkVar5);
                M.R(x10);
            }
            q630.a aVar3 = q630.a.a;
            q630 b2 = skn0.b(aVar3, s3q0Var, (PointerInputEventHandler) x10);
            Object x11 = M.x();
            if (x11 == c0012a) {
                x11 = new tgk(ygkVar5);
                M.R(x11);
            }
            q630 b3 = skn0.b(b2, s3q0Var, (PointerInputEventHandler) x11);
            float floatValue = ygkVar5.e() ? ((Number) ((if2) ((zak0) ygkVar5.l).getValue()).d()).floatValue() : ((Boolean) ((zak0) wh50Var4).getValue()).booleanValue() ? ((Number) b.getValue()).floatValue() : ygkVar5.d();
            long j = ((ov70) ((zak0) wh50Var5).getValue()).a;
            zhf0 zhf0Var3 = (zhf0) ((zak0) wh50Var6).getValue();
            zhf0 zhf0Var4 = zhf0.e;
            if (zhf0Var3 == null || (zhf0Var = (zhf0) ((zak0) wh50Var3).getValue()) == null) {
                f2 = floatValue;
            } else {
                f2 = floatValue;
                zhf0 zhf0Var5 = (zhf0) ((zak0) wh50Var2).getValue();
                if (zhf0Var5 != null) {
                    ygkVar = ygkVar5;
                    q630Var = b3;
                    zhf0Var4 = new zhf0(zhf0Var3.a, (zhf0Var5.d - zhf0Var5.b) + zhf0Var3.b, zhf0Var3.c, zhf0Var3.d - (zhf0Var.d - zhf0Var.b));
                    boolean z4 = (((zhf0) ((zak0) wh50Var6).getValue()) != null || ((zhf0) ((zak0) wh50Var3).getValue()) == null || ((zhf0) ((zak0) wh50Var2).getValue()) == null) ? false : true;
                    x = M.x();
                    if (x != c0012a) {
                        ygk ygkVar6 = ygkVar;
                        x = new j37(1, ygkVar6, ygk.class, "onImageStateChange", "onImageStateChange(Lcom/vk/core/compose/image/fresco/FrescoImageState;)V", 0, 2);
                        ygkVar2 = ygkVar6;
                        M.R(x);
                    } else {
                        ygkVar2 = ygkVar;
                    }
                    fcy fcyVar = (fcy) x;
                    x2 = M.x();
                    if (x2 == c0012a) {
                        x2 = new j6e(ygkVar2, 12);
                        M.R(x2);
                    }
                    izs izsVar2 = (izs) x2;
                    x3 = M.x();
                    if (x3 == c0012a) {
                        x3 = new t1e(ygkVar2, 11);
                        M.R(x3);
                    }
                    ygk ygkVar7 = ygkVar2;
                    d(imageLink2, z, postingPreviewRatio, f2, j, q630Var, zhf0Var4, z4, izsVar2, (izs) x3, (izs) fcyVar, M, 905969664 | i4 | (i3 & 112) | (i2 & 896));
                    a.h hVar = androidx.compose.foundation.layout.a.g;
                    q630 c = txj0.c(aVar3, 1.0f);
                    x4 = M.x();
                    if (x4 != c0012a) {
                        ygkVar3 = ygkVar7;
                        x4 = new m4g(ygkVar3, 9);
                        M.R(x4);
                    } else {
                        ygkVar3 = ygkVar7;
                    }
                    q630 o = egi.o(c, (izs) x4);
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(hVar, dt1.a.n, M, 6);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c2 = qri.c(M, o);
                    cri.h7.getClass();
                    LayoutNode.a aVar4 = cri.a.b;
                    if (M.N() != null) {
                        n34.r();
                        throw th2;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar4);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, a, cri.a.f);
                    k9q0.w(M, D, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c2, cri.a.d);
                    boolean booleanValue = ((Boolean) ((zak0) wh50Var).getValue()).booleanValue();
                    Object x12 = M.x();
                    if (x12 == c0012a) {
                        x12 = new wze(ygkVar3, 13);
                        M.R(x12);
                    }
                    e(booleanValue, z, izsVar, (izs) x12, M, ((i2 >> 3) & 896) | 24582 | ((i2 >> 12) & 7168));
                    boolean booleanValue2 = ((Boolean) ((zak0) wh50Var).getValue()).booleanValue();
                    boolean e = ygkVar3.e();
                    Object x13 = M.x();
                    if (x13 == c0012a) {
                        x13 = new r9k(ygkVar3, 1);
                        M.R(x13);
                    }
                    a(booleanValue2, z2, e, izsVar, (izs) x13, M, 196614 | (i3 & 896) | ((i2 >> 9) & 57344));
                    aVar2 = M;
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
            }
            ygkVar = ygkVar5;
            q630Var = b3;
            if (((zhf0) ((zak0) wh50Var6).getValue()) != null) {
            }
            x = M.x();
            if (x != c0012a) {
            }
            fcy fcyVar2 = (fcy) x;
            x2 = M.x();
            if (x2 == c0012a) {
            }
            izs izsVar22 = (izs) x2;
            x3 = M.x();
            if (x3 == c0012a) {
            }
            ygk ygkVar72 = ygkVar2;
            d(imageLink2, z, postingPreviewRatio, f2, j, q630Var, zhf0Var4, z4, izsVar22, (izs) x3, (izs) fcyVar2, M, 905969664 | i4 | (i3 & 112) | (i2 & 896));
            a.h hVar2 = androidx.compose.foundation.layout.a.g;
            q630 c3 = txj0.c(aVar3, 1.0f);
            x4 = M.x();
            if (x4 != c0012a) {
            }
            q630 o2 = egi.o(c3, (izs) x4);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(hVar2, dt1.a.n, M, 6);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c22 = qri.c(M, o2);
            cri.h7.getClass();
            LayoutNode.a aVar42 = cri.a.b;
            if (M.N() != null) {
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(imageCropArea, postingPreviewRatio, z, z2, z3, cropFitContainerMode, izsVar, i) { // from class: xsna.jgk
                public final /* synthetic */ ImageCropArea c;
                public final /* synthetic */ PostingPreviewRatio d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ CropFitContainerMode h;
                public final /* synthetic */ izs i;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(196609);
                    ugk.b(ImageLink.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final double d, final long j, final q630 q630Var, final float f, final float f2, final zhf0 zhf0Var, izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        izs izsVar2;
        androidx.compose.runtime.a aVar2;
        qes qesVar;
        a.C0011a.C0012a c0012a;
        int i3;
        a.C0011a.C0012a c0012a2;
        boolean q;
        Object x;
        int i4;
        androidx.compose.runtime.a M = aVar.M(-374826271);
        if ((i & 6) == 0) {
            i2 = (M.q(d) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.p(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.n(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.n(f2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(zhf0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.y(izsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-374826271, i2, -1, "com.vk.newsfeed.posting.crop_editor.presentation.base.view.Frame (CropEditorScreen.kt:457)");
            }
            iyk0 iyk0Var = uvi.h;
            qes f3 = jcr.f(zhf0Var, d, ((azl) M.r(iyk0Var)).getDensity(), ((azl) M.r(iyk0Var)).I0(f2));
            double d2 = f3.a;
            double d3 = f3.b;
            double d4 = 2.0f;
            final double d5 = (d3 - f3.d) / d4;
            final double d6 = (d2 - f3.c) / d4;
            long j2 = l5g.j;
            e.a aVar3 = androidx.compose.ui.graphics.e.a;
            q630 m = hr80.m(q630Var, j2, aVar3);
            Object x2 = M.x();
            a.C0011a.C0012a c0012a3 = a.C0011a.a;
            if (x2 == c0012a3) {
                qesVar = f3;
                x2 = new jr3(9);
                M.R(x2);
            } else {
                qesVar = f3;
            }
            q630 a = rdu.a(m, (izs) x2);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, a);
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
            if (androidx.compose.runtime.b.d()) {
                i3 = i2;
                c0012a = c0012a3;
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            } else {
                c0012a = c0012a3;
                i3 = i2;
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            final long j3 = ylu0Var.getImage().a;
            ty6 ty6Var = dt1.a.f;
            q630.a aVar5 = q630.a.a;
            q630 d7 = txj0.d(hr80.m(aVar5, j, aVar3), 1.0f);
            cp10 d8 = ja8.d(ty6Var, false);
            int hashCode2 = Long.hashCode(n34.n(aVar2));
            sy90 D2 = aVar2.D();
            q630 c2 = qri.c(aVar2, d7);
            if (aVar2.N() == null) {
                n34.r();
                throw null;
            }
            aVar2.H();
            if (aVar2.L()) {
                aVar2.I(aVar4);
            } else {
                aVar2.f();
            }
            k9q0.w(aVar2, d8, cVar);
            k9q0.w(aVar2, D2, eVar);
            ur.d(hashCode2, aVar2, bVar, aVar2, c2678a);
            k9q0.w(aVar2, c2, dVar);
            q630 h = txj0.h(txj0.v(aVar5, (float) d3), (float) d2);
            boolean z = (i3 & 3670016) == 1048576;
            Object x3 = aVar2.x();
            if (z) {
                c0012a2 = c0012a;
            } else {
                c0012a2 = c0012a;
                if (x3 != c0012a2) {
                    izsVar2 = izsVar;
                    q630 o = egi.o(h, (izs) x3);
                    final qes qesVar2 = qesVar;
                    q = ((i3 & 7168) == 2048) | aVar2.q(d5) | aVar2.q(d6) | aVar2.J(qesVar2) | aVar2.p(j3);
                    x = aVar2.x();
                    if (!q || x == c0012a2) {
                        i4 = 0;
                        izs izsVar3 = new izs() { // from class: xsna.hgk
                            @Override // xsna.izs
                            public final Object invoke(Object obj) {
                                oio oioVar = (oio) obj;
                                float I0 = oioVar.I0(f);
                                long j4 = l5g.j;
                                float f4 = (float) d5;
                                float I02 = oioVar.I0(f4);
                                float f5 = (float) d6;
                                float I03 = oioVar.I0(f5);
                                long floatToRawIntBits = (Float.floatToRawIntBits(I03) & 4294967295L) | (Float.floatToRawIntBits(I02) << 32);
                                qes qesVar3 = qesVar2;
                                double d9 = qesVar3.d;
                                float I04 = oioVar.I0((float) d9);
                                float f6 = (float) qesVar3.c;
                                float I05 = oioVar.I0(f6);
                                oio.C1(oioVar, j4, floatToRawIntBits, (Float.floatToRawIntBits(I04) << 32) | (Float.floatToRawIntBits(I05) & 4294967295L), (Float.floatToRawIntBits(I0) & 4294967295L) | (Float.floatToRawIntBits(I0) << 32), null, 112);
                                float I06 = oioVar.I0(f4);
                                float I07 = oioVar.I0(f5);
                                long floatToRawIntBits2 = (Float.floatToRawIntBits(I06) << 32) | (Float.floatToRawIntBits(I07) & 4294967295L);
                                frm0 frm0Var = new frm0(1.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, null, 30);
                                float I08 = oioVar.I0((float) d9);
                                float I09 = oioVar.I0(f6);
                                oio.C1(oioVar, j3, floatToRawIntBits2, (Float.floatToRawIntBits(I08) << 32) | (Float.floatToRawIntBits(I09) & 4294967295L), (Float.floatToRawIntBits(I0) & 4294967295L) | (Float.floatToRawIntBits(I0) << 32), frm0Var, 224);
                                return s3q0.a;
                            }
                        };
                        aVar2.R(izsVar3);
                        x = izsVar3;
                    } else {
                        i4 = 0;
                    }
                    xa4.i(i4, aVar2, (izs) x, o);
                    aVar2.G();
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
            }
            izsVar2 = izsVar;
            x3 = new ggk(izsVar2, 0);
            aVar2.R(x3);
            q630 o2 = egi.o(h, (izs) x3);
            final qes qesVar22 = qesVar;
            q = ((i3 & 7168) == 2048) | aVar2.q(d5) | aVar2.q(d6) | aVar2.J(qesVar22) | aVar2.p(j3);
            x = aVar2.x();
            if (q) {
            }
            i4 = 0;
            izs izsVar32 = new izs() { // from class: xsna.hgk
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    oio oioVar = (oio) obj;
                    float I0 = oioVar.I0(f);
                    long j4 = l5g.j;
                    float f4 = (float) d5;
                    float I02 = oioVar.I0(f4);
                    float f5 = (float) d6;
                    float I03 = oioVar.I0(f5);
                    long floatToRawIntBits = (Float.floatToRawIntBits(I03) & 4294967295L) | (Float.floatToRawIntBits(I02) << 32);
                    qes qesVar3 = qesVar22;
                    double d9 = qesVar3.d;
                    float I04 = oioVar.I0((float) d9);
                    float f6 = (float) qesVar3.c;
                    float I05 = oioVar.I0(f6);
                    oio.C1(oioVar, j4, floatToRawIntBits, (Float.floatToRawIntBits(I04) << 32) | (Float.floatToRawIntBits(I05) & 4294967295L), (Float.floatToRawIntBits(I0) & 4294967295L) | (Float.floatToRawIntBits(I0) << 32), null, 112);
                    float I06 = oioVar.I0(f4);
                    float I07 = oioVar.I0(f5);
                    long floatToRawIntBits2 = (Float.floatToRawIntBits(I06) << 32) | (Float.floatToRawIntBits(I07) & 4294967295L);
                    frm0 frm0Var = new frm0(1.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, null, 30);
                    float I08 = oioVar.I0((float) d9);
                    float I09 = oioVar.I0(f6);
                    oio.C1(oioVar, j3, floatToRawIntBits2, (Float.floatToRawIntBits(I08) << 32) | (Float.floatToRawIntBits(I09) & 4294967295L), (Float.floatToRawIntBits(I0) & 4294967295L) | (Float.floatToRawIntBits(I0) << 32), frm0Var, 224);
                    return s3q0.a;
                }
            };
            aVar2.R(izsVar32);
            x = izsVar32;
            xa4.i(i4, aVar2, (izs) x, o2);
            aVar2.G();
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            izsVar2 = izsVar;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            final izs izsVar4 = izsVar2;
            s.d = new wzs() { // from class: xsna.igk
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ugk.c(d, j, q630Var, f, f2, zhf0Var, izsVar4, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(final ImageLink imageLink, final boolean z, final PostingPreviewRatio postingPreviewRatio, final float f, final long j, final q630 q630Var, final zhf0 zhf0Var, final boolean z2, final izs izsVar, final izs izsVar2, final izs izsVar3, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        boolean z3;
        float f2;
        long j2;
        boolean z4;
        androidx.compose.runtime.a M = aVar.M(-1101053691);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(imageLink) : M.y(imageLink) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z3 = z;
            i2 |= M.l(z3) ? 32 : 16;
        } else {
            z3 = z;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(postingPreviewRatio) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            f2 = f;
            i2 |= M.n(f2) ? 2048 : 1024;
        } else {
            f2 = f;
        }
        if ((i & 24576) == 0) {
            j2 = j;
            i2 |= M.p(j2) ? 16384 : 8192;
        } else {
            j2 = j;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(q630Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.J(zhf0Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            z4 = z2;
            i2 |= M.l(z4) ? 8388608 : 4194304;
        } else {
            z4 = z2;
        }
        if ((i & 100663296) == 0) {
            i2 |= M.y(izsVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= M.y(izsVar2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i3 = M.y(izsVar3) ? 4 : 2;
        if (M.t(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 3) == 2) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1101053691, i2, i3, "com.vk.newsfeed.posting.crop_editor.presentation.base.view.FramedImage (CropEditorScreen.kt:215)");
            }
            q630 d = txj0.d(q630.a.a, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            cw5 background = ylu0Var.getBackground();
            int i4 = i3;
            int i5 = i2;
            f9t.e(hr80.m(d, background.g, androidx.compose.ui.graphics.e.a), M, 0);
            int i6 = i5 << 3;
            int i7 = i5 >> 3;
            f(imageLink, z3, z4, w65.d(postingPreviewRatio), f2, j2, zhf0Var, izsVar, izsVar3, M, (i5 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i5 >> 15) & 896) | (i6 & 57344) | (i6 & 458752) | (i5 & 3670016) | (i7 & 29360128) | ((i4 << 24) & 234881024));
            double d2 = w65.d(postingPreviewRatio);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i8 = i5 >> 9;
            c(d2, ylu0Var2.i().a, q630Var, 8, 16, zhf0Var, izsVar2, M, (i8 & 896) | 27648 | (i7 & 458752) | (i8 & 3670016));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.zfk
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ugk.d(ImageLink.this, z, postingPreviewRatio, f, j, q630Var, zhf0Var, z2, izsVar, izsVar2, izsVar3, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void e(final boolean z, final boolean z2, final izs izsVar, final izs izsVar2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(181154458);
        int i3 = i & 6;
        r9g r9gVar = r9g.a;
        if (i3 == 0) {
            i2 = (M.J(r9gVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(izsVar2) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(181154458, i2, -1, "com.vk.newsfeed.posting.crop_editor.presentation.base.view.TopBar (CropEditorScreen.kt:398)");
            }
            final String N = d370.N(R.string.close_posting_talkback_title, 0, M);
            final String N2 = d370.N(R.string.accesibility_photo_editor_info, 0, M);
            mm2.b(r9gVar, z, null, null, null, null, kai.c(1055892850, new yzs() { // from class: xsna.kgk
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    TopBar$Middle.Text.d dVar;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1055892850, intValue, -1, "com.vk.newsfeed.posting.crop_editor.presentation.base.view.TopBar.<anonymous> (CropEditorScreen.kt:403)");
                    }
                    boolean z3 = z2;
                    TopBar$Middle.Text.Title a = TopBar$Middle.Text.Title.b.a(d370.N(z3 ? R.string.photo_editor_crop_photo_vk_title : R.string.photo_editor_crop_local_photo_header, 0, aVar2), null, null, null, null, aVar2, 196608, 30);
                    androidx.compose.runtime.a aVar3 = aVar2;
                    if (z3) {
                        aVar3.K(-236257354);
                        TopBar$Middle.Text.d a2 = TopBar$Middle.Text.d.a.a(d370.N(R.string.photo_editor_crop_photo_vk_subtitle, 0, aVar3), 0, 0, null, null, aVar3, 196608, 30);
                        aVar3 = aVar3;
                        aVar3.j();
                        dVar = a2;
                    } else {
                        aVar3.K(-236071292);
                        aVar3.j();
                        dVar = null;
                    }
                    TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(a, dVar, null, null, aVar3, 12);
                    izs izsVar3 = izsVar;
                    boolean J = aVar3.J(izsVar3);
                    Object x = aVar3.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (J || x == c0012a) {
                        x = new nse(izsVar3, 2);
                        aVar3.R(x);
                    }
                    gzs gzsVar = (gzs) x;
                    SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.ClearAndSet;
                    String str = N;
                    boolean J2 = aVar3.J(str);
                    Object x2 = aVar3.x();
                    if (J2 || x2 == c0012a) {
                        x2 = new dgk(str, 0);
                        aVar3.R(x2);
                    }
                    TopBar$Before.d a4 = TopBar$Before.d.a.a(null, gzsVar, null, com.vk.core.compose.component.semantics.b.a(mode, (izs) x2, 2), aVar3, 24576, 5);
                    qzu0.a.getClass();
                    lg90 u0 = qzu0.u0(aVar3);
                    boolean J3 = aVar3.J(izsVar3);
                    Object x3 = aVar3.x();
                    if (J3 || x3 == c0012a) {
                        x3 = new cc1(izsVar3, 4);
                        aVar3.R(x3);
                    }
                    gzs gzsVar2 = (gzs) x3;
                    String str2 = N2;
                    boolean J4 = aVar3.J(str2);
                    Object x4 = aVar3.x();
                    if (J4 || x4 == c0012a) {
                        x4 = new egk(str2, 0);
                        aVar3.R(x4);
                    }
                    androidx.compose.runtime.a aVar4 = aVar3;
                    com.vk.core.compose.component.topbar.a a5 = d.a.a(d.c.C0760d.a.a(u0, null, gzsVar2, null, null, com.vk.core.compose.component.semantics.b.a(mode, (izs) x4, 2), aVar4, 1572872, 26), null, null, null, aVar4, 24576, 14);
                    Object x5 = aVar4.x();
                    if (x5 == c0012a) {
                        x5 = new jt(20);
                        aVar4.R(x5);
                    }
                    q630 b = com.vk.core.compose.component.semantics.b.b(q630.a.a, com.vk.core.compose.component.semantics.b.a(null, (izs) x5, 3));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar4.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630 m = hr80.m(b, ylu0Var.getBackground().a, androidx.compose.ui.graphics.e.a);
                    izs izsVar4 = izsVar2;
                    boolean J5 = aVar4.J(izsVar4);
                    Object x6 = aVar4.x();
                    if (J5 || x6 == c0012a) {
                        x6 = new fgk(izsVar4, 0);
                        aVar4.R(x6);
                    }
                    muv0.h(a3, egi.o(m, (izs) x6), k.a.b.a, null, null, a4, a5, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar4, 384, 0, 8088);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
            }, M), M, (i2 & 14) | 1572864 | (i2 & 112), 30);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.lgk
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ugk.e(z, z2, izsVar, izsVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void f(final ImageLink imageLink, final boolean z, final boolean z2, final double d, final float f, final long j, final zhf0 zhf0Var, final izs izsVar, final izs izsVar2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        q630 v;
        androidx.compose.runtime.a M = aVar.M(1316131193);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(imageLink) : M.y(imageLink) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.q(d) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.n(f) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= M.p(j) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= M.J(zhf0Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= M.y(izsVar) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= M.y(izsVar2) ? 67108864 : 33554432;
        }
        if (M.t(i2 & 1, (i2 & 38347923) != 38347922)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1316131193, i2, -1, "com.vk.newsfeed.posting.crop_editor.presentation.base.view.ZoomableImage (CropEditorScreen.kt:256)");
            }
            double width = imageLink.getWidth() / imageLink.getHeight();
            qes f2 = jcr.f(zhf0Var, d, ((azl) M.r(uvi.h)).getDensity(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            double d2 = f2.a;
            double d3 = f2.b;
            q630.a aVar2 = q630.a.a;
            if (width > d) {
                v = txj0.v(txj0.h(aVar2, (float) d2), (float) (d2 * width));
            } else {
                double d4 = d3 / width;
                if (Double.isNaN(d4) || Double.isInfinite(d4)) {
                    d4 = 1.0d;
                }
                v = txj0.v(txj0.h(aVar2, (float) d4), (float) d3);
            }
            final String N = d370.N(R.string.photo_attach_title, 0, M);
            Pair m = fwu0.m(!z ? String.valueOf(imageLink.getUri()) : null, z ? String.valueOf(imageLink.getUri()) : null, null, null, null, null, M, 0, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            chs chsVar = (chs) m.d();
            final lg90 lg90Var = (lg90) m.g();
            izsVar2.invoke(chsVar);
            q630 B = txj0.B(txj0.d(aVar2, 1.0f), null, 1);
            dt1.a.getClass();
            cp10 d5 = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, B);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d5, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            int i3 = i2;
            boolean z3 = ((i2 & 896) == 256) | ((i3 & 29360128) == 8388608);
            Object x = M.x();
            if (z3 || x == a.C0011a.a) {
                x = new agk(z2, izsVar, 0);
                M.R(x);
            }
            q630 c2 = rdu.c(egi.o(v, (izs) x), f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 524260);
            cp10 d6 = ja8.d(dt1.a.b, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, c2);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, d6, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            mm2.f(z2, null, anp.e(null, 3), null, null, kai.c(-125387811, new yzs() { // from class: xsna.bgk
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-125387811, intValue, -1, "com.vk.newsfeed.posting.crop_editor.presentation.base.view.ZoomableImage.<anonymous>.<anonymous>.<anonymous> (CropEditorScreen.kt:313)");
                    }
                    q630 d7 = txj0.d(q630.a.a, 1.0f);
                    float f3 = (float) 8.0d;
                    double d8 = 8.0d / d;
                    if (Double.isNaN(d8) || Double.isInfinite(d8)) {
                        d8 = 1.0d;
                    }
                    q630 E = s200.E(d7, f3, (float) d8);
                    String str = N;
                    boolean J = aVar4.J(str);
                    Object x2 = aVar4.x();
                    if (J || x2 == a.C0011a.a) {
                        x2 = new com.vk.movika.sdk.base.logic.processor.c(str, 1);
                        aVar4.R(x2);
                    }
                    r0v0.a(lg90.this, egi0.b(E, false, (izs) x2), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, aVar4, 8, 252);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i3 >> 6) & 14) | 196992, 26);
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.cgk
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ugk.f(ImageLink.this, z, z2, d, f, j, zhf0Var, izsVar, izsVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
