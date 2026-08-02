package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;
import androidx.fragment.app.FragmentActivity;
import androidx.room.RoomDatabase;
import androidx.room.d;
import com.yandex.go.antirobot.GoAntirobotApi;
import com.yandex.go.due_timetable.experiment.IntercityTimetableConfigExperiment;
import com.yandex.go.feed_video.presentation.divkit.ListYandexDivPlayerView;
import com.yandex.go.feed_video.presentation.divkit.c;
import com.yandex.go.flex.common.actions.haptic.a;
import com.yandex.go.payments.paymentlist.experiments.g;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaYandex;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.design.FloatingTitleToolbarComponent;
import ru.yandex.taxi.logistics.sdk.management.localstate.HiddenDeliveries$HiddenDeliveriesData;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.preorder.source.userposition.repository.f;
import ru.yandex.taxi.routestats.api.RouteStatsApi;
import ru.yandex.taxi.utils.b;
import ru.yandex.video.m3.list_player_manager.ListYandexPlayerManager;
import ru.yandex.video.m3.list_player_manager.impl.InitParametersKt;
import ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerManagerInstanceProvider;

/* loaded from: classes9.dex */
public final /* synthetic */ class ppr implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ppr(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 initScrollTracker$lambda$0$0;
        Object failure;
        Object obj;
        int i = this.a;
        boolean z = true;
        int i2 = 0;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                initScrollTracker$lambda$0$0 = FloatingTitleToolbarComponent.initScrollTracker$lambda$0$0((FloatingTitleToolbarComponent) obj2);
                return initScrollTracker$lambda$0$0;
            case 1:
                Context context = ((rpr) obj2).a;
                FloatingTitleToolbarComponent floatingTitleToolbarComponent = new FloatingTitleToolbarComponent(context, context.getResources().getLayout(sph0.floating_title_toolbar), 0, 4, null);
                floatingTitleToolbarComponent.setTitleAccessibilityHeading(true);
                return floatingTitleToolbarComponent;
            case 2:
                return ((g) obj2).h.b();
            case 3:
                return ((bts) obj2).q();
            case 4:
                b bVar = (b) obj2;
                ((ul51) bVar.c).getClass();
                String l = bVar.m.l(bVar.d, null);
                if (l != null && l.length() != 0) {
                    return (a1t) ((xnt) bVar.a).c(l, a1t.Companion.serializer());
                }
                a1t.Companion.getClass();
                return a1t.f;
            case 5:
                on2 on2Var = ((com.yandex.go.antirobot.b) obj2).a;
                on2Var.getClass();
                return (GoAntirobotApi) on2Var.a(GoApiName.TaxiV4, GoAntirobotApi.class);
            case 6:
                return AppMetrica.getReporter(((sot) obj2).a, "b1b14fd8-aad7-4d9b-9e24-975f6db5c42a");
            case 7:
                Context context2 = ((ru.yandex.taxi.vendor_api.google.b) obj2).a;
                zm2 zm2Var = bdz.a;
                return new ih91(context2);
            case 8:
                Object systemService = ((n3u) obj2).a.getApplicationContext().getSystemService("phone");
                if (systemService instanceof TelephonyManager) {
                    return (TelephonyManager) systemService;
                }
                return null;
            case 9:
                return ((a) obj2).a;
            case 10:
                return ((igu) obj2).a.adapter(HiddenDeliveries$HiddenDeliveriesData.class);
            case 11:
                fi10 fi10Var = new fi10();
                fi10.b(fi10Var, ((coil3.b) obj2).a);
                return fi10Var.a();
            case 12:
                return Integer.valueOf(((za90) obj2).a());
            case 13:
                return (vmr0) ((zav) obj2).a.invoke();
            case 14:
                return ((c3w) obj2).a.getSharedPreferences("install_referrer_broadcast_prefs", 0);
            case 15:
                IntercityTimetableConfigExperiment.TimeslotConfiguration timeslotConfiguration = (IntercityTimetableConfigExperiment.TimeslotConfiguration) obj2;
                Integer num = timeslotConfiguration.a;
                Integer num2 = timeslotConfiguration.b;
                if (num == null || num2 == null) {
                    return null;
                }
                return y6i0.n(num.intValue(), num2.intValue());
            case 16:
                RoomDatabase roomDatabase = ((d) obj2).a;
                if (roomDatabase.I0() && !roomDatabase.N0()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 17:
                Map map = (Map) ((h3y) ((hzk) obj2).a).get();
                LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ((unt) entry.getValue()).a);
                }
                return linkedHashMap;
            case 18:
                return new ArrayList(((List) ((lxj) obj2).a).size());
            case 19:
                try {
                    failure = ((v4y) obj2).b();
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                return new Result(failure);
            case 20:
                return new ij3((q7y) obj2);
            case 21:
                c cVar = (c) obj2;
                return g1b1.c(ListYandexDivPlayerView.class.getName(), cVar.b.getResources(), ((Number) cVar.i.getValue()).intValue());
            case 22:
                com.yandex.go.feed_video.domain.manager.b bVar2 = (com.yandex.go.feed_video.domain.manager.b) obj2;
                ListYandexPlayerManagerInstanceProvider listYandexPlayerManagerInstanceProvider = ListYandexPlayerManagerInstanceProvider.INSTANCE;
                ListYandexPlayerManager.Companion companion = ListYandexPlayerManager.INSTANCE;
                FragmentActivity fragmentActivity = bVar2.a;
                String str = bVar2.b;
                String deviceId = AppMetricaYandex.getDeviceId(fragmentActivity);
                if (deviceId == null) {
                    deviceId = "";
                }
                return listYandexPlayerManagerInstanceProvider.initializeAsync(companion, fragmentActivity, InitParametersKt.InitParameters(str, deviceId, EmptyList.a, false, new xpy(4)));
            case 23:
                on2 on2Var2 = ((ru.yandex.taxi.provider.a) obj2).a;
                on2Var2.getClass();
                return (RouteStatsApi) on2Var2.a(GoApiName.TaxiV3, RouteStatsApi.class);
            case 24:
                j5z j5zVar = (j5z) obj2;
                Locale c = j5zVar.c();
                j5zVar.b.getClass();
                List list = wu2.b;
                List w = qje.w();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(c.stripExtensions().toLanguageTag());
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : w) {
                    Locale locale = (Locale) obj3;
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (jl40.l(qje.E(((i5z) obj).a.getLanguage()), qje.E(locale.getLanguage()))) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    if (obj != null) {
                        arrayList.add(obj3);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    linkedHashSet.add(((Locale) it2.next()).toLanguageTag());
                }
                ArrayList arrayList2 = new ArrayList(tcc.n(linkedHashSet, 10));
                for (Object obj4 : linkedHashSet) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        scc.m();
                        throw null;
                    }
                    String str2 = (String) obj4;
                    if (i2 != 0) {
                        double d = 1.0d - (i2 * 0.1d);
                        str2 = g8e.p(str2, ";q=", String.format(Locale.ENGLISH, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d >= 0.1d ? d : 0.1d)}, 1)));
                    }
                    arrayList2.add(str2);
                    i2 = i3;
                }
                return kotlin.collections.a.X(arrayList2, Extension.FIX_SPACE, null, null, null, 62);
            case 25:
                return new ij3((g9z) obj2);
            case 26:
                return ((s9z) obj2).a();
            case 27:
                return new ij3((ccz) obj2);
            case 28:
                hbp0 hbp0Var = new hbp0(new czo0(14), "LocationRepositoryMapKit", (mse) ((f) obj2).d.a.getValue());
                hbp0Var.a();
                return hbp0Var;
            default:
                t5r g = kotlin.sequences.b.g(kotlin.sequences.b.i(j73.v((Pair[]) obj2)), new p0u(19));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                s5r s5rVar = new s5r(g);
                while (s5rVar.hasNext()) {
                    Pair pair = (Pair) s5rVar.next();
                    Pair pair2 = new Pair(pair.c(), new eez(String.valueOf(pair.f())));
                    linkedHashMap2.put(pair2.c(), pair2.f());
                }
                return linkedHashMap2;
        }
    }
}
