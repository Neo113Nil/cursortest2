package defpackage;

import com.yandex.go.payments.data.model.response.PersonalAccount;

/* loaded from: classes6.dex */
public final class erd {
    public final fga0 a;

    public erd(fga0 fga0Var) {
        this.a = fga0Var;
    }

    public final boolean a(String str) {
        PersonalAccount r = this.a.r(str);
        return r == null || r.h;
    }
}
