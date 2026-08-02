package defpackage;

import android.content.SharedPreferences;
import com.yandex.payment.common.sbp.SbpOperation;
import com.yandex.payment.divkit.sbp.a;
import com.yandex.payment.divkit.usecases.k;
import com.yandex.payment.divkit.usecases.t;

/* loaded from: classes2.dex */
public final class auf implements hs31 {
    public final rwo A;
    public final tem0 B;
    public final t a;
    public final String b;
    public final SbpOperation c;
    public final k w;
    public final SharedPreferences x;
    public final String y;
    public final hrj0 z;

    public auf(rwo rwoVar, hrj0 hrj0Var, tem0 tem0Var, SharedPreferences sharedPreferences, SbpOperation sbpOperation, k kVar, t tVar, String str, String str2) {
        this.a = tVar;
        this.b = str;
        this.c = sbpOperation;
        this.w = kVar;
        this.x = sharedPreferences;
        this.y = str2;
        this.z = hrj0Var;
        this.A = rwoVar;
        this.B = tem0Var;
    }

    @Override // defpackage.hs31
    public final yr31 create(Class cls) {
        if (!cls.equals(a.class)) {
            ny61.r("Unknown view model");
            return null;
        }
        return new a(this.A, this.z, this.B, this.x, this.c, this.w, this.a, this.b, this.y);
    }
}
