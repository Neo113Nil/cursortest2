package xsna;

import com.vk.api.generated.videoChannels.dto.VideoChannelsGetViewSettingsResponseDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.libvideo.api.Subscription;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import kotlin.NoWhenBranchMatchedException;
import xsna.q9v0;
import xsna.wit0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class zas0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zas0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        VideoNotificationsStatus videoNotificationsStatus;
        int i = this.b;
        int i2 = 7;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((e1) obj2).invoke(Boolean.valueOf(epx.f((String) obj3, ((VideoChannelsGetViewSettingsResponseDto) obj).d())));
                return s3q0.a;
            case 1:
                UserId userId = (UserId) obj2;
                Subscription subscription = (Subscription) obj;
                io.reactivex.rxjava3.internal.operators.observable.j1 f = ((wit0) obj3).f(userId);
                boolean z = subscription instanceof Subscription.Subscribed;
                io.reactivex.rxjava3.core.q s = io.reactivex.rxjava3.core.q.s(io.reactivex.rxjava3.core.q.T(Boolean.valueOf(z)), f);
                s.getClass();
                a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
                b.a aVar = io.reactivex.rxjava3.internal.functions.b.a;
                io.reactivex.rxjava3.internal.operators.observable.y yVar = new io.reactivex.rxjava3.internal.operators.observable.y(s, qVar, aVar);
                io.reactivex.rxjava3.internal.operators.observable.j1 a = tys0.a(userId);
                if (z) {
                    int i3 = wit0.a.$EnumSwitchMapping$2[((Subscription.Subscribed) subscription).a.ordinal()];
                    if (i3 == 1) {
                        videoNotificationsStatus = VideoNotificationsStatus.ALL;
                    } else if (i3 == 2) {
                        videoNotificationsStatus = VideoNotificationsStatus.PREFERRED;
                    } else {
                        if (i3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        videoNotificationsStatus = VideoNotificationsStatus.NONE;
                    }
                } else {
                    videoNotificationsStatus = VideoNotificationsStatus.PREFERRED;
                }
                if (videoNotificationsStatus == null) {
                    videoNotificationsStatus = VideoNotificationsStatus.PREFERRED;
                }
                io.reactivex.rxjava3.core.q<U> p0 = a.p0(videoNotificationsStatus);
                p0.getClass();
                return io.reactivex.rxjava3.core.q.m(yVar, new io.reactivex.rxjava3.internal.operators.observable.y(p0, qVar, aVar), new xhb0(new t8c(i2), 15));
            case 2:
                myc0.h((yvj) obj3, null, null, new q9v0.a((z4p0) obj, (wh50) obj2, null), 3);
                return s3q0.a;
            default:
                e5y0 e5y0Var = (e5y0) obj3;
                e5y0Var.b((gv50) obj2, new uxb(e5y0Var, 12), new u5u0(7));
                return s3q0.a;
        }
    }
}
