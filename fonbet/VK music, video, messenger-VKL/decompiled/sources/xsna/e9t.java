package xsna;

import androidx.compose.runtime.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.games.model.GamesCatalogActivityType;
import com.vk.games.model.GamesCatalogUser;
import com.vkontakte.android.R;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import xsna.djc;
import xsna.phw;
import xsna.s90;

/* compiled from: GamesActivityHolder.kt */
/* loaded from: classes17.dex */
public final class e9t {
    /* JADX WARN: Code restructure failed: missing block: B:313:0x019e, code lost:
    
        if (r12 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0189, code lost:
    
        if (r12 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018b, code lost:
    
        r12 = "";
     */
    /* JADX WARN: Removed duplicated region for block: B:148:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final s90 s90Var, final w8t w8tVar, rha rhaVar, final xvy xvyVar, final q630 q630Var, Integer num, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        Integer num2;
        rha rhaVar2;
        final Integer num3;
        androidx.compose.runtime.f s;
        String str;
        String str2;
        Integer num4;
        Integer num5;
        int i4;
        boolean z;
        int i5;
        boolean z2;
        int i6;
        int i7;
        char c;
        int i8;
        WebApiApplication webApiApplication;
        Object obj;
        boolean z3;
        boolean z4;
        Object x;
        boolean z5;
        Object x2;
        String str3;
        String str4;
        int i9;
        h2v0 h2v0Var;
        int i10;
        String format;
        WebApiApplication webApiApplication2;
        l8l0 l8l0Var;
        String str5;
        String str6;
        WebApiApplication webApiApplication3;
        WebApiApplication webApiApplication4;
        WebImageSize f;
        androidx.compose.runtime.a M = aVar.M(-1306593717);
        if ((i & 6) == 0) {
            i3 = (M.J(s90Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(w8tVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.J(rhaVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.J(xvyVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= M.J(q630Var) ? 16384 : 8192;
        }
        int i11 = i2 & 32;
        if (i11 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            num2 = num;
            i3 |= M.J(num2) ? 131072 : 65536;
            if (M.t(i3 & 1, (i3 & 74899) == 74898)) {
                rhaVar2 = rhaVar;
                M.h();
                num3 = num2;
            } else {
                if (i11 != 0) {
                    num2 = null;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1306593717, i3, -1, "com.vk.games.presentation.components.GamesActivityHolder (GamesActivityHolder.kt:107)");
                }
                String N = d370.N(R.string.vk_accessibility_avatar, 0, M);
                GamesCatalogUser gamesCatalogUser = s90Var.c;
                GamesCatalogActivityType gamesCatalogActivityType = s90Var.d;
                sbt sbtVar = s90Var.a;
                String str7 = gamesCatalogUser.g;
                if (str7 != null) {
                    WebImageSize.CREATOR.getClass();
                    str = WebImageSize.a.a(100, str7).b;
                } else {
                    str = gamesCatalogUser.e;
                    if (str == null && (str = gamesCatalogUser.f) == null) {
                        str = "";
                    }
                }
                Integer num6 = num2;
                phw a = phw.a.a(fwu0.l(null, str, null, null, M, 0, 61), null, null, null, null, M, 196616, 30);
                Cell$Left.Main.Size size = Cell$Left.Main.Size.Medium;
                int i12 = i3 & 112;
                int i13 = i3 & 14;
                int i14 = i3;
                boolean z6 = (i13 == 4) | (i12 == 32);
                Object x3 = M.x();
                Object obj2 = a.C0011a.a;
                if (z6 || x3 == obj2) {
                    x3 = new cg1(15, w8tVar, s90Var);
                    M.R(x3);
                }
                gzs gzsVar = (gzs) x3;
                boolean J = M.J(N);
                Object x4 = M.x();
                if (J || x4 == obj2) {
                    x4 = new b9t(N, 0);
                    M.R(x4);
                }
                com.vk.core.compose.component.cell.content.t a2 = com.vk.core.compose.component.cell.content.e.a(a, size, null, null, null, gzsVar, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3), M, 100663344, 92);
                float f2 = xcv0.a;
                PictureRadius pictureRadius = PictureRadius.Large;
                GamesCatalogActivityType gamesCatalogActivityType2 = GamesCatalogActivityType.STICKERS_ACHIEVEMENT;
                if (gamesCatalogActivityType != gamesCatalogActivityType2) {
                    str2 = (sbtVar == null || (webApiApplication4 = sbtVar.a) == null || (f = webApiApplication4.d.b.f(100)) == null) ? null : f.b;
                } else {
                    WebImage webImage = s90Var.i;
                    if (webImage != null) {
                        WebImageSize f3 = webImage.f(100);
                        str2 = f3 != null ? f3.b : null;
                    } else {
                        str2 = new String();
                    }
                    phw a3 = phw.a.a(fwu0.l(null, str2, null, null, M, 0, 61), null, null, null, null, M, 196616, 30);
                    boolean z7 = i13 == 4;
                    Object x5 = M.x();
                    if (z7 || x5 == obj2) {
                        x5 = new frg(s90Var, 16);
                        M.R(x5);
                    }
                    com.vk.core.compose.component.semantics.a a4 = com.vk.core.compose.component.semantics.b.a(null, (izs) x5, 3);
                    int i15 = i14 & 458752;
                    boolean z8 = (i12 == 32) | (i13 == 4) | (i15 == 131072);
                    Object x6 = M.x();
                    int i16 = 5;
                    if (z8 || x6 == obj2) {
                        num4 = num6;
                        x6 = new yy0(w8tVar, s90Var, num4, i16);
                        M.R(x6);
                    } else {
                        num4 = num6;
                    }
                    gzs gzsVar2 = (gzs) x6;
                    final Integer num7 = num4;
                    com.vk.core.compose.component.cell.content.z a5 = com.vk.core.compose.component.cell.content.s.a(a3, f2, pictureRadius, gzsVar2, a4, M, 12607488, 12);
                    VkColorToken vkColorToken = VkColorToken.TextPrimary;
                    zqv0 zqv0Var = new zqv0(new klv0(null, vkColorToken), 14);
                    zqv0 zqv0Var2 = new zqv0(new klv0(null, VkColorToken.TextLink), 14);
                    String gamesCatalogUser2 = gamesCatalogUser.toString();
                    boolean z9 = (i13 == 4) | (i12 == 32);
                    Object x7 = M.x();
                    if (z9 || x7 == obj2) {
                        x7 = new i9z() { // from class: xsna.c9t
                            @Override // xsna.i9z
                            public final void a(q8z q8zVar) {
                                w8t.this.a.invoke(new djc.f(s90Var.c.a));
                            }
                        };
                        M.R(x7);
                    }
                    h2v0 h2v0Var2 = new h2v0(gamesCatalogUser2, zqv0Var, (i9z) x7);
                    String valueOf = String.valueOf(sbtVar);
                    boolean z10 = (i12 == 32) | (i13 == 4) | (i15 == 131072);
                    Object x8 = M.x();
                    if (z10 || x8 == obj2) {
                        x8 = new i9z() { // from class: xsna.d9t
                            @Override // xsna.i9z
                            public final void a(q8z q8zVar) {
                                w8t.this.a.invoke(t90.a(s90Var, num7));
                            }
                        };
                        M.R(x8);
                    }
                    h2v0 h2v0Var3 = new h2v0(valueOf, zqv0Var2, (i9z) x8);
                    int i17 = ((i14 << 6) & 896) | 72;
                    String str8 = s90Var.h;
                    if (androidx.compose.runtime.b.d()) {
                        num5 = num7;
                        i4 = i12;
                        androidx.compose.runtime.b.f(472039177, i17, -1, "com.vk.games.presentation.catalog.model.items.ActivityItem.getContentTitle (ActivityItem.kt:59)");
                    } else {
                        num5 = num7;
                        i4 = i12;
                    }
                    M.K(-1636877952);
                    s8u0 s8u0Var = new s8u0(0);
                    String str9 = gamesCatalogUser.c + (char) 160 + gamesCatalogUser.d;
                    boolean z11 = gamesCatalogUser.b == GamesCatalogUser.BaseSex.FEMALE;
                    String str10 = (sbtVar == null || (webApiApplication3 = sbtVar.a) == null) ? null : webApiApplication3.c;
                    boolean z12 = str10 == null || drm0.N(str10);
                    int i18 = s90.a.$EnumSwitchMapping$0[gamesCatalogActivityType.ordinal()];
                    if (i18 == 1) {
                        z = true;
                        i5 = i4;
                        z2 = false;
                        i6 = 32;
                        i7 = 4;
                        c = 0;
                        i8 = i13;
                        M.K(-409815810);
                        String N2 = d370.N(z11 ? R.string.vk_games_installed_f : R.string.vk_games_installed_m, 0, M);
                        String str11 = (sbtVar == null || (webApiApplication = sbtVar.a) == null) ? null : webApiApplication.c;
                        s8u0Var.e(String.format(N2, Arrays.copyOf(new Object[]{str9, str11}, 2)));
                        rdi.D(s8u0Var, str9, h2v0Var2);
                        rdi.C(s8u0Var, str11, h2v0Var3);
                        M.j();
                    } else if (i18 == 2) {
                        i5 = i4;
                        z2 = false;
                        i6 = 32;
                        z = true;
                        i7 = 4;
                        c = 0;
                        i8 = i13;
                        M.K(-409601786);
                        String N3 = d370.N(z12 ? z11 ? R.string.vk_games_level_f_date : R.string.vk_games_level_m_date : z11 ? R.string.vk_games_level_f : R.string.vk_games_level_m, 0, M);
                        Integer num8 = s90Var.g;
                        s90Var.a(s8u0Var, N3, str9, num8 != null ? num8.intValue() : 0, h2v0Var2, h2v0Var3);
                        M.j();
                    } else if (i18 != 3) {
                        if (i18 == 4) {
                            i10 = 4;
                            M.K(-409122030);
                            String N4 = d370.N(z12 ? R.string.vk_games_achievement_date : R.string.vk_games_achievement, 0, M);
                            String str12 = (sbtVar == null || (webApiApplication2 = sbtVar.a) == null) ? null : webApiApplication2.c;
                            if (str12 == null || drm0.N(str12)) {
                                if (str8 == null) {
                                    str8 = "";
                                }
                                format = String.format(N4, Arrays.copyOf(new Object[]{str9, str8}, 2));
                            } else {
                                if (str8 == null) {
                                    str8 = "";
                                }
                                format = String.format(N4, Arrays.copyOf(new Object[]{str9, str8, str12}, 3));
                            }
                            s8u0Var.e(format);
                            rdi.D(s8u0Var, str9, h2v0Var2);
                            if (str12 != null && !drm0.N(str12)) {
                                rdi.C(s8u0Var, str12, h2v0Var3);
                            }
                            M.j();
                        } else {
                            if (i18 != 5) {
                                throw alb0.c(956610414, M);
                            }
                            M.K(956641497);
                            M.j();
                            Pattern pattern = m8l0.a;
                            if (gamesCatalogActivityType == gamesCatalogActivityType2) {
                                Pattern pattern2 = m8l0.a;
                                if (str8 == null) {
                                    str8 = "";
                                }
                                Matcher matcher = pattern2.matcher(str8);
                                if (matcher.matches()) {
                                    i10 = 4;
                                    l8l0Var = new l8l0(matcher.group(2), matcher.group(3), matcher.group(4));
                                    StringBuilder e = fw3.e(str9);
                                    str5 = l8l0Var == null ? l8l0Var.b : null;
                                    if (str5 == null) {
                                        str5 = "";
                                    }
                                    e.append(str5);
                                    str6 = l8l0Var == null ? l8l0Var.c : null;
                                    if (str6 == null) {
                                        str6 = "";
                                    }
                                    e.append(str6);
                                    s8u0Var.e(e.toString());
                                    rdi.D(s8u0Var, str9, h2v0Var2);
                                    String str13 = l8l0Var == null ? l8l0Var.c : null;
                                    String str14 = str13 != null ? str13 : "";
                                    klv0 klv0Var = new klv0(VkTypographyToken.Headline1, vkColorToken);
                                    StringBuilder sb = s8u0Var.a;
                                    s8u0Var.d(klv0Var, sb.length() - str14.length(), sb.length());
                                }
                            }
                            i10 = 4;
                            l8l0Var = null;
                            StringBuilder e2 = fw3.e(str9);
                            if (l8l0Var == null) {
                            }
                            if (str5 == null) {
                            }
                            e2.append(str5);
                            if (l8l0Var == null) {
                            }
                            if (str6 == null) {
                            }
                            e2.append(str6);
                            s8u0Var.e(e2.toString());
                            rdi.D(s8u0Var, str9, h2v0Var2);
                            if (l8l0Var == null) {
                            }
                            if (str13 != null) {
                            }
                            klv0 klv0Var2 = new klv0(VkTypographyToken.Headline1, vkColorToken);
                            StringBuilder sb2 = s8u0Var.a;
                            s8u0Var.d(klv0Var2, sb2.length() - str14.length(), sb2.length());
                        }
                        i8 = i13;
                        i7 = i10;
                        i5 = i4;
                        z2 = false;
                        i6 = 32;
                        z = true;
                        c = 0;
                    } else {
                        M.K(-409364698);
                        String N5 = d370.N(z12 ? z11 ? R.string.vk_games_score_f_date : R.string.vk_games_score_m_date : z11 ? R.string.vk_games_score_f : R.string.vk_games_score_m, 0, M);
                        Integer num9 = s90Var.f;
                        if (num9 != null) {
                            i9 = num9.intValue();
                            str3 = str9;
                            str4 = N5;
                            z2 = false;
                            h2v0Var = h2v0Var2;
                        } else {
                            str3 = str9;
                            str4 = N5;
                            i9 = 0;
                            h2v0Var = h2v0Var2;
                            z2 = false;
                        }
                        i7 = 4;
                        i5 = i4;
                        i6 = 32;
                        z = true;
                        c = 0;
                        i8 = i13;
                        s90Var.a(s8u0Var, str4, str3, i9, h2v0Var, h2v0Var3);
                        M.j();
                    }
                    M.j();
                    us2 j = s8u0Var.j(8, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    int i19 = i6;
                    int i20 = i5;
                    Integer num10 = num5;
                    int i21 = i8;
                    int i22 = i7;
                    com.vk.core.compose.component.cell.content.h1 b = Cell$Middle.d.b.b(j, null, null, null, 0, 0, null, null, null, M, 0, 6, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
                    Object x9 = M.x();
                    if (x9 == obj2) {
                        x9 = ir.h(M);
                    }
                    sg50 sg50Var = (sg50) x9;
                    q630 f4 = txj0.f(q630Var, 1.0f);
                    mlg0 a6 = qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7, 0L, z2);
                    boolean z13 = (i20 == i19 ? true : z2) | (i21 == i22 ? true : z2) | (i15 == 131072 ? true : z2);
                    Object x10 = M.x();
                    if (z13) {
                        obj = obj2;
                    } else {
                        obj = obj2;
                        if (x10 != obj) {
                            z3 = true;
                            q630 b2 = ojc.b(f4, sg50Var, a6, false, null, (gzs) x10, 28);
                            rhaVar2 = rhaVar;
                            boolean z14 = rhaVar2.b;
                            float f5 = rhaVar2.c;
                            z4 = (i21 != i22 ? z3 : z2) | (i20 != i19 ? z3 : z2);
                            x = M.x();
                            if (!z4 || x == obj) {
                                x = new com.vk.movika.sdk.android.defaultplayer.container.e(11, s90Var, w8tVar);
                                M.R(x);
                            }
                            gzs gzsVar3 = (gzs) x;
                            z5 = (i21 != i22) | (i20 != i19);
                            x2 = M.x();
                            if (!z5 || x2 == obj) {
                                x2 = new k75(9, s90Var, w8tVar);
                                M.R(x2);
                            }
                            wiu0.b(vbh0.f(b2, z14, xvyVar, 0.01f, f5, null, gzsVar3, (gzs) x2, 48), false, a2, Cell$Middle.a.a(b, null, null, null, M, 196608, 30), a5, null, null, M, 0, 98);
                            M = M;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            num3 = num10;
                        }
                    }
                    z3 = true;
                    x10 = new jch(w8tVar, s90Var, num10, 1 == true ? 1 : 0);
                    M.R(x10);
                    q630 b22 = ojc.b(f4, sg50Var, a6, false, null, (gzs) x10, 28);
                    rhaVar2 = rhaVar;
                    boolean z142 = rhaVar2.b;
                    float f52 = rhaVar2.c;
                    z4 = (i21 != i22 ? z3 : z2) | (i20 != i19 ? z3 : z2);
                    x = M.x();
                    if (!z4) {
                    }
                    x = new com.vk.movika.sdk.android.defaultplayer.container.e(11, s90Var, w8tVar);
                    M.R(x);
                    gzs gzsVar32 = (gzs) x;
                    z5 = (i21 != i22) | (i20 != i19);
                    x2 = M.x();
                    if (!z5) {
                    }
                    x2 = new k75(9, s90Var, w8tVar);
                    M.R(x2);
                    wiu0.b(vbh0.f(b22, z142, xvyVar, 0.01f, f52, null, gzsVar32, (gzs) x2, 48), false, a2, Cell$Middle.a.a(b, null, null, null, M, 196608, 30), a5, null, null, M, 0, 98);
                    M = M;
                    if (androidx.compose.runtime.b.d()) {
                    }
                    num3 = num10;
                }
            }
            s = M.s();
            if (s == null) {
                final rha rhaVar3 = rhaVar2;
                s.d = new wzs() { // from class: xsna.x8t
                    @Override // xsna.wzs
                    public final Object invoke(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        e9t.a(s90.this, w8tVar, rhaVar3, xvyVar, q630Var, num3, (androidx.compose.runtime.a) obj3, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        num2 = num;
        if (M.t(i3 & 1, (i3 & 74899) == 74898)) {
        }
        s = M.s();
        if (s == null) {
        }
    }

    public static final void b(final s90 s90Var, final izs izsVar, int i, final rha rhaVar, final xvy xvyVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        final int i4;
        androidx.compose.runtime.a M = aVar.M(85453949);
        if ((i2 & 6) == 0) {
            i3 = (M.J(s90Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 = i;
            i3 |= M.o(i4) ? 256 : 128;
        } else {
            i4 = i;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.J(rhaVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= M.J(xvyVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= M.J(q630Var) ? 131072 : 65536;
        }
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(85453949, i3, -1, "com.vk.games.presentation.components.GamesCatalogActivityHolder (GamesActivityHolder.kt:55)");
            }
            boolean z = (i3 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new w8t(new y8t(izsVar, 0), new g97(izsVar, 1), new uzo(izsVar, 1));
                M.R(x);
            }
            int i5 = i3 >> 3;
            a(s90Var, (w8t) x, rhaVar, xvyVar, q630Var, Integer.valueOf(i4), M, (i3 & 14) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | ((i3 << 9) & 458752), 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.z8t
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    e9t.b(s90.this, izsVar, i4, rhaVar, xvyVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(s90 s90Var, izs izsVar, rha rhaVar, xvy xvyVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        s90 s90Var2;
        int i2;
        androidx.compose.runtime.a M = aVar.M(1284641649);
        if ((i & 6) == 0) {
            s90Var2 = s90Var;
            i2 = (M.J(s90Var2) ? 4 : 2) | i;
        } else {
            s90Var2 = s90Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(rhaVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(xvyVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1284641649, i2, -1, "com.vk.games.presentation.components.GamesCatalogDetailActivityHolder (GamesActivityHolder.kt:81)");
            }
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new w8t(new lqd(izsVar, 2), new igh(izsVar, 16), new twb(izsVar, 1));
                M.R(x);
            }
            a(s90Var2, (w8t) x, rhaVar, xvyVar, q630Var, null, M, i2 & 65422, 32);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new a9t(s90Var, izsVar, rhaVar, xvyVar, q630Var, i);
        }
    }
}
