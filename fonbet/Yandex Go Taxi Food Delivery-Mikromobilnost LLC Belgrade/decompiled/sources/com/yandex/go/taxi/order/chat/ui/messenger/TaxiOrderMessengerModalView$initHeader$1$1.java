package com.yandex.go.taxi.order.chat.ui.messenger;

import com.yandex.go.messenger_native.api.NativeMessengerAnalyticsFacade$Reason;
import com.yandex.go.messenger_native.api.NativeMessengerAnalyticsFacade$Service;
import defpackage.k3y0;
import defpackage.l3y0;
import defpackage.m3y0;
import defpackage.n3y0;
import defpackage.sls;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.messenger.domain.WebMessengerAnalyticsFacade$Reason;
import ru.yandex.taxi.messenger.domain.WebMessengerAnalyticsFacade$Service;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* synthetic */ class TaxiOrderMessengerModalView$initHeader$1$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        m3y0 m3y0Var = (m3y0) this.receiver;
        n3y0 n3y0Var = m3y0Var.D;
        int i = l3y0.b[m3y0Var.F.ordinal()];
        if (i == 1) {
            m3y0Var.B.a(NativeMessengerAnalyticsFacade$Service.TAXI, n3y0Var.b, NativeMessengerAnalyticsFacade$Reason.CLOSE_TAPPED);
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            m3y0Var.C.b(WebMessengerAnalyticsFacade$Service.TAXI, n3y0Var.b, WebMessengerAnalyticsFacade$Reason.CLOSE_TAPPED);
        }
        ((k3y0) m3y0Var.Dg()).close();
        return zy11.a;
    }
}
