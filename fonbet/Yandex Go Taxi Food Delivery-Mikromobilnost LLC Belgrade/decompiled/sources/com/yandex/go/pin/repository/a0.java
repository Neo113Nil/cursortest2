package com.yandex.go.pin.repository;

import android.graphics.drawable.BitmapDrawable;
import defpackage.c0c0;
import defpackage.e0c0;
import defpackage.e1c0;
import defpackage.e800;
import defpackage.evu0;
import defpackage.f0c0;
import defpackage.f1c0;
import defpackage.fji;
import defpackage.iez;
import defpackage.kyh0;
import defpackage.lub0;
import defpackage.nj6;
import defpackage.ny61;
import defpackage.oyb0;
import defpackage.p2c0;
import defpackage.r0c0;
import defpackage.rol0;
import defpackage.rwt;
import defpackage.tpr;
import defpackage.uze0;
import defpackage.vng;
import defpackage.vtb0;
import defpackage.wiq0;
import defpackage.ya00;
import defpackage.ybo;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

/* loaded from: classes13.dex */
public final class a0 extends ya00 {
    public final ru.yandex.taxi.main.map.e a;
    public final AddressResolveRepository b;
    public final o c;
    public final f1c0 d;
    public final uze0 e;
    public final e800 f;
    public final wiq0 g;
    public final ru.yandex.taxi.delivery.pin.k h;
    public final com.yandex.go.navigation.screen.c i;
    public final vtb0 j;
    public final oyb0 k;
    public final rwt l;
    public final nj6 m;
    public final ru.yandex.taxi.widget.utils.e n;
    public final p2c0 o;
    public final String p;
    public final SourceOnMapControl.a q;
    public final SourceOnMapControl.a r;
    public final SourceOnMapControl.a s;
    public final fji t;

    public a0(ru.yandex.taxi.main.map.e eVar, AddressResolveRepository addressResolveRepository, o oVar, f1c0 f1c0Var, uze0 uze0Var, e800 e800Var, wiq0 wiq0Var, ru.yandex.taxi.delivery.pin.k kVar, com.yandex.go.navigation.screen.c cVar, vtb0 vtb0Var, oyb0 oyb0Var, rwt rwtVar, nj6 nj6Var, ru.yandex.taxi.widget.utils.e eVar2, p2c0 p2c0Var, r0c0 r0c0Var) {
        this.a = eVar;
        this.b = addressResolveRepository;
        this.c = oVar;
        this.d = f1c0Var;
        this.e = uze0Var;
        this.f = e800Var;
        this.g = wiq0Var;
        this.h = kVar;
        this.i = cVar;
        this.j = vtb0Var;
        this.k = oyb0Var;
        this.l = rwtVar;
        this.m = nj6Var;
        this.n = eVar2;
        this.o = p2c0Var;
        this.p = eVar2.a.getString(kyh0.date_format_min);
        SourceOnMapControl.a aVar = new SourceOnMapControl.a(r0c0Var.h(), null, null, false, false, null, null, 1790);
        this.q = aVar;
        this.r = SourceOnMapControl.a.a(aVar, r0c0Var.d(), null, null, false, null, false, false, null, 2046);
        this.s = SourceOnMapControl.a.a(aVar, e0c0.a, null, null, false, null, false, false, null, 2046);
        this.t = new fji(null, "", "", false, false, null, null);
    }

    @Override // defpackage.b1c0
    public final tpr a(tpr tprVar) {
        return new m0(tprVar, this.b.b, new MainScreenPinV2DataRepositoryImpl$positionFlow$1(this.o.a(), null));
    }

    @Override // defpackage.b1c0
    public final tpr b(tpr tprVar) {
        return kotlinx.coroutines.flow.e.p(new rol0(new MainScreenPinV2DataRepositoryImpl$stateFlow$1(this, tprVar, null)), 100L);
    }

