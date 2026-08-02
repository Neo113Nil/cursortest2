package com.yandex.go.cartech.dynamic;

import android.content.Context;
import android.os.Bundle;
import com.yandex.go.cartech.dynamic.domain.a;
import com.yandex.go.cartech.dynamic.domain.d;
import com.yandex.go.cartech.dynamic.domain.g;
import com.yandex.go.cartech.sdk.CartechDynamicApi;
import defpackage.a19;
import defpackage.bcj;
import defpackage.c19;
import defpackage.dvw;
import defpackage.ea20;
import defpackage.f19;
import defpackage.i1h;
import defpackage.j18;
import defpackage.j1h;
import defpackage.jhu0;
import defpackage.jst;
import defpackage.n19;
import defpackage.ny61;
import defpackage.q66;
import defpackage.use;
import defpackage.vm7;
import defpackage.w3i;
import defpackage.zy11;
import io.flutter.embedding.android.FlutterFragment;
import io.flutter.embedding.android.TransparencyMode;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.n0;
import ru.yandex.tankerapp.go.models.HomeInitialModel;
import ru.yandex.tankerapp.go.presentation.CartechFragment;
import ru.yandex.tankerapp.go.sdk.models.CartechInitialData;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/go/cartech/dynamic/CartechDynamicApiImpl;", "Lcom/yandex/go/cartech/sdk/CartechDynamicApi;", "", "mutex", "Ljava/lang/Object;", "Ln19;", "tankerGoSdk", "Ln19;", "Lcom/yandex/go/cartech/dynamic/domain/d;", "authAdapter", "Lcom/yandex/go/cartech/dynamic/domain/d;", "La19;", "dependencies", "La19;", "dynamic"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartechDynamicApiImpl implements CartechDynamicApi {
    private static volatile d authAdapter;
    private static volatile a19 dependencies;
    private static volatile n19 tankerGoSdk;
    public static final CartechDynamicApiImpl INSTANCE = new CartechDynamicApiImpl();
    private static final Object mutex = new Object();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.yandex.go.cartech.sdk.CartechDynamicApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        CartechDynamicApiImpl$handleDeeplink$1 cartechDynamicApiImpl$handleDeeplink$1;
        int i;
        if (continuationImpl instanceof CartechDynamicApiImpl$handleDeeplink$1) {
            cartechDynamicApiImpl$handleDeeplink$1 = (CartechDynamicApiImpl$handleDeeplink$1) continuationImpl;
            int i2 = cartechDynamicApiImpl$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cartechDynamicApiImpl$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cartechDynamicApiImpl$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cartechDynamicApiImpl$handleDeeplink$1.label;
                if (i != 0) {
                    b.b(obj);
                    n19 n19Var = tankerGoSdk;
                    if (n19Var == null) {
                        n19Var = null;
                    }
                    cartechDynamicApiImpl$handleDeeplink$1.L$0 = null;
                    cartechDynamicApiImpl$handleDeeplink$1.label = 1;
                    n19Var.getClass();
                    w3i w3iVar = n19.b;
                    if (w3iVar == null) {
                        w3iVar = null;
                    }
                    j1h j1hVar = (j1h) w3iVar.A;
                    j1hVar.getClass();
                    j18 j18Var = new j18(1, dvw.b(cartechDynamicApiImpl$handleDeeplink$1));
                    j18Var.u();
                    ea20 ea20Var = j1hVar.a;
                    (ea20Var != null ? ea20Var : null).a("deeplink_manager/handle_deeplink", str, new i1h(j18Var));
                    if (j18Var.s() == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return zy11.a;
            }
        }
        cartechDynamicApiImpl$handleDeeplink$1 = new CartechDynamicApiImpl$handleDeeplink$1(this, continuationImpl);
        Object obj2 = cartechDynamicApiImpl$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cartechDynamicApiImpl$handleDeeplink$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    @Override // com.yandex.go.cartech.sdk.CartechDynamicApi
    public final n0 d() {
        d dVar = authAdapter;
        if (dVar == null) {
            dVar = null;
        }
        return dVar.f;
    }

    @Override // com.yandex.go.cartech.sdk.CartechDynamicApi
    public final FlutterFragment g(String str) {
        n19 n19Var = tankerGoSdk;
        if (n19Var == null) {
            n19Var = null;
        }
        a19 a19Var = dependencies;
        if (a19Var == null) {
            a19Var = null;
        }
        a19Var.b.getClass();
        a19Var.b.getClass();
        a19Var.m.getClass();
        CartechInitialData cartechInitialData = new CartechInitialData("5.89.0", "ru.yandex.taxi", a19Var.e.b(), a19Var.d.a(), a19Var.d.a(), a19Var.o.getThemeType().c(), a19Var.c.Jg(), a19Var.i.b.Hg(), str);
        n19Var.getClass();
        c19 c19Var = CartechFragment.Companion;
        w3i w3iVar = n19.b;
        (w3iVar != null ? w3iVar : null).getClass();
        HomeInitialModel homeInitialModel = new HomeInitialModel(cartechInitialData.getVersionApp(), cartechInitialData.getAppName(), cartechInitialData.getIsTesting() ? "https://app.tst.tanker.yandex.net" : "https://app.tanker.yandex.net", cartechInitialData.getIsDarkTheme(), cartechInitialData.getLocale(), (String) bcj.a.getValue(), cartechInitialData.getIsTesting(), cartechInitialData.getUuid(), cartechInitialData.getDeviceId(), cartechInitialData.getPhoneId(), cartechInitialData.getIsInternalTest(), cartechInitialData.getDeeplink(), cartechInitialData.getGoUserId(), cartechInitialData.getPromoMode());
        c19Var.getClass();
        FlutterFragment.a aVar = new FlutterFragment.a(0);
        aVar.j = TransparencyMode.transparent;
        aVar.l = true;
        FlutterFragment a = aVar.a();
        Bundle bundle = new Bundle();
        bundle.putSerializable("KEY_INITIAL_MODEL", homeInitialModel);
        ((CartechFragment) a).setArguments(bundle);
        return a;
    }

    @Override // com.yandex.go.cartech.sdk.CartechDynamicApi
    public final void j(a19 a19Var) {
        if (tankerGoSdk == null) {
            synchronized (mutex) {
                if (tankerGoSdk == null) {
                    dependencies = a19Var;
                    AtomicBoolean atomicBoolean = f19.a;
                    Context applicationContext = a19Var.a.getApplicationContext();
                    if (f19.a.compareAndSet(false, true)) {
                        try {
                            q66 q66Var = new q66();
                            q66Var.a = true;
                            q66Var.h(applicationContext, "app");
                        } catch (Throwable th) {
                            jst.e.k(th, "Failed to TraceRouteWrapper.checkNative");
                        }
                    }
                    authAdapter = new d(a19Var.i, a19Var.j, a19Var.k, a19Var.l, a19Var.n);
                    n19 n19Var = n19.a;
                    d dVar = authAdapter;
                    if (dVar == null) {
                        dVar = null;
                    }
                    g gVar = new g(a19Var.f, a19Var.g);
                    jhu0 jhu0Var = new jhu0(a19Var.h);
                    n19.b = new w3i(jhu0Var, dVar, gVar, new vm7(16), new a(), new use());
                    tankerGoSdk = n19Var;
                }
            }
        }
    }
}
