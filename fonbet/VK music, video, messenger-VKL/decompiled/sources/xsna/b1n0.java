package xsna;

import com.vk.profile.design.compose.header.AuthorHeaderConfig;

/* compiled from: SubtitleSlotImpl.kt */
/* loaded from: classes5.dex */
public final class b1n0 implements e95 {
    public final wh50 a;
    public final wh50 b;

    /* compiled from: SubtitleSlotImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AuthorHeaderConfig.Author.AuthorSex.values().length];
            try {
                iArr[AuthorHeaderConfig.Author.AuthorSex.Female.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AuthorHeaderConfig.Header.Main.Subtitle.Promo.SubscriptionPromo.values().length];
            try {
                iArr2[AuthorHeaderConfig.Header.Main.Subtitle.Promo.SubscriptionPromo.ReplyRequest.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[AuthorHeaderConfig.Header.Main.Subtitle.Promo.SubscriptionPromo.Follow.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AuthorHeaderConfig.Header.Main.Subtitle.Promo.SubscriptionPromo.CanBeFriend.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public b1n0(AuthorHeaderConfig.Header.Main.Subtitle subtitle, AuthorHeaderConfig.Author.AuthorSex authorSex) {
        this.a = androidx.compose.runtime.k.b(subtitle);
        this.b = androidx.compose.runtime.k.b(authorSex);
    }

    @Override // xsna.e95
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1607763867);
        if ((i & 6) == 0) {
            i2 = i | (M.J(q630Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (M.J(this) ? 32 : 16);
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1607763867, i3, -1, "com.vk.profile.design.compose.header.header.SubtitleSlotImpl.Content (SubtitleSlotImpl.kt:23)");
            }
            AuthorHeaderConfig.Header.Main.Subtitle subtitle = (AuthorHeaderConfig.Header.Main.Subtitle) ((zak0) this.a).getValue();
            int i4 = i3 << 3;
            int i5 = i4 & 896;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2002622536, i5, -1, "com.vk.profile.design.compose.header.header.SubtitleSlotImpl.resolveText (SubtitleSlotImpl.kt:37)");
            }
            if (!(subtitle instanceof AuthorHeaderConfig.Header.Main.Subtitle.a)) {
                if (!(subtitle instanceof AuthorHeaderConfig.Header.Main.Subtitle.Promo)) {
                    throw alb0.c(-374902262, M);
                }
                M.K(-374897281);
                AuthorHeaderConfig.Header.Main.Subtitle.Promo promo = (AuthorHeaderConfig.Header.Main.Subtitle.Promo) subtitle;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1016000616, i5, -1, "com.vk.profile.design.compose.header.header.SubtitleSlotImpl.resolvePromoText (SubtitleSlotImpl.kt:51)");
                }
                promo.getClass();
                int[] iArr = a.$EnumSwitchMapping$1;
                throw null;
            }
            M.K(-374899588);
            M.j();
            String str = ((AuthorHeaderConfig.Header.Main.Subtitle.a) subtitle).a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.Z;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str, q630Var, ylu0Var.getText().d, null, null, 0, 0, null, 0, false, 0, 1, null, frv0Var, M, i4 & 112, 48, 6136);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new knc(this, q630Var, i, 6);
        }
    }
}
