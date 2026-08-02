package com.yandex.go.masstransit.sdk.camera.ml;

import android.media.Image;
import defpackage.ggg0;
import defpackage.tls;
import defpackage.vby;
import defpackage.xby;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class QrMlVisionDetector$detectWithInterval$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Pair pair = (Pair) obj;
        c cVar = (c) this.receiver;
        cVar.getClass();
        Image image = (Image) pair.getFirst();
        int intValue = ((Number) pair.getSecond()).intValue();
        try {
            tls tlsVar = cVar.b;
            ggg0 a = cVar.a.a(image, intValue);
            if (a != null) {
                tlsVar.invoke(a);
            }
        } catch (Throwable th) {
            vby vbyVar = xby.d;
            String message = th.getMessage();
            if (message == null) {
                message = "Error occurred while scanning scooters QR";
            }
            vbyVar.k(th, message);
        }
        return zy11.a;
    }
}
