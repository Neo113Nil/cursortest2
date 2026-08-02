package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.button.DropdownButton$Appearance;
import com.vk.core.compose.component.group.header.GroupHeader$Right;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.d;
import com.vk.core.compose.component.group.header.e;
import com.vk.core.compose.component.group.header.f;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.Pair;
import org.chromium.base.version_info.VersionConstants;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.aku;
import xsna.cku;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;
import xsna.v5v;

/* compiled from: MilkshakeGroupHeaderScreenContent.kt */
/* loaded from: classes18.dex */
public final class nn20 {
    public static final nn20 a = new nn20();

    /* compiled from: MilkshakeGroupHeaderScreenContent.kt */
    public static final class a {
        public final wh50 a = androidx.compose.runtime.k.b("only text");
        public final wh50 b = androidx.compose.runtime.k.b("none");
        public final wh50 c = androidx.compose.runtime.k.b("none");
        public final wh50 d = androidx.compose.runtime.k.b("none");
        public final wh50 e = androidx.compose.runtime.k.b("none");
        public final wh50 f = androidx.compose.runtime.k.b("none");
        public final wh50 g = androidx.compose.runtime.k.b("small");
        public final wh50 h;
        public final wh50 i;

        public a() {
            Boolean bool = Boolean.FALSE;
            this.h = androidx.compose.runtime.k.b(bool);
            this.i = androidx.compose.runtime.k.b(bool);
        }

        public final String a() {
            return (String) ((zak0) this.g).getValue();
        }

        public final String b() {
            return (String) ((zak0) this.b).getValue();
        }

        public final String c() {
            return (String) ((zak0) this.a).getValue();
        }
    }

