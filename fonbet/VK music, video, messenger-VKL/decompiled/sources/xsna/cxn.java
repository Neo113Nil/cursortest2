package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.C4498pe;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SeparatorAppearance;
import com.vk.core.compose.component.defaults.SeparatorDpi;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.donut.design.compose.banner.DonutBannerKt;
import com.vk.donut.design.compose.banner.DonutBannerSkeletonContent;
import com.vk.donut.design.compose.banner.DonutContentType;
import com.vk.donut.design.compose.banner.InfoBannerIcon;
import com.vk.donut.design.compose.banner.a;
import com.vk.donut.design.compose.banner.c;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.donut.price.model.template.item.DonutPriceTemplateItem;
import com.vk.donut.price.model.template.style.DonutPriceTemplateItemStyle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.ikv0;
import xsna.q630;
import xsna.ty6;

/* compiled from: DonutBannerContent.kt */
/* loaded from: classes18.dex */
public final class cxn implements yah0 {
    public final c.a b;
    public final swm0 c;
    public final swm0 d;
    public final DonutPriceTemplate e;
    public final p3u f;
    public final a.c g;
    public final a.c h;
    public final gvw i;

    public cxn() {
        c.a aVar = new c.a(e43.l(new hzn(DonutContentType.POST, "68 постов"), new hzn(DonutContentType.VIDEO, "10 видео"), new hzn(DonutContentType.CHAT, "5 чатов"), new hzn(DonutContentType.ARTICLE, "25 статей"), new hzn(DonutContentType.PODCAST, "7 подкастов")));
        this.b = aVar;
        swm0 swm0Var = new swm0("Регулярная поддержка", aVar, new vs9(null, ws2.e("100 ₽/мес")));
        this.c = swm0Var;
        swm0 swm0Var2 = new swm0("Поддержка не оплачена", new c.b("300 ₽/мес", null), new vs9(null, ws2.e("Управлять")));
        this.d = swm0Var2;
        this.e = new DonutPriceTemplate(e43.l(new DonutPriceTemplateItem.StrikethroughText("9999", DonutPriceTemplateItemStyle.SECONDARY), new DonutPriceTemplateItem.PlainText(" 7500 ₽/мес")));
        p3u p3uVar = new p3u("Цели автора", "Участвуйте в сборах", new vs9(null, ws2.e("от 50 ₽")));
        this.f = p3uVar;
        this.g = new a.c(swm0Var, p3uVar);
        this.h = new a.c(swm0Var2, p3uVar);
        this.i = new gvw(InfoBannerIcon.ERROR, "Пополните счёт, чтобы не потерять доступ к эксклюзивным материалам");
    }

