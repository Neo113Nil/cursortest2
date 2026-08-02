package xsna;

import android.content.SharedPreferences;
import android.provider.ContactsContract;
import com.ironsource.C4217a2;
import com.vk.censoredsettings.di.CensoredSettingsInnerComponent;
import com.vk.core.apps.VkBuildAppStore;
import com.vk.core.preference.Preference;
import com.vk.ecomm.reviews.impl.di.ReviewsComponentImpl;
import com.vk.libvideo.offline.VideoDownloadService;
import com.vk.libvideo.offline.VideoDownloadServiceV2;
import com.vk.preview.di.GalleryPickerPreviewComponentImpl;
import com.vk.profile.community.newsfeed.impl.di.CommunityNewsfeedComponentImpl;
import com.vk.pushes.PushComponent;
import com.vk.tabbar.settings.impl.di.TabbarSettingsComponentImpl;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import com.vk.voip.ui.members.VoipDataProvider;
import com.vkontakte.android.VKApplication;
import java.io.File;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import org.chromium.base.TimeUtils;
import org.json.JSONObject;
import ru.ok.android.utils.Logger;
import xsna.x870;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class s12 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ s12(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        ExecutorService b;
        VkBuildAppStore vkBuildAppStore;
        switch (this.b) {
            case 0:
                return ContactsContract.Data.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
            case 1:
                return new CommunityNewsfeedComponentImpl.a();
            case 2:
                return new GalleryPickerPreviewComponentImpl.a();
            case 3:
                return com.vk.toggle.b.A.i(Features.Type.FEATURE_NET_API_METHODS_CONFIG);
            case 4:
                vwv.b.getClass();
                return (xal) vwv.g.getValue();
            case 5:
                return (PushComponent) ((k7m) m7m.f(new x870.a())).a(fpf0.a(PushComponent.class));
            case 6:
                qcy<Object>[] qcyVarArr = ReviewsComponentImpl.l;
                return new t510();
            case 7:
                return new lg6(new z0h0(7));
            case 8:
                qcy<Object>[] qcyVarArr2 = TabbarSettingsComponentImpl.p;
                return new kwn0();
            case 9:
                VKApplication.a aVar = VKApplication.c;
                String e = yse0.e();
                return Long.valueOf(e != null ? z4g.g(new File(e)) : 0L);
            case 10:
                VKApplication.a aVar2 = VKApplication.c;
                y7r0 y7r0Var = new y7r0();
                mfp0 b2 = com.vk.toggle.d.u0.b();
                if (b2 == null) {
                    mfp0.e.getClass();
                    b2 = mfp0.f;
                }
                final com.vkontakte.android.data.b h = com.vkontakte.android.data.b.h();
                int i = b2.b;
                Set<String> set = b2.d;
                h.u = i;
                h.v = set;
                h.t = y7r0Var;
                h.g = "";
                SharedPreferences l = Preference.l();
                if (C4217a2.f.equals(h.r)) {
                    h.r = l.getString("google_device_id", C4217a2.f);
                }
                if (h.p == null) {
                    h.p = l.getString("mytarget_fingerprint", null);
                }
                if (h.s.isEmpty()) {
                    HashMap<String, String> hashMap = h.s;
                    o260 o260Var = d260.a;
                    hashMap.put("User-Agent", (String) (o260Var != null ? o260Var : null).l.c.getValue());
                }
                h.b.execute(new Runnable() { // from class: xsna.szl
                    @Override // java.lang.Runnable
                    public final void run() {
                        final com.vkontakte.android.data.b bVar = com.vkontakte.android.data.b.this;
                        try {
                            com.vkontakte.android.data.b.k(com.vkontakte.android.data.b.j("analytics.log"), new wzs() { // from class: xsna.tzl
                                @Override // xsna.wzs
                                public final Object invoke(Object obj, Object obj2) {
                                    String str = (String) obj2;
                                    LinkedBlockingQueue<JSONObject> linkedBlockingQueue = com.vkontakte.android.data.b.this.h;
                                    if (pvo0.a() - ((Long) obj).longValue() < TimeUtils.SECONDS_PER_DAY) {
                                        try {
                                            JSONObject jSONObject = new JSONObject(str);
                                            if (!linkedBlockingQueue.contains(jSONObject)) {
                                                linkedBlockingQueue.add(jSONObject);
                                                return Boolean.TRUE;
                                            }
                                        } catch (Exception e2) {
                                            com.vk.metrics.eventtracking.b.a.a(e2);
                                            return Boolean.FALSE;
                                        }
                                    }
                                    return Boolean.FALSE;
                                }
                            });
                            com.vkontakte.android.data.b.k(com.vkontakte.android.data.b.j("analytics_collapsed.log"), new wzs() { // from class: xsna.uzl
                                @Override // xsna.wzs
                                public final Object invoke(Object obj, Object obj2) {
                                    String str = (String) obj2;
                                    com.vkontakte.android.data.b bVar2 = com.vkontakte.android.data.b.this;
                                    bVar2.getClass();
                                    if (pvo0.a() - ((Long) obj).longValue() < TimeUtils.SECONDS_PER_DAY) {
                                        try {
                                            JSONObject jSONObject = new JSONObject(str);
                                            bVar2.i.put(jSONObject.getString(Logger.METHOD_E), jSONObject);
                                        } catch (Exception e2) {
                                            com.vk.metrics.eventtracking.b.a.a(e2);
                                            return Boolean.FALSE;
                                        }
                                    }
                                    return Boolean.TRUE;
                                }
                            });
                            com.vkontakte.android.data.b.k(com.vkontakte.android.data.b.j("analytics_events.log"), new wzs() { // from class: xsna.vzl
                                @Override // xsna.wzs
                                public final Object invoke(Object obj, Object obj2) {
                                    String str = (String) obj2;
                                    com.vkontakte.android.data.b bVar2 = com.vkontakte.android.data.b.this;
                                    bVar2.getClass();
                                    if (pvo0.a() - ((Long) obj).longValue() >= TimeUtils.SECONDS_PER_DAY) {
                                        return Boolean.FALSE;
                                    }
                                    bVar2.l.add(str);
                                    return Boolean.TRUE;
                                }
                            });
                            com.vkontakte.android.data.b.k(com.vkontakte.android.data.b.j("analytics_corrupted_events.log"), new wzs() { // from class: xsna.wzl
                                @Override // xsna.wzs
                                public final Object invoke(Object obj, Object obj2) {
                                    String str = (String) obj2;
                                    LinkedBlockingQueue<JSONObject> linkedBlockingQueue = com.vkontakte.android.data.b.this.h;
                                    if (pvo0.a() - ((Long) obj).longValue() < TimeUtils.SECONDS_PER_DAY) {
                                        try {
                                            JSONObject jSONObject = new JSONObject(str);
                                            if (!linkedBlockingQueue.contains(jSONObject)) {
                                                linkedBlockingQueue.add(jSONObject);
                                                return Boolean.TRUE;
                                            }
                                        } catch (Exception e2) {
                                            com.vk.metrics.eventtracking.b.a.a(e2);
                                            return Boolean.FALSE;
                                        }
                                    }
                                    return Boolean.FALSE;
                                }
                            });
                        } catch (Exception e2) {
                            com.vk.metrics.eventtracking.b.a.a(e2);
                        }
                    }
                });
                asu0.a.getClass();
                asu0.o().submit(new w7r0());
                return s3q0.a;
            case 11:
                return fxc0.B().J().k1() ? VideoDownloadServiceV2.class : VideoDownloadService.class;
            case 12:
                b.d i2 = com.vk.toggle.b.A.i(Features.Type.FEATURE_IM_PERF_METRICS);
                if (i2 == null) {
                    return null;
                }
                if (!i2.a) {
                    i2 = null;
                }
                if (i2 != null) {
                    return i2.c.toString();
                }
                return null;
            case 13:
                return new CensoredSettingsInnerComponent.a();
            case 14:
                b = asu0.a.b((r5 & 2) != 0 ? 1 : 5, (r5 & 4) != 0 ? 0L : 1000L, "vk-multiacc-thread");
                return b;
            case 15:
                VkBuildAppStore.a aVar3 = VkBuildAppStore.Companion;
                String str = (String) com.vk.core.apps.a.i.getValue();
                aVar3.getClass();
                VkBuildAppStore[] values = VkBuildAppStore.values();
                int length = values.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        vkBuildAppStore = values[i3];
                        if (epx.f(vkBuildAppStore.i(), str)) {
                            r1 = vkBuildAppStore;
                        } else {
                            i3++;
                        }
                    }
                }
                return r1 == null ? VkBuildAppStore.GOOGLE : r1;
            case 16:
                csu0.a.getClass();
                return csu0.a();
            case 17:
                return new pm40(lyd.g().z());
            case 18:
                com.vk.voip.ui.c.b.getClass();
                VoipDataProvider voipDataProvider = com.vk.voip.ui.c.d0;
                if (voipDataProvider != null) {
                    return voipDataProvider;
                }
                return null;
            default:
                return new xit();
        }
    }

    public /* synthetic */ s12(VKApplication vKApplication) {
        this.b = 10;
    }
}
