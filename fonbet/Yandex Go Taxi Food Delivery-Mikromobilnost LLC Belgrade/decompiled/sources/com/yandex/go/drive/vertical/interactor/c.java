package com.yandex.go.drive.vertical.interactor;

import defpackage.avj0;
import defpackage.bj70;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.vpr;
import defpackage.wi70;
import defpackage.ycm;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.tariffs.model.TariffSource;

/* loaded from: classes12.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;

    public c(vpr vprVar, e eVar) {
        this.a = vprVar;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DriveOrderButtonStateInteractor$stateFlow$$inlined$map$2$2$1 driveOrderButtonStateInteractor$stateFlow$$inlined$map$2$2$1;
        int i;
        wi70 a;
        String str;
        if (continuation instanceof DriveOrderButtonStateInteractor$stateFlow$$inlined$map$2$2$1) {
            driveOrderButtonStateInteractor$stateFlow$$inlined$map$2$2$1 = (DriveOrderButtonStateInteractor$stateFlow$$inlined$map$2$2$1) continuation;
            int i2 = driveOrderButtonStateInteractor$stateFlow$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                driveOrderButtonStateInteractor$stateFlow$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = driveOrderButtonStateInteractor$stateFlow$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = driveOrderButtonStateInteractor$stateFlow$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ycm ycmVar = (ycm) obj;
                    pex0 pex0Var = ycmVar.a.a;
                    e eVar = this.b;
                    if (!eVar.b.g()) {
                        a = eVar.a(ycmVar, null, null);
                    } else if (pex0Var.u) {
                        String str2 = pex0Var.D;
                        Pair pair = (str2 == null || str2.length() == 0) ? new Pair(pex0Var.p, null) : new Pair(pex0Var.D, pex0Var.E);
                        String str3 = (String) pair.getFirst();
                        String str4 = (String) pair.getSecond();
                        String str5 = pex0Var.G;
                        if ("drive_not_portal".equals(str5) || "drive_not_registered".equals(str5) || "drive_unknown_error".equals(str5)) {
                            a = eVar.a(ycmVar, str3, str4);
                        } else {
                            if (str3 == null) {
                                str3 = ((avj0) eVar.a).h(kyh0.summary_confirm);
                            }
                            String str6 = str3;
                            if (str4 == null) {
                                str4 = "";
                            }
                            String str7 = str4;
                            boolean z = pex0Var.a == TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS;
                            if (str7.length() == 0) {
                                str = str6;
                            } else {
                                str = ((Object) str6) + Extension.FIX_SPACE + ((Object) str7);
                            }
                            a = new wi70(str6, str7, str, bj70.e, false, false, z);
                        }
                    } else {
                        String str8 = pex0Var.p;
                        if (str8 == null || str8.length() == 0) {
                            str8 = null;
                        }
                        a = eVar.a(ycmVar, str8, null);
                    }
                    driveOrderButtonStateInteractor$stateFlow$$inlined$map$2$2$1.L$0 = null;
                    driveOrderButtonStateInteractor$stateFlow$$inlined$map$2$2$1.L$1 = null;
                    driveOrderButtonStateInteractor$stateFlow$$inlined$map$2$2$1.L$2 = null;
                    driveOrderButtonStateInteractor$stateFlow$$inlined$map$2$2$1.L$3 = null;
                    driveOrderButtonStateInteractor$stateFlow$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(a, driveOrderButtonStateInteractor$stateFlow$$inlined$map$2$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        driveOrderButtonStateInteractor$stateFlow$$inlined$map$2$2$1 = new DriveOrderButtonStateInteractor$stateFlow$$inlined$map$2$2$1(this, continuation);
        Object obj22 = driveOrderButtonStateInteractor$stateFlow$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = driveOrderButtonStateInteractor$stateFlow$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
