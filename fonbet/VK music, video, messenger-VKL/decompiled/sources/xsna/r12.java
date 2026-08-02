package xsna;

import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.provider.ContactsContract;
import com.vk.censoredsettings.di.CensoredSettingsComponentImpl;
import com.vk.core.apps.BuildInfo;
import com.vk.ecomm.reviews.impl.di.ReviewsComponentImpl;
import com.vk.im.engine.di.ImReportersComponentImpl;
import com.vk.phoneactualization.api.di.PhoneActualizationComponent;
import com.vk.profile.community.subscription.impl.di.CommunitySubscriptionComponentImpl;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.story.viewer.impl.di.StoryViewerComponentImpl;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.VKApplication;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.l55;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class r12 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ r12(int i) {
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Class<?> returnType;
        switch (this.b) {
            case 0:
                return ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
            case 1:
                return ((PhoneActualizationComponent) ((k7m) m7m.f(new l55.g())).a(fpf0.a(PhoneActualizationComponent.class))).a();
            case 2:
                return new CommunitySubscriptionComponentImpl.a();
            case 3:
                return new StoryViewerComponentImpl.a();
            case 4:
                return com.vk.toggle.b.A.i(Features.Type.FEATURE_NET_SEE);
            case 5:
                try {
                    Method method = (Method) ogs.e.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused) {
                    return null;
                }
            case 6:
                o2l.a.getClass();
                List c0 = drm0.c0(o2l.c("__dbg_test_xowner_allowed_methods", ""), new String[]{StringUtils.COMMA}, 0, 6);
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
            case 7:
                return "#submitStartEnvironment";
            case 8:
                qcy<Object>[] qcyVarArr = ImReportersComponentImpl.b;
                a1w a1wVar = q1w.a;
                return (a1wVar != null ? a1wVar : null).r().O;
            case 9:
                return new Handler(Looper.getMainLooper());
            case 10:
                qcy<Object>[] qcyVarArr2 = ReviewsComponentImpl.l;
                return new f610();
            case 11:
                qcy<Object>[] qcyVarArr3 = StoriesComponentImpl.N;
                return new gsl0();
            case 12:
                mgn0 mgn0Var = dgn0.a;
                return new l2l0((mgn0Var != null ? mgn0Var : null).a);
            case 13:
                return new xx1(20);
            case 14:
                VKApplication.a aVar = VKApplication.c;
                return m7m.e();
            case 15:
                b.d i = com.vk.toggle.b.A.i(ImFeatures.STALLS_REPORTER);
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
            case 16:
                return new CensoredSettingsComponentImpl.a();
            case 17:
                return Boolean.valueOf(BuildInfo.s());
            case 18:
                return new bsl();
            case 19:
                return new cwj0();
            default:
                return new rit();
        }
    }

    public /* synthetic */ r12(VKApplication vKApplication) {
        this.b = 14;
    }
}
