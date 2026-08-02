package xsna;

import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseQueueEventDto;
import com.vk.dto.attaches.Attach;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.superapp.api.dto.menu.WidgetIds;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduledCallDuration;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import xsna.fxw0;
import xsna.knx0;
import xsna.pwg0;
import xsna.tww0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class uww0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uww0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object failure;
        Object failure2;
        Object failure3;
        switch (this.b) {
            case 0:
                tww0 tww0Var = (tww0) this.c;
                fxw0.a aVar = (fxw0.a) obj;
                long j = aVar.e;
                tww0.d dVar = (tww0.d) tww0Var;
                VoipScheduledCallDuration voipScheduledCallDuration = dVar.b;
                VoipScheduledCallDuration voipScheduledCallDuration2 = VoipScheduledCallDuration.DAY;
                if (voipScheduledCallDuration == voipScheduledCallDuration2) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(j);
                    calendar.set(11, 0);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                    j = calendar.getTime().getTime();
                } else if (aVar.g == voipScheduledCallDuration2.h()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long millis = TimeUnit.MINUTES.toMillis(30L);
                    j = currentTimeMillis + (millis - (currentTimeMillis % millis));
                }
                return fxw0.a.a(aVar, null, null, j, dVar.b.h(), null, null, null, null, false, false, false, false, false, null, null, null, null, false, null, null, false, false, 33554391);
            case 1:
                fpx0 fpx0Var = (fpx0) this.c;
                SuperAppShowcaseQueueEventDto superAppShowcaseQueueEventDto = (SuperAppShowcaseQueueEventDto) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"EventFired: event=" + superAppShowcaseQueueEventDto});
                }
                pwg0.a aVar2 = fpx0Var.c;
                if (superAppShowcaseQueueEventDto instanceof SuperAppShowcaseQueueEventDto.SuperAppShowcaseHideEventDto) {
                    aVar2.b(((SuperAppShowcaseQueueEventDto.SuperAppShowcaseHideEventDto) superAppShowcaseQueueEventDto).d());
                } else {
                    if (superAppShowcaseQueueEventDto instanceof SuperAppShowcaseQueueEventDto.SuperAppShowcaseShowEventDto) {
                        SuperAppShowcaseQueueEventDto.SuperAppShowcaseShowEventDto superAppShowcaseShowEventDto = (SuperAppShowcaseQueueEventDto.SuperAppShowcaseShowEventDto) superAppShowcaseQueueEventDto;
                        try {
                            failure3 = new knx0(wan0.a(superAppShowcaseShowEventDto.e(), superAppShowcaseShowEventDto.d(), superAppShowcaseShowEventDto.g())).i(superAppShowcaseShowEventDto.f());
                        } catch (Throwable th) {
                            failure3 = new Result.Failure(th);
                        }
                        SuperAppWidget superAppWidget = (SuperAppWidget) (failure3 instanceof Result.Failure ? null : failure3);
                        if (superAppWidget != null) {
                            aVar2.f(superAppWidget);
                        }
                    } else if (superAppShowcaseQueueEventDto instanceof SuperAppShowcaseQueueEventDto.SuperAppShowcaseRerenderEventDto) {
                        SuperAppShowcaseQueueEventDto.SuperAppShowcaseRerenderEventDto superAppShowcaseRerenderEventDto = (SuperAppShowcaseQueueEventDto.SuperAppShowcaseRerenderEventDto) superAppShowcaseQueueEventDto;
                        try {
                            failure2 = new knx0(wan0.a(superAppShowcaseRerenderEventDto.e(), superAppShowcaseRerenderEventDto.d(), superAppShowcaseRerenderEventDto.i())).k(new knx0.a(new WidgetIds(superAppShowcaseRerenderEventDto.f(), 0, "", "")), superAppShowcaseRerenderEventDto.g());
                        } catch (Throwable th2) {
                            failure2 = new Result.Failure(th2);
                        }
                        SuperAppWidget superAppWidget2 = (SuperAppWidget) (failure2 instanceof Result.Failure ? null : failure2);
                        if (superAppWidget2 != null) {
                            aVar2.a(superAppWidget2);
                        }
                    } else {
                        if (!(superAppShowcaseQueueEventDto instanceof SuperAppShowcaseQueueEventDto.SuperAppShowcaseRerenderInnerEventDto)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        SuperAppShowcaseQueueEventDto.SuperAppShowcaseRerenderInnerEventDto superAppShowcaseRerenderInnerEventDto = (SuperAppShowcaseQueueEventDto.SuperAppShowcaseRerenderInnerEventDto) superAppShowcaseQueueEventDto;
                        try {
                            failure = new knx0(wan0.a(superAppShowcaseRerenderInnerEventDto.f(), superAppShowcaseRerenderInnerEventDto.d(), superAppShowcaseRerenderInnerEventDto.j())).j(new knx0.a(new WidgetIds(superAppShowcaseRerenderInnerEventDto.e(), 0, "", "")), superAppShowcaseRerenderInnerEventDto.i());
                        } catch (Throwable th3) {
                            failure = new Result.Failure(th3);
                        }
                        enx0 enx0Var = (enx0) (failure instanceof Result.Failure ? null : failure);
                        if (enx0Var != null) {
                            aVar2.d(superAppShowcaseRerenderInnerEventDto.g(), enx0Var);
                        }
                    }
                }
                return s3q0.a;
            default:
                return Boolean.valueOf(((Attach) obj).xb() == ((Attach) this.c).xb());
        }
    }

    public /* synthetic */ uww0(www0 www0Var, tww0 tww0Var) {
        this.b = 0;
        this.c = tww0Var;
    }
}
