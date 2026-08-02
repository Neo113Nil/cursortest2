package xsna;

import com.vk.catalog.mvi.section.impl.di.CatalogComponentImpl;
import com.vk.core.dynamic_loader.DynamicLib;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.preference.Preference;
import com.vk.ecomm.shop_conditions.impl.di.MarketShopConditionsComponentImpl;
import com.vk.ecomm.verifiedseller.impl.di.VerifiedSellerComponentImpl;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.im.engine.di.executor.ImCmdRxExecutorComponentImpl;
import com.vk.im.engine.reporters.performance.events.VkmSuccessRateEventBuilder;
import com.vk.libvideo.di.VideoPlaybackSpeedComponentImpl;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.phoneactualization.impl.di.PhoneActualizationComponentImpl;
import com.vk.photos.root.di.PhotosComponentImpl;
import com.vk.stat.model.builders.aggregate.AggregateEventBuilder;
import com.vk.stat.model.builders.aggregate.AggregateEventKey;
import com.vk.story.viewer.impl.di.StoryViewerComponentImpl;
import com.vk.superapp.advertisement.di.sticky_banner_ad.StickyBannerAdFactoriesComponentImpl;
import com.vk.voip.api.di.VoipCallComponent;
import com.vk.voip.stereo.stub.roomlist.di.VoipStereoRoomListRouterComponentStub;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.DebugComponentImpl;
import com.vkontakte.android.task.di.components.MenuComponentImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.fqo;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c24 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ c24(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        PrivateFiles.a b;
        switch (this.b) {
            case 0:
                return Boolean.FALSE;
            case 1:
                return io.reactivex.rxjava3.subjects.d.O0(Boolean.TRUE);
            case 2:
                return e43.l("statEvents.addSAKMobile", "statEvents.addSAKMobileAnonymously");
            case 3:
                return new ImCmdRxExecutorComponentImpl.a();
            case 4:
                qcy<Object>[] qcyVarArr = MenuComponentImpl.d;
                return new MenuComponentImpl.b();
            case 5:
                return EmptySet.b;
            case 6:
                return new CatalogComponentImpl.a();
            case 7:
                return Integer.valueOf(com.vk.toggle.d.p().c);
            case 8:
                qcy<Object>[] qcyVarArr2 = PhotosComponentImpl.u;
                return new cda0(f9t.d());
            case 9:
                return new w7k0();
            case 10:
                return new j3d0();
            case 11:
                o260 o260Var = d260.a;
                return (o260Var != null ? o260Var : null).b(NetworkClient.ClientType.CLIENT_DEFAULT);
            case 12:
                return new PhoneActualizationComponentImpl.a();
            case 13:
                fw90 b2 = com.vk.toggle.d.F0.b();
                if (b2 != null) {
                    return new ew90(b2.a, b2.b, b2.c, b2.d, b2.e, b2.f);
                }
                return null;
            case 14:
                return new MarketShopConditionsComponentImpl.a();
            case 15:
                qcy<Object>[] qcyVarArr3 = StoryViewerComponentImpl.s;
                return new t7m0();
            case 16:
                return new t2n0(VkmSuccessRateEventBuilder.EventName.SERVICE_UPDATING);
            case 17:
                VKApplication.a aVar = VKApplication.c;
                int i = fqo.b;
                if (System.currentTimeMillis() - Preference.m(0L, "dyn_modules", "last_report_time_ms") > fqo.a) {
                    Set<String> e = com.vk.core.dynamic_loader.b.e().e();
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.d, new Object[]{"DynamicLibLoader", "Installed dynamic modules: " + e});
                    }
                    zrp<DynamicLib> h = DynamicLib.h();
                    ArrayList arrayList = new ArrayList(c5g.u(h, 10));
                    Iterator<E> it = h.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((DynamicLib) it.next()).i());
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : e) {
                        if (arrayList.contains((String) obj)) {
                            arrayList2.add(obj);
                        }
                    }
                    AggregateEventBuilder aggregateEventBuilder = new AggregateEventBuilder(AggregateEventKey.INSTALLED_DYN_LIBS);
                    for (fqo.a aVar2 : fqo.a.h()) {
                        aggregateEventBuilder.v(aVar2.i(), arrayList2.contains(aVar2.j()) ? 1 : 0);
                    }
                    aggregateEventBuilder.q();
                    Preference.F(System.currentTimeMillis(), "dyn_modules", "last_report_time_ms");
                }
                return s3q0.a;
            case 18:
                qcy<Object>[] qcyVarArr4 = VerifiedSellerComponentImpl.c;
                return new vnr0();
            case 19:
                return new DebugComponentImpl.a();
            case 20:
                return new VideoPlaybackSpeedComponentImpl.a();
            case 21:
                return new StickyBannerAdFactoriesComponentImpl.a();
            case 22:
                return asu0.a.z(1, "vk-music-low-priority-thread");
            case 23:
                return new VoipStereoRoomListRouterComponentStub.a();
            case 24:
                return ((VoipCallComponent) ((k7m) m7m.f(com.vk.voip.ui.c.b)).a(fpf0.a(VoipCallComponent.class))).F6();
            default:
                b = e8r.a.b(r1, PrivateSubdir.MINI_APP_WEB_VIEW.h(), true);
                return b.a;
        }
    }
}
