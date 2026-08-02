package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.enterphone.EnterPhonePresenterInfo;
import com.vk.auth.enterphone.choosecountry.Country;
import com.vk.auth.main.AuthStatSender;
import com.vk.core.view.components.rating.RatingBar$Size;
import com.vk.core.view.components.rating.VkStaticRatingBar;
import com.vk.core.view.components.rating.a;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.registration.funnels.TrackingElement;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class hjj implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ hjj(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.f;
        Object obj3 = this.c;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                List list = (List) obj5;
                List list2 = (List) obj4;
                String str = (String) obj3;
                izs izsVar = (izs) obj2;
                rry rryVar = (rry) obj;
                wow wowVar = new wow(list);
                int i2 = 1;
                rryVar.a(list.size(), null, new bqd(wowVar, 1), new jai(-1117249557, new u6c(i2, wowVar, izsVar), true));
                if (!list2.isEmpty()) {
                    rry.j(rryVar, new pf(21), new jai(970276391, new ljj(list, 0), true), 5);
                    wow wowVar2 = new wow(list2);
                    rryVar.a(list2.size(), null, new tjj(wowVar2, 0), new jai(-1117249557, new sjj(wowVar2, izsVar), true));
                    if (str != null) {
                        rry.j(rryVar, new rf(26), new jai(-998993022, new xhd(i2, izsVar, str), true), 5);
                    }
                }
                break;
            case 1:
                com.vk.auth.enterphone.a aVar = (com.vk.auth.enterphone.a) obj5;
                Country country = (Country) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                vgg vggVar = (vgg) obj;
                Throwable th = vggVar.a;
                AuthStatSender authStatSender = aVar.e;
                authStatSender.getClass();
                authStatSender.e(AuthStatSender.Screen.PHONE);
                boolean z = th instanceof VKApiExecutionException;
                VKApiExecutionException vKApiExecutionException = z ? (VKApiExecutionException) th : null;
                Integer valueOf = vKApiExecutionException != null ? Integer.valueOf(vKApiExecutionException.s()) : null;
                int i3 = 2;
                if (aVar.x instanceof EnterPhonePresenterInfo.SignUp) {
                    com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
                    bVar.getClass();
                    RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                    frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.SEND_SMS_CODE_FAILED, null, null, null, null, null, null, 254);
                    if (!z) {
                        com.vk.registration.funnels.b.t(bVar);
                    } else if (valueOf != null && valueOf.intValue() == 1000) {
                        ArrayList<SchemeStatSak$RegistrationFieldItem> c = com.vk.registration.funnels.a.c(e43.l(new Pair(TrackingElement.Registration.PHONE_NUMBER, new m3g(country, 14)), new Pair(TrackingElement.Registration.SELECT_COUNTRY_NAME, new jhg(str3, 2))));
                        bVar.getClass();
                        RegistrationFunnelScreenStack registrationFunnelScreenStack2 = frf0.a;
                        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.INCORRECT_PHONE_NUMBER, c, null, null, null, null, null, 236);
                    } else if (valueOf != null && valueOf.intValue() == 1004) {
                        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.EXISTING_PHONE_NUMBER, null, null, null, null, null, null, 254);
                    } else {
                        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.COMMON_SERVER_ERROR, null, null, null, null, null, null, 254);
                    }
                }
                vggVar.d(new com.vk.movika.sdk.base.logic.interactor.n(aVar, th, str2, i3));
                break;
            default:
                Map map = (Map) obj5;
                wh50 wh50Var = (wh50) obj3;
                wh50 wh50Var2 = (wh50) obj2;
                VkStaticRatingBar vkStaticRatingBar = (VkStaticRatingBar) obj;
                Float l = arm0.l((String) ((wh50) obj4).getValue());
                vkStaticRatingBar.setRating(l != null ? l.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                com.vk.core.view.components.rating.a aVar2 = (com.vk.core.view.components.rating.a) map.get((String) wh50Var.getValue());
                if (aVar2 == null) {
                    aVar2 = new a.C0861a();
                }
                vkStaticRatingBar.setFillStrategy(aVar2);
                vkStaticRatingBar.setSize((RatingBar$Size) wh50Var2.getValue());
                break;
        }
        return s3q0.a;
    }
}
