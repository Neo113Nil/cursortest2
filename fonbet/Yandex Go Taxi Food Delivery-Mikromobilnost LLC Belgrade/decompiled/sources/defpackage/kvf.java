package defpackage;

import com.yandex.payment.sdk.core.data.CardPaymentSystem;
import com.yandex.payment.sdk.nfcscanner.tools.c;
import com.yandex.payment.sdk.ui.CardInput$State;
import java.util.LinkedHashMap;
import kotlin.a;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes2.dex */
public final class kvf extends yr31 {
    public LinkedHashMap A;
    public joz0 B;
    public pg8 C;
    public fvf D;
    public fvf E;
    public final dy40 F;
    public final dy40 G;
    public final dy40 H;
    public sls I;
    public c J;
    public Boolean K;
    public final dy40 L;
    public final dy40 M;
    public final dy40 N;
    public final n0 O;
    public final rwo b;
    public final vv90 c;
    public final i3y w = a.a(new ybf(8, this));
    public boolean x;
    public final dy40 y;
    public String z;

    public kvf(rwo rwoVar, vv90 vv90Var) {
        this.b = rwoVar;
        this.c = vv90Var;
        Boolean bool = Boolean.TRUE;
        this.y = new dy40(bool);
        this.F = new dy40();
        this.G = new dy40();
        this.H = new dy40(bool);
        CardPaymentSystem cardPaymentSystem = CardPaymentSystem.AmericanExpress;
        CardInput$State cardInput$State = CardInput$State.CARD_NUMBER;
        this.L = new dy40();
        this.M = new dy40();
        this.N = new dy40();
        this.O = ffx.c(1, 1, null, 4);
    }

    @Override // defpackage.yr31
    public final void V() {
        bvf0.j(((qu5) this.w.getValue()).i, null);
    }
}
