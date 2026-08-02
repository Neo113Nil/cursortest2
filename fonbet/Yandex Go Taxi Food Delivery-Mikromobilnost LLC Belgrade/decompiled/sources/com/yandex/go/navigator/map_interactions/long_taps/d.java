package com.yandex.go.navigator.map_interactions.long_taps;

import com.yandex.go.address.models.Address;
import defpackage.doz;
import defpackage.hpv;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.vpr;
import defpackage.ynz;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ ynz b;

    public d(vpr vprVar, ynz ynzVar) {
        this.a = vprVar;
        this.b = ynzVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c4, code lost:
    
        if (r11.emit(r2, r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LongTapPresenter$renderContent$$inlined$map$1$2$1 longTapPresenter$renderContent$$inlined$map$1$2$1;
        int i;
        ynz ynzVar;
        hpv hpvVar;
        vpr vprVar;
        vpr vprVar2;
        hpv hpvVar2;
        Address address;
        if (continuation instanceof LongTapPresenter$renderContent$$inlined$map$1$2$1) {
            longTapPresenter$renderContent$$inlined$map$1$2$1 = (LongTapPresenter$renderContent$$inlined$map$1$2$1) continuation;
            int i2 = longTapPresenter$renderContent$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                longTapPresenter$renderContent$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = longTapPresenter$renderContent$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = longTapPresenter$renderContent$$inlined$map$1$2$1.label;
                ynzVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    hpvVar = (hpv) obj;
                    qoh qohVar = ynzVar.F;
                    vprVar = this.a;
                    if (qohVar != null) {
                        longTapPresenter$renderContent$$inlined$map$1$2$1.L$0 = null;
                        longTapPresenter$renderContent$$inlined$map$1$2$1.L$1 = null;
                        longTapPresenter$renderContent$$inlined$map$1$2$1.L$2 = null;
                        longTapPresenter$renderContent$$inlined$map$1$2$1.L$3 = null;
                        longTapPresenter$renderContent$$inlined$map$1$2$1.L$4 = vprVar;
                        longTapPresenter$renderContent$$inlined$map$1$2$1.L$5 = null;
                        longTapPresenter$renderContent$$inlined$map$1$2$1.L$6 = hpvVar;
                        longTapPresenter$renderContent$$inlined$map$1$2$1.label = 1;
                        obj2 = qohVar.s(longTapPresenter$renderContent$$inlined$map$1$2$1);
                        if (obj2 != coroutineSingletons) {
                            vprVar2 = vprVar;
                            hpvVar2 = hpvVar;
                        }
                        return coroutineSingletons;
                    }
                    String str = ynzVar.x.getLatitude() + Extension.FIX_SPACE + ynzVar.x.getLongitude();
                    hpv hpvVar3 = hpvVar;
                    vprVar2 = vprVar;
                    hpvVar2 = hpvVar3;
                    doz dozVar = new doz(str, hpvVar2.a);
                    longTapPresenter$renderContent$$inlined$map$1$2$1.L$0 = null;
                    longTapPresenter$renderContent$$inlined$map$1$2$1.L$1 = null;
                    longTapPresenter$renderContent$$inlined$map$1$2$1.L$2 = null;
                    longTapPresenter$renderContent$$inlined$map$1$2$1.L$3 = null;
                    longTapPresenter$renderContent$$inlined$map$1$2$1.L$4 = null;
                    longTapPresenter$renderContent$$inlined$map$1$2$1.L$5 = null;
                    longTapPresenter$renderContent$$inlined$map$1$2$1.L$6 = null;
                    longTapPresenter$renderContent$$inlined$map$1$2$1.label = 2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    hpvVar2 = (hpv) longTapPresenter$renderContent$$inlined$map$1$2$1.L$6;
                    vprVar2 = (vpr) longTapPresenter$renderContent$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                }
                address = (Address) obj2;
                if (address != null || (str = address.D1()) == null) {
                    vpr vprVar3 = vprVar2;
                    hpvVar = hpvVar2;
                    vprVar = vprVar3;
                    String str2 = ynzVar.x.getLatitude() + Extension.FIX_SPACE + ynzVar.x.getLongitude();
                    hpv hpvVar32 = hpvVar;
                    vprVar2 = vprVar;
                    hpvVar2 = hpvVar32;
                }
                doz dozVar2 = new doz(str2, hpvVar2.a);
                longTapPresenter$renderContent$$inlined$map$1$2$1.L$0 = null;
                longTapPresenter$renderContent$$inlined$map$1$2$1.L$1 = null;
                longTapPresenter$renderContent$$inlined$map$1$2$1.L$2 = null;
                longTapPresenter$renderContent$$inlined$map$1$2$1.L$3 = null;
                longTapPresenter$renderContent$$inlined$map$1$2$1.L$4 = null;
                longTapPresenter$renderContent$$inlined$map$1$2$1.L$5 = null;
                longTapPresenter$renderContent$$inlined$map$1$2$1.L$6 = null;
                longTapPresenter$renderContent$$inlined$map$1$2$1.label = 2;
            }
        }
        longTapPresenter$renderContent$$inlined$map$1$2$1 = new LongTapPresenter$renderContent$$inlined$map$1$2$1(this, continuation);
        Object obj22 = longTapPresenter$renderContent$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = longTapPresenter$renderContent$$inlined$map$1$2$1.label;
        ynzVar = this.b;
        if (i != 0) {
        }
        address = (Address) obj22;
        if (address != null) {
        }
        vpr vprVar32 = vprVar2;
        hpvVar = hpvVar2;
        vprVar = vprVar32;
        String str22 = ynzVar.x.getLatitude() + Extension.FIX_SPACE + ynzVar.x.getLongitude();
        hpv hpvVar322 = hpvVar;
        vprVar2 = vprVar;
        hpvVar2 = hpvVar322;
        doz dozVar22 = new doz(str22, hpvVar2.a);
        longTapPresenter$renderContent$$inlined$map$1$2$1.L$0 = null;
        longTapPresenter$renderContent$$inlined$map$1$2$1.L$1 = null;
        longTapPresenter$renderContent$$inlined$map$1$2$1.L$2 = null;
        longTapPresenter$renderContent$$inlined$map$1$2$1.L$3 = null;
        longTapPresenter$renderContent$$inlined$map$1$2$1.L$4 = null;
        longTapPresenter$renderContent$$inlined$map$1$2$1.L$5 = null;
        longTapPresenter$renderContent$$inlined$map$1$2$1.L$6 = null;
        longTapPresenter$renderContent$$inlined$map$1$2$1.label = 2;
    }
}
