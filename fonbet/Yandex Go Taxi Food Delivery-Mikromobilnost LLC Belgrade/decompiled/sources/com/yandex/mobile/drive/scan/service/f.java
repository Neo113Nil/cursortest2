package com.yandex.mobile.drive.scan.service;

import android.graphics.Bitmap;
import com.yandex.mobile.drive.scan.ui.ScanMeta;
import defpackage.am31;
import defpackage.gw00;
import defpackage.h2b1;
import defpackage.irb0;
import defpackage.ny61;
import defpackage.qgn0;
import defpackage.tk31;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class f {
    public final irb0 a;
    public final List b;
    public int c;

    public f(irb0 irb0Var, ArrayList arrayList) {
        this.a = irb0Var;
        this.b = arrayList;
    }

    public final ScanMeta a() {
        return (ScanMeta) this.b.get(this.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Bitmap bitmap, tk31 tk31Var, Integer num, boolean z, ContinuationImpl continuationImpl) {
        ScanManager$processPicture$1 scanManager$processPicture$1;
        int i;
        boolean booleanValue;
        qgn0 qgn0Var;
        if (continuationImpl instanceof ScanManager$processPicture$1) {
            scanManager$processPicture$1 = (ScanManager$processPicture$1) continuationImpl;
            int i2 = scanManager$processPicture$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scanManager$processPicture$1.label = i2 - Integer.MIN_VALUE;
                ScanManager$processPicture$1 scanManager$processPicture$12 = scanManager$processPicture$1;
                Object obj = scanManager$processPicture$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scanManager$processPicture$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ScanMeta a = a();
                    String mode = a.getMode();
                    am31 am31Var = new am31(mode, tk31Var);
                    boolean preCheckPhoto = a.getPreCheckPhoto();
                    boolean z2 = z && a.isSelfie();
                    scanManager$processPicture$12.L$0 = null;
                    scanManager$processPicture$12.L$1 = null;
                    scanManager$processPicture$12.L$2 = null;
                    scanManager$processPicture$12.L$3 = null;
                    scanManager$processPicture$12.L$4 = null;
                    scanManager$processPicture$12.L$5 = null;
                    scanManager$processPicture$12.Z$0 = z;
                    scanManager$processPicture$12.label = 1;
                    obj = this.a.a(mode, bitmap, am31Var, preCheckPhoto, z2, num, scanManager$processPicture$12);
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
                Boolean bool = (Boolean) obj;
                booleanValue = bool.booleanValue();
                Map e = gw00.e(new Pair("success", bool));
                qgn0Var = h2b1.c;
                if (qgn0Var != null) {
                    qgn0Var.n("debug_video_frames_processed", e);
                }
                if (booleanValue) {
                    this.c++;
                }
                return obj;
            }
        }
        scanManager$processPicture$1 = new ScanManager$processPicture$1(this, continuationImpl);
        ScanManager$processPicture$1 scanManager$processPicture$122 = scanManager$processPicture$1;
        Object obj2 = scanManager$processPicture$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scanManager$processPicture$122.label;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) obj2;
        booleanValue = bool2.booleanValue();
        Map e2 = gw00.e(new Pair("success", bool2));
        qgn0Var = h2b1.c;
        if (qgn0Var != null) {
        }
        if (booleanValue) {
        }
        return obj2;
    }
}
