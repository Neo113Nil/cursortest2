package com.yandex.go.universal_qr_scanner.presentation;

import androidx.camera.core.f;
import com.yandex.go.universal_qr_scanner.experiments.config.e;
import defpackage.a201;
import defpackage.ad5;
import defpackage.gpx0;
import defpackage.h3y;
import defpackage.jl40;
import defpackage.l8x;
import defpackage.lz11;
import defpackage.m021;
import defpackage.m950;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.u021;
import defpackage.w511;
import defpackage.wpy0;
import defpackage.wz11;
import defpackage.xz11;
import defpackage.yio0;
import defpackage.yz11;
import defpackage.zr01;
import defpackage.zxa;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class d extends ad5 {
    public final com.yandex.go.universal_qr_scanner.domain.camera.image.analyze.d A;
    public final a201 B;
    public final com.yandex.go.universal_qr_scanner.domain.b C;
    public final h3y D;
    public final lz11 E;
    public final wz11 F;
    public final com.yandex.go.universal_qr_scanner.domain.camera.permission.a G;
    public final yz11 H;
    public final wpy0 x;
    public final com.yandex.go.universal_qr_scanner.domain.camera.a y;
    public final com.yandex.go.universal_qr_scanner.domain.torch.b z;

    public d(wpy0 wpy0Var, com.yandex.go.universal_qr_scanner.domain.camera.a aVar, com.yandex.go.universal_qr_scanner.domain.torch.b bVar, com.yandex.go.universal_qr_scanner.domain.camera.image.analyze.d dVar, a201 a201Var, com.yandex.go.universal_qr_scanner.domain.b bVar2, h3y h3yVar, lz11 lz11Var, wz11 wz11Var, com.yandex.go.universal_qr_scanner.domain.camera.permission.a aVar2, yz11 yz11Var) {
        super(m021.class);
        this.x = wpy0Var;
        this.y = aVar;
        this.z = bVar;
        this.A = dVar;
        this.B = a201Var;
        this.C = bVar2;
        this.D = h3yVar;
        this.E = lz11Var;
        this.F = wz11Var;
        this.G = aVar2;
        this.H = yz11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(d dVar, xz11 xz11Var, Continuation continuation) {
        UniversalQrScannerPresenter$handleDeeplinkAction$1 universalQrScannerPresenter$handleDeeplinkAction$1;
        int i;
        Object value;
        r0 r0Var;
        Object value2;
        com.yandex.go.universal_qr_scanner.domain.camera.image.analyze.d dVar2 = dVar.A;
        if (continuation instanceof UniversalQrScannerPresenter$handleDeeplinkAction$1) {
            universalQrScannerPresenter$handleDeeplinkAction$1 = (UniversalQrScannerPresenter$handleDeeplinkAction$1) continuation;
            int i2 = universalQrScannerPresenter$handleDeeplinkAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                universalQrScannerPresenter$handleDeeplinkAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = universalQrScannerPresenter$handleDeeplinkAction$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = universalQrScannerPresenter$handleDeeplinkAction$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r0 r0Var2 = dVar2.e;
                    do {
                        value = r0Var2.getValue();
                    } while (!r0Var2.k(value, kotlin.collections.a.o0((List) value, xz11Var)));
                    if (jl40.l(xz11Var, xz11.a)) {
                        ((zxa) dVar.x.b).i();
                        return zy11.a;
                    }
                    if (!jl40.l(xz11Var, xz11.b)) {
                        w511.b();
                        return null;
                    }
                    universalQrScannerPresenter$handleDeeplinkAction$1.L$0 = xz11Var;
                    universalQrScannerPresenter$handleDeeplinkAction$1.label = 1;
                    if (dVar.Lg(universalQrScannerPresenter$handleDeeplinkAction$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xz11Var = (xz11) universalQrScannerPresenter$handleDeeplinkAction$1.L$0;
                    kotlin.b.b(obj);
                }
                r0Var = dVar2.e;
                do {
                    value2 = r0Var.getValue();
                } while (!r0Var.k(value2, kotlin.collections.a.j0((List) value2, xz11Var)));
                return zy11.a;
            }
        }
        universalQrScannerPresenter$handleDeeplinkAction$1 = new UniversalQrScannerPresenter$handleDeeplinkAction$1(dVar, continuation);
        Object obj3 = universalQrScannerPresenter$handleDeeplinkAction$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = universalQrScannerPresenter$handleDeeplinkAction$1.label;
        if (i != 0) {
        }
        r0Var = dVar2.e;
        do {
            value2 = r0Var.getValue();
        } while (!r0Var.k(value2, kotlin.collections.a.j0((List) value2, xz11Var)));
        return zy11.a;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        com.yandex.go.universal_qr_scanner.domain.camera.a aVar = this.y;
        aVar.c.l(null);
        l8x l8xVar = aVar.f;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        aVar.f = null;
        aVar.b.a();
        com.yandex.go.universal_qr_scanner.domain.camera.image.analyze.d dVar = this.A;
        ((f) dVar.d.e.getValue()).H();
        pzt0 pzt0Var = dVar.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        dVar.f = null;
        wz11 wz11Var = this.F;
        ((f) wz11Var.e.getValue()).H();
        ((ExecutorService) wz11Var.f.getValue()).shutdown();
        wz11Var.c = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Lg(ContinuationImpl continuationImpl) {
        UniversalQrScannerPresenter$showQrNotSupported$1 universalQrScannerPresenter$showQrNotSupported$1;
        int i;
        u021 u021Var;
        r0 r0Var;
        Object value;
        if (continuationImpl instanceof UniversalQrScannerPresenter$showQrNotSupported$1) {
            universalQrScannerPresenter$showQrNotSupported$1 = (UniversalQrScannerPresenter$showQrNotSupported$1) continuationImpl;
            int i2 = universalQrScannerPresenter$showQrNotSupported$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                universalQrScannerPresenter$showQrNotSupported$1.label = i2 - Integer.MIN_VALUE;
                Object obj = universalQrScannerPresenter$showQrNotSupported$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = universalQrScannerPresenter$showQrNotSupported$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = (e) this.D.get();
                    universalQrScannerPresenter$showQrNotSupported$1.label = 1;
                    obj = eVar.b(universalQrScannerPresenter$showQrNotSupported$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                u021Var = (u021) obj;
                r0Var = this.A.e;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, kotlin.collections.a.o0((List) value, u021Var)));
                zr01 zr01Var = new zr01(16, this, u021Var);
                zxa zxaVar = (zxa) this.x.b;
                zxaVar.A((m950) ((gpx0) zxaVar.J).get(), u021Var, new yio0(26, zr01Var));
                return zy11.a;
            }
        }
        universalQrScannerPresenter$showQrNotSupported$1 = new UniversalQrScannerPresenter$showQrNotSupported$1(this, continuationImpl);
        Object obj2 = universalQrScannerPresenter$showQrNotSupported$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = universalQrScannerPresenter$showQrNotSupported$1.label;
        if (i != 0) {
        }
        u021Var = (u021) obj2;
        r0Var = this.A.e;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, kotlin.collections.a.o0((List) value, u021Var)));
        zr01 zr01Var2 = new zr01(16, this, u021Var);
        zxa zxaVar2 = (zxa) this.x.b;
        zxaVar2.A((m950) ((gpx0) zxaVar2.J).get(), u021Var, new yio0(26, zr01Var2));
        return zy11.a;
    }
}
