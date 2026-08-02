package com.yandex.payment.sdk.nfcscanner.tools;

import android.nfc.NfcAdapter;
import android.os.Bundle;
import defpackage.m960;
import defpackage.ny61;
import defpackage.qv90;
import defpackage.vfc;
import defpackage.vpr;
import defpackage.xvz;
import defpackage.y22;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class b implements vpr {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, Continuation continuation) {
        NfcController$collectNfcHardwareState$1$1$emit$1 nfcController$collectNfcHardwareState$1$1$emit$1;
        int i;
        c cVar;
        NfcAdapter nfcAdapter;
        if (continuation instanceof NfcController$collectNfcHardwareState$1$1$emit$1) {
            nfcController$collectNfcHardwareState$1$1$emit$1 = (NfcController$collectNfcHardwareState$1$1$emit$1) continuation;
            int i2 = nfcController$collectNfcHardwareState$1$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nfcController$collectNfcHardwareState$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = nfcController$collectNfcHardwareState$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nfcController$collectNfcHardwareState$1$1$emit$1.label;
                zy11 zy11Var = zy11.a;
                cVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r0 r0Var = cVar.b;
                    m960 m960Var = z ? m960.b : m960.a;
                    nfcController$collectNfcHardwareState$1$1$emit$1.Z$0 = z;
                    nfcController$collectNfcHardwareState$1$1$emit$1.label = 1;
                    r0Var.emit(m960Var, nfcController$collectNfcHardwareState$1$1$emit$1);
                    if (zy11Var == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = nfcController$collectNfcHardwareState$1$1$emit$1.Z$0;
                    kotlin.b.b(obj);
                }
                if (z) {
                    ((y22) cVar.a.getEventReporter()).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "NFC выключен", "nfc_turned_off"));
                    ((y22) cVar.a.getEventReporter()).a(xvz.f(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "NFC невидимый", "nfc_invisible"));
                } else {
                    ((y22) cVar.a.getEventReporter()).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "NFC включен", "nfc_turned_on"));
                    ((y22) cVar.a.getEventReporter()).a(xvz.f(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "NFC видимый", "nfc_visible"));
                }
                if (z && cVar.x && (nfcAdapter = cVar.y) != null) {
                    nfcAdapter.enableReaderMode(cVar.w, cVar.D, HProv.PP_FAST_CODE, new Bundle(0));
                }
                return zy11Var;
            }
        }
        nfcController$collectNfcHardwareState$1$1$emit$1 = new NfcController$collectNfcHardwareState$1$1$emit$1(this, continuation);
        Object obj2 = nfcController$collectNfcHardwareState$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nfcController$collectNfcHardwareState$1$1$emit$1.label;
        zy11 zy11Var2 = zy11.a;
        cVar = this.a;
        if (i != 0) {
        }
        if (z) {
        }
        if (z) {
            nfcAdapter.enableReaderMode(cVar.w, cVar.D, HProv.PP_FAST_CODE, new Bundle(0));
        }
        return zy11Var2;
    }

    @Override // defpackage.vpr
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return a(((Boolean) obj).booleanValue(), continuation);
    }
}
