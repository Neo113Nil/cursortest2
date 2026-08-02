package xsna;

import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import kotlin.Pair;
import ru.ok.android.sdk.SharedKt;
import xsna.wwu0;
import xsna.ztz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class e2y implements gzs {
    public final /* synthetic */ List b;
    public final /* synthetic */ i2y c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ JsApiMethodType h;

    public /* synthetic */ e2y(long j, JsApiMethodType jsApiMethodType, Long l, List list, i2y i2yVar, boolean z, boolean z2) {
        this.b = list;
        this.c = i2yVar;
        this.d = j;
        this.e = l;
        this.f = z;
        this.g = z2;
        this.h = jsApiMethodType;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        String str;
        List list = this.b;
        String B = f870.B(list, StringUtils.COMMA, null);
        i2y i2yVar = this.c;
        x6y x6yVar = i2yVar.a;
        fgx0 fgx0Var = x6yVar.n;
        String url = fgx0Var != null ? fgx0Var.a.getUrl() : null;
        if (url == null) {
            xgx0.a.getClass();
            xgx0.g("empty url on auth request!");
            return s3q0.a;
        }
        w25 D = x6yVar.D();
        wdx0 wdx0Var = e370.f;
        if (wdx0Var == null) {
            wdx0Var = null;
        }
        wdx0Var.getClass();
        wdx0 wdx0Var2 = e370.f;
        if (wdx0Var2 == null) {
            wdx0Var2 = null;
        }
        wdx0Var2.getClass();
        wdx0 wdx0Var3 = e370.f;
        if (wdx0Var3 == null) {
            wdx0Var3 = null;
        }
        wdx0Var3.getClass();
        Pair pair = myc0.f(D.a) ? new Pair(D.a, D.c) : new Pair(null, null);
        String str2 = (String) pair.d();
        String str3 = (String) pair.g();
        if (str2 == null) {
            str2 = "";
        }
        String str4 = h9r0.d;
        long j = this.d;
        Long l = this.e;
        boolean z = this.f;
        wwu0 a = wwu0.a.a(str2, str3, j, B, str4, url, l, z, 704);
        vdx0 vdx0Var = e370.e;
        wen0 a2 = (vdx0Var != null ? vdx0Var : null).a();
        if (l != null) {
            str = "access_token_" + l;
        } else {
            str = SharedKt.PARAM_ACCESS_TOKEN;
        }
        io.reactivex.rxjava3.internal.operators.observable.m1 d = a2.d(a, str);
        boolean z2 = this.g;
        io.reactivex.rxjava3.core.q I0 = z2 ? io.reactivex.rxjava3.core.q.I0(d, io.reactivex.rxjava3.core.q.T(ztz.b.a), new ed(new b06((byte) 0, 4), 20)) : d.U(new m40(new amp(9), 22));
        JsApiMethodType jsApiMethodType = this.h;
        I0.subscribe(new j41(new f2y(z2, i2yVar, jsApiMethodType, B), 20), new xz(new b2y(j, jsApiMethodType, l, list, i2yVar, z, z2), 27));
        return s3q0.a;
    }
}
