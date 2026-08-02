package xsna;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.core.r;
import xsna.epx;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class pzn implements io.reactivex.rxjava3.core.s, io.reactivex.rxjava3.functions.l {
    public final /* synthetic */ Object b;

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        ((v1w) this.b).invoke(obj);
        return Boolean.FALSE;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.BroadcastReceiver, com.vk.catalog2.common.ui.mvp.video.donut.DonutEventObserver$observeDonutSubscriptionChange$1$receiver$1] */
    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(final io.reactivex.rxjava3.core.r rVar) {
        final Context context = (Context) this.b;
        final ?? r1 = new BroadcastReceiver() { // from class: com.vk.catalog2.common.ui.mvp.video.donut.DonutEventObserver$observeDonutSubscriptionChange$1$receiver$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context2, Intent intent) {
                Parcelable parcelable;
                r<UserId> rVar2;
                Object parcelableExtra;
                if (epx.f(intent.getAction(), "com.vkontakte.android.DONUT_SUBSCRIPTION_PAID")) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelableExtra = intent.getParcelableExtra("id", UserId.class);
                        parcelable = (Parcelable) parcelableExtra;
                    } else {
                        Parcelable parcelableExtra2 = intent.getParcelableExtra("id");
                        if (!(parcelableExtra2 instanceof UserId)) {
                            parcelableExtra2 = null;
                        }
                        parcelable = (UserId) parcelableExtra2;
                    }
                    UserId userId = (UserId) parcelable;
                    if (userId == null || (rVar2 = rVar) == null) {
                        return;
                    }
                    rVar2.onNext(userId);
                }
            }
        };
        anj.d(context, r1, z23.a("com.vkontakte.android.DONUT_SUBSCRIPTION_PAID"), hf8.a, 4);
        if (rVar != null) {
            rVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.qzn
                @Override // io.reactivex.rxjava3.functions.e
                public final void cancel() {
                    enj.s(context, r1);
                }
            });
        }
    }
}
