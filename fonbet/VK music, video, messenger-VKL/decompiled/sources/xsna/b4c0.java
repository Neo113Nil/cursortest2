package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.utils.a;
import com.vk.dto.common.VerifyInfo;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PostHeaderVerifyDrawableProducer.kt */
/* loaded from: classes4.dex */
public final class b4c0 {

    /* compiled from: PostHeaderVerifyDrawableProducer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VerifyInfoHelper.VerifiedIconDisplayMode.values().length];
            try {
                iArr[VerifyInfoHelper.VerifiedIconDisplayMode.OVERLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerifyInfoHelper.VerifiedIconDisplayMode.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static baf0 a(boolean z, boolean z2, boolean z3, VerifyInfoHelper.ColorTheme colorTheme) {
        if (z3 && z2) {
            e();
            LinkedHashMap linkedHashMap = x1z.a;
            Drawable a2 = m33.a(R.drawable.vk_icon_fire_verified_16, e43.a);
            VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
            return new baf0(a2, VerifyInfoHelper.a(colorTheme));
        }
        if (z) {
            e();
            LinkedHashMap linkedHashMap2 = x1z.a;
            return new baf0(m33.a(R.drawable.vk_icon_verified_16, e43.a), -1);
        }
        if (z2) {
            e();
            LinkedHashMap linkedHashMap3 = x1z.a;
            Drawable a3 = m33.a(R.drawable.vk_icon_verified_16, e43.a);
            Context context = e43.a;
            return new baf0(a3, (context != null ? context : null).getColor(R.color.vk_white_alpha60));
        }
        if (!z3) {
            return null;
        }
        e();
        LinkedHashMap linkedHashMap4 = x1z.a;
        Drawable a4 = m33.a(R.drawable.vk_icon_fire_16, e43.a);
        VerifyInfoHelper verifyInfoHelper2 = VerifyInfoHelper.a;
        return new baf0(a4, VerifyInfoHelper.a(colorTheme));
    }

    public static Drawable b(VerifyInfo verifyInfo, boolean z, boolean z2, VerifyInfoHelper.VerifiedIconDisplayMode verifiedIconDisplayMode) {
        int m;
        if (z2) {
            if (verifyInfo == null || !verifyInfo.Cb()) {
                if (z2) {
                    e();
                    LinkedHashMap linkedHashMap = x1z.a;
                    Drawable a2 = m33.a(R.drawable.vk_icon_verified_16, e43.a);
                    int i = a.$EnumSwitchMapping$0[verifiedIconDisplayMode.ordinal()];
                    if (i == 1) {
                        m = krv0.m(R.attr.vk_ui_icon_contrast, e());
                    } else {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        m = krv0.m(R.attr.vk_ui_icon_secondary, e());
                    }
                    return new baf0(a2, m);
                }
                if (z) {
                    return d(verifiedIconDisplayMode);
                }
                if (verifyInfo != null) {
                    if (!verifyInfo.e && !verifyInfo.f && !verifyInfo.g) {
                        return null;
                    }
                    Object obj = com.vk.core.utils.a.a;
                    return com.vk.core.utils.a.a(e(), VerifyInfoHelper.ColorTheme.normal, verifyInfo);
                }
            } else {
                if (a.$EnumSwitchMapping$0[verifiedIconDisplayMode.ordinal()] == 1) {
                    return a(verifyInfo.b, verifyInfo.Db(), verifyInfo.c, VerifyInfoHelper.ColorTheme.normal);
                }
                Object obj2 = com.vk.core.utils.a.a;
                a.b g = com.vk.core.utils.a.g(e(), verifyInfo, 4);
                if (g != null) {
                    return g.a;
                }
            }
        } else {
            if (z) {
                return d(verifiedIconDisplayMode);
            }
            if (verifyInfo != null) {
                if (verifiedIconDisplayMode == VerifyInfoHelper.VerifiedIconDisplayMode.OVERLAY) {
                    return a(verifyInfo.b, verifyInfo.Db(), verifyInfo.c, VerifyInfoHelper.ColorTheme.normal);
                }
                Object obj3 = com.vk.core.utils.a.a;
                a.b g2 = com.vk.core.utils.a.g(e(), verifyInfo, 4);
                if (g2 != null) {
                    return g2.a;
                }
            }
        }
        return null;
    }

    public static /* synthetic */ Drawable c(b4c0 b4c0Var, VerifyInfo verifyInfo, VerifyInfoHelper.VerifiedIconDisplayMode verifiedIconDisplayMode, int i) {
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 8) == 0;
        b4c0Var.getClass();
        return b(verifyInfo, z, z2, verifiedIconDisplayMode);
    }

    public static baf0 d(VerifyInfoHelper.VerifiedIconDisplayMode verifiedIconDisplayMode) {
        int m;
        e();
        LinkedHashMap linkedHashMap = x1z.a;
        Drawable a2 = m33.a(R.drawable.vk_icon_flag_12, e43.a);
        int i = a.$EnumSwitchMapping$0[verifiedIconDisplayMode.ordinal()];
        if (i == 1) {
            m = krv0.m(R.attr.vk_ui_icon_contrast, e());
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            m = krv0.m(R.attr.vk_ui_icon_accent, e());
        }
        return new baf0(a2, m);
    }

    public static Context e() {
        dhr0.a.getClass();
        return dhr0.E();
    }
}
