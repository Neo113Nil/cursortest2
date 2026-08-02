package com.yandex.go.chargers.qr;

import android.graphics.Rect;
import android.net.Uri;
import defpackage.fgg0;
import defpackage.moa;
import defpackage.poa;
import defpackage.qya;
import defpackage.tje;
import defpackage.tls;
import defpackage.tq9;
import defpackage.tsa;
import defpackage.woa;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class ChargersQrModalView$InnerMvpView$startMlDetection$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        final fgg0 fgg0Var = (fgg0) obj;
        final b bVar = (b) this.receiver;
        final ChargersQrModalView chargersQrModalView = bVar.b;
        chargersQrModalView.post(new Runnable() { // from class: com.yandex.go.chargers.qr.a
            @Override // java.lang.Runnable
            public final void run() {
                woa binding;
                woa binding2;
                woa binding3;
                woa binding4;
                poa poaVar;
                tsa a;
                woa binding5;
                ChargersQrModalView chargersQrModalView2 = ChargersQrModalView.this;
                binding = chargersQrModalView2.getBinding();
                float width = binding.b.getWidth();
                fgg0 fgg0Var2 = fgg0Var;
                float f = width / fgg0Var2.c;
                binding2 = chargersQrModalView2.getBinding();
                float height = binding2.b.getHeight() / fgg0Var2.d;
                Rect rect = fgg0Var2.b;
                int i = (int) (rect.bottom * height);
                float f2 = i;
                binding3 = chargersQrModalView2.getBinding();
                if (f2 > binding3.c.getY()) {
                    return;
                }
                Rect rect2 = new Rect((int) (rect.left * f), (int) (rect.top * height), (int) (rect.right * f), i);
                binding4 = chargersQrModalView2.getBinding();
                if (!binding4.b.getDefaultQrTargetRect().contains(rect2)) {
                    binding5 = chargersQrModalView2.getBinding();
                    if (!binding5.b.isQrRectGrabbed()) {
                        return;
                    }
                }
                poaVar = chargersQrModalView2.chargersQrPresenter;
                Uri uri = fgg0Var2.a;
                int i2 = bVar.a;
                rect2.set(rect2.left - i2, rect2.top - i2, rect2.right + i2, rect2.bottom + i2);
                tje.N(poaVar.Jg(), null, null, new ChargersQrPresenter$onNewQr$1(poaVar, rect2, null), 3);
                qya qyaVar = poaVar.A;
                qyaVar.getClass();
                if (qya.c(uri)) {
                    a = new tsa("", "", uri.toString());
                } else {
                    tq9 e = qyaVar.e(uri);
                    a = e != null ? qya.a(e) : new tsa("", "", uri.toString());
                }
                if (a == null) {
                    return;
                }
                ((moa) poaVar.Dg()).p0();
                tje.N(poaVar.Jg(), null, null, new ChargersQrPresenter$onNewQr$2(poaVar, a, null), 3);
            }
        });
        return zy11.a;
    }
}
