package com.yandex.passport.internal.ui.bouncer.roundabout;

import android.app.Activity;
import android.widget.ImageView;
import com.yandex.passport.R;
import defpackage.jt11;
import defpackage.nt11;
import defpackage.rs11;
import java.util.Locale;
import ru.CryptoPro.JCP.Util.ClearCryptoProPrefs;

/* loaded from: classes2.dex */
public final class e0 extends nt11 {
    public final com.yandex.passport.common.ui.lang.b D;
    public final jt11 E;

    public e0(Activity activity, com.yandex.passport.common.ui.lang.b bVar) {
        this.D = bVar;
        this.E = new jt11(activity, 2, this);
    }

    @Override // defpackage.ins0, defpackage.lns0
    public final void a() {
        super.a();
        ((ImageView) this.E.getRoot()).setImageResource(m());
    }

    @Override // defpackage.nt11
    public final rs11 l() {
        return this.E;
    }

    public final int m() {
        Locale b = ((com.yandex.passport.internal.ui.lang.a) this.D).b();
        int i = com.yandex.passport.common.ui.lang.a.a;
        String lowerCase = b.getLanguage().toLowerCase(Locale.ROOT);
        return (lowerCase.equals(new Locale(ClearCryptoProPrefs.COUNTRY).getLanguage()) || lowerCase.equals(new Locale("az").getLanguage()) || lowerCase.equals(new Locale("uk").getLanguage()) || lowerCase.equals(new Locale("kk").getLanguage()) || lowerCase.equals(new Locale("ky").getLanguage()) || lowerCase.equals(new Locale("be").getLanguage()) || lowerCase.equals(new Locale("bg").getLanguage())) ? R.drawable.passport_logo_ya_id_ru : R.drawable.passport_logo_ya_id_en;
    }
}
