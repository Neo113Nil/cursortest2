package com.yandex.go.taxi.order.tipssuggest.domain;

import com.yandex.go.feedback_common.data.FeedbackApi;
import com.yandex.go.feedback_common.data.model.UpdateTipsParams;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.net.dto.objects.Tips;
import defpackage.a20;
import defpackage.a3y0;
import defpackage.b20;
import defpackage.cmt;
import defpackage.fn21;
import defpackage.hst;
import defpackage.jst;
import defpackage.n20;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes14.dex */
public final class a extends a20 {
    public final FeedbackApi c;
    public final fn21 d;
    public final b20 e;
    public final n20 f;
    public final a3y0 g = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "TipsUpdater");

    public a(FeedbackApi feedbackApi, fn21 fn21Var, b20 b20Var, n20 n20Var) {
        this.c = feedbackApi;
        this.d = fn21Var;
        this.e = b20Var;
        this.f = n20Var;
        b20Var.e = this;
    }

    @Override // defpackage.a20
    public final String a() {
        return "tips";
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.a20
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, Tips tips, ContinuationImpl continuationImpl) {
        TipsUpdaterImpl$update$1 tipsUpdaterImpl$update$1;
        int i;
        if (continuationImpl instanceof TipsUpdaterImpl$update$1) {
            tipsUpdaterImpl$update$1 = (TipsUpdaterImpl$update$1) continuationImpl;
            int i2 = tipsUpdaterImpl$update$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tipsUpdaterImpl$update$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tipsUpdaterImpl$update$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tipsUpdaterImpl$update$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return zy11Var;
                }
                b.b(obj);
                String Hg = ((h) this.d).Hg();
                if (Hg != null) {
                    cmt<zy11> a = this.c.a(new UpdateTipsParams(Hg, str, tips));
                    tipsUpdaterImpl$update$1.L$0 = null;
                    tipsUpdaterImpl$update$1.L$1 = null;
                    tipsUpdaterImpl$update$1.L$2 = null;
                    tipsUpdaterImpl$update$1.L$3 = null;
                    tipsUpdaterImpl$update$1.label = 1;
                    if (ru.yandex.taxi.network.api.a.a(a, null, tipsUpdaterImpl$update$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        tipsUpdaterImpl$update$1 = new TipsUpdaterImpl$update$1(this, continuationImpl);
        Object obj2 = tipsUpdaterImpl$update$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tipsUpdaterImpl$update$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }

    public final void f(String str, Tips tips) {
        this.g.getClass();
        a3y0.h(new String[]{"updateTipsForOrder"});
        hst hstVar = jst.e;
        this.e.a(tips, str);
    }

    public final void g(Tips tips) {
        List l = ((com.yandex.go.taxi.order.provider.a) this.f).l();
        ArrayList arrayList = new ArrayList();
        for (Object obj : l) {
            if (((o2y0) obj).e()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f(((o2y0) it.next()).b().a, tips);
        }
    }
}
