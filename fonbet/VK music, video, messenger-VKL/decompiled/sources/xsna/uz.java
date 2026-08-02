package xsna;

import android.view.VelocityTracker;
import com.vk.clips.interests.impl.di.ClipsInterestsComponentImpl;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.ecomm.onlinebooking.api.router.di.OnlineBookingComponent$Companion$STUB$1;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;
import com.vk.profile.community.newsfeed.impl.di.CommunityNewsfeedComponentImpl;
import com.vk.profile.community.subscription.impl.di.CommunitySubscriptionComponentImpl;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.registration.funnels.b;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.base.js.bridge.data.PersonalDiscountDialogType;
import com.vk.toggle.b;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.SaFeatures;
import com.vk.toggle.features.SmbAdFeatures;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class uz implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ uz(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        String str = null;
        switch (this.b) {
            case 0:
                if (e370.s != null) {
                    b.d i = com.vk.toggle.b.A.i(SaFeatures.SA_GAMES_NEW_DISCOUNT);
                    JSONObject g = i != null ? i.g() : null;
                    if (g != null) {
                        str = f370.D(g, "dialog_type");
                    }
                }
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != -1783949481) {
                        if (hashCode != 3172656) {
                            if (hashCode == 100313435 && str.equals("image")) {
                                return PersonalDiscountDialogType.IMAGE;
                            }
                        } else if (str.equals("gift")) {
                            return PersonalDiscountDialogType.GIFT;
                        }
                    } else if (str.equals("image_large")) {
                        return PersonalDiscountDialogType.IMAGE_LARGE;
                    }
                }
                return PersonalDiscountDialogType.IMAGE;
            case 1:
                return new jwx(2, 8);
            case 2:
                return VelocityTracker.obtain();
            case 3:
                return new ejl0();
            case 4:
                return new pxo0(400L);
            case 5:
                return new dz5();
            case 6:
                qcy<Object>[] qcyVarArr = ClipsInterestsComponentImpl.o;
                return new bie(asu0.a);
            case 7:
                return new ne6();
            case 8:
                qcy<Object>[] qcyVarArr2 = CommunityNewsfeedComponentImpl.d;
                return new zch();
            case 9:
                qcy<Object>[] qcyVarArr3 = CommunitySubscriptionComponentImpl.e;
                return new z2i();
            case 10:
                return s3q0.a;
            case 11:
                vxq vxqVar = new vxq();
                vxqVar.b.add(new dyq());
                return vxqVar;
            case 12:
                return new tvb0(10);
            case 13:
                qcy<Object>[] qcyVarArr4 = GoodFragment.U0;
                return null;
            case 14:
                return Pattern.compile("\\[(\\S+?)\\|(.+?)]");
            case 15:
                return s3q0.a;
            case 16:
                return new p2r();
            case 17:
                FeedFeatures feedFeatures = FeedFeatures.FRESH_NEWS_LOADER_FIX;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 18:
                ysg0.b.a(new po40());
                return s3q0.a;
            case 19:
                return h5s.a("publisherClientThread");
            case 20:
                qcy<Object>[] qcyVarArr5 = OnlineBookingComponent$Companion$STUB$1.c;
                return new OnlineBookingComponent$Companion$STUB$1.b();
            case 21:
                return new ls90();
            case 22:
                b.a.a.getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.FACTOR_AVAILABLE, null, null, null, null, null, null, 254);
                return s3q0.a;
            case 23:
                return m7m.e();
            case 24:
                return new ots();
            case 25:
                return s3q0.a;
            case 26:
                int i2 = PostFragment.S0;
                return new jgg();
            case 27:
                String[] strArr = PostViewFragment.T0;
                SmbAdFeatures smbAdFeatures = SmbAdFeatures.FEATURE_SMB_DISCLAIMER_REPOSITION;
                smbAdFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(smbAdFeatures));
            case 28:
                FeedFeatures feedFeatures2 = FeedFeatures.POSTING_PHOTO_EDITOR;
                feedFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures2));
            default:
                return s3q0.a;
        }
    }
}
