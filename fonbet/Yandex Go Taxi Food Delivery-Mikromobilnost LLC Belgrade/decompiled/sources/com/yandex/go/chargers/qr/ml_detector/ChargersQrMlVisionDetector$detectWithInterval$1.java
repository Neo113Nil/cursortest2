package com.yandex.go.chargers.qr.ml_detector;

import android.media.Image;
import defpackage.aye0;
import defpackage.fgg0;
import defpackage.hst;
import defpackage.jst;
import defpackage.k421;
import defpackage.sk7;
import defpackage.tls;
import defpackage.tst;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.vendor_api.google.b;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class ChargersQrMlVisionDetector$detectWithInterval$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        tls tlsVar;
        sk7 sk7Var;
        Pair pair = (Pair) obj;
        a aVar = (a) this.receiver;
        aVar.getClass();
        Image image = (Image) pair.getFirst();
        int intValue = ((Number) pair.getSecond()).intValue();
        try {
            tlsVar = aVar.b;
            sk7Var = aVar.a;
        } catch (Throwable th) {
            hst hstVar = jst.e;
            String message = th.getMessage();
            if (message == null) {
                message = "Error occurred while scanning scooters QR";
            }
            hstVar.k(th, message);
        }
        if (!((b) ((tst) sk7Var.b)).b()) {
            ((k421) sk7Var.c).getClass();
            throw new IllegalStateException("QR recognition is failed because no vendors are available");
        }
        fgg0 fgg0Var = (fgg0) kotlin.collections.a.R(((aye0) sk7Var.w).l(image, intValue));
        if (fgg0Var != null) {
            tlsVar.invoke(fgg0Var);
        }
        return zy11.a;
    }
}
