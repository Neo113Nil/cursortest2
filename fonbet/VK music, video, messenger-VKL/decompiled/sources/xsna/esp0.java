package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.SexyCell$Size;
import com.vk.core.compose.component.cell.content.a1;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.profile.design.compose.header.AuthorHeaderConfig;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.q630;
import xsna.us2;

/* compiled from: TrustTagSlotImpl.kt */
/* loaded from: classes5.dex */
public final class esp0 implements l95 {
    public final wh50 a;

    /* compiled from: TrustTagSlotImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuthorHeaderConfig.Info.InfoSlotData.TrustTag.Type.values().length];
            try {
                iArr[AuthorHeaderConfig.Info.InfoSlotData.TrustTag.Type.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AuthorHeaderConfig.Info.InfoSlotData.TrustTag.Type.Popular.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AuthorHeaderConfig.Info.InfoSlotData.TrustTag.Type.FriendsBuy.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AuthorHeaderConfig.Info.InfoSlotData.TrustTag.Type.VerifyBusiness.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AuthorHeaderConfig.Info.InfoSlotData.TrustTag.Type.Ozon.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AuthorHeaderConfig.Info.InfoSlotData.TrustTag.Type.YClients.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AuthorHeaderConfig.Info.InfoSlotData.TrustTag.Type.FreeDelivery.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AuthorHeaderConfig.Info.InfoSlotData.TrustTag.Type.SelfPickup.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AuthorHeaderConfig.Info.InfoSlotData.TrustTag.Type.Delivery.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AuthorHeaderConfig.Info.InfoSlotData.TrustTag.Type.ShopCondition.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AuthorHeaderConfig.Info.InfoSlotData.TrustTag.Type.VKAge.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public esp0(AuthorHeaderConfig.Info.InfoSlotData.TrustTag trustTag) {
        this.a = androidx.compose.runtime.k.b(trustTag);
    }

    @Override // xsna.l95
    public final void a(int i, androidx.compose.runtime.a aVar) {
        int i2;
        Pair pair;
        androidx.compose.runtime.a M = aVar.M(956800726);
        int i3 = i & 48;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 = (M.J(aVar2) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(956800726, i2, -1, "com.vk.profile.design.compose.header.info.TrustTagSlotImpl.Content (TrustTagSlotImpl.kt:41)");
            }
            Object obj = (izs) M.r(h85.a);
            wh50 wh50Var = this.a;
            AuthorHeaderConfig.Info.InfoSlotData.TrustTag.Type type = ((AuthorHeaderConfig.Info.InfoSlotData.TrustTag) ((zak0) wh50Var).getValue()).b;
            int i4 = (i2 >> 3) & 112;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1890284421, i4, -1, "com.vk.profile.design.compose.header.info.TrustTagSlotImpl.resolveIcon (TrustTagSlotImpl.kt:68)");
            }
            switch (a.$EnumSwitchMapping$0[type.ordinal()]) {
                case 1:
                    M.K(-207832850);
                    qzu0.a.getClass();
                    pair = new Pair(qzu0.X0(M), new l5g(l5g.k));
                    M.j();
                    break;
                case 2:
                    M.K(-207830313);
                    qzu0.a.getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1055001950, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-Fire20> (VkIcons.kt:2644)");
                    }
                    lg90 b = or.b(M, 1007742988, R.drawable.vk_icon_fire_20, M, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    pair = new Pair(b, new l5g(ylu0Var.getIcon().h));
                    M.j();
                    break;
                case 3:
                    M.K(-207827399);
                    qzu0.a.getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-866968094, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-ThumbsUp20> (VkIcons.kt:10842)");
                    }
                    lg90 b2 = or.b(M, 2086998215, R.drawable.vk_icon_thumbs_up_20, M, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    pair = new Pair(b2, new l5g(ylu0Var2.getIcon().a));
                    M.j();
                    break;
                case 4:
                    M.K(-207824300);
                    qzu0.a.getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1997756382, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-CheckShieldGreen20> (VkIcons.kt:1348)");
                    }
                    lg90 b3 = or.b(M, 201622142, R.drawable.vk_icon_check_shield_green_20, M, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    pair = new Pair(b3, new l5g(l5g.k));
                    M.j();
                    break;
                case 5:
                    M.K(-207821679);
                    qzu0.a.getClass();
                    pair = new Pair(qzu0.H0(M), new l5g(l5g.k));
                    M.j();
                    break;
                case 6:
                    M.K(-207819024);
                    qzu0.a.getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1871469790, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-LogoYclients20> (VkIcons.kt:7152)");
                    }
                    lg90 a2 = pg90.a(R.drawable.vk_icon_logo_yclients_20, 0, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    pair = new Pair(a2, new l5g(l5g.k));
                    M.j();
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                    M.K(-207812585);
                    qzu0.a.getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-305350942, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-Market20> (VkIcons.kt:7202)");
                    }
                    lg90 b4 = or.b(M, 30985162, R.drawable.vk_icon_market_20, M, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    pair = new Pair(b4, new l5g(ylu0Var3.getIcon().a));
                    M.j();
                    break;
                case 11:
                    M.K(-207809825);
                    qzu0.a.getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-219625214, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-CalendarShield20> (VkIcons.kt:968)");
                    }
                    lg90 b5 = or.b(M, -1619383903, R.drawable.vk_icon_calendar_shield_20, M, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var4 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    pair = new Pair(b5, new l5g(ylu0Var4.getIcon().a));
                    M.j();
                    break;
                default:
                    throw alb0.c(-207833592, M);
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            lg90 lg90Var = (lg90) pair.d();
            long j = ((l5g) pair.g()).a;
            String str = ((AuthorHeaderConfig.Info.InfoSlotData.TrustTag) ((zak0) wh50Var).getValue()).a;
            AuthorHeaderConfig.Info.InfoSlotData.TrustTag.Type type2 = ((AuthorHeaderConfig.Info.InfoSlotData.TrustTag) ((zak0) wh50Var).getValue()).b;
            int i5 = i2 & 896;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-32343251, i5, -1, "com.vk.profile.design.compose.header.info.TrustTagSlotImpl.buildTrustMarkTitle (TrustTagSlotImpl.kt:85)");
            }
            M.K(-1017088564);
            us2.b bVar = new us2.b();
            M.K(-1017087912);
            VkColorToken vkColorToken = VkColorToken.TextPrimary;
            VkTypographyToken vkTypographyToken = VkTypographyToken.TextSemiBold;
            int m = bVar.m(bkt0.c(new klv0(vkTypographyToken, vkColorToken), M));
            try {
                bVar.g(str);
                AuthorHeaderConfig.Info.InfoSlotData.TrustTag.Type type3 = AuthorHeaderConfig.Info.InfoSlotData.TrustTag.Type.None;
                if (type2 != type3) {
                    M.K(1138062141);
                    gri.a(bVar, M, 8);
                } else {
                    M.K(1133972590);
                }
                M.j();
                s3q0 s3q0Var = s3q0.a;
                bVar.k(m);
                M.j();
                if (type2 != type3) {
                    M.K(-920532058);
                    m = bVar.m(bkt0.c(new klv0(vkTypographyToken, VkColorToken.TextSecondary), M));
                    try {
                        bVar.g(d370.N(R.string.author_header_trust_tag_detail, 0, M));
                    } finally {
                        bVar.k(m);
                    }
                } else {
                    M.K(-924738944);
                }
                M.j();
                us2 n = bVar.n();
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630 E = ahn.E(aVar2, "author_header_trust_mark");
                boolean z = i5 == 256;
                Object x = M.x();
                Object obj2 = a.C0011a.a;
                if (z || x == obj2) {
                    x = new mga0(this, 23);
                    M.R(x);
                }
                q630 b6 = egi0.b(E, true, (izs) x);
                SexyCell$Size sexyCell$Size = SexyCell$Size.Small;
                com.vk.core.compose.component.cell.content.x a3 = f4j0.a(lg90Var, 20, j, M, 196664, 24);
                com.vk.core.compose.component.cell.content.b1 a4 = a1.b.a(a1.g.b.b(n, null, null, 0, 0, M, 100663296, 254), null, null, null, null, null, null, null, null, M, 2046);
                boolean J = M.J(obj) | (i5 == 256);
                Object x2 = M.x();
                if (J || x2 == obj2) {
                    x2 = new dsp0(0, obj, this);
                    M.R(x2);
                }
                mjv0.a(b6, a4, a3, null, sexyCell$Size, null, false, (gzs) x2, null, M, 24576, 360);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zka0(this, i);
        }
    }
}
