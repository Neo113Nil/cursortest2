package xsna;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.config.viewers.impl.di.ClipsConfigViewersComponentImpl;
import com.vk.core.preference.Preference;
import com.vk.ecomm.reviews.impl.di.ReviewsComponentImpl;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.voip.di.VoipCallComponentImpl;
import com.vkontakte.android.VKApplication;
import java.util.SimpleTimeZone;
import xsna.xuo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class s0f implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s0f(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new ClipsConfigViewersComponentImpl.a((Application) this.c);
            case 1:
                dpf dpfVar = (dpf) this.c;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"ClipsViewersExperiments", "Init ClipsViewerExperimentsGrid"});
                }
                return new rof(dpfVar.d);
            case 2:
                s6i s6iVar = (s6i) this.c;
                Preference preference = Preference.a;
                Context context = s6iVar.b;
                preference.getClass();
                Preference.w(context);
                return Preference.j();
            case 3:
                return new o2n0((cau0) this.c);
            case 4:
                return new pu70(((sp40) this.c).a);
            case 5:
                return ((jq40) this.c).a.O2();
            case 6:
                x660 x660Var = (x660) this.c;
                return Preference.h(x660Var.a, 0, x660Var.c);
            case 7:
                return ((eu70) this.c).b.getCache();
            case 8:
                ReviewsComponentImpl reviewsComponentImpl = (ReviewsComponentImpl) this.c;
                qcy<Object>[] qcyVarArr = ReviewsComponentImpl.l;
                ajg0 Md = reviewsComponentImpl.Md();
                ewy ewyVar = reviewsComponentImpl.c;
                qcy<Object> qcyVar = ReviewsComponentImpl.l[2];
                return new l6h(Md, (s510) ewyVar.c(), reviewsComponentImpl.zd());
            case 9:
                StoriesComponentImpl storiesComponentImpl = (StoriesComponentImpl) this.c;
                qcy<Object>[] qcyVarArr2 = StoriesComponentImpl.N;
                return new p8c0(new bpn0(new wp40(storiesComponentImpl, 26)), new bpn0(new ye80(storiesComponentImpl, 23)), storiesComponentImpl.b.s());
            case 10:
                VKApplication vKApplication = (VKApplication) this.c;
                VKApplication.a aVar = VKApplication.c;
                xuo0.a.getClass();
                xuo0.e = vKApplication;
                SimpleTimeZone simpleTimeZone = pvo0.a;
                pvo0.p(Preference.j().getFloat("custom_timezone", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                if (!xuo0.b()) {
                    ky6 j = Preference.j();
                    xuo0.c = j.getLong("im_server_time_diff", 0L);
                    xuo0.f = j;
                    xuo0.a aVar2 = (xuo0.a) xuo0.b.getValue();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
                    intentFilter.addAction("android.intent.action.TIME_SET");
                    vKApplication.registerReceiver(aVar2, intentFilter);
                }
                return s3q0.a;
            case 11:
                return new slg(((k6v0) this.c).d);
            default:
                return new fa9(((VoipCallComponentImpl) this.c).b.getValue());
        }
    }
}
