package xsna;

import com.vk.donut.video.impl.di.DonutVideoComponentImpl;
import com.vk.ecomm.products_multipicker.impl.di.ProductsMultipickerComponentImpl;
import com.vk.im.engine.di.executor.ImCmdDirectExecutorComponentImpl;
import com.vk.im.engine.reporters.performance.events.VkmSuccessRateEventBuilder;
import com.vk.sharing.im_engine_impl.di.SharingImEngineScopedComponentImpl;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import com.vk.toggle.data.BucketPriorityConfig;
import com.vk.voip.stereo.stub.room.di.VoipStereoComponentStub;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.BridgeComponentImpl;
import com.vkontakte.android.task.di.components.LinksBridgeComponentImpl;
import com.vkontakte.android.task.di.components.SuperAppBridgeComponentImpl;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.Regex;
import xsna.r360;
import xsna.sl8;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class pb8 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ pb8(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Object cllVar;
        switch (this.b) {
            case 0:
                qcy<Object>[] qcyVarArr = BridgeComponentImpl.I;
                return z6u0.a;
            case 1:
                com.vkontakte.android.data.b.h().a.getClass();
                Regex regex = com.vk.core.files.a.a;
                File[] fileArr = {new File(e43.a.getFilesDir(), com.vkontakte.android.data.b.j("analytics.log")), new File(e43.a.getFilesDir(), com.vkontakte.android.data.b.j("analytics_collapsed.log")), new File(e43.a.getFilesDir(), com.vkontakte.android.data.b.j("analytics_events.log")), new File(e43.a.getFilesDir(), com.vkontakte.android.data.b.j("analytics_corrupted_events.log"))};
                long j = 0;
                for (int i = 0; i < 4; i++) {
                    j += com.vk.core.files.a.I(fileArr[i]);
                }
                return Long.valueOf(j);
            case 2:
                qcy<Object>[] qcyVarArr2 = ImCmdDirectExecutorComponentImpl.b;
                a1w a1wVar = q1w.a;
                if (a1wVar == null) {
                    a1wVar = null;
                }
                return new jzv(a1wVar);
            case 3:
                return new SharingImEngineScopedComponentImpl.a();
            case 4:
                ggv k = com.vk.toggle.d.k();
                if (k.a) {
                    return new dgv(k.b, k.c);
                }
                BucketPriorityConfig d = com.vk.toggle.d.d();
                if (d.a) {
                    int i2 = sl8.d;
                    sl8 a = sl8.a.a(d.b);
                    int i3 = r360.b.$EnumSwitchMapping$0[d.d.ordinal()];
                    if (i3 == 1) {
                        cllVar = new hjq(a);
                    } else if (i3 == 2) {
                        cllVar = new c0l0(a);
                    } else {
                        if (i3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cllVar = new d0l0(a);
                    }
                } else {
                    cllVar = new cll(new jbw(5), new p360(), false);
                }
                return cllVar;
            case 5:
                return e43.l(new Regex(".*/video/?.*/history"), new Regex(".*/video/?.*/liked"), new Regex(".*/video/?.*/bookmarks"));
            case 6:
                return new ProductsMultipickerComponentImpl.a();
            case 7:
                return new t2n0(VkmSuccessRateEventBuilder.EventName.CHAT_UPDATING);
            case 8:
                return "";
            case 9:
                VKApplication.a aVar = VKApplication.c;
                return (SessionManagementComponent) m7m.e().a(fpf0.a(SessionManagementComponent.class));
            case 10:
                return new LinksBridgeComponentImpl.a();
            case 11:
                return new DonutVideoComponentImpl.a();
            case 12:
                return new SuperAppBridgeComponentImpl.a();
            case 13:
                return asu0.r;
            case 14:
                return new VoipStereoComponentStub.a();
            default:
                return new php0();
        }
    }

    public /* synthetic */ pb8(VKApplication vKApplication) {
        this.b = 9;
    }
}
