package xsna;

import com.vk.debug.internal.ApiResponseMocks;
import com.vk.donut.price.impl.di.DonutPriceComponentImpl;
import com.vk.ecomm.products_selection.impl.di.ProductsSelectionComponentImpl;
import com.vk.emailactualization.api.di.EmailActualizationComponent;
import com.vk.im.engine.reporters.performance.events.VkmSuccessRateEventBuilder;
import com.vk.messagetemplates.impl.di.TemplatesComponentImpl;
import com.vk.overlaymenu.di.OverlayMenuComponentImpl;
import com.vk.registration.funnels.di.SakAnalyticsComponentImpl;
import com.vk.superapp.vkworkout.di.VkWorkoutComponentImpl;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.stereo.stub.join.di.VoipStereoJoinComponentStub;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.BridgeComponentImpl;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.l55;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b55 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ b55(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((EmailActualizationComponent) ((k7m) m7m.f(new l55.c())).a(fpf0.a(EmailActualizationComponent.class))).a();
            case 1:
                qcy<Object>[] qcyVarArr = BridgeComponentImpl.I;
                return new uau0();
            case 2:
                tw8 tw8Var = com.vk.core.util.state.a.b;
                pgn pgnVar = (pgn) tw8Var.c;
                synchronized (pgnVar) {
                    ((ArrayList) pgnVar.b).clear();
                }
                fwk fwkVar = (fwk) tw8Var.b;
                fwkVar.getClass();
                io.reactivex.rxjava3.internal.operators.observable.m1 a0 = new io.reactivex.rxjava3.internal.operators.observable.s0(new cwk(fwkVar, 0)).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
                int i = kwg0.a;
                a0.subscribe(new iwg0(), new hwg0());
                return s3q0.a;
            case 3:
                return Boolean.valueOf(new File("/system/framework/flyme-framework.jar").exists());
            case 4:
                return new TemplatesComponentImpl.a();
            case 5:
                if (!r360.e()) {
                    return EmptyList.b;
                }
                ApiResponseMocks.a.getClass();
                List a = ApiResponseMocks.a();
                ArrayList arrayList = new ArrayList();
                for (Object obj : a) {
                    ApiResponseMocks.Mock mock = (ApiResponseMocks.Mock) obj;
                    if (!drm0.N(mock.a()) && !drm0.N(mock.c())) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ApiResponseMocks.Mock mock2 = (ApiResponseMocks.Mock) it.next();
                    arrayList2.add(new c03(mock2.a(), mock2.b(), mock2.d()));
                }
                return arrayList2;
            case 6:
                qcy<Object>[] qcyVarArr2 = SakAnalyticsComponentImpl.f;
                return new obp();
            case 7:
                return new ProductsSelectionComponentImpl.a();
            case 8:
                return new g2n0(VkmSuccessRateEventBuilder.EventName.SHOW_ATTACHMENT);
            case 9:
                VKApplication.a aVar = VKApplication.c;
                return m7m.e();
            case 10:
                xbp0 xbp0Var = new xbp0();
                new bpn0(new wb3(5));
                new bpn0(new xb3(11));
                new bpn0(new xh6(13));
                return xbp0Var;
            case 11:
                return Boolean.valueOf(fxc0.B().J().P0());
            case 12:
                return new OverlayMenuComponentImpl.a();
            case 13:
                return new DonutPriceComponentImpl.a();
            case 14:
                return new VkWorkoutComponentImpl.a();
            case 15:
                return new uvv();
            case 16:
                return new VoipStereoJoinComponentStub.a();
            case 17:
                OKVoipEngine oKVoipEngine = com.vk.voip.ui.c.r;
                com.vk.voip.ui.c.b.getClass();
                return new dwe0(oKVoipEngine, com.vk.voip.ui.c.F());
            default:
                return rgr0.a;
        }
    }

    public /* synthetic */ b55(Object obj, int i) {
        this.b = i;
    }
}
