package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Path;
import android.view.animation.PathInterpolator;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.confirmaccount.impl.di.ConfirmAccountComponentImpl;
import com.vk.im.ui.components.viewcontrollers.msg_send.MsgSendOptionsPopup$Option;
import com.vk.musc.kidsmode.impl.di.MusicKidsModeComponentImpl;
import com.vk.newsfeed.posting.mediapicker.localmedia.LocalMediaPickerFragment;
import com.vk.onboardingscreens.impl.di.OnboardingScreensComponentImpl;
import com.vk.profile.community.chats.impl.presentation.CommunityChatsFragment;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.SearchFeatures;
import com.vk.voip.ui.accessibility.AccessibilityEvents;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class lk implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ lk(int i) {
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x011d, code lost:
    
        if (r0.b != false) goto L53;
     */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        FragmentManager supportFragmentManager;
        List<Fragment> f;
        boolean z = true;
        r2 = null;
        r2 = null;
        Fragment fragment = null;
        switch (this.b) {
            case 0:
                return asu0.a.A(1, "VoipAccessibilityEventQueuecall");
            case 1:
                hhd0 hhd0Var = znk0.o;
                return new u5r0(((u6g0) (hhd0Var != null ? hhd0Var : null).b).a());
            case 2:
                return new pxo0(500L);
            case 3:
                return "error on events subscription";
            case 4:
                return new o040();
            case 5:
                return new ysg0();
            case 6:
                return Boolean.valueOf(fxc0.B().J().b());
            case 7:
                return new zqu();
            case 8:
                return s3q0.a;
            case 9:
                return s3q0.a;
            case 10:
                int i = ClipsEntryPointsFragment.i0;
                return new j1e();
            case 11:
                c63 c63Var = c63.a;
                Activity b = c63.b();
                FragmentActivity fragmentActivity = b instanceof FragmentActivity ? (FragmentActivity) b : null;
                if (fragmentActivity != null && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) != null && (f = supportFragmentManager.c.f()) != null) {
                    fragment = (Fragment) j5g.i0(f);
                }
                return Boolean.valueOf(fragment instanceof dw20);
            case 12:
                int i2 = CommunityChatsFragment.b0;
                ComFeatures comFeatures = ComFeatures.COM_CONTENT_FOR_TAB_OPTIMIZE;
                comFeatures.getClass();
                if (com.vk.toggle.b.A.a(comFeatures)) {
                    upu b2 = com.vk.toggle.d.J0.b();
                    if (b2 == null) {
                        upu.c.getClass();
                        b2 = upu.d;
                    }
                    break;
                }
                z = false;
                return Boolean.valueOf(z);
            case 13:
                qcy<Object>[] qcyVarArr = ConfirmAccountComponentImpl.c;
                return new y2j();
            case 14:
                return EmptyList.b;
            case 15:
                Context context = e43.a;
                return Integer.valueOf(e3m.a(R.dimen.post_side_padding, context != null ? context : null));
            case 16:
                return s3q0.a;
            case 17:
                return new s290();
            case 18:
                Context context2 = e43.a;
                return Integer.valueOf(e3m.a(R.dimen.vkim_reactions_icon_size, context2 != null ? context2 : null));
            case 19:
                Path path = new Path();
                path.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                path.cubicTo(0.06834272f, 0.019925667f, 0.19220331f, 0.15855429f, 0.33333334f, 0.3492616f);
                path.cubicTo(0.38410434f, 0.41477913f, 0.5494579f, 0.6813603f, 0.6666667f, 0.68279964f);
                path.cubicTo(0.75258625f, 0.6817962f, 0.73725396f, 0.8788962f, 1.0f, 1.0f);
                return new PathInterpolator(path);
            case 20:
                icv icvVar = zax.a;
                return Boolean.TRUE;
            case 21:
                return new Regex("/im/channels/([-0-9]+)");
            case 22:
                int i3 = LocalMediaPickerFragment.d0;
                return new ak3();
            case 23:
                int i4 = jyz.r1;
                SearchFeatures searchFeatures = SearchFeatures.SEARCH_FILTERS_DS;
                searchFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(searchFeatures));
            case 24:
                return new d7i0();
            case 25:
                wng0 wng0Var = new wng0();
                wng0Var.b(dhr0.t.c(R.attr.vk_ui_background_content));
                return wng0Var;
            case 26:
                return new e520(MsgSendOptionsPopup$Option.DELAYED.ordinal(), R.drawable.vk_icon_clock_outline_28, R.string.vkim_delay_msg_send, 2, false, 0, 0, false, null, 0, null, false, 8176);
            case 27:
                qcy<Object>[] qcyVarArr2 = MusicKidsModeComponentImpl.f;
                return new xo9();
            case 28:
                qcy<Object>[] qcyVarArr3 = OnboardingScreensComponentImpl.h;
                return new bnt();
            default:
                return new j2n(r2);
        }
    }

    public /* synthetic */ lk(AccessibilityEvents accessibilityEvents) {
        this.b = 0;
    }
}
