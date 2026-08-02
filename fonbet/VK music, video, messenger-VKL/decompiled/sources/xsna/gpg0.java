package xsna;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Layout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vk.typography.a;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: RoundedParams.kt */
/* loaded from: classes6.dex */
public abstract class gpg0 extends ovo0 {
    public final float b;
    public final Typeface c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final Layout.Alignment j;

    public gpg0(m0g0 m0g0Var) {
        super(m0g0Var);
        this.b = (int) iah0.y(51);
        Context context = e43.a;
        context = context == null ? null : context;
        FontFamily fontFamily = FontFamily.FORTUN_AF_LED_7_SEG3;
        int i = a.C1933a.C1934a.$EnumSwitchMapping$0[TextSizeUnit.SP.ordinal()];
        float f = 51.0f;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = com.vk.typography.b.b(51.0f);
        }
        this.c = cqi.a(Font.Companion, fontFamily, f, context);
        this.d = (int) iah0.y(-3);
        float f2 = 5;
        this.e = iah0.a(f2);
        this.f = iah0.a(f2);
        this.g = iah0.a(f2);
        this.h = iah0.a(f2);
        this.i = iah0.a(12);
        this.j = Layout.Alignment.ALIGN_CENTER;
    }

    @Override // xsna.ovo0
    public final Layout.Alignment a() {
        return this.j;
    }

    @Override // xsna.ovo0
    public final float c() {
        return this.h;
    }

    @Override // xsna.ovo0
    public final float d() {
        return this.f;
    }

    @Override // xsna.ovo0
    public final float e() {
        return this.b;
    }

    @Override // xsna.ovo0
    public final float f() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.ovo0
    public final float g() {
        return this.d;
    }

    @Override // xsna.ovo0
    public final float h() {
        return this.i;
    }

    @Override // xsna.ovo0
    public Integer i() {
        return null;
    }

    @Override // xsna.ovo0
    public Float j() {
        return null;
    }

    @Override // xsna.ovo0
    public final float k() {
        return this.e;
    }

    @Override // xsna.ovo0
    public final float l() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.ovo0
    public final String m() {
        return this.a.c();
    }

    @Override // xsna.ovo0
    public final float o() {
        return this.g;
    }

    @Override // xsna.ovo0
    public final Typeface p() {
        return this.c;
    }

    @Override // xsna.ovo0
    public final boolean q() {
        return false;
    }
}