    /* compiled from: MilkshakeGroupHeaderScreenContent.kt */
    public static final class b {
        public static final Object a = pn00.k(new Pair("none", null), new Pair("only text", new VkGroupHeader.c("Subtitle", null, null, 14)), new Pair("left icon", new VkGroupHeader.c("Subtitle", new VkGroupHeader.c.a.C0843a(new gko(R.drawable.vk_icon_fire_12), new x7g(R.attr.vk_ui_icon_accent_themed)), null, 12)), new Pair("right icon", new VkGroupHeader.c("Subtitle", null, new VkGroupHeader.c.a.C0843a(new gko(R.drawable.vk_icon_fire_12), new x7g(R.attr.vk_ui_icon_accent_themed)), 10)), new Pair("two icon", new VkGroupHeader.c("Subtitle", new VkGroupHeader.c.a.C0843a(new gko(R.drawable.vk_icon_fire_12), new x7g(R.attr.vk_ui_icon_accent_themed)), new VkGroupHeader.c.a.C0843a(new gko(R.drawable.vk_icon_fire_12), new x7g(R.attr.vk_ui_icon_accent_themed)), 8)));
        public static final Object b = pn00.k(new Pair("only text", new VkGroupHeader.d("<u>Title</u>", null, null, null, 0, null, 510)), new Pair("icon", new VkGroupHeader.d("<u>Title</u>", new com.vk.core.view.components.group.header.d(new gko(R.drawable.vk_icon_lock_outline_16), new x7g(R.attr.vk_ui_icon_accent_themed)), null, null, 0, null, IronSourceError.ERROR_CODE_INIT_FAILED)), new Pair("counter", new VkGroupHeader.d("<u>Title</u>", null, new com.vk.core.view.components.group.header.c(557, (VkCounter.CounterAppearance.Appearance) null, (VkCounter.Mode) null, 14), null, 0, null, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE)), new Pair("counter & icon", new VkGroupHeader.d("<u>Title</u>", new com.vk.core.view.components.group.header.d(new gko(R.drawable.vk_icon_lock_outline_16), new x7g(R.attr.vk_ui_icon_accent_themed)), new com.vk.core.view.components.group.header.c(557, (VkCounter.CounterAppearance.Appearance) null, (VkCounter.Mode) null, 14), null, 0, null, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED)));
        public static final Object c = pn00.k(new Pair("none", null), new Pair("icon", new VkGroupHeader.a.C0842a(new gko(R.drawable.vk_icon_user_circle_fill_blue_28), null, 6)));
        public static final Object d = pn00.k(new Pair("none", null), new Pair("button", new VkGroupHeader.Right.ExtraContent.a("Button", new gu0(25))), new Pair("detail", new VkGroupHeader.Right.ExtraContent.b(oq.d(tlo0.Companion, "Detail"))), new Pair("dropdown", new VkGroupHeader.Right.ExtraContent.Dropdown("Dropdown", new x84(21))), new Pair("more", new VkGroupHeader.Right.ExtraContent.c(2, new y84(10))));
        public static final Object e = pn00.k(new Pair("none", null), new Pair("icon", new VkGroupHeader.Right.b(new gko(R.drawable.vk_icon_add_outline_28), new x7g(R.attr.vk_ui_icon_accent_themed), new jb(23), 4)));
        public static final Object f = pn00.k(new Pair("none", null), new Pair("dismiss", new VkGroupHeader.Right.a.b(2, new pr6(18))), new Pair("chevron", new VkGroupHeader.Right.a.C0841a(2, new xu0(21))));
        public static final Object g = pn00.k(new Pair("small", VkGroupHeader.Size.Small), new Pair("medium", VkGroupHeader.Size.Medium), new Pair("large", VkGroupHeader.Size.Large), new Pair("extra large", VkGroupHeader.Size.ExtraLarge));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(a aVar, androidx.compose.runtime.a aVar2, int i) {
        zku zkuVar;
        xku xkuVar;
        iku ikuVar;
        com.vk.core.compose.component.group.header.b bVar;
        androidx.compose.runtime.a M = aVar2.M(-465635361);
        if (M.t(i & 1, (i & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-465635361, i, -1, "com.vk.design.demo.presentation.screens.groupheader.MilkshakeGroupHeaderScreenContent.ComposeGroupHeaderSkeleton (MilkshakeGroupHeaderScreenContent.kt:215)");
            }
            if (epx.f(aVar.c(), "none")) {
                M.K(1001612350);
                M.j();
                zkuVar = null;
            } else {
                M.K(1001505370);
                float f = VersionConstants.PRODUCT_MAJOR_VERSION;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1922897773, 54, -1, "com.vk.core.compose.component.group.header.skeleton.GroupHeaderSkeleton.Title.Companion.invoke (GroupHeaderSkeleton.kt:37)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(149397131, 54, -1, "com.vk.core.compose.component.group.header.skeleton.middle.remember (GroupHeaderTitleImpl.kt:35)");
                }
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new zku(f);
                    M.R(x);
                }
                zkuVar = (zku) x;
                ((zak0) zkuVar.a).setValue(new pco(f));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            }
            if (epx.f(aVar.b(), "none")) {
                M.K(1001796862);
                M.j();
                xkuVar = null;
            } else {
                M.K(1001687960);
                float f2 = 80;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1238304373, 54, -1, "com.vk.core.compose.component.group.header.skeleton.GroupHeaderSkeleton.Subtitle.Companion.invoke (GroupHeaderSkeleton.kt:50)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(707899535, 54, -1, "com.vk.core.compose.component.group.header.skeleton.middle.remember (GroupHeaderSubtitleImpl.kt:35)");
                }
                Object x2 = M.x();
                if (x2 == a.C0011a.a) {
                    x2 = new xku(f2);
                    M.R(x2);
                }
                xkuVar = (xku) x2;
                ((zak0) xkuVar.a).setValue(new pco(f2));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            }
            if (epx.f((String) ((zak0) aVar.c).getValue(), "icon")) {
                M.K(1001862769);
                float f3 = jgz.s().c;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1666961195, 48, -1, "com.vk.core.compose.component.group.header.skeleton.GroupHeaderSkeleton.Icon.Companion.invoke (GroupHeaderSkeleton.kt:24)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(617495423, 6, -1, "com.vk.core.compose.component.group.header.skeleton.left.remember (GroupHeaderIconImpl.kt:35)");
                }
                Object x3 = M.x();
                if (x3 == a.C0011a.a) {
                    x3 = new iku(f3);
                    M.R(x3);
                }
                ikuVar = (iku) x3;
                ((zak0) ikuVar.a).setValue(new pco(f3));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else {
                M.K(1001916894);
                M.j();
                ikuVar = null;
            }
            q630 f4 = txj0.f(q630.a.a, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(f4, ylu0Var.getBackground().r, androidx.compose.ui.graphics.e.a);
            String a2 = aVar.a();
            switch (a2.hashCode()) {
                case -1078030475:
                    if (a2.equals("medium")) {
                        bVar = b.c.a;
                        break;
                    }
                    bVar = b.c.a;
                    break;
                case -102295765:
                    if (a2.equals("extra large")) {
                        bVar = b.a.a;
                        break;
                    }
                    bVar = b.c.a;
                    break;
                case 102742843:
                    if (a2.equals("large")) {
                        bVar = b.C0749b.a;
                        break;
                    }
                    bVar = b.c.a;
                    break;
                case 109548807:
                    if (a2.equals("small")) {
                        bVar = b.d.a;
                        break;
                    }
                    bVar = b.c.a;
                    break;
                default:
                    bVar = b.c.a;
                    break;
            }
            com.vk.core.compose.component.group.header.h.a(m, ikuVar, zkuVar, xkuVar, bVar, ckv0.b(null, M, 1), M, SQLiteDatabase.OPEN_PRIVATECACHE, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jz1(this, aVar, i, 2);
        }
    }

