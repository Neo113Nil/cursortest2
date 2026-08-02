package xsna;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Layout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vk.typography.a;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: TitleDateParams.kt */
/* loaded from: classes6.dex */
public final class hzo0 extends ovo0 {
    public final String b;
    public final float c;
    public final Typeface d;
    public final float e;
    public final float f;
    public final Layout.Alignment g;
    public final int h;

    public hzo0(m0g0 m0g0Var, String str) {
        super(m0g0Var);
        this.b = str;
        Context context = e43.a;
        context = context == null ? null : context;
        FontFamily fontFamily = FontFamily.MEDIUM;
        int i = a.C1933a.C1934a.$EnumSwitchMapping$0[TextSizeUnit.SP.ordinal()];
        float f = 14.0f;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = com.vk.typography.b.b(14.0f);
        }
        Font.Companion.getClass();
        Font a = Font.a.a(fontFamily, f);
        Typeface k = a.k(context);
        float j = a.j();
        this.c = (int) iah0.y(14);
        this.d = k;
        this.e = (int) iah0.y(4);
        this.f = j;
        this.g = Layout.Alignment.ALIGN_CENTER;
        Context context2 = e43.a;
        this.h = (context2 != null ? context2 : null).getColor(R.color.vk_white);
    }

    @Override // xsna.ovo0
    public final Layout.Alignment a() {
        return this.g;
    }

    @Override // xsna.ovo0
    public final Integer b() {
        return null;
    }

    @Override // xsna.ovo0
    public final float c() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.ovo0
    public final float d() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.ovo0
    public final float e() {
        return this.c;
    }

    @Override // xsna.ovo0
    public final float f() {
        return this.f;
    }

    @Override // xsna.ovo0
    public final float g() {
        return this.e;
    }

    @Override // xsna.ovo0
    public final float h() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.ovo0
    public final Integer i() {
        return null;
    }

    @Override // xsna.ovo0
    public final Float j() {
        return null;
    }

    @Override // xsna.ovo0
    public final float k() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.ovo0
    public final float l() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.ovo0
    public final String m() {
        String str = this.b;
        return (str == null || str.length() == 0) ? this.a.b() : str;
    }

    @Override // xsna.ovo0
    public final int n() {
        return this.h;
    }

    @Override // xsna.ovo0
    public final float o() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.ovo0
    public final Typeface p() {
        return this.d;
    }

    @Override // xsna.ovo0
    public final boolean q() {
        return false;
    }
}
