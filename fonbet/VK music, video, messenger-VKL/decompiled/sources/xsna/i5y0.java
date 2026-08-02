package xsna;

import android.graphics.Bitmap;
import com.vk.feed.core.models.news.YandexNativeAdEntry;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.j5y0;

/* compiled from: YandexNativeAdTransformer.kt */
/* loaded from: classes4.dex */
public final class i5y0 implements gn60<YandexNativeAdEntry, wm60> {
    public final bwn b;
    public final iko0 c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public i5y0(bwn bwnVar, iko0 iko0Var) {
        this.b = bwnVar;
        this.c = iko0Var;
        abg0 abg0Var = dhr0.t;
        this.d = abg0Var.c(R.attr.vk_ui_text_primary);
        this.e = abg0Var.c(R.attr.vk_ui_text_contrast);
        this.f = abg0Var.c(R.attr.vk_ui_background_secondary);
        this.g = abg0Var.c(R.attr.vk_ui_background_content);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0080, code lost:
    
        if (r5.length() == 0) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List a(YandexNativeAdEntry yandexNativeAdEntry) {
        j5y0.a c3107a;
        String str;
        String warning;
        z4y0 z4y0Var = yandexNativeAdEntry.k;
        if (z4y0Var == null) {
            return EmptyList.b;
        }
        Integer num = yandexNativeAdEntry.l;
        if (num == null) {
            return EmptyList.b;
        }
        int intValue = num.intValue();
        Bitmap image = z4y0Var.getImage();
        String a = z4y0Var.a();
        Integer num2 = null;
        if (!myc0.f(a)) {
            a = null;
        }
        if (a == null) {
            a = y8g0.e(R.string.yandex_ad_cta_go);
        }
        String str2 = a;
        int i = this.d;
        int i2 = this.f;
        if (image == null) {
            c3107a = new j5y0.a.b(str2, i2, i);
        } else {
            int a2 = this.b.a(image);
            Integer valueOf = Integer.valueOf(a2);
            if (a2 == -1) {
                valueOf = null;
            }
            c3107a = valueOf != null ? new j5y0.a.C3107a(str2, this.g, valueOf.intValue(), this.d, this.e) : null;
            if (c3107a == null) {
                c3107a = new j5y0.a.b(str2, i2, i);
            }
        }
        String e = y8g0.e(R.string.feed_optional_ad_subtitle_prefix);
        String domain = z4y0Var.getDomain();
        if (domain == null || domain.length() == 0) {
            String age = z4y0Var.getAge();
            str = e;
            if (age != null) {
                str = e;
            }
            s1q s1qVar = new s1q(3, 0, 52);
            warning = z4y0Var.getWarning();
            if (warning != null && !drm0.N(warning)) {
                if (!drm0.D(warning, "лекарством", false)) {
                    num2 = Integer.valueOf(R.drawable.vk_icon_illustration_bud);
                } else if (drm0.D(warning, "противопоказания", false)) {
                    num2 = Integer.valueOf(R.drawable.vk_icon_illustration_contraindications_26h);
                } else if (drm0.D(warning, "кредита", false)) {
                    num2 = Integer.valueOf(R.drawable.vk_icon_illustration_credits_79h);
                } else if (drm0.D(warning, "банкротство", false)) {
                    num2 = Integer.valueOf(R.drawable.vk_icon_illustration_disclaimer_bankruptcy_360w);
                } else if (drm0.D(warning, "энергетических", false)) {
                    num2 = Integer.valueOf(R.drawable.vk_icon_illustration_disclaimer_energy_drinks_360w);
                }
            }
            return Collections.singletonList(new j5y0(z4y0Var, intValue, str, c3107a, s1qVar, num2, this.c));
        }
        StringBuilder e2 = fw3.e(e);
        String domain2 = z4y0Var.getDomain();
        if (domain2 != null && domain2.length() != 0) {
            e2.append(" · " + z4y0Var.getDomain());
        }
        StringBuilder sb = new StringBuilder(" · ");
        sb.append(myc0.f(z4y0Var.getAge()) ? z4y0Var.getAge() : "0+");
        e2.append(sb.toString());
        str = e2;
        s1q s1qVar2 = new s1q(3, 0, 52);
        warning = z4y0Var.getWarning();
        if (warning != null) {
            if (!drm0.D(warning, "лекарством", false)) {
            }
        }
        return Collections.singletonList(new j5y0(z4y0Var, intValue, str, c3107a, s1qVar2, num2, this.c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public final /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return a((YandexNativeAdEntry) pair);
    }
}