    public final void b(int i, androidx.compose.runtime.a aVar, q630 q630Var, boolean z) {
        androidx.compose.runtime.a M = aVar.M(1161258610);
        int i2 = i | (M.l(z) ? 4 : 2) | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1161258610, i2, -1, "com.vk.design.demo.presentation.screens.groupheader.MilkshakeGroupHeaderScreenContent.Content (MilkshakeGroupHeaderScreenContent.kt:156)");
            }
            q630 f = txj0.f(q630Var, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar2 = dt1.a.n;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar2, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new a();
                M.R(x);
            }
            a aVar4 = (a) x;
            q630.a aVar5 = q630.a.a;
            float f2 = 10;
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 1, q9g.a(txj0.f(aVar5, 1.0f), 1.0f));
            cp10 d = ja8.d(dt1.a.c, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, F);
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
            k9q0.w(M, d, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            q630 D3 = p490.D(aVar5, p490.x(M), 14);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(f2), aVar2, M, 6);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D4 = M.D();
            q630 c3 = qri.c(M, D3);
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
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D4, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            djn0.a(true, false, M, 438, 0);
            nn20 nn20Var = a;
            if (z) {
                M.K(-1113813184);
                nn20Var.a(aVar4, M, 438);
            } else {
                M.K(-1121643970);
            }
            M.j();
            q630 f3 = txj0.f(aVar5, 1.0f);
            long j = wlb0.h(M).getBackground().r;
            e.a aVar6 = androidx.compose.ui.graphics.e.a;
            nn20Var.c(aVar4, hr80.m(f3, j, aVar6), M, 390);
            djn0.a(false, true, M, 438, 0);
            q630 f4 = txj0.f(aVar5, 1.0f);
            androidx.compose.foundation.layout.c a4 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(f2), aVar2, M, 6);
            int hashCode4 = Long.hashCode(n34.n(M));
            sy90 D5 = M.D();
            q630 c4 = qri.c(M, f4);
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
            k9q0.w(M, a4, cVar);
            k9q0.w(M, D5, eVar);
            ur.d(hashCode4, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar);
            nn20Var.e(aVar4, hr80.m(txj0.f(aVar5, 1.0f), wlb0.h(M).getBackground().r, aVar6), M, 390);
            if (z) {
                M.K(653089093);
                nn20Var.f(aVar4, hr80.m(txj0.f(aVar5, 1.0f), wlb0.h(M).getBackground().r, aVar6), M, 390);
            } else {
                M.K(644279048);
            }
            M.j();
            M.G();
            f9t.e(txj0.h(aVar5, f2), M, 6);
            nn20Var.d(aVar4, txj0.f(aVar5, 1.0f), M, 438);
            M.G();
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jn20(this, z, q630Var, i);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04c3  */
    /* JADX WARN: Type inference failed for: r7v23, types: [com.vk.core.compose.component.group.header.GroupHeader$Right$b] */
    /* JADX WARN: Type inference failed for: r8v16, types: [com.vk.core.compose.component.group.header.GroupHeader$Right$a$b] */
    /* JADX WARN: Type inference failed for: r8v21, types: [com.vk.core.compose.component.group.header.GroupHeader$Right$a$c] */
    /* JADX WARN: Type inference failed for: r8v26, types: [com.vk.core.compose.component.group.header.GroupHeader$Right$a$d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(a aVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a aVar3;
        aku.a aVar4;
        String str;
        Object obj;
        String str2;
        androidx.compose.runtime.a aVar5;
        com.vk.core.compose.component.group.header.e eVar;
        com.vk.core.compose.component.group.header.d dVar;
        String str3;
        int i2;
        int i3;
        cku.a.C2666a a2;
        cku.a.C2666a c2666a;
        cku ckuVar;
        com.vk.core.compose.component.group.header.b bVar;
        String str4;
        GroupHeader$Right.a.C0743a c0743a;
        String str5;
        int i4;
        GroupHeader$Right.a.C0743a c0743a2;
        GroupHeader$Right.a.C0743a c0743a3;
        int hashCode;
        GroupHeader$Right.Icon icon;
        Object obj2;
        String str6;
        GroupHeader$Right.Icon icon2;
        Object obj3;
        androidx.compose.runtime.a M = aVar2.M(-277100341);
        int i5 = i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i5 & 1, (i5 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-277100341, i5, -1, "com.vk.design.demo.presentation.screens.groupheader.MilkshakeGroupHeaderScreenContent.GroupHeaderComposeComponent (MilkshakeGroupHeaderScreenContent.kt:251)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                bpn0 bpn0Var = v5v.c;
                x = v5v.a.a("<u>Title</u>");
                M.R(x);
            }
            v5v v5vVar = (v5v) x;
            if (epx.f((String) ((zak0) aVar.c).getValue(), "icon")) {
                aku.a a3 = aku.a.C2548a.a(zq.c(M, -1123851625, R.drawable.vk_icon_user_circle_fill_blue_28, M), null, M, 14);
                M.j();
                aVar4 = a3;
            } else {
                M.K(-1123654311);
                M.j();
                aVar4 = null;
            }
            String str7 = v5vVar.a;
            if (drm0.D(aVar.c(), "icon", false)) {
                lg90 c = zq.c(M, 1349232904, R.drawable.vk_icon_lock_outline_16, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                str = str7;
                aVar5 = M;
                obj = "icon";
                str2 = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                com.vk.core.compose.component.group.header.e a4 = e.a.a(c, ylu0Var.getIcon().b, null, null, null, aVar5, 196616, 28);
                aVar5.j();
                eVar = a4;
            } else {
                str = str7;
                obj = "icon";
                str2 = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                aVar5 = M;
                aVar5.K(-1123258503);
                aVar5.j();
                eVar = null;
            }
            if (drm0.D(aVar.c(), "counter", false)) {
                aVar5.K(1349242238);
                androidx.compose.runtime.a aVar6 = aVar5;
                com.vk.core.compose.component.group.header.d a5 = d.a.a(557, null, null, null, null, aVar6, 196614, 30);
                aVar5 = aVar6;
                aVar5.j();
                dVar = a5;
            } else {
                aVar5.K(-1123101767);
                aVar5.j();
                dVar = null;
            }
            androidx.compose.runtime.a aVar7 = aVar5;
            com.vk.core.compose.component.group.header.f a6 = f.a.a(str, eVar, dVar, null, null, new mn20(v5vVar, aVar), null, null, false, aVar7, 805306368, 472);
            androidx.compose.runtime.a aVar8 = aVar7;
            if (epx.f(aVar.b(), "none")) {
                aVar8.K(-1122651150);
                aVar8.j();
                str3 = str2;
                i2 = 1040687336;
                i3 = -1;
                ckuVar = null;
            } else {
                aVar8.K(-1122573805);
                if (epx.f(aVar.b(), "left icon") || epx.f(aVar.b(), "two icon")) {
                    lg90 c2 = zq.c(aVar8, -1122403305, R.drawable.vk_icon_fire_12, aVar8);
                    str3 = str2;
                    i2 = 1040687336;
                    i3 = -1;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, str3);
                    }
                    ylu0 ylu0Var2 = (ylu0) aVar8.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    a2 = cku.a.C2666a.C2667a.a(c2, ylu0Var2.getIcon().b, aVar8);
                    aVar8.j();
                } else {
                    aVar8.K(-1122113735);
                    aVar8.j();
                    str3 = str2;
                    a2 = null;
                    i2 = 1040687336;
                    i3 = -1;
                }
                if (epx.f(aVar.b(), "right icon") || epx.f(aVar.b(), "two icon")) {
                    lg90 c3 = zq.c(aVar8, -1122005513, R.drawable.vk_icon_fire_12, aVar8);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(i2, 0, i3, str3);
                    }
                    ylu0 ylu0Var3 = (ylu0) aVar8.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    cku.a.C2666a a7 = cku.a.C2666a.C2667a.a(c3, ylu0Var3.getIcon().b, aVar8);
                    aVar8.j();
                    c2666a = a7;
                } else {
                    aVar8.K(-1121715943);
                    aVar8.j();
                    c2666a = null;
                }
                cku a8 = cku.b.a("Subtitle", a2, c2666a, null, aVar8, 24582, 8);
                aVar8 = aVar8;
                aVar8.j();
                ckuVar = a8;
            }
            String a9 = aVar.a();
            switch (a9.hashCode()) {
                case -1078030475:
                    if (a9.equals("medium")) {
                        bVar = b.c.a;
                        com.vk.core.compose.component.group.header.b bVar2 = bVar;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1366680121, 54, i3, "com.vk.design.demo.presentation.screens.groupheader.MilkshakeGroupHeaderScreenContent.buildGroupHeaderComposeRight (MilkshakeGroupHeaderScreenContent.kt:312)");
                        }
                        aVar8.K(880400793);
                        str4 = (String) ((zak0) aVar.d).getValue();
                        switch (str4.hashCode()) {
                            case -1377687758:
                                c0743a = null;
                                if (str4.equals("button")) {
                                    aVar8.K(-1256324392);
                                    Object x2 = aVar8.x();
                                    if (x2 == c0012a) {
                                        x2 = new ob0(18);
                                        aVar8.R(x2);
                                    }
                                    String str8 = str3;
                                    androidx.compose.runtime.a aVar9 = aVar8;
                                    str5 = str8;
                                    i4 = i3;
                                    GroupHeader$Right.a.C0743a a10 = GroupHeader$Right.a.C0743a.C0744a.a("Button", (gzs) x2, null, null, null, null, null, aVar9, 54, 32764);
                                    aVar8 = aVar9;
                                    aVar8.j();
                                    c0743a2 = a10;
                                    break;
                                }
                                aVar8.K(-291082151);
                                aVar8.j();
                                c0743a2 = c0743a;
                                str5 = str3;
                                i4 = i3;
                                break;
                            case -1335224239:
                                c0743a = null;
                                if (str4.equals("detail")) {
                                    aVar8.K(-1256321836);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-975847534, 390, i3, "com.vk.core.compose.component.group.header.GroupHeader.Right.ActionButton.Detail.Companion.invoke (GroupHeader.kt:641)");
                                    }
                                    Object x3 = aVar8.x();
                                    if (x3 == c0012a) {
                                        x3 = new GroupHeader$Right.a.b();
                                        aVar8.R(x3);
                                    }
                                    ?? r8 = (GroupHeader$Right.a.b) x3;
                                    ((zak0) r8.a).setValue("Detail");
                                    ((zak0) r8.b).setValue(null);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    aVar8.j();
                                    c0743a3 = r8;
                                    c0743a2 = c0743a3;
                                    str5 = str3;
                                    i4 = i3;
                                    break;
                                }
                                aVar8.K(-291082151);
                                aVar8.j();
                                c0743a2 = c0743a;
                                str5 = str3;
                                i4 = i3;
                            case -432061423:
                                c0743a = null;
                                if (str4.equals("dropdown")) {
                                    aVar8.K(-1256319332);
                                    Object x4 = aVar8.x();
                                    if (x4 == c0012a) {
                                        x4 = new vg0(21);
                                        aVar8.R(x4);
                                    }
                                    gzs gzsVar = (gzs) x4;
                                    DropdownButton$Appearance dropdownButton$Appearance = DropdownButton$Appearance.Neutral;
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(1901491764, 24630, i3, "com.vk.core.compose.component.group.header.GroupHeader.Right.ActionButton.Dropdown.Companion.invoke (GroupHeader.kt:795)");
                                    }
                                    Object x5 = aVar8.x();
                                    if (x5 == c0012a) {
                                        x5 = new GroupHeader$Right.a.c(gzsVar, dropdownButton$Appearance);
                                        aVar8.R(x5);
                                    }
                                    ?? r82 = (GroupHeader$Right.a.c) x5;
                                    ((zak0) r82.a).setValue("Dropdown");
                                    ((zak0) r82.c).setValue(gzsVar);
                                    ((zak0) r82.b).setValue(dropdownButton$Appearance);
                                    ((zak0) r82.d).setValue(null);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    aVar8.j();
                                    c0743a3 = r82;
                                    c0743a2 = c0743a3;
                                    str5 = str3;
                                    i4 = i3;
                                    break;
                                }
                                aVar8.K(-291082151);
                                aVar8.j();
                                c0743a2 = c0743a;
                                str5 = str3;
                                i4 = i3;
                            case 3357525:
                                if (str4.equals("more")) {
                                    aVar8.K(-1256316726);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(i2, 0, i3, str3);
                                    }
                                    ylu0 ylu0Var4 = (ylu0) aVar8.r(rrv0.a);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    long j = ylu0Var4.getIcon().l;
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(1672723535, 24576, i3, "com.vk.core.compose.component.group.header.GroupHeader.Right.ActionButton.More.Companion.invoke (GroupHeader.kt:601)");
                                    }
                                    Object x6 = aVar8.x();
                                    if (x6 == c0012a) {
                                        x6 = new GroupHeader$Right.a.d(j);
                                        aVar8.R(x6);
                                    }
                                    ?? r83 = (GroupHeader$Right.a.d) x6;
                                    ((zak0) r83.a).setValue(null);
                                    ((zak0) r83.c).setValue(null);
                                    ((zak0) r83.d).setValue(null);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    aVar8.j();
                                    c0743a3 = r83;
                                    c0743a2 = c0743a3;
                                    str5 = str3;
                                    i4 = i3;
                                    break;
                                }
                                c0743a = null;
                                aVar8.K(-291082151);
                                aVar8.j();
                                c0743a2 = c0743a;
                                str5 = str3;
                                i4 = i3;
                            case 3387192:
                                if (str4.equals("none")) {
                                    aVar8.K(-291414471);
                                    aVar8.j();
                                    str5 = str3;
                                    i4 = i3;
                                    c0743a2 = null;
                                    break;
                                }
                                c0743a = null;
                                aVar8.K(-291082151);
                                aVar8.j();
                                c0743a2 = c0743a;
                                str5 = str3;
                                i4 = i3;
                                break;
                            default:
                                c0743a = null;
                                aVar8.K(-291082151);
                                aVar8.j();
                                c0743a2 = c0743a;
                                str5 = str3;
                                i4 = i3;
                                break;
                        }
                        String str9 = (String) ((zak0) aVar.e).getValue();
                        hashCode = str9.hashCode();
                        if (hashCode != 3387192) {
                            icon = null;
                            if (str9.equals("none")) {
                                aVar8.K(-290983943);
                                aVar8.j();
                                obj2 = icon;
                                str6 = (String) ((zak0) aVar.f).getValue();
                                if (epx.f(str6, "none")) {
                                }
                                icon2 = icon;
                                ikg0 a11 = GroupHeader$Right.c.a(c0743a2, icon2, obj2, null, aVar8, 8);
                                aVar8.j();
                                if (androidx.compose.runtime.b.d()) {
                                }
                                androidx.compose.runtime.a aVar10 = aVar8;
                                com.vk.core.compose.component.group.header.g.b(a6, q630Var, bVar2, ckuVar, aVar4, a11, ((Boolean) ((zak0) aVar.h).getValue()).booleanValue(), aVar10, i5 & 112, 0);
                                aVar3 = aVar10;
                                if (androidx.compose.runtime.b.d()) {
                                }
                            }
                        } else if (hashCode == 742886971) {
                            icon = null;
                            if (str9.equals("chevron")) {
                                aVar8.K(-1256308371);
                                Object a12 = GroupHeader$Right.b.a.C0746a.a(3072, 7, aVar8, null, null, null);
                                aVar8.j();
                                obj3 = a12;
                                obj2 = obj3;
                                str6 = (String) ((zak0) aVar.f).getValue();
                                if (epx.f(str6, "none")) {
                                }
                                icon2 = icon;
                                ikg0 a112 = GroupHeader$Right.c.a(c0743a2, icon2, obj2, null, aVar8, 8);
                                aVar8.j();
                                if (androidx.compose.runtime.b.d()) {
                                }
                                androidx.compose.runtime.a aVar102 = aVar8;
                                com.vk.core.compose.component.group.header.g.b(a6, q630Var, bVar2, ckuVar, aVar4, a112, ((Boolean) ((zak0) aVar.h).getValue()).booleanValue(), aVar102, i5 & 112, 0);
                                aVar3 = aVar102;
                                if (androidx.compose.runtime.b.d()) {
                                }
                            }
                        } else if (hashCode == 1671672458 && str9.equals("dismiss")) {
                            aVar8.K(-1256310547);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1629553971, 3072, i4, "com.vk.core.compose.component.group.header.GroupHeader.Right.ActionIcon.Dismiss.Companion.invoke (GroupHeader.kt:935)");
                            }
                            Object x7 = aVar8.x();
                            if (x7 == c0012a) {
                                x7 = new GroupHeader$Right.b.C0747b(0);
                                aVar8.R(x7);
                            }
                            GroupHeader$Right.b.C0747b c0747b = (GroupHeader$Right.b.C0747b) x7;
                            icon = null;
                            ((zak0) c0747b.a).setValue(null);
                            ((zak0) c0747b.b).setValue(null);
                            ((zak0) c0747b.c).setValue(null);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            aVar8.j();
                            obj3 = c0747b;
                            obj2 = obj3;
                            str6 = (String) ((zak0) aVar.f).getValue();
                            if (epx.f(str6, "none")) {
                                aVar8.K(-290733959);
                                aVar8.j();
                            } else if (epx.f(str6, obj)) {
                                lg90 c4 = zq.c(aVar8, -1256302764, R.drawable.vk_icon_add_outline_28, aVar8);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, i4, str5);
                                }
                                ylu0 ylu0Var5 = (ylu0) aVar8.r(rrv0.a);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                androidx.compose.runtime.a aVar11 = aVar8;
                                GroupHeader$Right.Icon a13 = GroupHeader$Right.Icon.a.a(c4, ylu0Var5.getIcon().b, null, null, null, null, null, aVar11, 100663304, 252);
                                aVar8 = aVar11;
                                aVar8.j();
                                icon2 = a13;
                                ikg0 a1122 = GroupHeader$Right.c.a(c0743a2, icon2, obj2, null, aVar8, 8);
                                aVar8.j();
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                androidx.compose.runtime.a aVar1022 = aVar8;
                                com.vk.core.compose.component.group.header.g.b(a6, q630Var, bVar2, ckuVar, aVar4, a1122, ((Boolean) ((zak0) aVar.h).getValue()).booleanValue(), aVar1022, i5 & 112, 0);
                                aVar3 = aVar1022;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                    break;
                                }
                            } else {
                                aVar8.K(-290484967);
                                aVar8.j();
                            }
                            icon2 = icon;
                            ikg0 a11222 = GroupHeader$Right.c.a(c0743a2, icon2, obj2, null, aVar8, 8);
                            aVar8.j();
                            if (androidx.compose.runtime.b.d()) {
                            }
                            androidx.compose.runtime.a aVar10222 = aVar8;
                            com.vk.core.compose.component.group.header.g.b(a6, q630Var, bVar2, ckuVar, aVar4, a11222, ((Boolean) ((zak0) aVar.h).getValue()).booleanValue(), aVar10222, i5 & 112, 0);
                            aVar3 = aVar10222;
                            if (androidx.compose.runtime.b.d()) {
                            }
                        } else {
                            icon = null;
                        }
                        aVar8.K(-290820263);
                        aVar8.j();
                        obj2 = icon;
                        str6 = (String) ((zak0) aVar.f).getValue();
                        if (epx.f(str6, "none")) {
                        }
                        icon2 = icon;
                        ikg0 a112222 = GroupHeader$Right.c.a(c0743a2, icon2, obj2, null, aVar8, 8);
                        aVar8.j();
                        if (androidx.compose.runtime.b.d()) {
                        }
                        androidx.compose.runtime.a aVar102222 = aVar8;
                        com.vk.core.compose.component.group.header.g.b(a6, q630Var, bVar2, ckuVar, aVar4, a112222, ((Boolean) ((zak0) aVar.h).getValue()).booleanValue(), aVar102222, i5 & 112, 0);
                        aVar3 = aVar102222;
                        if (androidx.compose.runtime.b.d()) {
                        }
                    }
                    throw new IllegalArgumentException(aVar.a());
                case -102295765:
                    if (a9.equals("extra large")) {
                        bVar = b.a.a;
                        com.vk.core.compose.component.group.header.b bVar22 = bVar;
                        if (androidx.compose.runtime.b.d()) {
                        }
                        aVar8.K(880400793);
                        str4 = (String) ((zak0) aVar.d).getValue();
                        switch (str4.hashCode()) {
                            case -1377687758:
                                break;
                            case -1335224239:
                                break;
                            case -432061423:
                                break;
                            case 3357525:
                                break;
                            case 3387192:
                                break;
                        }
                        String str92 = (String) ((zak0) aVar.e).getValue();
                        hashCode = str92.hashCode();
                        if (hashCode != 3387192) {
                        }
                        aVar8.K(-290820263);
                        aVar8.j();
                        obj2 = icon;
                        str6 = (String) ((zak0) aVar.f).getValue();
                        if (epx.f(str6, "none")) {
                        }
                        icon2 = icon;
                        ikg0 a1122222 = GroupHeader$Right.c.a(c0743a2, icon2, obj2, null, aVar8, 8);
                        aVar8.j();
                        if (androidx.compose.runtime.b.d()) {
                        }
                        androidx.compose.runtime.a aVar1022222 = aVar8;
                        com.vk.core.compose.component.group.header.g.b(a6, q630Var, bVar22, ckuVar, aVar4, a1122222, ((Boolean) ((zak0) aVar.h).getValue()).booleanValue(), aVar1022222, i5 & 112, 0);
                        aVar3 = aVar1022222;
                        if (androidx.compose.runtime.b.d()) {
                        }
                    }
                    throw new IllegalArgumentException(aVar.a());
                case 102742843:
                    if (a9.equals("large")) {
                        bVar = b.C0749b.a;
                        com.vk.core.compose.component.group.header.b bVar222 = bVar;
                        if (androidx.compose.runtime.b.d()) {
                        }
                        aVar8.K(880400793);
                        str4 = (String) ((zak0) aVar.d).getValue();
                        switch (str4.hashCode()) {
                            case -1377687758:
                                break;
                            case -1335224239:
                                break;
                            case -432061423:
                                break;
                            case 3357525:
                                break;
                            case 3387192:
                                break;
                        }
                        String str922 = (String) ((zak0) aVar.e).getValue();
                        hashCode = str922.hashCode();
                        if (hashCode != 3387192) {
                        }
                        aVar8.K(-290820263);
                        aVar8.j();
                        obj2 = icon;
                        str6 = (String) ((zak0) aVar.f).getValue();
                        if (epx.f(str6, "none")) {
                        }
                        icon2 = icon;
                        ikg0 a11222222 = GroupHeader$Right.c.a(c0743a2, icon2, obj2, null, aVar8, 8);
                        aVar8.j();
                        if (androidx.compose.runtime.b.d()) {
                        }
                        androidx.compose.runtime.a aVar10222222 = aVar8;
                        com.vk.core.compose.component.group.header.g.b(a6, q630Var, bVar222, ckuVar, aVar4, a11222222, ((Boolean) ((zak0) aVar.h).getValue()).booleanValue(), aVar10222222, i5 & 112, 0);
                        aVar3 = aVar10222222;
                        if (androidx.compose.runtime.b.d()) {
                        }
                    }
                    throw new IllegalArgumentException(aVar.a());
                case 109548807:
                    if (a9.equals("small")) {
                        bVar = b.d.a;
                        com.vk.core.compose.component.group.header.b bVar2222 = bVar;
                        if (androidx.compose.runtime.b.d()) {
                        }
                        aVar8.K(880400793);
                        str4 = (String) ((zak0) aVar.d).getValue();
                        switch (str4.hashCode()) {
                            case -1377687758:
                                break;
                            case -1335224239:
                                break;
                            case -432061423:
                                break;
                            case 3357525:
                                break;
                            case 3387192:
                                break;
                        }
                        String str9222 = (String) ((zak0) aVar.e).getValue();
                        hashCode = str9222.hashCode();
                        if (hashCode != 3387192) {
                        }
                        aVar8.K(-290820263);
                        aVar8.j();
                        obj2 = icon;
                        str6 = (String) ((zak0) aVar.f).getValue();
                        if (epx.f(str6, "none")) {
                        }
                        icon2 = icon;
                        ikg0 a112222222 = GroupHeader$Right.c.a(c0743a2, icon2, obj2, null, aVar8, 8);
                        aVar8.j();
                        if (androidx.compose.runtime.b.d()) {
                        }
                        androidx.compose.runtime.a aVar102222222 = aVar8;
                        com.vk.core.compose.component.group.header.g.b(a6, q630Var, bVar2222, ckuVar, aVar4, a112222222, ((Boolean) ((zak0) aVar.h).getValue()).booleanValue(), aVar102222222, i5 & 112, 0);
                        aVar3 = aVar102222222;
                        if (androidx.compose.runtime.b.d()) {
                        }
                    }
                    throw new IllegalArgumentException(aVar.a());
                default:
                    throw new IllegalArgumentException(aVar.a());
            }
        }
        aVar3 = M;
        aVar3.h();
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new xmd(i, 2, this, aVar, q630Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x026d, code lost:
    
        if (r11 == r9) goto L60;
     */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(a aVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        char c;
        a.C0011a.C0012a c0012a;
        a aVar3 = aVar;
        androidx.compose.runtime.a M = aVar2.M(-1288065024);
        if (M.t(i & 1, (i & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1288065024, i, -1, "com.vk.design.demo.presentation.screens.groupheader.MilkshakeGroupHeaderScreenContent.GroupHeaderControls (MilkshakeGroupHeaderScreenContent.kt:428)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, q630Var);
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
            k9q0.w(M, c2, dVar);
            q630.a aVar5 = q630.a.a;
            q630 f = txj0.f(aVar5, 1.0f);
            a.g gVar = androidx.compose.foundation.layout.a.h;
            ty6.b bVar2 = dt1.a.k;
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(gVar, bVar2, M, 6);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, f);
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
            k9q0.w(M, c3, dVar);
            tpg0 tpg0Var = tpg0.a;
            q630 b2 = tpg0Var.b(1.0f, aVar5, true);
            ?? r6 = b.b;
            String c4 = aVar3.c();
            boolean J = M.J(aVar3);
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (J || x == c0012a2) {
                x = new kn20(aVar3, 0);
                M.R(x);
            }
            y9i0.a("Title", r6, c4, (izs) x, b2, M, 54, 0);
            q630 b3 = tpg0Var.b(1.0f, aVar5, true);
            ?? r62 = b.a;
            String b4 = aVar3.b();
            boolean J2 = M.J(aVar3);
            Object x2 = M.x();
            if (J2 || x2 == c0012a2) {
                x2 = new v4w(aVar3, 7);
                M.R(x2);
            }
            y9i0.a("Subtitle", r62, b4, (izs) x2, b3, M, 54, 0);
            q630 b5 = tpg0Var.b(1.0f, aVar5, true);
            ?? r63 = b.c;
            String str = (String) ((zak0) aVar3.c).getValue();
            boolean J3 = M.J(aVar3);
            Object x3 = M.x();
            if (J3 || x3 == c0012a2) {
                c = 6;
                x3 = new eiz(aVar3, 6);
                M.R(x3);
            } else {
                c = 6;
            }
            y9i0.a("Left", r63, str, (izs) x3, b5, M, 54, 0);
            M.G();
            q630 f2 = txj0.f(aVar5, 1.0f);
            androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(gVar, bVar2, M, 6);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c5 = qri.c(M, f2);
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
            k9q0.w(M, a4, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c5, dVar);
            q630 b6 = tpg0Var.b(1.0f, aVar5, true);
            ?? r64 = b.g;
            String a5 = aVar3.a();
            boolean J4 = M.J(aVar3);
            Object x4 = M.x();
            if (J4 || x4 == c0012a2) {
                x4 = new hs00(aVar3, 5);
                M.R(x4);
            }
            y9i0.a("Size", r64, a5, (izs) x4, b6, M, 54, 0);
            M.G();
            q630 f3 = txj0.f(aVar5, 1.0f);
            androidx.compose.foundation.layout.k a6 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, bVar2, M, 0);
            int hashCode4 = Long.hashCode(n34.n(M));
            sy90 D4 = M.D();
            q630 c6 = qri.c(M, f3);
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
            k9q0.w(M, a6, cVar);
            k9q0.w(M, D4, eVar);
            ur.d(hashCode4, M, bVar, M, c2678a);
            k9q0.w(M, c6, dVar);
            boolean booleanValue = ((Boolean) ((zak0) aVar.h).getValue()).booleanValue();
            q630 b7 = tpg0Var.b(1.0f, aVar5, true);
            boolean J5 = M.J(aVar);
            Object x5 = M.x();
            if (J5) {
                c0012a = c0012a2;
            } else {
                c0012a = c0012a2;
            }
            x5 = new pp00(aVar, 4);
            M.R(x5);
            a.C0011a.C0012a c0012a3 = c0012a;
            aVar3 = aVar;
            eku0.d("Show divider", (gzs) x5, b7, booleanValue, null, false, false, M, 6, 112);
            boolean booleanValue2 = ((Boolean) ((zak0) aVar3.i).getValue()).booleanValue();
            q630 b8 = tpg0Var.b(1.0f, aVar5, true);
            boolean J6 = M.J(aVar3);
            Object x6 = M.x();
            if (J6 || x6 == c0012a3) {
                x6 = new ln20(aVar3, 0);
                M.R(x6);
            }
            eku0.d("Highlight", (gzs) x6, b8, booleanValue2, null, false, false, M, 6, 112);
            M = M;
            M.G();
            w0n0.a(54, 0, M, "Right:", s200.D(aVar5, 12));
            q630 f4 = txj0.f(aVar5, 1.0f);
            androidx.compose.foundation.layout.k a7 = androidx.compose.foundation.layout.j.a(gVar, bVar2, M, 6);
            int hashCode5 = Long.hashCode(n34.n(M));
            sy90 D5 = M.D();
            q630 c7 = qri.c(M, f4);
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
            k9q0.w(M, a7, cVar);
            k9q0.w(M, D5, eVar);
            ur.d(hashCode5, M, bVar, M, c2678a);
            k9q0.w(M, c7, dVar);
            q630 b9 = tpg0Var.b(1.0f, aVar5, true);
            ?? r65 = b.d;
            String str2 = (String) ((zak0) aVar3.d).getValue();
            boolean J7 = M.J(aVar3);
            Object x7 = M.x();
            if (J7 || x7 == c0012a3) {
                x7 = new o3w(aVar3, 12);
                M.R(x7);
            }
            y9i0.a("Action Button", r65, str2, (izs) x7, b9, M, 54, 0);
            q630 b10 = tpg0Var.b(1.0f, aVar5, true);
            ?? r66 = b.e;
            String str3 = (String) ((zak0) aVar3.f).getValue();
            boolean J8 = M.J(aVar3);
            Object x8 = M.x();
            if (J8 || x8 == c0012a3) {
                x8 = new w7u(aVar3, 11);
                M.R(x8);
            }
            y9i0.a("Icon", r66, str3, (izs) x8, b10, M, 54, 0);
            q630 b11 = tpg0Var.b(1.0f, aVar5, true);
            ?? r67 = b.f;
            String str4 = (String) ((zak0) aVar3.e).getValue();
            boolean J9 = M.J(aVar3);
            Object x9 = M.x();
            if (J9 || x9 == c0012a3) {
                x9 = new w110(aVar3, 3);
                M.R(x9);
            }
            y9i0.a("Action Icon", r67, str4, (izs) x9, b11, M, 54, 0);
            M.G();
            M.G();
            s3q0 s3q0Var = s3q0.a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new dr3(i, 2, this, aVar3, q630Var);
        }
    }

    public final void e(a aVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(-1175385062);
        int i2 = (M.J(q630Var) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1175385062, i2, -1, "com.vk.design.demo.presentation.screens.groupheader.MilkshakeGroupHeaderScreenContent.GroupHeaderViewComponent (MilkshakeGroupHeaderScreenContent.kt:341)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new gky(6);
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean J = M.J(aVar);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                x2 = new es00(aVar, 4);
                M.R(x2);
            }
            ae2.a((i2 & 112) | 6, 0, M, izsVar, (izs) x2, q630Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mq0(i, 3, this, aVar, q630Var);
        }
    }

    public final void f(a aVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(-616099769);
        int i2 = (M.J(q630Var) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-616099769, i2, -1, "com.vk.design.demo.presentation.screens.groupheader.MilkshakeGroupHeaderScreenContent.GroupHeaderViewSkeletonComponent (MilkshakeGroupHeaderScreenContent.kt:379)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new k220(3);
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean J = M.J(aVar);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                x2 = new bbw(aVar, 8);
                M.R(x2);
            }
            ae2.a((i2 & 112) | 6, 0, M, izsVar, (izs) x2, q630Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new t6n(i, 1, this, aVar, q630Var);
        }
    }
}
