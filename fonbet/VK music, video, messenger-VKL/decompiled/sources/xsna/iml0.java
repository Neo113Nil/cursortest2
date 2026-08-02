package xsna;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import com.vk.camera.editor.stories.impl.di.StoryEditorComponentImpl;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemSliderVh;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.storefront.impl.community.presentation.fragment.StorefrontFragment;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.movika.impl.VideoInteractiveFullscreenFragment;
import com.vk.oauth.tinkoff.VkTinkoffBaseActivity;
import com.vk.subscriptions.SubscriptionFragment;
import com.vk.video.profile.presentation.catalog.holders.VideoProfileCatalogContentVh;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vkontakte.android.R;
import defpackage.StorefrontArgs;
import java.util.concurrent.TimeUnit;
import kotlin.text.Regex;
import org.chromium.base.TimeUtils;
import xsna.av20;
import xsna.owm;
import xsna.p8u0;
import xsna.rhw0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class iml0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iml0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        boolean z = true;
        int i2 = 3;
        Object obj = this.c;
        switch (i) {
            case 0:
                StorefrontFragment storefrontFragment = (StorefrontFragment) obj;
                qcy<Object>[] qcyVarArr = StorefrontFragment.S;
                StorefrontArgs eo = storefrontFragment.eo();
                UserId userId = storefrontFragment.eo().b;
                qml0 qml0Var = new qml0();
                bpn0 bpn0Var = storefrontFragment.O;
                lml0 lml0Var = new lml0(userId, qml0Var, (ull0) bpn0Var.getValue());
                UserId userId2 = storefrontFragment.eo().b;
                eml emlVar = new eml(5, false);
                hap hapVar = new hap();
                hapVar.b = userId2;
                hapVar.c = emlVar;
                hapVar.d = new bpn0(new qo0(29));
                break;
            case 1:
                nwy nwyVar = ((StoryEditorComponentImpl) obj).c;
                qcy<Object> qcyVar = StoryEditorComponentImpl.h[2];
                break;
            case 2:
                int i3 = SubscriptionFragment.W;
                vxm0 vxm0Var = (vxm0) ((SubscriptionFragment) obj).S;
                if (vxm0Var != null) {
                    vxm0Var.v();
                }
                break;
            case 3:
                GradientDrawable gradientDrawable = new GradientDrawable();
                int[] iArr = {0, ((xno0) obj).k};
                gradientDrawable.setGradientType(0);
                gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
                gradientDrawable.setColors(iArr);
                break;
            case 4:
                FragmentImpl fragmentImpl = (FragmentImpl) obj;
                ((pds) fragmentImpl).o1();
                if (fragmentImpl instanceof dw60) {
                    ((dw60) fragmentImpl).Nb(false);
                }
                break;
            case 5:
                ((zak0) ((e6p0) obj).j).setValue(Boolean.valueOf(!r6.m()));
                break;
            case 6:
                vrp0 vrp0Var = (vrp0) obj;
                long seconds = TimeUnit.MILLISECONDS.toSeconds(nzo.g(vrp0Var.b, vrp0Var.a));
                if (seconds >= TimeUtils.SECONDS_PER_HOUR) {
                    long j = 60;
                    break;
                } else {
                    long j2 = 60;
                    break;
                }
            case 7:
                ((wh50) obj).setValue(Boolean.TRUE);
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                Regex regex = hgr0.X;
                WebApiApplication m = ((hgr0) obj).yn().b.m();
                if (m != null && !m.B) {
                    z = false;
                }
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                int i4 = VideoInteractiveFullscreenFragment.Q0;
                break;
            case 15:
                View view = ((VideoItemSliderVh) obj).O;
                break;
            case 16:
                int i5 = VideoMinimizableDiscoveryFragment.p1;
                xn50.a.c((VideoMinimizableDiscoveryFragment) obj, new c.a1.b(false));
                break;
            case 17:
                break;
            case 18:
                VideoProfileCatalogContentVh videoProfileCatalogContentVh = (VideoProfileCatalogContentVh) obj;
                if (videoProfileCatalogContentVh.r != null) {
                    break;
                }
                break;
            case 19:
                ect0 ect0Var = (ect0) obj;
                Context requireContext = ect0Var.requireContext();
                av20.a aVar = new av20.a();
                dhr0.a.getClass();
                aVar.d(R.layout.actions_popup_item, LayoutInflater.from(new lpj(requireContext, dhr0.u().c)));
                aVar.d = new fct0(requireContext);
                aVar.c(new fme(ect0Var, i2));
                break;
            case 20:
                ((qo5) ((qot0) obj).d.getValue()).getClass();
                break;
            case 21:
                break;
            case 22:
                try {
                    ((Dialog) obj).dismiss();
                } catch (Exception e) {
                    String canonicalName = p8u0.a.class.getCanonicalName();
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    Log.e(canonicalName, message);
                }
                break;
            case 23:
                ((q9u0) obj).O(owm.c.b);
                break;
            case 24:
                break;
            case 25:
                com.vk.superapp.browser.internal.ui.shortcats.a aVar2 = ((ggu0) obj).x;
                if (aVar2 != null) {
                    break;
                }
                break;
            case 26:
                int i6 = VkTinkoffBaseActivity.o;
                w0m w0mVar = ((VkTinkoffBaseActivity) obj).f;
                break;
            case 27:
                break;
            case 28:
                VoipCallServiceFragment voipCallServiceFragment = (VoipCallServiceFragment) obj;
                int i7 = VoipCallServiceFragment.Y;
                rhw0.u uVar = rhw0.u.b;
                voipCallServiceFragment.getClass();
                xn50.a.c(voipCallServiceFragment, uVar);
                break;
            default:
                mjw0 mjw0Var = (mjw0) obj;
                if (!mjw0Var.y.f.a) {
                    mjw0Var.l();
                }
                break;
        }
        return s3q0.a;
    }
}
