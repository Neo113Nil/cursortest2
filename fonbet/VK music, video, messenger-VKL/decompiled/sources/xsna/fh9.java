package xsna;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzci;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.vk.api.generated.communitySubscriptions.dto.CommunitySubscriptionsHasActiveSubscriptionSubscriptionNameDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketItemStyle;
import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.mvi.MviLazyViewContainer;
import java.util.concurrent.Callable;
import kotlin.LazyThreadSafetyMode;

/* compiled from: CameraContentStickerDelegate.kt */
/* loaded from: classes16.dex */
public final class fh9 implements e2h0, gd01 {
    public Object b;
    public final Object c;

    public fh9(AppMeasurementDynamiteService appMeasurementDynamiteService, zzci zzciVar) {
        this.c = appMeasurementDynamiteService;
        this.b = zzciVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public jhv a() {
        return (jhv) this.c.getValue();
    }

    public io.reactivex.rxjava3.core.q b(final tam0 tam0Var, final StoryUploadParams storyUploadParams) {
        return new io.reactivex.rxjava3.internal.operators.observable.s0(new Callable() { // from class: xsna.eh9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                u440 u440Var = (u440) fh9.this.c;
                tam0 tam0Var2 = tam0Var;
                StoryUploadParams storyUploadParams2 = storyUploadParams;
                u440Var.C7(tam0Var2, storyUploadParams2, false);
                return storyUploadParams2;
            }
        }).U(new lp0(new jp5(2, this, tam0Var), 9)).t(new ql2(new wq3(6), 6));
    }

    public io.reactivex.rxjava3.internal.operators.single.y c(UserId userId) {
        up2 up2Var = (up2) this.c;
        UserId a = fkq0.a(userId);
        CommunitySubscriptionsHasActiveSubscriptionSubscriptionNameDto communitySubscriptionsHasActiveSubscriptionSubscriptionNameDto = CommunitySubscriptionsHasActiveSubscriptionSubscriptionNameDto.PIN_REVIEW;
        up2Var.getClass();
        tfx tfxVar = new tfx("communitySubscriptions.hasActiveSubscription", new lr(11), new pn(12));
        tfx.n(tfxVar, "community_id", a, 0L, 0L, 12);
        tfx.o(tfxVar, "subscription_name", communitySubscriptionsHasActiveSubscriptionSubscriptionNameDto.i(), 0, 0, 12);
        return rsg0.w0(yfb.x(tfxVar)).l(new vx6(new kpr(16), 28));
    }

    public io.reactivex.rxjava3.internal.operators.single.y d(UserId userId) {
        yd10 yd10Var = (yd10) this.b;
        UserId a = fkq0.a(userId);
        yd10Var.getClass();
        tfx tfxVar = new tfx("market.hasPinnedCommunityReview", new nr(19), new defpackage.j0(24));
        tfx.n(tfxVar, "community_id", a, 1L, 0L, 8);
        return rsg0.w0(yfb.x(tfxVar)).l(new s41(new per(20), 27));
    }

    public void e(String str, String str2, Bundle bundle, long j) {
        try {
            ((zzci) this.b).zze(str, str2, bundle, j);
        } catch (RemoteException e) {
            mb01 mb01Var = ((AppMeasurementDynamiteService) this.c).a;
            if (mb01Var != null) {
                k901 k901Var = mb01Var.j;
                mb01.k(k901Var);
                k901Var.l.b(e, "Event interceptor threw exception");
            }
        }
    }

    public void f(wp50 wp50Var) {
        wp50Var.c((MviLazyViewContainer) this.b);
        wp50Var.h(new af50(this, 2));
    }

    public io.reactivex.rxjava3.internal.operators.observable.f0 g(int i, UserId userId) {
        yd10 yd10Var = (yd10) this.b;
        UserId a = fkq0.a(userId);
        yd10Var.getClass();
        tfx tfxVar = new tfx("market.pinCommunityReview", new wp(19), new cq(18));
        tfx.n(tfxVar, "community_id", a, 0L, 0L, 12);
        tfx.l(tfxVar, "review_id", i, 0, 0, 12);
        return rsg0.w0(yfb.x(tfxVar));
    }

    @Override // xsna.e2h0
    public Object i(f2h0 f2h0Var, Object obj) {
        return ((wzs) this.b).invoke(f2h0Var, obj);
    }

    @Override // xsna.e2h0
    public Object k(Object obj) {
        return ((izs) this.c).invoke(obj);
    }

    public /* synthetic */ fh9(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    public fh9() {
        this.c = msy.a(LazyThreadSafetyMode.NONE, new com.vk.movika.sdk.base.ui.v(18));
    }

    public fh9(UIBlock uIBlock, Good good, UIBlockMarketItemStyle uIBlockMarketItemStyle, Integer num) {
        this.b = uIBlock;
        this.c = good;
    }

    public fh9(i3a0 i3a0Var, ti20 ti20Var, vi20 vi20Var) {
        uf7 uf7Var = new uf7(ti20Var, vi20Var, new rti());
        this.b = i3a0Var;
        this.c = uf7Var;
    }
}
