package xsna;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.RichCell$Middle;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.games.model.GamesCatalogSection;
import com.vk.games.model.GamesCatalogUser;
import com.vkontakte.android.R;
import xsna.djc;
import xsna.phw;

/* compiled from: GamesNotificationHolder.kt */
/* loaded from: classes17.dex */
public final class hgt {
    public static final void a(r7t r7tVar, rha rhaVar, izs izsVar, xvy xvyVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        r7t r7tVar2;
        int i2;
        androidx.compose.runtime.a M = aVar.M(-597943485);
        if ((i & 6) == 0) {
            r7tVar2 = r7tVar;
            i2 = (M.J(r7tVar2) ? 4 : 2) | i;
        } else {
            r7tVar2 = r7tVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(rhaVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(xvyVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-597943485, i2, -1, "com.vk.games.presentation.components.GamesCatalogDetailNotificationHolder (GamesNotificationHolder.kt:88)");
            }
            boolean z = (i2 & 896) == 256;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new cgt(new ih4(izsVar, 3), new d74(izsVar, 5), new mmd(izsVar, 1), new v77(izsVar, 3));
                M.R(x);
            }
            c(r7tVar2, rhaVar, (cgt) x, xvyVar, q630Var, null, M, i2 & 64638, 32);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new b4c(r7tVar, rhaVar, izsVar, xvyVar, q630Var, i, 1);
        }
    }

    public static final void b(final r7t r7tVar, final rha rhaVar, final izs izsVar, final xvy xvyVar, final q630 q630Var, final Integer num, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1467609269);
        if ((i & 6) == 0) {
            i2 = (M.J(r7tVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(rhaVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(xvyVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(num) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1467609269, i2, -1, "com.vk.games.presentation.components.GamesCatalogNotificationHolder (GamesNotificationHolder.kt:61)");
            }
            boolean z = (i2 & 896) == 256;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new cgt(new dgt(izsVar, 0), new uw(izsVar, 4), new d8k(izsVar, 2), new egt(izsVar, 0));
                M.R(x);
            }
            c(r7tVar, rhaVar, (cgt) x, xvyVar, q630Var, num, M, i2 & 523390, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.fgt
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hgt.b(r7t.this, rhaVar, izsVar, xvyVar, q630Var, num, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final r7t r7tVar, rha rhaVar, final cgt cgtVar, xvy xvyVar, q630 q630Var, Integer num, androidx.compose.runtime.a aVar, int i, int i2) {
        int i3;
        Integer num2;
        cgt cgtVar2;
        Integer num3;
        androidx.compose.runtime.f s;
        String str;
        WebApiApplication webApiApplication;
        String str2;
        com.vk.core.compose.component.cell.content.f1 f1Var;
        a.C0011a.C0012a c0012a;
        cgt cgtVar3;
        Integer num4;
        boolean z;
        Object x;
        boolean z2;
        Object x2;
        boolean z3;
        Object x3;
        androidx.compose.runtime.a M = aVar.M(1830392723);
        if ((i & 6) == 0) {
            i3 = (M.J(r7tVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(rhaVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.J(cgtVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.J(xvyVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= M.J(q630Var) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            num2 = num;
            i3 |= M.J(num2) ? 131072 : 65536;
            if (M.t(i3 & 1, (74899 & i3) == 74898)) {
                cgtVar2 = cgtVar;
                M.h();
                num3 = num2;
            } else {
                if (i4 != 0) {
                    num2 = null;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1830392723, i3, -1, "com.vk.games.presentation.components.GamesNotificationHolder (GamesNotificationHolder.kt:115)");
                }
                String N = d370.N(R.string.vk_accessibility_avatar, 0, M);
                GamesCatalogUser gamesCatalogUser = r7tVar.e;
                GamesCatalogSection.GamesNotificationSection.GamesNotificationInfo.Type type = r7tVar.f;
                WebApiApplication webApiApplication2 = r7tVar.d.a;
                String str3 = gamesCatalogUser.g;
                if (str3 != null) {
                    WebImageSize.CREATOR.getClass();
                    str = WebImageSize.a.a(100, str3).b;
                } else {
                    str = gamesCatalogUser.e;
                    if (str == null && (str = gamesCatalogUser.f) == null) {
                        str = "";
                    }
                }
                Integer num5 = num2;
                phw a = phw.a.a(fwu0.l(null, str, null, null, M, 0, 61), null, null, null, null, M, 196616, 30);
                Cell$Left.Main.Size size = Cell$Left.Main.Size.Medium;
                int i5 = i3 & 896;
                int i6 = i3 & 14;
                boolean z4 = (i6 == 4) | (i5 == 256);
                Object x4 = M.x();
                a.C0011a.C0012a c0012a2 = a.C0011a.a;
                if (z4 || x4 == c0012a2) {
                    x4 = new ie3(12, cgtVar, r7tVar);
                    M.R(x4);
                }
                gzs gzsVar = (gzs) x4;
                boolean J = M.J(N);
                Object x5 = M.x();
                if (J || x5 == c0012a2) {
                    x5 = new hba(N, 1);
                    M.R(x5);
                }
                int i7 = i3;
                com.vk.core.compose.component.cell.content.t a2 = com.vk.core.compose.component.cell.content.e.a(a, size, null, null, null, gzsVar, com.vk.core.compose.component.semantics.b.a(null, (izs) x5, 3), M, 100663344, 92);
                float f = xcv0.a;
                PictureRadius pictureRadius = PictureRadius.Large;
                WebImageSize f2 = webApiApplication2.d.b.f(100);
                phw a3 = phw.a.a(fwu0.l(null, f2 != null ? f2.b : null, null, null, M, 0, 61), null, null, null, null, M, 196616, 30);
                boolean z5 = i6 == 4;
                Object x6 = M.x();
                if (z5 || x6 == c0012a2) {
                    x6 = new wcj(r7tVar, 15);
                    M.R(x6);
                }
                com.vk.core.compose.component.cell.content.z a4 = com.vk.core.compose.component.cell.content.s.a(a3, f, pictureRadius, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x6, 3), M, 12607488, 44);
                String gamesCatalogUser2 = gamesCatalogUser.toString();
                zqv0 zqv0Var = new zqv0(new klv0(null, VkColorToken.TextLink), 14);
                boolean z6 = (i6 == 4) | (i5 == 256);
                Object x7 = M.x();
                if (z6 || x7 == c0012a2) {
                    x7 = new i9z() { // from class: xsna.ggt
                        @Override // xsna.i9z
                        public final void a(q8z q8zVar) {
                            cgt.this.a.invoke(new djc.f(r7tVar.e.a));
                        }
                    };
                    M.R(x7);
                }
                h2v0 h2v0Var = new h2v0(gamesCatalogUser2, zqv0Var, (i9z) x7);
                int i8 = ((i7 << 3) & 112) | 8;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1691957632, i8, -1, "com.vk.games.presentation.catalog.model.items.GameNotificationItem.getTitle (GameNotificationItem.kt:69)");
                }
                M.K(-1821317278);
                s8u0 s8u0Var = new s8u0(0);
                String str4 = gamesCatalogUser.c + (char) 160 + gamesCatalogUser.d;
                s8u0Var.e(str4);
                rdi.D(s8u0Var, str4, h2v0Var);
                GamesCatalogSection.GamesNotificationSection.GamesNotificationInfo.Type type2 = GamesCatalogSection.GamesNotificationSection.GamesNotificationInfo.Type.Invite;
                if (type == type2) {
                    M.K(1967294529);
                    String N2 = d370.N(R.string.vk_games_invite_to_game, 0, M);
                    webApiApplication = webApiApplication2;
                    String str5 = webApiApplication.c;
                    s8u0Var.e(" ");
                    s8u0Var.e(N2);
                    s8u0Var.a.append((char) 160);
                    s8u0Var.e(str5);
                    rdi.C(s8u0Var, str5, null);
                } else {
                    webApiApplication = webApiApplication2;
                    M.K(1964805942);
                }
                M.j();
                M.j();
                us2 j = s8u0Var.j(8, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                WebApiApplication webApiApplication3 = webApiApplication;
                com.vk.core.compose.component.cell.content.f1 b = RichCell$Middle.h.b.b(j, true, null, null, null, M, 196656, 28);
                String str6 = r7tVar.g;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(733417960, i6, -1, "com.vk.games.presentation.catalog.model.items.GameNotificationItem.getSubTitle (GameNotificationItem.kt:55)");
                }
                if (type == type2) {
                    M.K(755881670);
                    M.j();
                    str2 = null;
                } else {
                    if (str6 == null || drm0.N(str6)) {
                        M.K(755967075);
                        str6 = d370.O(gamesCatalogUser.b == GamesCatalogUser.BaseSex.FEMALE ? R.string.vk_games_notify_request_f : R.string.vk_games_notify_request_m, new Object[]{webApiApplication3.c}, M);
                        M.j();
                    } else {
                        M.K(755934246);
                        M.j();
                    }
                    str2 = str6;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (str2 == null) {
                    M.K(326598573);
                    M.j();
                    f1Var = null;
                } else {
                    M.K(326598574);
                    com.vk.core.compose.component.cell.content.f1 a5 = RichCell$Middle.g.b.a(str2, true, null, null, null, M, 196656, 28);
                    M.j();
                    f1Var = a5;
                }
                qvo0 qvo0Var = qvo0.a;
                int i9 = r7tVar.k;
                Resources resources = ((Context) M.r(AndroidCompositionLocals_androidKt.b)).getResources();
                qvo0Var.getClass();
                com.vk.core.compose.component.cell.content.f1 a6 = RichCell$Middle.c.b.a(qvo0.h(i9, resources, true), null, null, null, M, 196608, 30);
                ButtonStyle buttonStyle = ButtonStyle.Primary;
                ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                ButtonSize buttonSize = ButtonSize.Small;
                String N3 = d370.N(R.string.vk_games_play_button, 0, M);
                boolean z7 = (i6 == 4) | (i5 == 256) | ((i7 & 458752) == 131072);
                Object x8 = M.x();
                if (z7) {
                    c0012a = c0012a2;
                } else {
                    c0012a = c0012a2;
                    if (x8 != c0012a) {
                        cgtVar3 = cgtVar;
                        num4 = num5;
                        Integer num6 = num4;
                        cgtVar2 = cgtVar3;
                        com.vk.core.compose.component.cell.content.v a7 = RichCell$Middle.a.C0734a.a(buttonStyle, buttonAppearance, buttonSize, N3, null, (gzs) x8, M, 438, 196608, 16368);
                        ButtonStyle buttonStyle2 = ButtonStyle.Secondary;
                        String N4 = d370.N(R.string.vk_games_remove_request, 0, M);
                        z = (i6 != 4) | (i5 != 256);
                        x = M.x();
                        if (!z || x == c0012a) {
                            x = new pw(12, cgtVar2, r7tVar);
                            M.R(x);
                        }
                        boolean z8 = false;
                        com.vk.core.compose.component.cell.content.v a8 = RichCell$Middle.a.C0734a.a(buttonStyle2, buttonAppearance, buttonSize, N4, null, (gzs) x, M, 438, 196608, 16368);
                        q630 f3 = txj0.f(q630Var, 1.0f);
                        boolean z9 = rhaVar.b;
                        float f4 = rhaVar.c;
                        z2 = (i6 != 4) | (i5 != 256);
                        x2 = M.x();
                        if (!z2 || x2 == c0012a) {
                            x2 = new com.vk.movika.sdk.base.flow.binding.l(9, cgtVar2, r7tVar);
                            M.R(x2);
                        }
                        gzs gzsVar2 = (gzs) x2;
                        boolean z10 = i5 != 256;
                        if (i6 == 4) {
                            z8 = true;
                        }
                        z3 = z10 | z8;
                        x3 = M.x();
                        if (!z3 || x3 == c0012a) {
                            x3 = new com.vk.movika.sdk.base.ui.i(15, cgtVar2, r7tVar);
                            M.R(x3);
                        }
                        q630 f5 = vbh0.f(f3, z9, xvyVar, 0.01f, f4, null, gzsVar2, (gzs) x3, 48);
                        com.vk.core.compose.component.cell.content.b1 a9 = RichCell$Middle.b.a(null, b, f1Var, a6, null, a7, a8, null, null, M, 0, 1827);
                        M = M;
                        ygv0.a(f5, a2, a9, a4, null, M, 0, 48);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        num3 = num6;
                    }
                }
                cgtVar3 = cgtVar;
                num4 = num5;
                x8 = new k14(cgtVar3, r7tVar, num4, 6);
                M.R(x8);
                Integer num62 = num4;
                cgtVar2 = cgtVar3;
                com.vk.core.compose.component.cell.content.v a72 = RichCell$Middle.a.C0734a.a(buttonStyle, buttonAppearance, buttonSize, N3, null, (gzs) x8, M, 438, 196608, 16368);
                ButtonStyle buttonStyle22 = ButtonStyle.Secondary;
                String N42 = d370.N(R.string.vk_games_remove_request, 0, M);
                if (i5 != 256) {
                }
                z = (i6 != 4) | (i5 != 256);
                x = M.x();
                if (!z) {
                }
                x = new pw(12, cgtVar2, r7tVar);
                M.R(x);
                boolean z82 = false;
                com.vk.core.compose.component.cell.content.v a82 = RichCell$Middle.a.C0734a.a(buttonStyle22, buttonAppearance, buttonSize, N42, null, (gzs) x, M, 438, 196608, 16368);
                q630 f32 = txj0.f(q630Var, 1.0f);
                boolean z92 = rhaVar.b;
                float f42 = rhaVar.c;
                if (i5 != 256) {
                }
                z2 = (i6 != 4) | (i5 != 256);
                x2 = M.x();
                if (!z2) {
                }
                x2 = new com.vk.movika.sdk.base.flow.binding.l(9, cgtVar2, r7tVar);
                M.R(x2);
                gzs gzsVar22 = (gzs) x2;
                if (i5 != 256) {
                }
                if (i6 == 4) {
                }
                z3 = z10 | z82;
                x3 = M.x();
                if (!z3) {
                }
                x3 = new com.vk.movika.sdk.base.ui.i(15, cgtVar2, r7tVar);
                M.R(x3);
                q630 f52 = vbh0.f(f32, z92, xvyVar, 0.01f, f42, null, gzsVar22, (gzs) x3, 48);
                com.vk.core.compose.component.cell.content.b1 a92 = RichCell$Middle.b.a(null, b, f1Var, a6, null, a72, a82, null, null, M, 0, 1827);
                M = M;
                ygv0.a(f52, a2, a92, a4, null, M, 0, 48);
                if (androidx.compose.runtime.b.d()) {
                }
                num3 = num62;
            }
            s = M.s();
            if (s == null) {
                s.d = new zs8(r7tVar, rhaVar, cgtVar2, xvyVar, q630Var, num3, i, i2);
                return;
            }
            return;
        }
        num2 = num;
        if (M.t(i3 & 1, (74899 & i3) == 74898)) {
        }
        s = M.s();
        if (s == null) {
        }
    }
}
