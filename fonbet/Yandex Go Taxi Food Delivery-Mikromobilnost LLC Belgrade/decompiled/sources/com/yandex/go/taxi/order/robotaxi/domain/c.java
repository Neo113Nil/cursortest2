package com.yandex.go.taxi.order.robotaxi.domain;

import android.graphics.drawable.BitmapDrawable;
import com.yandex.go.agreement.api.trackable.network.TrackableAcceptanceActionParam;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.robotaxi.ui.RobotaxiModalViewPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1;
import defpackage.a3y0;
import defpackage.hvk0;
import defpackage.ief;
import defpackage.irs0;
import defpackage.ny61;
import defpackage.pkf;
import defpackage.qvk0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.z1y0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class c {
    public final tt2 a;
    public final irs0 b;
    public final e c;
    public final z1y0 d;
    public final com.yandex.go.agreement.trackable.repository.a e;
    public final hvk0 f;
    public final a3y0 g = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "RobotaxiInteractor");

    public c(tt2 tt2Var, irs0 irs0Var, e eVar, z1y0 z1y0Var, com.yandex.go.agreement.trackable.repository.a aVar, hvk0 hvk0Var) {
        this.a = tt2Var;
        this.b = irs0Var;
        this.c = eVar;
        this.d = z1y0Var;
        this.e = aVar;
        this.f = hvk0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(c cVar, String str, ContinuationImpl continuationImpl) {
        RobotaxiInteractor$loadImage$1 robotaxiInteractor$loadImage$1;
        int i;
        BitmapDrawable bitmapDrawable;
        cVar.getClass();
        if (continuationImpl instanceof RobotaxiInteractor$loadImage$1) {
            robotaxiInteractor$loadImage$1 = (RobotaxiInteractor$loadImage$1) continuationImpl;
            int i2 = robotaxiInteractor$loadImage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                robotaxiInteractor$loadImage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = robotaxiInteractor$loadImage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = robotaxiInteractor$loadImage$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = cVar.c;
                    robotaxiInteractor$loadImage$1.L$0 = str;
                    robotaxiInteractor$loadImage$1.label = 1;
                    obj = e.k(eVar, str, null, robotaxiInteractor$loadImage$1, 14);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) robotaxiInteractor$loadImage$1.L$0;
                    kotlin.b.b(obj);
                }
                bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable == null) {
                    return pkf.g(bitmapDrawable, str, null);
                }
                return null;
            }
        }
        robotaxiInteractor$loadImage$1 = new RobotaxiInteractor$loadImage$1(cVar, continuationImpl);
        Object obj2 = robotaxiInteractor$loadImage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = robotaxiInteractor$loadImage$1.label;
        if (i != 0) {
        }
        bitmapDrawable = (BitmapDrawable) obj2;
        if (bitmapDrawable == null) {
        }
    }

    public final void a(TrackableAcceptanceActionParam.Status status, String str, String str2, String str3) {
        this.e.a(new TrackableAcceptanceActionParam(status, str2, str, str3), new RobotaxiInteractor$acceptAgreement$1(this, null));
    }

    public final Object c(qvk0 qvk0Var, ief iefVar, RobotaxiModalViewPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1 robotaxiModalViewPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1) {
        this.a.getClass();
        return tje.k0(uyj.a, new RobotaxiInteractor$uiStateFlow$2(this, qvk0Var, iefVar, null), robotaxiModalViewPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1);
    }
}
