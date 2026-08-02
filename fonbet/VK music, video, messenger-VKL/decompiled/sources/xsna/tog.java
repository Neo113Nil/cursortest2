package xsna;

import android.content.Context;
import com.vk.core.apps.BuildInfo;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.preference.Preference;
import com.vk.core.preference.Preference$PreferenceUsingLogger$IOType;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.ecomm.reviews.impl.di.ReviewsComponentImpl;
import com.vk.knet.cornet.CronetHttpLogger$DebugType;
import com.vk.profile.community.members.impl.CommunityMembersComponentImpl;
import com.vk.search.ui.impl.di.SearchUiComponentImpl;
import com.vk.stat.model.builders.imagecache.ImageCacheStatEventBuilder;
import com.vk.story.viewer.stat.di.StoryStatisticsComponentImpl;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import com.vk.voip.di.VoipCallComponentImpl;
import com.vkontakte.android.VKApplication;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import xsna.q6r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class tog implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ tog(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        PrivateFiles.a b;
        switch (this.b) {
            case 0:
                return new CommunityMembersComponentImpl.a();
            case 1:
                return new StoryStatisticsComponentImpl.a();
            case 2:
                return rl3.y0(CronetHttpLogger$DebugType.values());
            case 3:
                return com.vk.toggle.b.A.i(Features.Type.FEATURE_NET_HTTP_CACHE_CONFIG);
            case 4:
                o2l.a.getClass();
                List c0 = drm0.c0(o2l.c("__dbg_test_xowner_disable_allowed_methods", ""), new String[]{StringUtils.COMMA}, 0, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj : c0) {
                    String str = (String) obj;
                    if (str != null && !drm0.N(str)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(drm0.p0((String) it.next()).toString());
                }
                return j5g.S0(arrayList2);
            case 5:
                return xa4.e;
            case 6:
                return new Random();
            case 7:
                qcy<Object>[] qcyVarArr = ReviewsComponentImpl.l;
                return new v310();
            case 8:
                return ((SessionManagementComponent) j6i.b(m7m.f(new q6r0.a()), SessionManagementComponent.class)).J2();
            case 9:
                VKApplication.a aVar = VKApplication.c;
                try {
                    yse0.b();
                } catch (Exception e) {
                    com.vk.metrics.eventtracking.b.a.q(e);
                }
                return s3q0.a;
            case 10:
                VKApplication.a aVar2 = VKApplication.c;
                nb3.a.getClass();
                boolean z = BuildInfo.e() || o25.a().i().c;
                egl eglVar = (egl) egl.f.getValue();
                ((yfl) yfl.d.getValue()).a = z;
                eglVar.a = z;
                if (eglVar.a) {
                    Map<String, ?> all = Preference.f("image_cache_stat").getAll();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator<T> it2 = all.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        String str2 = (String) entry.getKey();
                        Long l = (Long) entry.getValue();
                        if (l != null) {
                            long longValue = l.longValue();
                            if (longValue != 0) {
                                linkedHashMap.put(str2, Integer.valueOf((int) longValue));
                            }
                        }
                    }
                    egl.f(linkedHashMap, ImageCacheStatEventBuilder.HitEventType.SESSION, null);
                    Preference.B("image_cache_stat");
                } else {
                    Preference.a.getClass();
                    Context context = Preference.b;
                    Context context2 = context != null ? context : null;
                    Preference$PreferenceUsingLogger$IOType preference$PreferenceUsingLogger$IOType = Preference$PreferenceUsingLogger$IOType.Write;
                    Preference.i.getClass();
                    String M = Preference.M("image_cache_stat", Preference.f);
                    ((ConcurrentHashMap) Preference.j.getValue()).remove(M);
                    context2.deleteSharedPreferences(M);
                }
                UiTracker uiTracker = UiTracker.a;
                UiTracker.a(new ob3(eglVar));
                return s3q0.a;
            case 11:
                b = e8r.a.b(r3, PrivateSubdir.VIDEO_DOWNLOADS.h(), false);
                File file = b.a;
                if (!file.isDirectory()) {
                    return null;
                }
                String[] list = file.list();
                if (list == null) {
                    list = new String[0];
                }
                for (String str3 : list) {
                    if (!brm0.v(str3, "uid", false) && !str3.equals("test.tmp")) {
                        Context context3 = e43.a;
                        return new o0m(context3 != null ? context3 : null);
                    }
                }
                return null;
            case 12:
                b.d i = com.vk.toggle.b.A.i(Features.Type.FEATURE_IM_PERF_METRICS_EXPERIMENTS);
                if (i == null) {
                    return null;
                }
                if (!i.a) {
                    i = null;
                }
                if (i != null) {
                    return i.c.toString();
                }
                return null;
            case 13:
                return new SearchUiComponentImpl.a();
            case 14:
                VKApplication vKApplication = com.vk.core.apps.a.a;
                return (vKApplication != null ? vKApplication : null).getPackageName();
            case 15:
                return new akg();
            case 16:
                qcy<Object>[] qcyVarArr2 = VoipCallComponentImpl.B;
                return new lmw0();
            case 17:
                return Boolean.valueOf(com.vk.voip.ui.c.K0.i());
            default:
                return new bjt();
        }
    }

    public /* synthetic */ tog(c0t0 c0t0Var) {
        this.b = 11;
    }
}
