package defpackage;

import com.yandex.go.payments.cards.data.model.Verification;

/* loaded from: classes13.dex */
public final class p731 {
    public final m831 a;
    public final Verification b;
    public final String c;
    public final tx90 d;
    public final j831 e;

    public /* synthetic */ p731(m831 m831Var, Verification verification, tx90 tx90Var, j831 j831Var, int i) {
        this(m831Var, verification, (String) null, (i & 8) != 0 ? null : tx90Var, j831Var);
    }

    public p731(m831 m831Var, Verification verification, String str, tx90 tx90Var, j831 j831Var) {
        this.a = m831Var;
        this.b = verification;
        this.c = str;
        this.d = tx90Var;
        this.e = j831Var;
    }
}
