package com.yandex.go.vault.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.yandex.go.vault.flexsdk.descriptors.widget.actions.VaultStoreErrorScreenPayload;
import defpackage.g16;
import defpackage.hst;
import defpackage.jst;
import defpackage.jy31;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.ny61;
import defpackage.pav;
import defpackage.to41;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class a implements to41 {
    public final k7x0 b;
    public final pav c;
    public VaultStoreErrorScreenPayload d;
    public Bitmap e;

    public a(pav pavVar, k7x0 k7x0Var) {
        this.b = k7x0Var;
        this.c = pavVar;
    }

    @Override // defpackage.to41
    public final View a(Context context, jy31 jy31Var, Runnable runnable) {
        return new VaultStoreErrorView(context, runnable, jy31Var, this.d, this.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(VaultStoreErrorScreenPayload vaultStoreErrorScreenPayload, ContinuationImpl continuationImpl) {
        VaultStoreErrorViewFactory$initConfiguration$1 vaultStoreErrorViewFactory$initConfiguration$1;
        int i;
        hst hstVar;
        try {
            if (continuationImpl instanceof VaultStoreErrorViewFactory$initConfiguration$1) {
                vaultStoreErrorViewFactory$initConfiguration$1 = (VaultStoreErrorViewFactory$initConfiguration$1) continuationImpl;
                int i2 = vaultStoreErrorViewFactory$initConfiguration$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    vaultStoreErrorViewFactory$initConfiguration$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = vaultStoreErrorViewFactory$initConfiguration$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = vaultStoreErrorViewFactory$initConfiguration$1.label;
                    if (i != 0) {
                        b.b(obj);
                        this.d = vaultStoreErrorScreenPayload;
                        String a = ((m7x0) this.b).a(vaultStoreErrorScreenPayload.c);
                        hst hstVar2 = jst.e;
                        try {
                            g16 b = this.c.b().b(a);
                            vaultStoreErrorViewFactory$initConfiguration$1.L$0 = null;
                            vaultStoreErrorViewFactory$initConfiguration$1.L$1 = null;
                            vaultStoreErrorViewFactory$initConfiguration$1.L$2 = hstVar2;
                            vaultStoreErrorViewFactory$initConfiguration$1.L$3 = this;
                            vaultStoreErrorViewFactory$initConfiguration$1.label = 1;
                            Object a2 = b.a(vaultStoreErrorViewFactory$initConfiguration$1);
                            if (a2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            obj = a2;
                            hstVar = hstVar2;
                        } catch (Throwable th) {
                            th = th;
                            hstVar = hstVar2;
                            hstVar.j(th);
                            return zy11.a;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (a) vaultStoreErrorViewFactory$initConfiguration$1.L$3;
                        hstVar = (hst) vaultStoreErrorViewFactory$initConfiguration$1.L$2;
                        try {
                            b.b(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            hstVar.j(th);
                            return zy11.a;
                        }
                    }
                    this.e = (Bitmap) obj;
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            this.e = (Bitmap) obj;
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
        vaultStoreErrorViewFactory$initConfiguration$1 = new VaultStoreErrorViewFactory$initConfiguration$1(this, continuationImpl);
        Object obj2 = vaultStoreErrorViewFactory$initConfiguration$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = vaultStoreErrorViewFactory$initConfiguration$1.label;
    }
}
