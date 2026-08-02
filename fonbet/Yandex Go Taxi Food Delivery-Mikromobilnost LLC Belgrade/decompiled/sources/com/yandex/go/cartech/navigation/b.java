package com.yandex.go.cartech.navigation;

import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.yandex.go.cartech.sdk.CartechDynamicApi;
import com.yandex.go.cartech.ui.CartechModalView;
import defpackage.a19;
import defpackage.h19;
import defpackage.k0p;
import defpackage.o19;
import defpackage.tje;
import defpackage.u45;
import defpackage.w030;
import io.flutter.embedding.android.FlutterFragment;
import kotlin.Result;
import ru.yandex.taxi.activity.g;
import ru.yandex.taxi.am.e;

/* loaded from: classes12.dex */
public final class b extends k0p {
    public final w030 H;
    public final FragmentActivity I;
    public final o19 J;
    public final e K;
    public final g L;
    public final a19 M;
    public final ru.yandex.taxi.deeplinks.b N;

    public b(w030 w030Var, FragmentActivity fragmentActivity, o19 o19Var, e eVar, g gVar, a19 a19Var, ru.yandex.taxi.deeplinks.b bVar) {
        super(3);
        this.H = w030Var;
        this.I = fragmentActivity;
        this.J = o19Var;
        this.K = eVar;
        this.L = gVar;
        this.M = a19Var;
        this.N = bVar;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        h19 h19Var = (h19) obj;
        o19 o19Var = this.J;
        CartechDynamicApi cartechDynamicApi = h19Var.a;
        a19 a19Var = this.M;
        if (o19Var.a == null) {
            cartechDynamicApi.j(a19Var);
            o19Var.a = cartechDynamicApi;
        }
        tje.N(o(), null, null, new CartechModalViewRouter$onLaunch$1(h19Var, this, null), 3);
        tje.N(o(), null, null, new CartechModalViewRouter$onLaunch$2(this, null), 3);
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.H;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        return new CartechModalView(this.I);
    }

    @Override // defpackage.k0p
    public final FragmentActivity T() {
        return this.I;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002a  */
    @Override // defpackage.k0p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Fragment U(Object obj) {
        Object failure;
        String queryParameter;
        CartechDynamicApi cartechDynamicApi;
        String str = ((h19) obj).b;
        if (str != null) {
            try {
                failure = Uri.parse(str);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            Uri uri = (Uri) failure;
            if (uri != null) {
                queryParameter = uri.getQueryParameter("deeplink_url");
                cartechDynamicApi = this.J.a;
                if (cartechDynamicApi == null) {
                    cartechDynamicApi = null;
                }
                FlutterFragment g = cartechDynamicApi.g(queryParameter);
                tje.N(o(), null, null, new CartechModalViewRouter$provideFragment$1(g, this, null), 3);
                return g;
            }
        }
        queryParameter = null;
        cartechDynamicApi = this.J.a;
        if (cartechDynamicApi == null) {
        }
        FlutterFragment g2 = cartechDynamicApi.g(queryParameter);
        tje.N(o(), null, null, new CartechModalViewRouter$provideFragment$1(g2, this, null), 3);
        return g2;
    }
}
