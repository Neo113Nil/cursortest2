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
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DateParams.kt */
/* loaded from: classes6.dex */
public final class uxk extends ovo0 {
    public final String b;
    public final boolean c;
    public final float d;
    public final Typeface e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final Layout.Alignment l;
    public final int m;

    public uxk(m0g0 m0g0Var, String str, boolean z) {
        super(m0g0Var);
        this.b = str;
        this.c = z;
        this.d = (int) iah0.y((str == null || str.length() == 0) ? 44 : 28);
        Context context = e43.a;
        context = context == null ? null : context;
        FontFamily fontFamily = FontFamily.DISPLAY_DEMIBOLD;
        float f = (str == null || str.length() == 0) ? 44.0f : 28.0f;
        int i = a.C1933a.C1934a.$EnumSwitchMapping$0[TextSizeUnit.SP.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = com.vk.typography.b.b(f);
        }
        this.e = cqi.a(Font.Companion, fontFamily, f, context);
        this.f = (int) iah0.y((str == null || str.length() == 0) ? 8 : -6);
        this.g = 0.01f;
        float f2 = 5;
        this.h = iah0.a(f2);
        this.i = iah0.a(f2);
        this.j = iah0.a(f2);
        this.k = iah0.a(f2);
        this.l = Layout.Alignment.ALIGN_CENTER;
        Context context2 = e43.a;
        this.m = (context2 != null ? context2 : null).getColor(R.color.vk_white);
    }

    @Override // xsna.ovo0
    public final Layout.Alignment a() {
        return this.l;
    }

    @Override // xsna.ovo0
    public final Integer b() {
        return null;
    }

    @Override // xsna.ovo0
    public final float c() {
        return this.k;
    }

    @Override // xsna.ovo0
    public final float d() {
        return this.i;
    }

    @Override // xsna.ovo0
    public final float e() {
        return this.d;
    }

    @Override // xsna.ovo0
    public final float f() {
        return this.g;
    }

    @Override // xsna.ovo0
    public final float g() {
        return this.f;
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
        return this.h;
    }

    @Override // xsna.ovo0
    public final float l() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.ovo0
    public final String m() {
        m0g0 m0g0Var = this.a;
        String str = this.b;
        if (str == null || str.length() == 0) {
            return m0g0Var.c();
        }
        String b = m0g0Var.b();
        return this.c ? b.toUpperCase(Locale.US) : b;
    }

    @Override // xsna.ovo0
    public final int n() {
        return this.m;
    }

    @Override // xsna.ovo0
    public final float o() {
        return this.j;
    }

    @Override // xsna.ovo0
    public final Typeface p() {
        return this.e;
    }

    @Override // xsna.ovo0
    public final boolean q() {
        return false;
    }
}
