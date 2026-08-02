package xsna;

import android.content.Context;
import com.vkontakte.android.R;

/* compiled from: GreenParams.kt */
/* loaded from: classes6.dex */
public final class meu extends gpg0 {
    public final int k;
    public final Integer l;
    public final float m;
    public final int n;

    public meu(m0g0 m0g0Var) {
        super(m0g0Var);
        Context context = e43.a;
        this.k = (context == null ? null : context).getColor(R.color.stickers_time_green_text);
        Context context2 = e43.a;
        this.l = Integer.valueOf((context2 == null ? null : context2).getColor(R.color.vk_black));
        this.m = iah0.a(6);
        Context context3 = e43.a;
        this.n = (context3 != null ? context3 : null).getColor(R.color.stickers_time_green_shadow);
    }

    @Override // xsna.ovo0
    public final Integer b() {
        return this.l;
    }

    @Override // xsna.gpg0, xsna.ovo0
    public final Integer i() {
        return Integer.valueOf(this.n);
    }

    @Override // xsna.gpg0, xsna.ovo0
    public final Float j() {
        return Float.valueOf(this.m);
    }

    @Override // xsna.ovo0
    public final int n() {
        return this.k;
    }
}
