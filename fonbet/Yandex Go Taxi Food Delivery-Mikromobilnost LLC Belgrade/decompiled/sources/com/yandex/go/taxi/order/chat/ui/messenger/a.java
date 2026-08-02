package com.yandex.go.taxi.order.chat.ui.messenger;

import com.yandex.go.messenger_native.api.NativeMessengerAnalyticsFacade$Status;
import com.yandex.go.messenger_native.api.NativeMessengerConnectionStatus;
import defpackage.l3y0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TaxiOrderMessengerPresenter$attachView$$inlined$mapNotNull$1$2$1 taxiOrderMessengerPresenter$attachView$$inlined$mapNotNull$1$2$1;
        int i;
        NativeMessengerAnalyticsFacade$Status nativeMessengerAnalyticsFacade$Status;
        if (continuation instanceof TaxiOrderMessengerPresenter$attachView$$inlined$mapNotNull$1$2$1) {
            taxiOrderMessengerPresenter$attachView$$inlined$mapNotNull$1$2$1 = (TaxiOrderMessengerPresenter$attachView$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = taxiOrderMessengerPresenter$attachView$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderMessengerPresenter$attachView$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = taxiOrderMessengerPresenter$attachView$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderMessengerPresenter$attachView$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    int i3 = l3y0.a[((NativeMessengerConnectionStatus) obj).ordinal()];
                    if (i3 == 1) {
                        nativeMessengerAnalyticsFacade$Status = null;
                    } else if (i3 == 2) {
                        nativeMessengerAnalyticsFacade$Status = NativeMessengerAnalyticsFacade$Status.CONNECTED;
                    } else {
                        if (i3 != 3) {
                            w511.b();
                            return null;
                        }
                        nativeMessengerAnalyticsFacade$Status = NativeMessengerAnalyticsFacade$Status.FAILED;
                    }
                    if (nativeMessengerAnalyticsFacade$Status != null) {
                        taxiOrderMessengerPresenter$attachView$$inlined$mapNotNull$1$2$1.L$0 = null;
                        taxiOrderMessengerPresenter$attachView$$inlined$mapNotNull$1$2$1.L$1 = null;
                        taxiOrderMessengerPresenter$attachView$$inlined$mapNotNull$1$2$1.L$2 = null;
                        taxiOrderMessengerPresenter$attachView$$inlined$mapNotNull$1$2$1.L$3 = null;
                        taxiOrderMessengerPresenter$attachView$$inlined$mapNotNull$1$2$1.L$4 = null;
                        taxiOrderMessengerPresenter$attachView$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(nativeMessengerAnalyticsFacade$Status, taxiOrderMessengerPresenter$attachView$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        taxiOrderMessengerPresenter$attachView$$inlined$mapNotNull$1$2$1 = new TaxiOrderMessengerPresenter$attachView$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = taxiOrderMessengerPresenter$attachView$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderMessengerPresenter$attachView$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
