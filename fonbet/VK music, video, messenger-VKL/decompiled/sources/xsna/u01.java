package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.auth.passport.VkPassportView;
import com.vk.auth.ui.consent.a;
import com.vk.catalog2.common.ui.mvp.holder.header.ToolbarVh;
import com.vk.catalog2.feature.music.holders.artist.ArtistBiographyVh;
import com.vk.clips.sdk.shared.item.ads.events.AdsItemViewEvent;
import com.vk.clips.sdk.shared.item.market_ads.events.MarketAdsItemViewEvent;
import com.vk.core.view.components.tooltip.VkTooltip;
import com.vk.core.view.links.LinkedTextView;
import com.vk.debug.ui.dev.DebugDevHintsFragment;
import com.vk.dto.attaches.Attach;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.dto.stickers.ugc.UgcStatus;
import com.vk.im.engine.models.messages.Msg;
import com.vk.money.pin.PinFragment;
import com.vk.permission.PermissionHelper;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioArtistClickItem;
import com.vk.stickers.views.sticker.ImStickerView;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import xsna.h490;
import xsna.lal0;
import xsna.p9y0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class u01 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u01(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CharSequence charSequence;
        final CharSequence charSequence2;
        int intValue;
        Context context;
        kgb kgbVar;
        int i = this.b;
        int i2 = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((w01) obj).b.a(AdsItemViewEvent.j.b);
                break;
            case 1:
                final ArtistBiographyVh artistBiographyVh = (ArtistBiographyVh) obj;
                if (!artistBiographyVh.i && !artistBiographyVh.s) {
                    ArtistBiographyVh.a(CommonAudioStat$TypeAudioArtistClickItem.EventType.SHOW_ALL_CLICK, artistBiographyVh.l);
                    final LinkedTextView linkedTextView = artistBiographyVh.g;
                    if (linkedTextView != null && (charSequence = artistBiographyVh.t) != null && (charSequence2 = artistBiographyVh.u) != null) {
                        ValueAnimator valueAnimator = artistBiographyVh.r;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        linkedTextView.setText(charSequence);
                        int measuredWidth = linkedTextView.getMeasuredWidth();
                        Integer valueOf = Integer.valueOf(measuredWidth);
                        if (measuredWidth <= 0) {
                            valueOf = null;
                        }
                        if (valueOf != null) {
                            intValue = valueOf.intValue();
                        } else {
                            ViewParent parent = linkedTextView.getParent();
                            View view2 = parent instanceof View ? (View) parent : null;
                            Integer valueOf2 = view2 != null ? Integer.valueOf(view2.getWidth()) : null;
                            intValue = valueOf2 != null ? valueOf2.intValue() : 0;
                        }
                        if (intValue > 0) {
                            linkedTextView.measure(View.MeasureSpec.makeMeasureSpec(intValue, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                            int measuredHeight = linkedTextView.getMeasuredHeight();
                            linkedTextView.setText(charSequence2);
                            linkedTextView.measure(View.MeasureSpec.makeMeasureSpec(intValue, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                            final int measuredHeight2 = linkedTextView.getMeasuredHeight();
                            if (measuredHeight != measuredHeight2) {
                                linkedTextView.setText(charSequence);
                                ValueAnimator ofInt = ValueAnimator.ofInt(measuredHeight, measuredHeight2);
                                ofInt.setDuration(300L);
                                ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
                                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.lq3
                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                        int intValue2 = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                        LinkedTextView linkedTextView2 = LinkedTextView.this;
                                        linkedTextView2.getLayoutParams().height = intValue2;
                                        linkedTextView2.requestLayout();
                                        if (intValue2 == measuredHeight2) {
                                            linkedTextView2.setText(charSequence2);
                                            linkedTextView2.getLayoutParams().height = -2;
                                            ArtistBiographyVh artistBiographyVh2 = artistBiographyVh;
                                            artistBiographyVh2.i = true;
                                            artistBiographyVh2.s = false;
                                            artistBiographyVh2.b(true);
                                        }
                                    }
                                });
                                ofInt.addListener(new mq3(artistBiographyVh, linkedTextView));
                                ofInt.start();
                                artistBiographyVh.r = ofInt;
                                break;
                            } else {
                                artistBiographyVh.i = true;
                                artistBiographyVh.b(true);
                                break;
                            }
                        }
                    }
                }
                break;
            case 2:
                a.C0415a c0415a = (a.C0415a) obj;
                com.vk.auth.ui.consent.c cVar = c0415a.n;
                if (cVar != null) {
                    c0415a.l.invoke(cVar);
                    break;
                }
                break;
            case 3:
                int i3 = DebugDevHintsFragment.W;
                ((androidx.appcompat.app.d) obj).dismiss();
                break;
            case 4:
                ImStickerView imStickerView = (ImStickerView) obj;
                if (imStickerView.g.O() == UgcStatus.AGE_RESTRICTED && (context = ImStickerView.c(imStickerView).getContext()) != null) {
                    lal0.a.a(context, R.string.stickers_restricted_hint_title, R.string.stickers_restricted_hint_subtitle, R.drawable.vk_icon_18_circle_outline_56);
                    break;
                }
                break;
            case 5:
                IntegrationInspectorActivity.a((IntegrationInspectorActivity) obj, view);
                break;
            case 6:
                ((dq00) obj).b.a(MarketAdsItemViewEvent.g.b);
                break;
            case 7:
                ps30 ps30Var = (ps30) obj;
                pk30 pk30Var = ps30Var.o;
                rs30 rs30Var = ps30Var.p;
                Msg msg = rs30Var != null ? rs30Var.w : null;
                Attach attach = rs30Var != null ? rs30Var.y : null;
                if (pk30Var != null && msg != null && attach != null) {
                    pk30Var.O(attach);
                    break;
                }
                break;
            case 8:
                pl70 pl70Var = (pl70) obj;
                if (pl70Var.i == null) {
                    int i4 = 2;
                    if (pl70Var.getExpanded()) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                        ofFloat.addUpdateListener(new c9g(pl70Var, 1));
                        ofFloat.addListener(new nl70(pl70Var));
                        ofFloat.setDuration(350L);
                        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                        ofFloat.start();
                        pl70Var.i = ofFloat;
                        view.setContentDescription(pl70Var.getContext().getString(R.string.story_accessibility_show_viewers));
                    } else {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                        ofFloat2.addUpdateListener(new ll70(pl70Var, i2));
                        ofFloat2.addListener(new w38(pl70Var, i4));
                        ofFloat2.setDuration(350L);
                        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                        ofFloat2.start();
                        pl70Var.i = ofFloat2;
                        view.setContentDescription(pl70Var.getContext().getString(R.string.story_accessibility_hide_viewers));
                    }
                    pl70Var.setExpanded(!pl70Var.getExpanded());
                    break;
                }
                break;
            case 9:
                h490 h490Var = (h490) ((h490.a) obj).m;
                if (h490Var != null && (kgbVar = h490Var.l) != null) {
                    kgbVar.run();
                    break;
                }
                break;
            case 10:
                com.vk.photogallery.c cVar2 = (com.vk.photogallery.c) obj;
                if (gz80.a(34)) {
                    PermissionHelper permissionHelper = PermissionHelper.a;
                    ContextThemeWrapper contextThemeWrapper = cVar2.a;
                    permissionHelper.getClass();
                    PermissionHelper.g(permissionHelper, contextThemeWrapper, PermissionHelper.f, PermissionHelper.r, 0, 0, new l500(cVar2, 23), null, null, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE);
                    break;
                }
                break;
            case 11:
                int i5 = PinFragment.b0;
                qla0 qla0Var = (qla0) ((PinFragment) obj).S;
                if (qla0Var != null) {
                    qla0Var.D();
                    break;
                }
                break;
            case 12:
                cqb0.q((cqb0) obj);
                break;
            case 13:
                ((cqc0) obj).X0(PostingVisibilityMode.BEST_FRIENDS);
                break;
            case 14:
                i9g0 i9g0Var = (i9g0) obj;
                VkTooltip vkTooltip = i9g0Var.d;
                if (vkTooltip != null) {
                    vkTooltip.dismiss();
                }
                i9g0Var.d = null;
                i9g0Var.e = false;
                i9g0Var.a.b();
                break;
            case 15:
                bmj0 bmj0Var = (bmj0) obj;
                otu0 un = bmj0Var.un();
                Context requireContext = bmj0Var.requireContext();
                SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.NOWHERE;
                un.getClass();
                otu0.b(requireContext, schemeStatSak$EventScreen);
                break;
            case 16:
                ToolbarVh toolbarVh = (ToolbarVh) obj;
                if (!toolbarVh.A) {
                    toolbarVh.onClick(view);
                    break;
                } else {
                    toolbarVh.a();
                    break;
                }
            case 17:
                int i6 = VkPassportView.A;
                ((q3s0) obj).invoke(view);
                break;
            default:
                hiy0 hiy0Var = (hiy0) obj;
                hiy0Var.e = p9y0.c.a;
                hiy0Var.a();
                break;
        }
    }
}
