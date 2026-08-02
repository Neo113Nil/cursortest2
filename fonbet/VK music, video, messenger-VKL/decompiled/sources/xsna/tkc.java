package xsna;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tips.Tooltip;
import com.vk.money.MoneyTransferLinkFragment;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.ui.toolbar.VkAuthToolbar;
import com.vkontakte.android.R;
import one.video.ad.ux.controls.OneVideoAdBaseControls;
import one.video.ad.ux.controls.OneVideoAdControlsViewNew;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class tkc implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tkc(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        gzs<s3q0> gzsVar;
        int i = this.b;
        int i2 = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                vkc vkcVar = ((ukc) obj).n;
                if (vkcVar != null && (gzsVar = vkcVar.f) != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 1:
                opp oppVar = (opp) obj;
                kpp kppVar = opp.T;
                com.vk.registration.funnels.b.a.getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.BIRTHDAY_TOOLTIP_TAP, null, null, null, null, null, null, 254);
                new Tooltip(oppVar.requireContext(), null, oppVar.getString(R.string.vk_auth_sign_up_enter_birthday_tooltip_info), null, null, null, null, e3m.f(R.attr.vk_ui_background_modal, oppVar.requireContext()), e3m.f(R.attr.vk_ui_text_primary, oppVar.requireContext()), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48, 0, false, null, 0, false, null, null, null, null, null, null, new gq(15), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Integer.valueOf(iah0.a(PsExtractor.VIDEO_STREAM_MASK)), null, false, 0, null, null, null, null, -75499912, 15).k(oppVar.requireContext(), (r15 & 2) != 0, true, (r15 & 8) != 0, true, false, new g4g(view, 13), r4);
                break;
            case 2:
                com.vk.newsfeed.posting.market_picker.presentation.base.view.h.this.e.getClass();
                break;
            case 3:
                MoneyTransferLinkFragment moneyTransferLinkFragment = (MoneyTransferLinkFragment) obj;
                int i3 = MoneyTransferLinkFragment.u0;
                efx0 efx0Var = e370.k;
                if (efx0Var == null) {
                    efx0Var = null;
                }
                ImageView imageView = moneyTransferLinkFragment.p0;
                ImageView imageView2 = imageView != null ? imageView : null;
                efx0Var.getClass();
                ome0.a(imageView2).subscribe(new y730(new oey(6), i2));
                break;
            case 4:
                zal0 a = g2v.d().a();
                Context context = ((wq30) obj).d;
                a.h(context != null ? context : null);
                break;
            case 5:
                ((com.vk.im.design.view.pagination.pin.g) obj).l.invoke();
                break;
            case 6:
                int i4 = OneVideoAdControlsViewNew.E;
                OneVideoAdBaseControls.a listener = ((OneVideoAdControlsViewNew) obj).getListener();
                if (listener != null) {
                    listener.d();
                    break;
                }
                break;
            case 7:
                ((m5p0) obj).b.a(b6d.b);
                break;
            default:
                int i5 = VkAuthToolbar.k;
                ((izs) obj).invoke(view);
                break;
        }
    }
}
