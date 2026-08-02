package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown;
import defpackage.csv;
import defpackage.dsv;
import defpackage.esv;
import defpackage.fsv;
import defpackage.fy40;
import defpackage.gsv;
import defpackage.gzz0;
import defpackage.hsv;
import defpackage.jwd0;
import defpackage.k9m;
import defpackage.l9m;
import defpackage.ny61;
import defpackage.pv60;
import defpackage.q5b1;
import defpackage.qje;
import defpackage.s5b1;
import defpackage.t631;
import defpackage.wu60;
import defpackage.xva1;
import defpackage.zls;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public final class p {
    public final k a;
    public IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown b;
    public gsv c;
    public fsv d;
    public esv e;
    public q5b1 f;
    public t631 g;
    public gzz0 i;
    public long h = 9205357640488583168L;
    public final hsv j = new hsv();
    public final pv60 k = new pv60();
    public long l = 0;

    public p(k kVar) {
        this.a = kVar;
    }

    public static void c(p pVar, dsv dsvVar, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        k kVar = pVar.a;
        fsv fsvVar = pVar.d;
        if (fsvVar == null) {
            fsvVar = new fsv();
            fsvVar.a = null;
            fsvVar.b = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
            fsvVar.c = false;
            pVar.d = fsvVar;
        }
        fsvVar.a = dsvVar;
        fsvVar.b = j;
        gzz0 gzz0Var = pVar.i;
        Orientation orientation = kVar.c;
        if (gzz0Var == null) {
            pVar.i = new gzz0(orientation, 2);
        } else {
            gzz0Var.a = orientation;
            gzz0Var.b = j2;
        }
        fsvVar.c = false;
        pVar.f = fsvVar;
    }

    public final void a() {
        IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown = this.b;
        if (indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown == null) {
            indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown = new IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown(0);
            this.b = indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown;
        }
        indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown.a = IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown.AwaitTouchSlop.NotInitialized;
        indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown.b = false;
        this.f = indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown;
    }

    public final void b(dsv dsvVar, long j, gzz0 gzz0Var) {
        esv esvVar = this.e;
        if (esvVar == null) {
            esvVar = new esv();
            esvVar.a = null;
            esvVar.b = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
            this.e = esvVar;
        }
        esvVar.a = dsvVar;
        esvVar.b = j;
        gzz0Var.b = 0L;
        this.f = esvVar;
    }

    public final t631 d() {
        t631 t631Var = this.g;
        if (t631Var != null) {
            return t631Var;
        }
        ny61.g("Velocity Tracker not initialized.");
        return null;
    }

    public final void e(dsv dsvVar, csv csvVar, long j) {
        k kVar = this.a;
        long mo43localToScreenMKHz9U = qje.O(kVar).mo43localToScreenMKHz9U(0L);
        if (!wu60.c(this.h, 9205357640488583168L) && !wu60.c(mo43localToScreenMKHz9U, this.h)) {
            this.l = wu60.f(this.l, wu60.e(mo43localToScreenMKHz9U, this.h));
        }
        this.h = mo43localToScreenMKHz9U;
        Orientation orientation = kVar.c;
        zls zlsVar = l.a;
        if (Math.abs(Float.intBitsToFloat((int) (orientation == Orientation.Vertical ? j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD : j >> 32))) > 2.0f) {
            s5b1.b(d(), dsvVar, kVar.c, csvVar, this.j, this.l);
            pv60 pv60Var = this.k;
            fy40 fy40Var = pv60Var.b;
            int i = fy40Var.b;
            if (i == 3) {
                int i2 = pv60Var.a;
                pv60Var.a = i2 + 1;
                if (i2 < 0 || i2 >= i) {
                    xva1.d("Index must be between 0 and size");
                    throw null;
                }
                long[] jArr = fy40Var.a;
                long j2 = jArr[i2];
                jArr[i2] = j;
            } else {
                fy40Var.a(j);
            }
            if (pv60Var.a == 3) {
                pv60Var.a = 0;
            }
            long[] jArr2 = fy40Var.a;
            int i3 = fy40Var.b;
            float f = 0.0f;
            float f2 = 0.0f;
            for (int i4 = 0; i4 < i3; i4++) {
                f2 += Float.intBitsToFloat((int) (jArr2[i4] >> 32));
            }
            int i5 = fy40Var.b;
            float f3 = f2 / i5;
            long[] jArr3 = fy40Var.a;
            for (int i6 = 0; i6 < i5; i6++) {
                f += Float.intBitsToFloat((int) (jArr3[i6] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
            }
            kVar.P0(new k9m((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f / fy40Var.b) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), true));
        }
    }

    public final void f(dsv dsvVar, dsv dsvVar2, csv csvVar, long j) {
        if (this.g == null) {
            this.g = new t631();
        }
        this.l = 0L;
        t631 d = d();
        k kVar = this.a;
        s5b1.b(d, dsvVar, kVar.c, csvVar, this.j, this.l);
        long e = wu60.e(s5b1.g(dsvVar2, kVar.c, csvVar), j);
        if (((Boolean) kVar.w.invoke(new jwd0(1))).booleanValue()) {
            this.h = qje.O(kVar).mo43localToScreenMKHz9U(0L);
            kVar.P0(new l9m(e));
        }
        pv60 pv60Var = this.k;
        pv60Var.a = 0;
        pv60Var.b.b = 0;
    }
}
