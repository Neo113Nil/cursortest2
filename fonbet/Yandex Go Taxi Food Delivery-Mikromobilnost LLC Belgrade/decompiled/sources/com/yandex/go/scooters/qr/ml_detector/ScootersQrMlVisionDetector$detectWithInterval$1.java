package com.yandex.go.scooters.qr.ml_detector;

import android.media.Image;
import defpackage.fgg0;
import defpackage.hst;
import defpackage.jst;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class ScootersQrMlVisionDetector$detectWithInterval$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Pair pair = (Pair) obj;
        a aVar = (a) this.receiver;
        aVar.getClass();
        Image image = (Image) pair.getFirst();
        int intValue = ((Number) pair.getSecond()).intValue();
        try {
            tls tlsVar = aVar.b;
            fgg0 n = aVar.a.n(image, intValue);
            if (n != null) {
                tlsVar.invoke(n);
            }
        } catch (Throwable th) {
            hst hstVar = jst.e;
            String message = th.getMessage();
            if (message == null) {
                message = "Error occurred while scanning scooters QR";
            }
            hstVar.k(th, message);
        }
        return zy11.a;
    }
}
