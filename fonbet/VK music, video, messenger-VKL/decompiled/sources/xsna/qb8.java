package xsna;

import android.os.Looper;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.vk.donut.video.subscription.impl.di.DonutSubscriptionVideoComponentImpl;
import com.vk.ecomm.avito.impl.di.MarketAvitoComponentImpl;
import com.vk.im.chat.restriction.impl.di.ChatWriteRestrictionFeatureComponentImpl;
import com.vk.im.engine.reporters.performance.events.VkmSuccessRateEventBuilder;
import com.vk.music.onboarding.impl.di.MusicOnboardingComponentImpl;
import com.vk.story.viewer.impl.di.StoryViewerComponentImpl;
import com.vk.superapp.multiaccount.api.MultiAccountComponent;
import com.vk.superapp.vkworkout.widget.impl.di.VkWorkoutWidgetComponentImpl;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.data.b;
import com.vkontakte.android.task.di.components.BridgeComponentImpl;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.o;
import xsna.p2i0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class qb8 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ qb8(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                qcy<Object>[] qcyVarArr = BridgeComponentImpl.I;
                return pdv0.a;
            case 1:
                b.i iVar = com.vkontakte.android.data.b.h().a;
                iVar.getClass();
                com.vkontakte.android.data.b.h().b.execute(new xzl(iVar));
                return s3q0.a;
            case 2:
                return new svo();
            case 3:
                return new ChatWriteRestrictionFeatureComponentImpl.a();
            case 4:
                qcy<Object>[] qcyVarArr2 = MusicOnboardingComponentImpl.b;
                return new dr40();
            case 5:
                List<String> list = p2i0.b;
                return p2i0.a.a(Collections.singleton(CommonConstant.KEY_ACCESS_TOKEN));
            case 6:
                return new bss();
            case 7:
                return new MarketAvitoComponentImpl.a();
            case 8:
                qcy<Object>[] qcyVarArr3 = StoryViewerComponentImpl.s;
                return new w2m0();
            case 9:
                return new t2n0(VkmSuccessRateEventBuilder.EventName.LITE_SYNC);
            case 10:
                return null;
            case 11:
                VKApplication.a aVar = VKApplication.c;
                return (MultiAccountComponent) m7m.e().a(fpf0.a(MultiAccountComponent.class));
            case 12:
                return new DonutSubscriptionVideoComponentImpl.a();
            case 13:
                return new VkWorkoutWidgetComponentImpl.a();
            case 14:
                return io.reactivex.rxjava3.android.schedulers.a.a(Looper.getMainLooper());
            case 15:
                return sgr0.a;
            default:
                o.a aVar2 = new o.a();
                aVar2.c(2000L, TimeUnit.MILLISECONDS);
                aVar2.c.add(dmx0.e);
                return new okhttp3.o(aVar2);
        }
    }

    public /* synthetic */ qb8(VKApplication vKApplication) {
        this.b = 11;
    }
}
