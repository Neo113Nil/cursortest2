package xsna;

import android.content.Context;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.dialogssearch.impl.di.ChannelSearchListComponentImpl;
import com.vk.ecomm.market.impl.di.MarketInternalComponent;
import com.vk.im.engine.di.executor.ImCmdDirectExecutorScopedComponentImpl;
import com.vk.im.engine.reporters.performance.events.VkmSuccessRateEventBuilder;
import com.vk.profile.user.impl.di.ProfileOnboardingComponentImpl;
import com.vk.toggle.features.FeedFeatures;
import com.vk.video.music.dialog.impl.di.MusicInVideoDialogComponentImpl;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.InfoBridgeComponentImpl;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.security.SecureRandom;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Pattern;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class l03 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ l03(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Context context;
        io.reactivex.rxjava3.disposables.c subscribe;
        ThreadFactory a;
        int i = 0;
        switch (this.b) {
            case 0:
                o2l.a.getClass();
                return Boolean.valueOf(o2l.b("__dbg_api_cycle_calls", false));
            case 1:
                Preference preference = Preference.a;
                oc0 oc0Var = new oc0(8);
                preference.getClass();
                return Long.valueOf(((Number) oc0Var.invoke(Preference.q())).longValue());
            case 2:
                FeedFeatures feedFeatures = FeedFeatures.DISCOVER_API;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 3:
                return new qp();
            case 4:
                return new kui();
            case 5:
                return new ImCmdDirectExecutorScopedComponentImpl.a();
            case 6:
                qcy<Object>[] qcyVarArr = InfoBridgeComponentImpl.b;
                return ukg.a;
            case 7:
                return asu0.a.c();
            case 8:
                return new ayu();
            case 9:
                return new MarketInternalComponent.a(new xo(), new fz5());
            case 10:
                return Pattern.compile("&(#?[a-zA-Z0-9]+);");
            case 11:
                return new w2n0(VkmSuccessRateEventBuilder.EventName.REACTION_MSG_OPEN);
            case 12:
                VKApplication.a aVar = VKApplication.c;
                nb3 nb3Var = nb3.a;
                boolean z = new SecureRandom().nextInt(50) == 0 || BuildInfo.h();
                io.reactivex.rxjava3.disposables.b bVar = nb3.c;
                context = e43.a;
                if (context == null) {
                    context = null;
                }
                com.vk.metrics.performance.power.a aVar2 = new com.vk.metrics.performance.power.a(context, z, new xa3(i));
                if (z) {
                    io.reactivex.rxjava3.core.q qVar = (io.reactivex.rxjava3.core.q) aVar2.g.getValue();
                    y33 y33Var = new y33(new x33(i));
                    qVar.getClass();
                    subscribe = new io.reactivex.rxjava3.internal.operators.observable.i0(qVar, y33Var).subscribe(new z33(new com.vk.metrics.performance.power.b(1, aVar2, com.vk.metrics.performance.power.a.class, "report", "report(Lcom/vk/metrics/performance/power/PowerConsumptionChecker$Measurement;)V", 0), i), new b43(new a43(0), 0));
                } else {
                    subscribe = EmptyDisposable.INSTANCE;
                }
                bVar.b(subscribe);
                return s3q0.a;
            case 13:
                return new azs0();
            case 14:
                return new ChannelSearchListComponentImpl.a();
            case 15:
                return new MusicInVideoDialogComponentImpl.a();
            case 16:
                return new ProfileOnboardingComponentImpl.a();
            case 17:
                int availableProcessors = Runtime.getRuntime().availableProcessors();
                a = asu0.a.a((r3 & 4) != 0 ? 5 : 10, "vk-fresco_background-scheduled-pool", (r3 & 2) == 0);
                return new sep0(Executors.newScheduledThreadPool(availableProcessors, a));
            case 18:
                return new com.vk.music.track.a();
            case 19:
                return m1u.a("vk-network-api");
            default:
                return new fjt();
        }
    }
}