    public static void e(Context context, String str) {
        ikv0.a aVar = new ikv0.a(context);
        aVar.u = new ikv0.d(str, (String) null, (ikv0.d.a) null, 6);
        aVar.n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        gzs gzsVar3;
        wh50 wh50Var;
        boolean z;
        wh50 wh50Var2;
        int i3;
        wh50 wh50Var3;
        androidx.compose.runtime.a M = aVar.M(-2012968901);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar2) ? 32 : 16;
        }
        int i4 = i & 24576;
        q630.a aVar3 = q630.a.a;
        if (i4 == 0) {
            i2 |= M.J(aVar3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (i & SQLiteDatabase.OPEN_PRIVATECACHE) == 0 ? M.J(this) : M.y(this) ? 131072 : 65536;
        }
        int i5 = i2;
        if (M.t(i5 & 1, (73747 & i5) != 73746)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2012968901, i5, -1, "com.vk.design.demo.presentation.screens.DonutBannerContent.Content (DonutBannerContent.kt:104)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var4 = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(Boolean.TRUE);
                M.R(x2);
            }
            wh50 wh50Var5 = (wh50) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x3);
            }
            wh50 wh50Var6 = (wh50) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x4);
            }
            wh50 wh50Var7 = (wh50) x4;
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x5);
            }
            wh50 wh50Var8 = (wh50) x5;
            boolean z2 = ((Boolean) wh50Var5.getValue()).booleanValue() || !((Boolean) wh50Var6.getValue()).booleanValue();
            if (z2 && ((Boolean) wh50Var7.getValue()).booleanValue()) {
                wh50Var = wh50Var5;
                z = true;
            } else {
                wh50Var = wh50Var5;
                z = false;
            }
            q630 d = txj0.d(aVar3, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                wh50Var2 = wh50Var4;
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            } else {
                wh50Var2 = wh50Var4;
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d, ylu0Var.getBackground().a, androidx.compose.ui.graphics.e.a);
            dt1.a.getClass();
            ty6.a aVar4 = dt1.a.o;
            a.m mVar = androidx.compose.foundation.layout.a.c;
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, aVar4, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            boolean z3 = z;
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            gzsVar3 = gzsVar;
            c(gzsVar3, gzsVar2, M, (i5 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | 512 | ((i5 >> 9) & 896));
            q630 D2 = p490.D(txj0.d(txj0.x(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 717, 1, aVar3), 1.0f), p490.x(M), 14);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c2 = qri.c(M, D2);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            djn0.a(true, false, M, 54, 2);
            f9t.e(txj0.h(aVar3, 8), M, 6);
            wh50 wh50Var9 = wh50Var;
            wh50 wh50Var10 = wh50Var2;
            b(((Boolean) wh50Var.getValue()).booleanValue(), z3, ((Boolean) wh50Var6.getValue()).booleanValue(), ((Boolean) wh50Var2.getValue()).booleanValue(), ((Boolean) wh50Var8.getValue()).booleanValue(), M, 262144 | (i5 & 458752));
            f9t.e(txj0.h(aVar3, 16), M, 6);
            SeparatorDpi separatorDpi = SeparatorDpi.At1x;
            SeparatorAppearance separatorAppearance = SeparatorAppearance.Primary;
            ijv0.c(separatorDpi, separatorAppearance, txj0.f(aVar3, 1.0f), M, 438, 0);
            boolean booleanValue = ((Boolean) wh50Var10.getValue()).booleanValue();
            Object x6 = M.x();
            if (x6 == c0012a) {
                x6 = new xwn(0, wh50Var10);
                M.R(x6);
            }
            eku0.d("Админ", (gzs) x6, null, booleanValue, null, false, false, M, 54, 116);
            Object x7 = M.x();
            if (x7 == c0012a) {
                x7 = new n26(1, wh50Var9);
                M.R(x7);
            }
            eku0.d("Две карточки", (gzs) x7, null, ((Boolean) wh50Var9.getValue()).booleanValue(), null, false, false, M, 54, 116);
            androidx.compose.runtime.a aVar6 = M;
            if (((Boolean) wh50Var9.getValue()).booleanValue()) {
                i3 = 1003500443;
                aVar6.K(1003500443);
            } else {
                aVar6.K(1010706672);
                boolean booleanValue2 = ((Boolean) wh50Var6.getValue()).booleanValue();
                Object x8 = aVar6.x();
                if (x8 == c0012a) {
                    wh50Var3 = wh50Var6;
                    x8 = new o26(2, wh50Var3);
                    aVar6.R(x8);
                } else {
                    wh50Var3 = wh50Var6;
                }
                wh50 wh50Var11 = wh50Var3;
                i3 = 1003500443;
                afv0.b(booleanValue2, "Цели", (gzs) x8, null, null, false, aVar6, Tensorflow.FRAME_WIDTH, 120);
                boolean z4 = !((Boolean) wh50Var11.getValue()).booleanValue();
                Object x9 = aVar6.x();
                if (x9 == c0012a) {
                    x9 = new p26(1, wh50Var11);
                    aVar6.R(x9);
                }
                afv0.b(z4, "Подписка", (gzs) x9, null, null, false, aVar6, Tensorflow.FRAME_WIDTH, 120);
                aVar6 = aVar6;
            }
            aVar6.j();
            if (z2) {
                aVar6.K(1011199727);
                boolean booleanValue3 = ((Boolean) wh50Var7.getValue()).booleanValue();
                Object x10 = aVar6.x();
                if (x10 == c0012a) {
                    x10 = new q26(1, wh50Var7);
                    aVar6.R(x10);
                }
                androidx.compose.runtime.a aVar7 = aVar6;
                eku0.d("Ошибка оплаты", (gzs) x10, null, booleanValue3, null, false, false, aVar7, 54, 116);
                aVar6 = aVar7;
            } else {
                aVar6.K(i3);
            }
            aVar6.j();
            boolean booleanValue4 = ((Boolean) wh50Var8.getValue()).booleanValue();
            Object x11 = aVar6.x();
            if (x11 == c0012a) {
                x11 = new r26(1, wh50Var8);
                aVar6.R(x11);
            }
            androidx.compose.runtime.a aVar8 = aVar6;
            eku0.d("Скидки", (gzs) x11, null, booleanValue4, null, false, false, aVar8, 54, 116);
            ijv0.c(separatorDpi, separatorAppearance, txj0.f(aVar3, 1.0f), aVar8, 438, 0);
            aVar2 = aVar8;
            d(8 | ((i5 >> 15) & 14), aVar2);
            aVar2.G();
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            gzsVar3 = gzsVar;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new bxn(this, gzsVar3, gzsVar2, x5Var, izsVar, i);
        }
    }

    public final void b(final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-281704876);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.l(z5) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (i & SQLiteDatabase.OPEN_PRIVATECACHE) == 0 ? M.J(this) : M.y(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-281704876, i2, -1, "com.vk.design.demo.presentation.screens.DonutBannerContent.Banner (DonutBannerContent.kt:202)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            swm0 swm0Var = new swm0("Регулярная поддержка", this.b, new vs9(null, z1o.a(this.e, fdi.F(M), M, 0)));
            p3u p3uVar = this.f;
            com.vk.donut.design.compose.banner.a cVar = new a.c(swm0Var, p3uVar);
            if (z && z2) {
                cVar = this.h;
            } else if (!z || !z5) {
                cVar = z ? this.g : z3 ? new a.b(p3uVar) : z2 ? new a.b(this.d) : z5 ? new a.b(swm0Var) : new a.b(this.c);
            }
            String str = z4 && !z3 ? "2.3K донов" : null;
            String str2 = z5 && !z3 ? "–25% за месяц" : null;
            int i3 = 458752 & i2;
            boolean y = (i3 == 131072 || ((i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && M.y(this))) | M.y(context);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (y || x == obj) {
                x = new ll7(this, context);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            if (!z4) {
                gzsVar = null;
            }
            boolean y2 = (i3 == 131072 || ((i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && M.y(this))) | M.y(context);
            Object x2 = M.x();
            if (y2 || x2 == obj) {
                x2 = new iz9(this, context);
                M.R(x2);
            }
            gzs gzsVar2 = (gzs) x2;
            if (z4) {
                gzsVar2 = null;
            }
            gzs gzsVar3 = gzsVar2;
            gvw gvwVar = z2 ? this.i : null;
            boolean y3 = (i3 == 131072 || ((i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && M.y(this))) | M.y(context);
            Object x3 = M.x();
            if (y3 || x3 == obj) {
                x3 = new jz9(this, context);
                M.R(x3);
            }
            gzs gzsVar4 = (gzs) x3;
            boolean y4 = M.y(context) | (i3 == 131072 || ((i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && M.y(this)));
            Object x4 = M.x();
            if (y4 || x4 == obj) {
                x4 = new ywn(this, context);
                M.R(x4);
            }
            aVar2 = M;
            DonutBannerKt.d("VK Донат", str, cVar, gzsVar4, (gzs) x4, null, str2, gvwVar, z5, gzsVar3, gzsVar, null, aVar2, 6 | ((i2 << 12) & 234881024), C4498pe.e);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.zwn
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    cxn.this.b(z, z2, z3, z4, z5, (androidx.compose.runtime.a) obj2, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void c(gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        lg90 c;
        androidx.compose.runtime.a M = aVar.M(1033367499);
        if ((i & 6) == 0) {
            i2 = i | (M.y(gzsVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar2) ? 32 : 16;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1033367499, i3, -1, "com.vk.design.demo.presentation.screens.DonutBannerContent.DonutBannerContentTopBar (DonutBannerContent.kt:239)");
            }
            aVar2 = M;
            TopBar$Middle.Text a = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Donut banner", null, null, null, null, aVar2, 196614, 30), null, null, null, aVar2, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b = or.b(aVar2, -45049119, R.drawable.vk_icon_arrow_left_outline_28, aVar2, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            TopBar$Before.e a2 = TopBar$Before.e.a.a(b, null, gzsVar, null, null, null, aVar2, 1572872 | ((i3 << 6) & 896), 58);
            if (((Boolean) aVar2.r(vsx.b)).booleanValue()) {
                aVar2.K(928737303);
                c = jh.c(qzu0.a, aVar2);
            } else {
                aVar2.K(928738136);
                c = j8.c(qzu0.a, aVar2);
            }
            muv0.h(a, null, null, null, null, a2, d.a.a(d.c.C0760d.a.a(c, null, gzsVar2, null, null, null, aVar2, 1572872 | ((i3 << 3) & 896), 58), null, null, null, aVar2, 24576, 14), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 0, 0, 8094);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new owl(i, 1, this, gzsVar, gzsVar2);
        }
    }

    public final void d(final int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1721685444);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1721685444, i, -1, "com.vk.design.demo.presentation.screens.DonutBannerContent.DonutBannerSkeletons (DonutBannerContent.kt:255)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            a.j g = androidx.compose.foundation.layout.a.g(kqu0.t);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630.a.a);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            com.vk.donut.design.compose.banner.b.g(new DonutBannerSkeletonContent.a(DonutBannerSkeletonContent.Type.Regular), null, M, 0, 2);
            com.vk.donut.design.compose.banner.b.g(new DonutBannerSkeletonContent.a(DonutBannerSkeletonContent.Type.Goals), null, M, 0, 2);
            com.vk.donut.design.compose.banner.b.g(DonutBannerSkeletonContent.b.a, null, M, 0, 2);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.axn
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    cxn.this.d(I, (androidx.compose.runtime.a) obj);
                    return s3q0.a;
                }
            };
        }
    }
}