    @Override // defpackage.b1c0
    public final tpr c() {
        o oVar = this.c;
        return kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(oVar.c(), new MainPinStyleRepositoryImpl$sourceV2StyleFlow$$inlined$flatMapLatest$1(oVar, null)));
    }

    @Override // defpackage.b1c0
    public final tpr d() {
        return this.a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(e1c0 e1c0Var, ybo yboVar, SourceOnMapControl.a aVar, lub0 lub0Var, ContinuationImpl continuationImpl) {
        MainScreenPinV2DataRepositoryImpl$createReadyState$1 mainScreenPinV2DataRepositoryImpl$createReadyState$1;
        int i;
        String str;
        String str2;
        if (continuationImpl instanceof MainScreenPinV2DataRepositoryImpl$createReadyState$1) {
            mainScreenPinV2DataRepositoryImpl$createReadyState$1 = (MainScreenPinV2DataRepositoryImpl$createReadyState$1) continuationImpl;
            int i2 = mainScreenPinV2DataRepositoryImpl$createReadyState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainScreenPinV2DataRepositoryImpl$createReadyState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mainScreenPinV2DataRepositoryImpl$createReadyState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainScreenPinV2DataRepositoryImpl$createReadyState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str3 = lub0Var.a;
                    mainScreenPinV2DataRepositoryImpl$createReadyState$1.L$0 = e1c0Var;
                    mainScreenPinV2DataRepositoryImpl$createReadyState$1.L$1 = yboVar;
                    mainScreenPinV2DataRepositoryImpl$createReadyState$1.L$2 = aVar;
                    mainScreenPinV2DataRepositoryImpl$createReadyState$1.L$3 = null;
                    mainScreenPinV2DataRepositoryImpl$createReadyState$1.label = 1;
                    obj = ru.yandex.taxi.widget.utils.e.f(this.n, str3, null, mainScreenPinV2DataRepositoryImpl$createReadyState$1, 6);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar = (SourceOnMapControl.a) mainScreenPinV2DataRepositoryImpl$createReadyState$1.L$2;
                    yboVar = (ybo) mainScreenPinV2DataRepositoryImpl$createReadyState$1.L$1;
                    e1c0Var = (e1c0) mainScreenPinV2DataRepositoryImpl$createReadyState$1.L$0;
                    kotlin.b.b(obj);
                }
                SourceOnMapControl.a aVar2 = aVar;
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                str = yboVar.b;
                if (evu0.J(str)) {
                    str = yboVar.a + " " + this.p;
                }
                String str4 = str;
                f0c0 c0c0Var = bitmapDrawable == null ? new c0c0(bitmapDrawable) : aVar2.a;
                str2 = (String) e1c0Var.c.get(e1c0Var.d);
                if (str2 == null) {
                    str2 = "";
                }
                return SourceOnMapControl.a.a(aVar2, c0c0Var, str2, str4, false, null, false, false, null, 2040);
            }
        }
        mainScreenPinV2DataRepositoryImpl$createReadyState$1 = new MainScreenPinV2DataRepositoryImpl$createReadyState$1(this, continuationImpl);
        Object obj2 = mainScreenPinV2DataRepositoryImpl$createReadyState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainScreenPinV2DataRepositoryImpl$createReadyState$1.label;
        if (i != 0) {
        }
        SourceOnMapControl.a aVar22 = aVar;
        BitmapDrawable bitmapDrawable2 = (BitmapDrawable) obj2;
        str = yboVar.b;
        if (evu0.J(str)) {
        }
        String str42 = str;
        f0c0 c0c0Var2 = bitmapDrawable2 == null ? new c0c0(bitmapDrawable2) : aVar22.a;
        str2 = (String) e1c0Var.c.get(e1c0Var.d);
        if (str2 == null) {
        }
        return SourceOnMapControl.a.a(aVar22, c0c0Var2, str2, str42, false, null, false, false, null, 2040);
    }

    public final tpr f() {
        return kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.I(vng.l(((com.yandex.go.taxi.tariffs.internal.repository.k) this.g).f(), new iez(20), vng.c), new MainScreenPinV2DataRepositoryImpl$defaultStateFlow$2(this, null)));
    }
}
