package com.yandex.go.payments.cards.nfc.navigation;

import android.content.Context;
import com.yandex.go.payments.cards.pci_dss.recognition.CameraPermissionPermanentlyDeniedException;
import defpackage.ejp;
import defpackage.gd0;
import defpackage.hn8;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.sb2;
import defpackage.sho;
import defpackage.uq1;
import java.util.HashMap;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;

/* loaded from: classes13.dex */
public final class a implements hn8 {
    public final Context a;
    public final com.yandex.go.payments.cards.pci_dss.recognition.a b;
    public final gd0 c;
    public final uq1 w;

    public a(Context context, com.yandex.go.payments.cards.pci_dss.recognition.a aVar, gd0 gd0Var, uq1 uq1Var) {
        this.a = context;
        this.b = aVar;
        this.c = gd0Var;
        this.w = uq1Var;
    }

    @Override // defpackage.hn8
    public final boolean i() {
        return this.a.getPackageManager().hasSystemFeature("android.hardware.camera");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.hn8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Continuation continuation) {
        GoCardScannerRouter$startCardScannerForResult$1 goCardScannerRouter$startCardScannerForResult$1;
        int i;
        Object a;
        Throwable a2;
        if (continuation instanceof GoCardScannerRouter$startCardScannerForResult$1) {
            goCardScannerRouter$startCardScannerForResult$1 = (GoCardScannerRouter$startCardScannerForResult$1) continuation;
            int i2 = goCardScannerRouter$startCardScannerForResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                goCardScannerRouter$startCardScannerForResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = goCardScannerRouter$startCardScannerForResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = goCardScannerRouter$startCardScannerForResult$1.label;
                gd0 gd0Var = this.c;
                if (i != 0) {
                    b.b(obj);
                    gd0Var.getClass();
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    Regex regex = sho.a;
                    gd0Var.a.a(sb2.q("add_creditcard.openScanner", hashMap), hashMap, 1, hashMap2);
                    goCardScannerRouter$startCardScannerForResult$1.label = 1;
                    a = this.b.a(goCardScannerRouter$startCardScannerForResult$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (!(a instanceof Result.Failure)) {
                    gd0Var.getClass();
                    HashMap hashMap3 = new HashMap();
                    HashMap hashMap4 = new HashMap();
                    Regex regex2 = sho.a;
                    gd0Var.a.a(sb2.q("add_creditcard.scanSuccess", hashMap3), hashMap3, 1, hashMap4);
                }
                a2 = Result.a(a);
                if (a2 != null && (a2 instanceof CameraPermissionPermanentlyDeniedException)) {
                    this.w.a().setMessage(kyh0.logistics_postcard_editor_camera_permission_dialog_title).setPositiveButton(kyh0.logistics_postcard_editor_camera_permission_dialog_settings, new ejp(19, this)).setNegativeButton(kyh0.common_cancel, (Runnable) null).show();
                }
                return a;
            }
        }
        goCardScannerRouter$startCardScannerForResult$1 = new GoCardScannerRouter$startCardScannerForResult$1(this, (ContinuationImpl) continuation);
        Object obj2 = goCardScannerRouter$startCardScannerForResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = goCardScannerRouter$startCardScannerForResult$1.label;
        gd0 gd0Var2 = this.c;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
        a2 = Result.a(a);
        if (a2 != null) {
            this.w.a().setMessage(kyh0.logistics_postcard_editor_camera_permission_dialog_title).setPositiveButton(kyh0.logistics_postcard_editor_camera_permission_dialog_settings, new ejp(19, this)).setNegativeButton(kyh0.common_cancel, (Runnable) null).show();
        }
        return a;
    }
}
