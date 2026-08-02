package com.yandex.passport.common.ui.progress;

import android.content.res.Resources;
import android.os.LocaleList;
import defpackage.bts;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.jl40;
import defpackage.oay0;
import defpackage.sls;
import defpackage.sz40;
import defpackage.zls;
import defpackage.zy11;
import java.util.Locale;
import ru.CryptoPro.JCP.Util.ClearCryptoProPrefs;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes8.dex */
public final class o implements zls {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ f530 b;
    public final /* synthetic */ sz40 c;

    public o(boolean z, f530 f530Var, sz40 sz40Var) {
        this.a = z;
        this.b = f530Var;
        this.c = sz40Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        fid fidVar = (fid) obj2;
        ((Number) obj3).intValue();
        LocaleList locales = Resources.getSystem().getConfiguration().getLocales();
        boolean l = jl40.l(locales.isEmpty() ? null : locales.get(0).getLanguage(), new Locale(ClearCryptoProPrefs.COUNTRY).getLanguage());
        boolean z = this.a;
        int i = l ? z ? com.yandex.passport.common.b.logo_yandex_animation_ru_dark : com.yandex.passport.common.b.logo_yandex_animation_ru_light : z ? com.yandex.passport.common.b.logo_yandex_animation_en_dark : com.yandex.passport.common.b.logo_yandex_animation_en_light;
        bts btsVar = (bts) fidVar;
        btsVar.e0(-1081413259);
        sz40 sz40Var = this.c;
        boolean e = btsVar.e(sz40Var);
        Object Q = btsVar.Q();
        if (e || Q == did.a) {
            Q = new oay0(29, sz40Var);
            btsVar.o0(Q);
        }
        btsVar.t(false);
        p.b(i, this.b, (sls) Q, 0, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 0);
        return zy11.a;
    }
}
