package defpackage;

import com.yandex.go.overdraft.d;
import com.yandex.go.overdraft.domain.n;
import com.yandex.go.payments.api.model.PaymentsScreen;
import com.yandex.go.payments.navigation.LpmPaymentRouter$UiMode;
import java.util.Set;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.animation.NavigationDirection;

/* loaded from: classes13.dex */
public final class azz {
    public final PaymentsScreen a;
    public final String b;
    public final h0a0 c;
    public final m6a0 d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final LpmPaymentRouter$UiMode i;
    public final NavigationDirection j;
    public final kw k;
    public final bzz l;
    public final Set m;
    public final wls n;
    public final sls o;
    public final tpr p;
    public final tpr q;

    public azz(PaymentsScreen paymentsScreen, String str, h0a0 h0a0Var, m6a0 m6a0Var, boolean z, boolean z2, String str2, boolean z3, boolean z4, LpmPaymentRouter$UiMode lpmPaymentRouter$UiMode, NavigationDirection navigationDirection, kw kwVar, bzz bzzVar, Set set, wls wlsVar, sls slsVar, n nVar, d dVar, int i) {
        boolean z5 = (i & 64) != 0 ? false : z2;
        String str3 = (i & 128) != 0 ? null : str2;
        boolean z6 = (i & 256) != 0 ? true : z3;
        boolean z7 = (i & 512) == 0 ? z4 : true;
        LpmPaymentRouter$UiMode lpmPaymentRouter$UiMode2 = (i & 1024) != 0 ? LpmPaymentRouter$UiMode.MODAL : lpmPaymentRouter$UiMode;
        NavigationDirection navigationDirection2 = (i & 2048) != 0 ? NavigationDirection.FORWARD : navigationDirection;
        kw kwVar2 = (i & 4096) != 0 ? null : kwVar;
        bzz bzzVar2 = (i & 8192) != 0 ? null : bzzVar;
        Set set2 = (i & 16384) != 0 ? EmptySet.a : set;
        wls wlsVar2 = (32768 & i) != 0 ? null : wlsVar;
        sls slsVar2 = (65536 & i) != 0 ? null : slsVar;
        n nVar2 = (131072 & i) != 0 ? null : nVar;
        d dVar2 = (i & 262144) == 0 ? dVar : null;
        this.a = paymentsScreen;
        this.b = str;
        this.c = h0a0Var;
        this.d = m6a0Var;
        this.e = z5;
        this.f = str3;
        this.g = z6;
        this.h = z7;
        this.i = lpmPaymentRouter$UiMode2;
        this.j = navigationDirection2;
        this.k = kwVar2;
        this.l = bzzVar2;
        this.m = set2;
        this.n = wlsVar2;
        this.o = slsVar2;
        this.p = nVar2;
        this.q = dVar2;
    }
}
