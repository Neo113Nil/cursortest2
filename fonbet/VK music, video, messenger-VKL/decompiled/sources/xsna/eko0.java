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
import java.util.Date;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: TextParams.kt */
/* loaded from: classes6.dex */
public final class eko0 extends ovo0 {
    public final String b;
    public final float c;
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
    public final Integer n;

    public eko0(m0g0 m0g0Var) {
        super(m0g0Var);
        this.d = (int) iah0.y(26);
        Context context = e43.a;
        context = context == null ? null : context;
        FontFamily fontFamily = FontFamily.RUSSOONE_REGULAR;
        int i = a.C1933a.C1934a.$EnumSwitchMapping$0[TextSizeUnit.SP.ordinal()];
        float f = 26.0f;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = com.vk.typography.b.b(26.0f);
        }
        this.e = cqi.a(Font.Companion, fontFamily, f, context);
        float f2 = 12;
        this.f = (int) iah0.y(f2);
        float a = iah0.a(5);
        this.g = a;
        this.h = iah0.a(16) + a;
        this.i = iah0.a(10) + a;
        this.j = iah0.a(f2) + a;
        this.k = iah0.a(f2) + a;
        this.l = Layout.Alignment.ALIGN_NORMAL;
        Context context2 = e43.a;
        this.m = (context2 == null ? null : context2).getColor(R.color.vk_white);
        Context context3 = e43.a;
        this.n = Integer.valueOf((context3 == null ? null : context3).getColor(R.color.vk_white));
        int hours = ((Date) m0g0Var.b).getHours();
        int minutes = ((Date) m0g0Var.b).getMinutes();
        Context context4 = e43.a;
        String y = brm0.y((context4 == null ? null : context4).getResources().getStringArray(R.array.story_time_hours)[hours], " ", "");
        Context context5 = e43.a;
        String y2 = brm0.y((context5 == null ? null : context5).getResources().getStringArray(R.array.story_time_minutes)[minutes], " ", "");
        Context context6 = e43.a;
        String upperCase = brm0.y((context6 != null ? context6 : null).getString(R.string.story_time_text_format, y, y2), " ", "").toUpperCase(Locale.ENGLISH);
        int ceil = (int) Math.ceil(Math.sqrt(upperCase.length() / 6) * 3.0d);
        float f3 = ceil;
        this.c = ((2 / 3) - (((int) Math.ceil(upperCase.length() / ceil)) / f3)) * f3 * 0.5f;
        this.b = j5g.g0(erm0.u0(ceil, upperCase), "\n", null, null, 0, null, 62);
    }

    @Override // xsna.ovo0
    public final Layout.Alignment a() {
        return this.l;
    }

    @Override // xsna.ovo0
    public final Integer b() {
        return this.n;
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
        return (1.0f - this.c) * 0.38f;
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
        return this.g;
    }

    @Override // xsna.ovo0
    public final String m() {
        return this.b;
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
        return true;
    }
}
